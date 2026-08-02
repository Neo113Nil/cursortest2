package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.izs;
import xsna.n7i;
import xsna.o7i;
import xsna.p7i;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidCacheRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2", f = "AndroidCacheRepository.kt", l = {120, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidCacheRepository$getFileFromRemote$2 extends SuspendLambda implements wzs<yvj, spj<? super CacheResult>, Object> {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: AndroidCacheRepository.kt */
    @b6l(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2$1", f = "AndroidCacheRepository.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ n7i<CacheResult> $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, n7i<CacheResult> n7iVar, spj<? super AnonymousClass1> spjVar) {
            super(1, spjVar);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$fileResult = n7iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$fileResult, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CacheDataSource cacheDataSource;
            AnonymousClass1 anonymousClass1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                cacheDataSource = this.this$0.remoteCacheDataSource;
                File file = this.$cacheDirectory;
                String str = this.$filename;
                String str2 = this.$url;
                Integer num = new Integer(0);
                this.label = 1;
                anonymousClass1 = this;
                obj = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, str, str2, num, 0, null, anonymousClass1, 48, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                anonymousClass1 = this;
            }
            anonymousClass1.$fileResult.h((CacheResult) obj);
            return s3q0.a;
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getFileFromRemote$2(AndroidCacheRepository androidCacheRepository, String str, File file, spj<? super AndroidCacheRepository$getFileFromRemote$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidCacheRepository$getFileFromRemote$2(this.this$0, this.$url, this.$cacheDirectory, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DownloadPriorityQueue downloadPriorityQueue;
        n7i n7iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            String filename = this.this$0.getFilename(this.$url);
            o7i a = p7i.a();
            downloadPriorityQueue = this.this$0.downloadPriorityQueue;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cacheDirectory, filename, this.$url, a, null);
            this.L$0 = a;
            this.label = 1;
            if (downloadPriorityQueue.invoke(0, anonymousClass1, this) != coroutineSingletons) {
                n7iVar = a;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        n7iVar = (n7i) this.L$0;
        a.a(obj);
        this.L$0 = null;
        this.label = 2;
        Object H = n7iVar.H(this);
        return H == coroutineSingletons ? coroutineSingletons : H;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super CacheResult> spjVar) {
        return ((AndroidCacheRepository$getFileFromRemote$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
