package com.usercentrics.sdk.acm.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AdditionalConsentModeRemoteRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.acm.repository.AdditionalConsentModeRemoteRepositoryImpl", f = "AdditionalConsentModeRemoteRepositoryImpl.kt", i = {0, 0, 0}, l = {22}, m = "loadAdTechProviderList", n = {"this", "selectedIds", "consentedIds"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdditionalConsentModeRemoteRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1(AdditionalConsentModeRemoteRepositoryImpl additionalConsentModeRemoteRepositoryImpl, Continuation<? super AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$1> continuation) {
        super(continuation);
        this.this$0 = additionalConsentModeRemoteRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadAdTechProviderList(null, null, this);
    }
}
