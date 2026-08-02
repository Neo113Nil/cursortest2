package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
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
@il4(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2", f = "AndroidCacheRepository.kt", l = {120, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidCacheRepository$getFileFromRemote$2 extends hoi implements Function2<ku3, rq3<? super CacheResult>, Object> {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @il4(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2$1", f = "AndroidCacheRepository.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function1<rq3<? super Unit>, Object> {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ pa3 $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, pa3 pa3Var, rq3<? super AnonymousClass1> rq3Var) {
            super(1, rq3Var);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$fileResult = pa3Var;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(rq3<?> rq3Var) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$fileResult, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            CacheDataSource cacheDataSource;
            AnonymousClass1 anonymousClass1;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                cacheDataSource = this.this$0.remoteCacheDataSource;
                File file = this.$cacheDirectory;
                String str = this.$filename;
                String str2 = this.$url;
                Integer num = new Integer(0);
                this.label = 1;
                anonymousClass1 = this;
                obj = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, str, str2, num, 0, null, anonymousClass1, 48, null);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                anonymousClass1 = this;
            }
            ((qa3) anonymousClass1.$fileResult).V((CacheResult) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getFileFromRemote$2(AndroidCacheRepository androidCacheRepository, String str, File file, rq3<? super AndroidCacheRepository$getFileFromRemote$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidCacheRepository$getFileFromRemote$2(this.this$0, this.$url, this.$cacheDirectory, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super CacheResult> rq3Var) {
        return ((AndroidCacheRepository$getFileFromRemote$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        DownloadPriorityQueue downloadPriorityQueue;
        pa3 pa3Var;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            String filename = this.this$0.getFilename(this.$url);
            qa3 c = qx9.c();
            downloadPriorityQueue = this.this$0.downloadPriorityQueue;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cacheDirectory, filename, this.$url, c, null);
            this.L$0 = c;
            this.label = 1;
            if (downloadPriorityQueue.invoke(0, anonymousClass1, this) != lu3Var) {
                pa3Var = c;
            }
        }
        if (i != 1) {
            if (i == 2) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pa3Var = (pa3) this.L$0;
        y6a.M(obj);
        this.L$0 = null;
        this.label = 2;
        Object w = ((qa3) pa3Var).w(this);
        return w == lu3Var ? lu3Var : w;
    }
}
