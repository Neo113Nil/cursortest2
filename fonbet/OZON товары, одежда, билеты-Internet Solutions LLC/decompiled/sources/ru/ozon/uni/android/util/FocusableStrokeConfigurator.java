package ru.ozon.uni.android.util;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/util/FocusableStrokeConfigurator;", "", "<init>", "()V", "defaultStrokeWidth", "", "configureFocusableStroke", "", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "color", "hasFocused", "", "configureFocusableStroke$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FocusableStrokeConfigurator {

    @NotNull
    public static final FocusableStrokeConfigurator INSTANCE = new FocusableStrokeConfigurator();
    private static final int defaultStrokeWidth = ResourceExtKt.toPx(2);

    private FocusableStrokeConfigurator() {
    }

    public final void configureFocusableStroke$uni_release(@NotNull GradientDrawable drawable, int color, boolean hasFocused) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (hasFocused) {
            drawable.setStroke(defaultStrokeWidth, color);
        } else {
            drawable.setStroke(0, (ColorStateList) null);
        }
    }
}
