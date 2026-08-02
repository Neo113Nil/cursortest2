package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.j2;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e1 extends sq3 {
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public j2 v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ g1 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(g1 g1Var, sq3 sq3Var) {
        super(sq3Var);
        this.y = g1Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(null, 0L, null, null, null, this);
    }
}
