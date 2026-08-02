package com.unity3d.ads.core.data.datasource;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* compiled from: CachedFIdDataSource.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/CachedFIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "dataSource", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/data/datasource/FIdDataSource;)V", X3.i.r, "Ljava/util/concurrent/atomic/AtomicBoolean;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "value", "", "invoke", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedFIdDataSource implements FIdDataSource {
    private final FIdDataSource dataSource;
    private AtomicBoolean loaded;
    private CoroutineScope scope;
    private volatile String value;

    public CachedFIdDataSource(CoroutineDispatcher dispatcher, FIdDataSource dataSource) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
        this.loaded = new AtomicBoolean(false);
        CoroutineScope plus = CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(dispatcher), new CachedFIdDataSource$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE));
        this.scope = plus;
        launch$default = BuildersKt__Builders_commonKt.launch$default(plus, null, null, new AnonymousClass1(null), 3, null);
        launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.unity3d.ads.core.data.datasource.CachedFIdDataSource.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                CoroutineScopeKt.cancel$default(CachedFIdDataSource.this.scope, null, 1, null);
                CachedFIdDataSource.this.loaded.set(true);
            }
        });
    }

    /* compiled from: CachedFIdDataSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1", f = "CachedFIdDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CachedFIdDataSource.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CachedFIdDataSource cachedFIdDataSource = CachedFIdDataSource.this;
            cachedFIdDataSource.value = cachedFIdDataSource.dataSource.invoke();
            return Unit.INSTANCE;
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    public String invoke() {
        if (this.loaded.get()) {
            return this.value;
        }
        return null;
    }
}
