package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.data;

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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/data/PriceCalendarFooterV3DTO;", "", "buttonsRow", "Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;", "backgroundColor", "", "topRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;)V", "getButtonsRow", "()Lru/ozon/app/android/travel/molecules/dto/buttonsRow/ButtonsRowDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTopRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PriceCalendarFooterV3DTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final ButtonsRowDTO buttonsRow;

    @EnumNullFallback
    @NotNull
    private final CornerRadius topRadius;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PriceCalendarFooterV3DTO(ButtonsRowDTO buttonsRowDTO, String str, @NotNull CornerRadius topRadius, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(topRadius, "topRadius");
        this.buttonsRow = buttonsRowDTO;
        this.backgroundColor = str;
        this.topRadius = topRadius;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PriceCalendarFooterV3DTO copy$default(PriceCalendarFooterV3DTO priceCalendarFooterV3DTO, ButtonsRowDTO buttonsRowDTO, String str, CornerRadius cornerRadius, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonsRowDTO = priceCalendarFooterV3DTO.buttonsRow;
        }
        if ((i11 & 2) != 0) {
            str = priceCalendarFooterV3DTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = priceCalendarFooterV3DTO.topRadius;
        }
        if ((i11 & 8) != 0) {
            map = priceCalendarFooterV3DTO.trackingInfo;
        }
        return priceCalendarFooterV3DTO.copy(buttonsRowDTO, str, cornerRadius, map);
    }

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

    @NotNull
    public final PriceCalendarFooterV3DTO copy(ButtonsRowDTO buttonsRow, String backgroundColor, @NotNull CornerRadius topRadius, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(topRadius, "topRadius");
        return new PriceCalendarFooterV3DTO(buttonsRow, backgroundColor, topRadius, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCalendarFooterV3DTO)) {
            return false;
        }
        PriceCalendarFooterV3DTO priceCalendarFooterV3DTO = (PriceCalendarFooterV3DTO) other;
        return Intrinsics.d(this.buttonsRow, priceCalendarFooterV3DTO.buttonsRow) && Intrinsics.d(this.backgroundColor, priceCalendarFooterV3DTO.backgroundColor) && this.topRadius == priceCalendarFooterV3DTO.topRadius && Intrinsics.d(this.trackingInfo, priceCalendarFooterV3DTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonsRowDTO getButtonsRow() {
        return this.buttonsRow;
    }

    @NotNull
    public final CornerRadius getTopRadius() {
        return this.topRadius;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        ButtonsRowDTO buttonsRowDTO = this.buttonsRow;
        int hashCode = (buttonsRowDTO == null ? 0 : buttonsRowDTO.hashCode()) * 31;
        String str = this.backgroundColor;
        int b11 = b.b(this.topRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PriceCalendarFooterV3DTO(buttonsRow=" + this.buttonsRow + ", backgroundColor=" + this.backgroundColor + ", topRadius=" + this.topRadius + ", trackingInfo=" + this.trackingInfo + ")";
    }

    public /* synthetic */ PriceCalendarFooterV3DTO(ButtonsRowDTO buttonsRowDTO, String str, CornerRadius cornerRadius, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonsRowDTO, str, (i11 & 4) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, map);
    }
}
