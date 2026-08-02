package com.vk.push.core.feature;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: FeatureManagerImpl.kt */
@b6l(c = "com.vk.push.core.feature.FeatureManagerImpl", f = "FeatureManagerImpl.kt", l = {116}, m = "getFileUpdateInterval")
/* loaded from: classes.dex */
public final class a extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeatureManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FeatureManagerImpl featureManagerImpl, spj<? super a> spjVar) {
        super(spjVar);
        this.this$0 = featureManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FeatureManagerImpl.access$getFileUpdateInterval(this.this$0, this);
    }
}
