package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d02 {
    public static final d02 a = new d02();
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        hbh hbhVar = yeh.a;
        float f = yeh.e;
        b = 640.0f;
        c = 56.0f;
        d = 125.0f;
    }

    public static j7b b(of3 of3Var) {
        WeakHashMap weakHashMap = cal.w;
        return new j7b(qea.p(of3Var).l, 48);
    }

    public final void a(xtc xtcVar, float f, float f2, uah uahVar, long j, of3 of3Var, final int i) {
        av8 av8Var;
        final xtc xtcVar2;
        final float f3;
        final float f4;
        final uah uahVar2;
        final long j2;
        uah uahVar3;
        long d2;
        float f5;
        float f6;
        xtc xtcVar3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1364277227);
        int i2 = i | 9654;
        int i3 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            av8Var2.Y();
            if ((i & 1) == 0 || av8Var2.B()) {
                float f7 = yeh.d;
                float f8 = yeh.c;
                uahVar3 = ((cch) av8Var2.k(ech.a)).e;
                d2 = i23.d(yeh.b, av8Var2);
                f5 = f8;
                f6 = f7;
                xtcVar3 = utc.a;
            } else {
                av8Var2.W();
                xtcVar3 = xtcVar;
                f6 = f;
                f5 = f2;
                uahVar3 = uahVar;
                d2 = j;
            }
            av8Var2.t();
            String B = cga.B(R.string.m3c_bottom_sheet_drag_handle_description, av8Var2);
            i4k i4kVar = bfh.a;
            xtc d0 = l98.d0(xtcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 22.0f, 1);
            boolean g = av8Var2.g(B);
            Object O = av8Var2.O();
            if (g || O == nf3.a) {
                O = new jp1(B, i3);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            uni.a(o3h.a(d0, false, (Function1) O), uahVar3, d2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(-1039573072, av8Var2, new c02(f6, f5)), av8Var, 12582912, 120);
            f4 = f5;
            uahVar2 = uahVar3;
            j2 = d2;
            f3 = f6;
            xtcVar2 = xtcVar3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
            f3 = f;
            f4 = f2;
            uahVar2 = uahVar;
            j2 = j;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(xtcVar2, f3, f4, uahVar2, j2, i) { // from class: b02
                public final /* synthetic */ xtc b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ uah e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(196609);
                    d02.this.a(this.b, this.c, this.d, this.e, this.f, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }
}
