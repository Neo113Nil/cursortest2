package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidCacheAssets.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidCacheAssets", f = "AndroidCacheAssets.kt", l = {58}, m = "invoke")
/* loaded from: classes14.dex */
public final class AndroidCacheAssets$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidCacheAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheAssets$invoke$1(AndroidCacheAssets androidCacheAssets, spj<? super AndroidCacheAssets$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = androidCacheAssets;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
