package ru.ozon.app.android.marketing.widgets.sisbrandfavorite.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data.DynamicOnScrollColors;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data.Options;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data.SisBrandFavoriteDTO;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.presentation.SisBrandFavoriteVI;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/core/SisBrandFavoriteMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/SisBrandFavoriteDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/presentation/SisBrandFavoriteVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVi", "(Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/SisBrandFavoriteDTO;J)Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/presentation/SisBrandFavoriteVI;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/SisBrandFavoriteDTO;Ll20/d;)Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SisBrandFavoriteMapper implements Function2<SisBrandFavoriteDTO, d, List<? extends SisBrandFavoriteVI>> {
    private final SisBrandFavoriteVI toVi(SisBrandFavoriteDTO sisBrandFavoriteDTO, long j11) {
        DynamicOnScrollColors dynamicOnScrollColors;
        SisBrandFavoriteButton favoriteButton = sisBrandFavoriteDTO.getFavoriteButton();
        Options options = sisBrandFavoriteDTO.getOptions();
        DynamicOnScrollColors dynamicOnScrollColors2 = sisBrandFavoriteDTO.getDynamicOnScrollColors();
        DynamicOnScrollColors dynamicOnScrollColors3 = null;
        String str = null;
        if (dynamicOnScrollColors2 != null) {
            String iconTintColorCollapsed = sisBrandFavoriteDTO.getDynamicOnScrollColors().getIconTintColorCollapsed();
            if (iconTintColorCollapsed == null) {
                ButtonsDTO favoriteButton2 = sisBrandFavoriteDTO.getFavoriteButton().getFavoriteButton();
                IconButtonV3DTO iconButtonV3DTO = favoriteButton2 instanceof IconButtonV3DTO ? (IconButtonV3DTO) favoriteButton2 : null;
                iconTintColorCollapsed = iconButtonV3DTO != null ? iconButtonV3DTO.getIconColor() : null;
            }
            String iconTintColorExpanded = sisBrandFavoriteDTO.getDynamicOnScrollColors().getIconTintColorExpanded();
            if (iconTintColorExpanded == null) {
                ButtonsDTO favoriteButton3 = sisBrandFavoriteDTO.getFavoriteButton().getFavoriteButton();
                IconButtonV3DTO iconButtonV3DTO2 = favoriteButton3 instanceof IconButtonV3DTO ? (IconButtonV3DTO) favoriteButton3 : null;
                iconTintColorExpanded = iconButtonV3DTO2 != null ? iconButtonV3DTO2.getIconColor() : null;
            }
            String backgroundColorCollapsed = sisBrandFavoriteDTO.getDynamicOnScrollColors().getBackgroundColorCollapsed();
            if (backgroundColorCollapsed == null) {
                ButtonsDTO favoriteButton4 = sisBrandFavoriteDTO.getFavoriteButton().getFavoriteButton();
                IconButtonV3DTO iconButtonV3DTO3 = favoriteButton4 instanceof IconButtonV3DTO ? (IconButtonV3DTO) favoriteButton4 : null;
                backgroundColorCollapsed = iconButtonV3DTO3 != null ? iconButtonV3DTO3.getBackgroundColor() : null;
            }
            String backgroundColorExpanded = sisBrandFavoriteDTO.getDynamicOnScrollColors().getBackgroundColorExpanded();
            if (backgroundColorExpanded == null) {
                ButtonsDTO favoriteButton5 = sisBrandFavoriteDTO.getFavoriteButton().getFavoriteButton();
                IconButtonV3DTO iconButtonV3DTO4 = favoriteButton5 instanceof IconButtonV3DTO ? (IconButtonV3DTO) favoriteButton5 : null;
                backgroundColorExpanded = iconButtonV3DTO4 != null ? iconButtonV3DTO4.getBackgroundColor() : null;
            }
            dynamicOnScrollColors = dynamicOnScrollColors2.copy(iconTintColorExpanded, iconTintColorCollapsed, backgroundColorExpanded, backgroundColorCollapsed);
        } else {
            dynamicOnScrollColors = null;
        }
        DynamicOnScrollColors dynamicOnScrollFavoriteColors = sisBrandFavoriteDTO.getDynamicOnScrollFavoriteColors();
        if (dynamicOnScrollFavoriteColors != null) {
            String iconTintColorCollapsed2 = sisBrandFavoriteDTO.getDynamicOnScrollFavoriteColors().getIconTintColorCollapsed();
            if (iconTintColorCollapsed2 == null) {
                ButtonsDTO unfavoriteButton = sisBrandFavoriteDTO.getFavoriteButton().getUnfavoriteButton();
                IconButtonV3DTO iconButtonV3DTO5 = unfavoriteButton instanceof IconButtonV3DTO ? (IconButtonV3DTO) unfavoriteButton : null;
                iconTintColorCollapsed2 = iconButtonV3DTO5 != null ? iconButtonV3DTO5.getIconColor() : null;
            }
            String iconTintColorExpanded2 = sisBrandFavoriteDTO.getDynamicOnScrollFavoriteColors().getIconTintColorExpanded();
            if (iconTintColorExpanded2 == null) {
                ButtonsDTO unfavoriteButton2 = sisBrandFavoriteDTO.getFavoriteButton().getUnfavoriteButton();
                IconButtonV3DTO iconButtonV3DTO6 = unfavoriteButton2 instanceof IconButtonV3DTO ? (IconButtonV3DTO) unfavoriteButton2 : null;
                iconTintColorExpanded2 = iconButtonV3DTO6 != null ? iconButtonV3DTO6.getIconColor() : null;
            }
            String backgroundColorCollapsed2 = sisBrandFavoriteDTO.getDynamicOnScrollFavoriteColors().getBackgroundColorCollapsed();
            if (backgroundColorCollapsed2 == null) {
                ButtonsDTO unfavoriteButton3 = sisBrandFavoriteDTO.getFavoriteButton().getUnfavoriteButton();
                IconButtonV3DTO iconButtonV3DTO7 = unfavoriteButton3 instanceof IconButtonV3DTO ? (IconButtonV3DTO) unfavoriteButton3 : null;
                backgroundColorCollapsed2 = iconButtonV3DTO7 != null ? iconButtonV3DTO7.getBackgroundColor() : null;
            }
            String backgroundColorExpanded2 = sisBrandFavoriteDTO.getDynamicOnScrollFavoriteColors().getBackgroundColorExpanded();
            if (backgroundColorExpanded2 == null) {
                ButtonsDTO unfavoriteButton4 = sisBrandFavoriteDTO.getFavoriteButton().getUnfavoriteButton();
                IconButtonV3DTO iconButtonV3DTO8 = unfavoriteButton4 instanceof IconButtonV3DTO ? (IconButtonV3DTO) unfavoriteButton4 : null;
                if (iconButtonV3DTO8 != null) {
                    str = iconButtonV3DTO8.getBackgroundColor();
                }
            } else {
                str = backgroundColorExpanded2;
            }
            dynamicOnScrollColors3 = dynamicOnScrollFavoriteColors.copy(iconTintColorExpanded2, iconTintColorCollapsed2, str, backgroundColorCollapsed2);
        }
        return new SisBrandFavoriteVI(j11, favoriteButton, options, dynamicOnScrollColors, dynamicOnScrollColors3, (sisBrandFavoriteDTO.getDynamicOnScrollColors() == null && sisBrandFavoriteDTO.getDynamicOnScrollFavoriteColors() == null) ? false : true);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SisBrandFavoriteVI> invoke(@NotNull SisBrandFavoriteDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVi(state, widgetInfo.d().hashCode()));
    }
}
