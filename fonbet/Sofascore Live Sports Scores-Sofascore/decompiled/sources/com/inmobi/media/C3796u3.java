package com.inmobi.media;

import defpackage.a70;
import defpackage.dmi;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3796u3 extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ InterfaceC3880x9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3796u3(String str, boolean z, InterfaceC3880x9 interfaceC3880x9, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = str;
        this.c = z;
        this.d = interfaceC3880x9;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3796u3(this.b, this.c, this.d, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3796u3) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                E3 e3 = E3.a;
                E3 e32 = E3.a;
                if (E3.e()) {
                    int maxRetries = E3.c().getMaxRetries();
                    String str = this.b;
                    Z2 z2 = new Z2(str, this.c, false, maxRetries + 1, 197);
                    InterfaceC3880x9 interfaceC3880x9 = this.d;
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).a("E3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    InterfaceC3880x9 interfaceC3880x92 = this.d;
                    this.a = 1;
                    if (e32.a(z2, null, interfaceC3880x92, this) == lu3Var) {
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
            InterfaceC3880x9 interfaceC3880x93 = this.d;
            if (interfaceC3880x93 != null) {
                E3 e33 = E3.a;
                ((C3906y9) interfaceC3880x93).b("E3", dmi.q("SDK encountered unexpected error in pinging click; ", e.getMessage()));
            }
        }
        return Unit.a;
    }
}
