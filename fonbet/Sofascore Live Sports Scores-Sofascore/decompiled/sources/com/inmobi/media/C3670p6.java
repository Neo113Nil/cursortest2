package com.inmobi.media;

import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.p6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3670p6 extends hoi implements Function2 {
    public final /* synthetic */ C3592m6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C3773t6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3670p6(C3592m6 c3592m6, boolean z, C3773t6 c3773t6, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = c3592m6;
        this.b = z;
        this.c = c3773t6;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3670p6(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3670p6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        return Unit.a;
    }
}
