package ru.ozon.app.android.search.widgets.feedbackForm.common;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics.SearchAnalyticsRepository;
import ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics.SearchAnalyticsRequest;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate$sendCustomSearchAnalytics$1$1", f = "FeedbackAnalyticDelegate.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class FeedbackAnalyticDelegate$sendCustomSearchAnalytics$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionType;
    final /* synthetic */ CustomSearchAnalyticsData $this_apply;
    int label;
    final /* synthetic */ FeedbackAnalyticDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackAnalyticDelegate$sendCustomSearchAnalytics$1$1(FeedbackAnalyticDelegate feedbackAnalyticDelegate, CustomSearchAnalyticsData customSearchAnalyticsData, String str, d<? super FeedbackAnalyticDelegate$sendCustomSearchAnalytics$1$1> dVar) {
        super(2, dVar);
        this.this$0 = feedbackAnalyticDelegate;
        this.$this_apply = customSearchAnalyticsData;
        this.$actionType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FeedbackAnalyticDelegate$sendCustomSearchAnalytics$1$1(this.this$0, this.$this_apply, this.$actionType, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SearchAnalyticsRepository searchAnalyticsRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CustomSearchAnalyticsData customSearchAnalyticsData = this.$this_apply;
            OzonSpannableString selectCellTitle = customSearchAnalyticsData.getSelectCellTitle();
            if (selectCellTitle != null) {
                String obj2 = selectCellTitle.toString();
                Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
                linkedHashMap.put("dimension4", obj2);
                String optionText = customSearchAnalyticsData.getOptionText();
                if (optionText != null) {
                }
            }
            Map<String, String> params = customSearchAnalyticsData.getParams();
            if (params != null) {
                linkedHashMap.putAll(params);
            }
            searchAnalyticsRepository = this.this$0.searchAnalyticsRepository;
            String actionName = this.$this_apply.getActionName();
            if (actionName == null) {
                actionName = "";
            }
            SearchAnalyticsRequest searchAnalyticsRequest = new SearchAnalyticsRequest(this.$actionType, linkedHashMap);
            this.label = 1;
            if (searchAnalyticsRepository.mo971sendSearchAnalytics0E7RQCE(actionName, searchAnalyticsRequest, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ((r) obj).getClass();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FeedbackAnalyticDelegate$sendCustomSearchAnalytics$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
