package bo.app;

import Ph.AbstractC1459k;
import android.graphics.Rect;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 {
    public static void a(final String placementId, final View view, boolean z10) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(view, "view");
        ReentrantLock reentrantLock = d0.f25371m;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0.f25368j, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.a0.a(placementId, view);
                }
            }, 7, (Object) null);
            Iterator it = d0.f25372n.iterator();
            while (it.hasNext()) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                a0 a0Var = d0.f25368j;
                BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
                BrazeLogger.brazelog$default(brazeLogger, (Object) a0Var, priority, (Throwable) null, false, new Function0() { // from class: c3.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.a0.a();
                    }
                }, 6, (Object) null);
                final x xVar = (x) it.next();
                if (Intrinsics.areEqual(xVar.f26212b.get(), view)) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) a0Var, priority, (Throwable) null, false, new Function0() { // from class: c3.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.a0.a(bo.app.x.this, placementId);
                        }
                    }, 6, (Object) null);
                    it.remove();
                }
            }
            d0.f25372n.add(new x(placementId, new WeakReference(view), z10));
            if (d0.f25370l == null) {
                d0.f25370l = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new z(null), 2, null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static void b(final String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        ReentrantLock reentrantLock = d0.f25371m;
        reentrantLock.lock();
        try {
            CollectionsKt.removeAll((List) d0.f25372n, new Function1() { // from class: c3.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(bo.app.a0.a(placementId, (bo.app.x) obj));
                }
            });
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String c(x xVar) {
        return "Resetting impression for " + xVar.f26211a;
    }

    public static void b() {
        ReentrantLock reentrantLock = d0.f25371m;
        reentrantLock.lock();
        try {
            ArrayList arrayList = d0.f25372n;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                final x xVar = (x) obj;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0.f25368j, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.a0.c(bo.app.x.this);
                    }
                }, 6, (Object) null);
                xVar.f26213c = false;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (d0.f25370l != null) {
                return;
            }
            d0.f25370l = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new z(null), 2, null);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String b(x xVar) {
        return "Banner is not shown " + xVar.f26211a + " because view is null";
    }

    public static final String a(x xVar, String str) {
        return "Removing banner from monitor list " + xVar.f26211a + " because view is now used by " + str;
    }

    public static final String b(List list) {
        return "Setting banner placement list to " + list;
    }

    public static final boolean a(String str, x it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.f26211a, str);
    }

    public final boolean a(final x xVar) {
        View view = (View) xVar.f26212b.get();
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.a0.b(bo.app.x.this);
                }
            }, 7, (Object) null);
            return true;
        }
        final String str = xVar.f26211a;
        if (view.isShown()) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.width() != 0 && rect.height() != 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.a0.a(str);
                    }
                }, 7, (Object) null);
                AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new y(view, str, xVar, null), 3, null);
            }
        }
        return false;
    }

    public final void a(final List placementIds) {
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.a0.b(placementIds);
            }
        }, 7, (Object) null);
        ReentrantLock reentrantLock = d0.f25373o;
        reentrantLock.lock();
        try {
            ArrayList arrayList = d0.f25374p;
            arrayList.clear();
            arrayList.addAll(placementIds);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(String str, View view) {
        return "Adding monitor for " + str + " for BannerView " + view;
    }

    public static final String a() {
        return "Checking existing monitor list for view reuse.";
    }

    public static final String a(String str) {
        return "Banner is shown " + str + ".";
    }
}
