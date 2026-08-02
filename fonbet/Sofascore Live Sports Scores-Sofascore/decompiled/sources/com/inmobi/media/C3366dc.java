package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.dc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3366dc extends hoi implements Function1 {
    public final /* synthetic */ Kb a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3366dc(Kb kb, long j, int i, rq3 rq3Var) {
        super(1, rq3Var);
        this.a = kb;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3366dc(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3366dc) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        xw3.L(L9.c, null, null, new C3340cc(this.a, this.b, this.c, null), 3);
        return Unit.a;
    }
}
