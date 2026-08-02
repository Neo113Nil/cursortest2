package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.q4;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.logrocket.core.LogRocketCore;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.idsync.impl.D;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0036b0;
import io.appmetrica.analytics.impl.C0493t1;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.sentry.n6;
import io.sentry.ndk.NativeScope;
import io.sentry.p6;
import io.sentry.s3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1886d;

    public /* synthetic */ d(j5.a aVar, e5.i iVar, com.google.firebase.messaging.k kVar, e5.h hVar) {
        this.f1883a = 19;
        this.f1884b = aVar;
        this.f1885c = iVar;
        this.f1886d = hVar;
    }

    private final void a() {
        l1.a aVar = (l1.a) this.f1884b;
        f3.k kVar = (f3.k) this.f1885c;
        f3.f fVar = (f3.f) aVar.f19314b;
        fVar.getClass();
        m3.j jVar = kVar.f9389a;
        String str = jVar.f20321a;
        ArrayList arrayList = new ArrayList();
        m3.o oVar = (m3.o) fVar.f9357e.o(new f3.e(fVar, arrayList, str, 0));
        if (oVar == null) {
            e3.x.e().h(f3.f.f9352l, "Didn't find WorkSpec for id " + jVar);
            ((e5.p) fVar.f9356d.f6185d).execute(new androidx.appcompat.app.t(12, fVar, jVar));
            return;
        }
        synchronized (fVar.f9362k) {
            try {
                if (fVar.f(str)) {
                    Set set = (Set) fVar.f9360h.get(str);
                    if (((f3.k) set.iterator().next()).f9389a.f20322b == jVar.f20322b) {
                        set.add(kVar);
                        e3.x.e().a(f3.f.f9352l, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        ((e5.p) fVar.f9356d.f6185d).execute(new androidx.appcompat.app.t(12, fVar, jVar));
                    }
                    return;
                }
                if (oVar.f20348t != jVar.f20322b) {
                    ((e5.p) fVar.f9356d.f6185d).execute(new androidx.appcompat.app.t(12, fVar, jVar));
                    return;
                }
                f3.j0 j0Var = new f3.j0(new q4(fVar.f9354b, fVar.f9355c, fVar.f9356d, fVar, fVar.f9357e, oVar, arrayList));
                eg.w wVar = (eg.w) j0Var.f9380d.f6183b;
                eg.g1 c2 = eg.c0.c();
                wVar.getClass();
                u.k q = u6.h.q(kotlin.coroutines.e.c(wVar, c2), new f3.h0(j0Var, null, 1));
                q.f24004b.a(new d(fVar, q, j0Var, 11), (e5.p) fVar.f9356d.f6185d);
                fVar.f9359g.put(str, j0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(kVar);
                fVar.f9360h.put(str, hashSet);
                e3.x.e().a(f3.f.f9352l, f3.f.class.getSimpleName() + ": processing " + jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        b2.e eVar = (b2.e) this.f1884b;
        k2.x xVar = (k2.x) this.f1885c;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1886d;
        try {
            j1.q d10 = io.sentry.config.a.d(eVar.f2968a);
            if (d10 == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            j1.p pVar = (j1.p) ((j1.i) d10.f18199b);
            synchronized (pVar.f18224d) {
                pVar.f18226f = threadPoolExecutor;
            }
            ((j1.i) d10.f18199b).a(new j1.l(xVar, threadPoolExecutor));
        } catch (Throwable th2) {
            xVar.y(th2);
            threadPoolExecutor.shutdown();
        }
    }

    private final void c() {
        JSONObject optJSONObject;
        i9.g gVar = (i9.g) this.f1884b;
        String str = (String) this.f1885c;
        j9.e eVar = (j9.e) this.f1886d;
        d7.e eVar2 = gVar.f11022a;
        l8.b bVar = (l8.b) ((a9.a) eVar2.f8268b).get();
        if (bVar == null) {
            return;
        }
        JSONObject jSONObject = eVar.f18306e;
        if (jSONObject.length() < 1) {
            return;
        }
        JSONObject jSONObject2 = eVar.f18303b;
        if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (((Map) eVar2.f8269c)) {
                try {
                    if (optString.equals(((Map) eVar2.f8269c).get(str))) {
                        return;
                    }
                    ((Map) eVar2.f8269c).put(str, optString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObject2.optString(str));
                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", optJSONObject.optString("group"));
                    l8.c cVar = (l8.c) bVar;
                    cVar.a("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", optString);
                    cVar.a("fp", "_fpc", bundle2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        switch (this.f1883a) {
            case 0:
                ViewGroup container = (ViewGroup) this.f1884b;
                View view = (View) this.f1885c;
                f this$0 = (f) this.f1886d;
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                container.endViewTransition(view);
                this$0.f1900c.f1994a.c(this$0);
                return;
            case 1:
                f2 f2Var = (f2) this.f1884b;
                f2 f2Var2 = (f2) this.f1885c;
                p this$02 = (p) this.f1886d;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Fragment inFragment = f2Var.f1905c;
                Fragment outFragment = f2Var2.f1905c;
                boolean z7 = this$02.f2031o;
                s.e sharedElements = this$02.f2030n;
                y1 y1Var = t1.f2090a;
                Intrinsics.checkNotNullParameter(inFragment, "inFragment");
                Intrinsics.checkNotNullParameter(outFragment, "outFragment");
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                if (z7) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 2:
                a2 impl = (a2) this.f1884b;
                View view2 = (View) this.f1885c;
                Rect lastInEpicenterRect = (Rect) this.f1886d;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                a2.j(lastInEpicenterRect, view2);
                return;
            case 3:
                io.appmetrica.analytics.idsync.impl.n.a((D) this.f1884b, (io.appmetrica.analytics.idsync.impl.n) this.f1885c, (RequestConfig) this.f1886d);
                return;
            case 4:
                ((AFa1ySDK) this.f1884b).e_((Context) this.f1885c, (Intent) this.f1886d);
                return;
            case 5:
                AFd1wSDK.getCurrencyIso4217Code((AFd1wSDK) this.f1884b, (Throwable) this.f1885c, (String) this.f1886d);
                return;
            case 6:
                ((AFj1sSDK) this.f1884b).getMediationNetwork((AFi1aSDK) this.f1885c, (Runnable) this.f1886d);
                return;
            case 7:
                com.google.firebase.messaging.h hVar = (com.google.firebase.messaging.h) this.f1884b;
                Intent intent = (Intent) this.f1885c;
                w7.g gVar = (w7.g) this.f1886d;
                hVar.getClass();
                try {
                    hVar.handleIntent(intent);
                    return;
                } finally {
                    gVar.b(null);
                }
            case 8:
                com.logrocket.core.x xVar = (com.logrocket.core.x) this.f1884b;
                ArrayList arrayList = (ArrayList) this.f1885c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f1886d;
                com.logrocket.core.graphics.f fVar = xVar.f6650f;
                try {
                    if (arrayList.isEmpty()) {
                        ba.b bVar = xVar.f6649e;
                        bVar.getClass();
                        androidx.recyclerview.widget.j jVar = new androidx.recyclerview.widget.j("processFrame");
                        bVar.k(jVar);
                        try {
                            ArrayList d10 = xVar.d();
                            com.logrocket.core.j0 j0Var = xVar.f6651g;
                            if (j0Var != null) {
                                j0Var.b(d10);
                            }
                            fVar.g(d10);
                        } catch (Throwable th2) {
                            try {
                                bVar.e("processFrame error", th2);
                                com.logrocket.core.h0.c(th2);
                            } catch (Throwable th3) {
                                bVar.i(jVar);
                                throw th3;
                            }
                        }
                        bVar.i(jVar);
                    } else {
                        fVar.g(arrayList);
                    }
                    return;
                } catch (Throwable th4) {
                    try {
                        LogRocketCore.l("Error while processing frame", th4);
                        com.logrocket.core.h0.c(th4);
                        return;
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            case 9:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1884b;
                u.h hVar2 = (u.h) this.f1885c;
                n3.q qVar = (n3.q) this.f1886d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    qVar.invoke();
                    hVar2.a(null);
                    return;
                } catch (Throwable th5) {
                    hVar2.b(th5);
                    return;
                }
            case 10:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1884b;
                u.h hVar3 = (u.h) this.f1885c;
                Function0 function0 = (Function0) this.f1886d;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    hVar3.a(function0.invoke());
                    return;
                } catch (Throwable th6) {
                    hVar3.b(th6);
                    return;
                }
            case 11:
                f3.f fVar2 = (f3.f) this.f1884b;
                u.k kVar = (u.k) this.f1885c;
                f3.j0 j0Var2 = (f3.j0) this.f1886d;
                fVar2.getClass();
                try {
                    z5 = ((Boolean) kVar.f24004b.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    z5 = true;
                }
                synchronized (fVar2.f9362k) {
                    try {
                        m3.j j = m4.g.j(j0Var2.f9377a);
                        String str = j.f20321a;
                        if (fVar2.d(str) == j0Var2) {
                            fVar2.b(str);
                        }
                        e3.x.e().a(f3.f.f9352l, f3.f.class.getSimpleName() + " " + str + " executed; reschedule = " + z5);
                        Iterator it = fVar2.j.iterator();
                        while (it.hasNext()) {
                            ((f3.c) it.next()).a(j, z5);
                        }
                    } finally {
                    }
                }
                return;
            case 12:
                a();
                return;
            case 13:
                L0.a((L0) this.f1884b, (PluginErrorDetails) this.f1885c, (String) this.f1886d);
                return;
            case 14:
                C0036b0.a((C0036b0) this.f1884b, (Context) this.f1885c, (AppMetricaLibraryAdapterConfig) this.f1886d);
                return;
            case 15:
                ((C0493t1) this.f1884b).b((Context) this.f1885c, (AppMetricaConfig) this.f1886d);
                return;
            case 16:
                io.sentry.android.ndk.c cVar = (io.sentry.android.ndk.c) this.f1884b;
                String str2 = (String) this.f1885c;
                String str3 = (String) this.f1886d;
                cVar.f15920b.getClass();
                NativeScope.nativeSetTag(str2, str3);
                return;
            case 17:
                io.sentry.cache.g gVar2 = (io.sentry.cache.g) this.f1884b;
                n6 n6Var = (n6) this.f1885c;
                s3 s3Var = (s3) this.f1886d;
                if (n6Var != null) {
                    gVar2.p(n6Var, "trace.json");
                    return;
                }
                androidx.appcompat.app.v0 v0Var = s3Var.f17069s;
                n6 n6Var2 = new n6((io.sentry.protocol.v) v0Var.f364b, (p6) v0Var.f365c, "default", null);
                n6Var2.f16675i = "auto";
                gVar2.p(n6Var2, "trace.json");
                return;
            case 18:
                b();
                return;
            case 19:
                j5.a aVar = (j5.a) this.f1884b;
                e5.i iVar = (e5.i) this.f1885c;
                String str4 = iVar.f8641a;
                e5.h hVar4 = (e5.h) this.f1886d;
                aVar.getClass();
                Logger logger = j5.a.f18258f;
                try {
                    f5.e a7 = aVar.f18261c.a(str4);
                    if (a7 == null) {
                        String str5 = "Transport backend '" + str4 + "' is not registered";
                        logger.warning(str5);
                        new IllegalArgumentException(str5);
                    } else {
                        ((l5.i) aVar.f18263e).w(new androidx.transition.i(aVar, iVar, ((c5.c) a7).a(hVar4), 9));
                    }
                    return;
                } catch (Exception e7) {
                    logger.warning("Error scheduling event " + e7.getMessage());
                    return;
                }
            case 20:
                c();
                return;
            case 21:
                io.sentry.util.network.b bVar2 = (io.sentry.util.network.b) this.f1884b;
                oi.g gVar3 = (oi.g) this.f1885c;
                oi.s0 s0Var = (oi.s0) this.f1886d;
                oi.n nVar = (oi.n) bVar2.f17177c;
                if (nVar.f21280b.c()) {
                    gVar3.b(nVar, new IOException("Canceled"));
                    return;
                } else {
                    gVar3.d(nVar, s0Var);
                    return;
                }
            default:
                ((oi.g) this.f1885c).b((oi.n) ((io.sentry.util.network.b) this.f1884b).f17177c, (Throwable) this.f1886d);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i5) {
        this.f1883a = i5;
        this.f1884b = obj;
        this.f1885c = obj2;
        this.f1886d = obj3;
    }
}
