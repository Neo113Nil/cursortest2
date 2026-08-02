package com.unity3d.ads.core.data.datasource;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.hpj;
import xsna.myc0;
import xsna.ovj;
import xsna.pvj;
import xsna.r9;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: CachedFIdDataSource.kt */
/* loaded from: classes14.dex */
public final class CachedFIdDataSource implements FIdDataSource {
    private final FIdDataSource dataSource;
    private AtomicBoolean loaded = new AtomicBoolean(false);
    private yvj scope;
    private volatile String value;

    /* compiled from: CachedFIdDataSource.kt */
    @b6l(c = "com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1", f = "CachedFIdDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public AnonymousClass1(spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return CachedFIdDataSource.this.new AnonymousClass1(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            CachedFIdDataSource cachedFIdDataSource = CachedFIdDataSource.this;
            cachedFIdDataSource.value = cachedFIdDataSource.dataSource.invoke();
            return s3q0.a;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    public CachedFIdDataSource(ovj ovjVar, FIdDataSource fIdDataSource) {
        this.dataSource = fIdDataSource;
        hpj g = zvj.g(zvj.a(ovjVar), new CachedFIdDataSource$special$$inlined$CoroutineExceptionHandler$1(pvj.a.b));
        this.scope = g;
        myc0.h(g, null, null, new AnonymousClass1(null), 3).E(new r9(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 _init_$lambda$1(CachedFIdDataSource cachedFIdDataSource, Throwable th) {
        zvj.c(cachedFIdDataSource.scope, null);
        cachedFIdDataSource.loaded.set(true);
        return s3q0.a;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    public String invoke() {
        if (this.loaded.get()) {
            return this.value;
        }
        return null;
    }
}
