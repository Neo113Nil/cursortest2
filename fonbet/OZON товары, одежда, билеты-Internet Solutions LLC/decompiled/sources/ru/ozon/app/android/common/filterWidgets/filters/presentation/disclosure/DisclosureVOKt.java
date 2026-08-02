package ru.ozon.app.android.common.filterWidgets.filters.presentation.disclosure;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.common.filterWidgets.filters.data.DisclosureFilterModel;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/disclosure/DisclosureVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/DisclosureFilterModel;", "stateId", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclosureVOKt {
    @NotNull
    public static final DisclosureVO toVo(@NotNull DisclosureFilterModel disclosureFilterModel, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(disclosureFilterModel, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter filter = disclosureFilterModel.getFilter();
        Map<String, TokenizedTrackingInfo> trackingInfo = disclosureFilterModel.getFilter().getTrackingInfo();
        return new DisclosureVO(hashCode, filter, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, disclosureFilterModel.getOriginalUrl());
    }
}
