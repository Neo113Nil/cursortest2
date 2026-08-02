package com.braze.managers;

import android.graphics.Rect;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class g {
    public static void a(final String placementId, final View view, boolean z) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(view, "view");
        ReentrantLock reentrantLock = j.k;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.h, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.a(placementId, view);
                }
            }, 7, (Object) null);
            Iterator it = j.l.iterator();
            while (it.hasNext()) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                g gVar = j.h;
                BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                BrazeLogger.brazelog$default(brazeLogger, (Object) gVar, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a();
                    }
                }, 6, (Object) null);
                final d dVar = (d) it.next();
                if (Intrinsics.areEqual(dVar.b.get(), view)) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) gVar, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return g.a(d.this, placementId);
                        }
                    }, 6, (Object) null);
                    it.remove();
                }
            }
            g gVar2 = j.h;
            j.l.add(new d(placementId, new WeakReference(view), z));
            d();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void b() {
        ReentrantLock reentrantLock = j.k;
        reentrantLock.lock();
        try {
            Iterator it = j.l.iterator();
            while (it.hasNext()) {
                final d dVar = (d) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.h, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.c(d.this);
                    }
                }, 6, (Object) null);
                dVar.c = false;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void c() {
        j.i.clear();
        ReentrantLock reentrantLock = j.k;
        reentrantLock.lock();
        try {
            j.l.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = j.m;
            reentrantLock2.lock();
            try {
                j.n.clear();
                reentrantLock2.unlock();
                Job job = j.j;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                j.j = null;
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static void d() {
        if (j.j != null) {
            return;
        }
        j.j = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new f(null), 2, null);
    }

    public static final String b(List list) {
        return "Setting banner placement list to " + list;
    }

    public static final String b(d dVar) {
        return "Banner is not shown " + dVar.a() + " because view is null";
    }

    public static final String c(d dVar) {
        return "Resetting impression for " + dVar.a();
    }

    public final boolean a(final d dVar) {
        View view = (View) dVar.b.get();
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.b(d.this);
                }
            }, 7, (Object) null);
            return true;
        }
        final String str = dVar.f579a;
        if (view.isShown()) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect) && rect.width() != 0 && rect.height() != 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a(str);
                    }
                }, 7, (Object) null);
                BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new e(view, str, dVar, null), 3, null);
            }
        }
        return false;
    }

    public final void a(final List placementIds) {
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.b(placementIds);
            }
        }, 7, (Object) null);
        ReentrantLock reentrantLock = j.m;
        reentrantLock.lock();
        try {
            ArrayList arrayList = j.n;
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

    public static final String a(d dVar, String str) {
        return "Removing banner from monitor list " + dVar.a() + " because view is now used by " + str;
    }

    public static final String a(String str) {
        return "Banner is shown " + str + ".";
    }
}
