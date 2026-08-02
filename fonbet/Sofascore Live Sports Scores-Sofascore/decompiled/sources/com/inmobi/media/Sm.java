package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sm extends hoi implements Function2 {
    public Ol a;
    public int b;
    public final /* synthetic */ Ol c;
    public final /* synthetic */ double d;
    public final /* synthetic */ EnumC3369df e;
    public final /* synthetic */ int f;
    public final /* synthetic */ AdConfig.VastVideoConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sm(Ol ol, double d, EnumC3369df enumC3369df, int i, AdConfig.VastVideoConfig vastVideoConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = ol;
        this.d = d;
        this.e = enumC3369df;
        this.f = i;
        this.g = vastVideoConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Sm(this.c, this.d, this.e, this.f, this.g, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sm) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Ol ol;
        lu3 lu3Var = lu3.a;
        int i = this.b;
        if (i == 0) {
            y6a.M(obj);
            Ol ol2 = this.c;
            double d = this.d;
            EnumC3369df enumC3369df = this.e;
            int i2 = this.f;
            AdConfig.VastVideoConfig vastVideoConfig = this.g;
            this.a = ol2;
            this.b = 1;
            obj = Vm.a(ol2, d, enumC3369df, i2, vastVideoConfig, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            ol = ol2;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ol = this.a;
            y6a.M(obj);
        }
        return new Pair(ol, obj);
    }
}
