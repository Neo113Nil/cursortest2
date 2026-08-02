package ru.ozon.app.android.regulardraw.ui.currencyBadge;

import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "image", "bgColor", "textColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getValue", "()Ljava/lang/String;", "getImage", "getBgColor", "getTextColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskCurrencyBadgeDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String bgColor;

    @NotNull
    private final String image;

    @NotNull
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String value;

    public MorkovskCurrencyBadgeDTO(@NotNull String value, @NotNull String image, @NotNull String bgColor, @NotNull String textColor, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.value = value;
        this.image = image;
        this.bgColor = bgColor;
        this.textColor = textColor;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ MorkovskCurrencyBadgeDTO copy$default(MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, String str, String str2, String str3, String str4, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = morkovskCurrencyBadgeDTO.value;
        }
        if ((i11 & 2) != 0) {
            str2 = morkovskCurrencyBadgeDTO.image;
        }
        if ((i11 & 4) != 0) {
            str3 = morkovskCurrencyBadgeDTO.bgColor;
        }
        if ((i11 & 8) != 0) {
            str4 = morkovskCurrencyBadgeDTO.textColor;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = morkovskCurrencyBadgeDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = morkovskCurrencyBadgeDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return morkovskCurrencyBadgeDTO.copy(str, str2, str3, str4, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final MorkovskCurrencyBadgeDTO copy(@NotNull String value, @NotNull String image, @NotNull String bgColor, @NotNull String textColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new MorkovskCurrencyBadgeDTO(value, image, bgColor, textColor, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskCurrencyBadgeDTO)) {
            return false;
        }
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = (MorkovskCurrencyBadgeDTO) other;
        return Intrinsics.d(this.value, morkovskCurrencyBadgeDTO.value) && Intrinsics.d(this.image, morkovskCurrencyBadgeDTO.image) && Intrinsics.d(this.bgColor, morkovskCurrencyBadgeDTO.bgColor) && Intrinsics.d(this.textColor, morkovskCurrencyBadgeDTO.textColor) && Intrinsics.d(this.action, morkovskCurrencyBadgeDTO.action) && Intrinsics.d(this.trackingInfo, morkovskCurrencyBadgeDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(this.value.hashCode() * 31, 31, this.image), 31, this.bgColor), 31, this.textColor);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.image;
        String str3 = this.bgColor;
        String str4 = this.textColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("MorkovskCurrencyBadgeDTO(value=", str, ", image=", str2, ", bgColor=");
        a.h(d11, str3, ", textColor=", str4, ", action=");
        return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
