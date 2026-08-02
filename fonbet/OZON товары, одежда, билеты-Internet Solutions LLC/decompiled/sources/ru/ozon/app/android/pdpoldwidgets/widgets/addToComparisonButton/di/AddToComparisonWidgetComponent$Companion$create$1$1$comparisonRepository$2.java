package ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonApi;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonMapper;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonRepository;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToComparisonWidgetComponent$Companion$create$1$1$comparisonRepository$2 extends AbstractC7737t implements Function0<ComparisonRepository> {
    final /* synthetic */ AddToComparisonWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToComparisonWidgetComponent$Companion$create$1$1$comparisonRepository$2(AddToComparisonWidgetComponent$Companion$create$1$1 addToComparisonWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = addToComparisonWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComparisonRepository invoke() {
        Object create = this.this$0.getNetworkComponentApi().getRetrofit().create(ComparisonApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new ComparisonRepository((ComparisonApi) create, new ComparisonMapper());
    }
}
