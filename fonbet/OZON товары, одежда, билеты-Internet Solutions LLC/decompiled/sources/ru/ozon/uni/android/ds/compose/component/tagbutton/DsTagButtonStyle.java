package ru.ozon.uni.android.ds.compose.component.tagbutton;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;", "", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "colors", "selectedColors", "<init>", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;)V", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "getColors", "()Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "getSelectedColors", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTagButtonStyle {

    @NotNull
    private final DsTagButtonColors colors;

    @NotNull
    private final DsTagButtonColors selectedColors;

    public DsTagButtonStyle(@NotNull DsTagButtonColors colors, @NotNull DsTagButtonColors selectedColors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(selectedColors, "selectedColors");
        this.colors = colors;
        this.selectedColors = selectedColors;
    }

    @NotNull
    public final DsTagButtonColors getColors() {
        return this.colors;
    }

    @NotNull
    public final DsTagButtonColors getSelectedColors() {
        return this.selectedColors;
    }
}
