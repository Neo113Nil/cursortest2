package ru.ozon.app.android.travel.molecules.dto.travelTab.v2;

import D40.a;
import Kk.C3532b;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelTab/v2/TravelTabDTO;", "", "text", "", "isSelected", "", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "accentColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "()Z", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getAccentColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelTabDTO {
    private final String accentColor;
    private final AtomActionDTO action;
    private final IndicatorDTO indicator;
    private final boolean isSelected;

    @NotNull
    private final String text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TravelTabDTO(@NotNull String text, boolean z11, IndicatorDTO indicatorDTO, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.isSelected = z11;
        this.indicator = indicatorDTO;
        this.accentColor = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TravelTabDTO copy$default(TravelTabDTO travelTabDTO, String str, boolean z11, IndicatorDTO indicatorDTO, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = travelTabDTO.text;
        }
        if ((i11 & 2) != 0) {
            z11 = travelTabDTO.isSelected;
        }
        if ((i11 & 4) != 0) {
            indicatorDTO = travelTabDTO.indicator;
        }
        if ((i11 & 8) != 0) {
            str2 = travelTabDTO.accentColor;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = travelTabDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = travelTabDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return travelTabDTO.copy(str, z11, indicatorDTO, str2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccentColor() {
        return this.accentColor;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelTabDTO copy(@NotNull String text, boolean isSelected, IndicatorDTO indicator, String accentColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TravelTabDTO(text, isSelected, indicator, accentColor, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTabDTO)) {
            return false;
        }
        TravelTabDTO travelTabDTO = (TravelTabDTO) other;
        return Intrinsics.d(this.text, travelTabDTO.text) && this.isSelected == travelTabDTO.isSelected && Intrinsics.d(this.indicator, travelTabDTO.indicator) && Intrinsics.d(this.accentColor, travelTabDTO.accentColor) && Intrinsics.d(this.action, travelTabDTO.action) && Intrinsics.d(this.trackingInfo, travelTabDTO.trackingInfo);
    }

    public final String getAccentColor() {
        return this.accentColor;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.text.hashCode() * 31, 31, this.isSelected);
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode = (a11 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        String str = this.accentColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        boolean z11 = this.isSelected;
        IndicatorDTO indicatorDTO = this.indicator;
        String str2 = this.accentColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = C4636t5.b("TravelTabDTO(text=", str, ", isSelected=", ", indicator=", z11);
        b11.append(indicatorDTO);
        b11.append(", accentColor=");
        b11.append(str2);
        b11.append(", action=");
        return a.d(b11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
