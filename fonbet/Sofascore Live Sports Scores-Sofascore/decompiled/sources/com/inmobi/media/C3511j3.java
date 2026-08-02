package com.inmobi.media;

import android.os.Message;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3511j3 extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Z2 c;
    public final /* synthetic */ HandlerC3641o3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3511j3(Z2 z2, HandlerC3641o3 handlerC3641o3, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = z2;
        this.d = handlerC3641o3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3511j3 c3511j3 = new C3511j3(this.c, this.d, rq3Var);
        c3511j3.b = obj;
        return c3511j3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3511j3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.b;
            C3744s3 c3744s3 = new C3744s3();
            Z2 z2 = this.c;
            this.b = ku3Var;
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
        if (((EnumC3489i6) obj) != null) {
            HandlerC3641o3 handlerC3641o3 = this.d;
            Z2 z22 = this.c;
            int i2 = HandlerC3641o3.a;
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = z22;
            handlerC3641o3.sendMessage(obtain);
        } else {
            Z2 z23 = this.c;
            HandlerC3641o3 handlerC3641o32 = this.d;
            E3 e3 = E3.a;
            String str = z23.b;
            E3.b(z23);
            int i3 = HandlerC3641o3.a;
            handlerC3641o32.b(z23);
        }
        return Unit.a;
    }
}
