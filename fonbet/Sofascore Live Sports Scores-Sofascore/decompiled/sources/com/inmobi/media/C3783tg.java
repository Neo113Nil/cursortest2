package com.inmobi.media;

import defpackage.sq3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.tg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3783tg extends sq3 {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3809ug c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3783tg(C3809ug c3809ug, sq3 sq3Var) {
        super(sq3Var);
        this.c = c3809ug;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
