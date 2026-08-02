package ru.ozon.uni.android.cell.disclosure.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;", "", "", "imageSize", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "mainAddonSettings", "<init>", "(ILru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getImageSize", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "getMainAddonSettings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DisclosureAddonWrapperPreset {
    private final int imageSize;

    @NotNull
    private final MainAddonSettings mainAddonSettings;

    public DisclosureAddonWrapperPreset(int i11, @NotNull MainAddonSettings mainAddonSettings) {
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.imageSize = i11;
        this.mainAddonSettings = mainAddonSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclosureAddonWrapperPreset)) {
            return false;
        }
        DisclosureAddonWrapperPreset disclosureAddonWrapperPreset = (DisclosureAddonWrapperPreset) other;
        return this.imageSize == disclosureAddonWrapperPreset.imageSize && Intrinsics.d(this.mainAddonSettings, disclosureAddonWrapperPreset.mainAddonSettings);
    }

    public final int getImageSize() {
        return this.imageSize;
    }

    @NotNull
    public final MainAddonSettings getMainAddonSettings() {
        return this.mainAddonSettings;
    }

    public int hashCode() {
        return this.mainAddonSettings.hashCode() + (Integer.hashCode(this.imageSize) * 31);
    }

    @NotNull
    public String toString() {
        return "DisclosureAddonWrapperPreset(imageSize=" + this.imageSize + ", mainAddonSettings=" + this.mainAddonSettings + ")";
    }
}
