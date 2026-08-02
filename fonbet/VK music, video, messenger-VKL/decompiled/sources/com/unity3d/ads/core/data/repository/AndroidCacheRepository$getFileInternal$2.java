package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import java.io.File;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonToken;
import xsna.b6l;
import xsna.izs;
import xsna.n7i;
import xsna.o7i;
import xsna.p7i;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.yzs;

/* compiled from: AndroidCacheRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {JsonToken.BEGIN_ARRAY, JsonToken.BOOLEAN, 111}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidCacheRepository$getFileInternal$2 extends SuspendLambda implements wzs<yvj, spj<? super CacheResult>, Object> {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ yzs<Long, Long, spj<? super s3q0>, Object> $onProgress;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: AndroidCacheRepository.kt */
    @b6l(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {100, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ n7i<CacheResult> $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ yzs<Long, Long, spj<? super s3q0>, Object> $onProgress;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i, n7i<CacheResult> n7iVar, int i2, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super AnonymousClass1> spjVar) {
            super(1, spjVar);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$priority = i;
            this.$fileResult = n7iVar;
            this.$intervalMs = i2;
            this.$onProgress = yzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, this.$intervalMs, this.$onProgress, spjVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        
            if (r15 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            if (r15 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CacheDataSource cacheDataSource;
            AnonymousClass1 anonymousClass1;
            CacheDataSource cacheDataSource2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                cacheDataSource = this.this$0.localCacheDataSource;
                File file = this.$cacheDirectory;
                String str = this.$filename;
                String str2 = this.$url;
                Integer num = new Integer(this.$priority);
                this.label = 1;
                obj = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, str, str2, num, 0, null, this, 48, null);
                anonymousClass1 = this;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                    anonymousClass1 = this;
                    anonymousClass1.$fileResult.h((CacheResult) obj);
                    return s3q0.a;
                }
                a.a(obj);
                anonymousClass1 = this;
            }
            CacheResult cacheResult = (CacheResult) obj;
            if (cacheResult instanceof CacheResult.Success) {
                anonymousClass1.$fileResult.h(cacheResult);
                return s3q0.a;
            }
            cacheDataSource2 = anonymousClass1.this$0.remoteCacheDataSource;
            File file2 = anonymousClass1.$cacheDirectory;
            String str3 = anonymousClass1.$filename;
            String str4 = anonymousClass1.$url;
            Integer num2 = new Integer(anonymousClass1.$priority);
            int i2 = anonymousClass1.$intervalMs;
            yzs<Long, Long, spj<? super s3q0>, Object> yzsVar = anonymousClass1.$onProgress;
            anonymousClass1.label = 2;
            obj = cacheDataSource2.getFile(file2, str3, str4, num2, i2, yzsVar, anonymousClass1);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidCacheRepository$getFileInternal$2(AndroidCacheRepository androidCacheRepository, String str, File file, int i, int i2, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super AndroidCacheRepository$getFileInternal$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
        this.$priority = i;
        this.$intervalMs = i2;
        this.$onProgress = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidCacheRepository$getFileInternal$2(this.this$0, this.$url, this.$cacheDirectory, this.$priority, this.$intervalMs, this.$onProgress, spjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CacheDataSource cacheDataSource;
        Object file$default;
        String str;
        DownloadPriorityQueue downloadPriorityQueue;
        n7i n7iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            String filename = this.this$0.getFilename(this.$url);
            cacheDataSource = this.this$0.localCacheDataSource;
            File file = this.$cacheDirectory;
            String str2 = this.$url;
            Integer num = new Integer(this.$priority);
            this.L$0 = filename;
            this.label = 1;
            file$default = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, filename, str2, num, 0, null, this, 48, null);
            if (file$default != coroutineSingletons) {
                str = filename;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                return obj;
            }
            n7iVar = (n7i) this.L$0;
            a.a(obj);
            this.L$0 = null;
            this.label = 3;
            Object H = n7iVar.H(this);
            return H != coroutineSingletons ? coroutineSingletons : H;
        }
        String str3 = (String) this.L$0;
        a.a(obj);
        str = str3;
        file$default = obj;
        CacheResult cacheResult = (CacheResult) file$default;
        if (cacheResult instanceof CacheResult.Success) {
            return cacheResult;
        }
        o7i a = p7i.a();
        downloadPriorityQueue = this.this$0.downloadPriorityQueue;
        int i2 = this.$priority;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cacheDirectory, str, this.$url, i2, a, this.$intervalMs, this.$onProgress, null);
        this.L$0 = a;
        this.label = 2;
        if (downloadPriorityQueue.invoke(i2, anonymousClass1, this) != coroutineSingletons) {
            n7iVar = a;
            this.L$0 = null;
            this.label = 3;
            Object H2 = n7iVar.H(this);
            if (H2 != coroutineSingletons) {
            }
        }
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super CacheResult> spjVar) {
        return ((AndroidCacheRepository$getFileInternal$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
