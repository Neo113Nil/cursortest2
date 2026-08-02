package com.unity3d.ads.core.data.repository;

import java.io.File;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b6l;
import xsna.hfr;
import xsna.izs;
import xsna.nbr;
import xsna.rli0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidCacheRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", f = "AndroidCacheRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidCacheRepository$getCacheSize$2 extends SuspendLambda implements wzs<yvj, spj<? super Long>, Object> {
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* compiled from: AndroidCacheRepository.kt */
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements izs<File, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, File.class, "isFile", "isFile()Z", 0);
        }

        @Override // xsna.izs
        public final Boolean invoke(File file) {
            return Boolean.valueOf(file.isFile());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCacheRepository$getCacheSize$2(AndroidCacheRepository androidCacheRepository, spj<? super AndroidCacheRepository$getCacheSize$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidCacheRepository$getCacheSize$2(this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File cacheDir;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        cacheDir = this.this$0.getCacheDir();
        hfr.a aVar = new hfr.a(rli0.j(nbr.u(cacheDir), AnonymousClass1.INSTANCE));
        long j = 0;
        while (aVar.hasNext()) {
            j += ((File) aVar.next()).length();
        }
        return new Long(j);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Long> spjVar) {
        return ((AndroidCacheRepository$getCacheSize$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
