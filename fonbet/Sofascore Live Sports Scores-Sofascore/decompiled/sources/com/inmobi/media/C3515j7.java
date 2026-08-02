package com.inmobi.media;

import defpackage.sq3;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.j7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3515j7 extends sq3 {
    public int a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3800u7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3515j7(C3800u7 c3800u7, sq3 sq3Var) {
        super(sq3Var);
        this.d = c3800u7;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
