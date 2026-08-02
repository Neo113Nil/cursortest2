package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.data;

import D40.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ReviewGalleryPreviewResponse;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/data/ReviewGalleryPreviewV2DTO;", "", "items", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ReviewGalleryPreviewResponse$ItemDTO;", "showMore", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nextItemsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getShowMore", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNextItemsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReviewGalleryPreviewV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ReviewGalleryPreviewResponse.ItemDTO> items;
    private final AtomActionDTO nextItemsAction;
    private final ButtonV3DTO showMore;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ReviewGalleryPreviewV2DTO(@NotNull List<ReviewGalleryPreviewResponse.ItemDTO> items, ButtonV3DTO buttonV3DTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.showMore = buttonV3DTO;
        this.nextItemsAction = atomActionDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewGalleryPreviewV2DTO copy$default(ReviewGalleryPreviewV2DTO reviewGalleryPreviewV2DTO, List list, ButtonV3DTO buttonV3DTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewGalleryPreviewV2DTO.items;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = reviewGalleryPreviewV2DTO.showMore;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = reviewGalleryPreviewV2DTO.nextItemsAction;
        }
        if ((i11 & 8) != 0) {
            map = reviewGalleryPreviewV2DTO.trackingInfo;
        }
        return reviewGalleryPreviewV2DTO.copy(list, buttonV3DTO, atomActionDTO, map);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    @NotNull
    public final List<ReviewGalleryPreviewResponse.ItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getShowMore() {
        return this.showMore;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getNextItemsAction() {
        return this.nextItemsAction;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewGalleryPreviewV2DTO copy(@NotNull List<ReviewGalleryPreviewResponse.ItemDTO> items, ButtonV3DTO showMore, AtomActionDTO nextItemsAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReviewGalleryPreviewV2DTO(items, showMore, nextItemsAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryPreviewV2DTO)) {
            return false;
        }
        ReviewGalleryPreviewV2DTO reviewGalleryPreviewV2DTO = (ReviewGalleryPreviewV2DTO) other;
        return Intrinsics.d(this.items, reviewGalleryPreviewV2DTO.items) && Intrinsics.d(this.showMore, reviewGalleryPreviewV2DTO.showMore) && Intrinsics.d(this.nextItemsAction, reviewGalleryPreviewV2DTO.nextItemsAction) && Intrinsics.d(this.trackingInfo, reviewGalleryPreviewV2DTO.trackingInfo);
    }

    @NotNull
    public final List<ReviewGalleryPreviewResponse.ItemDTO> getItems() {
        return this.items;
    }

    public final AtomActionDTO getNextItemsAction() {
        return this.nextItemsAction;
    }

    public final ButtonV3DTO getShowMore() {
        return this.showMore;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        ButtonV3DTO buttonV3DTO = this.showMore;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.nextItemsAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ReviewGalleryPreviewResponse.ItemDTO> list = this.items;
        ButtonV3DTO buttonV3DTO = this.showMore;
        AtomActionDTO atomActionDTO = this.nextItemsAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ReviewGalleryPreviewV2DTO(items=");
        sb2.append(list);
        sb2.append(", showMore=");
        sb2.append(buttonV3DTO);
        sb2.append(", nextItemsAction=");
        return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
