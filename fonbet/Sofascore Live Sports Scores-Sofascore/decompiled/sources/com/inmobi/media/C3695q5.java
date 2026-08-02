package com.inmobi.media;

import android.graphics.drawable.Drawable;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3695q5 extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C3720r5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3695q5(C3720r5 c3720r5, int i, int i2, int i3, int i4, int i5, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3720r5;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3695q5 c3695q5 = new C3695q5(this.b, this.c, this.d, this.e, this.f, this.g, rq3Var);
        c3695q5.a = obj;
        return c3695q5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3695q5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Drawable drawable = this.b.getContext().getDrawable(this.c);
        C3720r5 c3720r5 = this.b;
        if (drawable != null) {
            c3720r5.a(drawable, this.d, this.e, this.f, this.g);
            return Unit.a;
        }
        InterfaceC3880x9 interfaceC3880x9 = c3720r5.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("CustomView", lnb.k(c3720r5.a, "CustomView drawable for ", " cannot be created"));
        }
        return Unit.a;
    }
}
