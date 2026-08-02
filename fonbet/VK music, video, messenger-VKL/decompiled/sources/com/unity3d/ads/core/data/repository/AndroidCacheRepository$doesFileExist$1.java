package com.unity3d.ads.core.data.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: AndroidCacheRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", l = {135}, m = "doesFileExist")
/* loaded from: classes14.dex */
public final class AndroidCacheRepository$doesFileExist$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$doesFileExist$1(AndroidCacheRepository androidCacheRepository, spj<? super AndroidCacheRepository$doesFileExist$1> spjVar) {
        super(spjVar);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doesFileExist(null, this);
    }
}
