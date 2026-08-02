package io.sentry.android.core;

import Bl0.C2645f;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C7125b;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7227z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC7227z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67029a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.g f67030b;

    public ViewHierarchyEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f67029a = sentryAndroidOptions;
        this.f67030b = new io.sentry.android.core.internal.util.g(io.sentry.android.core.internal.util.b.a(), 2000L, 3);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.j.a("ViewHierarchy");
        }
    }

    private static void a(@NotNull View view, @NotNull io.sentry.protocol.G g10, @NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        if (view instanceof ViewGroup) {
            Iterator<io.sentry.internal.viewhierarchy.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a()) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    io.sentry.protocol.G e11 = e(childAt);
                    arrayList.add(e11);
                    a(childAt, e11, list);
                }
            }
            g10.m(arrayList);
        }
    }

    @NotNull
    public static io.sentry.protocol.F b(@NotNull View view, @NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.F f7 = new io.sentry.protocol.F("android_view_system", arrayList);
        io.sentry.protocol.G e11 = e(view);
        arrayList.add(e11);
        a(view, e11, list);
        return f7;
    }

    @NotNull
    private static io.sentry.protocol.G e(@NotNull View view) {
        io.sentry.protocol.G g10 = new io.sentry.protocol.G();
        g10.p(C2645f.b(view));
        try {
            g10.o(io.sentry.android.core.internal.gestures.h.b(view));
        } catch (Throwable unused) {
        }
        g10.t(Double.valueOf(view.getX()));
        g10.u(Double.valueOf(view.getY()));
        g10.s(Double.valueOf(view.getWidth()));
        g10.n(Double.valueOf(view.getHeight()));
        g10.l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            g10.r("visible");
        } else if (visibility == 4) {
            g10.r("invisible");
        } else if (visibility == 8) {
            g10.r("gone");
        }
        return g10;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final C7230z2 d(@NotNull C7230z2 c7230z2, @NotNull io.sentry.E e11) {
        if (c7230z2.w0()) {
            SentryAndroidOptions sentryAndroidOptions = this.f67029a;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return c7230z2;
            }
            if (!io.sentry.util.h.c(e11)) {
                boolean a11 = this.f67030b.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!a11) {
                    Activity b11 = L.c().b();
                    final List<io.sentry.internal.viewhierarchy.a> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    final ILogger logger = sentryAndroidOptions.getLogger();
                    io.sentry.protocol.F f7 = null;
                    if (b11 == null) {
                        logger.c(I2.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = b11.getWindow();
                        if (window == null) {
                            logger.c(I2.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            final View peekDecorView = window.peekDecorView();
                            if (peekDecorView == null) {
                                logger.c(I2.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.a()) {
                                        f7 = b(peekDecorView, viewHierarchyExporters);
                                    } else {
                                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                                        final AtomicReference atomicReference = new AtomicReference(null);
                                        b11.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.q0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                AtomicReference atomicReference2 = atomicReference;
                                                View view = peekDecorView;
                                                List list = viewHierarchyExporters;
                                                CountDownLatch countDownLatch2 = countDownLatch;
                                                try {
                                                    atomicReference2.set(ViewHierarchyEventProcessor.b(view, list));
                                                    countDownLatch2.countDown();
                                                } catch (Throwable th2) {
                                                    logger.a(I2.ERROR, "Failed to process view hierarchy.", th2);
                                                }
                                            }
                                        });
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            f7 = (io.sentry.protocol.F) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    logger.a(I2.ERROR, "Failed to process view hierarchy.", th2);
                                }
                            }
                        }
                    }
                    if (f7 != null) {
                        e11.o(C7125b.c(f7));
                    }
                }
            }
        }
        return c7230z2;
    }

    @Override // io.sentry.InterfaceC7227z
    @NotNull
    public final io.sentry.protocol.A j(@NotNull io.sentry.protocol.A a11, @NotNull io.sentry.E e11) {
        return a11;
    }
}
