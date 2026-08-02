package ru.ozon.app.android.search.widgets.tapTags.v2.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2VO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/core/TapTagsV2DTO;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;", "toVO", "(Lru/ozon/app/android/search/widgets/tapTags/v2/core/TapTagsV2DTO;)Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV2MapperKt {
    @NotNull
    public static final TapTagsV2VO toVO(@NotNull TapTagsV2DTO tapTagsV2DTO) {
        Intrinsics.checkNotNullParameter(tapTagsV2DTO, "<this>");
        long j11 = 875858226;
        List<TagButtonDTO> items = tapTagsV2DTO.getItems();
        if (items == null) {
            items = K.f71697a;
        }
        List<TagButtonDTO> list = items;
        Integer maxRows = tapTagsV2DTO.getMaxRows();
        return new TapTagsV2VO(j11, list, maxRows != null ? maxRows.intValue() : 3, true, tapTagsV2DTO.getSearchText());
    }
}
