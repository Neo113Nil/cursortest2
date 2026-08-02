package ru.ozon.app.android.ugc.widgets.reviewSort.data;

import De.C2859b;
import G.g;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "applyButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCells", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getApplyButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewSortDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO applyButton;
    private final String backgroundColor;

    @NotNull
    private final List<CellDTO> cells;
    private final CornerRadius cornerRadius;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ReviewSortDTO(@NotNull TextDTO title, @NotNull List<CellDTO> cells, String str, CornerRadius cornerRadius, @NotNull ButtonV3DTO applyButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        this.title = title;
        this.cells = cells;
        this.backgroundColor = str;
        this.cornerRadius = cornerRadius;
        this.applyButton = applyButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ReviewSortDTO copy$default(ReviewSortDTO reviewSortDTO, TextDTO textDTO, List list, String str, CornerRadius cornerRadius, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = reviewSortDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = reviewSortDTO.cells;
        }
        if ((i11 & 4) != 0) {
            str = reviewSortDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            cornerRadius = reviewSortDTO.cornerRadius;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = reviewSortDTO.applyButton;
        }
        if ((i11 & 32) != 0) {
            map = reviewSortDTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        Map map2 = map;
        return reviewSortDTO.copy(textDTO, list, str, cornerRadius, buttonV3DTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<CellDTO> component2() {
        return this.cells;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getApplyButton() {
        return this.applyButton;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewSortDTO copy(@NotNull TextDTO title, @NotNull List<CellDTO> cells, String backgroundColor, CornerRadius cornerRadius, @NotNull ButtonV3DTO applyButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        return new ReviewSortDTO(title, cells, backgroundColor, cornerRadius, applyButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewSortDTO)) {
            return false;
        }
        ReviewSortDTO reviewSortDTO = (ReviewSortDTO) other;
        return Intrinsics.d(this.title, reviewSortDTO.title) && Intrinsics.d(this.cells, reviewSortDTO.cells) && Intrinsics.d(this.backgroundColor, reviewSortDTO.backgroundColor) && this.cornerRadius == reviewSortDTO.cornerRadius && Intrinsics.d(this.applyButton, reviewSortDTO.applyButton) && Intrinsics.d(this.trackingInfo, reviewSortDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getApplyButton() {
        return this.applyButton;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.cells);
        String str = this.backgroundColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int c11 = C2859b.c(this.applyButton, (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<CellDTO> list = this.cells;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        ButtonV3DTO buttonV3DTO = this.applyButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("ReviewSortDTO(title=", textDTO, ", cells=", list, ", backgroundColor=");
        e11.append(str);
        e11.append(", cornerRadius=");
        e11.append(cornerRadius);
        e11.append(", applyButton=");
        e11.append(buttonV3DTO);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }
}
