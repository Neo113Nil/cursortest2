package com.inmobi.media;

import defpackage.h2d;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3529jl extends sq3 {
    public int a;
    public String b;
    public h2d c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3581ll e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3529jl(C3581ll c3581ll, sq3 sq3Var) {
        super(sq3Var);
        this.e = c3581ll;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, null, this);
    }
}
