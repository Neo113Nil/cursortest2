package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import defpackage.a70;
import defpackage.b98;
import defpackage.fsf;
import defpackage.hoi;
import defpackage.km5;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sn2;
import defpackage.y6a;
import defpackage.yso;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Lh extends hoi implements Function2 {
    public String a;
    public fsf b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Mh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lh(Mh mh, rq3 rq3Var) {
        super(2, rq3Var);
        this.e = mh;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Lh lh = new Lh(this.e, rq3Var);
        lh.d = obj;
        return lh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Lh lh = new Lh(this.e, (rq3) obj2);
        lh.d = (b98) obj;
        return lh.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        b98 b98Var;
        String str;
        fsf fsfVar;
        lu3 lu3Var = lu3.a;
        int i = this.c;
        if (i == 0) {
            y6a.M(obj);
            b98Var = (b98) this.d;
            str = AbstractC3424fj.c;
            if (str == null) {
                return Unit.a;
            }
            fsfVar = new fsf();
            fsfVar.a = Mh.a(this.e);
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fsfVar = this.b;
            str = this.a;
            b98Var = (b98) this.d;
            y6a.M(obj);
        }
        String str2 = str;
        b98 b98Var2 = b98Var;
        while (!((Collection) fsfVar.a).isEmpty()) {
            List list = (List) fsfVar.a;
            fsfVar.a = km5.a;
            Sh sh = (Sh) this.e.b.getValue();
            RootConfig rootConfig = (RootConfig) AbstractC3435g4.a.a(RootConfig.class);
            sh.getClass();
            str2.getClass();
            rootConfig.getClass();
            list.getClass();
            sn2 r = yso.r(new Ph(list, sh, str2, rootConfig, null));
            Kh kh = new Kh(this.e, b98Var2, fsfVar);
            this.d = b98Var2;
            this.a = str2;
            this.b = fsfVar;
            this.c = 1;
            if (r.collect(kh, this) == lu3Var) {
                return lu3Var;
            }
        }
        return Unit.a;
    }
}
