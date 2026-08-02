package ru.ozon.android.messenger.blocks.snackbar;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/messenger/blocks/snackbar/IconContainerDTO;", "", "backgroundColor", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IconContainerDTO {
    public static final int $stable = Icon.$stable;
    private final String backgroundColor;

    @NotNull
    private final Icon icon;

    public IconContainerDTO(String str, @NotNull Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.backgroundColor = str;
        this.icon = icon;
    }

    public static /* synthetic */ IconContainerDTO copy$default(IconContainerDTO iconContainerDTO, String str, Icon icon, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = iconContainerDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            icon = iconContainerDTO.icon;
        }
        return iconContainerDTO.copy(str, icon);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final IconContainerDTO copy(String backgroundColor, @NotNull Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new IconContainerDTO(backgroundColor, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconContainerDTO)) {
            return false;
        }
        IconContainerDTO iconContainerDTO = (IconContainerDTO) other;
        return Intrinsics.d(this.backgroundColor, iconContainerDTO.backgroundColor) && Intrinsics.d(this.icon, iconContainerDTO.icon);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        return this.icon.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "IconContainerDTO(backgroundColor=" + this.backgroundColor + ", icon=" + this.icon + ")";
    }
}
