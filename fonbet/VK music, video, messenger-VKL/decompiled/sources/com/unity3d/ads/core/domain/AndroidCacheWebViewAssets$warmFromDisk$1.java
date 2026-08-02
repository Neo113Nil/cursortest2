package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidCacheWebViewAssets.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidCacheWebViewAssets", f = "AndroidCacheWebViewAssets.kt", l = {57}, m = "warmFromDisk")
/* loaded from: classes14.dex */
public final class AndroidCacheWebViewAssets$warmFromDisk$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidCacheWebViewAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheWebViewAssets$warmFromDisk$1(AndroidCacheWebViewAssets androidCacheWebViewAssets, spj<? super AndroidCacheWebViewAssets$warmFromDisk$1> spjVar) {
        super(spjVar);
        this.this$0 = androidCacheWebViewAssets;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.warmFromDisk(null, this);
    }
}
