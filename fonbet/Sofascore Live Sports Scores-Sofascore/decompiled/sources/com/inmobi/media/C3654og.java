package com.inmobi.media;

import defpackage.sq3;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3654og extends sq3 {
    public C3473hg a;
    public Function2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractC3680pg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3654og(AbstractC3680pg abstractC3680pg, sq3 sq3Var) {
        super(sq3Var);
        this.d = abstractC3680pg;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
