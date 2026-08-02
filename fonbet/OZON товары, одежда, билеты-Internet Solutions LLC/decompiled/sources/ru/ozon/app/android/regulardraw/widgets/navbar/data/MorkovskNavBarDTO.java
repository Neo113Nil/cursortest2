package ru.ozon.app.android.regulardraw.widgets.navbar.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarDTO;", "", "menuButton", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarButtonDTO;", "balance", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "rightButton", "backgroundGradient", "Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskBackgroundGradientDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarButtonDTO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarButtonDTO;Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskBackgroundGradientDTO;Ljava/util/Map;)V", "getMenuButton", "()Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskNavBarButtonDTO;", "getBalance", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "getRightButton", "getBackgroundGradient", "()Lru/ozon/app/android/regulardraw/widgets/navbar/data/MorkovskBackgroundGradientDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskNavBarDTO {
    public static final int $stable = 8;
    private final MorkovskBackgroundGradientDTO backgroundGradient;
    private final MorkovskCurrencyBadgeDTO balance;
    private final MorkovskNavBarButtonDTO menuButton;
    private final MorkovskNavBarButtonDTO rightButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public MorkovskNavBarDTO(MorkovskNavBarButtonDTO morkovskNavBarButtonDTO, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, MorkovskNavBarButtonDTO morkovskNavBarButtonDTO2, MorkovskBackgroundGradientDTO morkovskBackgroundGradientDTO, Map<String, TokenizedTrackingInfo> map) {
        this.menuButton = morkovskNavBarButtonDTO;
        this.balance = morkovskCurrencyBadgeDTO;
        this.rightButton = morkovskNavBarButtonDTO2;
        this.backgroundGradient = morkovskBackgroundGradientDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ MorkovskNavBarDTO copy$default(MorkovskNavBarDTO morkovskNavBarDTO, MorkovskNavBarButtonDTO morkovskNavBarButtonDTO, MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, MorkovskNavBarButtonDTO morkovskNavBarButtonDTO2, MorkovskBackgroundGradientDTO morkovskBackgroundGradientDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            morkovskNavBarButtonDTO = morkovskNavBarDTO.menuButton;
        }
        if ((i11 & 2) != 0) {
            morkovskCurrencyBadgeDTO = morkovskNavBarDTO.balance;
        }
        if ((i11 & 4) != 0) {
            morkovskNavBarButtonDTO2 = morkovskNavBarDTO.rightButton;
        }
        if ((i11 & 8) != 0) {
            morkovskBackgroundGradientDTO = morkovskNavBarDTO.backgroundGradient;
        }
        if ((i11 & 16) != 0) {
            map = morkovskNavBarDTO.trackingInfo;
        }
        Map map2 = map;
        MorkovskNavBarButtonDTO morkovskNavBarButtonDTO3 = morkovskNavBarButtonDTO2;
        return morkovskNavBarDTO.copy(morkovskNavBarButtonDTO, morkovskCurrencyBadgeDTO, morkovskNavBarButtonDTO3, morkovskBackgroundGradientDTO, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final MorkovskNavBarButtonDTO getMenuButton() {
        return this.menuButton;
    }

    /* renamed from: component2, reason: from getter */
    public final MorkovskCurrencyBadgeDTO getBalance() {
        return this.balance;
    }

    /* renamed from: component3, reason: from getter */
    public final MorkovskNavBarButtonDTO getRightButton() {
        return this.rightButton;
    }

    /* renamed from: component4, reason: from getter */
    public final MorkovskBackgroundGradientDTO getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final MorkovskNavBarDTO copy(MorkovskNavBarButtonDTO menuButton, MorkovskCurrencyBadgeDTO balance, MorkovskNavBarButtonDTO rightButton, MorkovskBackgroundGradientDTO backgroundGradient, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new MorkovskNavBarDTO(menuButton, balance, rightButton, backgroundGradient, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskNavBarDTO)) {
            return false;
        }
        MorkovskNavBarDTO morkovskNavBarDTO = (MorkovskNavBarDTO) other;
        return Intrinsics.d(this.menuButton, morkovskNavBarDTO.menuButton) && Intrinsics.d(this.balance, morkovskNavBarDTO.balance) && Intrinsics.d(this.rightButton, morkovskNavBarDTO.rightButton) && Intrinsics.d(this.backgroundGradient, morkovskNavBarDTO.backgroundGradient) && Intrinsics.d(this.trackingInfo, morkovskNavBarDTO.trackingInfo);
    }

    public final MorkovskBackgroundGradientDTO getBackgroundGradient() {
        return this.backgroundGradient;
    }

    public final MorkovskCurrencyBadgeDTO getBalance() {
        return this.balance;
    }

    public final MorkovskNavBarButtonDTO getMenuButton() {
        return this.menuButton;
    }

    public final MorkovskNavBarButtonDTO getRightButton() {
        return this.rightButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        MorkovskNavBarButtonDTO morkovskNavBarButtonDTO = this.menuButton;
        int hashCode = (morkovskNavBarButtonDTO == null ? 0 : morkovskNavBarButtonDTO.hashCode()) * 31;
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.balance;
        int hashCode2 = (hashCode + (morkovskCurrencyBadgeDTO == null ? 0 : morkovskCurrencyBadgeDTO.hashCode())) * 31;
        MorkovskNavBarButtonDTO morkovskNavBarButtonDTO2 = this.rightButton;
        int hashCode3 = (hashCode2 + (morkovskNavBarButtonDTO2 == null ? 0 : morkovskNavBarButtonDTO2.hashCode())) * 31;
        MorkovskBackgroundGradientDTO morkovskBackgroundGradientDTO = this.backgroundGradient;
        int hashCode4 = (hashCode3 + (morkovskBackgroundGradientDTO == null ? 0 : morkovskBackgroundGradientDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        MorkovskNavBarButtonDTO morkovskNavBarButtonDTO = this.menuButton;
        MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO = this.balance;
        MorkovskNavBarButtonDTO morkovskNavBarButtonDTO2 = this.rightButton;
        MorkovskBackgroundGradientDTO morkovskBackgroundGradientDTO = this.backgroundGradient;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("MorkovskNavBarDTO(menuButton=");
        sb2.append(morkovskNavBarButtonDTO);
        sb2.append(", balance=");
        sb2.append(morkovskCurrencyBadgeDTO);
        sb2.append(", rightButton=");
        sb2.append(morkovskNavBarButtonDTO2);
        sb2.append(", backgroundGradient=");
        sb2.append(morkovskBackgroundGradientDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
