package ru.ozon.uni.android.cell.selection.toggle.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPresets;", "", "<init>", "()V", "centerEnd500default500", "Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;", "getCenterEnd500default500", "()Lru/ozon/uni/android/cell/selection/toggle/data/ToggleTitleSubtitleWrapperPreset;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToggleTitleSubtitleWrapperPresets {

    @NotNull
    public static final ToggleTitleSubtitleWrapperPresets INSTANCE = new ToggleTitleSubtitleWrapperPresets();

    @NotNull
    private static final ToggleTitleSubtitleWrapperPreset centerEnd500default500 = new ToggleTitleSubtitleWrapperPreset(ToggleAddonWrapperPresets.INSTANCE.getCenterEnd500(), TitleSubtitleWrapperPresets.INSTANCE.getDefault500());

    private ToggleTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final ToggleTitleSubtitleWrapperPreset getCenterEnd500default500() {
        return centerEnd500default500;
    }
}
