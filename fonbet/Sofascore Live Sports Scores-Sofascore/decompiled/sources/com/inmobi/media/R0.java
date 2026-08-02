package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import defpackage.sq3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class R0 extends sq3 {
    public Object a;
    public AdResponse b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ S0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(S0 s0, sq3 sq3Var) {
        super(sq3Var);
        this.g = s0;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, this);
    }
}
