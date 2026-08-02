package ru.ozon.app.android.pdp.widgets.sellerV4.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/data/SellerV4DTO;", "", "sellerCell", "Lru/ozon/app/android/pdp/widgets/sellerV4/data/SellerCell;", "scrollableButtons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "actionButton", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdp/widgets/sellerV4/data/SellerCell;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Ljava/lang/String;Ljava/util/Map;)V", "getSellerCell", "()Lru/ozon/app/android/pdp/widgets/sellerV4/data/SellerCell;", "getScrollableButtons", "()Ljava/util/List;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerV4DTO {
    public static final int $stable = 8;
    private final ButtonDTO actionButton;
    private final String backgroundColor;
    private final List<ButtonDTO> scrollableButtons;

    @NotNull
    private final SellerCell sellerCell;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SellerV4DTO(@NotNull SellerCell sellerCell, List<ButtonDTO> list, ButtonDTO buttonDTO, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(sellerCell, "sellerCell");
        this.sellerCell = sellerCell;
        this.scrollableButtons = list;
        this.actionButton = buttonDTO;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SellerV4DTO copy$default(SellerV4DTO sellerV4DTO, SellerCell sellerCell, List list, ButtonDTO buttonDTO, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sellerCell = sellerV4DTO.sellerCell;
        }
        if ((i11 & 2) != 0) {
            list = sellerV4DTO.scrollableButtons;
        }
        if ((i11 & 4) != 0) {
            buttonDTO = sellerV4DTO.actionButton;
        }
        if ((i11 & 8) != 0) {
            str = sellerV4DTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = sellerV4DTO.trackingInfo;
        }
        Map map2 = map;
        ButtonDTO buttonDTO2 = buttonDTO;
        return sellerV4DTO.copy(sellerCell, list, buttonDTO2, str, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SellerCell getSellerCell() {
        return this.sellerCell;
    }

    public final List<ButtonDTO> component2() {
        return this.scrollableButtons;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonDTO getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final SellerV4DTO copy(@NotNull SellerCell sellerCell, List<ButtonDTO> scrollableButtons, ButtonDTO actionButton, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(sellerCell, "sellerCell");
        return new SellerV4DTO(sellerCell, scrollableButtons, actionButton, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerV4DTO)) {
            return false;
        }
        SellerV4DTO sellerV4DTO = (SellerV4DTO) other;
        return Intrinsics.d(this.sellerCell, sellerV4DTO.sellerCell) && Intrinsics.d(this.scrollableButtons, sellerV4DTO.scrollableButtons) && Intrinsics.d(this.actionButton, sellerV4DTO.actionButton) && Intrinsics.d(this.backgroundColor, sellerV4DTO.backgroundColor) && Intrinsics.d(this.trackingInfo, sellerV4DTO.trackingInfo);
    }

    public final ButtonDTO getActionButton() {
        return this.actionButton;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ButtonDTO> getScrollableButtons() {
        return this.scrollableButtons;
    }

    @NotNull
    public final SellerCell getSellerCell() {
        return this.sellerCell;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.sellerCell.hashCode() * 31;
        List<ButtonDTO> list = this.scrollableButtons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ButtonDTO buttonDTO = this.actionButton;
        int hashCode3 = (hashCode2 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        SellerCell sellerCell = this.sellerCell;
        List<ButtonDTO> list = this.scrollableButtons;
        ButtonDTO buttonDTO = this.actionButton;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SellerV4DTO(sellerCell=");
        sb2.append(sellerCell);
        sb2.append(", scrollableButtons=");
        sb2.append(list);
        sb2.append(", actionButton=");
        sb2.append(buttonDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
