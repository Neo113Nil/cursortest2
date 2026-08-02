package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$AutoPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$ContinuousPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import java.io.OutputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hjg implements gjg, qs3, f, lkk, zzyh, zzqp, zb2, hg3, ss3, m4f, um6, b79, vu3 {
    public static hjg a;
    public static final hjg b = new hjg();
    public static final hjg c = new hjg();
    public static final hjg d = new hjg();
    public static final /* synthetic */ hjg e = new hjg();
    public static final hjg f = new hjg();
    public static final hjg g = new hjg();
    public static final hjg h = new hjg();
    public static final hjg i = new hjg();
    public static final hjg j = new hjg();
    public static final hjg k = new hjg();
    public static final hjg l = new hjg();
    public static final hjg m = new hjg();
    public static final hjg n = new hjg();
    public static final hjg o = new hjg();
    public static hjg p;

    public static gl n() {
        lr9.a().getClass();
        gl glVar = new gl();
        u1p u1pVar = u1p.a;
        glVar.a = u1pVar;
        glVar.e = AdsRequestImpl$AutoPlayState.UNKNOWN;
        glVar.f = AdsRequestImpl$MutePlayState.UNKNOWN;
        glVar.g = AdsRequestImpl$ContinuousPlayState.UNKNOWN;
        glVar.h = u1pVar;
        glVar.i = 1;
        return glVar;
    }

    public static s01 o(Context context, KClass kClass) {
        int i2 = s01.i;
        context.getClass();
        kClass.getClass();
        s01 s01Var = new s01(context, kClass);
        s01Var.setCancelable(true);
        s01Var.setCanceledOnTouchOutside(true);
        s01Var.setOnCancelListener(null);
        s01Var.setOnDismissListener(null);
        return s01Var;
    }

    public static n9j p(g23 g23Var, wej wejVar) {
        n9j a2;
        n9j n9jVar = g23Var.g0;
        if (n9jVar != null) {
            if (Intrinsics.c(n9jVar.k, wejVar)) {
                return n9jVar;
            }
            a2 = n9jVar.a(n9jVar.a, n9jVar.b, n9jVar.c, n9jVar.d, n9jVar.e, n9jVar.f, n9jVar.g, n9jVar.h, n9jVar.i, n9jVar.j, wejVar, n9jVar.l, n9jVar.m, n9jVar.n, n9jVar.o, n9jVar.p, n9jVar.q, n9jVar.r, n9jVar.s, n9jVar.t, n9jVar.u, n9jVar.v, n9jVar.w, n9jVar.x, n9jVar.y, n9jVar.z, n9jVar.A, n9jVar.B, n9jVar.C, n9jVar.D, n9jVar.E, n9jVar.F, n9jVar.G, n9jVar.H, n9jVar.I, n9jVar.J, n9jVar.K, n9jVar.L, n9jVar.M, n9jVar.N, n9jVar.O, n9jVar.P, n9jVar.Q);
            g23Var.g0 = a2;
            return a2;
        }
        long c2 = i23.c(g23Var, k28.y);
        long c3 = i23.c(g23Var, k28.D);
        h23 h23Var = k28.g;
        long c4 = i23.c(g23Var, h23Var);
        float f2 = k28.h;
        long c5 = r13.c(c4, f2);
        long c6 = i23.c(g23Var, k28.s);
        h23 h23Var2 = k28.c;
        long c7 = i23.c(g23Var, h23Var2);
        long c8 = i23.c(g23Var, h23Var2);
        long c9 = i23.c(g23Var, h23Var2);
        long c10 = i23.c(g23Var, h23Var2);
        long c11 = i23.c(g23Var, k28.b);
        long c12 = i23.c(g23Var, k28.r);
        long c13 = i23.c(g23Var, k28.x);
        long c14 = i23.c(g23Var, k28.a);
        long c15 = r13.c(i23.c(g23Var, k28.e), k28.f);
        long c16 = i23.c(g23Var, k28.q);
        long c17 = i23.c(g23Var, k28.A);
        long c18 = i23.c(g23Var, k28.I);
        long c19 = r13.c(i23.c(g23Var, k28.k), k28.l);
        long c20 = i23.c(g23Var, k28.u);
        long c21 = i23.c(g23Var, k28.C);
        long c22 = i23.c(g23Var, k28.K);
        long c23 = r13.c(i23.c(g23Var, k28.o), k28.p);
        long c24 = i23.c(g23Var, k28.w);
        long c25 = i23.c(g23Var, k28.z);
        long c26 = i23.c(g23Var, k28.H);
        long c27 = r13.c(i23.c(g23Var, k28.i), k28.j);
        long c28 = i23.c(g23Var, k28.t);
        h23 h23Var3 = k28.E;
        long c29 = i23.c(g23Var, h23Var3);
        long c30 = i23.c(g23Var, h23Var3);
        long c31 = r13.c(i23.c(g23Var, h23Var), f2);
        long c32 = i23.c(g23Var, h23Var3);
        long c33 = i23.c(g23Var, k28.B);
        long c34 = i23.c(g23Var, k28.J);
        long c35 = r13.c(i23.c(g23Var, k28.m), k28.n);
        long c36 = i23.c(g23Var, k28.v);
        h23 h23Var4 = k28.F;
        long c37 = i23.c(g23Var, h23Var4);
        long c38 = i23.c(g23Var, h23Var4);
        long c39 = r13.c(i23.c(g23Var, h23Var4), f2);
        long c40 = i23.c(g23Var, h23Var4);
        h23 h23Var5 = k28.G;
        n9j n9jVar2 = new n9j(c2, c3, c5, c6, c7, c8, c9, c10, c11, c12, wejVar, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34, c35, c36, c37, c38, c39, c40, i23.c(g23Var, h23Var5), i23.c(g23Var, h23Var5), r13.c(i23.c(g23Var, h23Var5), f2), i23.c(g23Var, h23Var5));
        g23Var.g0 = n9jVar2;
        return n9jVar2;
    }

    public static o68 q(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1980597672:
                if (str.equals("veryEasy")) {
                    return o68.c;
                }
                return null;
            case -1980508351:
                if (str.equals("veryHard")) {
                    return o68.g;
                }
                return null;
            case -1078030475:
                if (str.equals("medium")) {
                    return o68.e;
                }
                return null;
            case 3105794:
                if (str.equals("easy")) {
                    return o68.d;
                }
                return null;
            case 3195115:
                if (str.equals("hard")) {
                    return o68.f;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // defpackage.ss3
    public void a(jl9 jl9Var, List list) {
        jl9Var.getClass();
    }

    @Override // defpackage.gjg
    public boolean b(int i2) {
        return true;
    }

    @Override // defpackage.m4f
    public CharSequence c(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.S) ? editTextPreference.a.getString(R.string.not_set) : editTextPreference.S;
    }

    @Override // defpackage.qs3
    public Object convert(Object obj) {
        return (yzf) obj;
    }

    @Override // defpackage.zb2
    public byte[] d(int i2, int i3, byte[] bArr) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.b79
    public boolean e() {
        boolean z;
        synchronized (t08.a) {
            try {
                int i2 = t08.c;
                t08.c = i2 + 1;
                if (i2 >= 30 || SystemClock.uptimeMillis() > t08.d + CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                    t08.c = 0;
                    t08.d = SystemClock.uptimeMillis();
                    String[] list = t08.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    t08.e = list.length < 800;
                }
                z = t08.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.b79
    public boolean g(kjh kjhVar) {
        a35 a35Var = kjhVar.a;
        if ((a35Var instanceof t25 ? ((t25) a35Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        a35 a35Var2 = kjhVar.b;
        return (a35Var2 instanceof t25 ? ((t25) a35Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.lkk
    public Object i(wga wgaVar, float f2) {
        return nha.b(wgaVar, f2);
    }

    @Override // defpackage.ss3
    public List j(jl9 jl9Var) {
        jl9Var.getClass();
        return km5.a;
    }

    public void k(wzc wzcVar, n9j n9jVar, uah uahVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-818661242);
        int i3 = i2 | (av8Var.h(true) ? 4 : 2) | (av8Var.h(false) ? 32 : 16) | (av8Var.g(wzcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(n9jVar) ? 16384 : 8192) | (av8Var.g(uahVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (38347923 & i3) != 38347922)) {
            av8Var.Y();
            if ((i2 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            e12.a(0, av8Var, td4.Y(utc.a, new dvi(13, uahVar, new eaj(new apa(0, 6, cdi.class, wih.a(((Boolean) xw3.z(wzcVar, av8Var, (i3 >> 6) & 14).getValue()).booleanValue() ? n9jVar.e : n9jVar.f, ufa.I(bwc.d, av8Var), null, av8Var, 0, 12), U3.i.X, "getValue()Ljava/lang/Object;")))).z(new k1a(wzcVar, n9jVar, uahVar)));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i2, 17, this, wzcVar, n9jVar, uahVar);
        }
    }

    @Override // defpackage.hg3
    public int l(f7 f7Var, int i2, Object obj, int i3) {
        f7Var.n((OutputStream) obj, i2);
        return 0;
    }

    public void m(final String str, final Function2 function2, final wzc wzcVar, final Function2 function22, final Function2 function23, final Function2 function24, uah uahVar, final n9j n9jVar, final t3e t3eVar, Function2 function25, of3 of3Var, final int i2) {
        int i3;
        Function2 function26;
        Function2 function27;
        av8 av8Var;
        final uah uahVar2;
        final Function2 function28;
        int i4;
        Function2 H;
        uah uahVar3;
        yhk yhkVar = wib.j;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1806980801);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.h(true) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.h(true) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.g(yhkVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.g(wzcVar) ? 131072 : 65536;
        }
        int i5 = i3 | 14155776;
        if ((100663296 & i2) == 0) {
            function26 = function22;
            i5 |= av8Var2.i(function26) ? 67108864 : 33554432;
        } else {
            function26 = function22;
        }
        if ((805306368 & i2) == 0) {
            function27 = function23;
            i5 |= av8Var2.i(function27) ? 536870912 : 268435456;
        } else {
            function27 = function23;
        }
        int i6 = (av8Var2.g(n9jVar) ? 131072 : 65536) | 100674998 | (av8Var2.g(t3eVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        int i7 = 1;
        if (av8Var2.T(i5 & 1, ((i5 & 306783379) == 306783378 && (38347923 & i6) == 38347922) ? false : true)) {
            av8Var2.Y();
            if ((i2 & 1) == 0 || av8Var2.B()) {
                uah b2 = ech.b(k28.d, av8Var2);
                i4 = i6 & (-57345);
                H = yqo.H(417908150, av8Var2, new lfc(i7, wzcVar, n9jVar, b2));
                uahVar3 = b2;
            } else {
                av8Var2.W();
                i4 = i6 & (-57345);
                uahVar3 = uahVar;
                H = function25;
            }
            av8Var2.t();
            boolean z = ((i5 & 14) == 4) | ((i5 & 57344) == 16384);
            Object O = av8Var2.O();
            if (z || O == nf3.a) {
                O = yhkVar.a(new q80(str));
                av8Var2.n0(O);
            }
            String str2 = ((gwj) O).a.b;
            vcj vcjVar = vcj.a;
            uaj uajVar = new uaj();
            av8Var2.d0(-1353131191);
            av8Var2.s(false);
            int i8 = i5 >> 9;
            av8Var = av8Var2;
            qha.a(vcjVar, str2, function2, uajVar, null, function26, function27, function24, null, true, true, false, wzcVar, t3eVar, n9jVar, H, av8Var, ((i5 << 3) & 896) | 6 | (i8 & 458752) | (i8 & 3670016) | 918552576, 6 | ((i5 >> 6) & 112) | (i5 & 896) | (i8 & 7168) | ((i5 >> 3) & 57344) | ((i4 >> 3) & 458752) | ((i4 << 3) & 3670016) | 12582912);
            function28 = H;
            uahVar2 = uahVar3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            uahVar2 = uahVar;
            function28 = function25;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: daj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hjg.this.m(str, function2, wzcVar, function22, function23, function24, uahVar2, n9jVar, t3eVar, function28, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.vu3
    public Object f(uu3 uu3Var) {
        throw uu3Var;
    }

    @Override // defpackage.um6
    public void h(Object obj) {
    }
}
