package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.KeyEvent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.auth.zzef;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.database.VoteType;
import com.sofascore.results.R;
import com.sofascore.results.service.VoteWorker;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class z1a {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;

    public static void A(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? j(i, i3, "start index") : (i2 < 0 || i2 > i3) ? j(i2, i3, "end index") : ufa.C("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void B(int i, String str, boolean z) {
        if (z) {
            return;
        }
        a70.r(ufa.C(str, Integer.valueOf(i)));
    }

    public static void C(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        a70.r(ufa.C(str, obj));
    }

    public static void D(String str, boolean z) {
        if (z) {
            return;
        }
        a70.r(str);
    }

    public static void E(boolean z) {
        if (z) {
            return;
        }
        zzl.s();
    }

    public static final int F(nlg nlgVar, String str) {
        nlgVar.getClass();
        int columnCount = nlgVar.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(nlgVar.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String j = dmi.j('`', "`", str);
        int columnCount2 = nlgVar.getColumnCount();
        while (true) {
            if (i >= columnCount2) {
                i = -1;
                break;
            }
            if (j.equals(nlgVar.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static final void G(Context context) {
        int i = Build.VERSION.SDK_INT;
        sg sgVar = sg.a;
        if ((i >= 33 ? sgVar.a() : 0) >= 11) {
            context.getSystemService(fqj.class).getClass();
            pvd.j();
            return;
        }
        if ((i >= 33 ? sgVar.a() : 0) >= 5) {
            context.getSystemService(fqj.class).getClass();
            pvd.j();
            return;
        }
        if ((i >= 33 ? sgVar.a() : 0) == 4) {
            context.getSystemService(fqj.class).getClass();
            pvd.j();
            return;
        }
        rg rgVar = rg.a;
        if (((i == 31 || i == 32) ? rgVar.a() : 0) >= 11) {
            try {
                new p1c(context, 1).invoke(context);
                throw null;
            } catch (NoClassDefFoundError unused) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 31 || i2 == 32) {
                    rgVar.a();
                    return;
                }
                return;
            }
        }
        if (((i == 31 || i == 32) ? rgVar.a() : 0) < 9) {
            return;
        }
        try {
            new p1c(context, 2).invoke(context);
            throw null;
        } catch (NoClassDefFoundError unused2) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 31 || i3 == 32) {
                rgVar.a();
            }
        }
    }

    public static final int H(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static SharedPreferences I(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final q80 J(wcj wcjVar) {
        q80 q80Var = wcjVar.a;
        long j = wcjVar.b;
        q80Var.getClass();
        return q80Var.subSequence(pej.g(j), pej.f(j));
    }

    public static final q80 L(wcj wcjVar, int i) {
        q80 q80Var = wcjVar.a;
        q80 q80Var2 = wcjVar.a;
        long j = wcjVar.b;
        int f2 = pej.f(j);
        int f3 = pej.f(j);
        int i2 = f3 + i;
        if (((i ^ i2) & (f3 ^ i2)) < 0) {
            i2 = q80Var2.b.length();
        }
        return q80Var.subSequence(f2, Math.min(i2, q80Var2.b.length()));
    }

    public static final q80 M(wcj wcjVar, int i) {
        q80 q80Var = wcjVar.a;
        long j = wcjVar.b;
        int g2 = pej.g(j);
        int i2 = g2 - i;
        if (((g2 ^ i2) & (i ^ g2)) < 0) {
            i2 = 0;
        }
        return q80Var.subSequence(Math.max(0, i2), pej.g(j));
    }

    public static final cdi N(qpa qpaVar, of3 of3Var) {
        qpaVar.getClass();
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = goh.b(new vcb(qpaVar, 0));
            av8Var.n0(O);
        }
        return (cdi) O;
    }

    public static final cdi O(ksa ksaVar, of3 of3Var) {
        ksaVar.getClass();
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = goh.b(new ni4(ksaVar, 10));
            av8Var.n0(O);
        }
        return (cdi) O;
    }

    public static final cdi P(qug qugVar, of3 of3Var) {
        qugVar.getClass();
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = goh.b(new fu5(qugVar, 7));
            av8Var.n0(O);
        }
        return (cdi) O;
    }

    public static final qah Q(qah qahVar, qah qahVar2, float f2) {
        long d0 = hkg.d0(qahVar.a, qahVar2.a, f2);
        long j = qahVar.b;
        long j2 = qahVar2.b;
        float t = b6a.t(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f2);
        float t2 = b6a.t(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f2);
        return new qah(d0, (Float.floatToRawIntBits(t) << 32) | (Float.floatToRawIntBits(t2) & 4294967295L), b6a.t(qahVar.c, qahVar2.c, f2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void R(wtc wtcVar, Function0 function0) {
        ukd ukdVar = wtcVar.g;
        if (ukdVar == null) {
            ukdVar = new ukd((tkd) wtcVar);
            wtcVar.g = ukdVar;
        }
        uyd snapshotObserver = ((xy) c6o.d0(wtcVar)).getSnapshotObserver();
        snapshotObserver.a.i(ukdVar, s84.G, function0);
    }

    public static final long S(q1a q1aVar, ewd ewdVar, p1a p1aVar, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = q1aVar.g;
        if (ewdVar != null) {
            int i = p1aVar.a;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (ewdVar == ewd.b) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (floatToRawIntBits & 4294967295L);
        }
        long h2 = dnd.h(T(q1aVar, ewdVar, p1aVar), j2);
        if (z || !q1aVar.i) {
            return h2;
        }
        return 0L;
    }

    public static final long T(q1a q1aVar, ewd ewdVar, p1a p1aVar) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (ewdVar == null) {
            return q1aVar.c;
        }
        int i = p1aVar.a;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (q1aVar.c >> 32));
        } else {
            if (i != 2) {
                return q1aVar.c;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (q1aVar.c & 4294967295L));
        }
        if (ewdVar == ewd.b) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(mwh mwhVar, sq3 sq3Var) {
        zik zikVar;
        int i;
        mwh mwhVar2;
        Throwable th;
        x52 x52Var;
        if (sq3Var instanceof zik) {
            zikVar = (zik) sq3Var;
            int i2 = zikVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zikVar.u = i2 - Integer.MIN_VALUE;
                Object obj = zikVar.t;
                lu3 lu3Var = lu3.a;
                i = zikVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    try {
                        x52 x52Var2 = new x52();
                        zikVar.r = mwhVar;
                        zikVar.s = x52Var2;
                        zikVar.u = 1;
                        mwhVar.a.y0(x52Var2);
                        if (Unit.a == lu3Var) {
                            return lu3Var;
                        }
                        mwhVar2 = mwhVar;
                        x52Var = x52Var2;
                    } catch (Throwable th2) {
                        mwhVar2 = mwhVar;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x52Var = zikVar.s;
                    mwhVar2 = zikVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            o1j.t(mwhVar2, th);
                            throw th4;
                        }
                    }
                }
                o1j.t(mwhVar2, null);
                return x52Var;
            }
        }
        zikVar = new zik(sq3Var);
        Object obj2 = zikVar.t;
        lu3 lu3Var2 = lu3.a;
        i = zikVar.u;
        if (i != 0) {
        }
        o1j.t(mwhVar2, null);
        return x52Var;
    }

    public static final void V(nkb nkbVar, Function1 function1) {
        nkb nkbVar2 = new nkb(999);
        int i = nkbVar.i();
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            nkbVar2.g(null, nkbVar.f(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                function1.invoke(nkbVar2);
                int i4 = nkbVar2.i();
                for (int i5 = 0; i5 < i4; i5++) {
                    nkbVar.g(nkbVar2.j(i5), nkbVar2.f(i5));
                }
                nkbVar2.a();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            function1.invoke(nkbVar2);
            int i6 = nkbVar2.i();
            for (int i7 = 0; i7 < i6; i7++) {
                nkbVar.g(nkbVar2.j(i7), nkbVar2.f(i7));
            }
        }
    }

    public static String Z(zzef zzefVar) {
        StringBuilder sb = new StringBuilder(zzefVar.m());
        for (int i = 0; i < zzefVar.m(); i++) {
            byte c2 = zzefVar.c(i);
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

    public static final void a(ehk ehkVar, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(965758406);
        int i2 = (av8Var.e(ehkVar == null ? -1 : ehkVar.ordinal()) ? 4 : 2) | i | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            i2a.g(yqo.H(-391548830, av8Var, new s5h((Context) av8Var.k(nz.b), ehkVar)), av8Var, 6);
            xtcVar = utc.a;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(ehkVar, xtcVar, i, 5);
        }
    }

    public static boolean a0(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(U3.i.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static final void b(q2h q2hVar, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        long f2;
        boolean z = q2hVar.c;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1734455766);
        int i2 = i | (av8Var.g(q2hVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            xtc r = bkh.r(xtcVar, null, 3);
            if (z) {
                av8Var.d0(364689513);
                f2 = r13.c(lz.D(R.color.crowdsourcing, av8Var), 0.15f);
                av8Var.s(false);
            } else {
                f2 = ljg.f(av8Var, 364690307, R.color.surface_2, av8Var, false);
            }
            xtc A = wnn.A(yso.o(n9e.q(r, f2, o7g.a(8.0f)), z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? ljg.f(av8Var, 364697135, R.color.crowdsourcing, av8Var, false) : ljg.f(av8Var, 364698115, R.color.surface_2, av8Var, false), o7g.a(8.0f)), o7g.a(8.0f));
            boolean z2 = (i2 & 112) == 32;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new rsd(13, function0);
                av8Var.n0(O);
            }
            xtc b0 = l98.b0(bkh.e(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), 72.0f), 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            td4.G(q2hVar.a, n9e.q(bkh.l(utc.a, 24.0f), r13.h, o7g.a(4.0f)), false, 0L, av8Var, 0, 12);
            w1l.o(1.0f, true, av8Var);
            String str = q2hVar.b;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, xth.c(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(q2hVar, function0, xtcVar, i, 9);
        }
    }

    public static final void c(String str, c1j c1jVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        String str2;
        int i2;
        av8 av8Var;
        double d2;
        float f2;
        str.getClass();
        c1jVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1306313937);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (av8Var2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.g(c1jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            xtc h2 = ljg.h(16.0f, xtcVar, lz.D(R.color.surface_1, av8Var2), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, h2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            yf8 yf8Var = xth.a;
            int i3 = i2;
            udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, i2 & 14, 0, 131066);
            av8Var = av8Var2;
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 12.0f));
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
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
            q2h q2hVar = c1jVar.a;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new vbc(25, function1);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                d2 = 0.0d;
                f2 = Float.MAX_VALUE;
            } else {
                d2 = 0.0d;
                f2 = 1.0f;
            }
            b(q2hVar, function0, new goa(f2, true), av8Var, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            q2h q2hVar2 = c1jVar.b;
            boolean z2 = i4 == 256;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new vbc(26, function1);
                av8Var.n0(O2);
            }
            Function0 function02 = (Function0) O2;
            if (1.0f <= d2) {
                p3a.a("invalid weight; must be greater than zero");
            }
            b(q2hVar2, function02, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b1j(str, c1jVar, function1, xtcVar, i, 0);
        }
    }

    public static final void d(iel ielVar, boolean z, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2106499202);
        int i2 = (av8Var.g(ielVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            boolean booleanValue = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            utc utcVar = utc.a;
            xtc A = wnn.A(l98.d0(bkh.d(utcVar, 1.0f), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(8.0f));
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
                O2 = wzj.k;
                av8Var.n0(O2);
            }
            xtc b0 = l98.b0(tol.y(A, true, true, true, D, wzcVar, new uel(i3, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1), av8Var, 0), 4.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            td4.y(ielVar.a, 0, 12, av8Var, n9e.q(wnn.A(bkh.l(utcVar, 40.0f), o7g.a(8.0f)), lz.D(R.color.on_color_primary, av8Var), oyn.e), null, false);
            String str = ielVar.b;
            xtc O3 = kda.O(l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "wc26_tournament_title", av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, O3, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            w1l.o(1.0f, true, av8Var);
            if (booleanValue) {
                av8Var.d0(774365864);
                av8Var.s(false);
            } else {
                av8Var.d0(774105433);
                hz8.a(ielVar.a, (i2 << 3) & 896, lz.D(R.color.on_color_primary, av8Var), av8Var, null, ielVar.b, z);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tel(ielVar, z, function1, i, 0);
        }
    }

    public static final void e(iel ielVar, boolean z, boolean z2, Function1 function1, of3 of3Var, int i) {
        ielVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(580002216);
        int i2 = i | (av8Var.g(ielVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            f(6, av8Var);
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i3 = i2 >> 3;
            int i4 = (i2 & 14) | (i3 & 112);
            int i5 = i3 & 896;
            d(ielVar, z2, function1, av8Var, i4 | i5);
            v8a.g(ielVar, z, function1, av8Var, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | i5);
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xt6(ielVar, z, z2, function1, i, 5);
        }
    }

    public static final void f(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1723789645);
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            long D = lz.D(R.color.graphics_dark, av8Var);
            xtc q = n9e.q(n12.a.b(utc.a), D, oyn.e);
            boolean f2 = av8Var.f(D);
            Object O = av8Var.O();
            if (f2 || O == nf3.a) {
                O = new prd(D, 9);
                av8Var.n0(O);
            }
            wkn.l(s6a.N(R.drawable.wc26_headern_pattern, 6, av8Var), td4.Z(q, (Function1) O), null, mp3.a, 0.65f, null, av8Var, 221232, 72);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t6j(i, 22);
        }
    }

    public static Object[] g(Throwable th, h2m h2mVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new Pair("exception_name", th.getClass().getSimpleName()));
        arrayList.add(new Pair("description", th.getMessage()));
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        if (!TextUtils.isEmpty(stringBuffer)) {
            dmi.x(arrayList, "stack_trace", stringBuffer);
        }
        if (h2mVar != null) {
            arrayList.add(new Pair("error_code", h2mVar.a));
        }
        Object[] objArr = new Object[arrayList.size() * 2];
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Pair pair = (Pair) arrayList.get(i3);
            objArr[i2] = pair.first;
            objArr[i] = pair.second;
            i2 += 2;
            i += 2;
        }
        return objArr;
    }

    public static final void h(yia yiaVar, q1a q1aVar, ewd ewdVar, p1a p1aVar, yz1 yz1Var, long j) {
        float intBitsToFloat;
        l0d l0dVar = (l0d) yz1Var.c;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (q1aVar.c >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (q1aVar.c & 4294967295L));
        if (l(q1aVar)) {
            yz1Var.b = 0;
            l0dVar.d();
        }
        if (!m(q1aVar) && !l(q1aVar)) {
            if (l0dVar.b == 3) {
                int i = yz1Var.b;
                yz1Var.b = i + 1;
                l0dVar.n(i, q1aVar);
            } else {
                l0dVar.a(q1aVar);
            }
            if (yz1Var.b == 3) {
                yz1Var.b = 0;
            }
            Object[] objArr = l0dVar.a;
            int i2 = l0dVar.b;
            float f2 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f2 += Float.intBitsToFloat((int) (((q1a) objArr[i3]).c >> 32));
            }
            int i4 = l0dVar.b;
            intBitsToFloat2 = f2 / i4;
            Object[] objArr2 = l0dVar.a;
            float f3 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f3 += Float.intBitsToFloat((int) (((q1a) objArr2[i5]).c & 4294967295L));
            }
            intBitsToFloat3 = f3 / l0dVar.b;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (ewdVar != null) {
            int i6 = p1aVar.a;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = ewdVar == ewd.b ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) : (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((ou4) yiaVar.b).a(q1aVar.b, dnd.i(floatToRawIntBits, j));
    }

    public static void i(Context context, int i, long j, String str, VoteType voteType) {
        context.getClass();
        str.getClass();
        voteType.getClass();
        kotlin.Pair[] pairArr = {new kotlin.Pair("ACTION", "ADD_VOTE"), new kotlin.Pair("EVENT_ID", Integer.valueOf(i)), new kotlin.Pair("EVENT_TIMESTAMP", Long.valueOf(j)), new kotlin.Pair("CHOICE", str), new kotlin.Pair("VOTE_TYPE", Integer.valueOf(voteType.ordinal()))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 5; i2++) {
            kotlin.Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        ktd g2 = vxd.g(VoteWorker.class, l);
        if (Build.VERSION.SDK_INT >= 31) {
            pwd pwdVar = pwd.a;
            g2.e();
        }
        vxd.h(context).b("VoteWorker-".concat(mha.o(l)), nf6.a, (ltd) g2.a());
    }

    public static String j(int i, int i2, String str) {
        if (i < 0) {
            return ufa.C("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ufa.C("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a70.p(ljg.j(i2, "negative size: "));
        return null;
    }

    public static void k(Application application, int i, String str, String str2, VoteType voteType) {
        str.getClass();
        voteType.getClass();
        kotlin.Pair[] pairArr = {new kotlin.Pair("ACTION", "CHANGE_VOTE"), new kotlin.Pair("EVENT_ID", Integer.valueOf(i)), new kotlin.Pair("CHOICE", str2), new kotlin.Pair("OLD_CHOICE", str), new kotlin.Pair("VOTE_TYPE", Integer.valueOf(voteType.ordinal()))};
        hpo hpoVar = new hpo(18);
        for (int i2 = 0; i2 < 5; i2++) {
            kotlin.Pair pair = pairArr[i2];
            hpoVar.B(pair.b, (String) pair.a);
        }
        md4 l = hpoVar.l();
        ktd g2 = vxd.g(VoteWorker.class, l);
        if (Build.VERSION.SDK_INT >= 31) {
            pwd pwdVar = pwd.a;
            g2.e();
        }
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        xbl d2 = xbl.d(applicationContext);
        d2.getClass();
        d2.b("VoteWorker-".concat(mha.o(l)), nf6.a, (ltd) g2.a());
    }

    public static final boolean l(q1a q1aVar) {
        return !q1aVar.h && q1aVar.d;
    }

    public static final boolean m(q1a q1aVar) {
        return q1aVar.h && !q1aVar.d;
    }

    public static void n(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(ufa.C(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void o(int i, String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(ufa.C(str, Integer.valueOf(i)));
    }

    public static void p(long j, boolean z, String str) {
        if (z) {
            return;
        }
        a70.p(ufa.C(str, Long.valueOf(j)));
    }

    public static void q(Object obj, String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(ufa.C(str, obj));
    }

    public static void r(String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(str);
    }

    public static void s(boolean z) {
        if (z) {
            return;
        }
        ilg.c();
    }

    public static void t(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        a70.p(ufa.C(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void u(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        a70.p(ufa.C(str, obj, comparable));
    }

    public static void v(int i, int i2) {
        String C;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                C = ufa.C("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a70.p(ljg.j(i2, "negative size: "));
                    return;
                }
                C = ufa.C("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(C);
        }
    }

    public static void w(Object obj) {
        obj.getClass();
    }

    public static void x(Object obj, Object obj2, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(ufa.C(str, obj2));
    }

    public static void y(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static void z(int i, int i2) {
        if (i < 0 || i > i2) {
            zzl.r(j(i, i2, "index"));
        }
    }

    public abstract String K();

    public abstract void W();

    public abstract void X();

    public abstract void Y(w1a w1aVar);
}
