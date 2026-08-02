package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.d5;
import io.sentry.d6;
import io.sentry.t4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f15524a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f15525b;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15524a = sentryAndroidOptions;
        this.f15525b = new io.sentry.android.core.internal.util.g(2000L, 3);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            rh.g.a("ViewHierarchy");
        }
    }

    public static void a(View view, io.sentry.protocol.k0 k0Var, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt != null) {
                    io.sentry.protocol.k0 b10 = b(childAt);
                    arrayList.add(b10);
                    a(childAt, b10, list);
                }
            }
            k0Var.f16849k = arrayList;
        }
    }

    public static io.sentry.protocol.k0 b(View view) {
        io.sentry.protocol.k0 k0Var = new io.sentry.protocol.k0();
        k0Var.f16841b = k2.x.q(view);
        try {
            k0Var.f16842c = io.sentry.android.core.internal.gestures.i.b(view);
        } catch (Throwable unused) {
        }
        k0Var.f16846g = Double.valueOf(view.getX());
        k0Var.f16847h = Double.valueOf(view.getY());
        k0Var.f16844e = Double.valueOf(view.getWidth());
        k0Var.f16845f = Double.valueOf(view.getHeight());
        k0Var.j = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            k0Var.f16848i = "visible";
        } else if (visibility == 4) {
            k0Var.f16848i = "invisible";
        } else if (visibility == 8) {
            k0Var.f16848i = "gone";
        }
        return k0Var;
    }

    @Override // io.sentry.c0
    public final t4 k(t4 t4Var, io.sentry.h0 h0Var) {
        if (t4Var.d()) {
            SentryAndroidOptions sentryAndroidOptions = this.f15524a;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().h(b5.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return t4Var;
            }
            if (!k2.x.u(h0Var)) {
                boolean a7 = this.f15525b.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!a7) {
                    WeakReference weakReference = (WeakReference) n0.f15781b.f15782a;
                    io.sentry.protocol.j0 j0Var = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    List<Object> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    ILogger logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.h(b5.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.h(b5.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            View peekDecorView = window.peekDecorView();
                            if (peekDecorView == null) {
                                logger.h(b5.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.j0 j0Var2 = new io.sentry.protocol.j0("android_view_system", arrayList);
                                        io.sentry.protocol.k0 b10 = b(peekDecorView);
                                        arrayList.add(b10);
                                        a(peekDecorView, b10, viewHierarchyExporters);
                                        j0Var = j0Var2;
                                    } else {
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new e3.e0(atomicReference, peekDecorView, viewHierarchyExporters, countDownLatch, logger, 1));
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            j0Var = (io.sentry.protocol.j0) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    logger.e(b5.ERROR, "Failed to process view hierarchy.", th2);
                                }
                            }
                        }
                    }
                    if (j0Var != null) {
                        h0Var.f16449e = new io.sentry.a(j0Var);
                    }
                }
            }
        }
        return t4Var;
    }

    @Override // io.sentry.c0
    public final d5 r(d5 d5Var) {
        return d5Var;
    }

    @Override // io.sentry.c0
    public final d6 c(d6 d6Var, io.sentry.h0 h0Var) {
        return d6Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.e0 n(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        return e0Var;
    }
}
