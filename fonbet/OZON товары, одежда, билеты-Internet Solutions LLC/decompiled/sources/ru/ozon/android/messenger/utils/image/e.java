package ru.ozon.android.messenger.utils.image;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;

/* loaded from: classes10.dex */
public final class e {
    @NotNull
    public static final ImageSize a(@NotNull ImageSize imageSize, int i11, int i12) {
        Intrinsics.checkNotNullParameter(imageSize, "<this>");
        float height = imageSize.getHeight() / imageSize.getWidth();
        int width = imageSize.getWidth();
        if (width <= i11) {
            i11 = width;
        }
        int height2 = imageSize.getHeight();
        if (height2 <= i12) {
            i12 = height2;
        }
        if (height > 1.0f) {
            i11 = (int) (i12 / height);
        } else {
            i12 = (int) (i11 * height);
        }
        return new ImageSize(i11, i12);
    }

    @NotNull
    public static final d b(Function1 function1, Function1 function12) {
        return new d(function12, function1);
    }
}
