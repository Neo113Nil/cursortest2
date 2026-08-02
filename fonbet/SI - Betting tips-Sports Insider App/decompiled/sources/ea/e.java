package ea;

import androidx.appcompat.widget.a0;
import com.google.gson.j;
import e6.r;
import eg.c0;
import gh.f0;
import gh.g0;
import gh.x;
import gh.y;
import io.sentry.l0;
import io.sentry.okhttp.g;
import io.sentry.y3;
import j$.util.DesugarCollections;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oi.t0;
import r3.e0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static volatile e0 f8789b;

    /* renamed from: a, reason: collision with root package name */
    public final ng.c f8790a = new ng.c();

    public static e0 a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        g interceptor;
        io.sentry.okhttp.e eventListener;
        int i5 = 19;
        try {
            interceptor = new g(19, t.c(new l0(500, 599)));
        } catch (Exception e7) {
            zc.d.b(4, "moduleGetApi", e7);
            interceptor = null;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(y3.f17255a, "getInstance(...)");
            eventListener = new io.sentry.okhttp.e(null);
        } catch (Exception e9) {
            zc.d.b(4, "moduleGetApi", e9);
            eventListener = null;
        }
        f0 f0Var = new f0();
        ArrayList arrayList = f0Var.f10150c;
        if (interceptor != null) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            arrayList.add(interceptor);
        }
        if (eventListener != null) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            TimeZone timeZone = hh.g.f10825a;
            Intrinsics.checkNotNullParameter(eventListener, "<this>");
            f0Var.f10152e = new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(i5, eventListener);
        }
        c interceptor2 = new c();
        Intrinsics.checkNotNullParameter(interceptor2, "interceptor");
        arrayList.add(interceptor2);
        if (sSLSocketFactory != null && x509TrustManager != null) {
            f0Var.a(sSLSocketFactory, x509TrustManager);
            b hostnameVerifier = new b();
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            Intrinsics.areEqual(hostnameVerifier, f0Var.f10164s);
            f0Var.f10164s = hostnameVerifier;
        }
        g0 okHttpClient = new g0(f0Var);
        Intrinsics.checkNotNullParameter("https://sport-insider.club/", "baseUrl");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList2.add(new pi.a(new j()));
        arrayList3.add(new r3.b());
        Intrinsics.checkNotNullParameter("https://sport-insider.club/api/", "<this>");
        x xVar = new x();
        xVar.c(null, "https://sport-insider.club/api/");
        y a7 = xVar.a();
        ArrayList arrayList4 = a7.f10334f;
        if (!"".equals(arrayList4.get(arrayList4.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + a7);
        }
        r rVar = oi.l0.f21276a;
        oi.a aVar = oi.l0.f21278c;
        ArrayList arrayList5 = new ArrayList(arrayList3);
        List a10 = aVar.a(rVar);
        arrayList5.addAll(a10);
        List b10 = aVar.b();
        ArrayList arrayList6 = new ArrayList(arrayList2.size() + 1 + b10.size());
        arrayList6.add(new oi.b(0));
        arrayList6.addAll(arrayList2);
        arrayList6.addAll(b10);
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList6);
        List unmodifiableList2 = DesugarCollections.unmodifiableList(arrayList5);
        a10.size();
        a0 a0Var = new a0(okHttpClient, a7, unmodifiableList, unmodifiableList2, rVar);
        if (!r3.c.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(r3.c.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls.getName());
                if (cls != r3.c.class) {
                    sb2.append(" which is an interface of ");
                    sb2.append(r3.c.class.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        Object newProxyInstance = Proxy.newProxyInstance(r3.c.class.getClassLoader(), new Class[]{r3.c.class}, new t0(a0Var));
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "create(...)");
        r3.c routes = (r3.c) newProxyInstance;
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter("en", "_language");
        e0 e0Var = new e0();
        e0Var.f22226a = routes;
        e0Var.f22227b = "en";
        e0Var.f22228c = null;
        return e0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0058, code lost:
    
        if (r9.c(r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: all -> 0x002d, TryCatch #3 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0081, B:14:0x00ae, B:21:0x00a0, B:23:0x00a4, B:24:0x00aa), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6 A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:32:0x005b, B:37:0x005f, B:34:0x00b6), top: B:31:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v6, types: [ng.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mf.c cVar) {
        d dVar;
        int i5;
        ng.c cVar2;
        int i10;
        ng.a aVar;
        Throwable th2;
        Exception e7;
        Object i11;
        e0 e0Var;
        e0 a7;
        try {
            if (cVar instanceof d) {
                dVar = (d) cVar;
                int i12 = dVar.f8788e;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    dVar.f8788e = i12 - Integer.MIN_VALUE;
                    Object obj = dVar.f8786c;
                    lf.a aVar2 = lf.a.f20034a;
                    i5 = dVar.f8788e;
                    Continuation continuation = null;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        e0 e0Var2 = f8789b;
                        if (e0Var2 != null) {
                            return e0Var2;
                        }
                        cVar2 = this.f8790a;
                        dVar.f8784a = cVar2;
                        i10 = 0;
                        dVar.f8785b = 0;
                        dVar.f8788e = 1;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = dVar.f8784a;
                            try {
                                try {
                                    h8.b.B(obj);
                                    Pair pair = (Pair) obj;
                                    SSLContext sSLContext = (SSLContext) pair.f19192a;
                                    a7 = a(sSLContext.getSocketFactory(), (X509TrustManager) pair.f19193b);
                                } catch (Exception e9) {
                                    e7 = e9;
                                    if (!(e7 instanceof CancellationException)) {
                                        zc.d.b(4, "moduleGetApi", e7);
                                    }
                                    a7 = a(null, null);
                                    f8789b = a7;
                                    e0Var = f8789b;
                                    Intrinsics.checkNotNull(e0Var);
                                    aVar.k(null);
                                    return e0Var;
                                }
                                f8789b = a7;
                                e0Var = f8789b;
                                Intrinsics.checkNotNull(e0Var);
                                aVar.k(null);
                                return e0Var;
                            } catch (Throwable th3) {
                                th2 = th3;
                                aVar.k(null);
                                throw th2;
                            }
                        }
                        i10 = dVar.f8785b;
                        ?? r42 = dVar.f8784a;
                        h8.b.B(obj);
                        cVar2 = r42;
                    }
                    if (f8789b == null) {
                        e0 e0Var3 = f8789b;
                        Intrinsics.checkNotNull(e0Var3);
                        aVar = cVar2;
                        e0Var = e0Var3;
                        aVar.k(null);
                        return e0Var;
                    }
                    try {
                        gc.a aVar3 = (gc.a) com.google.android.gms.internal.measurement.y3.m(gc.a.class, null, 6);
                        dVar.f8784a = cVar2;
                        dVar.f8785b = i10;
                        dVar.f8788e = 2;
                        aVar3.getClass();
                        i11 = c0.i(new ad.a(aVar3, continuation, 7), dVar);
                    } catch (Exception e10) {
                        aVar = cVar2;
                        e7 = e10;
                        if (!(e7 instanceof CancellationException)) {
                        }
                        a7 = a(null, null);
                        f8789b = a7;
                        e0Var = f8789b;
                        Intrinsics.checkNotNull(e0Var);
                        aVar.k(null);
                        return e0Var;
                    }
                    if (i11 != aVar2) {
                        aVar = cVar2;
                        obj = i11;
                        Pair pair2 = (Pair) obj;
                        SSLContext sSLContext2 = (SSLContext) pair2.f19192a;
                        a7 = a(sSLContext2.getSocketFactory(), (X509TrustManager) pair2.f19193b);
                        f8789b = a7;
                        e0Var = f8789b;
                        Intrinsics.checkNotNull(e0Var);
                        aVar.k(null);
                        return e0Var;
                    }
                    return aVar2;
                }
            }
            if (f8789b == null) {
            }
        } catch (Throwable th4) {
            aVar = cVar2;
            th2 = th4;
            aVar.k(null);
            throw th2;
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f8786c;
        lf.a aVar22 = lf.a.f20034a;
        i5 = dVar.f8788e;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
    }
}
