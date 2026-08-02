package io.intercom.android.sdk.helpcenter.search;

import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ArticleSearchViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1", f = "ArticleSearchViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ArticleSearchViewModel$searchForArticles$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<String> $textChanged;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$searchForArticles$1(Flow<String> flow, ArticleSearchViewModel articleSearchViewModel, Continuation<? super ArticleSearchViewModel$searchForArticles$1> continuation) {
        super(2, continuation);
        this.$textChanged = flow;
        this.this$0 = articleSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArticleSearchViewModel$searchForArticles$1(this.$textChanged, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ArticleSearchViewModel$searchForArticles$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow onStart = FlowKt.onStart(FlowKt.debounce(this.$textChanged, 400L), new AnonymousClass1(this.this$0, null));
            final ArticleSearchViewModel articleSearchViewModel = this.this$0;
            this.label = 1;
            if (onStart.collect(new FlowCollector() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((String) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    if (str.length() == 0) {
                        ArticleSearchViewModel.this._state.setValue(ArticleSearchState.Initial.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    ArticleSearchViewModel.this._state.setValue(ArticleSearchState.Loading.INSTANCE);
                    Object emit = ArticleSearchViewModel.this.searchInput.emit(str, continuation);
                    return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ArticleSearchViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1", f = "ArticleSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$searchForArticles$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ArticleSearchViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ArticleSearchViewModel articleSearchViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = articleSearchViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MetricTracker metricTracker;
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                metricTracker = this.this$0.metricTracker;
                z = this.this$0.isFromSearchBrowse;
                metricTracker.searchedNativeHelpCenter(z);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
