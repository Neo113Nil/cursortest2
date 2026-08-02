package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.me, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3600me extends hoi implements Function2 {
    public final /* synthetic */ C3652oe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3600me(C3652oe c3652oe, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = c3652oe;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3600me(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3600me(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.a.g.setActivated(true);
        this.a.g.setFocusable(true);
        C3652oe c3652oe = this.a;
        if (c3652oe.i) {
            c3652oe.a();
        } else {
            X4.a(c3652oe.b, new C3626ne(c3652oe, null));
        }
        return Unit.a;
    }
}
