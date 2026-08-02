package ru.ozon.app.android.search.widgets.tapTags.v3.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3VO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO;", "", "id", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "toVO", "(Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO;Ljava/lang/Long;)Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV3MapperKt {
    @NotNull
    public static final TapTagsV3VO toVO(@NotNull TapTagsV3DTO tapTagsV3DTO, Long l11) {
        TapTagsV3VO.SuggestedPage suggestedPage;
        Intrinsics.checkNotNullParameter(tapTagsV3DTO, "<this>");
        long longValue = l11 != null ? l11.longValue() : 875858227;
        List<TagButtonDTO> items = tapTagsV3DTO.getItems();
        if (items == null) {
            items = K.f71697a;
        }
        List<TagButtonDTO> list = items;
        Integer maxRows = tapTagsV3DTO.getMaxRows();
        int intValue = maxRows != null ? maxRows.intValue() : 3;
        String searchText = tapTagsV3DTO.getSearchText();
        if (tapTagsV3DTO.getSuggestedPage() != null) {
            String refreshLink = tapTagsV3DTO.getSuggestedPage().getRefreshLink();
            Map<String, TokenizedTrackingInfo> trackingInfo = tapTagsV3DTO.getSuggestedPage().getTrackingInfo();
            suggestedPage = new TapTagsV3VO.SuggestedPage(refreshLink, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null) : null);
        } else {
            suggestedPage = null;
        }
        return new TapTagsV3VO(longValue, list, intValue, searchText, suggestedPage, false, 32, null);
    }

    public static /* synthetic */ TapTagsV3VO toVO$default(TapTagsV3DTO tapTagsV3DTO, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        return toVO(tapTagsV3DTO, l11);
    }
}
