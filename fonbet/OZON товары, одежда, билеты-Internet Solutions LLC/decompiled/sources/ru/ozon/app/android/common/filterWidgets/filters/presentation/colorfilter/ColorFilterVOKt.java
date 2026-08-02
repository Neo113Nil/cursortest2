package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.color.ColorAtom;
import ru.ozon.app.android.common.filterWidgets.filters.data.ColorFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/ColorFilterModel;", "stateId", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ColorFilterVOKt {
    @NotNull
    public static final ColorFilterVO toVo(@NotNull ColorFilterModel colorFilterModel, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(colorFilterModel, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        String title = colorFilterModel.getColorFilter().getTitle();
        Icon icon = colorFilterModel.getColorFilter().getIcon();
        AtomActionDTO action = colorFilterModel.getColorFilter().getAction();
        ButtonV3Atom.LargeBorderlessButton rightButton = colorFilterModel.getColorFilter().getRightButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = colorFilterModel.getColorFilter().getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(stateId.hashCode()), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = colorFilterModel.getColorFilter().getTrackingInfo();
        List<ColorAtom> colors = colorFilterModel.getColorFilter().getColors();
        List<FiltersDTO.ColorIcon> colorIcons = colorFilterModel.getColorFilter().getColorIcons();
        List<FiltersDTO.ColorAspect> colorAspects = colorFilterModel.getColorFilter().getColorAspects();
        String originalUrl = colorFilterModel.getOriginalUrl();
        boolean showSeparator = colorFilterModel.getShowSeparator();
        Boolean scrollEnabled = colorFilterModel.getColorFilter().getScrollEnabled();
        return new ColorFilterVO(hashCode, title, icon, action, trackingInfo2, tokenizedEvent$default, rightButton, colors, colorIcons, colorAspects, originalUrl, showSeparator, scrollEnabled != null ? scrollEnabled.booleanValue() : false, colorFilterModel.getColorFilter().getRightIcon());
    }
}
