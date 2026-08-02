package ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.data;

import Pk0.a;
import Tl.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.buttonsRow.ButtonsRowDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/buttonsBar/data/ButtonsBarDTO;", "", "buttonsRow", "Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;", "backgroundColor", "", "topRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "disableSticky", "", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;Z)V", "getButtonsRow", "()Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTopRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTrackingInfo", "()Ljava/util/Map;", "getDisableSticky", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ButtonsBarDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final ButtonsRowDTO buttonsRow;
    private final boolean disableSticky;

    @EnumNullFallback
    @NotNull
    private final CornerRadius topRadius;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ButtonsBarDTO(@NotNull ButtonsRowDTO buttonsRow, String str, @NotNull CornerRadius topRadius, Map<String, TokenizedTrackingInfo> map, boolean z11) {
        Intrinsics.checkNotNullParameter(buttonsRow, "buttonsRow");
        Intrinsics.checkNotNullParameter(topRadius, "topRadius");
        this.buttonsRow = buttonsRow;
        this.backgroundColor = str;
        this.topRadius = topRadius;
        this.trackingInfo = map;
        this.disableSticky = z11;
    }

    public static /* synthetic */ ButtonsBarDTO copy$default(ButtonsBarDTO buttonsBarDTO, ButtonsRowDTO buttonsRowDTO, String str, CornerRadius cornerRadius, Map map, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonsRowDTO = buttonsBarDTO.buttonsRow;
        }
        if ((i11 & 2) != 0) {
            str = buttonsBarDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = buttonsBarDTO.topRadius;
        }
        if ((i11 & 8) != 0) {
            map = buttonsBarDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            z11 = buttonsBarDTO.disableSticky;
        }
        boolean z12 = z11;
        CornerRadius cornerRadius2 = cornerRadius;
        return buttonsBarDTO.copy(buttonsRowDTO, str, cornerRadius2, map, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonsRowDTO getButtonsRow() {
        return this.buttonsRow;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CornerRadius getTopRadius() {
        return this.topRadius;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDisableSticky() {
        return this.disableSticky;
    }

    @NotNull
    public final ButtonsBarDTO copy(@NotNull ButtonsRowDTO buttonsRow, String backgroundColor, @NotNull CornerRadius topRadius, Map<String, TokenizedTrackingInfo> trackingInfo, boolean disableSticky) {
        Intrinsics.checkNotNullParameter(buttonsRow, "buttonsRow");
        Intrinsics.checkNotNullParameter(topRadius, "topRadius");
        return new ButtonsBarDTO(buttonsRow, backgroundColor, topRadius, trackingInfo, disableSticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsBarDTO)) {
            return false;
        }
        ButtonsBarDTO buttonsBarDTO = (ButtonsBarDTO) other;
        return Intrinsics.d(this.buttonsRow, buttonsBarDTO.buttonsRow) && Intrinsics.d(this.backgroundColor, buttonsBarDTO.backgroundColor) && this.topRadius == buttonsBarDTO.topRadius && Intrinsics.d(this.trackingInfo, buttonsBarDTO.trackingInfo) && this.disableSticky == buttonsBarDTO.disableSticky;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonsRowDTO getButtonsRow() {
        return this.buttonsRow;
    }

    public final boolean getDisableSticky() {
        return this.disableSticky;
    }

    @NotNull
    public final CornerRadius getTopRadius() {
        return this.topRadius;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.buttonsRow.hashCode() * 31;
        String str = this.backgroundColor;
        int b11 = b.b(this.topRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return Boolean.hashCode(this.disableSticky) + ((b11 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        ButtonsRowDTO buttonsRowDTO = this.buttonsRow;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.topRadius;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        boolean z11 = this.disableSticky;
        StringBuilder sb2 = new StringBuilder("ButtonsBarDTO(buttonsRow=");
        sb2.append(buttonsRowDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", topRadius=");
        sb2.append(cornerRadius);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", disableSticky=");
        return a.a(")", sb2, z11);
    }

    public /* synthetic */ ButtonsBarDTO(ButtonsRowDTO buttonsRowDTO, String str, CornerRadius cornerRadius, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonsRowDTO, str, (i11 & 4) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, map, (i11 & 16) != 0 ? false : z11);
    }
}
