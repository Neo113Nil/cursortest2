package ru.ozon.app.android.storefront.widgets.navigationSliderV2.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2Mapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class NavigationSliderV2WidgetComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<NavigationSliderV2Mapper> {
    final /* synthetic */ NavigationSliderV2WidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV2WidgetComponent$Companion$create$1$1$mapper$2(NavigationSliderV2WidgetComponent$Companion$create$1$1 navigationSliderV2WidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = navigationSliderV2WidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NavigationSliderV2Mapper invoke() {
        return new NavigationSliderV2Mapper(this.this$0.getResolver());
    }
}
