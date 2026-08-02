package ru.ozon.fintech.ui.common;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"finIcon", "", "Landroid/widget/ImageView;", "icon", "", "iconSrc", "iconColor", "iconBackgroundColor", "fintech-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageViewExtKt {
    public static final void finIcon(@NotNull ImageView imageView, String str, String str2, String str3, String str4) {
        int color;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str4);
        imageView.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        if (str2 != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ru.ozon.app.android.pikazon.extensions.ImageViewExtKt.loadOriginal$default(imageView, str2, null, null, null, false, null, 62, null);
            return;
        }
        if (str == null) {
            imageView.setImageDrawable(null);
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer iconResByToken = TokensExtKt.getIconResByToken(context2, str);
        if (iconResByToken != null) {
            int intValue = iconResByToken.intValue();
            if (str3 != null) {
                Context context3 = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                color = styleParser.parseColor(context3, str3, R.color.oz_semantic_text_action);
            } else {
                color = a.getColor(imageView.getContext(), R.color.oz_semantic_text_action);
            }
            imageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            imageView.setImageResource(intValue);
        }
    }
}
