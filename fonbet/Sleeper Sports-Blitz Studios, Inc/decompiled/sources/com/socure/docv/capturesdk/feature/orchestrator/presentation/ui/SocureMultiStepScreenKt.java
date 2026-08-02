package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.WavUtil;
import androidx.profileinstaller.ProfileVerifier;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.view.BrandLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SocureMultiStepScreen.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001aE\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160 2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\"\u001a;\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0003¢\u0006\u0002\u0010&\u001a/\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u001d2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010+\u001a\u001f\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u001d2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010.\u001a\u001f\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u0002012\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u00102\u001a'\u00103\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u00104\u001a\u001f\u00105\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u001d2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010.\u001aY\u00106\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u00107\u001a\u0002012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160 2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0007¢\u0006\u0002\u00109\u001a\r\u0010:\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010;\u001a\r\u0010<\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010;\u001a\r\u0010=\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010;\u001a\r\u0010>\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010;\u001a\r\u0010?\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010;\u001a\u001f\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020B2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010C\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0013X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"BOTTOM_SPACING", "", "BRAND_SPACING", "BUTTON_BORDER_WIDTH", "BUTTON_CORNER_RADIUS", "BUTTON_FONT_SIZE", "BUTTON_HORIZONTAL_PADDING", "BUTTON_SPACING", "BUTTON_VERTICAL_PADDING", "CONTENT_HORIZONTAL_PADDING", "INNER_CONTENT_SPACING", "PROGRESS_BAR_CORNER_RADIUS", "PROGRESS_BAR_HEIGHT", "PROGRESS_BAR_SPACING", "buttonContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "buttonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "buttonTextFontSize", "Landroidx/compose/ui/unit/TextUnit;", "J", "BrandAttribution", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BrandImage", "Buttons", "primaryText", "", "secondaryText", "onPrimaryCTAClick", "Lkotlin/Function0;", "onSecondaryCTAClick", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Content", "state", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/SocureMultiStepScreenState;", "(Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/SocureMultiStepScreenState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MultiDocProgress", "currentStep", "totalSteps", ApiConstant.DOCUMENT_TYPE, "(IILjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrimaryText", "text", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProgressSegment", "isCompleted", "", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProgressSegments", "(IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SecondaryText", "SocureMultiStepScreen", "showCloseIcon", "onCloseClick", "(Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/SocureMultiStepScreenState;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SocureMultiStepScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "SpaceBottom", "SpaceBrandSection", "SpaceButtons", "SpaceInnerContent", "TertiaryText", "tertiaryTextData", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TertiaryTextData;", "(Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TertiaryTextData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SocureMultiStepScreenKt {
    private static final int BOTTOM_SPACING = 24;
    private static final int BRAND_SPACING = 32;
    private static final int BUTTON_BORDER_WIDTH = 1;
    private static final int BUTTON_CORNER_RADIUS = 8;
    private static final int BUTTON_FONT_SIZE = 16;
    private static final int BUTTON_HORIZONTAL_PADDING = 16;
    private static final int BUTTON_SPACING = 12;
    private static final int BUTTON_VERTICAL_PADDING = 16;
    private static final int CONTENT_HORIZONTAL_PADDING = 24;
    private static final int INNER_CONTENT_SPACING = 24;
    private static final int PROGRESS_BAR_CORNER_RADIUS = 4;
    private static final int PROGRESS_BAR_HEIGHT = 8;
    private static final int PROGRESS_BAR_SPACING = 4;
    private static final PaddingValues buttonContentPadding;
    private static final RoundedCornerShape buttonShape = RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(8));
    private static final long buttonTextFontSize = TextUnitKt.getSp(16);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SocureMultiStepScreen(final SocureMultiStepScreenState state, Modifier modifier, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function04;
        int i6;
        Function0<Unit> function05;
        int i7;
        Function0<Unit> function06;
        Composer composer2;
        final boolean z3;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        final Modifier modifier3;
        final Function0<Unit> function09;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-436453616);
        ComposerKt.sourceInformation(startRestartGroup, "C(SocureMultiStepScreen)P(5!1,4,2,3)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    function04 = function0;
                    i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        function05 = function02;
                        i3 |= startRestartGroup.changedInstance(function05) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((458752 & i) == 0) {
                            function06 = function03;
                            i3 |= startRestartGroup.changedInstance(function06) ? 131072 : 65536;
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                final boolean z4 = i4 == 0 ? false : z2;
                                final SocureMultiStepScreenKt$SocureMultiStepScreen$1 socureMultiStepScreenKt$SocureMultiStepScreen$1 = i5 == 0 ? new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                } : function04;
                                final SocureMultiStepScreenKt$SocureMultiStepScreen$2 socureMultiStepScreenKt$SocureMultiStepScreen$2 = i6 == 0 ? new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$2
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                } : function05;
                                final SocureMultiStepScreenKt$SocureMultiStepScreen$3 socureMultiStepScreenKt$SocureMultiStepScreen$3 = i7 == 0 ? new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$3
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }
                                } : function06;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-436453616, i3, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen (SocureMultiStepScreen.kt:85)");
                                }
                                Function0<Unit> function010 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                                Modifier modifier4 = companion;
                                composer2 = startRestartGroup;
                                ScaffoldKt.m3518ScaffoldTvnljyQ(modifier4, ComposableLambdaKt.composableLambda(startRestartGroup, -162584884, true, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162584884, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:95)");
                                            }
                                            Function2<Composer, Integer, Unit> m11543getLambda1$capturesdk_productionRelease = ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11543getLambda1$capturesdk_productionRelease();
                                            final Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                                            final boolean z5 = z4;
                                            final int i10 = i3;
                                            AppBarKt.TopAppBar(m11543getLambda1$capturesdk_productionRelease, null, null, ComposableLambdaKt.composableLambda(composer3, -947119429, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                                    invoke(rowScope, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(RowScope TopAppBar, Composer composer4, int i11) {
                                                    Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                                                    if ((i11 & 81) != 16 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-947119429, i11, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:98)");
                                                        }
                                                        IconButtonKt.IconButton(function011, Modifier.INSTANCE.then(z5 ? Modifier.INSTANCE : AlphaKt.alpha(Modifier.INSTANCE, 0.0f)), false, null, null, ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11544getLambda2$capturesdk_productionRelease(), composer4, ((i10 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), null, null, null, composer3, 3078, 118);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1398565791, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                                        int i10;
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i9 & 14) == 0) {
                                            i10 = (composer3.changed(paddingValues) ? 4 : 2) | i9;
                                        } else {
                                            i10 = i9;
                                        }
                                        if ((i10 & 91) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1398565791, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:113)");
                                            }
                                            SocureMultiStepScreenState socureMultiStepScreenState = SocureMultiStepScreenState.this;
                                            Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), Dp.m8798constructorimpl(24), 0.0f, 2, null);
                                            Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                                            Function0<Unit> function012 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                                            int i11 = i3;
                                            SocureMultiStepScreenKt.Content(socureMultiStepScreenState, m1159paddingVpY3zN4$default, function011, function012, composer3, (i11 & 14) | ((i11 >> 3) & 896) | ((i11 >> 3) & 7168), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, ((i3 >> 3) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z4;
                                function07 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                                function08 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                                modifier3 = modifier4;
                                function09 = function010;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                composer2 = startRestartGroup;
                                modifier3 = modifier2;
                                z3 = z2;
                                function07 = function04;
                                function08 = function05;
                                function09 = function06;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    SocureMultiStepScreenKt.SocureMultiStepScreen(SocureMultiStepScreenState.this, modifier3, z3, function07, function08, function09, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        function06 = function03;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Function0<Unit> function0102 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                        Modifier modifier42 = companion;
                        composer2 = startRestartGroup;
                        ScaffoldKt.m3518ScaffoldTvnljyQ(modifier42, ComposableLambdaKt.composableLambda(startRestartGroup, -162584884, true, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162584884, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:95)");
                                    }
                                    Function2<Composer, Integer, Unit> m11543getLambda1$capturesdk_productionRelease = ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11543getLambda1$capturesdk_productionRelease();
                                    final Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                                    final boolean z5 = z4;
                                    final int i10 = i3;
                                    AppBarKt.TopAppBar(m11543getLambda1$capturesdk_productionRelease, null, null, ComposableLambdaKt.composableLambda(composer3, -947119429, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope TopAppBar, Composer composer4, int i11) {
                                            Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                                            if ((i11 & 81) != 16 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-947119429, i11, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:98)");
                                                }
                                                IconButtonKt.IconButton(function011, Modifier.INSTANCE.then(z5 ? Modifier.INSTANCE : AlphaKt.alpha(Modifier.INSTANCE, 0.0f)), false, null, null, ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11544getLambda2$capturesdk_productionRelease(), composer4, ((i10 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), null, null, null, composer3, 3078, 118);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1398565791, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                                int i10;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i9 & 14) == 0) {
                                    i10 = (composer3.changed(paddingValues) ? 4 : 2) | i9;
                                } else {
                                    i10 = i9;
                                }
                                if ((i10 & 91) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1398565791, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:113)");
                                    }
                                    SocureMultiStepScreenState socureMultiStepScreenState = SocureMultiStepScreenState.this;
                                    Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), Dp.m8798constructorimpl(24), 0.0f, 2, null);
                                    Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                                    Function0<Unit> function012 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                                    int i11 = i3;
                                    SocureMultiStepScreenKt.Content(socureMultiStepScreenState, m1159paddingVpY3zN4$default, function011, function012, composer3, (i11 & 14) | ((i11 >> 3) & 896) | ((i11 >> 3) & 7168), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, ((i3 >> 3) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z4;
                        function07 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                        function08 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                        modifier3 = modifier42;
                        function09 = function0102;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function05 = function02;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function06 = function03;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Function0<Unit> function01022 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                    Modifier modifier422 = companion;
                    composer2 = startRestartGroup;
                    ScaffoldKt.m3518ScaffoldTvnljyQ(modifier422, ComposableLambdaKt.composableLambda(startRestartGroup, -162584884, true, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-162584884, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:95)");
                                }
                                Function2<Composer, Integer, Unit> m11543getLambda1$capturesdk_productionRelease = ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11543getLambda1$capturesdk_productionRelease();
                                final Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                                final boolean z5 = z4;
                                final int i10 = i3;
                                AppBarKt.TopAppBar(m11543getLambda1$capturesdk_productionRelease, null, null, ComposableLambdaKt.composableLambda(composer3, -947119429, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                        invoke(rowScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope TopAppBar, Composer composer4, int i11) {
                                        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                                        if ((i11 & 81) != 16 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-947119429, i11, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:98)");
                                            }
                                            IconButtonKt.IconButton(function011, Modifier.INSTANCE.then(z5 ? Modifier.INSTANCE : AlphaKt.alpha(Modifier.INSTANCE, 0.0f)), false, null, null, ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11544getLambda2$capturesdk_productionRelease(), composer4, ((i10 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), null, null, null, composer3, 3078, 118);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1398565791, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                            int i10;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i9 & 14) == 0) {
                                i10 = (composer3.changed(paddingValues) ? 4 : 2) | i9;
                            } else {
                                i10 = i9;
                            }
                            if ((i10 & 91) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1398565791, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:113)");
                                }
                                SocureMultiStepScreenState socureMultiStepScreenState = SocureMultiStepScreenState.this;
                                Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), Dp.m8798constructorimpl(24), 0.0f, 2, null);
                                Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                                Function0<Unit> function012 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                                int i11 = i3;
                                SocureMultiStepScreenKt.Content(socureMultiStepScreenState, m1159paddingVpY3zN4$default, function011, function012, composer3, (i11 & 14) | ((i11 >> 3) & 896) | ((i11 >> 3) & 7168), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, ((i3 >> 3) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                    function07 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                    function08 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                    modifier3 = modifier422;
                    function09 = function01022;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function04 = function0;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function05 = function02;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function06 = function03;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Function0<Unit> function010222 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                Modifier modifier4222 = companion;
                composer2 = startRestartGroup;
                ScaffoldKt.m3518ScaffoldTvnljyQ(modifier4222, ComposableLambdaKt.composableLambda(startRestartGroup, -162584884, true, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-162584884, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:95)");
                            }
                            Function2<Composer, Integer, Unit> m11543getLambda1$capturesdk_productionRelease = ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11543getLambda1$capturesdk_productionRelease();
                            final Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                            final boolean z5 = z4;
                            final int i10 = i3;
                            AppBarKt.TopAppBar(m11543getLambda1$capturesdk_productionRelease, null, null, ComposableLambdaKt.composableLambda(composer3, -947119429, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                    invoke(rowScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope TopAppBar, Composer composer4, int i11) {
                                    Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                                    if ((i11 & 81) != 16 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-947119429, i11, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:98)");
                                        }
                                        IconButtonKt.IconButton(function011, Modifier.INSTANCE.then(z5 ? Modifier.INSTANCE : AlphaKt.alpha(Modifier.INSTANCE, 0.0f)), false, null, null, ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11544getLambda2$capturesdk_productionRelease(), composer4, ((i10 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), null, null, null, composer3, 3078, 118);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1398565791, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                        int i10;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i9 & 14) == 0) {
                            i10 = (composer3.changed(paddingValues) ? 4 : 2) | i9;
                        } else {
                            i10 = i9;
                        }
                        if ((i10 & 91) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1398565791, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:113)");
                            }
                            SocureMultiStepScreenState socureMultiStepScreenState = SocureMultiStepScreenState.this;
                            Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), Dp.m8798constructorimpl(24), 0.0f, 2, null);
                            Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                            Function0<Unit> function012 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                            int i11 = i3;
                            SocureMultiStepScreenKt.Content(socureMultiStepScreenState, m1159paddingVpY3zN4$default, function011, function012, composer3, (i11 & 14) | ((i11 >> 3) & 896) | ((i11 >> 3) & 7168), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, ((i3 >> 3) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z4;
                function07 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                function08 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                modifier3 = modifier4222;
                function09 = function010222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function04 = function0;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function05 = function02;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function06 = function03;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Function0<Unit> function0102222 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
            Modifier modifier42222 = companion;
            composer2 = startRestartGroup;
            ScaffoldKt.m3518ScaffoldTvnljyQ(modifier42222, ComposableLambdaKt.composableLambda(startRestartGroup, -162584884, true, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-162584884, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:95)");
                        }
                        Function2<Composer, Integer, Unit> m11543getLambda1$capturesdk_productionRelease = ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11543getLambda1$capturesdk_productionRelease();
                        final Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                        final boolean z5 = z4;
                        final int i10 = i3;
                        AppBarKt.TopAppBar(m11543getLambda1$capturesdk_productionRelease, null, null, ComposableLambdaKt.composableLambda(composer3, -947119429, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                invoke(rowScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope TopAppBar, Composer composer4, int i11) {
                                Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                                if ((i11 & 81) != 16 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-947119429, i11, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:98)");
                                    }
                                    IconButtonKt.IconButton(function011, Modifier.INSTANCE.then(z5 ? Modifier.INSTANCE : AlphaKt.alpha(Modifier.INSTANCE, 0.0f)), false, null, null, ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11544getLambda2$capturesdk_productionRelease(), composer4, ((i10 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), null, null, null, composer3, 3078, 118);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1398565791, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                    int i10;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i9 & 14) == 0) {
                        i10 = (composer3.changed(paddingValues) ? 4 : 2) | i9;
                    } else {
                        i10 = i9;
                    }
                    if ((i10 & 91) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1398565791, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:113)");
                        }
                        SocureMultiStepScreenState socureMultiStepScreenState = SocureMultiStepScreenState.this;
                        Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), Dp.m8798constructorimpl(24), 0.0f, 2, null);
                        Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                        Function0<Unit> function012 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                        int i11 = i3;
                        SocureMultiStepScreenKt.Content(socureMultiStepScreenState, m1159paddingVpY3zN4$default, function011, function012, composer3, (i11 & 14) | ((i11 >> 3) & 896) | ((i11 >> 3) & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ((i3 >> 3) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            function07 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
            function08 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
            modifier3 = modifier42222;
            function09 = function0102222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function04 = function0;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function05 = function02;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function06 = function03;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Function0<Unit> function01022222 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
        Modifier modifier422222 = companion;
        composer2 = startRestartGroup;
        ScaffoldKt.m3518ScaffoldTvnljyQ(modifier422222, ComposableLambdaKt.composableLambda(startRestartGroup, -162584884, true, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i9) {
                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-162584884, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:95)");
                    }
                    Function2<Composer, Integer, Unit> m11543getLambda1$capturesdk_productionRelease = ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11543getLambda1$capturesdk_productionRelease();
                    final Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$3;
                    final boolean z5 = z4;
                    final int i10 = i3;
                    AppBarKt.TopAppBar(m11543getLambda1$capturesdk_productionRelease, null, null, ComposableLambdaKt.composableLambda(composer3, -947119429, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                            invoke(rowScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope TopAppBar, Composer composer4, int i11) {
                            Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                            if ((i11 & 81) != 16 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-947119429, i11, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:98)");
                                }
                                IconButtonKt.IconButton(function011, Modifier.INSTANCE.then(z5 ? Modifier.INSTANCE : AlphaKt.alpha(Modifier.INSTANCE, 0.0f)), false, null, null, ComposableSingletons$SocureMultiStepScreenKt.INSTANCE.m11544getLambda2$capturesdk_productionRelease(), composer4, ((i10 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), null, null, null, composer3, 3078, 118);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1398565791, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreen$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                invoke(paddingValues, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer3, int i9) {
                int i10;
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i9 & 14) == 0) {
                    i10 = (composer3.changed(paddingValues) ? 4 : 2) | i9;
                } else {
                    i10 = i9;
                }
                if ((i10 & 91) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1398565791, i9, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreen.<anonymous> (SocureMultiStepScreen.kt:113)");
                    }
                    SocureMultiStepScreenState socureMultiStepScreenState = SocureMultiStepScreenState.this;
                    Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), Dp.m8798constructorimpl(24), 0.0f, 2, null);
                    Function0<Unit> function011 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
                    Function0<Unit> function012 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
                    int i11 = i3;
                    SocureMultiStepScreenKt.Content(socureMultiStepScreenState, m1159paddingVpY3zN4$default, function011, function012, composer3, (i11 & 14) | ((i11 >> 3) & 896) | ((i11 >> 3) & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, ((i3 >> 3) & 14) | 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z4;
        function07 = socureMultiStepScreenKt$SocureMultiStepScreen$1;
        function08 = socureMultiStepScreenKt$SocureMultiStepScreen$2;
        modifier3 = modifier422222;
        function09 = function01022222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0260 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(SocureMultiStepScreenState socureMultiStepScreenState, Modifier modifier, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i, final int i2) {
        final SocureMultiStepScreenState socureMultiStepScreenState2;
        int i3;
        Modifier modifier2;
        Function0<Unit> function03;
        String secondaryText;
        TertiaryTextData tertiaryText;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1125315697);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            socureMultiStepScreenState2 = socureMultiStepScreenState;
        } else if ((i & 14) == 0) {
            socureMultiStepScreenState2 = socureMultiStepScreenState;
            i3 = (startRestartGroup.changed(socureMultiStepScreenState2) ? 4 : 2) | i;
        } else {
            socureMultiStepScreenState2 = socureMultiStepScreenState;
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                function03 = function02;
            } else {
                function03 = function02;
                if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                }
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1125315697, i3, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.Content (SocureMultiStepScreen.kt:127)");
                }
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localViewConfiguration);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m5340setimpl(m5333constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m5340setimpl(m5333constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                SpaceBrandSection(startRestartGroup, 0);
                BrandImage(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                SpaceBrandSection(startRestartGroup, 0);
                MultiDocProgress(socureMultiStepScreenState2.getCurrentStep(), socureMultiStepScreenState2.getTotalSteps(), socureMultiStepScreenState2.getDocumentType(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 3072, 0);
                SpaceInnerContent(startRestartGroup, 0);
                PrimaryText(socureMultiStepScreenState2.getPrimaryText(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 48, 0);
                SpaceInnerContent(startRestartGroup, 0);
                secondaryText = socureMultiStepScreenState2.getSecondaryText();
                startRestartGroup.startReplaceableGroup(2064470614);
                if (secondaryText != null) {
                    SecondaryText(secondaryText, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 48, 0);
                    SpaceInnerContent(startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
                tertiaryText = socureMultiStepScreenState2.getTertiaryText();
                startRestartGroup.startReplaceableGroup(2064470774);
                if (tertiaryText != null) {
                    TertiaryText(tertiaryText, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 48, 0);
                    SpaceInnerContent(startRestartGroup, 0);
                }
                startRestartGroup.endReplaceableGroup();
                Buttons(socureMultiStepScreenState2.getPrimaryCtaText(), socureMultiStepScreenState2.getSecondaryCtaText(), function0, function03, null, startRestartGroup, i3 & 8064, 16);
                startRestartGroup = startRestartGroup;
                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                BrandAttribution(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                SpaceBottom(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    SocureMultiStepScreenKt.Content(SocureMultiStepScreenState.this, modifier3, function0, function02, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume4 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2 = (Density) consume4;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localLayoutDirection2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localViewConfiguration2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m5340setimpl(m5333constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m5340setimpl(m5333constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        SpaceBrandSection(startRestartGroup, 0);
        BrandImage(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
        SpaceBrandSection(startRestartGroup, 0);
        MultiDocProgress(socureMultiStepScreenState2.getCurrentStep(), socureMultiStepScreenState2.getTotalSteps(), socureMultiStepScreenState2.getDocumentType(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 3072, 0);
        SpaceInnerContent(startRestartGroup, 0);
        PrimaryText(socureMultiStepScreenState2.getPrimaryText(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 48, 0);
        SpaceInnerContent(startRestartGroup, 0);
        secondaryText = socureMultiStepScreenState2.getSecondaryText();
        startRestartGroup.startReplaceableGroup(2064470614);
        if (secondaryText != null) {
        }
        startRestartGroup.endReplaceableGroup();
        tertiaryText = socureMultiStepScreenState2.getTertiaryText();
        startRestartGroup.startReplaceableGroup(2064470774);
        if (tertiaryText != null) {
        }
        startRestartGroup.endReplaceableGroup();
        Buttons(socureMultiStepScreenState2.getPrimaryCtaText(), socureMultiStepScreenState2.getSecondaryCtaText(), function0, function03, null, startRestartGroup, i3 & 8064, 16);
        startRestartGroup = startRestartGroup;
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
        BrandAttribution(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
        SpaceBottom(startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BrandImage(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1913215951);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1913215951, i3, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.BrandImage (SocureMultiStepScreen.kt:179)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_socure_with_text, startRestartGroup, 0), "Socure", modifier2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, ((i3 << 6) & 896) | 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$BrandImage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                SocureMultiStepScreenKt.BrandImage(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0335 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MultiDocProgress(final int i, final int i2, final String str, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        String str2;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-813587358);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
            str2 = str;
        } else {
            str2 = str;
            if ((i3 & 896) == 0) {
                i5 |= startRestartGroup.changed(str2) ? 256 : 128;
            }
        }
        int i6 = i4 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i3 & 7168) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i5 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-813587358, i5, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.MultiDocProgress (SocureMultiStepScreen.kt:190)");
                }
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localViewConfiguration);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier4);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m5340setimpl(m5333constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m5340setimpl(m5333constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(localViewConfiguration2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(fillMaxWidth$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m5340setimpl(m5333constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m5340setimpl(m5333constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer2 = startRestartGroup;
                TextKt.m3903TextfLXpl1I(str2, null, 0L, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, ((i5 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                TextKt.m3903TextfLXpl1I(i + " / " + i2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), composer2, 6);
                ProgressSegments(i2, i, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, ((i5 << 3) & 112) | ((i5 >> 3) & 14) | 384, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$MultiDocProgress$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    SocureMultiStepScreenKt.MultiDocProgress(i, i2, str, modifier3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i5 & 5851) == 1170) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume7 = startRestartGroup.consume(localDensity3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density3 = (Density) consume7;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localLayoutDirection3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection3 = (LayoutDirection) consume22;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localViewConfiguration3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume32;
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(modifier4);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m5333constructorimpl3 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m5340setimpl(m5333constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m5340setimpl(m5333constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf3.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume42 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume42;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume52 = startRestartGroup.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection22 = (LayoutDirection) consume52;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume62 = startRestartGroup.consume(localViewConfiguration22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume62;
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(fillMaxWidth$default2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m5333constructorimpl22 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl22, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl22, density22, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m5340setimpl(m5333constructorimpl22, layoutDirection22, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m5340setimpl(m5333constructorimpl22, viewConfiguration22, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        composer2 = startRestartGroup;
        TextKt.m3903TextfLXpl1I(str2, null, 0L, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, ((i5 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
        TextKt.m3903TextfLXpl1I(i + " / " + i2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), composer2, 6);
        ProgressSegments(i2, i, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, ((i5 << 3) & 112) | ((i5 >> 3) & 14) | 384, 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ProgressSegments(final int i, final int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1400914450);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProgressSegments)P(2)");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 32 : 16;
        }
        int i6 = i4 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i3 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i5 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i6 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1400914450, i5, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.ProgressSegments (SocureMultiStepScreen.kt:217)");
            }
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m5340setimpl(m5333constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m5340setimpl(m5333constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i7 = 0;
            while (i7 < i) {
                ProgressSegment(i7 < i2, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0, 0);
                if (i7 < i - 1) {
                    SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), startRestartGroup, 6);
                }
                i7++;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$ProgressSegments$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                SocureMultiStepScreenKt.ProgressSegments(i, i2, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProgressSegment(final boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long Color;
        Composer startRestartGroup = composer.startRestartGroup(-1524805951);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1524805951, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.ProgressSegment (SocureMultiStepScreen.kt:232)");
            }
            startRestartGroup.startReplaceableGroup(-883776277);
            if (z) {
                Color = ColorResources_androidKt.colorResource(R.color.socure_black, startRestartGroup, 0);
            } else {
                Color = ColorKt.Color(4292927712L);
            }
            startRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m581backgroundbw27NRU(SizeKt.m1195height3ABfNKs(modifier, Dp.m8798constructorimpl(8)), Color, RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(4))), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$ProgressSegment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                SocureMultiStepScreenKt.ProgressSegment(z, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrimaryText(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1712478111);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 91) == 18 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1712478111, i3, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.PrimaryText (SocureMultiStepScreen.kt:247)");
                }
                composer2 = startRestartGroup;
                Modifier modifier3 = companion;
                TextKt.m3903TextfLXpl1I(str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8659getStarte0LSkKk()), 0L, 0, false, 0, null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), composer2, i3 & 14, 0, 32252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$PrimaryText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    SocureMultiStepScreenKt.PrimaryText(str, modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Modifier modifier32 = companion;
        TextKt.m3903TextfLXpl1I(str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0L, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8659getStarte0LSkKk()), 0L, 0, false, 0, null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), composer2, i3 & 14, 0, 32252);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SecondaryText(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(191066671);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 91) == 18 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(191066671, i3, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SecondaryText (SocureMultiStepScreen.kt:260)");
                }
                composer2 = startRestartGroup;
                modifier3 = companion;
                TextKt.m3903TextfLXpl1I(str, modifier3, 0L, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8659getStarte0LSkKk()), 0L, 0, false, 0, null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyLarge(), composer2, i3 & 126, 0, 32252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SecondaryText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    SocureMultiStepScreenKt.SecondaryText(str, modifier3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        modifier3 = companion;
        TextKt.m3903TextfLXpl1I(str, modifier3, 0L, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8659getStarte0LSkKk()), 0L, 0, false, 0, null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyLarge(), composer2, i3 & 126, 0, 32252);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TertiaryText(final TertiaryTextData tertiaryTextData, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Unit unit;
        String annotatedText;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(926915213);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(tertiaryTextData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 91) == 18 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(926915213, i3, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TertiaryText (SocureMultiStepScreen.kt:273)");
                }
                unit = null;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                String fullText = tertiaryTextData.getFullText();
                annotatedText = tertiaryTextData.getAnnotatedText();
                if (annotatedText != null) {
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) fullText, annotatedText, 0, false, 6, (Object) null);
                    if (indexOf$default != -1) {
                        String substring = fullText.substring(0, indexOf$default);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        builder.append(substring);
                        int pushStyle = builder.pushStyle(new SpanStyle(Color.INSTANCE.m6069getGray0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16382, (DefaultConstructorMarker) null));
                        try {
                            builder.append(annotatedText);
                            Unit unit2 = Unit.INSTANCE;
                            builder.pop(pushStyle);
                            int length = indexOf$default + annotatedText.length();
                            if (length < fullText.length()) {
                                String substring2 = fullText.substring(length);
                                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                builder.append(substring2);
                            }
                        } catch (Throwable th) {
                            builder.pop(pushStyle);
                            throw th;
                        }
                    } else {
                        builder.append(fullText);
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    builder.append(fullText);
                }
                int i5 = i3 & 112;
                modifier3 = companion;
                composer2 = startRestartGroup;
                TextKt.m3898Text4IGK_g(builder.toAnnotatedString(), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8659getStarte0LSkKk()), 0L, 0, false, 0, (Map) null, (Function1) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyLarge(), composer2, i5, 0, 65020);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$TertiaryText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    SocureMultiStepScreenKt.TertiaryText(TertiaryTextData.this, modifier3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        unit = null;
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        String fullText2 = tertiaryTextData.getFullText();
        annotatedText = tertiaryTextData.getAnnotatedText();
        if (annotatedText != null) {
        }
        if (unit == null) {
        }
        int i52 = i3 & 112;
        modifier3 = companion;
        composer2 = startRestartGroup;
        TextKt.m3898Text4IGK_g(builder2.toAnnotatedString(), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8659getStarte0LSkKk()), 0L, 0, false, 0, (Map) null, (Function1) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyLarge(), composer2, i52, 0, 65020);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x028f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Buttons(final String str, final String str2, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        final int i3;
        Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(622391640);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(622391640, i3, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.Buttons (SocureMultiStepScreen.kt:311)");
                        }
                        startRestartGroup.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density = (Density) consume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = startRestartGroup.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier4);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        startRestartGroup.disableReusing();
                        Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5340setimpl(m5333constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m5340setimpl(m5333constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m5340setimpl(m5333constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ButtonColors m2707buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.socure_primary_button, startRestartGroup, 0), Color.INSTANCE.m6076getWhite0d7_KjU(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 48, 12);
                        RoundedCornerShape roundedCornerShape = buttonShape;
                        PaddingValues paddingValues = buttonContentPadding;
                        ButtonKt.Button(function03, fillMaxWidth$default, false, roundedCornerShape, m2707buttonColorsro_MJ88, null, null, paddingValues, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1207527490, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$Buttons$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer3, int i5) {
                                long j;
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1207527490, i5, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.Buttons.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:328)");
                                    }
                                    String str3 = str;
                                    j = SocureMultiStepScreenKt.buttonTextFontSize;
                                    TextKt.m3903TextfLXpl1I(str3, null, 0L, j, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, (i3 & 14) | 199680, 0, 65494);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), startRestartGroup, ((i3 >> 6) & 14) | 817892400, 356);
                        if (str2 != null) {
                            composer2 = startRestartGroup;
                        } else {
                            SpaceButtons(startRestartGroup, 0);
                            ButtonKt.OutlinedButton(function02, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, roundedCornerShape, ButtonDefaults.INSTANCE.m2717outlinedButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.socure_title_text, startRestartGroup, 0), 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 13), null, BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), ColorResources_androidKt.colorResource(R.color.socure_primary_button, startRestartGroup, 0)), paddingValues, null, ComposableLambdaKt.composableLambda(startRestartGroup, 915389086, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$Buttons$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope OutlinedButton, Composer composer3, int i5) {
                                    long j;
                                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                                    if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(915389086, i5, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.Buttons.<anonymous>.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:350)");
                                        }
                                        String str3 = str2;
                                        j = SocureMultiStepScreenKt.buttonTextFontSize;
                                        TextKt.m3903TextfLXpl1I(str3, null, 0L, j, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 199680, 0, 65494);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), startRestartGroup, ((i3 >> 9) & 14) | 817892400, 292);
                            composer2 = startRestartGroup;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$Buttons$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            SocureMultiStepScreenKt.Buttons(str, str2, function0, function02, modifier3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                modifier2 = modifier;
                if ((46811 & i3) == 9362) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-483455358);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume32 = startRestartGroup.consume(localViewConfiguration2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume32;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(modifier4);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m5340setimpl(m5333constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m5340setimpl(m5333constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ButtonColors m2707buttonColorsro_MJ882 = ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.socure_primary_button, startRestartGroup, 0), Color.INSTANCE.m6076getWhite0d7_KjU(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 48, 12);
                RoundedCornerShape roundedCornerShape2 = buttonShape;
                PaddingValues paddingValues2 = buttonContentPadding;
                ButtonKt.Button(function03, fillMaxWidth$default2, false, roundedCornerShape2, m2707buttonColorsro_MJ882, null, null, paddingValues2, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1207527490, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$Buttons$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i5) {
                        long j;
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1207527490, i5, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.Buttons.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:328)");
                            }
                            String str3 = str;
                            j = SocureMultiStepScreenKt.buttonTextFontSize;
                            TextKt.m3903TextfLXpl1I(str3, null, 0L, j, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, (i3 & 14) | 199680, 0, 65494);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), startRestartGroup, ((i3 >> 6) & 14) | 817892400, 356);
                if (str2 != null) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((46811 & i3) == 9362) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume42 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density22 = (Density) consume42;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localLayoutDirection22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume322 = startRestartGroup.consume(localViewConfiguration22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume322;
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(modifier4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m5333constructorimpl22 = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl22, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl22, density22, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m5340setimpl(m5333constructorimpl22, layoutDirection22, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m5340setimpl(m5333constructorimpl22, viewConfiguration22, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ButtonColors m2707buttonColorsro_MJ8822 = ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.socure_primary_button, startRestartGroup, 0), Color.INSTANCE.m6076getWhite0d7_KjU(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 48, 12);
            RoundedCornerShape roundedCornerShape22 = buttonShape;
            PaddingValues paddingValues22 = buttonContentPadding;
            ButtonKt.Button(function03, fillMaxWidth$default22, false, roundedCornerShape22, m2707buttonColorsro_MJ8822, null, null, paddingValues22, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1207527490, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$Buttons$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i5) {
                    long j;
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1207527490, i5, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.Buttons.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:328)");
                        }
                        String str3 = str;
                        j = SocureMultiStepScreenKt.buttonTextFontSize;
                        TextKt.m3903TextfLXpl1I(str3, null, 0L, j, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, (i3 & 14) | 199680, 0, 65494);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), startRestartGroup, ((i3 >> 6) & 14) | 817892400, 356);
            if (str2 != null) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function03 = function0;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((46811 & i3) == 9362) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-483455358);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume422 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density222 = (Density) consume422;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration222 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume3222 = startRestartGroup.consume(localViewConfiguration222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume3222;
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(modifier4);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m5333constructorimpl222 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl222, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl222, density222, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m5340setimpl(m5333constructorimpl222, layoutDirection222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m5340setimpl(m5333constructorimpl222, viewConfiguration222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m5303boximpl(SkippableUpdater.m5304constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ButtonColors m2707buttonColorsro_MJ88222 = ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.socure_primary_button, startRestartGroup, 0), Color.INSTANCE.m6076getWhite0d7_KjU(), 0L, 0L, startRestartGroup, (ButtonDefaults.$stable << 12) | 48, 12);
        RoundedCornerShape roundedCornerShape222 = buttonShape;
        PaddingValues paddingValues222 = buttonContentPadding;
        ButtonKt.Button(function03, fillMaxWidth$default222, false, roundedCornerShape222, m2707buttonColorsro_MJ88222, null, null, paddingValues222, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1207527490, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$Buttons$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer3, int i5) {
                long j;
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1207527490, i5, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.Buttons.<anonymous>.<anonymous> (SocureMultiStepScreen.kt:328)");
                    }
                    String str3 = str;
                    j = SocureMultiStepScreenKt.buttonTextFontSize;
                    TextKt.m3903TextfLXpl1I(str3, null, 0L, j, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, (i3 & 14) | 199680, 0, 65494);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), startRestartGroup, ((i3 >> 6) & 14) | 817892400, 356);
        if (str2 != null) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BrandAttribution(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(746324403);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(746324403, i3, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.BrandAttribution (SocureMultiStepScreen.kt:362)");
            }
            int i5 = ((i3 << 3) & 112) | 6;
            Modifier modifier2 = modifier;
            AndroidView_androidKt.AndroidView(new Function1<Context, BrandLayout>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$BrandAttribution$1
                @Override // kotlin.jvm.functions.Function1
                public final BrandLayout invoke(Context context) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    BrandLayout brandLayout = new BrandLayout(context, null, 0, 6, null);
                    String string = context.getString(R.string.socure_powered_by);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.socure_powered_by)");
                    brandLayout.setUpBrandView(string, R.drawable.socure_logo_black, android.R.color.black);
                    return brandLayout;
                }
            }, modifier2, null, startRestartGroup, i5, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$BrandAttribution$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                SocureMultiStepScreenKt.BrandAttribution(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpaceBrandSection(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1962691078);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1962691078, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SpaceBrandSection (SocureMultiStepScreen.kt:381)");
            }
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(32)), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SpaceBrandSection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                SocureMultiStepScreenKt.SpaceBrandSection(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpaceInnerContent(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-979549985);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-979549985, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SpaceInnerContent (SocureMultiStepScreen.kt:384)");
            }
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SpaceInnerContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                SocureMultiStepScreenKt.SpaceInnerContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpaceButtons(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-889043027);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-889043027, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SpaceButtons (SocureMultiStepScreen.kt:387)");
            }
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(12)), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SpaceButtons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                SocureMultiStepScreenKt.SpaceButtons(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpaceBottom(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(267291591);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(267291591, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SpaceBottom (SocureMultiStepScreen.kt:390)");
            }
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SpaceBottom$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                SocureMultiStepScreenKt.SpaceBottom(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SocureMultiStepScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1323523338);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1323523338, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenPreview (SocureMultiStepScreen.kt:394)");
            }
            SocureMultiStepScreen(new SocureMultiStepScreenState("Bank Statement", "Next, we will scan your Bank Statement", "Hold your phone over your ID and we will scan it for you.", new TertiaryTextData("Please upload your most recent Paystub (5MB Max)", "(5MB Max)"), "Upload Document", "Scan Document", 3, 1), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, startRestartGroup, 48, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.SocureMultiStepScreenKt$SocureMultiStepScreenPreview$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                SocureMultiStepScreenKt.SocureMultiStepScreenPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    static {
        float f = 16;
        buttonContentPadding = PaddingKt.m1151PaddingValuesYgX7TsA(Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f));
    }
}
