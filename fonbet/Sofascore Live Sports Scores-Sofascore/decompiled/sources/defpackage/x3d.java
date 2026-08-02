package defpackage;

import android.content.Context;
import com.sofascore.model.firebase.AdConfig;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.AdUnit;
import com.sofascore.model.firebase.BaseAdUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x3d extends hoi implements Function2 {
    public final /* synthetic */ h4d r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ AdType.Native t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3d(h4d h4dVar, Context context, AdType.Native r3, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = h4dVar;
        this.s = context;
        this.t = r3;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new x3d(this.r, this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x3d) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        AdUnit adUnit;
        BaseAdUnit.GamAdUnit gam;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Context context = this.s;
        context.getClass();
        AdType.Native r5 = this.t;
        r5.getClass();
        AdConfig f = it7.h.f(r5);
        AdConfig.Native r10 = f instanceof AdConfig.Native ? (AdConfig.Native) f : null;
        h4d h4dVar = this.r;
        tee teeVar = (tee) h4dVar.d.getValue();
        int i = this.u;
        wg wgVar = (wg) teeVar.get(Integer.valueOf(i));
        if (!(wgVar instanceof vg) && !(wgVar instanceof ug)) {
            xw3.L(h4dVar.b, null, null, new g4d((r10 == null || (adUnit = r10.getAdUnit()) == null || (gam = adUnit.getGam()) == null) ? null : gam.getAdUnitId(), h4dVar, context, r5, i, null), 3);
        }
        return Unit.a;
    }
}
