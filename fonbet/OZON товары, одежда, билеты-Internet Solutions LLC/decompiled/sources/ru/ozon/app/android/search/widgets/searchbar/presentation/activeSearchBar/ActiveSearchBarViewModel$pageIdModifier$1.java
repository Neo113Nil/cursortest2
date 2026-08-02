package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import UZ.a;
import WZ.f;
import WZ.g;
import WZ.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LUZ/a;", "<unused var>", "LWZ/g;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomizedEventParams;", "params", "invoke", "(LUZ/a;LWZ/g;)LWZ/g;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ActiveSearchBarViewModel$pageIdModifier$1 extends AbstractC7737t implements Function2<a, g, g> {
    final /* synthetic */ SearchAnalyticsCustomizedParams $searchParams;
    final /* synthetic */ ActiveSearchBarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewModel$pageIdModifier$1(SearchAnalyticsCustomizedParams searchAnalyticsCustomizedParams, ActiveSearchBarViewModel activeSearchBarViewModel) {
        super(2);
        this.$searchParams = searchAnalyticsCustomizedParams;
        this.this$0 = activeSearchBarViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final g invoke(a aVar, g params) {
        LinkedHashMap linkedHashMap;
        String searchString;
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        SearchAnalyticsCustomizedParams searchAnalyticsCustomizedParams = this.$searchParams;
        if (searchAnalyticsCustomizedParams == null || (searchString = searchAnalyticsCustomizedParams.getSearchString()) == null) {
            linkedHashMap = null;
        } else {
            Map<String, Object> b11 = params.b();
            Pair[] pairs = {new Pair("searchString", searchString)};
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            linkedHashMap = h.a(b11);
            U.o(linkedHashMap, pairs);
        }
        f fVar = new f(this.this$0.getPageViewId());
        params.getClass();
        return new g(linkedHashMap, fVar);
    }
}
