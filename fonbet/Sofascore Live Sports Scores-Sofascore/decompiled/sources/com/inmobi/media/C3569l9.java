package com.inmobi.media;

import defpackage.rq3;
import defpackage.sq3;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3569l9 extends sq3 {
    public Function1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3724r9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3569l9(C3724r9 c3724r9, rq3 rq3Var) {
        super(rq3Var);
        this.c = c3724r9;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Function1) null, this);
    }
}
