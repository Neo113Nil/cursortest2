package com.inmobi.media;

import defpackage.a70;
import defpackage.av4;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.nu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Go extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ InterfaceC3880x9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Go(String str, InterfaceC3880x9 interfaceC3880x9, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = str;
        this.c = interfaceC3880x9;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new Go(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Go(this.b, this.c, (rq3) obj).invokeSuspend(Unit.a);
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
        Io io2 = Io.a;
        String str = this.b;
        InterfaceC3880x9 interfaceC3880x9 = this.c;
        this.a = 1;
        ku3 ku3Var = L9.d;
        nu3 nu3Var = nu3.a;
        av4 t = xw3.t(ku3Var, null, new Eo(str, interfaceC3880x9, null), 1);
        return t == lu3Var ? lu3Var : t;
    }
}
