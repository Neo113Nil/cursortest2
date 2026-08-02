package la;

import com.google.android.gms.internal.measurement.y3;
import java.io.IOException;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static ga.b f19427a;

    /* renamed from: b, reason: collision with root package name */
    public static long f19428b;

    public static void b(Exception exc) {
        if ((exc instanceof CancellationException) || (exc instanceof nh.a) || (exc instanceof nh.d0) || (exc instanceof ConnectException) || (exc instanceof SocketException) || (exc instanceof SSLPeerUnverifiedException) || (exc instanceof SSLHandshakeException) || (exc instanceof SSLException) || (exc instanceof TimeoutException) || (exc instanceof SocketTimeoutException) || (exc instanceof UnknownHostException) || (exc instanceof IOException)) {
            return;
        }
        zc.d.b(6, null, exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(mf.c cVar) {
        v0 v0Var;
        int i5;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i10 = v0Var.f19603c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                v0Var.f19603c = i10 - Integer.MIN_VALUE;
                Object obj = v0Var.f19601a;
                lf.a aVar = lf.a.f20034a;
                i5 = v0Var.f19603c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    v0Var.f19603c = 1;
                    obj = ((fa.a) y3.m(fa.a.class, null, 6)).a("rate");
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                String str = (String) obj;
                return new Pair(new Integer(str != null ? 404 : 200), str);
            }
        }
        v0Var = new v0(this, cVar);
        Object obj2 = v0Var.f19601a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = v0Var.f19603c;
        if (i5 != 0) {
        }
        String str2 = (String) obj2;
        return new Pair(new Integer(str2 != null ? 404 : 200), str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (kotlin.Unit.f19194a == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (kotlin.Unit.f19194a == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (kotlin.Unit.f19194a == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i5, mf.c cVar) {
        w0 w0Var;
        int i10;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i11 = w0Var.f19607d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w0Var.f19607d = i11 - Integer.MIN_VALUE;
                Object obj = w0Var.f19605b;
                lf.a aVar = lf.a.f20034a;
                i10 = w0Var.f19607d;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 == 404) {
                        w0Var.f19604a = i5;
                        w0Var.f19607d = 1;
                        ((fa.a) y3.m(fa.a.class, null, 6)).d("rate", null);
                    } else {
                        if (i5 == 400 || (i5 != 200 && (400 > i5 || i5 >= 600))) {
                            return Unit.f19194a;
                        }
                        w0Var.f19604a = i5;
                        w0Var.f19607d = 3;
                        ((fa.a) y3.m(fa.a.class, null, 6)).c(System.currentTimeMillis() + 600000, "rating");
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                i5 = w0Var.f19604a;
                h8.b.B(obj);
                w0Var.f19604a = i5;
                w0Var.f19607d = 2;
                ((fa.a) y3.m(fa.a.class, null, 6)).c(System.currentTimeMillis() + 600000, "rating");
            }
        }
        w0Var = new w0(this, cVar);
        Object obj2 = w0Var.f19605b;
        lf.a aVar2 = lf.a.f20034a;
        i10 = w0Var.f19607d;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(1:(1:(5:13|14|15|16|17)(2:20|21))(7:22|23|24|25|26|(2:29|30)|28))(2:36|37))(3:48|(1:50)(1:57)|(1:52)(3:53|54|(2:56|32)))|38|39|(4:41|42|(4:44|25|26|(0))|32)|28))|60|6|7|8|(0)(0)|38|39|(0)|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (r0 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
    
        r0 = r3;
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mf.c cVar) {
        x0 x0Var;
        ?? r32;
        String str;
        String str2;
        Object A;
        String str3;
        String str4;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i5 = x0Var.f19618e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                x0Var.f19618e = i5 - Integer.MIN_VALUE;
                x0 x0Var2 = x0Var;
                Object obj = x0Var2.f19616c;
                lf.a aVar = lf.a.f20034a;
                r32 = x0Var2.f19618e;
                ga.b bVar = null;
                boolean z5 = false;
                if (r32 != 0) {
                    h8.b.B(obj);
                    ga.b bVar2 = System.currentTimeMillis() > f19428b + ((long) 300000) ? null : f19427a;
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    String str5 = gc.d.f9945a;
                    String c2 = d2.i.c();
                    fb.b bVar3 = new fb.b();
                    x0Var2.f19614a = c2;
                    x0Var2.f19618e = 1;
                    obj = bVar3.C0(x0Var2);
                    r32 = c2;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (r32 != 1) {
                        if (r32 != 2) {
                            if (r32 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            bVar = (ga.b) obj;
                            f19427a = bVar;
                            f19428b = System.currentTimeMillis();
                            return bVar;
                        }
                        str = x0Var2.f19615b;
                        str2 = x0Var2.f19614a;
                        try {
                            h8.b.B(obj);
                            str3 = str2;
                            str4 = (String) obj;
                        } catch (Exception unused) {
                            str3 = str2;
                            str4 = null;
                            if (str4 != null) {
                            }
                            return null;
                        }
                        if (str4 != null) {
                            String str6 = gc.d.f9945a;
                            String d10 = d2.i.d();
                            String str7 = str;
                            ua.f fVar = new ua.f();
                            x0Var2.f19614a = null;
                            x0Var2.f19615b = null;
                            x0Var2.f19618e = 3;
                            obj = fVar.r0(str7, str4, str3, d10, x0Var2);
                        }
                        return null;
                    }
                    String str8 = x0Var2.f19614a;
                    h8.b.B(obj);
                    r32 = str8;
                }
                String str9 = r32;
                str = (String) obj;
                String str10 = str9;
                if (str != null) {
                    try {
                        fb.b bVar4 = new fb.b();
                        x0Var2.f19614a = str10;
                        x0Var2.f19615b = str;
                        x0Var2.f19618e = 2;
                        lg.e eVar = eg.m0.f9201a;
                        A = eg.c0.A(lg.d.f20063c, new ab.a(bVar4, z5 ? 1 : 0, 0), x0Var2);
                    } catch (Exception unused2) {
                        str2 = str10;
                        str3 = str2;
                        str4 = null;
                        if (str4 != null) {
                        }
                        return null;
                    }
                    if (A != aVar) {
                        str2 = str10;
                        obj = A;
                        str3 = str2;
                        str4 = (String) obj;
                        if (str4 != null) {
                        }
                    }
                    return aVar;
                }
                return null;
            }
        }
        x0Var = new x0(this, cVar);
        x0 x0Var22 = x0Var;
        Object obj2 = x0Var22.f19616c;
        lf.a aVar2 = lf.a.f20034a;
        r32 = x0Var22.f19618e;
        ga.b bVar5 = null;
        boolean z52 = false;
        if (r32 != 0) {
        }
        String str92 = r32;
        str = (String) obj2;
        String str102 = str92;
        if (str != null) {
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:42|(2:43|44)|(1:46)(6:55|(1:57)|58|48|49|(5:51|24|(1:26)|28|(4:30|16|17|(0)(1:20))))|47|48|49|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|9))|79|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014d, code lost:
    
        r12 = r0;
        r1 = r3;
        r3 = r2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008e, code lost:
    
        if (r12 == r8) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00eb, code lost:
    
        r2 = null;
        r0 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0147 A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #3 {Exception -> 0x0057, blocks: (B:23:0x0052, B:24:0x0143, B:26:0x0147), top: B:22:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006a  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r11v0, types: [la.c1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mf.c cVar) {
        y0 y0Var;
        int i5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        l0.i iVar;
        String displayCountry;
        int i10;
        y0 y0Var2;
        String str7;
        int i11;
        Integer num;
        Serializable f6;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i12 = y0Var.f19630h;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                y0Var.f19630h = i12 - Integer.MIN_VALUE;
                y0 y0Var3 = y0Var;
                Object obj = y0Var3.f19628f;
                lf.a aVar = lf.a.f20034a;
                i5 = y0Var3.f19630h;
                int i13 = 400;
                switch (i5) {
                    case 0:
                        h8.b.B(obj);
                        y0Var3.f19630h = 1;
                        fa.a aVar2 = (fa.a) y3.m(fa.a.class, null, 6);
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter("rating", "key");
                        obj = new Long(aVar2.f9542b.getLong("rating", 0L));
                        break;
                    case 1:
                        h8.b.B(obj);
                        if (((Number) obj).longValue() > System.currentTimeMillis()) {
                            y0Var3.f19630h = 2;
                            Serializable a7 = a(y0Var3);
                            if (a7 != aVar) {
                                return a7;
                            }
                        } else {
                            String str8 = gc.d.f9945a;
                            ?? c2 = d2.i.c();
                            String c8 = d2.i.c();
                            String language = zc.f.f25915f.getLanguage();
                            Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
                            if (!StringsKt.A(c8, language, true)) {
                                return new Pair(new Integer(404), null);
                            }
                            fb.b bVar = new fb.b();
                            y0Var3.f19623a = c2;
                            y0Var3.f19630h = 3;
                            obj = bVar.C0(y0Var3);
                            i5 = c2;
                            if (obj == aVar) {
                            }
                            str = (String) obj;
                            ?? r02 = i5;
                            str2 = r02;
                            if (str != null) {
                                return new Pair(new Integer(401), "Internal error access");
                            }
                            String str9 = gc.d.f9945a;
                            String d10 = d2.i.d();
                            Locale locale = zc.f.f25910a;
                            try {
                                iVar = zc.f.d().f19306a;
                            } catch (Exception unused) {
                            }
                            if (iVar.isEmpty()) {
                                displayCountry = Locale.getDefault().getDisplayCountry(locale);
                            } else {
                                Locale locale2 = iVar.get(0);
                                if (locale2 != null) {
                                    displayCountry = locale2.getDisplayCountry(locale);
                                }
                                str3 = null;
                                ua.f fVar = new ua.f();
                                y0Var3.f19623a = str2;
                                y0Var3.f19624b = str;
                                y0Var3.f19625c = d10;
                                y0Var3.f19626d = str3;
                                y0Var3.f19630h = 4;
                                obj = fVar.q0(str, str3, str2, d10, y0Var3);
                                if (obj != aVar) {
                                    str4 = str3;
                                    str5 = str;
                                    str6 = d10;
                                    num = (Integer) obj;
                                    if (num != null) {
                                        i13 = num.intValue();
                                    }
                                    y0Var3.f19623a = str2;
                                    y0Var3.f19624b = str5;
                                    y0Var3.f19625c = str6;
                                    y0Var3.f19626d = str4;
                                    y0Var3.f19627e = i13;
                                    y0Var3.f19630h = 5;
                                    if (c(i13, y0Var3) != aVar) {
                                        i10 = 6;
                                        y0Var2 = y0Var3;
                                        str7 = str6;
                                        i11 = i13;
                                        String str10 = str2;
                                        String str11 = str5;
                                        String str12 = str4;
                                        y0Var2.f19623a = null;
                                        y0Var2.f19624b = null;
                                        y0Var2.f19625c = null;
                                        y0Var2.f19626d = null;
                                        y0Var2.f19627e = i11;
                                        y0Var2.f19630h = i10;
                                        f6 = f(i11, str12, str11, str10, str7, y0Var2);
                                        if (f6 != aVar) {
                                            return f6;
                                        }
                                    }
                                }
                            }
                            str3 = displayCountry;
                            ua.f fVar2 = new ua.f();
                            y0Var3.f19623a = str2;
                            y0Var3.f19624b = str;
                            y0Var3.f19625c = d10;
                            y0Var3.f19626d = str3;
                            y0Var3.f19630h = 4;
                            obj = fVar2.q0(str, str3, str2, d10, y0Var3);
                            if (obj != aVar) {
                            }
                        }
                        return aVar;
                    case 2:
                        h8.b.B(obj);
                        return obj;
                    case 3:
                        ?? r03 = y0Var3.f19623a;
                        h8.b.B(obj);
                        i5 = r03;
                        str = (String) obj;
                        ?? r022 = i5;
                        str2 = r022;
                        if (str != null) {
                        }
                        break;
                    case 4:
                        str4 = y0Var3.f19626d;
                        str6 = y0Var3.f19625c;
                        str5 = y0Var3.f19624b;
                        str2 = y0Var3.f19623a;
                        try {
                            h8.b.B(obj);
                            num = (Integer) obj;
                            if (num != null) {
                            }
                        } catch (Exception e7) {
                            Exception exc = e7;
                            b(exc);
                            y0Var3.f19623a = str2;
                            y0Var3.f19624b = str5;
                            y0Var3.f19625c = str6;
                            y0Var3.f19626d = str4;
                            y0Var3.f19627e = i13;
                            y0Var3.f19630h = 5;
                            if (c(i13, y0Var3) != aVar) {
                            }
                            return aVar;
                        }
                        y0Var3.f19623a = str2;
                        y0Var3.f19624b = str5;
                        y0Var3.f19625c = str6;
                        y0Var3.f19626d = str4;
                        y0Var3.f19627e = i13;
                        y0Var3.f19630h = 5;
                        if (c(i13, y0Var3) != aVar) {
                        }
                        return aVar;
                    case 5:
                        int i14 = y0Var3.f19627e;
                        str4 = y0Var3.f19626d;
                        String str13 = y0Var3.f19625c;
                        str5 = y0Var3.f19624b;
                        str2 = y0Var3.f19623a;
                        h8.b.B(obj);
                        i10 = 6;
                        y0Var2 = y0Var3;
                        str7 = str13;
                        i11 = i14;
                        String str102 = str2;
                        String str112 = str5;
                        String str122 = str4;
                        y0Var2.f19623a = null;
                        y0Var2.f19624b = null;
                        y0Var2.f19625c = null;
                        y0Var2.f19626d = null;
                        y0Var2.f19627e = i11;
                        y0Var2.f19630h = i10;
                        f6 = f(i11, str122, str112, str102, str7, y0Var2);
                        if (f6 != aVar) {
                            return aVar;
                        }
                        break;
                    case 6:
                        h8.b.B(obj);
                        return obj;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        y0Var = new y0(this, cVar);
        y0 y0Var32 = y0Var;
        Object obj2 = y0Var32.f19628f;
        lf.a aVar3 = lf.a.f20034a;
        i5 = y0Var32.f19630h;
        int i132 = 400;
        switch (i5) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(1:(1:(1:(1:(3:15|16|17)(2:19|20))(5:21|22|23|24|25))(5:26|27|28|29|30))(3:31|32|33))(3:34|35|36))(2:51|(5:53|54|55|56|(2:58|44))(2:63|64))|37|38|(1:(4:41|(1:43)|24|25)(4:45|(1:47)|29|30))(2:48|(0)(1:50))|44))|67|6|7|8|(0)(0)|37|38|(0)(0)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        if (r0 != r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0054, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0055, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1 A[Catch: Exception -> 0x00b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:24:0x00ad, B:29:0x00c6, B:37:0x008d, B:41:0x00a0, B:45:0x00b2, B:48:0x00d1, B:56:0x0086), top: B:55:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v5, types: [gi.a, java.lang.String, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(int i5, String str, String str2, String str3, String str4, mf.c cVar) {
        z0 z0Var;
        int i10;
        ?? r11;
        int intValue;
        Object obj;
        int i11 = i5;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i12 = z0Var.f19639e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                z0Var.f19639e = i12 - Integer.MIN_VALUE;
                z0 z0Var2 = z0Var;
                Object obj2 = z0Var2.f19637c;
                lf.a aVar = lf.a.f20034a;
                i10 = z0Var2.f19639e;
                if (i10 != 0) {
                    h8.b.B(obj2);
                    if (i11 != 200) {
                        return new Pair(new Integer(404), null);
                    }
                    ua.f fVar = new ua.f();
                    z0Var2.f19635a = i11;
                    z0Var2.f19639e = 1;
                    Pair pair = null;
                    try {
                        obj2 = fVar.s0(str2, str, str3, str4, z0Var2);
                        r11 = pair;
                    } catch (Exception e7) {
                        e = e7;
                        Pair pair2 = pair;
                        b(e);
                        z0Var2.f19636b = pair2;
                        z0Var2.f19635a = i11;
                        z0Var2.f19639e = 5;
                        obj2 = a(z0Var2);
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int i13 = z0Var2.f19635a;
                            Pair pair3 = z0Var2.f19636b;
                            h8.b.B(obj2);
                            return pair3;
                        }
                        if (i10 == 3) {
                            int i14 = z0Var2.f19635a;
                            h8.b.B(obj2);
                            obj = null;
                            return new Pair(new Integer(404), obj);
                        }
                        if (i10 == 4) {
                            int i15 = z0Var2.f19635a;
                            h8.b.B(obj2);
                            return (Pair) obj2;
                        }
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj2);
                        return (Pair) obj2;
                    }
                    i11 = z0Var2.f19635a;
                    h8.b.B(obj2);
                    r11 = 0;
                }
                Pair pair4 = (Pair) obj2;
                intValue = ((Number) pair4.f19192a).intValue();
                if (intValue == 200) {
                    if (intValue != 404) {
                        z0Var2.f19636b = r11;
                        z0Var2.f19635a = i11;
                        z0Var2.f19639e = 4;
                        obj2 = a(z0Var2);
                        if (obj2 == aVar) {
                        }
                        return (Pair) obj2;
                    }
                    z0Var2.f19636b = r11;
                    z0Var2.f19635a = i11;
                    z0Var2.f19639e = 3;
                    ((fa.a) y3.m(fa.a.class, r11, 6)).d("rate", r11);
                    obj = r11;
                    if (Unit.f19194a == aVar) {
                    }
                    return new Pair(new Integer(404), obj);
                }
                String str5 = (String) pair4.f19193b;
                z0Var2.f19636b = pair4;
                z0Var2.f19635a = i11;
                z0Var2.f19639e = 2;
                ((fa.a) y3.m(fa.a.class, r11, 6)).d("rate", str5);
                if (Unit.f19194a != aVar) {
                    return pair4;
                }
                return aVar;
            }
        }
        z0Var = new z0(this, cVar);
        z0 z0Var22 = z0Var;
        Object obj22 = z0Var22.f19637c;
        lf.a aVar2 = lf.a.f20034a;
        i10 = z0Var22.f19639e;
        if (i10 != 0) {
        }
        Pair pair42 = (Pair) obj22;
        intValue = ((Number) pair42.f19192a).intValue();
        if (intValue == 200) {
        }
        return aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:26|27|(2:29|25))|19|(2:21|22)(1:23)))|31|6|7|(0)(0)|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r2.t0(r6, r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:11:0x0026, B:18:0x0034, B:19:0x004b, B:21:0x004f, B:23:0x0052, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:11:0x0026, B:18:0x0034, B:19:0x004b, B:21:0x004f, B:23:0x0052, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i5, mf.c cVar) {
        a1 a1Var;
        int i10;
        String str;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i11 = a1Var.f19416d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a1Var.f19416d = i11 - Integer.MIN_VALUE;
                Object obj = a1Var.f19414b;
                lf.a aVar = lf.a.f20034a;
                i10 = a1Var.f19416d;
                if (i10 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    a1Var.f19413a = i5;
                    a1Var.f19416d = 1;
                    obj = bVar.C0(a1Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    i5 = a1Var.f19413a;
                    h8.b.B(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return Unit.f19194a;
                }
                ua.f fVar = new ua.f();
                a1Var.f19413a = i5;
                a1Var.f19416d = 2;
            }
        }
        a1Var = new a1(this, cVar);
        Object obj2 = a1Var.f19414b;
        lf.a aVar2 = lf.a.f20034a;
        i10 = a1Var.f19416d;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:26|27|(2:29|25))|19|(2:21|22)(1:23)))|31|6|7|(0)(0)|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r2.u0(r6, r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:11:0x0026, B:18:0x0034, B:19:0x004b, B:21:0x004f, B:23:0x0052, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:11:0x0026, B:18:0x0034, B:19:0x004b, B:21:0x004f, B:23:0x0052, B:27:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i5, mf.c cVar) {
        b1 b1Var;
        int i10;
        String str;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i11 = b1Var.f19423d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b1Var.f19423d = i11 - Integer.MIN_VALUE;
                Object obj = b1Var.f19421b;
                lf.a aVar = lf.a.f20034a;
                i10 = b1Var.f19423d;
                if (i10 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    b1Var.f19420a = i5;
                    b1Var.f19423d = 1;
                    obj = bVar.C0(b1Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    i5 = b1Var.f19420a;
                    h8.b.B(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return Unit.f19194a;
                }
                ua.f fVar = new ua.f();
                b1Var.f19420a = i5;
                b1Var.f19423d = 2;
            }
        }
        b1Var = new b1(this, cVar);
        Object obj2 = b1Var.f19421b;
        lf.a aVar2 = lf.a.f20034a;
        i10 = b1Var.f19423d;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }
}
