package ru.ozon.app.android.storefront.widgets.navigationSliderV3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.utils.NavigationSliderV3Helper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/utils/NavigationSliderV3Helper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderV3WidgetComponent$displayHelper$2 extends AbstractC7737t implements Function0<NavigationSliderV3Helper> {
    final /* synthetic */ NavigationSliderV3WidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV3WidgetComponent$displayHelper$2(NavigationSliderV3WidgetComponent navigationSliderV3WidgetComponent) {
        super(0);
        this.this$0 = navigationSliderV3WidgetComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NavigationSliderV3Helper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.getContextComponentDependencies();
        return new NavigationSliderV3Helper(contextComponentDependencies.getContext());
    }
}
