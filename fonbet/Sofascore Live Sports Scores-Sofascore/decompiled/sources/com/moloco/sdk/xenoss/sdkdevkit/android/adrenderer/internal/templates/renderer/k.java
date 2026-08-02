package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k extends sq3 {
    public Bitmap r;
    public /* synthetic */ Object s;
    public final /* synthetic */ m t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = mVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
