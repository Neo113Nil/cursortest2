package ru.ozon.uni.android.cell.dataAddon.data;

import K00.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.SmartLabelPreset;
import ru.ozon.uni.android.wrappers.main.data.BackgroundWrapperSettings;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/android/cell/dataAddon/data/DataPreset;", "", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "backgroundWrapperPreset", "Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;", "smartLabelPreset", "", "minHeight", "<init>", "(Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "getBackgroundWrapperPreset", "()Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;", "getSmartLabelPreset", "()Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;", "I", "getMinHeight", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DataPreset {

    @NotNull
    private final BackgroundWrapperSettings backgroundWrapperPreset;
    private final int minHeight;

    @NotNull
    private final SmartLabelPreset smartLabelPreset;

    public DataPreset(@NotNull BackgroundWrapperSettings backgroundWrapperPreset, @NotNull SmartLabelPreset smartLabelPreset, int i11) {
        Intrinsics.checkNotNullParameter(backgroundWrapperPreset, "backgroundWrapperPreset");
        Intrinsics.checkNotNullParameter(smartLabelPreset, "smartLabelPreset");
        this.backgroundWrapperPreset = backgroundWrapperPreset;
        this.smartLabelPreset = smartLabelPreset;
        this.minHeight = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataPreset)) {
            return false;
        }
        DataPreset dataPreset = (DataPreset) other;
        return Intrinsics.d(this.backgroundWrapperPreset, dataPreset.backgroundWrapperPreset) && Intrinsics.d(this.smartLabelPreset, dataPreset.smartLabelPreset) && this.minHeight == dataPreset.minHeight;
    }

    @NotNull
    public final BackgroundWrapperSettings getBackgroundWrapperPreset() {
        return this.backgroundWrapperPreset;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    @NotNull
    public final SmartLabelPreset getSmartLabelPreset() {
        return this.smartLabelPreset;
    }

    public int hashCode() {
        return Integer.hashCode(this.minHeight) + ((this.smartLabelPreset.hashCode() + (this.backgroundWrapperPreset.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        BackgroundWrapperSettings backgroundWrapperSettings = this.backgroundWrapperPreset;
        SmartLabelPreset smartLabelPreset = this.smartLabelPreset;
        int i11 = this.minHeight;
        StringBuilder sb2 = new StringBuilder("DataPreset(backgroundWrapperPreset=");
        sb2.append(backgroundWrapperSettings);
        sb2.append(", smartLabelPreset=");
        sb2.append(smartLabelPreset);
        sb2.append(", minHeight=");
        return b.e(i11, ")", sb2);
    }
}
