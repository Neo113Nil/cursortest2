package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/data/BottomCartWidgetDTO;", "", "cartButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "catalogButton", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getCartButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCatalogButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BottomCartWidgetDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO cartButton;
    private final ButtonV3DTO catalogButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BottomCartWidgetDTO(ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map<String, TokenizedTrackingInfo> map) {
        this.cartButton = buttonV3DTO;
        this.catalogButton = buttonV3DTO2;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BottomCartWidgetDTO copy$default(BottomCartWidgetDTO bottomCartWidgetDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = bottomCartWidgetDTO.cartButton;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO2 = bottomCartWidgetDTO.catalogButton;
        }
        if ((i11 & 4) != 0) {
            map = bottomCartWidgetDTO.trackingInfo;
        }
        return bottomCartWidgetDTO.copy(buttonV3DTO, buttonV3DTO2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getCartButton() {
        return this.cartButton;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getCatalogButton() {
        return this.catalogButton;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final BottomCartWidgetDTO copy(ButtonV3DTO cartButton, ButtonV3DTO catalogButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new BottomCartWidgetDTO(cartButton, catalogButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomCartWidgetDTO)) {
            return false;
        }
        BottomCartWidgetDTO bottomCartWidgetDTO = (BottomCartWidgetDTO) other;
        return Intrinsics.d(this.cartButton, bottomCartWidgetDTO.cartButton) && Intrinsics.d(this.catalogButton, bottomCartWidgetDTO.catalogButton) && Intrinsics.d(this.trackingInfo, bottomCartWidgetDTO.trackingInfo);
    }

    public final ButtonV3DTO getCartButton() {
        return this.cartButton;
    }

    public final ButtonV3DTO getCatalogButton() {
        return this.catalogButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        ButtonV3DTO buttonV3DTO = this.cartButton;
        int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
        ButtonV3DTO buttonV3DTO2 = this.catalogButton;
        int hashCode2 = (hashCode + (buttonV3DTO2 == null ? 0 : buttonV3DTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.cartButton;
        ButtonV3DTO buttonV3DTO2 = this.catalogButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("BottomCartWidgetDTO(cartButton=");
        sb2.append(buttonV3DTO);
        sb2.append(", catalogButton=");
        sb2.append(buttonV3DTO2);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
