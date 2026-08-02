package com.inmobi.media;

import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.l1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3561l1 extends hoi implements Function2 {
    public final /* synthetic */ AbstractC3587m1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3561l1(AbstractC3587m1 abstractC3587m1, String str, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = abstractC3587m1;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3561l1(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3561l1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        com.inmobi.media.ads.network.common.model.Ad b = this.a.b(0);
        if (b == null || !Intrinsics.c(b.getImpressionId(), this.b)) {
            C3906y9 c3906y9 = this.a.i;
            if (c3906y9 != null) {
                c3906y9.b("m1", "Impression ID is null for saveBlob");
            }
        } else {
            this.a.a(b, this.c);
            C3906y9 c3906y92 = this.a.i;
            if (c3906y92 != null) {
                c3906y92.c("m1", "Updated blob " + this.c);
            }
        }
        return Unit.a;
    }
}
