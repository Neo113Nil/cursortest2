package com.unity3d.ads.core.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: CommonCacheFile.kt */
@b6l(c = "com.unity3d.ads.core.domain.CommonCacheFile", f = "CommonCacheFile.kt", l = {33}, m = "invoke")
/* loaded from: classes14.dex */
public final class CommonCacheFile$invoke$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonCacheFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCacheFile$invoke$1(CommonCacheFile commonCacheFile, spj<? super CommonCacheFile$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = commonCacheFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, 0, 0, null, this);
    }
}
