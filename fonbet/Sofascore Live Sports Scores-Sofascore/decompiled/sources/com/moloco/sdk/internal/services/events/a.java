package com.moloco.sdk.internal.services.events;

import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.j3;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a extends sq3 {
    public c r;
    public h0 s;
    public j3 t;
    public j3 u;
    public j3 v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ c y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, sq3 sq3Var) {
        super(sq3Var);
        this.y = cVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(0L, null, this);
    }
}
