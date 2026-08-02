package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tz9;
import defpackage.y6a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ph extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Sh d;
    public final /* synthetic */ String e;
    public final /* synthetic */ RootConfig f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ph(List list, Sh sh, String str, RootConfig rootConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = list;
        this.d = sh;
        this.e = str;
        this.f = rootConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Ph ph = new Ph(this.c, this.d, this.e, this.f, rq3Var);
        ph.b = obj;
        return ph;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ph) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            Oh oh = new Oh(this.c, this.d, this.e, this.f, (k8f) this.b, null);
            this.a = 1;
            if (tz9.P(oh, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
