package ru.ozon.uni.android.cell.icon.data;

import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/android/cell/icon/data/IconAddonWrapperPreset;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "size", "", "hasShape", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "mainAddonSettings", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;ZLru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "getSize", "()Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "Z", "getHasShape", "()Z", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "getMainAddonSettings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class IconAddonWrapperPreset {
    private final boolean hasShape;

    @NotNull
    private final MainAddonSettings mainAddonSettings;

    @NotNull
    private final IconDTO.IconSize size;

    public IconAddonWrapperPreset(@NotNull IconDTO.IconSize size, boolean z11, @NotNull MainAddonSettings mainAddonSettings) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.size = size;
        this.hasShape = z11;
        this.mainAddonSettings = mainAddonSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconAddonWrapperPreset)) {
            return false;
        }
        IconAddonWrapperPreset iconAddonWrapperPreset = (IconAddonWrapperPreset) other;
        return this.size == iconAddonWrapperPreset.size && this.hasShape == iconAddonWrapperPreset.hasShape && Intrinsics.d(this.mainAddonSettings, iconAddonWrapperPreset.mainAddonSettings);
    }

    public final boolean getHasShape() {
        return this.hasShape;
    }

    @NotNull
    public final MainAddonSettings getMainAddonSettings() {
        return this.mainAddonSettings;
    }

    @NotNull
    public final IconDTO.IconSize getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.mainAddonSettings.hashCode() + C3532b.a(this.size.hashCode() * 31, 31, this.hasShape);
    }

    @NotNull
    public String toString() {
        return "IconAddonWrapperPreset(size=" + this.size + ", hasShape=" + this.hasShape + ", mainAddonSettings=" + this.mainAddonSettings + ")";
    }

    public /* synthetic */ IconAddonWrapperPreset(IconDTO.IconSize iconSize, boolean z11, MainAddonSettings mainAddonSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconSize, (i11 & 2) != 0 ? false : z11, mainAddonSettings);
    }
}
