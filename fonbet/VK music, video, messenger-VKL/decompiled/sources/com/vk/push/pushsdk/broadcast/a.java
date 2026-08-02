package com.vk.push.pushsdk.broadcast;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: FullyPackageRemovedReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.broadcast.FullyPackageRemovedReceiver", f = "FullyPackageRemovedReceiver.kt", l = {72, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "handlePackageRemoved")
/* loaded from: classes5.dex */
public final class a extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FullyPackageRemovedReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FullyPackageRemovedReceiver fullyPackageRemovedReceiver, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fullyPackageRemovedReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FullyPackageRemovedReceiver.a(this.this$0, null, this);
    }
}
