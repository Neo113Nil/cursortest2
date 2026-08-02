package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.joa;
import defpackage.sq3;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i extends sq3 {
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k A;
    public Iterator B;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j C;
    public double D;
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ u G;
    public int H;
    public u r;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t s;
    public d t;
    public com.moloco.sdk.common_adapter_internal.a u;
    public String v;
    public List w;
    public joa x;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i y;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u uVar, sq3 sq3Var) {
        super(sq3Var);
        this.G = uVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.e(null, null, 0.0d, null, false, null, this);
    }
}
