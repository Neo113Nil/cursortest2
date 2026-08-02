package com.inmobi.media;

import android.os.SystemClock;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.z3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3926z3 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Z2 b;
    public final /* synthetic */ InterfaceC3880x9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3926z3(Z2 z2, InterfaceC3880x9 interfaceC3880x9, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = z2;
        this.c = interfaceC3880x9;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3926z3(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3926z3(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            E3 e3 = E3.a;
            SystemClock.elapsedRealtime();
            boolean z = this.b.e;
            InterfaceC3880x9 interfaceC3880x9 = this.c;
            if (z) {
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).c("E3", "ping in web view");
                }
                new C3693q3(E3.l).a(this.b);
                return Unit.a;
            }
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).c("E3", "ping in http executor");
            }
            C3744s3 c3744s3 = new C3744s3();
            Z2 z2 = this.b;
            this.a = 1;
            obj = c3744s3.a(z2, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        EnumC3489i6 enumC3489i6 = (EnumC3489i6) obj;
        Z2 z22 = this.b;
        if (enumC3489i6 != null) {
            E3.l.a(z22, enumC3489i6);
        } else {
            E3.l.a(z22);
        }
        return Unit.a;
    }
}
