package com.unity3d.ads.adplayer;

import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {150, 158, 160, 164, 166, 181, 186}, m = "handleInvocationResult")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonWebViewBridge$handleInvocationResult$1 extends sq3 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWebViewBridge$handleInvocationResult$1(CommonWebViewBridge commonWebViewBridge, rq3<? super CommonWebViewBridge$handleInvocationResult$1> rq3Var) {
        super(rq3Var);
        this.this$0 = commonWebViewBridge;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handleInvocationResult;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleInvocationResult = this.this$0.handleInvocationResult(null, null, this);
        return handleInvocationResult;
    }
}
