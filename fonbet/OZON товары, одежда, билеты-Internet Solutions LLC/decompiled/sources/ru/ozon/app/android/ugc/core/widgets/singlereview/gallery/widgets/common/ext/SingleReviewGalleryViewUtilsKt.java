package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.ext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.a;
import androidx.core.graphics.drawable.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"iconPlayBitmap", "Landroid/graphics/Bitmap;", "Landroid/content/Context;", "getIconPlayBitmap", "(Landroid/content/Context;)Landroid/graphics/Bitmap;", "updatePaddings", "", "Landroid/view/View;", "rect", "Landroid/graphics/Rect;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewGalleryViewUtilsKt {
    @NotNull
    public static final Bitmap getIconPlayBitmap(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable drawable = a.getDrawable(context, R$drawable.ic_l_gallery_play);
        if (drawable != null) {
            drawable.setTint(ThemeExtKt.themeColor(context, R$attr.bgLightKey));
            Bitmap b11 = b.b(drawable, 0, 0, 7);
            if (b11 != null) {
                return b11;
            }
        }
        throw new IllegalStateException("drawable is not found");
    }

    public static final void updatePaddings(@NotNull View view, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
