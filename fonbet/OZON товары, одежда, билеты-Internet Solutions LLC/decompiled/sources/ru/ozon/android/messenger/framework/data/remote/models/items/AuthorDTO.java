package ru.ozon.android.messenger.framework.data.remote.models.items;

import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/items/AuthorDTO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "avatarIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icons", "", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getAvatarIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AuthorDTO {
    public static final int $stable = Icon.$stable | IconDTO.$stable;
    private final IconDTO avatarIcon;
    private final List<Icon> icons;

    @NotNull
    private final String id;
    private final String name;

    public AuthorDTO(@NotNull String id2, String str, IconDTO iconDTO, List<Icon> list) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.name = str;
        this.avatarIcon = iconDTO;
        this.icons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorDTO copy$default(AuthorDTO authorDTO, String str, String str2, IconDTO iconDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authorDTO.id;
        }
        if ((i11 & 2) != 0) {
            str2 = authorDTO.name;
        }
        if ((i11 & 4) != 0) {
            iconDTO = authorDTO.avatarIcon;
        }
        if ((i11 & 8) != 0) {
            list = authorDTO.icons;
        }
        return authorDTO.copy(str, str2, iconDTO, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final List<Icon> component4() {
        return this.icons;
    }

    @NotNull
    public final AuthorDTO copy(@NotNull String id2, String name, IconDTO avatarIcon, List<Icon> icons) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new AuthorDTO(id2, name, avatarIcon, icons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorDTO)) {
            return false;
        }
        AuthorDTO authorDTO = (AuthorDTO) other;
        return Intrinsics.d(this.id, authorDTO.id) && Intrinsics.d(this.name, authorDTO.name) && Intrinsics.d(this.avatarIcon, authorDTO.avatarIcon) && Intrinsics.d(this.icons, authorDTO.icons);
    }

    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final List<Icon> getIcons() {
        return this.icons;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconDTO iconDTO = this.avatarIcon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        List<Icon> list = this.icons;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        IconDTO iconDTO = this.avatarIcon;
        List<Icon> list = this.icons;
        StringBuilder d11 = C3660k.d("AuthorDTO(id=", str, ", name=", str2, ", avatarIcon=");
        d11.append(iconDTO);
        d11.append(", icons=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }
}
