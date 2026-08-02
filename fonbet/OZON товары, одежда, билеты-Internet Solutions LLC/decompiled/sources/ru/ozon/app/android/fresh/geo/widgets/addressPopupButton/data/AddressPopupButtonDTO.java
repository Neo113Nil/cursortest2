package ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/addressPopupButton/data/AddressPopupButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "hideSeparator", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/Boolean;Ljava/util/Map;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getHideSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/fresh/geo/widgets/addressPopupButton/data/AddressPopupButtonDTO;", "equals", "other", "hashCode", "", "toString", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressPopupButtonDTO {

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final Boolean hideSeparator;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AddressPopupButtonDTO(@NotNull ButtonV3Atom.LargeButton button, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.hideSeparator = bool;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressPopupButtonDTO copy$default(AddressPopupButtonDTO addressPopupButtonDTO, ButtonV3Atom.LargeButton largeButton, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            largeButton = addressPopupButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            bool = addressPopupButtonDTO.hideSeparator;
        }
        if ((i11 & 4) != 0) {
            map = addressPopupButtonDTO.trackingInfo;
        }
        return addressPopupButtonDTO.copy(largeButton, bool, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHideSeparator() {
        return this.hideSeparator;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final AddressPopupButtonDTO copy(@NotNull ButtonV3Atom.LargeButton button, Boolean hideSeparator, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new AddressPopupButtonDTO(button, hideSeparator, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressPopupButtonDTO)) {
            return false;
        }
        AddressPopupButtonDTO addressPopupButtonDTO = (AddressPopupButtonDTO) other;
        return Intrinsics.d(this.button, addressPopupButtonDTO.button) && Intrinsics.d(this.hideSeparator, addressPopupButtonDTO.hideSeparator) && Intrinsics.d(this.trackingInfo, addressPopupButtonDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final Boolean getHideSeparator() {
        return this.hideSeparator;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        Boolean bool = this.hideSeparator;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.LargeButton largeButton = this.button;
        Boolean bool = this.hideSeparator;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AddressPopupButtonDTO(button=");
        sb2.append(largeButton);
        sb2.append(", hideSeparator=");
        sb2.append(bool);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ AddressPopupButtonDTO(ButtonV3Atom.LargeButton largeButton, Boolean bool, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(largeButton, bool, (i11 & 4) != 0 ? null : map);
    }
}
