package ru.ozon.uni.android.uikit.extensions;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.core.content.a;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u000b*\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\t2\b\b\u0003\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u000b*\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u000b*\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "", "attrRes", "themeColor", "(Landroid/content/Context;I)I", "themeColorRes", "", "isDarkThemeActive", "(Landroid/content/Context;)Z", "Landroid/widget/ImageView;", "color", "", "tint", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "tintColor", "semanticTint", "(Landroid/widget/ImageView;I)V", "setParandjaForDarkTheme", "(Landroid/widget/ImageView;)V", "setBackgroundParanjaForDarkTheme", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThemeExtKt {
    public static final boolean isDarkThemeActive(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final void semanticTint(@NotNull ImageView imageView, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isDarkThemeActive(context)) {
            tint(imageView, Integer.valueOf(g.b(imageView.getContext().getResources(), i11, imageView.getContext().getTheme())));
        } else {
            tint(imageView, null);
        }
    }

    public static /* synthetic */ void semanticTint$default(ImageView imageView, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = R$color.oz_semantic_text_primary;
        }
        semanticTint(imageView, i11);
    }

    public static final void setBackgroundParanjaForDarkTheme(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isDarkThemeActive(context)) {
            imageView.setBackgroundTintList(ColorStateList.valueOf(a.getColor(imageView.getContext(), R$color.oz_semantic_parandja)));
            imageView.setBackgroundTintMode(PorterDuff.Mode.DARKEN);
        }
    }

    public static final void setParandjaForDarkTheme(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isDarkThemeActive(context)) {
            imageView.setColorFilter(a.getColor(imageView.getContext(), R$color.oz_semantic_parandja), PorterDuff.Mode.DARKEN);
        }
    }

    public static final int themeColor(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.data;
    }

    public static final int themeColorRes(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static final void tint(@NotNull ImageView imageView, Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (num != null) {
            imageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            imageView.clearColorFilter();
        }
    }
}
