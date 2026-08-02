package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper;

import Lm0.a;
import Pk0.b;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper;", "", "<init>", "()V", "defSize", "", "defTypeface", "Landroid/graphics/Typeface;", "attrs", "", "getStyleAttributes", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;", "context", "Landroid/content/Context;", "style", "", "defStyle", "ParsedTextStyle", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ParseTextStyleHelper {

    @NotNull
    private final int[] attrs;
    private final int defSize = ResourceExtKt.toSp(10);

    @NotNull
    private final Typeface defTypeface;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/ParseTextStyleHelper$ParsedTextStyle;", "", "", "textSize", "Landroid/graphics/Typeface;", "fontFamily", "lineSpacingMultiplier", "letterSpacing", "<init>", "(FLandroid/graphics/Typeface;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getTextSize", "()F", "Landroid/graphics/Typeface;", "getFontFamily", "()Landroid/graphics/Typeface;", "getLineSpacingMultiplier", "getLetterSpacing", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParsedTextStyle {

        @NotNull
        private final Typeface fontFamily;
        private final float letterSpacing;
        private final float lineSpacingMultiplier;
        private final float textSize;

        public ParsedTextStyle(float f7, @NotNull Typeface fontFamily, float f11, float f12) {
            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
            this.textSize = f7;
            this.fontFamily = fontFamily;
            this.lineSpacingMultiplier = f11;
            this.letterSpacing = f12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedTextStyle)) {
                return false;
            }
            ParsedTextStyle parsedTextStyle = (ParsedTextStyle) other;
            return Float.compare(this.textSize, parsedTextStyle.textSize) == 0 && Intrinsics.d(this.fontFamily, parsedTextStyle.fontFamily) && Float.compare(this.lineSpacingMultiplier, parsedTextStyle.lineSpacingMultiplier) == 0 && Float.compare(this.letterSpacing, parsedTextStyle.letterSpacing) == 0;
        }

        @NotNull
        public final Typeface getFontFamily() {
            return this.fontFamily;
        }

        public final float getLetterSpacing() {
            return this.letterSpacing;
        }

        public final float getLineSpacingMultiplier() {
            return this.lineSpacingMultiplier;
        }

        public final float getTextSize() {
            return this.textSize;
        }

        public int hashCode() {
            return Float.hashCode(this.letterSpacing) + b.a(this.lineSpacingMultiplier, (this.fontFamily.hashCode() + (Float.hashCode(this.textSize) * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ParsedTextStyle(textSize=" + this.textSize + ", fontFamily=" + this.fontFamily + ", lineSpacingMultiplier=" + this.lineSpacingMultiplier + ", letterSpacing=" + this.letterSpacing + ")";
        }
    }

    public ParseTextStyleHelper() {
        Typeface DEFAULT = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.defTypeface = DEFAULT;
        int[] iArr = {R.attr.textSize, R.attr.lineSpacingMultiplier, R.attr.letterSpacing, R$attr.fontFamily};
        C7705l.Z(iArr);
        this.attrs = iArr;
    }

    @SuppressLint({"ResourceType"})
    @NotNull
    public final ParsedTextStyle getStyleAttributes(@NotNull Context context, @NotNull String style, int defStyle) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(style);
        if (parseTextStyle != null) {
            defStyle = parseTextStyle.intValue();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(defStyle, this.attrs);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7705l.L(this.attrs, R.attr.textSize), this.defSize);
        try {
            typeface = g.e(obtainStyledAttributes.getResourceId(C7705l.L(this.attrs, R$attr.fontFamily), -1), context);
            if (typeface == null) {
                typeface = this.defTypeface;
            }
        } catch (Exception e11) {
            a.f17149a.e(e11);
            typeface = this.defTypeface;
        }
        float f7 = obtainStyledAttributes.getFloat(C7705l.L(this.attrs, R.attr.lineSpacingMultiplier), 1.28f);
        float f11 = obtainStyledAttributes.getFloat(C7705l.L(this.attrs, R.attr.letterSpacing), 0.014f);
        obtainStyledAttributes.recycle();
        return new ParsedTextStyle(dimensionPixelSize, typeface, f7, f11);
    }
}
