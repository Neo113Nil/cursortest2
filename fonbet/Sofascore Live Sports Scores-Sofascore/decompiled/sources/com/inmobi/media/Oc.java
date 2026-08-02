package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Oc extends hoi implements Function2 {
    public final /* synthetic */ Pc a;
    public final /* synthetic */ AdSessionConfiguration b;
    public final /* synthetic */ AdSessionContext c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oc(Pc pc, AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = pc;
        this.b = adSessionConfiguration;
        this.c = adSessionContext;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Oc(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Oc) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Pc pc = this.a;
        AdSessionConfiguration adSessionConfiguration = this.b;
        adSessionConfiguration.getClass();
        pc.a(adSessionConfiguration, this.c);
        this.a.b();
        this.a.c();
        return Unit.a;
    }
}
