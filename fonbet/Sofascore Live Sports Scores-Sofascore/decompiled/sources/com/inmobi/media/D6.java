package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import defpackage.sq3;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class D6 extends sq3 {
    public List a;
    public OmSdkInfo b;
    public /* synthetic */ Object c;
    public final /* synthetic */ E6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D6(E6 e6, sq3 sq3Var) {
        super(sq3Var);
        this.d = e6;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
