package ru.ozon.uni.android.cell.button.iconButtonTitleSubtitleCell.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPreset;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/IconButtonTitleSubtitleWrapperPreset;", "", "Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "titleSubtitleWrapperPreset", "Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/ButtonAddonWrapperPreset;", "buttonAddonPreset", "<init>", "(Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/ButtonAddonWrapperPreset;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "getTitleSubtitleWrapperPreset", "()Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/ButtonAddonWrapperPreset;", "getButtonAddonPreset", "()Lru/ozon/uni/android/cell/button/iconButtonTitleSubtitleCell/data/ButtonAddonWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IconButtonTitleSubtitleWrapperPreset {

    @NotNull
    private final ButtonAddonWrapperPreset buttonAddonPreset;

    @NotNull
    private final TitleSubtitleWrapperPreset titleSubtitleWrapperPreset;

    public IconButtonTitleSubtitleWrapperPreset(@NotNull TitleSubtitleWrapperPreset titleSubtitleWrapperPreset, @NotNull ButtonAddonWrapperPreset buttonAddonPreset) {
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        Intrinsics.checkNotNullParameter(buttonAddonPreset, "buttonAddonPreset");
        this.titleSubtitleWrapperPreset = titleSubtitleWrapperPreset;
        this.buttonAddonPreset = buttonAddonPreset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonTitleSubtitleWrapperPreset)) {
            return false;
        }
        IconButtonTitleSubtitleWrapperPreset iconButtonTitleSubtitleWrapperPreset = (IconButtonTitleSubtitleWrapperPreset) other;
        return Intrinsics.d(this.titleSubtitleWrapperPreset, iconButtonTitleSubtitleWrapperPreset.titleSubtitleWrapperPreset) && Intrinsics.d(this.buttonAddonPreset, iconButtonTitleSubtitleWrapperPreset.buttonAddonPreset);
    }

    @NotNull
    public final ButtonAddonWrapperPreset getButtonAddonPreset() {
        return this.buttonAddonPreset;
    }

    @NotNull
    public final TitleSubtitleWrapperPreset getTitleSubtitleWrapperPreset() {
        return this.titleSubtitleWrapperPreset;
    }

    public int hashCode() {
        return this.buttonAddonPreset.hashCode() + (this.titleSubtitleWrapperPreset.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "IconButtonTitleSubtitleWrapperPreset(titleSubtitleWrapperPreset=" + this.titleSubtitleWrapperPreset + ", buttonAddonPreset=" + this.buttonAddonPreset + ")";
    }
}
