package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.sq3;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class o extends sq3 {
    public /* synthetic */ Object A;
    public final /* synthetic */ u B;
    public int C;
    public u r;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b s;
    public f t;
    public com.moloco.sdk.common_adapter_internal.a u;
    public String v;
    public ArrayList w;
    public double x;
    public boolean y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, sq3 sq3Var) {
        super(sq3Var);
        this.B = uVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, 0.0d, null, false, null, this);
    }
}
