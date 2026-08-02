package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v1.data;

import G.g;
import Hj.C3143a;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v1/data/OverlayButtonsDTO;", "", "backgroundColor", "", "dividerColor", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "viewTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getDividerColor", "getButtons", "()Ljava/util/List;", "getViewTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OverlayButtonsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final String dividerColor;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    public OverlayButtonsDTO(String str, String str2, @NotNull List<ButtonV3DTO> buttons, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.backgroundColor = str;
        this.dividerColor = str2;
        this.buttons = buttons;
        this.viewTracking = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverlayButtonsDTO copy$default(OverlayButtonsDTO overlayButtonsDTO, String str, String str2, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = overlayButtonsDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = overlayButtonsDTO.dividerColor;
        }
        if ((i11 & 4) != 0) {
            list = overlayButtonsDTO.buttons;
        }
        if ((i11 & 8) != 0) {
            map = overlayButtonsDTO.viewTracking;
        }
        return overlayButtonsDTO.copy(str, str2, list, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    public final List<ButtonV3DTO> component3() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.viewTracking;
    }

    @NotNull
    public final OverlayButtonsDTO copy(String backgroundColor, String dividerColor, @NotNull List<ButtonV3DTO> buttons, Map<String, TokenizedTrackingInfo> viewTracking) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new OverlayButtonsDTO(backgroundColor, dividerColor, buttons, viewTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayButtonsDTO)) {
            return false;
        }
        OverlayButtonsDTO overlayButtonsDTO = (OverlayButtonsDTO) other;
        return Intrinsics.d(this.backgroundColor, overlayButtonsDTO.backgroundColor) && Intrinsics.d(this.dividerColor, overlayButtonsDTO.dividerColor) && Intrinsics.d(this.buttons, overlayButtonsDTO.buttons) && Intrinsics.d(this.viewTracking, overlayButtonsDTO.viewTracking);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final String getDividerColor() {
        return this.dividerColor;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dividerColor;
        int b11 = g.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.buttons);
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.dividerColor;
        return C3143a.h(C3660k.d("OverlayButtonsDTO(backgroundColor=", str, ", dividerColor=", str2, ", buttons="), this.buttons, ", viewTracking=", this.viewTracking, ")");
    }
}
