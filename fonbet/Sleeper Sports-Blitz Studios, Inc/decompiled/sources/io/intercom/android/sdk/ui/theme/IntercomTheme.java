package io.intercom.android.sdk.ui.theme;

import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;

/* compiled from: IntercomTheme.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomTheme;", "", "<init>", "()V", LinearGradientManager.PROP_COLORS, "Lio/intercom/android/sdk/ui/theme/IntercomColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lio/intercom/android/sdk/ui/theme/IntercomColors;", "typography", "Lio/intercom/android/sdk/ui/theme/IntercomTypography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lio/intercom/android/sdk/ui/theme/IntercomTypography;", "shapes", "Landroidx/compose/material3/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomTheme {
    public static final int $stable = 0;
    public static final IntercomTheme INSTANCE = new IntercomTheme();

    private IntercomTheme() {
    }

    public final IntercomColors getColors(Composer composer, int i) {
        composer.startReplaceGroup(159743073);
        ProvidableCompositionLocal<IntercomColors> localIntercomColors = IntercomColorsKt.getLocalIntercomColors();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localIntercomColors);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IntercomColors intercomColors = (IntercomColors) consume;
        composer.endReplaceGroup();
        return intercomColors;
    }

    public final IntercomTypography getTypography(Composer composer, int i) {
        composer.startReplaceGroup(-989585502);
        ProvidableCompositionLocal<IntercomTypography> localIntercomTypography = IntercomTypographyKt.getLocalIntercomTypography();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localIntercomTypography);
        ComposerKt.sourceInformationMarkerEnd(composer);
        IntercomTypography intercomTypography = (IntercomTypography) consume;
        composer.endReplaceGroup();
        return intercomTypography;
    }

    public final Shapes getShapes(Composer composer, int i) {
        composer.startReplaceGroup(-474718694);
        ProvidableCompositionLocal<Shapes> localShapes = IntercomThemeKt.getLocalShapes();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localShapes);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Shapes shapes = (Shapes) consume;
        composer.endReplaceGroup();
        return shapes;
    }
}
