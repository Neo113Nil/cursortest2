package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.joa;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.wv8;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.v3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3822v3 extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C3906y9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3822v3(String str, C3906y9 c3906y9, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = str;
        this.c = c3906y9;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3822v3(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3822v3(this.b, this.c, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                E3 e3 = E3.a;
                if (E3.e()) {
                    int maxRetries = E3.c().getMaxRetries();
                    String str = this.b;
                    Z2 z2 = new Z2(str, true, false, maxRetries + 1, 193);
                    C3906y9 c3906y9 = this.c;
                    if (c3906y9 != null) {
                        c3906y9.a("E3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C3906y9 c3906y92 = this.c;
                    this.a = 1;
                    if (e3.a(z2, null, c3906y92, this) == lu3Var) {
                        return lu3Var;
                    }
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
        } catch (Exception e) {
            C3906y9 c3906y93 = this.c;
            if (c3906y93 != null) {
                E3 e32 = E3.a;
                wv8.x("SDK encountered unexpected error in pinging click; ", e.getMessage(), c3906y93, "E3");
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
        return Unit.a;
    }
}
