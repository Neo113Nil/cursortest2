package ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.common.filterWidgets.filters.data.TextInputFilterModel;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.textinputfilter.TextInputFilterVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/textinputfilter/TextInputFilterVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/TextInputFilterModel;", "stateId", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextInputFilterVOKt {
    @NotNull
    public static final TextInputFilterVO toVo(@NotNull TextInputFilterModel textInputFilterModel, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(textInputFilterModel, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        FiltersDTO.Section.Filter.TextInputFilter textInputFilter = textInputFilterModel.getTextInputFilter();
        String title = textInputFilter.getTitle();
        Icon icon = textInputFilter.getIcon();
        AtomActionDTO action = textInputFilter.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = textInputFilter.getTrackingInfo();
        return new TextInputFilterVO(hashCode, title, icon, action, new TextInputFilterVO.Input(textInputFilter.getInput().getPlaceholder(), textInputFilter.getInput().getPrefix(), textInputFilter.getInput().getValue(), textInputFilter.getInput().getAction(), textInputFilter.getInput().getTrackingInfo()), textInputFilter.getTrackingInfo(), trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, textInputFilterModel.getOriginalUrl(), textInputFilterModel.getShowSeparator());
    }
}
