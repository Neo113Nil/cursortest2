package ru.ozon.uni.android.cell.selection.checkbox.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/cell/selection/checkbox/data/CheckboxAddonWrapperPreset;", "", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "checkboxPreset", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "mainAddonSettings", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "getCheckboxPreset", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "getMainAddonSettings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckboxAddonWrapperPreset {

    @NotNull
    private final CheckBoxDTO.CheckBoxSize checkboxPreset;

    @NotNull
    private final MainAddonSettings mainAddonSettings;

    public CheckboxAddonWrapperPreset(@NotNull CheckBoxDTO.CheckBoxSize checkboxPreset, @NotNull MainAddonSettings mainAddonSettings) {
        Intrinsics.checkNotNullParameter(checkboxPreset, "checkboxPreset");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.checkboxPreset = checkboxPreset;
        this.mainAddonSettings = mainAddonSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckboxAddonWrapperPreset)) {
            return false;
        }
        CheckboxAddonWrapperPreset checkboxAddonWrapperPreset = (CheckboxAddonWrapperPreset) other;
        return this.checkboxPreset == checkboxAddonWrapperPreset.checkboxPreset && Intrinsics.d(this.mainAddonSettings, checkboxAddonWrapperPreset.mainAddonSettings);
    }

    @NotNull
    public final MainAddonSettings getMainAddonSettings() {
        return this.mainAddonSettings;
    }

    public int hashCode() {
        return this.mainAddonSettings.hashCode() + (this.checkboxPreset.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CheckboxAddonWrapperPreset(checkboxPreset=" + this.checkboxPreset + ", mainAddonSettings=" + this.mainAddonSettings + ")";
    }
}
