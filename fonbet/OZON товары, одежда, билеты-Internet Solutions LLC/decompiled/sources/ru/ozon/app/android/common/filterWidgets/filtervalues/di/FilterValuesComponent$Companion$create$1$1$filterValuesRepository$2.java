package ru.ozon.app.android.common.filterWidgets.filtervalues.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.FilterValuesRepository;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.api.FilterValuesApi;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.buttonstate.ButtonEnabledStore;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.cellstore.FilterValuesCellStore;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/FilterValuesRepository;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FilterValuesComponent$Companion$create$1$1$filterValuesRepository$2 extends AbstractC7737t implements Function0<FilterValuesRepository> {
    final /* synthetic */ FilterValuesComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterValuesComponent$Companion$create$1$1$filterValuesRepository$2(FilterValuesComponent$Companion$create$1$1 filterValuesComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = filterValuesComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FilterValuesRepository invoke() {
        NetworkComponentApi networkComponentApi;
        FilterValuesCellStore filterValuesCellStore = new FilterValuesCellStore();
        networkComponentApi = this.this$0.networkComponentApi;
        Object create = networkComponentApi.getRetrofit().create(FilterValuesApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new FilterValuesRepository(filterValuesCellStore, (FilterValuesApi) create, new ButtonEnabledStore());
    }
}
