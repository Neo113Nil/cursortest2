package ru.ozon.uni.android.util;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import androidx.core.content.a;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/android/util/TextPaintStyleParser;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "applyStyle", "", "paint", "Landroid/text/TextPaint;", "style", "", "textColor", "(Landroid/text/TextPaint;ILjava/lang/Integer;)V", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextPaintStyleParser {

    @NotNull
    private static final int[] attrs;
    private static final float defaultTextSize;

    @NotNull
    private final Context context;
    public static final int $stable = 8;

    static {
        int[] iArr = {R.attr.fontFamily, R.attr.fontFeatureSettings, R.attr.letterSpacing, R.attr.textSize, R.attr.textStyle, R.attr.textColor, ru.ozon.app.android.R.attr.fontWeight};
        C7705l.Z(iArr);
        attrs = iArr;
        defaultTextSize = UiExtKt.toSpF(12);
    }

    public TextPaintStyleParser(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ void applyStyle$default(TextPaintStyleParser textPaintStyleParser, TextPaint textPaint, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        textPaintStyleParser.applyStyle(textPaint, i11, num);
    }

    @SuppressLint({"Range"})
    public final void applyStyle(@NotNull TextPaint paint, int style, Integer textColor) {
        Typeface create;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Context context = this.context;
        int[] iArr = attrs;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        paint.setFontFeatureSettings(obtainStyledAttributes.getString(C7705l.L(iArr, R.attr.fontFeatureSettings)));
        paint.setLetterSpacing(obtainStyledAttributes.getFloat(C7705l.L(iArr, R.attr.letterSpacing), 0.0f));
        int resourceId = obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.fontFamily), R$font.onest_regular);
        int i11 = obtainStyledAttributes.getInt(C7705l.L(iArr, R.attr.textStyle), 0);
        int i12 = obtainStyledAttributes.getInt(C7705l.L(iArr, ru.ozon.app.android.R.attr.fontWeight), -1);
        Typeface e11 = g.e(resourceId, this.context);
        if (Build.VERSION.SDK_INT < 28 || i12 <= 0 || i12 > 1000) {
            create = Typeface.create(e11, i11);
        } else {
            create = Typeface.create(e11, i12, i11 == 2);
        }
        paint.setTypeface(create);
        paint.setTextSize(obtainStyledAttributes.getDimension(C7705l.L(iArr, R.attr.textSize), defaultTextSize));
        paint.setColor(textColor != null ? textColor.intValue() : obtainStyledAttributes.getColor(C7705l.L(iArr, R.attr.textColor), a.getColor(this.context, R$color.oz_text_primary)));
        obtainStyledAttributes.recycle();
    }
}
