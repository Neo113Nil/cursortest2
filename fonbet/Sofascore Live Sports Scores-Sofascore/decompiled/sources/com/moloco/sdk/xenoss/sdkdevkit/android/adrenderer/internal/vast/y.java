package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.sq3;
import java.io.StringReader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class y extends sq3 {
    public StringReader r;
    public /* synthetic */ Object s;
    public final /* synthetic */ z t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = zVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
