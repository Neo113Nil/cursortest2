package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.closed_captions.models.dto.ClosedCaptionsDto;
import com.blaze.blazesdk.closed_captions.models.dto.ClosedCaptionsFileDto;
import com.blaze.blazesdk.closed_captions.models.ui.b;
import com.blaze.blazesdk.closed_captions.models.ui.d;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class d2a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static byte[] A(byte[] bArr, UUID uuid) {
        axn z = z(bArr);
        if (z == null) {
            return null;
        }
        UUID uuid2 = (UUID) z.b;
        if (uuid.equals(uuid2)) {
            return (byte[]) z.c;
        }
        tgj.d0("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static final void C(dh0 dh0Var, Function1 function1) {
        dh0 dh0Var2 = new dh0(999);
        int i = dh0Var.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            dh0Var2.put(dh0Var.g(i2), dh0Var.k(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                function1.invoke(dh0Var2);
                dh0Var2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            function1.invoke(dh0Var2);
        }
    }

    public static final h4d D(tee teeVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        u6b u6bVar = (u6b) av8Var.k(mhb.a);
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = hz8.G(g.a, av8Var);
            av8Var.n0(O);
        }
        ku3 ku3Var = (ku3) O;
        boolean g = ((((i & 14) ^ 6) > 4 && av8Var.g(teeVar)) || (i & 6) == 4) | av8Var.g(u6bVar) | av8Var.g(ku3Var);
        Object O2 = av8Var.O();
        if (g || O2 == a99Var) {
            O2 = new h4d(u6bVar, ku3Var, teeVar);
            av8Var.n0(O2);
        }
        h4d h4dVar = (h4d) O2;
        boolean g2 = av8Var.g(h4dVar);
        Object O3 = av8Var.O();
        if (g2 || O3 == a99Var) {
            O3 = new mnc(h4dVar, 12);
            av8Var.n0(O3);
        }
        hz8.d(h4dVar, (Function1) O3, av8Var);
        return h4dVar;
    }

    public static xtc E(xtc xtcVar, float f, uah uahVar, boolean z, long j, int i) {
        if ((i & 2) != 0) {
            uahVar = oyn.e;
        }
        uah uahVar2 = uahVar;
        if ((i & 4) != 0) {
            z = p75.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 0;
        }
        boolean z2 = z;
        long j2 = r29.a;
        return (p75.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 0 || z2) ? xtcVar.z(new rah(f, uahVar2, z2, j2, (i & 16) != 0 ? j2 : j)) : xtcVar;
    }

    public static ArrayList F(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b2 = asReadOnlyBuffer.get();
                int i = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b2 >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b3 = asReadOnlyBuffer.get();
                        remaining |= (b3 & Byte.MAX_VALUE) << (i2 * 7);
                        if ((b3 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new xkd(i, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static final void G(b80 b80Var, d80 d80Var) {
        ((eoh) d80Var.b).setValue(((eoh) b80Var.e).getValue());
        j80 j80Var = d80Var.c;
        j80 j80Var2 = b80Var.f;
        int b2 = j80Var.b();
        for (int i = 0; i < b2; i++) {
            j80Var.e(j80Var2.a(i), i);
        }
        d80Var.e = b80Var.h;
        d80Var.d = b80Var.g;
        d80Var.f = ((Boolean) ((eoh) b80Var.i).getValue()).booleanValue();
    }

    public static final Object H(Function1 function1, sq3 sq3Var) {
        if (sq3Var.getContext().get(mx9.d) == null) {
            return bea.y(sq3Var.getContext()).p(function1, sq3Var);
        }
        pvd.j();
        return null;
    }

    public static int I(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int J(Object obj) {
        return I(obj == null ? 0 : obj.hashCode());
    }

    public static final void K(g8n g8nVar, ArrayDeque arrayDeque) {
        if (!g8nVar.t()) {
            if (!(g8nVar instanceof ocn)) {
                a70.p("Has a new type of ByteString been created? Found ".concat(String.valueOf(g8nVar.getClass())));
                return;
            }
            ocn ocnVar = (ocn) g8nVar;
            K(ocnVar.d, arrayDeque);
            K(ocnVar.e, arrayDeque);
            return;
        }
        int binarySearch = Arrays.binarySearch(ocn.h, g8nVar.d());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int A = ocn.A(binarySearch + 1);
        if (arrayDeque.isEmpty() || ((g8n) arrayDeque.peek()).d() >= A) {
            arrayDeque.push(g8nVar);
            return;
        }
        int A2 = ocn.A(binarySearch);
        g8n g8nVar2 = (g8n) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((g8n) arrayDeque.peek()).d() < A2) {
            g8nVar2 = new ocn((g8n) arrayDeque.pop(), g8nVar2);
        }
        ocn ocnVar2 = new ocn(g8nVar2, g8nVar);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(ocn.h, ocnVar2.c);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((g8n) arrayDeque.peek()).d() >= ocn.A(binarySearch2 + 1)) {
                break;
            } else {
                ocnVar2 = new ocn((g8n) arrayDeque.pop(), ocnVar2);
            }
        }
        arrayDeque.push(ocnVar2);
    }

    public static final fq5 a(nt9 nt9Var, Throwable th) {
        nr9 nr9Var;
        if (th instanceof pid) {
            Function1 function1 = nt9Var.r;
            jt9 jt9Var = nt9Var.x;
            nr9Var = (nr9) function1.invoke(nt9Var);
            if (nr9Var == null) {
                nr9Var = (nr9) jt9Var.j.invoke(nt9Var);
            }
            if (nr9Var == null && (nr9Var = (nr9) nt9Var.q.invoke(nt9Var)) == null) {
                nr9Var = (nr9) jt9Var.i.invoke(nt9Var);
            }
        } else {
            nr9Var = (nr9) nt9Var.q.invoke(nt9Var);
            if (nr9Var == null) {
                nr9Var = (nr9) nt9Var.x.i.invoke(nt9Var);
            }
        }
        return new fq5(nr9Var, nt9Var, th);
    }

    public static final long b(int i) {
        long j = i << 32;
        int i2 = qia.O;
        return j;
    }

    public static final void c(int i, of3 of3Var, xtc xtcVar, String str) {
        av8 av8Var;
        xtc xtcVar2;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2082601352);
        int i2 = (av8Var2.g(str) ? 4 : 2) | i | 48;
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            yf8 yf8Var = xth.a;
            dfj b2 = xth.b();
            long D = lz.D(R.color.n_lv_3, av8Var2);
            utc utcVar = utc.a;
            av8Var = av8Var2;
            udj.c(str, l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), D, null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 1, 0, null, b2, av8Var, i2 & 14, 24960, 109560);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x81(str, xtcVar2, i, 6);
        }
    }

    public static final void d(n2e n2eVar, Function0 function0, of3 of3Var, int i) {
        n2eVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-490496988);
        int i2 = i | (av8Var.g(n2eVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = jxa.z;
                av8Var.n0(O2);
            }
            xtc c0 = l98.c0(tol.y(d2, true, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 21), av8Var, 0), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String str = n2eVar.f;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
            td4.y(n2eVar.a, 48, 12, av8Var, bkh.l(utcVar, 40.0f), null, false);
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            udj.c(n2eVar.b, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            ufa.g(n2eVar.c, 0, av8Var, null, n2eVar.d);
            av8Var.s(true);
            i9a.i(Double.valueOf(n2eVar.g), false, null, null, null, null, false, av8Var, 432, PglCryptUtils.BASE64_FAILED);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(n2eVar, function0, i, 26);
        }
    }

    public static final void e(final hth hthVar, final ct8 ct8Var, of3 of3Var, final int i) {
        eqf u;
        Function2 function2;
        hthVar.getClass();
        ct8Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1641931614);
        int i2 = (av8Var.g(hthVar) ? 4 : 2) | i | (av8Var.i(ct8Var) ? 32 : 16);
        final int i3 = 1;
        final int i4 = 0;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            final tfi c2 = hthVar.c();
            if (c2 == null) {
                u = av8Var.u();
                if (u != null) {
                    function2 = new Function2(hthVar, ct8Var, i, i4) { // from class: wsh
                        public final /* synthetic */ int a;
                        public final /* synthetic */ hth b;
                        public final /* synthetic */ ct8 c;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            of3 of3Var2 = (of3) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    d2a.e(this.b, this.c, of3Var2, aba.K(1));
                                    break;
                                default:
                                    d2a.e(this.b, this.c, of3Var2, aba.K(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    u.d = function2;
                }
                return;
            }
            final int i5 = hthVar.b;
            u6b u6bVar = (u6b) av8Var.k(mhb.a);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.TRUE);
                av8Var.n0(O);
            }
            final e1d e1dVar = (e1d) O;
            boolean i6 = av8Var.i(u6bVar);
            Object O2 = av8Var.O();
            if (i6 || O2 == a99Var) {
                O2 = new aaf(20, u6bVar, e1dVar);
                av8Var.n0(O2);
            }
            hz8.d(u6bVar, (Function1) O2, av8Var);
            av8Var.a0(1643307536, c2);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = e.d(yaa.v());
                av8Var.n0(O3);
            }
            final boh bohVar = (boh) O3;
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = e.d(0L);
                av8Var.n0(O4);
            }
            final boh bohVar2 = (boh) O4;
            Boolean bool = (Boolean) e1dVar.getValue();
            bool.getClass();
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                k50 k50Var = new k50(e1dVar, bohVar, bohVar2, null, 27);
                av8Var.n0(k50Var);
                O5 = k50Var;
            }
            hz8.o(av8Var, bool, (Function2) O5);
            Unit unit = Unit.a;
            boolean g = ((i2 & 112) == 32) | av8Var.g(c2) | av8Var.e(i5);
            Object O6 = av8Var.O();
            if (g || O6 == a99Var) {
                Function1 function1 = new Function1() { // from class: xsh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((o55) obj).getClass();
                        return new ysh(ct8.this, c2, i5, e1dVar, bohVar, bohVar2);
                    }
                };
                av8Var.n0(function1);
                O6 = function1;
            }
            hz8.d(unit, (Function1) O6, av8Var);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        u = av8Var.u();
        if (u != null) {
            function2 = new Function2(hthVar, ct8Var, i, i3) { // from class: wsh
                public final /* synthetic */ int a;
                public final /* synthetic */ hth b;
                public final /* synthetic */ ct8 c;

                {
                    this.a = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.a;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            d2a.e(this.b, this.c, of3Var2, aba.K(1));
                            break;
                        default:
                            d2a.e(this.b, this.c, of3Var2, aba.K(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            u.d = function2;
        }
    }

    public static final void f(a2j a2jVar, xtc xtcVar, of3 of3Var, int i) {
        a2j a2jVar2;
        boolean z;
        String str;
        boolean z2;
        int i2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1624540453);
        int i4 = i | (av8Var.g(a2jVar) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtc c0 = l98.c0(bkh.d(xtcVar, 1.0f), 16.0f, 8.0f);
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            lv1 lv1Var = uxf.m;
            l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            Integer num = a2jVar.a;
            String str2 = a2jVar.b;
            utc utcVar = utc.a;
            td4.z(num, bkh.l(utcVar, 40.0f), av8Var, 48);
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            wxf wxfVar = ww9.b;
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            if (str2 == null) {
                z = false;
                str = ljg.k(av8Var, 227979398, R.string.coach, av8Var, false);
            } else {
                z = false;
                av8Var.d0(227978685);
                av8Var.s(false);
                str = str2;
            }
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, new goa(1.0f, z), D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
            av8Var.s(true);
            l8g a5 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            if (str2 != null) {
                i2 = -690307723;
                i3 = R.string.coach;
                z2 = false;
            } else {
                z2 = false;
                i2 = -690219187;
                i3 = R.string.value_unknown;
            }
            boolean z3 = z2;
            udj.c(ljg.k(av8Var, i2, i3, av8Var, z2), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av3 av3Var = a2jVar.c;
            if (av3Var == null) {
                av8Var.d0(-689958137);
                av8Var.s(z3);
                a2jVar2 = a2jVar;
            } else {
                ljg.r(8.0f, -689958136, av8Var, av8Var, utcVar);
                td4.k(av3Var.a, bkh.l(utcVar, 16.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, 48, 12);
                String str3 = av3Var.b;
                if (str3 == null) {
                    av8Var.d0(2127895765);
                    av8Var.s(z3);
                    a2jVar2 = a2jVar;
                } else {
                    ljg.r(4.0f, 2127895766, av8Var, av8Var, utcVar);
                    a2jVar2 = a2jVar;
                    udj.c(str3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                    av8Var = av8Var;
                    Unit unit = Unit.a;
                    av8Var.s(z3);
                }
                Unit unit2 = Unit.a;
                av8Var.s(z3);
            }
            ljg.t(av8Var, true, true, true);
        } else {
            a2jVar2 = a2jVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(a2jVar2, xtcVar, i, 18);
        }
    }

    public static final void g(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(30734385);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            xtc h = ljg.h(16.0f, bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), 16.0f);
            int i2 = 6;
            u23 a2 = t23.a(new ng0(16.0f, true, new a70(i2)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, h);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a3 = k8g.a(new ng0(16.0f, true, new a70(i2)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_editor_logo, 6, av8Var), null, bkh.l(utcVar, 32.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            yf8 yf8Var = xth.a;
            udj.c(oea.v(R.string.torneo_promo_text, av8Var), new goa(1.0f, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
            String v = oea.v(R.string.torneo_promo_text_button, av8Var);
            boolean i3 = av8Var.i(context);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new k9f(context, 13);
                av8Var.n0(O);
            }
            mha.h(v, (Function0) O, null, tqh.a, new bqh(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var), uxf.q), false, false, false, 0L, 0, 0, av8Var, 3072, 0, IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oqj(xtcVar, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if ((r39 & 4) != 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(q80 q80Var, xtc xtcVar, long j, lg0 lg0Var, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        long j2;
        xtc xtcVar3;
        long j3;
        eqf u;
        q80Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1680936845);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(q80Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && av8Var.f(j2)) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            } else {
                j2 = j;
            }
            if ((i & 3072) == 0) {
                i3 |= av8Var.g(lg0Var) ? a.o : 1024;
            }
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
                j3 = j2;
            } else {
                av8Var.Y();
                int i5 = i & 1;
                utc utcVar = utc.a;
                if (i5 == 0 || av8Var.B()) {
                    if (i4 != 0) {
                        xtcVar2 = utcVar;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = lz.D(R.color.error, av8Var);
                        i3 &= -897;
                    }
                    av8Var.t();
                    lv1 lv1Var = uxf.m;
                    xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar2, 1.0f), j2, o7g.a(8.0f)), 16.0f, 4.0f);
                    l8g a2 = k8g.a(lg0Var, lv1Var, av8Var, (((((i3 >> 6) & 112) | 384) >> 3) & 14) | 48);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    kq9.a(haa.t(R.drawable.ic_warning, 0, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 440, 0);
                    nq8.h(av8Var, bkh.p(utcVar, 16.0f));
                    yf8 yf8Var = xth.a;
                    udj.d(q80Var, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, 0L, null, 0L, 2, false, 0, 0, null, null, xth.g(), av8Var, i3 & 14, 384, 258042);
                    av8Var = av8Var;
                    av8Var.s(true);
                    xtcVar3 = xtcVar2;
                    j3 = j2;
                } else {
                    av8Var.W();
                }
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new iq9(q80Var, xtcVar3, j3, lg0Var, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void i(String str, xtc xtcVar, long j, lg0 lg0Var, of3 of3Var, int i, int i2) {
        lg0 lg0Var2;
        long j2;
        xtc xtcVar2;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1807776041);
        int i3 = (av8Var.g(str) ? 4 : 2) | i | 48 | (((i2 & 4) == 0 && av8Var.f(j)) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= av8Var.g(lg0Var) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                if ((i2 & 4) != 0) {
                    j = lz.D(R.color.error, av8Var);
                    i3 &= -897;
                }
                xtcVar = utc.a;
                if (i4 != 0) {
                    lg0Var = ww9.b;
                }
            } else {
                av8Var.W();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            xtc xtcVar3 = xtcVar;
            long j3 = j;
            lg0 lg0Var3 = lg0Var;
            av8Var.t();
            h(new q80(str), xtcVar3, j3, lg0Var3, av8Var, i3 & 8176, 0);
            xtcVar2 = xtcVar3;
            j2 = j3;
            lg0Var2 = lg0Var3;
        } else {
            av8Var.W();
            lg0Var2 = lg0Var;
            j2 = j;
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new iq9(str, xtcVar2, j2, lg0Var2, i, i2);
        }
    }

    public static final ArrayList j(List list) {
        List<ClosedCaptionsFileDto> files;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            gbm gbmVar = null;
            if (!it.hasNext()) {
                break;
            }
            ClosedCaptionsDto closedCaptionsDto = (ClosedCaptionsDto) it.next();
            if (closedCaptionsDto != null && (files = closedCaptionsDto.getFiles()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ClosedCaptionsFileDto closedCaptionsFileDto : files) {
                    rql rqlVar = (closedCaptionsFileDto == null || closedCaptionsFileDto.getUrl() == null) ? null : new rql(closedCaptionsFileDto.getUrl(), closedCaptionsFileDto.getFileSize());
                    if (rqlVar != null) {
                        arrayList2.add(rqlVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    gbmVar = new gbm(arrayList2, closedCaptionsDto.getLanguage() == null ? d.a : new b(closedCaptionsDto.getLanguage()));
                }
            }
            if (gbmVar != null) {
                arrayList.add(gbmVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final Object k(float f, float f2, float f3, c80 c80Var, Function2 function2, hoi hoiVar) {
        q4k q4kVar = lz.f;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Function1 function1 = q4kVar.a;
        j80 j80Var = (j80) function1.invoke(f6);
        if (j80Var == null) {
            j80Var = ((j80) function1.invoke(f4)).c();
        }
        j80 j80Var2 = j80Var;
        Object l = l(new d80(q4kVar, f4, j80Var2, 56), new vti(c80Var, q4kVar, f4, f5, j80Var2), Long.MIN_VALUE, new su5(3, function2), hoiVar);
        lu3 lu3Var = lu3.a;
        if (l != lu3Var) {
            l = Unit.a;
        }
        return l == lu3Var ? l : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0104 A[Catch: CancellationException -> 0x003e, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x003e, blocks: (B:16:0x0039, B:18:0x00ed, B:20:0x0104, B:25:0x0127, B:27:0x013a, B:33:0x013f), top: B:15:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(d80 d80Var, t70 t70Var, long j, final Function1 function1, sq3 sq3Var) {
        eoi eoiVar;
        lu3 lu3Var;
        int i;
        final fsf fsfVar;
        final d80 d80Var2;
        d80 d80Var3;
        final float w;
        fsf fsfVar2;
        Object p;
        Function1 function12;
        b80 b80Var;
        b80 b80Var2;
        Object obj;
        Object p2;
        final t70 t70Var2 = t70Var;
        if (sq3Var instanceof eoi) {
            eoiVar = (eoi) sq3Var;
            int i2 = eoiVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eoiVar.w = i2 - Integer.MIN_VALUE;
                eoi eoiVar2 = eoiVar;
                Object obj2 = eoiVar2.v;
                lu3Var = lu3.a;
                i = eoiVar2.w;
                int i3 = 15;
                int i4 = 0;
                if (i != 0) {
                    y6a.M(obj2);
                    final Object g = t70Var2.g(0L);
                    final j80 c2 = t70Var2.c(0L);
                    fsfVar = new fsf();
                    if (j == Long.MIN_VALUE) {
                        try {
                            w = w(eoiVar2.getContext());
                            d80Var2 = d80Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            d80Var2 = d80Var;
                        }
                        try {
                            Function1 function13 = new Function1() { // from class: boi
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    long longValue = ((Long) obj3).longValue();
                                    t70 t70Var3 = t70Var2;
                                    q4k f = t70Var3.f();
                                    Object h = t70Var3.h();
                                    d80 d80Var4 = d80Var2;
                                    b80 b80Var3 = new b80(g, f, c2, longValue, h, longValue, new coi(1, d80Var4));
                                    d2a.s(b80Var3, longValue, w, t70Var3, d80Var4, function1);
                                    fsf.this.a = b80Var3;
                                    return Unit.a;
                                }
                            };
                            fsfVar2 = fsfVar;
                            try {
                                eoiVar2.r = d80Var2;
                                eoiVar2.s = t70Var2;
                                eoiVar2.t = function1;
                                eoiVar2.u = fsfVar2;
                                eoiVar2.w = 1;
                                if (t70Var2.b()) {
                                    p = H(function13, eoiVar2);
                                } else {
                                    p = bea.y(eoiVar2.getContext()).p(new k1e(i3, function13), eoiVar2);
                                }
                                if (p != lu3Var) {
                                    function12 = function1;
                                    d80Var3 = d80Var2;
                                }
                                return lu3Var;
                            } catch (CancellationException e3) {
                                e = e3;
                                d80Var3 = d80Var2;
                                fsfVar = fsfVar2;
                                b80Var = (b80) fsfVar.a;
                                if (b80Var != null) {
                                    ((eoh) b80Var.i).setValue(Boolean.FALSE);
                                }
                                b80Var2 = (b80) fsfVar.a;
                                if (b80Var2 != null && b80Var2.g == d80Var3.d) {
                                    d80Var3.f = false;
                                }
                                throw e;
                            }
                        } catch (CancellationException e4) {
                            e = e4;
                            d80Var3 = d80Var2;
                            b80Var = (b80) fsfVar.a;
                            if (b80Var != null) {
                            }
                            b80Var2 = (b80) fsfVar.a;
                            if (b80Var2 != null) {
                            }
                            throw e;
                        }
                    }
                    fsfVar2 = fsfVar;
                    try {
                        b80 b80Var3 = new b80(g, t70Var2.f(), c2, j, t70Var2.h(), j, new coi(i4, d80Var));
                        s(b80Var3, j, w(eoiVar2.getContext()), t70Var2, d80Var, function1);
                        fsfVar2.a = b80Var3;
                        d80Var3 = d80Var;
                        t70Var2 = t70Var;
                        function12 = function1;
                    } catch (CancellationException e5) {
                        e = e5;
                        d80Var3 = d80Var;
                        fsfVar = fsfVar2;
                        b80Var = (b80) fsfVar.a;
                        if (b80Var != null) {
                        }
                        b80Var2 = (b80) fsfVar.a;
                        if (b80Var2 != null) {
                            d80Var3.f = false;
                        }
                        throw e;
                    }
                    fsfVar = fsfVar2;
                } else {
                    if (i != 1 && i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = eoiVar2.u;
                    function12 = eoiVar2.t;
                    t70Var2 = eoiVar2.s;
                    d80Var3 = eoiVar2.r;
                    try {
                        y6a.M(obj2);
                    } catch (CancellationException e6) {
                        e = e6;
                        b80Var = (b80) fsfVar.a;
                        if (b80Var != null) {
                        }
                        b80Var2 = (b80) fsfVar.a;
                        if (b80Var2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = fsfVar.a;
                    obj.getClass();
                    if (((Boolean) ((eoh) ((b80) obj).i).getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    final float w2 = w(eoiVar2.getContext());
                    final fsf fsfVar3 = fsfVar;
                    final Function1 function14 = function12;
                    final t70 t70Var3 = t70Var2;
                    final d80 d80Var4 = d80Var3;
                    try {
                        Function1 function15 = new Function1() { // from class: doi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                long longValue = ((Long) obj3).longValue();
                                Object obj4 = fsf.this.a;
                                obj4.getClass();
                                d2a.s((b80) obj4, longValue, w2, t70Var3, d80Var4, function14);
                                return Unit.a;
                            }
                        };
                        fsfVar = fsfVar3;
                        t70Var2 = t70Var3;
                        d80Var3 = d80Var4;
                        function12 = function14;
                        eoiVar2.r = d80Var3;
                        eoiVar2.s = t70Var2;
                        eoiVar2.t = function12;
                        eoiVar2.u = fsfVar;
                        eoiVar2.w = 2;
                        if (t70Var2.b()) {
                            p2 = H(function15, eoiVar2);
                        } else {
                            p2 = bea.y(eoiVar2.getContext()).p(new k1e(i3, function15), eoiVar2);
                        }
                    } catch (CancellationException e7) {
                        e = e7;
                        fsfVar = fsfVar3;
                        d80Var3 = d80Var4;
                        b80Var = (b80) fsfVar.a;
                        if (b80Var != null) {
                        }
                        b80Var2 = (b80) fsfVar.a;
                        if (b80Var2 != null) {
                        }
                        throw e;
                    }
                } while (p2 != lu3Var);
                return lu3Var;
            }
        }
        eoiVar = new eoi(sq3Var);
        eoi eoiVar22 = eoiVar;
        Object obj22 = eoiVar22.v;
        lu3Var = lu3.a;
        i = eoiVar22.w;
        int i32 = 15;
        int i42 = 0;
        if (i != 0) {
        }
        do {
            obj = fsfVar.a;
            obj.getClass();
            if (((Boolean) ((eoh) ((b80) obj).i).getValue()).booleanValue()) {
            }
        } while (p2 != lu3Var);
        return lu3Var;
    }

    public static /* synthetic */ Object m(float f, float f2, c80 c80Var, Function2 function2, hoi hoiVar, int i) {
        if ((i & 8) != 0) {
            c80Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        }
        return k(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c80Var, function2, hoiVar);
    }

    public static final Object n(d80 d80Var, ol4 ol4Var, boolean z, Function1 function1, sq3 sq3Var) {
        Object l = l(d80Var, new nl4(ol4Var, d80Var.a, ((eoh) d80Var.b).getValue(), d80Var.c), z ? d80Var.d : Long.MIN_VALUE, function1, sq3Var);
        return l == lu3.a ? l : Unit.a;
    }

    public static final Object o(d80 d80Var, Float f, c80 c80Var, boolean z, Function1 function1, sq3 sq3Var) {
        Object l = l(d80Var, new vti(c80Var, d80Var.a, ((eoh) d80Var.b).getValue(), f, d80Var.c), z ? d80Var.d : Long.MIN_VALUE, function1, sq3Var);
        return l == lu3.a ? l : Unit.a;
    }

    public static /* synthetic */ Object p(d80 d80Var, Float f, g0i g0iVar, boolean z, Function1 function1, sq3 sq3Var, int i) {
        if ((i & 2) != 0) {
            g0iVar = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        }
        g0i g0iVar2 = g0iVar;
        if ((i & 8) != 0) {
            function1 = new rfi(5);
        }
        return o(d80Var, f, g0iVar2, z, function1, sq3Var);
    }

    public static byte[] q(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = bf3.c(uuidArr.length, 16, 4, length);
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? C.DEFAULT_MUXED_BUFFER_SIZE : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static final void s(b80 b80Var, long j, float f, t70 t70Var, d80 d80Var, Function1 function1) {
        long e2 = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? t70Var.e() : (long) ((j - b80Var.c) / f);
        b80Var.g = j;
        ((eoh) b80Var.e).setValue(t70Var.g(e2));
        b80Var.f = t70Var.c(e2);
        if (t70Var.d(e2)) {
            b80Var.h = b80Var.g;
            ((eoh) b80Var.i).setValue(Boolean.FALSE);
        }
        G(b80Var, d80Var);
        function1.invoke(b80Var);
    }

    public static String u(cc2 cc2Var) {
        StringBuilder sb = new StringBuilder(cc2Var.size());
        for (int i = 0; i < cc2Var.size(); i++) {
            byte c2 = cc2Var.c(i);
            if (c2 == 34) {
                sb.append("\\\"");
            } else if (c2 == 39) {
                sb.append("\\'");
            } else if (c2 != 92) {
                switch (c2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (c2 < 32 || c2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((c2 >>> 6) & 3) + 48));
                            sb.append((char) (((c2 >>> 3) & 7) + 48));
                            sb.append((char) ((c2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) c2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static and v() {
        return (and) xel.i.getValue();
    }

    public static final float w(CoroutineContext coroutineContext) {
        pvc pvcVar = (pvc) coroutineContext.get(kpg.e);
        float m = pvcVar != null ? pvcVar.m() : 1.0f;
        if (m >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return m;
        }
        j3f.b("negative scale factor");
        return m;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final String x(Context context, String str, boolean z) {
        context.getClass();
        switch (str.hashCode()) {
            case -1649405010:
                if (str.equals("Synthetic indoor")) {
                    return context.getString(R.string.surface_synthetic_indoor);
                }
                break;
            case -1216068804:
                if (str.equals("Hardcourt outdoor")) {
                    return context.getString(R.string.tennis_surface_outdoor_hardcourt);
                }
                break;
            case -779358032:
                if (str.equals("Red clay")) {
                    return context.getString(R.string.surface_red_clay);
                }
                break;
            case -633575661:
                if (str.equals("Hardcourt indoor")) {
                    return context.getString(R.string.tennis_surface_indoor_hardcourt);
                }
                break;
            case 2102913:
                if (str.equals("Clay")) {
                    return context.getString(R.string.tennis_surface_clay);
                }
                break;
            case 2241803:
                if (str.equals("Hard")) {
                    return context.getString(R.string.tennis_surface_hard);
                }
                break;
            case 69063062:
                if (str.equals("Grass")) {
                    return context.getString(R.string.tennis_surface_grass);
                }
                break;
            case 914894075:
                if (str.equals("Synthetic grass")) {
                    return context.getString(R.string.surface_synthetic_grass);
                }
                break;
            case 1652959745:
                if (str.equals("Synthetic outdoor")) {
                    return context.getString(R.string.surface_synthetic_outdoor);
                }
                break;
            case 1808601896:
                if (str.equals("Carpet indoor")) {
                    return context.getString(R.string.surface_carpet);
                }
                break;
        }
        if (z) {
            return str;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return r1.getColor(com.sofascore.results.R.color.terrain_clay);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r2.equals("Red clay") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r2.equals("Clay") == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int y(Context context, String str) {
        context.getClass();
        switch (str.hashCode()) {
            case -1216068804:
                if (str.equals("Hardcourt outdoor")) {
                    return context.getColor(R.color.hardcourt_outdoor);
                }
                return context.getColor(R.color.terrain_default);
            case -779358032:
                break;
            case -633575661:
                if (str.equals("Hardcourt indoor")) {
                    return context.getColor(R.color.hardcourt_indoor);
                }
                return context.getColor(R.color.terrain_default);
            case 2102913:
                break;
            case 69063062:
                if (str.equals("Grass")) {
                    return context.getColor(R.color.terrain_grass);
                }
                return context.getColor(R.color.terrain_default);
            default:
                return context.getColor(R.color.terrain_default);
        }
    }

    public static axn z(byte[] bArr) {
        UUID[] uuidArr;
        j9e j9eVar = new j9e(bArr);
        if (j9eVar.c < 32) {
            return null;
        }
        j9eVar.N(0);
        int a2 = j9eVar.a();
        int m = j9eVar.m();
        if (m != a2) {
            tgj.d0("Advertised atom size (" + m + ") does not match buffer size: " + a2);
            return null;
        }
        int m2 = j9eVar.m();
        if (m2 != 1886614376) {
            fn0.r(m2, "Atom type is not pssh: ");
            return null;
        }
        int e2 = l12.e(j9eVar.m());
        if (e2 > 1) {
            fn0.r(e2, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(j9eVar.u(), j9eVar.u());
        if (e2 == 1) {
            int E = j9eVar.E();
            uuidArr = new UUID[E];
            for (int i = 0; i < E; i++) {
                uuidArr[i] = new UUID(j9eVar.u(), j9eVar.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = j9eVar.E();
        int a3 = j9eVar.a();
        if (E2 == a3) {
            byte[] bArr2 = new byte[E2];
            j9eVar.k(bArr2, 0, E2);
            return new axn(uuid, e2, bArr2, uuidArr);
        }
        tgj.d0("Atom data size (" + E2 + ") does not match the bytes left: " + a3);
        return null;
    }

    public abstract void B(String str);

    public boolean t(hng hngVar) {
        return true;
    }
}
