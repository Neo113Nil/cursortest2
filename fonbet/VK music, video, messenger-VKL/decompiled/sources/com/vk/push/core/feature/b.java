package com.vk.push.core.feature;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: FeatureManagerImpl.kt */
@b6l(c = "com.vk.push.core.feature.FeatureManagerImpl", f = "FeatureManagerImpl.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "saveIssueKeysBlacklist")
/* loaded from: classes.dex */
public final class b extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeatureManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FeatureManagerImpl featureManagerImpl, spj<? super b> spjVar) {
        super(spjVar);
        this.this$0 = featureManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FeatureManagerImpl.access$saveIssueKeysBlacklist(this.this$0, this);
    }
}
