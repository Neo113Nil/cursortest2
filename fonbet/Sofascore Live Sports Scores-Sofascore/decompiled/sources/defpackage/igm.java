package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.e;
import defpackage.acm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class igm extends hoi implements ct8 {
    public /* synthetic */ e r;
    public /* synthetic */ e s;
    public final /* synthetic */ tkm t;
    public final /* synthetic */ List u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igm(tkm tkmVar, List list, rq3 rq3Var) {
        super(3, rq3Var);
        this.t = tkmVar;
        this.u = list;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        igm igmVar = new igm(this.t, this.u, (rq3) obj3);
        igmVar.r = (e) obj;
        igmVar.s = (e) obj2;
        return igmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        e eVar = this.r;
        e eVar2 = this.s;
        this.t.getClass();
        ArrayList U0 = CollectionsKt.U0(this.u);
        CollectionsKt.H0(U0, new lnm());
        int i = 1;
        U0.add(0, new acm.b(eVar == null));
        if (eVar2 != null) {
            U0.add(1, new acm.c(eVar2, Intrinsics.c(eVar, eVar2), U0.removeIf(new rug(i, new iol(eVar2, 11)))));
        }
        return U0;
    }
}
