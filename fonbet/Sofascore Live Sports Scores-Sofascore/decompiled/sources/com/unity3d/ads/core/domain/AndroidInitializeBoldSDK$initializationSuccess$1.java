package com.unity3d.ads.core.domain;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {128, 129, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "initializationSuccess")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidInitializeBoldSDK$initializationSuccess$1 extends sq3 {
    double D$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInitializeBoldSDK$initializationSuccess$1(AndroidInitializeBoldSDK androidInitializeBoldSDK, rq3<? super AndroidInitializeBoldSDK$initializationSuccess$1> rq3Var) {
        super(rq3Var);
        this.this$0 = androidInitializeBoldSDK;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object initializationSuccess;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initializationSuccess = this.this$0.initializationSuccess(null, null, false, this);
        return initializationSuccess;
    }
}
