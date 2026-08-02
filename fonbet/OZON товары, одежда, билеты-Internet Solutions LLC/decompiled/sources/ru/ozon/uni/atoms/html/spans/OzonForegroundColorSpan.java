package ru.ozon.uni.atoms.html.spans;

import android.app.Application;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/uni/atoms/html/spans/OzonForegroundColorSpan;", "Landroid/text/style/ForegroundColorSpan;", "", "semanticColor", "<init>", "(Ljava/lang/String;)V", "Lru/ozon/uni/android/uikit/common/StyleParser;", "color", "", "parseColor", "(Lru/ozon/uni/android/uikit/common/StyleParser;Ljava/lang/String;)I", "getForegroundColor", "()I", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "prevColor", "Ljava/lang/Integer;", "getPrevColor", "()Ljava/lang/Integer;", "setPrevColor", "(Ljava/lang/Integer;)V", "Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;", "defaultColor", "Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;", "getDefaultColor", "()Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;", "setDefaultColor", "(Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzonForegroundColorSpan extends ForegroundColorSpan {
    private StyleParser.OzColor defaultColor;
    private Integer prevColor;

    @NotNull
    private final String semanticColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonForegroundColorSpan(@NotNull String semanticColor) {
        super(0);
        Intrinsics.checkNotNullParameter(semanticColor, "semanticColor");
        this.semanticColor = semanticColor;
    }

    private final int parseColor(StyleParser styleParser, String str) {
        Integer parseColor = styleParser.parseColor(styleParser.getApplication(), str);
        if (parseColor == null) {
            Application application = styleParser.getApplication();
            StyleParser.OzColor ozColor = this.defaultColor;
            parseColor = styleParser.parseColor(application, ozColor != null ? ozColor.getValue() : null);
        }
        if (parseColor != null) {
            this.prevColor = parseColor;
            return parseColor.intValue();
        }
        Integer num = this.prevColor;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!OzonForegroundColorSpan.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.atoms.html.spans.OzonForegroundColorSpan");
        return Intrinsics.d(this.semanticColor, ((OzonForegroundColorSpan) other).semanticColor);
    }

    @Override // android.text.style.ForegroundColorSpan
    public int getForegroundColor() {
        return parseColor(StyleParser.INSTANCE, this.semanticColor);
    }

    public int hashCode() {
        return this.semanticColor.hashCode();
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setColor(parseColor(StyleParser.INSTANCE, this.semanticColor));
    }
}
