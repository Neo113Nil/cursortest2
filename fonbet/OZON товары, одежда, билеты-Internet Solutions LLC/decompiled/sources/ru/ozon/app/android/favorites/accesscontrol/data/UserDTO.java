package ru.ozon.app.android.favorites.accesscontrol.data;

import G.g;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/UserDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "initials", "icon", "area", "Lru/ozon/app/android/favorites/accesscontrol/data/AreaDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/favorites/accesscontrol/data/AreaDTO;)V", "getName", "()Ljava/lang/String;", "getInitials", "getIcon", "getArea", "()Lru/ozon/app/android/favorites/accesscontrol/data/AreaDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserDTO {
    private final AreaDTO area;

    @NotNull
    private final String icon;
    private final String initials;

    @NotNull
    private final String name;

    public UserDTO(@NotNull String name, String str, @NotNull String icon, AreaDTO areaDTO) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.name = name;
        this.initials = str;
        this.icon = icon;
        this.area = areaDTO;
    }

    public static /* synthetic */ UserDTO copy$default(UserDTO userDTO, String str, String str2, String str3, AreaDTO areaDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userDTO.name;
        }
        if ((i11 & 2) != 0) {
            str2 = userDTO.initials;
        }
        if ((i11 & 4) != 0) {
            str3 = userDTO.icon;
        }
        if ((i11 & 8) != 0) {
            areaDTO = userDTO.area;
        }
        return userDTO.copy(str, str2, str3, areaDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final AreaDTO getArea() {
        return this.area;
    }

    @NotNull
    public final UserDTO copy(@NotNull String name, String initials, @NotNull String icon, AreaDTO area) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new UserDTO(name, initials, icon, area);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDTO)) {
            return false;
        }
        UserDTO userDTO = (UserDTO) other;
        return Intrinsics.d(this.name, userDTO.name) && Intrinsics.d(this.initials, userDTO.initials) && Intrinsics.d(this.icon, userDTO.icon) && Intrinsics.d(this.area, userDTO.area);
    }

    public final AreaDTO getArea() {
        return this.area;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final String getInitials() {
        return this.initials;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.initials;
        int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon);
        AreaDTO areaDTO = this.area;
        return a11 + (areaDTO != null ? areaDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.initials;
        String str3 = this.icon;
        AreaDTO areaDTO = this.area;
        StringBuilder d11 = C3660k.d("UserDTO(name=", str, ", initials=", str2, ", icon=");
        d11.append(str3);
        d11.append(", area=");
        d11.append(areaDTO);
        d11.append(")");
        return d11.toString();
    }
}
