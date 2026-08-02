package ru.ozon.app.android.storefront.widgets.navigationSliderV3.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.data.NavigationSliderV3DTO;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.NavigationSliderV3ScrollableWidgetViewHolder;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3ScrollableViewMapper;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3BaseViewMapper;", "<init>", "()V", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/NavigationSliderV3ScrollableWidgetViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "canMap", "", "state", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderV3ScrollableViewMapper extends NavigationSliderV3BaseViewMapper {

    @NotNull
    private final Function2<View, ComposerReferences, NavigationSliderV3ScrollableWidgetViewHolder> holderProducer = new NavigationSliderV3ScrollableViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof NavigationSliderV3DTO)) {
            return false;
        }
        NavigationSliderV3DTO navigationSliderV3DTO = (NavigationSliderV3DTO) state;
        return getDisplayHelper().isScrollable(navigationSliderV3DTO.getItems().size(), navigationSliderV3DTO.isCompactStyle());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, NavigationSliderV3ScrollableWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }
}
