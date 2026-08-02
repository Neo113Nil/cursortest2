package io.intercom.android.sdk.m5.components;

import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SearchBrowseCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1$1$3$1", f = "SearchBrowseCard.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SearchBrowseCardKt$SearchBrowseCard$1$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SuggestedArticle> $articleSuggestions;
    final /* synthetic */ MetricTracker $metricTracker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(MetricTracker metricTracker, List<SuggestedArticle> list, Continuation<? super SearchBrowseCardKt$SearchBrowseCard$1$1$3$1> continuation) {
        super(2, continuation);
        this.$metricTracker = metricTracker;
        this.$articleSuggestions = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1(this.$metricTracker, this.$articleSuggestions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchBrowseCardKt$SearchBrowseCard$1$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MetricTracker metricTracker = this.$metricTracker;
        List<SuggestedArticle> list = this.$articleSuggestions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SuggestedArticle) it.next()).getId());
        }
        metricTracker.viewedArticleSuggestions(arrayList);
        return Unit.INSTANCE;
    }
}
