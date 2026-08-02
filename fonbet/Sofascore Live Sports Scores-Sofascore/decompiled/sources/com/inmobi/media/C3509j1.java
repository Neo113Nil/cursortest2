package com.inmobi.media;

import defpackage.hoi;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.j1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3509j1 extends hoi implements Function2 {
    public final /* synthetic */ AbstractC3587m1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ K2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3509j1(AbstractC3587m1 abstractC3587m1, String str, K2 k2, String str2, String str3, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = abstractC3587m1;
        this.b = str;
        this.c = k2;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3509j1(this.a, this.b, this.c, this.d, this.e, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3509j1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad b = this.a.b(0);
            if (b == null || !Intrinsics.c(b.getImpressionId(), this.b)) {
                C3906y9 c3906y9 = this.a.i;
                if (c3906y9 != null) {
                    c3906y9.c("m1", "Returning blob as empty string");
                }
                ((GestureDetectorOnGestureListenerC3889xi) this.c).c(this.d, this.e, "");
            } else {
                String webVast = b.getWebVast();
                ((GestureDetectorOnGestureListenerC3889xi) this.c).c(this.d, this.e, webVast);
                C3906y9 c3906y92 = this.a.i;
                if (c3906y92 != null) {
                    c3906y92.c("m1", "Returning blob " + webVast);
                }
            }
        } catch (Exception e) {
            C3906y9 c3906y93 = this.a.i;
            if (c3906y93 != null) {
                c3906y93.a("m1", "Exception while getBlob", e);
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
        return Unit.a;
    }
}
