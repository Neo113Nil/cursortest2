package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.joa;
import defpackage.k8f;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Nh extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Sh b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ RootConfig e;
    public final /* synthetic */ List f;
    public final /* synthetic */ k8f g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(Sh sh, String str, String str2, RootConfig rootConfig, List list, k8f k8fVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = sh;
        this.c = str;
        this.d = str2;
        this.e = rootConfig;
        this.f = list;
        this.g = k8fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Nh(this.b, this.c, this.d, this.e, this.f, this.g, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Nh) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                Sh sh = this.b;
                String str = this.c;
                String str2 = this.d;
                RootConfig rootConfig = this.e;
                List list = this.f;
                k8f k8fVar = this.g;
                this.a = 1;
                if (sh.a(str, str2, rootConfig, list, k8fVar, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
        return Unit.a;
    }
}
