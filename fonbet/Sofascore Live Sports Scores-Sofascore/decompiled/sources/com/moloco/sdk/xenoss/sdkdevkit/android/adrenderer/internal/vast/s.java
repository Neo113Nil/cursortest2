package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.fsf;
import defpackage.sq3;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s extends sq3 {
    public u r;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u s;
    public ArrayList t;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a u;
    public fsf v;
    public /* synthetic */ Object w;
    public final /* synthetic */ u x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, sq3 sq3Var) {
        super(sq3Var);
        this.x = uVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.f(null, null, null, null, 0.0d, null, null, false, null, this);
    }
}
