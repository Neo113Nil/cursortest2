package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Bd extends hoi implements Function2 {
    public final /* synthetic */ Cd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bd(Cd cd, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = cd;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Bd(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Bd(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        InterfaceC3880x9 l = this.a.l();
        if (l != null) {
            ((C3906y9) l).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        Cd cd = this.a;
        Uc uc = cd.i;
        C3678pe c3678pe = cd.f;
        G g = cd.a.b;
        uc.a(c3678pe, new AdMetaInfo(g.e, g.l));
        return Unit.a;
    }
}
