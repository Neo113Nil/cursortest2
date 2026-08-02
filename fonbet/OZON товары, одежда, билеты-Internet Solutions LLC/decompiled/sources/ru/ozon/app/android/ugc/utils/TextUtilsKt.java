package ru.ozon.app.android.ugc.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextPaintExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u001e\u0010\b\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"measureTextWidth", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "context", "Landroid/content/Context;", "textPaint", "Landroid/text/TextPaint;", "(Lru/ozon/uni/atoms/data/text/TextDTO;Landroid/content/Context;Landroid/text/TextPaint;)Ljava/lang/Integer;", "applyTextSize", "", "style", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextUtilsKt {
    private static final void applyTextSize(TextPaint textPaint, Context context, int i11) {
        int[] OzonTextAppearance = R$styleable.OzonTextAppearance;
        Intrinsics.checkNotNullExpressionValue(OzonTextAppearance, "OzonTextAppearance");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, OzonTextAppearance);
        textPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R$styleable.OzonTextAppearance_android_textSize, ResourceExtKt.toSp(12)));
        obtainStyledAttributes.recycle();
    }

    public static final Integer measureTextWidth(@NotNull TextDTO textDTO, @NotNull Context context, @NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(textDTO.getTypographyToken());
        if (parseTextStyle == null) {
            return null;
        }
        int intValue = parseTextStyle.intValue();
        TextPaintExtKt.applyStyle(textPaint, context, intValue);
        applyTextSize(textPaint, context, intValue);
        return Integer.valueOf((int) textPaint.measureText(textDTO.getText().toString()));
    }
}
