package ru.ozon.uni.atoms.af;

import android.graphics.Canvas;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/af/CommonAtomDecorator;", "", "decorate", "", "canvas", "Landroid/graphics/Canvas;", "bounds", "Landroid/graphics/Rect;", "position", "", "last", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CommonAtomDecorator {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void decorate(@NotNull CommonAtomDecorator commonAtomDecorator, @NotNull Canvas canvas, @NotNull Rect bounds, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
        }
    }

    void decorate(@NotNull Canvas canvas, @NotNull Rect bounds, int position, boolean last);
}
