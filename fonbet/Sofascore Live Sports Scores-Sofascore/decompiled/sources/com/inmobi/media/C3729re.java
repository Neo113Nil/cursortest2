package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3729re extends hoi implements Function2 {
    public final /* synthetic */ He a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3729re(He he, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = he;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3729re(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3729re(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Un.a(this.a.b.c.c);
        Un.a(this.a.b.c.b);
        return Unit.a;
    }
}
