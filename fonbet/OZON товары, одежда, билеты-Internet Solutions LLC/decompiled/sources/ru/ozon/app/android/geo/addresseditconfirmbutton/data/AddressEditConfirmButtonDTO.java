package ru.ozon.app.android.geo.addresseditconfirmbutton.data;

import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/data/AddressEditConfirmButtonDTO;", "", "buttonApp", "Lru/ozon/uni/atoms/data/AtomDTO;", "sharingButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "isSticky", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;)V", "getButtonApp", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getSharingButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;)Lru/ozon/app/android/geo/addresseditconfirmbutton/data/AddressEditConfirmButtonDTO;", "equals", "other", "hashCode", "", "toString", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditConfirmButtonDTO {

    @NotNull
    private final AtomDTO buttonApp;
    private final Boolean isSticky;
    private final IconButtonV3DTO sharingButton;

    public AddressEditConfirmButtonDTO(@NotNull AtomDTO buttonApp, IconButtonV3DTO iconButtonV3DTO, Boolean bool) {
        Intrinsics.checkNotNullParameter(buttonApp, "buttonApp");
        this.buttonApp = buttonApp;
        this.sharingButton = iconButtonV3DTO;
        this.isSticky = bool;
    }

    public static /* synthetic */ AddressEditConfirmButtonDTO copy$default(AddressEditConfirmButtonDTO addressEditConfirmButtonDTO, AtomDTO atomDTO, IconButtonV3DTO iconButtonV3DTO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomDTO = addressEditConfirmButtonDTO.buttonApp;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = addressEditConfirmButtonDTO.sharingButton;
        }
        if ((i11 & 4) != 0) {
            bool = addressEditConfirmButtonDTO.isSticky;
        }
        return addressEditConfirmButtonDTO.copy(atomDTO, iconButtonV3DTO, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomDTO getButtonApp() {
        return this.buttonApp;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getSharingButton() {
        return this.sharingButton;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    public final AddressEditConfirmButtonDTO copy(@NotNull AtomDTO buttonApp, IconButtonV3DTO sharingButton, Boolean isSticky) {
        Intrinsics.checkNotNullParameter(buttonApp, "buttonApp");
        return new AddressEditConfirmButtonDTO(buttonApp, sharingButton, isSticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditConfirmButtonDTO)) {
            return false;
        }
        AddressEditConfirmButtonDTO addressEditConfirmButtonDTO = (AddressEditConfirmButtonDTO) other;
        return Intrinsics.d(this.buttonApp, addressEditConfirmButtonDTO.buttonApp) && Intrinsics.d(this.sharingButton, addressEditConfirmButtonDTO.sharingButton) && Intrinsics.d(this.isSticky, addressEditConfirmButtonDTO.isSticky);
    }

    @NotNull
    public final AtomDTO getButtonApp() {
        return this.buttonApp;
    }

    public final IconButtonV3DTO getSharingButton() {
        return this.sharingButton;
    }

    public int hashCode() {
        int hashCode = this.buttonApp.hashCode() * 31;
        IconButtonV3DTO iconButtonV3DTO = this.sharingButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        Boolean bool = this.isSticky;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        AtomDTO atomDTO = this.buttonApp;
        IconButtonV3DTO iconButtonV3DTO = this.sharingButton;
        Boolean bool = this.isSticky;
        StringBuilder sb2 = new StringBuilder("AddressEditConfirmButtonDTO(buttonApp=");
        sb2.append(atomDTO);
        sb2.append(", sharingButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", isSticky=");
        return g.d(sb2, bool, ")");
    }

    public /* synthetic */ AddressEditConfirmButtonDTO(AtomDTO atomDTO, IconButtonV3DTO iconButtonV3DTO, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomDTO, iconButtonV3DTO, (i11 & 4) != 0 ? Boolean.TRUE : bool);
    }
}
