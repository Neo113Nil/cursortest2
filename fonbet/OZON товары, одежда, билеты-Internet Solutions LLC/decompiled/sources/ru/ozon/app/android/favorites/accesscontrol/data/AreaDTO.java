package ru.ozon.app.android.favorites.accesscontrol.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AreaDTO;", "", "role", "", "controlButton", "Lru/ozon/app/android/favorites/accesscontrol/data/ControlButtonDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/favorites/accesscontrol/data/ControlButtonDTO;)V", "getRole", "()Ljava/lang/String;", "getControlButton", "()Lru/ozon/app/android/favorites/accesscontrol/data/ControlButtonDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AreaDTO {
    private final ControlButtonDTO controlButton;
    private final String role;

    public AreaDTO(String str, ControlButtonDTO controlButtonDTO) {
        this.role = str;
        this.controlButton = controlButtonDTO;
    }

    public static /* synthetic */ AreaDTO copy$default(AreaDTO areaDTO, String str, ControlButtonDTO controlButtonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = areaDTO.role;
        }
        if ((i11 & 2) != 0) {
            controlButtonDTO = areaDTO.controlButton;
        }
        return areaDTO.copy(str, controlButtonDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component2, reason: from getter */
    public final ControlButtonDTO getControlButton() {
        return this.controlButton;
    }

    @NotNull
    public final AreaDTO copy(String role, ControlButtonDTO controlButton) {
        return new AreaDTO(role, controlButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AreaDTO)) {
            return false;
        }
        AreaDTO areaDTO = (AreaDTO) other;
        return Intrinsics.d(this.role, areaDTO.role) && Intrinsics.d(this.controlButton, areaDTO.controlButton);
    }

    public final ControlButtonDTO getControlButton() {
        return this.controlButton;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        String str = this.role;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ControlButtonDTO controlButtonDTO = this.controlButton;
        return hashCode + (controlButtonDTO != null ? controlButtonDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AreaDTO(role=" + this.role + ", controlButton=" + this.controlButton + ")";
    }
}
