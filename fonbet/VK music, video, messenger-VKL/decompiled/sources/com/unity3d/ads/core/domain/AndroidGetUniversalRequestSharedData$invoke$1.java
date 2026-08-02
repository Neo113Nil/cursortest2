package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidGetUniversalRequestSharedData.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData", f = "AndroidGetUniversalRequestSharedData.kt", l = {24}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidGetUniversalRequestSharedData$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetUniversalRequestSharedData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetUniversalRequestSharedData$invoke$1(AndroidGetUniversalRequestSharedData androidGetUniversalRequestSharedData, spj<? super AndroidGetUniversalRequestSharedData$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidGetUniversalRequestSharedData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
