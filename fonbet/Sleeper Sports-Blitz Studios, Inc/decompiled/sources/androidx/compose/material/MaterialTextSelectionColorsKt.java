package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.exoplayer.offline.DownloadService;
import com.facebook.react.modules.appstate.AppStateModule;
import com.henninghall.date_picker.props.TextColorProp;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;

/* compiled from: MaterialTextSelectionColors.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000e\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u000e\u0010\u0018\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "calculateSelectionBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "selectionColor", TextColorProp.name, "backgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "binarySearchForAccessibleSelectionColorAlpha", "", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", DownloadService.KEY_FOREGROUND, AppStateModule.APP_STATE_BACKGROUND, "calculateContrastRatio--OWjLjI", "(JJ)F", "DefaultSelectionBackgroundAlpha", "MinimumSelectionBackgroundAlpha", "DesiredContrastRatio", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    public static final TextSelectionColors rememberTextSelectionColors(Colors colors, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -721696685, "C(rememberTextSelectionColors)N(colors)45@1907L6,46@1926L418:MaterialTextSelectionColors.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m2273getPrimary0d7_KjU = colors.m2273getPrimary0d7_KjU();
        long m2266getBackground0d7_KjU = colors.m2266getBackground0d7_KjU();
        composer.startReplaceGroup(-2060761573);
        ComposerKt.sourceInformation(composer, "*44@1858L7");
        long m2290contentColorFor4WTKRHQ = ColorsKt.m2290contentColorFor4WTKRHQ(colors, m2266getBackground0d7_KjU);
        if (m2290contentColorFor4WTKRHQ == 16) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            m2290contentColorFor4WTKRHQ = ((Color) consume).m6049unboximpl();
        }
        composer.endReplaceGroup();
        long m6038copywmQWz5c$default = Color.m6038copywmQWz5c$default(m2290contentColorFor4WTKRHQ, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        ComposerKt.sourceInformationMarkerStart(composer, -2060758027, "CC(remember):MaterialTextSelectionColors.kt#9igjgp");
        boolean changed = composer.changed(m2273getPrimary0d7_KjU) | composer.changed(m2266getBackground0d7_KjU) | composer.changed(m6038copywmQWz5c$default);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            TextSelectionColors textSelectionColors = new TextSelectionColors(colors.m2273getPrimary0d7_KjU(), m2377calculateSelectionBackgroundColorysEtTa8(m2273getPrimary0d7_KjU, m6038copywmQWz5c$default, m2266getBackground0d7_KjU), null);
            composer.updateRememberedValue(textSelectionColors);
            rememberedValue = textSelectionColors;
        }
        TextSelectionColors textSelectionColors2 = (TextSelectionColors) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textSelectionColors2;
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m2377calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float m2374binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float m2376calculateContrastRationb2GgbA = m2376calculateContrastRationb2GgbA(j, 0.4f, j2, j3);
        float m2376calculateContrastRationb2GgbA2 = m2376calculateContrastRationb2GgbA(j, 0.2f, j2, j3);
        if (m2376calculateContrastRationb2GgbA >= DesiredContrastRatio) {
            m2374binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else {
            m2374binarySearchForAccessibleSelectionColorAlphaysEtTa8 = m2376calculateContrastRationb2GgbA2 < DesiredContrastRatio ? 0.2f : m2374binarySearchForAccessibleSelectionColorAlphaysEtTa8(j, j2, j3);
        }
        return Color.m6038copywmQWz5c$default(j, m2374binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m2374binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j, long j2, long j3) {
        int i = 0;
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        while (i < 7) {
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float m2376calculateContrastRationb2GgbA = (m2376calculateContrastRationb2GgbA(j4, f2, j5, j6) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m2376calculateContrastRationb2GgbA && m2376calculateContrastRationb2GgbA <= 0.01f) {
                return f2;
            }
            if (m2376calculateContrastRationb2GgbA < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
            i++;
            j = j4;
            j2 = j5;
            j3 = j6;
        }
        return f2;
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m2376calculateContrastRationb2GgbA(long j, float f, long j2, long j3) {
        long m6084compositeOverOWjLjI = ColorKt.m6084compositeOverOWjLjI(Color.m6038copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m2375calculateContrastRatioOWjLjI(ColorKt.m6084compositeOverOWjLjI(j2, m6084compositeOverOWjLjI), m6084compositeOverOWjLjI);
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m2375calculateContrastRatioOWjLjI(long j, long j2) {
        float m6091luminance8_81llA = ColorKt.m6091luminance8_81llA(j) + 0.05f;
        float m6091luminance8_81llA2 = ColorKt.m6091luminance8_81llA(j2) + 0.05f;
        return Math.max(m6091luminance8_81llA, m6091luminance8_81llA2) / Math.min(m6091luminance8_81llA, m6091luminance8_81llA2);
    }
}
