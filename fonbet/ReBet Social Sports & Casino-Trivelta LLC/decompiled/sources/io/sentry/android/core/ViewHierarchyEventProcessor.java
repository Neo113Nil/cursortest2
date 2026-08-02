package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.C4724b;
import io.sentry.C4733c3;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes3.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.D {

    /* renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f50865a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.o f50866b = new io.sentry.android.core.internal.util.o(io.sentry.android.core.internal.util.h.b(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f50865a = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.n.a("ViewHierarchy");
        }
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(f(view, list));
            countDownLatch.countDown();
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Failed to process view hierarchy.", th2);
        }
    }

    public static void b(View view, io.sentry.protocol.H h10, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.protocol.H g10 = g(childAt);
                    arrayList.add(g10);
                    b(childAt, g10, list);
                }
            }
            h10.m(arrayList);
        }
    }

    public static io.sentry.protocol.G c(Activity activity, ILogger iLogger) {
        return e(activity, new ArrayList(0), io.sentry.android.core.internal.util.k.e(), iLogger);
    }

    public static io.sentry.protocol.G e(Activity activity, final List list, io.sentry.util.thread.a aVar, ILogger iLogger) {
        final ILogger iLogger2;
        Throwable th2;
        if (activity == null) {
            iLogger.c(EnumC4788n3.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(EnumC4788n3.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            iLogger.c(EnumC4788n3.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            iLogger2 = iLogger;
        }
        if (aVar.a()) {
            try {
                return f(peekDecorView, list);
            } catch (Throwable th4) {
                th2 = th4;
                iLogger2 = iLogger;
                iLogger2.b(EnumC4788n3.ERROR, "Failed to process view hierarchy.", th2);
                return null;
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference(null);
        iLogger2 = iLogger;
        try {
            activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.x1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewHierarchyEventProcessor.a(atomicReference, peekDecorView, list, countDownLatch, iLogger2);
                }
            });
            if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                return (io.sentry.protocol.G) atomicReference.get();
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            iLogger2.b(EnumC4788n3.ERROR, "Failed to process view hierarchy.", th2);
            return null;
        }
        return null;
    }

    public static io.sentry.protocol.G f(View view, List list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.G g10 = new io.sentry.protocol.G("android_view_system", arrayList);
        io.sentry.protocol.H g11 = g(view);
        arrayList.add(g11);
        b(view, g11, list);
        return g10;
    }

    public static io.sentry.protocol.H g(View view) {
        io.sentry.protocol.H h10 = new io.sentry.protocol.H();
        h10.p(io.sentry.android.core.internal.util.l.a(view));
        try {
            String b10 = io.sentry.android.core.internal.gestures.k.b(view);
            if (b10 != null) {
                h10.o(b10);
            }
        } catch (Throwable unused) {
        }
        h10.t(Double.valueOf(view.getX()));
        h10.u(Double.valueOf(view.getY()));
        h10.s(Double.valueOf(view.getWidth()));
        h10.n(Double.valueOf(view.getHeight()));
        h10.l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            h10.r(ViewProps.VISIBLE);
        } else if (visibility == 4) {
            h10.r("invisible");
        } else if (visibility == 8) {
            h10.r("gone");
        }
        return h10;
    }

    @Override // io.sentry.D
    public C4733c3 k(C4733c3 c4733c3, io.sentry.J j10) {
        io.sentry.protocol.G e10;
        if (c4733c3.z0()) {
            if (!this.f50865a.isAttachViewHierarchy()) {
                this.f50865a.getLogger().c(EnumC4788n3.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return c4733c3;
            }
            if (!io.sentry.util.l.g(j10)) {
                boolean a10 = this.f50866b.a();
                this.f50865a.getBeforeViewHierarchyCaptureCallback();
                if (!a10 && (e10 = e(C4705r0.c().b(), this.f50865a.getViewHierarchyExporters(), this.f50865a.getThreadChecker(), this.f50865a.getLogger())) != null) {
                    j10.r(C4724b.d(e10));
                }
            }
        }
        return c4733c3;
    }

    @Override // io.sentry.D
    public io.sentry.protocol.B r(io.sentry.protocol.B b10, io.sentry.J j10) {
        return b10;
    }
}
