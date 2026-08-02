package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pvg extends hoi implements Function2 {
    public svg r;
    public esf s;
    public long t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ svg w;
    public final /* synthetic */ esf x;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvg(svg svgVar, esf esfVar, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = svgVar;
        this.x = esfVar;
        this.y = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        pvg pvgVar = new pvg(this.w, this.x, this.y, rq3Var);
        pvgVar.v = obj;
        return pvgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pvg) create((qvg) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        svg svgVar;
        esf esfVar;
        svg svgVar2;
        long j;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        int i2 = 1;
        if (i == 0) {
            y6a.M(obj);
            qvg qvgVar = (qvg) this.v;
            svgVar = this.w;
            qw qwVar = new qw(i2, svgVar, qvgVar);
            p78 p78Var = svgVar.c;
            esfVar = this.x;
            long j2 = esfVar.a;
            ewd ewdVar = svgVar.d;
            ewd ewdVar2 = ewd.b;
            long j3 = this.y;
            float d = svgVar.d(ewdVar == ewdVar2 ? vmk.b(j3) : vmk.c(j3));
            this.v = svgVar;
            this.r = svgVar;
            this.s = esfVar;
            this.t = j2;
            this.u = 1;
            obj = p78Var.a(qwVar, d, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            svgVar2 = svgVar;
            j = j2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.t;
            esfVar = this.s;
            svgVar = this.r;
            svgVar2 = (svg) this.v;
            y6a.M(obj);
        }
        float d2 = svgVar2.d(((Number) obj).floatValue());
        esfVar.a = svgVar.d == ewd.b ? vmk.a(j, d2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2) : vmk.a(j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d2, 1);
        return Unit.a;
    }
}
