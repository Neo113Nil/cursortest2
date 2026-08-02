package ru.ozon.uni.android.uikitsdk.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.IconSize;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"getIconDrawable", "Landroid/graphics/drawable/Drawable;", "", "context", "Landroid/content/Context;", "defaultSize", "getIconDrawableResizable", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawableResExtKt {
    public static final Drawable getIconDrawable(int i11, @NotNull Context context, int i12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = a.getDrawable(context, i11);
        if (drawable == null) {
            return null;
        }
        drawable.mutate();
        Integer sizeIcon$uni_release = IconSize.INSTANCE.getSizeIcon$uni_release(context.getResources().getResourceName(i11));
        if (sizeIcon$uni_release != null) {
            i12 = sizeIcon$uni_release.intValue();
        }
        drawable.setBounds(0, 0, i12, i12);
        return drawable;
    }

    public static final Drawable getIconDrawableResizable(int i11, @NotNull Context context, int i12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = a.getDrawable(context, i11);
        if (drawable == null) {
            return null;
        }
        drawable.mutate();
        Integer sizeIcon$uni_release = IconSize.INSTANCE.getSizeIcon$uni_release(context.getResources().getResourceName(i11));
        if (sizeIcon$uni_release != null && sizeIcon$uni_release.intValue() <= i12) {
            i12 = sizeIcon$uni_release.intValue();
        }
        drawable.setBounds(0, 0, i12, i12);
        return drawable;
    }
}
