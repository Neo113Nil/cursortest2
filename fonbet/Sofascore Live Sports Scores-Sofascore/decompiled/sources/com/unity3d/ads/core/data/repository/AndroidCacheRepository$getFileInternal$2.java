package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import defpackage.a70;
import defpackage.ct8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pa3;
import defpackage.qa3;
import defpackage.qx9;
import defpackage.rq3;
import defpackage.y6a;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "<anonymous>", "(Lku3;)Lcom/unity3d/ads/core/data/model/CacheResult;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {91, 98, 111}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidCacheRepository$getFileInternal$2 extends hoi implements Function2<ku3, rq3<? super CacheResult>, Object> {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ ct8 $onProgress;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @il4(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {100, 107}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function1<rq3<? super Unit>, Object> {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ pa3 $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ ct8 $onProgress;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i, pa3 pa3Var, int i2, ct8 ct8Var, rq3<? super AnonymousClass1> rq3Var) {
            super(1, rq3Var);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$priority = i;
            this.$fileResult = pa3Var;
            this.$intervalMs = i2;
            this.$onProgress = ct8Var;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(rq3<?> rq3Var) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, this.$intervalMs, this.$onProgress, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(rq3Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
        
            if (r15 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        
            if (r15 == r0) goto L19;
         */
        @Override // defpackage.h21
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CacheDataSource cacheDataSource;
            AnonymousClass1 anonymousClass1;
            CacheDataSource cacheDataSource2;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
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
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    anonymousClass1 = this;
                    ((qa3) anonymousClass1.$fileResult).V((CacheResult) obj);
                    return Unit.a;
                }
                y6a.M(obj);
                anonymousClass1 = this;
            }
            CacheResult cacheResult = (CacheResult) obj;
            if (cacheResult instanceof CacheResult.Success) {
                ((qa3) anonymousClass1.$fileResult).V(cacheResult);
                return Unit.a;
            }
            cacheDataSource2 = anonymousClass1.this$0.remoteCacheDataSource;
            File file2 = anonymousClass1.$cacheDirectory;
            String str3 = anonymousClass1.$filename;
            String str4 = anonymousClass1.$url;
            Integer num2 = new Integer(anonymousClass1.$priority);
            int i2 = anonymousClass1.$intervalMs;
            ct8 ct8Var = anonymousClass1.$onProgress;
            anonymousClass1.label = 2;
            obj = cacheDataSource2.getFile(file2, str3, str4, num2, i2, ct8Var, anonymousClass1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getFileInternal$2(AndroidCacheRepository androidCacheRepository, String str, File file, int i, int i2, ct8 ct8Var, rq3<? super AndroidCacheRepository$getFileInternal$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
        this.$priority = i;
        this.$intervalMs = i2;
        this.$onProgress = ct8Var;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidCacheRepository$getFileInternal$2(this.this$0, this.$url, this.$cacheDirectory, this.$priority, this.$intervalMs, this.$onProgress, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super CacheResult> rq3Var) {
        return ((AndroidCacheRepository$getFileInternal$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad A[RETURN] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CacheDataSource cacheDataSource;
        Object file$default;
        String str;
        DownloadPriorityQueue downloadPriorityQueue;
        pa3 pa3Var;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            String filename = this.this$0.getFilename(this.$url);
            cacheDataSource = this.this$0.localCacheDataSource;
            File file = this.$cacheDirectory;
            String str2 = this.$url;
            Integer num = new Integer(this.$priority);
            this.L$0 = filename;
            this.label = 1;
            file$default = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, filename, str2, num, 0, null, this, 48, null);
            if (file$default != lu3Var) {
                str = filename;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pa3Var = (pa3) this.L$0;
            y6a.M(obj);
            this.L$0 = null;
            this.label = 3;
            Object w = ((qa3) pa3Var).w(this);
            return w != lu3Var ? lu3Var : w;
        }
        String str3 = (String) this.L$0;
        y6a.M(obj);
        str = str3;
        file$default = obj;
        CacheResult cacheResult = (CacheResult) file$default;
        if (cacheResult instanceof CacheResult.Success) {
            return cacheResult;
        }
        qa3 c = qx9.c();
        downloadPriorityQueue = this.this$0.downloadPriorityQueue;
        int i2 = this.$priority;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cacheDirectory, str, this.$url, i2, c, this.$intervalMs, this.$onProgress, null);
        this.L$0 = c;
        this.label = 2;
        if (downloadPriorityQueue.invoke(i2, anonymousClass1, this) != lu3Var) {
            pa3Var = c;
            this.L$0 = null;
            this.label = 3;
            Object w2 = ((qa3) pa3Var).w(this);
            if (w2 != lu3Var) {
            }
        }
    }
}
