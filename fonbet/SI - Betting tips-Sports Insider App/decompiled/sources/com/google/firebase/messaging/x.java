package com.google.firebase.messaging;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebMessage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.app.v0;
import androidx.core.view.z0;
import androidx.lifecycle.d1;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import androidx.lifecycle.o1;
import androidx.viewpager2.widget.ViewPager2;
import c1.b1;
import c1.x0;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.t9;
import com.google.android.gms.internal.measurement.u5;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.y3;
import com.logrocket.core.LogRocketCore;
import com.sports.insider.MyApp;
import eg.m0;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.e1;
import io.sentry.v4;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.Segment;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.f1;
import s7.n0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x implements b3.a, e1, g5.b, n.a, o8.c {

    /* renamed from: e, reason: collision with root package name */
    public static x f6178e;

    /* renamed from: f, reason: collision with root package name */
    public static x f6179f;

    /* renamed from: g, reason: collision with root package name */
    public static x f6180g;

    /* renamed from: h, reason: collision with root package name */
    public static long f6181h;

    /* renamed from: a, reason: collision with root package name */
    public Object f6182a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6183b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6184c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6185d;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6182a = obj;
        this.f6183b = obj2;
        this.f6184c = obj3;
        this.f6185d = obj4;
    }

    public static void H(x xVar) {
        xVar.getClass();
        long epochSecond = Instant.now().getEpochSecond();
        if (f6181h + 60 < epochSecond) {
            f6181h = epochSecond;
            xVar.D(0L);
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = m0.f9201a;
            lg.d dVar2 = lg.d.f20063c;
            eg.y yVar = new eg.y("LivePayCheckOwnedSubs");
            dVar2.getClass();
            eg.c0.t(dVar, kotlin.coroutines.e.c(dVar2, yVar), null, new wc.j(xVar, null, 3), 2);
        }
    }

    public static void I(x dispatcher, kh.m mVar, kh.p pVar, kh.m mVar2, int i5) {
        gh.p pVar2;
        if ((i5 & 1) != 0) {
            mVar = null;
        }
        if ((i5 & 2) != 0) {
            pVar = null;
        }
        if ((i5 & 4) != 0) {
            mVar2 = null;
        }
        dispatcher.getClass();
        TimeZone timeZone = hh.g.f10825a;
        Intrinsics.checkNotNullParameter(dispatcher, "<this>");
        boolean isShutdown = ((ThreadPoolExecutor) dispatcher.q()).isShutdown();
        synchronized (dispatcher) {
            if (pVar != null) {
                try {
                    if (!((ArrayDeque) dispatcher.f6184c).remove(pVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (mVar2 != null) {
                mVar2.f19134b.decrementAndGet();
                if (!((ArrayDeque) dispatcher.f6183b).remove(mVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (mVar != null) {
                ((ArrayDeque) dispatcher.f6185d).add(mVar);
                kh.m other = dispatcher.r(mVar.f19135c.f19139b.f10206a.f10332d);
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    mVar.f19134b = other.f19134b;
                }
            }
            if ((pVar != null || mVar2 != null) && (isShutdown || ((ArrayDeque) dispatcher.f6183b).isEmpty())) {
                ((ArrayDeque) dispatcher.f6184c).isEmpty();
            }
            if (isShutdown) {
                List W = CollectionsKt.W((ArrayDeque) dispatcher.f6185d);
                ((ArrayDeque) dispatcher.f6185d).clear();
                pVar2 = new gh.p(0, W);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) dispatcher.f6185d).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    kh.m mVar3 = (kh.m) it.next();
                    if (((ArrayDeque) dispatcher.f6183b).size() >= 64) {
                        break;
                    }
                    if (mVar3.f19134b.get() < 5) {
                        it.remove();
                        mVar3.f19134b.incrementAndGet();
                        Intrinsics.checkNotNull(mVar3);
                        arrayList.add(mVar3);
                        ((ArrayDeque) dispatcher.f6183b).add(mVar3);
                    }
                }
                pVar2 = new gh.p(0, arrayList);
            }
        }
        int size = pVar2.f10288a.size();
        boolean z5 = true;
        for (int i10 = 0; i10 < size; i10++) {
            kh.m mVar4 = (kh.m) pVar2.f10288a.get(i10);
            if (mVar4 == mVar) {
                z5 = false;
            } else {
                kh.p call = mVar4.f19135c;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            }
            if (isShutdown) {
                mVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                kh.p pVar3 = mVar4.f19135c;
                pVar3.j(interruptedIOException);
                mVar4.f19133a.b(pVar3, interruptedIOException);
            } else {
                ExecutorService executorService = dispatcher.q();
                mVar4.getClass();
                Intrinsics.checkNotNullParameter(executorService, "executorService");
                kh.p pVar4 = mVar4.f19135c;
                Intrinsics.checkNotNullParameter(pVar4.f19138a.f10170a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) executorService).execute(mVar4);
                    } catch (RejectedExecutionException e7) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e7);
                        kh.p pVar5 = mVar4.f19135c;
                        pVar5.j(interruptedIOException2);
                        mVar4.f19133a.b(pVar5, interruptedIOException2);
                        pVar4.f19138a.f10170a.s(mVar4);
                    }
                } catch (Throwable th3) {
                    pVar4.f19138a.f10170a.s(mVar4);
                    throw th3;
                }
            }
        }
        if (!z5 || mVar == null) {
            return;
        }
        kh.p call2 = mVar.f19135c;
        Intrinsics.checkNotNullParameter(call2, "call");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
    }

    public static void L(com.logrocket.core.f0 f0Var) {
        x h10 = h();
        synchronized (h10) {
            h10.f6184c = new WeakReference(f0Var);
            ((ba.d) h10.f6183b).h("Assigned new session!");
            h10.k(new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(14, h10));
        }
    }

    public static x h() {
        if (f6179f == null) {
            f6179f = new x(7);
        }
        return f6179f;
    }

    public static pc.u v() {
        return (pc.u) y3.m(pc.u.class, null, 6);
    }

    public static synchronized x w() {
        x xVar;
        synchronized (x.class) {
            try {
                if (f6178e == null) {
                    f6178e = new x(0);
                }
                xVar = f6178e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(mf.c cVar) {
        wc.l lVar;
        int i5;
        if (cVar instanceof wc.l) {
            lVar = (wc.l) cVar;
            int i10 = lVar.f25135c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f25135c = i10 - Integer.MIN_VALUE;
                Object obj = lVar.f25133a;
                lf.a aVar = lf.a.f20034a;
                i5 = lVar.f25135c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    rc.r rVar = (rc.r) this.f6182a;
                    lVar.f25135c = 1;
                    obj = rVar.a(lVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                return Boolean.valueOf(1 > intValue && intValue < 3);
            }
        }
        lVar = new wc.l(this, cVar);
        Object obj2 = lVar.f25133a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = lVar.f25135c;
        if (i5 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        return Boolean.valueOf(1 > intValue2 && intValue2 < 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(mf.c cVar) {
        wc.m mVar;
        Object obj;
        int i5;
        if (cVar instanceof wc.m) {
            mVar = (wc.m) cVar;
            int i10 = mVar.f25141c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f25141c = i10 - Integer.MIN_VALUE;
                obj = mVar.f25139a;
                Object obj2 = lf.a.f20034a;
                i5 = mVar.f25141c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    mVar.f25141c = 1;
                    obj = A(mVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                mVar.f25141c = 2;
                Object b10 = ((rc.r) this.f6182a).b(mVar);
                return b10 == obj2 ? obj2 : b10;
            }
        }
        mVar = new wc.m(this, cVar);
        obj = mVar.f25139a;
        Object obj22 = lf.a.f20034a;
        i5 = mVar.f25141c;
        if (i5 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public void C(List modules, boolean z5) {
        v0 v0Var;
        Iterator it;
        Object obj;
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(modules, "modules");
        LinkedHashSet modules2 = new LinkedHashSet();
        kotlin.collections.l lVar = new kotlin.collections.l(kotlin.collections.a0.v(modules));
        while (!lVar.isEmpty()) {
            ei.a aVar = (ei.a) lVar.removeLast();
            if (modules2.add(aVar)) {
                Iterator it2 = aVar.f9262e.iterator();
                while (it2.hasNext()) {
                    ei.a aVar2 = (ei.a) it2.next();
                    if (!modules2.contains(aVar2)) {
                        lVar.addLast(aVar2);
                    }
                }
            }
        }
        v0 v0Var2 = (v0) this.f6185d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) v0Var2.f366d;
        Intrinsics.checkNotNullParameter(modules2, "modules");
        Iterator it3 = modules2.iterator();
        while (it3.hasNext()) {
            ei.a aVar3 = (ei.a) it3.next();
            for (Map.Entry entry : aVar3.f9260c.entrySet()) {
                String mapping = (String) entry.getKey();
                ci.b factory = (ci.b) entry.getValue();
                x xVar = (x) v0Var2.f364b;
                Intrinsics.checkNotNullParameter(mapping, "mapping");
                Intrinsics.checkNotNullParameter(factory, "factory");
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) v0Var2.f365c;
                if (((ci.b) concurrentHashMap2.get(mapping)) == null) {
                    v0Var = v0Var2;
                    it = it3;
                } else {
                    if (!z5) {
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(mapping, "mapping");
                        String msg = "Already existing definition for " + factory.f3946a + " at " + mapping;
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        throw new b6.o(msg);
                    }
                    io.sentry.config.a aVar4 = (io.sentry.config.a) xVar.f6182a;
                    StringBuilder p10 = d9.e.p("(+) override index '", mapping, "' -> '");
                    v0Var = v0Var2;
                    ai.a aVar5 = factory.f3946a;
                    p10.append(aVar5);
                    it = it3;
                    p10.append('\'');
                    String msg2 = p10.toString();
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(msg2, "msg");
                    aVar4.s(di.b.f8383c, msg2);
                    Iterator it4 = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj = it4.next();
                            if (Intrinsics.areEqual(((ci.d) obj).f3946a, aVar5)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (((ci.d) obj) != null) {
                        concurrentHashMap.remove(Integer.valueOf(aVar5.hashCode()));
                    }
                }
                io.sentry.config.a aVar6 = (io.sentry.config.a) xVar.f6182a;
                StringBuilder p11 = d9.e.p("(+) index '", mapping, "' -> '");
                p11.append(factory.f3946a);
                p11.append('\'');
                aVar6.f(p11.toString());
                concurrentHashMap2.put(mapping, factory);
                v0Var2 = v0Var;
                it3 = it;
            }
            v0 v0Var3 = v0Var2;
            Iterator it5 = it3;
            for (ci.d dVar : aVar3.f9259b) {
                concurrentHashMap.put(Integer.valueOf(dVar.f3946a.hashCode()), dVar);
            }
            v0Var2 = v0Var3;
            it3 = it5;
        }
        hi.a aVar7 = (hi.a) this.f6184c;
        aVar7.getClass();
        Intrinsics.checkNotNullParameter(modules2, "modules");
        Iterator it6 = modules2.iterator();
        while (it6.hasNext()) {
            aVar7.f10828a.addAll(((ei.a) it6.next()).f9261d);
        }
    }

    public void D(long j) {
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = m0.f9201a;
        eg.y yVar = new eg.y("UpdateProductsInfo");
        eVar.getClass();
        eg.c0.t(dVar, kotlin.coroutines.e.c(eVar, yVar), null, new cd.p(j, this, (Continuation) null, 3), 2);
    }

    public boolean E(n.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f6182a).onActionItemClicked(u(bVar), new androidx.appcompat.view.menu.u((Context) this.f6183b, (i0.a) menuItem));
    }

    public boolean F(n.b bVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f6182a;
        n.f u10 = u(bVar);
        s.n nVar = (s.n) this.f6185d;
        Menu menu2 = (Menu) nVar.get(menu);
        if (menu2 == null) {
            menu2 = new androidx.appcompat.view.menu.c0((Context) this.f6183b, (androidx.appcompat.view.menu.n) menu);
            nVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(u10, menu2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(mf.c cVar) {
        wc.n nVar;
        int i5;
        String str;
        if (cVar instanceof wc.n) {
            nVar = (wc.n) cVar;
            int i10 = nVar.f25147c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f25147c = i10 - Integer.MIN_VALUE;
                Object obj = nVar.f25145a;
                lf.a aVar = lf.a.f20034a;
                i5 = nVar.f25147c;
                int i11 = 1;
                if (i5 != 0) {
                    h8.b.B(obj);
                    str = v().f21717s;
                    if (str == null) {
                        nVar.f25147c = 1;
                        lg.e eVar = m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new wc.j(this, null, i11), nVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    v().u(str);
                    return Unit.f19194a;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                str = (String) obj;
                if (str == null) {
                    return Unit.f19194a;
                }
                v().u(str);
                return Unit.f19194a;
            }
        }
        nVar = new wc.n(this, cVar);
        Object obj2 = nVar.f25145a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = nVar.f25147c;
        int i112 = 1;
        if (i5 != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        v().u(str);
        return Unit.f19194a;
    }

    public synchronized void J(y9.b bVar) {
        try {
            if (bVar instanceof y9.g) {
                ((ba.d) this.f6185d).o("Purging a MergedEventBatch");
                Iterator it = ((y9.g) bVar).f25749d.iterator();
                while (it.hasNext()) {
                    J((y9.b) it.next());
                }
            } else {
                long b10 = bVar.b();
                ((ba.d) this.f6185d).o("Purging a single EventBatch " + bVar.f25740a.toString());
                try {
                    bVar.c();
                } catch (Throwable th2) {
                    ((ba.d) this.f6185d).g("Failed to purge batch", th2);
                }
                l4.e eVar = (l4.e) this.f6184c;
                ((ArrayList) eVar.f19360b).remove(bVar);
                eVar.f19359a += -b10;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void K(com.logrocket.core.f0 f0Var) {
        try {
            y9.b m6 = ((androidx.appcompat.widget.a0) this.f6183b).m();
            if (m6 != null && m6.f25740a.f25735a.b(f0Var)) {
                try {
                    androidx.appcompat.widget.a0 a0Var = (androidx.appcompat.widget.a0) this.f6183b;
                    y9.b bVar = (y9.b) a0Var.f683e;
                    if (bVar != null) {
                        bVar.c();
                    }
                    a0Var.f683e = null;
                } catch (Throwable th2) {
                    ((ba.d) this.f6185d).g("Failed to purge current batch", th2);
                }
            }
            i(f0Var);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        if (r8.c(r1) == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:25:0x005d, B:27:0x0063, B:30:0x006d), top: B:24:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[Catch: all -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:25:0x005d, B:27:0x0063, B:30:0x006d), top: B:24:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r3v3, types: [ng.a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.messaging.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object M(mf.c cVar) {
        x0 x0Var;
        int i5;
        ng.c cVar2;
        ng.a aVar;
        Throwable th2;
        eg.r rVar = (eg.r) this.f6183b;
        try {
            if (cVar instanceof x0) {
                x0Var = (x0) cVar;
                int i10 = x0Var.f3501d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    x0Var.f3501d = i10 - Integer.MIN_VALUE;
                    Object obj = x0Var.f3499b;
                    lf.a aVar2 = lf.a.f20034a;
                    i5 = x0Var.f3501d;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        if (rVar.N()) {
                            return Unit.f19194a;
                        }
                        cVar2 = (ng.c) this.f6182a;
                        x0Var.f3498a = cVar2;
                        x0Var.f3501d = 1;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = x0Var.f3498a;
                            try {
                                h8.b.B(obj);
                                Unit unit = Unit.f19194a;
                                rVar.Q(unit);
                                aVar.k(null);
                                return unit;
                            } catch (Throwable th3) {
                                th2 = th3;
                                aVar.k(null);
                                throw th2;
                            }
                        }
                        ?? r32 = x0Var.f3498a;
                        h8.b.B(obj);
                        cVar2 = r32;
                    }
                    if (!rVar.N()) {
                        Unit unit2 = Unit.f19194a;
                        cVar2.k(null);
                        return unit2;
                    }
                    x0Var.f3498a = cVar2;
                    x0Var.f3501d = 2;
                    if (p(x0Var) != aVar2) {
                        aVar = cVar2;
                        Unit unit3 = Unit.f19194a;
                        rVar.Q(unit3);
                        aVar.k(null);
                        return unit3;
                    }
                    return aVar2;
                }
            }
            if (!rVar.N()) {
            }
        } catch (Throwable th4) {
            aVar = cVar2;
            th2 = th4;
            aVar.k(null);
            throw th2;
        }
        x0Var = new x0(this, cVar);
        Object obj2 = x0Var.f3499b;
        lf.a aVar22 = lf.a.f20034a;
        i5 = x0Var.f3501d;
        if (i5 != 0) {
        }
    }

    public void N(com.logrocket.core.f0 f0Var) {
        ((ba.d) this.f6185d).a("Updating session in PersistenceManager");
        androidx.appcompat.widget.a0 a0Var = (androidx.appcompat.widget.a0) this.f6183b;
        synchronized (a0Var) {
            synchronized (a0Var.f681c) {
                ((ba.d) a0Var.f685g).a("Updating session in EventBatchManager");
                a0Var.f680b = f0Var;
            }
        }
        this.f6182a = f0Var;
        try {
            m();
        } catch (IOException e7) {
            com.logrocket.core.h0.c(e7);
            throw new y9.l("setNewSessionPersistenceError");
        }
    }

    public Set O(Class cls) {
        return b(o8.p.a(cls));
    }

    public void P() {
        int itemCount;
        androidx.viewpager2.widget.j jVar = (androidx.viewpager2.widget.j) this.f6183b;
        androidx.viewpager2.widget.j jVar2 = (androidx.viewpager2.widget.j) this.f6182a;
        ViewPager2 viewPager2 = (ViewPager2) this.f6185d;
        int i5 = R.id.accessibilityActionPageLeft;
        z0.l(R.id.accessibilityActionPageLeft, viewPager2);
        z0.i(0, viewPager2);
        z0.l(R.id.accessibilityActionPageRight, viewPager2);
        z0.i(0, viewPager2);
        z0.l(R.id.accessibilityActionPageUp, viewPager2);
        z0.i(0, viewPager2);
        z0.l(R.id.accessibilityActionPageDown, viewPager2);
        z0.i(0, viewPager2);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f2881r) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.f2869d < itemCount - 1) {
                z0.m(viewPager2, new q0.b(R.id.accessibilityActionPageDown, (String) null), null, jVar2);
            }
            if (viewPager2.f2869d > 0) {
                z0.m(viewPager2, new q0.b(R.id.accessibilityActionPageUp, (String) null), null, jVar);
                return;
            }
            return;
        }
        boolean z5 = viewPager2.f2872g.getLayoutDirection() == 1;
        int i10 = z5 ? 16908360 : 16908361;
        if (z5) {
            i5 = 16908361;
        }
        if (viewPager2.f2869d < itemCount - 1) {
            z0.m(viewPager2, new q0.b(i10, (String) null), null, jVar2);
        }
        if (viewPager2.f2869d > 0) {
            z0.m(viewPager2, new q0.b(i5, (String) null), null, jVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Q(mf.c cVar) {
        wc.o oVar;
        int i5;
        if (cVar instanceof wc.o) {
            oVar = (wc.o) cVar;
            int i10 = oVar.f25153c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f25153c = i10 - Integer.MIN_VALUE;
                Object obj = oVar.f25151a;
                Object obj2 = lf.a.f20034a;
                i5 = oVar.f25153c;
                int i11 = 2;
                int i12 = 1;
                if (i5 != 0) {
                    h8.b.B(obj);
                    ic.h0 h0Var = (ic.h0) v().f21716r.getValue();
                    Continuation continuation = null;
                    if (h0Var == null) {
                        oVar.f25153c = 1;
                        lg.e eVar = m0.f9201a;
                        Object A = eg.c0.A(lg.d.f20063c, new wc.j(this, continuation, i11), oVar);
                        if (A != obj2) {
                            A = Unit.f19194a;
                        }
                    } else {
                        oVar.f25153c = 2;
                        lg.e eVar2 = m0.f9201a;
                        Object A2 = eg.c0.A(lg.d.f20063c, new wc.h(h0Var, continuation, i12), oVar);
                        if (A2 != obj2) {
                            return A2;
                        }
                    }
                    return obj2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                return new Integer(400);
            }
        }
        oVar = new wc.o(this, cVar);
        Object obj3 = oVar.f25151a;
        Object obj22 = lf.a.f20034a;
        i5 = oVar.f25153c;
        int i112 = 2;
        int i122 = 1;
        if (i5 != 0) {
        }
        return new Integer(400);
    }

    public Bundle R() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        s7.v0 v0Var = (s7.v0) this.f6185d;
        if (((Bundle) this.f6184c) == null) {
            String str = (String) this.f6182a;
            SharedPreferences n9 = v0Var.n();
            f1 f1Var = (f1) v0Var.f3328a;
            String string3 = n9.getString(str, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i5);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            n0 n0Var = f1Var.f22745f;
                            f1.m(n0Var);
                            n0Var.f22903f.a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            o8.a();
                                            if (f1Var.f22743d.t(null, s7.x.R0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i10 = 0; i10 < length; i10++) {
                                                    jArr[i10] = jSONArray2.optLong(i10);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        o8.a();
                                        if (f1Var.f22743d.t(null, s7.x.R0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i11 = 0; i11 < length2; i11++) {
                                                iArr[i11] = jSONArray3.optInt(i11);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22903f.b(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.f6184c = bundle;
                } catch (JSONException unused2) {
                    n0 n0Var3 = f1Var.f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22903f.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f6184c) == null) {
                this.f6184c = (Bundle) this.f6183b;
            }
        }
        Bundle bundle2 = (Bundle) this.f6184c;
        g6.v.h(bundle2);
        return new Bundle(bundle2);
    }

    public com.google.android.gms.internal.measurement.n S(com.google.android.gms.internal.measurement.n nVar) {
        return ((com.google.android.gms.internal.measurement.t) this.f6183b).c(this, nVar);
    }

    public com.google.android.gms.internal.measurement.n T(x xVar, v3... v3VarArr) {
        com.google.android.gms.internal.measurement.n nVar = com.google.android.gms.internal.measurement.n.S;
        for (v3 v3Var : v3VarArr) {
            nVar = y3.F(v3Var);
            ci.c.p0((x) this.f6184c);
            if ((nVar instanceof com.google.android.gms.internal.measurement.o) || (nVar instanceof com.google.android.gms.internal.measurement.m)) {
                nVar = ((com.google.android.gms.internal.measurement.t) this.f6182a).c(xVar, nVar);
            }
        }
        return nVar;
    }

    public com.google.android.gms.internal.measurement.n U(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVar = com.google.android.gms.internal.measurement.n.S;
        Iterator l6 = dVar.l();
        while (l6.hasNext()) {
            nVar = ((com.google.android.gms.internal.measurement.t) this.f6183b).c(this, dVar.o(((Integer) l6.next()).intValue()));
            if (nVar instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVar;
    }

    public void V(Bundle bundle) {
        String str = (String) this.f6182a;
        s7.v0 v0Var = (s7.v0) this.f6185d;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences n9 = v0Var.n();
        f1 f1Var = (f1) v0Var.f3328a;
        SharedPreferences.Editor edit = n9.edit();
        if (bundle2.size() == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        o8.a();
                        if (!f1Var.f22743d.t(null, s7.x.R0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                n0 n0Var = f1Var.f22745f;
                                f1.m(n0Var);
                                n0Var.f22903f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            n0 n0Var2 = f1Var.f22745f;
                            f1.m(n0Var2);
                            n0Var2.f22903f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e7) {
                        n0 n0Var3 = f1Var.f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22903f.b(e7, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f6184c = bundle2;
    }

    public x W() {
        return new x(this, (com.google.android.gms.internal.measurement.t) this.f6183b);
    }

    public boolean X(String str) {
        if (((HashMap) this.f6184c).containsKey(str)) {
            return true;
        }
        x xVar = (x) this.f6182a;
        if (xVar != null) {
            return xVar.X(str);
        }
        return false;
    }

    public void Y(String str, com.google.android.gms.internal.measurement.n nVar) {
        x xVar;
        HashMap hashMap = (HashMap) this.f6184c;
        if (!hashMap.containsKey(str) && (xVar = (x) this.f6182a) != null && xVar.X(str)) {
            xVar.Y(str, nVar);
        } else {
            if (((HashMap) this.f6185d).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, nVar);
            }
        }
    }

    public void Z(String str, com.google.android.gms.internal.measurement.n nVar) {
        HashMap hashMap = (HashMap) this.f6184c;
        if (((HashMap) this.f6185d).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    @Override // o8.c
    public Object a(Class cls) {
        if (!((Set) this.f6182a).contains(o8.p.a(cls))) {
            throw new androidx.fragment.app.i0("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a7 = ((o8.c) this.f6185d).a(cls);
        if (!cls.equals(x8.b.class)) {
            return a7;
        }
        return new o8.q();
    }

    public com.google.android.gms.internal.measurement.n a0(String str) {
        HashMap hashMap = (HashMap) this.f6184c;
        if (hashMap.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) hashMap.get(str);
        }
        x xVar = (x) this.f6182a;
        if (xVar != null) {
            return xVar.a0(str);
        }
        throw new IllegalArgumentException(r4.k.l(str, " is not defined"));
    }

    @Override // o8.c
    public Set b(o8.p pVar) {
        if (((Set) this.f6184c).contains(pVar)) {
            return ((o8.c) this.f6185d).b(pVar);
        }
        throw new androidx.fragment.app.i0("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    @Override // o8.c
    public a9.a c(o8.p pVar) {
        if (((Set) this.f6183b).contains(pVar)) {
            return ((o8.c) this.f6185d).c(pVar);
        }
        throw new androidx.fragment.app.i0("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    @Override // io.sentry.e1
    public void d(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f6182a;
        io.sentry.r a7 = ((io.sentry.util.a) this.f6183b).a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // o8.c
    public a9.a e(Class cls) {
        return c(o8.p.a(cls));
    }

    @Override // io.sentry.e1
    public void f() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f6182a;
        try {
            scheduledThreadPoolExecutor.submit(new aa.c(27, this));
        } catch (RejectedExecutionException e7) {
            b6 b6Var = (b6) this.f6185d;
            if (b6Var != null) {
                b6Var.getLogger().e(b5.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e7);
            }
        }
    }

    @Override // o8.c
    public Object g(o8.p pVar) {
        if (((Set) this.f6182a).contains(pVar)) {
            return ((o8.c) this.f6185d).g(pVar);
        }
        throw new androidx.fragment.app.i0("Attempting to request an undeclared dependency " + pVar + ".");
    }

    @Override // ff.a
    public Object get() {
        return new x((Executor) ((ff.a) this.f6182a).get(), (l5.d) ((ff.a) this.f6183b).get(), (v0) ((v0) this.f6184c).get(), (m5.c) ((ff.a) this.f6185d).get());
    }

    @Override // b3.a
    public View getRoot() {
        return (FrameLayout) this.f6182a;
    }

    public synchronized void i(com.logrocket.core.f0 f0Var) {
        Iterator it = ((ArrayList) ((l4.e) this.f6184c).f19360b).iterator();
        while (it.hasNext()) {
            y9.b bVar = (y9.b) it.next();
            if (bVar.f25740a.f25735a.b(f0Var)) {
                try {
                    ((l4.e) this.f6184c).f19359a += -bVar.b();
                    bVar.c();
                } catch (Throwable th2) {
                    ((ba.d) this.f6185d).g("Failed to purge batch", th2);
                }
                it.remove();
            }
        }
    }

    @Override // io.sentry.e1
    public boolean isClosed() {
        io.sentry.r a7 = ((io.sentry.util.a) this.f6183b).a();
        try {
            boolean isShutdown = ((ScheduledThreadPoolExecutor) this.f6182a).isShutdown();
            a7.close();
            return isShutdown;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void j(JSONObject jSONObject) {
        Iterator it = ((aa.o) this.f6182a).iterator();
        while (true) {
            aa.n nVar = (aa.n) it;
            if (!nVar.hasNext()) {
                return;
            }
            Object obj = nVar.f115b;
            nVar.a();
            WebView webView = (WebView) obj;
            jSONObject.put("webViewID", System.identityHashCode(webView));
            webView.post(new com.appsflyer.internal.o(1, this, jSONObject, webView, new WebMessage(jSONObject.toString())));
        }
    }

    public void k(androidx.credentials.playservices.controllers.CreateRestoreCredential.a aVar) {
        com.logrocket.core.f0 f0Var;
        if (LogRocketCore.maybeGetInstance(true) == null || (f0Var = (com.logrocket.core.f0) ((WeakReference) this.f6184c).get()) == null) {
            return;
        }
        x xVar = (x) aVar.f1514b;
        try {
            com.logrocket.core.webview.a aVar2 = new com.logrocket.core.webview.a();
            aVar2.put("type", "LOGROCKET_WEB_VIEW_SESSION_INFO");
            aVar2.put("appID", f0Var.f6445a);
            aVar2.put("recordingID", f0Var.f6446b);
            aVar2.put("sessionID", f0Var.f6447c);
            if (f0Var.j) {
                aVar2.put("confirmed", true);
            }
            xVar.j(aVar2);
        } catch (JSONException unused) {
        }
    }

    @Override // io.sentry.e1
    public Future l(Runnable runnable, long j) {
        return ((ScheduledThreadPoolExecutor) this.f6182a).schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public synchronized void m() {
        try {
            y9.b m6 = ((androidx.appcompat.widget.a0) this.f6183b).m();
            if (m6 != null) {
                if (!(m6.f25741b == 0)) {
                    t();
                }
            }
            ((androidx.appcompat.widget.a0) this.f6183b).t();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(mf.c cVar) {
        wc.k kVar;
        Object obj;
        int i5;
        if (cVar instanceof wc.k) {
            kVar = (wc.k) cVar;
            int i10 = kVar.f25129c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f25129c = i10 - Integer.MIN_VALUE;
                obj = kVar.f25127a;
                Object obj2 = lf.a.f20034a;
                i5 = kVar.f25129c;
                boolean z5 = true;
                if (i5 != 0) {
                    h8.b.B(obj);
                    kVar.f25129c = 1;
                    obj = A(kVar);
                } else if (i5 == 1) {
                    h8.b.B(obj);
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    kVar.f25129c = 2;
                    obj = ((rc.r) this.f6182a).b(kVar);
                }
                z5 = false;
                return Boolean.valueOf(z5);
            }
        }
        kVar = new wc.k(this, cVar);
        obj = kVar.f25127a;
        Object obj22 = lf.a.f20034a;
        i5 = kVar.f25129c;
        boolean z52 = true;
        if (i5 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z52 = false;
        return Boolean.valueOf(z52);
    }

    public void o() {
        ArrayList arrayList;
        ((io.sentry.config.a) this.f6182a).f("Create eager instances ...");
        cg.p.f3941a.getClass();
        cg.n.f3939a.getClass();
        long nanoTime = System.nanoTime() - cg.n.f3940b;
        v0 v0Var = (v0) this.f6185d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) v0Var.f366d;
        ci.d[] dVarArr = (ci.d[]) concurrentHashMap.values().toArray(new ci.d[0]);
        Object[] elements = Arrays.copyOf(dVarArr, dVarArr.length);
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            arrayList = new ArrayList();
        } else {
            Intrinsics.checkNotNullParameter(elements, "<this>");
            arrayList = new ArrayList(new kotlin.collections.j(elements, true));
        }
        concurrentHashMap.clear();
        x xVar = (x) v0Var.f364b;
        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0((io.sentry.config.a) xVar.f6182a, ((hi.a) xVar.f6184c).f10829b, Reflection.getOrCreateKotlinClass(ci.c.class), (gi.a) null, (fi.a) null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ci.d) it.next()).b(a0Var);
        }
        long a7 = cg.o.a(nanoTime);
        io.sentry.config.a aVar = (io.sentry.config.a) this.f6182a;
        StringBuilder sb2 = new StringBuilder("Created eager instances in ");
        cg.a aVar2 = cg.b.f3911b;
        sb2.append(cg.b.f(a7, cg.e.f3917c) / 1000.0d);
        sb2.append(" ms");
        aVar.f(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(mf.c cVar) {
        c1.l lVar;
        int i5;
        c1.d dVar;
        c1.i0 i0Var = (c1.i0) this.f6185d;
        if (cVar instanceof c1.l) {
            lVar = (c1.l) cVar;
            int i10 = lVar.f3419c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f3419c = i10 - Integer.MIN_VALUE;
                Object obj = lVar.f3417a;
                lf.a aVar = lf.a.f20034a;
                i5 = lVar.f3419c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    List list = (List) this.f6184c;
                    if (list != null) {
                        Intrinsics.checkNotNull(list);
                        if (!list.isEmpty()) {
                            b1 g10 = i0Var.g();
                            c1.o oVar = new c1.o(i0Var, this, null);
                            lVar.f3419c = 2;
                            obj = g10.b(oVar, lVar);
                        }
                    }
                    lVar.f3419c = 1;
                    obj = c1.i0.f(i0Var, false, lVar);
                } else if (i5 == 1) {
                    h8.b.B(obj);
                    dVar = (c1.d) obj;
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    dVar = (c1.d) obj;
                }
                i0Var.f3408h.d(dVar);
                return Unit.f19194a;
            }
        }
        lVar = new c1.l(this, cVar);
        Object obj2 = lVar.f3417a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = lVar.f3419c;
        if (i5 != 0) {
        }
        i0Var.f3408h.d(dVar);
        return Unit.f19194a;
    }

    public synchronized ExecutorService q() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f6182a) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = hh.g.f10826b + " Dispatcher";
                Intrinsics.checkNotNullParameter(name, "name");
                this.f6182a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new hh.f(name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f6182a;
            Intrinsics.checkNotNull(threadPoolExecutor);
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    public kh.m r(String str) {
        Iterator it = ((ArrayDeque) this.f6183b).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            kh.m mVar = (kh.m) it.next();
            if (Intrinsics.areEqual(mVar.f19135c.f19139b.f10206a.f10332d, str)) {
                return mVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f6185d).iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            kh.m mVar2 = (kh.m) it2.next();
            if (Intrinsics.areEqual(mVar2.f19135c.f19139b.f10206a.f10332d, str)) {
                return mVar2;
            }
        }
        return null;
    }

    public void s(kh.m call) {
        Intrinsics.checkNotNullParameter(call, "call");
        I(this, null, null, call, 3);
    }

    @Override // io.sentry.e1
    public Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f6182a;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        b6 b6Var = (b6) this.f6185d;
        if (b6Var != null) {
            b6Var.getLogger().h(b5.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new v4();
    }

    public synchronized void t() {
        try {
            y9.b r5 = ((androidx.appcompat.widget.a0) this.f6183b).r();
            if (r5 != null) {
                ((ba.d) this.f6185d).a("Flushing event batch.");
                l4.e eVar = (l4.e) this.f6184c;
                ((ArrayList) eVar.f19360b).add(r5);
                eVar.f19359a += r5.b();
            } else {
                ((ba.d) this.f6185d).a("Flushing skipped, no new event batch.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public n.f u(n.b bVar) {
        ArrayList arrayList = (ArrayList) this.f6184c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            n.f fVar = (n.f) arrayList.get(i5);
            if (fVar != null && fVar.f20774b == bVar) {
                return fVar;
            }
        }
        n.f fVar2 = new n.f((Context) this.f6183b, bVar);
        arrayList.add(fVar2);
        return fVar2;
    }

    public k1 x(ag.c modelClass, String key) {
        k1 viewModel;
        k1 a7;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((s7.u) this.f6185d)) {
            try {
                o1 o1Var = (o1) this.f6182a;
                o1Var.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                viewModel = (k1) o1Var.f2228a.get(key);
                if (modelClass.isInstance(viewModel)) {
                    m1 m1Var = (m1) this.f6183b;
                    if (m1Var instanceof g1) {
                        g1 g1Var = (g1) m1Var;
                        Intrinsics.checkNotNull(viewModel);
                        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                        androidx.lifecycle.y yVar = g1Var.f2178d;
                        if (yVar != null) {
                            q2.d dVar = g1Var.f2179e;
                            Intrinsics.checkNotNull(dVar);
                            Intrinsics.checkNotNull(yVar);
                            d1.b(viewModel, dVar, yVar);
                        }
                    }
                    Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    t1.e extras = new t1.e((t1.c) this.f6184c);
                    extras.b(n1.f2219b, key);
                    m1 factory = (m1) this.f6183b;
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    Intrinsics.checkNotNullParameter(extras, "extras");
                    try {
                        try {
                            a7 = factory.b(modelClass, extras);
                        } catch (AbstractMethodError unused) {
                            a7 = factory.c(u6.h.k(modelClass), extras);
                        }
                    } catch (AbstractMethodError unused2) {
                        a7 = factory.a(u6.h.k(modelClass));
                    }
                    viewModel = a7;
                    o1 o1Var2 = (o1) this.f6182a;
                    o1Var2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                    k1 k1Var = (k1) o1Var2.f2228a.put(key, viewModel);
                    if (k1Var != null) {
                        k1Var.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return viewModel;
    }

    public boolean y(Context context) {
        if (((Boolean) this.f6184c) == null) {
            this.f6184c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f6183b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f6184c).booleanValue();
    }

    public boolean z(Context context) {
        if (((Boolean) this.f6183b) == null) {
            this.f6183b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f6183b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f6183b).booleanValue();
    }

    public x(x xVar, com.google.android.gms.internal.measurement.t tVar) {
        this.f6184c = new HashMap();
        this.f6185d = new HashMap();
        this.f6182a = xVar;
        this.f6183b = tVar;
    }

    public x(s7.v0 v0Var, String str) {
        this.f6185d = v0Var;
        g6.v.e(str);
        this.f6182a = str;
        this.f6183b = new Bundle();
    }

    public x(o1 store, m1 factory, t1.c defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.f6182a = store;
        this.f6183b = factory;
        this.f6184c = defaultExtras;
        this.f6185d = new s7.u(17);
    }

    public x(b6 b6Var) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new io.sentry.j0(1));
        this.f6183b = new io.sentry.util.a();
        this.f6184c = new aa.d(3);
        this.f6182a = scheduledThreadPoolExecutor;
        this.f6185d = b6Var;
    }

    public x(Typeface typeface, k1.b bVar) {
        int i5;
        int i10;
        int i11;
        int i12;
        this.f6185d = typeface;
        this.f6182a = bVar;
        this.f6184c = new j1.r(Segment.SHARE_MINIMUM);
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i13 = a7 + bVar.f1359a;
            i5 = ((ByteBuffer) bVar.f1362d).getInt(((ByteBuffer) bVar.f1362d).getInt(i13) + i13);
        } else {
            i5 = 0;
        }
        this.f6183b = new char[i5 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i14 = a10 + bVar.f1359a;
            i10 = ((ByteBuffer) bVar.f1362d).getInt(((ByteBuffer) bVar.f1362d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            j1.u uVar = new j1.u(this, i15);
            k1.a b10 = uVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.f1362d).getInt(a11 + b10.f1359a) : 0, (char[]) this.f6183b, i15 * 2);
            k1.a b11 = uVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i16 = a12 + b11.f1359a;
                i11 = ((ByteBuffer) b11.f1362d).getInt(((ByteBuffer) b11.f1362d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            rh.g.c("invalid metadata codepoint length", i11 > 0);
            j1.r rVar = (j1.r) this.f6184c;
            k1.a b12 = uVar.b();
            int a13 = b12.a(16);
            if (a13 != 0) {
                int i17 = a13 + b12.f1359a;
                i12 = ((ByteBuffer) b12.f1362d).getInt(((ByteBuffer) b12.f1362d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            rVar.a(uVar, 0, i12 - 1);
        }
    }

    public x(int i5) {
        switch (i5) {
            case 5:
                com.google.android.gms.internal.measurement.t tVar = new com.google.android.gms.internal.measurement.t(0);
                this.f6182a = tVar;
                x xVar = new x((x) null, tVar);
                this.f6184c = xVar;
                this.f6183b = xVar.W();
                u5 u5Var = new u5(1);
                this.f6185d = u5Var;
                xVar.Y("require", new t9(u5Var));
                ((HashMap) u5Var.f5267a).put("internal.platform", com.google.android.gms.internal.measurement.d1.f4961a);
                xVar.Y("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
                break;
            case 7:
                this.f6182a = new aa.o();
                this.f6183b = new ba.d("webview");
                this.f6184c = new WeakReference(null);
                this.f6185d = Uri.parse("*");
                break;
            case 10:
                this.f6185d = new ArrayDeque();
                this.f6183b = new ArrayDeque();
                this.f6184c = new ArrayDeque();
                break;
            case C0122e9.G /* 26 */:
                this.f6182a = new rc.r();
                this.f6183b = new s7.u(21);
                this.f6184c = new rc.a();
                this.f6185d = new s7.u(20);
                break;
            case 28:
                di.b bVar = di.b.f8381a;
                this.f6182a = new di.a();
                this.f6183b = new l1.a(this);
                this.f6184c = new hi.a(this);
                this.f6185d = new v0(this);
                Intrinsics.checkNotNullParameter(this, "_koin");
                new ConcurrentHashMap();
                Intrinsics.checkNotNullParameter(this, "_koin");
                new HashMap();
                new HashMap();
                break;
            default:
                this.f6182a = null;
                this.f6183b = null;
                this.f6184c = null;
                this.f6185d = new ArrayDeque();
                break;
        }
    }

    public x(io.sentry.android.core.b0 b0Var) {
        this.f6182a = b0Var;
        this.f6183b = null;
        this.f6184c = null;
        this.f6185d = null;
    }
}
