package ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.data;

import Gl.C3124a;
import Hj.C3143a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/data/TravelSortingV2DTO;", "", "trainOption", "Lru/ozon/uni/atoms/data/text/TextDTO;", "mobileSortingButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "fastSortingButtons", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/Map;)V", "getTrainOption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMobileSortingButton", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getFastSortingButtons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelSortingV2DTO {
    public static final int $stable = 8;
    private final List<TagButtonDTO> fastSortingButtons;

    @NotNull
    private final BadgeDTO mobileSortingButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final TextDTO trainOption;

    public TravelSortingV2DTO(@NotNull TextDTO trainOption, @NotNull BadgeDTO mobileSortingButton, List<TagButtonDTO> list, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(trainOption, "trainOption");
        Intrinsics.checkNotNullParameter(mobileSortingButton, "mobileSortingButton");
        this.trainOption = trainOption;
        this.mobileSortingButton = mobileSortingButton;
        this.fastSortingButtons = list;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelSortingV2DTO copy$default(TravelSortingV2DTO travelSortingV2DTO, TextDTO textDTO, BadgeDTO badgeDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = travelSortingV2DTO.trainOption;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = travelSortingV2DTO.mobileSortingButton;
        }
        if ((i11 & 4) != 0) {
            list = travelSortingV2DTO.fastSortingButtons;
        }
        if ((i11 & 8) != 0) {
            map = travelSortingV2DTO.trackingInfo;
        }
        return travelSortingV2DTO.copy(textDTO, badgeDTO, list, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTrainOption() {
        return this.trainOption;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getMobileSortingButton() {
        return this.mobileSortingButton;
    }

    public final List<TagButtonDTO> component3() {
        return this.fastSortingButtons;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelSortingV2DTO copy(@NotNull TextDTO trainOption, @NotNull BadgeDTO mobileSortingButton, List<TagButtonDTO> fastSortingButtons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trainOption, "trainOption");
        Intrinsics.checkNotNullParameter(mobileSortingButton, "mobileSortingButton");
        return new TravelSortingV2DTO(trainOption, mobileSortingButton, fastSortingButtons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelSortingV2DTO)) {
            return false;
        }
        TravelSortingV2DTO travelSortingV2DTO = (TravelSortingV2DTO) other;
        return Intrinsics.d(this.trainOption, travelSortingV2DTO.trainOption) && Intrinsics.d(this.mobileSortingButton, travelSortingV2DTO.mobileSortingButton) && Intrinsics.d(this.fastSortingButtons, travelSortingV2DTO.fastSortingButtons) && Intrinsics.d(this.trackingInfo, travelSortingV2DTO.trackingInfo);
    }

    public final List<TagButtonDTO> getFastSortingButtons() {
        return this.fastSortingButtons;
    }

    @NotNull
    public final BadgeDTO getMobileSortingButton() {
        return this.mobileSortingButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final TextDTO getTrainOption() {
        return this.trainOption;
    }

    public int hashCode() {
        int c11 = C3124a.c(this.mobileSortingButton, this.trainOption.hashCode() * 31, 31);
        List<TagButtonDTO> list = this.fastSortingButtons;
        int hashCode = (c11 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.trainOption;
        BadgeDTO badgeDTO = this.mobileSortingButton;
        List<TagButtonDTO> list = this.fastSortingButtons;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelSortingV2DTO(trainOption=");
        sb2.append(textDTO);
        sb2.append(", mobileSortingButton=");
        sb2.append(badgeDTO);
        sb2.append(", fastSortingButtons=");
        return C3143a.h(sb2, list, ", trackingInfo=", map, ")");
    }
}
