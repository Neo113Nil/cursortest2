package com.unity3d.ads.core.domain;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {Sdk.SDKError.Reason.MRAID_ERROR_VALUE, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE}, m = "cleanup")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHandleGatewayAdResponse$cleanup$1 extends sq3 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$cleanup$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, rq3<? super AndroidHandleGatewayAdResponse$cleanup$1> rq3Var) {
        super(rq3Var);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object cleanup;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        cleanup = this.this$0.cleanup(null, null, null, null, this);
        return cleanup;
    }
}
