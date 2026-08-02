package wc;

import com.google.android.gms.internal.measurement.y3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.b5;
import io.sentry.d4;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import la.e1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(4:9|10|11|12)(2:53|54))(4:55|56|57|(1:59)(1:60))|13|14|(1:18)|19|20))|64|6|(0)(0)|13|14|(2:16|18)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, mf.c cVar) {
        a aVar;
        int i5;
        String str4;
        String str5;
        int i10;
        int i11;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f25049g;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f25049g = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f25047e;
                lf.a aVar2 = lf.a.f20034a;
                i5 = aVar.f25049g;
                if (i5 != 0) {
                    h8.b.B(obj);
                    try {
                        e1 e1Var = (e1) y3.m(e1.class, null, 6);
                        aVar.f25043a = str;
                        aVar.f25044b = str2;
                        aVar.f25045c = str3;
                        aVar.f25046d = 400;
                        aVar.f25049g = 1;
                        e1Var.getClass();
                        lg.e eVar = eg.m0.f9201a;
                        obj = eg.c0.A(lg.d.f20063c, new ig.o(e1Var, str, str2, str3, null, 1), aVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        str4 = str2;
                        str5 = str3;
                        i10 = 400;
                    } catch (Exception e7) {
                        e = e7;
                        str4 = str2;
                        str5 = str3;
                        i10 = 400;
                        if (!(e instanceof CancellationException) && !(e instanceof nh.a) && !(e instanceof nh.d0) && !(e instanceof ConnectException) && !(e instanceof SSLPeerUnverifiedException) && !(e instanceof SSLHandshakeException) && !(e instanceof TimeoutException) && !(e instanceof SocketTimeoutException) && !(e instanceof UnknownHostException) && !(e instanceof SocketException) && !(e instanceof SSLException) && !(e instanceof IOException)) {
                            zc.d.b(4, "validate", e);
                        }
                        i11 = i10;
                        if (400 <= i11) {
                        }
                        return new Integer(i11);
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = aVar.f25046d;
                    str5 = aVar.f25045c;
                    str4 = aVar.f25044b;
                    String str6 = aVar.f25043a;
                    try {
                        h8.b.B(obj);
                        i10 = i13;
                        str = str6;
                    } catch (Exception e9) {
                        e = e9;
                        i10 = i13;
                        str = str6;
                        if (!(e instanceof CancellationException)) {
                            zc.d.b(4, "validate", e);
                        }
                        i11 = i10;
                        if (400 <= i11) {
                        }
                        return new Integer(i11);
                    }
                }
                i11 = ((Number) obj).intValue();
                if (400 <= i11 && i11 < 600) {
                    StringBuilder sb2 = new StringBuilder("data");
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER + i11);
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER + str);
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER + str4);
                    String str7 = gc.d.f9945a;
                    sb2.append(d2.i.c());
                    sb2.append(d2.i.d());
                    sb2.append(str5);
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    d4.a(sb3, b5.INFO);
                }
                return new Integer(i11);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f25047e;
        lf.a aVar22 = lf.a.f20034a;
        i5 = aVar.f25049g;
        if (i5 != 0) {
        }
        i11 = ((Number) obj2).intValue();
        if (400 <= i11) {
            StringBuilder sb22 = new StringBuilder("data");
            sb22.append(StringUtils.PROCESS_POSTFIX_DELIMITER + i11);
            sb22.append(StringUtils.PROCESS_POSTFIX_DELIMITER + str);
            sb22.append(StringUtils.PROCESS_POSTFIX_DELIMITER + str4);
            String str72 = gc.d.f9945a;
            sb22.append(d2.i.c());
            sb22.append(d2.i.d());
            sb22.append(str5);
            String sb32 = sb22.toString();
            Intrinsics.checkNotNullExpressionValue(sb32, "toString(...)");
            d4.a(sb32, b5.INFO);
        }
        return new Integer(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (eg.c0.A(lg.d.f20063c, new qb.a(r12, r13, (java.lang.String) null, r15, (kotlin.coroutines.Continuation) null), r4) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (eg.c0.A(lg.d.f20063c, new qb.a(r12, r13, (java.lang.String) null, r15, (kotlin.coroutines.Continuation) null), r4) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, mf.c cVar) {
        b bVar;
        int i5;
        String str3;
        String str4;
        int intValue;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f25063f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f25063f = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f25061d;
                Object obj2 = lf.a.f20034a;
                i5 = bVar.f25063f;
                if (i5 != 0) {
                    h8.b.B(obj);
                    bVar.f25058a = str;
                    bVar.f25059b = str2;
                    bVar.f25063f = 1;
                    obj = a(str, null, str2, bVar);
                    if (obj != obj2) {
                        str3 = str;
                        str4 = str2;
                    }
                    return obj2;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        intValue = bVar.f25060c;
                        h8.b.B(obj);
                        da.r.b(401);
                        return new Integer(intValue);
                    }
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intValue = bVar.f25060c;
                    h8.b.B(obj);
                    return new Integer(intValue);
                }
                String str5 = bVar.f25059b;
                String str6 = bVar.f25058a;
                h8.b.B(obj);
                str4 = str5;
                str3 = str6;
                intValue = ((Number) obj).intValue();
                if (intValue == 200 && intValue != 204) {
                    int i11 = 21;
                    if (intValue != 401) {
                        s7.s sVar = new s7.s(i11);
                        bVar.f25058a = null;
                        bVar.f25059b = null;
                        bVar.f25060c = intValue;
                        bVar.f25063f = 3;
                        lg.e eVar = eg.m0.f9201a;
                    } else {
                        s7.s sVar2 = new s7.s(i11);
                        bVar.f25058a = null;
                        bVar.f25059b = null;
                        bVar.f25060c = intValue;
                        bVar.f25063f = 2;
                        lg.e eVar2 = eg.m0.f9201a;
                    }
                    return obj2;
                }
                Unit unit = Unit.f19194a;
                return new Integer(intValue);
            }
        }
        bVar = new b(this, cVar);
        Object obj3 = bVar.f25061d;
        Object obj22 = lf.a.f20034a;
        i5 = bVar.f25063f;
        if (i5 != 0) {
        }
        intValue = ((Number) obj3).intValue();
        if (intValue == 200) {
        }
        Unit unit2 = Unit.f19194a;
        return new Integer(intValue);
    }
}
