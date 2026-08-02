package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: GetCachedAsset.kt */
@b6l(c = "com.unity3d.ads.core.domain.GetCachedAsset$getLegacyCachedAsset$result$1", f = "GetCachedAsset.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class GetCachedAsset$getLegacyCachedAsset$result$1 extends SuspendLambda implements wzs<yvj, spj<? super CacheResult>, Object> {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedAsset$getLegacyCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, spj<? super GetCachedAsset$getLegacyCachedAsset$result$1> spjVar) {
        super(2, spjVar);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new GetCachedAsset$getLegacyCachedAsset$result$1(this.this$0, this.$fileName, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CacheRepository cacheRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        cacheRepository = this.this$0.cacheRepository;
        String str = this.$fileName;
        this.label = 1;
        Object retrieveFile = cacheRepository.retrieveFile(str, this);
        return retrieveFile == coroutineSingletons ? coroutineSingletons : retrieveFile;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super CacheResult> spjVar) {
        return ((GetCachedAsset$getLegacyCachedAsset$result$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
