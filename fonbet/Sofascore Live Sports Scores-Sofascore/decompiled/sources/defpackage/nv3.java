package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nv3 implements et8 {
    public final /* synthetic */ gv9 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ r13 d;
    public final /* synthetic */ e1d e;
    public final /* synthetic */ e1d f;

    public nv3(gv9 gv9Var, long j, long j2, r13 r13Var, e1d e1dVar, e1d e1dVar2) {
        this.a = gv9Var;
        this.b = j;
        this.c = j2;
        this.d = r13Var;
        this.e = e1dVar;
        this.f = e1dVar2;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        utc utcVar;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            uv3 uv3Var = (uv3) this.a.get(intValue);
            av8Var.d0(1664125526);
            utc utcVar2 = utc.a;
            if (intValue == 0 && uv3Var.c) {
                av8Var.d0(1664157672);
                xtc f0 = l98.f0(utcVar2, 16.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 4);
                utcVar = utcVar2;
                String v = oea.v(R.string.favourites, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v, f0, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 48, 0, 131064);
                av8Var.s(false);
            } else {
                utcVar = utcVar2;
                av8Var.d0(1664490860);
                av8Var.s(false);
            }
            e1d e1dVar = this.e;
            uv3 uv3Var2 = (uv3) e1dVar.getValue();
            boolean c = Intrinsics.c(uv3Var2 != null ? uv3Var2.b : null, uv3Var.b);
            boolean g = av8Var.g(e1dVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new mv3(0, e1dVar);
                av8Var.n0(O);
            }
            un0.c(uv3Var, c, this.b, this.c, this.d, (Function1) O, av8Var, 0);
            if (uv3Var.c) {
                uv3 uv3Var3 = (uv3) CollectionsKt.a0(intValue + 1, (gv9) this.f.getValue());
                if (uv3Var3 != null && !uv3Var3.c) {
                    av8Var.d0(1665114673);
                    xtc b0 = l98.b0(utcVar, 16.0f);
                    String v2 = oea.v(R.string.other, av8Var);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v2, b0, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 48, 0, 131064);
                    av8Var.s(false);
                    av8Var.s(false);
                }
            }
            av8Var.d0(1665408460);
            av8Var.s(false);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
