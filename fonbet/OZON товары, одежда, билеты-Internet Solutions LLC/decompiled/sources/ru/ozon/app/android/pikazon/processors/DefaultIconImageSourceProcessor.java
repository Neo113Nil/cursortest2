package ru.ozon.app.android.pikazon.processors;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.OzonDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pikazon/processors/DefaultIconImageSourceProcessor;", "Lru/ozon/app/android/pikazon/processors/ImageSourceProcessor;", "<init>", "()V", "transform", "Landroid/graphics/drawable/Drawable;", "source", "", "context", "Landroid/content/Context;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultIconImageSourceProcessor implements ImageSourceProcessor {
    @Override // ru.ozon.app.android.pikazon.processors.ImageSourceProcessor
    public Drawable transform(@NotNull Object source, @NotNull Context context) {
        String str;
        Drawable loadIconByString;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(source instanceof String) || (loadIconByString = ContextExtKt.loadIconByString(context, (str = (String) source))) == null) {
            return null;
        }
        return new OzonDrawable(str, loadIconByString);
    }
}
