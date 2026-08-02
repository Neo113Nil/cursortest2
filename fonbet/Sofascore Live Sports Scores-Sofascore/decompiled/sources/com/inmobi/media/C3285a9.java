package com.inmobi.media;

import com.inmobi.ads.rendering.InMobiAdActivity;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.vxd;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3285a9 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ InMobiAdActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3285a9(long j, InMobiAdActivity inMobiAdActivity, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = j;
        this.c = inMobiAdActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3285a9(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3285a9(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            long j = this.b;
            this.a = 1;
            if (n4o.y(j, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        InterfaceC3880x9 interfaceC3880x9 = this.c.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("EmbeddedBrowser", vxd.m("Landing page loading timed out after ", this.b, " ms"));
        }
        this.c.a("LOADER_TIMEOUT");
        return Unit.a;
    }
}
