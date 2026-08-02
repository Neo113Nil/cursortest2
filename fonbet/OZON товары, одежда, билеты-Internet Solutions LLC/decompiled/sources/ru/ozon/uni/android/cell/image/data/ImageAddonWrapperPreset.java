package ru.ozon.uni.android.cell.image.data;

import Ef0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/cell/image/data/ImageAddonWrapperPreset;", "", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutTopPadding", "layoutBottomPadding", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "mainAddonSettings", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLayoutTopPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLayoutBottomPadding", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "getMainAddonSettings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ImageAddonWrapperPreset {

    @NotNull
    private final CommonCellSettings.LayoutPadding layoutBottomPadding;

    @NotNull
    private final CommonCellSettings.LayoutPadding layoutTopPadding;

    @NotNull
    private final MainAddonSettings mainAddonSettings;

    public ImageAddonWrapperPreset(@NotNull CommonCellSettings.LayoutPadding layoutTopPadding, @NotNull CommonCellSettings.LayoutPadding layoutBottomPadding, @NotNull MainAddonSettings mainAddonSettings) {
        Intrinsics.checkNotNullParameter(layoutTopPadding, "layoutTopPadding");
        Intrinsics.checkNotNullParameter(layoutBottomPadding, "layoutBottomPadding");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.layoutTopPadding = layoutTopPadding;
        this.layoutBottomPadding = layoutBottomPadding;
        this.mainAddonSettings = mainAddonSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageAddonWrapperPreset)) {
            return false;
        }
        ImageAddonWrapperPreset imageAddonWrapperPreset = (ImageAddonWrapperPreset) other;
        return this.layoutTopPadding == imageAddonWrapperPreset.layoutTopPadding && this.layoutBottomPadding == imageAddonWrapperPreset.layoutBottomPadding && Intrinsics.d(this.mainAddonSettings, imageAddonWrapperPreset.mainAddonSettings);
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLayoutBottomPadding() {
        return this.layoutBottomPadding;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLayoutTopPadding() {
        return this.layoutTopPadding;
    }

    @NotNull
    public final MainAddonSettings getMainAddonSettings() {
        return this.mainAddonSettings;
    }

    public int hashCode() {
        return this.mainAddonSettings.hashCode() + c.a(this.layoutBottomPadding, this.layoutTopPadding.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ImageAddonWrapperPreset(layoutTopPadding=" + this.layoutTopPadding + ", layoutBottomPadding=" + this.layoutBottomPadding + ", mainAddonSettings=" + this.mainAddonSettings + ")";
    }
}
