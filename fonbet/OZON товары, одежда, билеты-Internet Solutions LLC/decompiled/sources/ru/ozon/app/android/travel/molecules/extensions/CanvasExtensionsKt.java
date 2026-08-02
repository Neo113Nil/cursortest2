package ru.ozon.app.android.travel.molecules.extensions;

import android.graphics.Canvas;
import android.text.StaticLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a$\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¨\u0006\u0011"}, d2 = {"drawMultilineText", "", "Landroid/graphics/Canvas;", "cashHash", "", "textParams", "Lru/ozon/app/android/travel/molecules/extensions/TextParams;", "textRowsParams", "Lru/ozon/app/android/travel/molecules/extensions/TextRowsParams;", "textBlockParams", "Lru/ozon/app/android/travel/molecules/extensions/TextBlockParams;", "draw", "Landroid/text/StaticLayout;", "canvas", "x", "", "y", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CanvasExtensionsKt {
    private static final void draw(StaticLayout staticLayout, Canvas canvas, float f7, float f11) {
        int save = canvas.save();
        canvas.translate(f7, f11);
        try {
            staticLayout.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void drawMultilineText(@NotNull Canvas canvas, @NotNull String cashHash, @NotNull TextParams textParams, @NotNull TextRowsParams textRowsParams, @NotNull TextBlockParams textBlockParams) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(cashHash, "cashHash");
        Intrinsics.checkNotNullParameter(textParams, "textParams");
        Intrinsics.checkNotNullParameter(textRowsParams, "textRowsParams");
        Intrinsics.checkNotNullParameter(textBlockParams, "textBlockParams");
        StaticLayoutCache staticLayoutCache = StaticLayoutCache.INSTANCE;
        StaticLayout staticLayout = staticLayoutCache.get(cashHash);
        if (staticLayout == null) {
            staticLayout = StaticLayout.Builder.obtain(textParams.getText(), textParams.getStart(), textParams.getEnd(), textParams.getTextPaint(), textBlockParams.getWidth()).setAlignment(textBlockParams.getAlignment()).setTextDirection(textBlockParams.getTextDir()).setLineSpacing(textRowsParams.getSpacingAdd(), textRowsParams.getSpacingMult()).setIncludePad(textParams.getIncludePad()).setEllipsizedWidth(textRowsParams.getEllipsizedWidth()).setEllipsize(textRowsParams.getEllipsize()).setMaxLines(textRowsParams.getMaxLines()).setHyphenationFrequency(textRowsParams.getHyphenationFrequency()).build();
            Intrinsics.f(staticLayout);
            staticLayoutCache.set(cashHash, staticLayout);
            Intrinsics.checkNotNullExpressionValue(staticLayout, "apply(...)");
        }
        draw(staticLayout, canvas, textBlockParams.getX(), textBlockParams.getY());
    }
}
