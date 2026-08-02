package com.inmobi.media;

import defpackage.a70;
import defpackage.dmi;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zu4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ho extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ InterfaceC3880x9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zu4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ho(InterfaceC3880x9 interfaceC3880x9, String str, zu4 zu4Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = interfaceC3880x9;
        this.c = str;
        this.d = zu4Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ho(this.b, this.c, this.d, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ho) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("WebResourceHandler", dmi.q("Waiting for response to finish download: ", this.c));
        }
        zu4 zu4Var = this.d;
        this.a = 1;
        Object T = zu4Var.T(this);
        return T == lu3Var ? lu3Var : T;
    }
}
