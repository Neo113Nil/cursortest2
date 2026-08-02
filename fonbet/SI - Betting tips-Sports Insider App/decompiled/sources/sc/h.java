package sc;

import android.os.Build;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.card.MaterialCardViewHelper;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.y;
import gf.t;
import j$.time.Instant;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import la.m;
import pd.v;
import rc.n;
import rc.r;
import s7.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final t f23451a = gf.k.b(new v(10));

    public static m a() {
        return (m) y3.m(m.class, null, 6);
    }

    public final r b() {
        return (r) this.f23451a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (r6.h(r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ha.a aVar, mf.c cVar) {
        d dVar;
        int i5;
        ha.a aVar2;
        u uVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f23436e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f23436e = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f23434c;
                lf.a aVar3 = lf.a.f20034a;
                i5 = dVar.f23436e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    u uVar2 = new u(15);
                    ha.d dVar2 = aVar.f10433c;
                    dVar.f23432a = aVar;
                    dVar.f23433b = uVar2;
                    dVar.f23436e = 1;
                    if (uVar2.i(dVar2, dVar) != aVar3) {
                        aVar2 = aVar;
                        uVar = uVar2;
                    }
                    return aVar3;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                uVar = dVar.f23433b;
                aVar2 = dVar.f23432a;
                h8.b.B(obj);
                ha.c cVar2 = aVar2.f10434d;
                dVar.f23432a = null;
                dVar.f23433b = null;
                dVar.f23436e = 2;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f23434c;
        lf.a aVar32 = lf.a.f20034a;
        i5 = dVar.f23436e;
        if (i5 != 0) {
        }
        ha.c cVar22 = aVar2.f10434d;
        dVar.f23432a = null;
        dVar.f23433b = null;
        dVar.f23436e = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0093, code lost:
    
        if (r0 == r7) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01c5, code lost:
    
        if (c(r11, r6) != r7) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ac A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #4 {all -> 0x01ec, blocks: (B:99:0x01a5, B:104:0x01ac), top: B:98:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e8 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x0039, B:25:0x004c, B:88:0x005b, B:123:0x0069, B:124:0x00e3, B:126:0x00e8, B:128:0x00f7, B:133:0x0104, B:136:0x0111, B:150:0x00cf), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f7 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x0039, B:25:0x004c, B:88:0x005b, B:123:0x0069, B:124:0x00e3, B:126:0x00e8, B:128:0x00f7, B:133:0x0104, B:136:0x0111, B:150:0x00cf), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0053  */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v1, types: [eg.a0, java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(mf.c cVar) {
        e eVar;
        int i5;
        int i10;
        int i11;
        long j;
        long j6;
        boolean booleanValue;
        boolean z5;
        ha.a aVar;
        long j10;
        long j11;
        boolean z7;
        boolean z10;
        ha.a aVar2;
        String str;
        Object A;
        boolean z11;
        long j12;
        long j13;
        try {
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i12 = eVar.f23443g;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    eVar.f23443g = i12 - Integer.MIN_VALUE;
                    e eVar2 = eVar;
                    Object obj = eVar2.f23441e;
                    lf.a aVar3 = lf.a.f20034a;
                    i5 = eVar2.f23443g;
                    int i13 = 1;
                    ?? r42 = 0;
                    r42 = 0;
                    r4 = null;
                    Object obj2 = null;
                    r42 = 0;
                    switch (i5) {
                        case 0:
                            h8.b.B(obj);
                            r b10 = b();
                            eVar2.f23443g = 1;
                            b10.getClass();
                            lg.e eVar3 = m0.f9201a;
                            obj = c0.A(lg.d.f20063c, new rc.m(b10, r42, i13), eVar2);
                            break;
                        case 1:
                            h8.b.B(obj);
                            long longValue = ((Number) obj).longValue();
                            long epochSecond = Instant.now().getEpochSecond();
                            eVar2.f23437a = longValue;
                            eVar2.f23438b = epochSecond;
                            eVar2.f23443g = 2;
                            obj = e(eVar2);
                            if (obj != aVar3) {
                                j = longValue;
                                j6 = epochSecond;
                                booleanValue = ((Boolean) obj).booleanValue();
                                if (!booleanValue && j > j6) {
                                    return new Pair(new Integer(204), null);
                                }
                                m a7 = a();
                                eVar2.f23437a = j;
                                eVar2.f23438b = j6;
                                eVar2.f23439c = booleanValue;
                                eVar2.f23443g = 3;
                                obj = a7.a(eVar2);
                                z5 = booleanValue;
                                if (obj == aVar3) {
                                }
                                aVar = (ha.a) obj;
                                if (aVar == null) {
                                    return new Pair(new Integer(400), "Result Null");
                                }
                                int i14 = aVar.f10431a;
                                if ((400 > i14 || i14 >= 600) && i14 >= 0) {
                                    m a10 = a();
                                    eVar2.f23440d = aVar;
                                    eVar2.f23437a = j;
                                    eVar2.f23438b = j6;
                                    eVar2.f23439c = z5;
                                    eVar2.f23443g = 4;
                                    a10.getClass();
                                    fb.b bVar = new fb.b();
                                    lg.e eVar4 = m0.f9201a;
                                    try {
                                        obj = c0.A(lg.d.f20063c, new ab.a(bVar, r42, 0), eVar2);
                                        if (obj != aVar3) {
                                            long j14 = j;
                                            j10 = j6;
                                            j11 = j14;
                                            z7 = z5;
                                            z10 = z7;
                                            aVar2 = aVar;
                                            try {
                                                str = (String) obj;
                                                if (str != null) {
                                                    try {
                                                        io.sentry.hints.j jVar = new io.sentry.hints.j(6);
                                                        jg.d dVar = MyApp.f6830c;
                                                        c0.t(dVar, new y("AppsFlyerUseCase"), null, new cd.c(jVar, str, r42, i13), 2);
                                                        ha.d dVar2 = aVar2.f10433c;
                                                        if (Build.VERSION.SDK_INT >= 25) {
                                                            c0.t(dVar, null, null, new ge.f(this, str, dVar2, (Continuation) r42, 14), 3);
                                                        }
                                                    } catch (Throwable th2) {
                                                        ex = th2;
                                                        z5 = z10;
                                                        i10 = 204;
                                                        i11 = z5;
                                                        if (!(ex instanceof UnknownHostException)) {
                                                        }
                                                    }
                                                }
                                                r b11 = b();
                                                long j15 = MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION + j10;
                                                eVar2.f23440d = aVar2;
                                                eVar2.f23437a = j11;
                                                eVar2.f23438b = j10;
                                                eVar2.f23439c = z10;
                                                eVar2.f23443g = 5;
                                                b11.getClass();
                                                lg.e eVar5 = m0.f9201a;
                                                long j16 = j11;
                                                long j17 = j10;
                                                i10 = 204;
                                                try {
                                                    try {
                                                        A = c0.A(lg.d.f20063c, new n(b11, j15, r42, 0), eVar2);
                                                        if ((A != aVar3 ? A : Unit.f19194a) != aVar3) {
                                                            z11 = z10;
                                                            j12 = j16;
                                                            j13 = j17;
                                                            try {
                                                                eVar2.f23440d = aVar2;
                                                                eVar2.f23437a = j12;
                                                                eVar2.f23438b = j13;
                                                                eVar2.f23439c = z11;
                                                                eVar2.f23443g = 6;
                                                                break;
                                                            } catch (Throwable th3) {
                                                                ex = th3;
                                                                i11 = z11;
                                                                if (!(ex instanceof UnknownHostException)) {
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        ex = th4;
                                                        i11 = z10;
                                                        r42 = obj2;
                                                        if (!(ex instanceof UnknownHostException)) {
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    ex = th5;
                                                    obj2 = null;
                                                }
                                            } catch (Throwable th6) {
                                                ex = th6;
                                                i10 = 204;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        ex = th7;
                                        i10 = 204;
                                        i11 = z5;
                                        if (!(ex instanceof UnknownHostException)) {
                                            return new Pair(new Integer(i11 != 0 ? i10 : 604), "Network error");
                                        }
                                        int i15 = 18;
                                        if (ex instanceof CancellationException) {
                                            Intrinsics.checkNotNullParameter(ex, "ex");
                                            jg.d dVar3 = MyApp.f6830c;
                                            lg.e eVar6 = m0.f9201a;
                                            c0.t(dVar3, lg.d.f20063c, r42, new q4.r(ex, r42, i15), 2);
                                            return new Pair(new Integer(603), "Cancellation exception");
                                        }
                                        if (ex instanceof SocketTimeoutException) {
                                            Intrinsics.checkNotNullParameter(ex, "ex");
                                            jg.d dVar4 = MyApp.f6830c;
                                            lg.e eVar7 = m0.f9201a;
                                            c0.t(dVar4, lg.d.f20063c, r42, new q4.r(ex, r42, i15), 2);
                                            return new Pair(new Integer(i11 != 0 ? i10 : 605), "Network error SocketTimeoutException");
                                        }
                                        if (ex instanceof SocketException) {
                                            zc.d.b(6, r42, ex);
                                            return new Pair(new Integer(i11 != 0 ? i10 : 607), "Network error SocketException");
                                        }
                                        if (ex instanceof SSLHandshakeException) {
                                            zc.d.b(6, r42, ex);
                                            return new Pair(new Integer(606), "Network error SSLHandshakeException");
                                        }
                                        if (ex instanceof SSLException) {
                                            zc.d.b(6, r42, ex);
                                            return new Pair(new Integer(i11 != 0 ? i10 : 608), "Network error SSLException");
                                        }
                                        if (ex instanceof IOException) {
                                            zc.d.b(4, "Identify", ex);
                                            return new Pair(new Integer(i11 != 0 ? i10 : 601), "Network error IOException");
                                        }
                                        zc.d.b(6, r42, ex);
                                        return new Pair(new Integer(i11 != 0 ? i10 : 602), ex.getMessage());
                                    }
                                }
                                return new Pair(new Integer(i14), aVar.f10432b);
                            }
                            return aVar3;
                        case 2:
                            j6 = eVar2.f23438b;
                            j = eVar2.f23437a;
                            h8.b.B(obj);
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (!booleanValue) {
                                break;
                            }
                            m a72 = a();
                            eVar2.f23437a = j;
                            eVar2.f23438b = j6;
                            eVar2.f23439c = booleanValue;
                            eVar2.f23443g = 3;
                            obj = a72.a(eVar2);
                            z5 = booleanValue;
                            if (obj == aVar3) {
                            }
                            aVar = (ha.a) obj;
                            if (aVar == null) {
                            }
                            break;
                        case 3:
                            boolean z12 = eVar2.f23439c;
                            j6 = eVar2.f23438b;
                            j = eVar2.f23437a;
                            h8.b.B(obj);
                            z5 = z12;
                            aVar = (ha.a) obj;
                            if (aVar == null) {
                            }
                            break;
                        case 4:
                            boolean z13 = eVar2.f23439c;
                            j10 = eVar2.f23438b;
                            long j18 = eVar2.f23437a;
                            aVar = eVar2.f23440d;
                            h8.b.B(obj);
                            j11 = j18;
                            z7 = z13;
                            z10 = z7;
                            aVar2 = aVar;
                            str = (String) obj;
                            if (str != null) {
                            }
                            r b112 = b();
                            long j152 = MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION + j10;
                            eVar2.f23440d = aVar2;
                            eVar2.f23437a = j11;
                            eVar2.f23438b = j10;
                            eVar2.f23439c = z10;
                            eVar2.f23443g = 5;
                            b112.getClass();
                            lg.e eVar52 = m0.f9201a;
                            long j162 = j11;
                            long j172 = j10;
                            i10 = 204;
                            A = c0.A(lg.d.f20063c, new n(b112, j152, r42, 0), eVar2);
                            if ((A != aVar3 ? A : Unit.f19194a) != aVar3) {
                            }
                            return aVar3;
                        case 5:
                            boolean z14 = eVar2.f23439c;
                            j13 = eVar2.f23438b;
                            j12 = eVar2.f23437a;
                            ha.a aVar4 = eVar2.f23440d;
                            h8.b.B(obj);
                            aVar2 = aVar4;
                            i10 = 204;
                            z11 = z14;
                            eVar2.f23440d = aVar2;
                            eVar2.f23437a = j12;
                            eVar2.f23438b = j13;
                            eVar2.f23439c = z11;
                            eVar2.f23443g = 6;
                            break;
                        case 6:
                            boolean z15 = eVar2.f23439c;
                            ha.a aVar5 = eVar2.f23440d;
                            h8.b.B(obj);
                            aVar2 = aVar5;
                            int i16 = aVar2.f10431a;
                            return (200 > i16 || i16 >= 400) ? new Pair(new Integer(i16), aVar2.f10432b) : new Pair(new Integer(i16), null);
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (i5) {
            }
        } catch (Throwable th8) {
            ex = th8;
            i10 = 204;
            i11 = i5;
        }
        eVar = new e(this, cVar);
        e eVar22 = eVar;
        Object obj3 = eVar22.f23441e;
        lf.a aVar32 = lf.a.f20034a;
        i5 = eVar22.f23443g;
        int i132 = 1;
        ?? r422 = 0;
        r422 = 0;
        obj2 = null;
        Object obj22 = null;
        r422 = 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(1:13)|20|15|16|17))|28|6|7|(0)(0)|11|(0)|20|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r7.length() == 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: Exception -> 0x005a, TRY_LEAVE, TryCatch #0 {Exception -> 0x005a, blocks: (B:10:0x0024, B:11:0x004e, B:13:0x0052, B:24:0x0033), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mf.c cVar) {
        f fVar;
        int i5;
        CharSequence charSequence;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f23446c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f23446c = i10 - Integer.MIN_VALUE;
                Object obj = fVar.f23444a;
                lf.a aVar = lf.a.f20034a;
                i5 = fVar.f23446c;
                boolean z5 = false;
                if (i5 != 0) {
                    h8.b.B(obj);
                    fVar.f23446c = 1;
                    ((la.a) y3.m(la.a.class, null, 6)).getClass();
                    obj = new bb.b().C0(fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                charSequence = (CharSequence) obj;
                if (charSequence != null) {
                }
                z5 = true;
                z5 = !z5;
                return Boolean.valueOf(z5);
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f23444a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = fVar.f23446c;
        boolean z52 = false;
        if (i5 != 0) {
        }
        charSequence = (CharSequence) obj2;
        if (charSequence != null) {
        }
        z52 = true;
        z52 = !z52;
        return Boolean.valueOf(z52);
    }
}
