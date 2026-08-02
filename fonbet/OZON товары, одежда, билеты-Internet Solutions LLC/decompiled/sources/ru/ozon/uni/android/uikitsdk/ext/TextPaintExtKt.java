package ru.ozon.uni.android.uikitsdk.ext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.core.R$font;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/text/TextPaint;", "Landroid/content/Context;", "context", "", "style", "", "applyStyle", "(Landroid/text/TextPaint;Landroid/content/Context;I)V", "Landroid/graphics/Paint;", "(Landroid/graphics/Paint;Landroid/content/Context;I)V", "", "textAttrs", "[I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextPaintExtKt {

    @NotNull
    private static final int[] textAttrs;

    static {
        int[] iArr = {R.attr.fontFamily, android.R.attr.fontFeatureSettings, android.R.attr.letterSpacing, android.R.attr.textSize};
        C7705l.Z(iArr);
        textAttrs = iArr;
    }

    public static final void applyStyle(@NotNull TextPaint textPaint, @NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = textAttrs;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        textPaint.setFontFeatureSettings(obtainStyledAttributes.getString(C7705l.L(iArr, android.R.attr.fontFeatureSettings)));
        textPaint.setLetterSpacing(obtainStyledAttributes.getFloat(C7705l.L(iArr, android.R.attr.letterSpacing), 0.0f));
        textPaint.setTypeface(g.e(obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.fontFamily), R$font.onest_semibold), context));
        textPaint.setTextSize(obtainStyledAttributes.getDimension(C7705l.L(iArr, android.R.attr.textSize), UiExtKt.toSpF(12)));
        obtainStyledAttributes.recycle();
    }

    public static final void applyStyle(@NotNull Paint paint, @NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = textAttrs;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        paint.setFontFeatureSettings(obtainStyledAttributes.getString(C7705l.L(iArr, android.R.attr.fontFeatureSettings)));
        paint.setLetterSpacing(obtainStyledAttributes.getFloat(C7705l.L(iArr, android.R.attr.letterSpacing), 0.0f));
        paint.setTypeface(g.e(obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.fontFamily), R$font.onest_semibold), context));
        paint.setTextSize(obtainStyledAttributes.getDimension(C7705l.L(iArr, android.R.attr.textSize), UiExtKt.toSpF(12)));
        obtainStyledAttributes.recycle();
    }
}
