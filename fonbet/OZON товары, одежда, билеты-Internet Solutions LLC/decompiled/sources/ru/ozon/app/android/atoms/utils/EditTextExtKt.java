package ru.ozon.app.android.atoms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"setupBackgroundForSelect", "", "Landroid/widget/EditText;", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditTextExtKt {
    public static final void setupBackgroundForSelect(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Context context = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (UniGlobalConfigKt.getRoundCornersFlag(context)) {
            Drawable background = editText.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                Context context2 = editText.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(16, context2));
            }
        }
    }
}
