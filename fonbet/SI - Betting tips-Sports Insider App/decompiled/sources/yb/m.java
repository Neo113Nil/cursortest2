package yb;

import androidx.appcompat.app.t;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.q;
import com.sports.insider.util.ExtAsDeferredKt;
import e5.p;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {
    public static FirebaseMessaging a() {
        FirebaseMessaging firebaseMessaging;
        h9.c cVar = FirebaseMessaging.f6059l;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(h8.g.c());
        }
        Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance(...)");
        return firebaseMessaging;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(mf.c cVar) {
        j jVar;
        int i5;
        try {
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i10 = jVar.f25824c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    jVar.f25824c = i10 - Integer.MIN_VALUE;
                    Object obj = jVar.f25822a;
                    lf.a aVar = lf.a.f20034a;
                    i5 = jVar.f25824c;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        FirebaseMessaging a7 = a();
                        a7.getClass();
                        w7.g gVar = new w7.g();
                        a7.f6067f.execute(new t(4, a7, gVar));
                        w7.m mVar = gVar.f24979a;
                        Intrinsics.checkNotNullExpressionValue(mVar, "getToken(...)");
                        jVar.f25824c = 1;
                        obj = ExtAsDeferredKt.asDeferred(mVar, jVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (String) obj;
                }
            }
            if (i5 != 0) {
            }
            return (String) obj;
        } catch (Exception e7) {
            if ((e7 instanceof UnknownHostException) || (e7 instanceof ConnectException) || (e7 instanceof SocketTimeoutException) || (e7 instanceof SocketException) || (e7 instanceof SSLHandshakeException) || (e7 instanceof IOException)) {
                return null;
            }
            zc.d.b(4, "pushToken", e7);
            return null;
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f25822a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = jVar.f25824c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        zc.d.b(6, null, r7);
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, mf.c cVar) {
        k kVar;
        int i5;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f25827c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f25827c = i10 - Integer.MIN_VALUE;
                Object obj = kVar.f25825a;
                lf.a aVar = lf.a.f20034a;
                i5 = kVar.f25827c;
                boolean z5 = true;
                if (i5 != 0) {
                    h8.b.B(obj);
                    w7.m mVar = a().f6069h;
                    q qVar = new q(str, 0);
                    mVar.getClass();
                    p pVar = w7.h.f24980a;
                    w7.m mVar2 = new w7.m();
                    mVar.f24999b.d(new w7.k(pVar, qVar, mVar2));
                    mVar.q();
                    Intrinsics.checkNotNullExpressionValue(mVar2, "subscribeToTopic(...)");
                    kVar.f25827c = 1;
                    if (ExtAsDeferredKt.asDeferred(mVar2, kVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Boolean.valueOf(z5);
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f25825a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = kVar.f25827c;
        boolean z52 = true;
        if (i5 != 0) {
        }
        return Boolean.valueOf(z52);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        zc.d.b(6, null, r7);
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, mf.c cVar) {
        l lVar;
        int i5;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f25830c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f25830c = i10 - Integer.MIN_VALUE;
                Object obj = lVar.f25828a;
                lf.a aVar = lf.a.f20034a;
                i5 = lVar.f25830c;
                boolean z5 = true;
                if (i5 != 0) {
                    h8.b.B(obj);
                    w7.m mVar = a().f6069h;
                    q qVar = new q(str, 1);
                    mVar.getClass();
                    p pVar = w7.h.f24980a;
                    w7.m mVar2 = new w7.m();
                    mVar.f24999b.d(new w7.k(pVar, qVar, mVar2));
                    mVar.q();
                    Intrinsics.checkNotNullExpressionValue(mVar2, "unsubscribeFromTopic(...)");
                    lVar.f25830c = 1;
                    if (ExtAsDeferredKt.asDeferred(mVar2, lVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Boolean.valueOf(z5);
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f25828a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = lVar.f25830c;
        boolean z52 = true;
        if (i5 != 0) {
        }
        return Boolean.valueOf(z52);
    }
}
