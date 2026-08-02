package ru.ozon.app.android.common.productselectormobile.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.productselectormobile.data.ProductSelectorMobileDTO;
import ru.ozon.app.android.common.productselectormobile.data.ProductSelectorMobileVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/core/ProductSelectorMobileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileDTO;Ll20/d;)Ljava/util/List;", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductSelectorMobileMapper implements Function2<ProductSelectorMobileDTO, d, List<? extends ProductSelectorMobileVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductSelectorMobileVO> invoke(@NotNull ProductSelectorMobileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        String title = state.getTitle();
        String subtitle = state.getSubtitle();
        String image = state.getImage();
        ButtonV3Atom.SmallButton actionButton = state.getActionButton();
        ButtonV3Atom.SmallButton resetButton = state.getResetButton();
        ProductSelectorMobileDTO.FilterTag filter = state.getFilter();
        OzonSpannableString title2 = filter != null ? filter.getTitle() : null;
        ProductSelectorMobileDTO.FilterTag filter2 = state.getFilter();
        return C7714v.a0(new ProductSelectorMobileVO(hashCode, title, subtitle, image, actionButton, resetButton, title2, filter2 != null ? filter2.getTags() : null));
    }
}
