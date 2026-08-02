package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008e\u0001\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010 \u001aÄ\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020#2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010&\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"HorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingIconEndSpacing", "LeadingIconStartSpacing", "SelectedIconContainerSize", "SelectedOverlayOpacity", "", "SurfaceOverlayOpacity", "TrailingIconSpacing", "Chip", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ChipColors;", "leadingIcon", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m4440constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m4440constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m4440constructorimpl(24);

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01df, code lost:
    
        if (r32 == 0) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f3  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(final Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        ChipColors chipColors2;
        int i8;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        final ChipColors chipColors3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final boolean z3;
        final Modifier modifier3;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-368396408);
        ComposerKt.sourceInformation(startRestartGroup, "C(Chip)P(7,6,3,4,8!2,5)91@4163L39,92@4237L6,94@4354L12,98@4499L21,104@4663L24,99@4525L1754:Chip.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i11 = 16384;
                                i3 |= i11;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i11 = 8192;
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((458752 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 131072 : 65536;
                        if ((i & 3670016) == 0) {
                            i7 = 3670016;
                            chipColors2 = chipColors;
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(chipColors2)) ? 1048576 : 524288;
                        } else {
                            i7 = 3670016;
                            chipColors2 = chipColors;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                            i9 = i8;
                        } else {
                            i9 = i8;
                            if ((i & 29360128) == 0) {
                                i3 |= startRestartGroup.changed(function2) ? 8388608 : 4194304;
                            }
                        }
                        if ((i2 & 256) == 0) {
                            i10 = (i & 234881024) == 0 ? startRestartGroup.changed(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                            if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i12 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if (i5 != 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                        shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    }
                                    function22 = null;
                                    if (i6 != 0) {
                                        borderStroke2 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                        chipColors2 = ChipDefaults.INSTANCE.m1304chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                }
                                function22 = function2;
                                final int i13 = i3;
                                final boolean z4 = z2;
                                Shape shape4 = shape2;
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                BorderStroke borderStroke4 = borderStroke2;
                                startRestartGroup.endDefaults();
                                int i14 = ((i13 >> 6) & 14) | ((i13 >> 15) & 112);
                                final State<Color> contentColor = chipColors2.contentColor(z4, startRestartGroup, i14);
                                final Function2<? super Composer, ? super Integer, Unit> function24 = function22;
                                final ChipColors chipColors4 = chipColors2;
                                Modifier modifier4 = modifier2;
                                SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier4, z4, shape4, chipColors2.backgroundColor(z4, startRestartGroup, i14).getValue().m2122unboximpl(), Color.m2111copywmQWz5c$default(m1312Chip$lambda1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke4, 0.0f, mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 139076687, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i15) {
                                        long m1312Chip$lambda1;
                                        ComposerKt.sourceInformation(composer2, "C109@4831L1442:Chip.kt#jmzs0o");
                                        if ((i15 & 11) != 2 || !composer2.getSkipping()) {
                                            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                            m1312Chip$lambda1 = ChipKt.m1312Chip$lambda1(contentColor);
                                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m2114getAlphaimpl(m1312Chip$lambda1)))};
                                            final Function2<Composer, Integer, Unit> function25 = function24;
                                            final ChipColors chipColors5 = chipColors4;
                                            final boolean z5 = z4;
                                            final int i16 = i13;
                                            final Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 667535631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i17) {
                                                    ComposerKt.sourceInformation(composer3, "C111@4973L10,110@4917L1346:Chip.kt#jmzs0o");
                                                    if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer3, 6).getBody2();
                                                        final Function2<Composer, Integer, Unit> function26 = function25;
                                                        final ChipColors chipColors6 = chipColors5;
                                                        final boolean z6 = z5;
                                                        final int i18 = i16;
                                                        final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer3, -1131213696, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i19) {
                                                                float m4440constructorimpl;
                                                                float f;
                                                                float f2;
                                                                float f3;
                                                                ComposerKt.sourceInformation(composer4, "C113@5022L1227:Chip.kt#jmzs0o");
                                                                if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                                                    Modifier m619defaultMinSizeVpY3zN4$default = SizeKt.m619defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1307getMinHeightD9Ej5fM(), 1, null);
                                                                    if (function26 == null) {
                                                                        m4440constructorimpl = ChipKt.HorizontalPadding;
                                                                    } else {
                                                                        m4440constructorimpl = Dp.m4440constructorimpl(0);
                                                                    }
                                                                    f = ChipKt.HorizontalPadding;
                                                                    Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(m619defaultMinSizeVpY3zN4$default, m4440constructorimpl, 0.0f, f, 0.0f, 10, null);
                                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function2<Composer, Integer, Unit> function27 = function26;
                                                                    ChipColors chipColors7 = chipColors6;
                                                                    boolean z7 = z6;
                                                                    int i20 = i18;
                                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                                    composer4.startReplaceableGroup(693286680);
                                                                    ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer4, 54);
                                                                    composer4.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume = composer4.consume(localDensity);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    Density density = (Density) consume;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume2 = composer4.consume(localLayoutDirection);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume3 = composer4.consume(localViewConfiguration);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer4.startReusableNode();
                                                                    if (composer4.getInserting()) {
                                                                        composer4.createNode(constructor);
                                                                    } else {
                                                                        composer4.useNode();
                                                                    }
                                                                    composer4.disableReusing();
                                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4);
                                                                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer4.enableReusing();
                                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                                    composer4.startReplaceableGroup(2058660585);
                                                                    composer4.startReplaceableGroup(-678309503);
                                                                    ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                                    composer4.startReplaceableGroup(951468004);
                                                                    ComposerKt.sourceInformation(composer4, "C137@6222L9:Chip.kt#jmzs0o");
                                                                    composer4.startReplaceableGroup(2084788874);
                                                                    ComposerKt.sourceInformation(composer4, "128@5675L47,129@5785L32,130@5842L267,135@6134L45");
                                                                    if (function27 != null) {
                                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                                        f2 = ChipKt.LeadingIconStartSpacing;
                                                                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion, f2), composer4, 6);
                                                                        State<Color> leadingIconContentColor = chipColors7.leadingIconContentColor(z7, composer4, ((i20 >> 6) & 14) | ((i20 >> 15) & 112));
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(m1314invoke$lambda1$lambda0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(m1314invoke$lambda1$lambda0(leadingIconContentColor))))}, function27, composer4, ((i20 >> 18) & 112) | 8);
                                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                        f3 = ChipKt.LeadingIconEndSpacing;
                                                                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f3), composer4, 6);
                                                                    }
                                                                    composer4.endReplaceableGroup();
                                                                    function33.invoke(rowScopeInstance, composer4, Integer.valueOf(((i20 >> 21) & 112) | 6));
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endNode();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    return;
                                                                }
                                                                composer4.skipToGroupEnd();
                                                            }

                                                            /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                                                            private static final long m1314invoke$lambda1$lambda0(State<Color> state) {
                                                                return state.getValue().m2122unboximpl();
                                                            }
                                                        }), composer3, 48);
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }), composer2, 56);
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, (i13 & 14) | C.ENCODING_PCM_32BIT | (i13 & 112) | (i13 & 896) | ((i13 >> 3) & 7168) | ((i13 << 3) & i7) | ((i13 << 15) & 234881024), 128);
                                shape3 = shape4;
                                borderStroke3 = borderStroke4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                chipColors3 = chipColors4;
                                function23 = function24;
                                z3 = z4;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                borderStroke3 = borderStroke2;
                                chipColors3 = chipColors2;
                                function23 = function2;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i15) {
                                    ChipKt.Chip(onClick, modifier3, z3, mutableInteractionSource3, shape3, borderStroke3, chipColors3, function23, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i10;
                        if ((191739611 & i3) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        function22 = null;
                        if (i6 != 0) {
                        }
                        if ((i2 & 64) != 0) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((i & 3670016) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    i3 |= i10;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    function22 = null;
                    if (i6 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((i & 3670016) == 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i3 |= i10;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                function22 = null;
                if (i6 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((i & 3670016) == 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i10;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            function22 = null;
            if (i6 != 0) {
            }
            if ((i2 & 64) != 0) {
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
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((i & 3670016) == 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i10;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        function22 = null;
        if (i6 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0369 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029d  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        CornerBasedShape cornerBasedShape;
        int i7;
        final BorderStroke borderStroke2;
        final SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i14;
        int i15;
        final int i16;
        MutableInteractionSource mutableInteractionSource2;
        final int i17;
        Composer composer2;
        int i18;
        int i19;
        int i20;
        Shape shape2;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Modifier modifier3;
        final boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Composer composer3;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1259208246);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilterChip)P(8,7,6,3,4,10!2,5,9,11)188@8670L39,189@8744L6,191@8871L18,198@9202L31,204@9413L34,199@9238L4010:Chip.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i22 = i3 & 4;
        if (i22 != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                }
                if ((i & 458752) == 0) {
                    cornerBasedShape = shape;
                    i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(cornerBasedShape)) ? 131072 : 65536;
                } else {
                    cornerBasedShape = shape;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                    }
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (startRestartGroup.changed(selectableChipColors2)) {
                            i21 = 8388608;
                            i4 |= i21;
                        }
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i21 = 4194304;
                    i4 |= i21;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i9 = i8;
                    i4 |= startRestartGroup.changed(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changed(function22) ? 536870912 : 268435456;
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i14 = i2 | 6;
                            i13 = i12;
                            function24 = function23;
                        } else if ((i2 & 14) == 0) {
                            i13 = i12;
                            function24 = function23;
                            i14 = i2 | (startRestartGroup.changed(function24) ? 4 : 2);
                        } else {
                            i13 = i12;
                            function24 = function23;
                            i14 = i2;
                        }
                        i15 = i4;
                        if ((i3 & 2048) != 0) {
                            i14 |= 48;
                        } else if ((i2 & 112) == 0) {
                            i14 |= startRestartGroup.changed(content) ? 32 : 16;
                        }
                        i16 = i14;
                        if ((i15 & 1533916891) == 306783378 || (i16 & 91) != 18 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i22 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z6 = i5 != 0 ? true : z3;
                                if (i6 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i3 & 32) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i17 = i15 & (-458753);
                                } else {
                                    i17 = i15;
                                }
                                if (i7 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i3 & 128) != 0) {
                                    i20 = i13;
                                    i19 = i11;
                                    i18 = i9;
                                    selectableChipColors2 = ChipDefaults.INSTANCE.m1305filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, C.ENCODING_PCM_32BIT, FrameMetricsAggregator.EVERY_DURATION);
                                    composer2 = startRestartGroup;
                                    i17 &= -29360129;
                                } else {
                                    composer2 = startRestartGroup;
                                    i18 = i9;
                                    i19 = i11;
                                    i20 = i13;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function211 = i18 != 0 ? null : function2;
                                shape2 = cornerBasedShape;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function25 = i19 != 0 ? null : function22;
                                modifier3 = companion;
                                z4 = z6;
                                function26 = i20 != 0 ? null : function23;
                                function27 = function211;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                int i23 = (i3 & 32) != 0 ? i15 & (-458753) : i15;
                                if ((i3 & 128) != 0) {
                                    i23 &= -29360129;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                i17 = i23;
                                shape2 = cornerBasedShape;
                                borderStroke3 = borderStroke2;
                                function26 = function24;
                                function27 = function2;
                                function25 = function22;
                                modifier3 = modifier2;
                                z4 = z3;
                                composer2 = startRestartGroup;
                            }
                            composer2.endDefaults();
                            int i24 = i17 << 3;
                            int i25 = ((i17 >> 9) & 14) | (i24 & 112) | ((i17 >> 15) & 896);
                            final State<Color> contentColor = selectableChipColors2.contentColor(z4, z, composer2, i25);
                            final Function2<? super Composer, ? super Integer, Unit> function212 = function27;
                            final Function2<? super Composer, ? super Integer, Unit> function213 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function214 = function26;
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            boolean z7 = z4;
                            Shape shape4 = shape2;
                            Composer composer4 = composer2;
                            BorderStroke borderStroke4 = borderStroke3;
                            SurfaceKt.m1522SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.m3783setRolekuIjeqM(semantics, Role.INSTANCE.m3768getCheckboxo7Vup1c());
                                }
                            }, 1, null), false, shape4, selectableChipColors2.backgroundColor(z4, z, composer2, i25).getValue().m2122unboximpl(), Color.m2111copywmQWz5c$default(contentColor.getValue().m2122unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke4, 0.0f, mutableInteractionSource5, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i26) {
                                    ComposerKt.sourceInformation(composer5, "C209@9597L3645:Chip.kt#jmzs0o");
                                    if ((i26 & 11) != 2 || !composer5.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(contentColor.getValue().m2122unboximpl())))};
                                        final Function2<Composer, Integer, Unit> function215 = function212;
                                        final boolean z8 = z;
                                        final Function2<Composer, Integer, Unit> function216 = function213;
                                        final Function2<Composer, Integer, Unit> function217 = function214;
                                        final Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                        final int i27 = i16;
                                        final SelectableChipColors selectableChipColors3 = selectableChipColors2;
                                        final boolean z9 = z4;
                                        final int i28 = i17;
                                        final State<Color> state = contentColor;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer5, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i29) {
                                                ComposerKt.sourceInformation(composer6, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                                                if ((i29 & 11) != 2 || !composer6.getSkipping()) {
                                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer6, 6).getBody2();
                                                    final Function2<Composer, Integer, Unit> function218 = function215;
                                                    final boolean z10 = z8;
                                                    final Function2<Composer, Integer, Unit> function219 = function216;
                                                    final Function2<Composer, Integer, Unit> function220 = function217;
                                                    final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                    final int i30 = i27;
                                                    final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                                    final boolean z11 = z9;
                                                    final int i31 = i28;
                                                    final State<Color> state2 = state;
                                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer6, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                            invoke(composer7, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer7, int i32) {
                                                            float m4440constructorimpl;
                                                            float m4440constructorimpl2;
                                                            float f;
                                                            RowScopeInstance rowScopeInstance;
                                                            Function3<RowScope, Composer, Integer, Unit> function33;
                                                            float f2;
                                                            int i33;
                                                            float f3;
                                                            float f4;
                                                            float f5;
                                                            ComposerKt.sourceInformation(composer7, "C213@9794L3424:Chip.kt#jmzs0o");
                                                            if ((i32 & 11) != 2 || !composer7.getSkipping()) {
                                                                Modifier m619defaultMinSizeVpY3zN4$default = SizeKt.m619defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1307getMinHeightD9Ej5fM(), 1, null);
                                                                if (function218 == null && (!z10 || function219 == null)) {
                                                                    m4440constructorimpl = ChipKt.HorizontalPadding;
                                                                } else {
                                                                    m4440constructorimpl = Dp.m4440constructorimpl(0);
                                                                }
                                                                float f6 = m4440constructorimpl;
                                                                if (function220 == null) {
                                                                    m4440constructorimpl2 = ChipKt.HorizontalPadding;
                                                                } else {
                                                                    m4440constructorimpl2 = Dp.m4440constructorimpl(0);
                                                                }
                                                                Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(m619defaultMinSizeVpY3zN4$default, f6, 0.0f, m4440constructorimpl2, 0.0f, 10, null);
                                                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                Function2<Composer, Integer, Unit> function221 = function218;
                                                                boolean z12 = z10;
                                                                Function2<Composer, Integer, Unit> function222 = function219;
                                                                Function3<RowScope, Composer, Integer, Unit> function34 = function32;
                                                                int i34 = i30;
                                                                Function2<Composer, Integer, Unit> function223 = function220;
                                                                SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                                boolean z13 = z11;
                                                                int i35 = i31;
                                                                State<Color> state3 = state2;
                                                                composer7.startReplaceableGroup(693286680);
                                                                ComposerKt.sourceInformation(composer7, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer7, 54);
                                                                composer7.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume = composer7.consume(localDensity);
                                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                Density density = (Density) consume;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume2 = composer7.consume(localLayoutDirection);
                                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume3 = composer7.consume(localViewConfiguration);
                                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                                if (!(composer7.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer7.startReusableNode();
                                                                if (composer7.getInserting()) {
                                                                    composer7.createNode(constructor);
                                                                } else {
                                                                    composer7.useNode();
                                                                }
                                                                composer7.disableReusing();
                                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer7.enableReusing();
                                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                                composer7.startReplaceableGroup(2058660585);
                                                                composer7.startReplaceableGroup(-678309503);
                                                                ComposerKt.sourceInformation(composer7, "C80@3988L9:Row.kt#2w3rfo");
                                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                                composer7.startReplaceableGroup(1218705642);
                                                                ComposerKt.sourceInformation(composer7, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                                                composer7.startReplaceableGroup(-1943412137);
                                                                ComposerKt.sourceInformation(composer7, "236@10806L47,237@10878L1955,273@12858L45");
                                                                if (function221 != null || (z12 && function222 != null)) {
                                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                    f = ChipKt.LeadingIconStartSpacing;
                                                                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f), composer7, 6);
                                                                    composer7.startReplaceableGroup(733328855);
                                                                    ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                                    composer7.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume4 = composer7.consume(localDensity2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    Density density2 = (Density) consume4;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume5 = composer7.consume(localLayoutDirection2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume6 = composer7.consume(localViewConfiguration2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                    rowScopeInstance = rowScopeInstance2;
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                                    function33 = function34;
                                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer7.startReusableNode();
                                                                    if (composer7.getInserting()) {
                                                                        composer7.createNode(constructor2);
                                                                    } else {
                                                                        composer7.useNode();
                                                                    }
                                                                    composer7.disableReusing();
                                                                    Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer7);
                                                                    Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer7.enableReusing();
                                                                    materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                                    composer7.startReplaceableGroup(2058660585);
                                                                    composer7.startReplaceableGroup(-2137368960);
                                                                    ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    composer7.startReplaceableGroup(-626917591);
                                                                    ComposerKt.sourceInformation(composer7, "C:Chip.kt#jmzs0o");
                                                                    composer7.startReplaceableGroup(649985595);
                                                                    ComposerKt.sourceInformation(composer7, "239@11001L141,243@11175L297");
                                                                    if (function221 != null) {
                                                                        State<Color> leadingIconColor = selectableChipColors5.leadingIconColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896));
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(leadingIconColor.getValue().m2122unboximpl())))}, function221, composer7, ((i35 >> 21) & 112) | 8);
                                                                    }
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.startReplaceableGroup(-1943411323);
                                                                    ComposerKt.sourceInformation(composer7, "262@12326L451");
                                                                    if (z12 && function222 != null) {
                                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                        long m2122unboximpl = state3.getValue().m2122unboximpl();
                                                                        composer7.startReplaceableGroup(649986426);
                                                                        ComposerKt.sourceInformation(composer7, "260@12219L34");
                                                                        if (function221 != null) {
                                                                            Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                            f3 = ChipKt.SelectedIconContainerSize;
                                                                            companion4 = ClipKt.clip(BackgroundKt.m232backgroundbw27NRU(SizeKt.m626requiredSize3ABfNKs(companion5, f3), state3.getValue().m2122unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                            m2122unboximpl = selectableChipColors5.backgroundColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896)).getValue().m2122unboximpl();
                                                                        }
                                                                        composer7.endReplaceableGroup();
                                                                        Alignment center = Alignment.INSTANCE.getCenter();
                                                                        composer7.startReplaceableGroup(733328855);
                                                                        ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer7, 6);
                                                                        composer7.startReplaceableGroup(-1323940314);
                                                                        ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume7 = composer7.consume(localDensity3);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                        Density density3 = (Density) consume7;
                                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume8 = composer7.consume(localLayoutDirection3);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                        LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                        Object consume9 = composer7.consume(localViewConfiguration3);
                                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                                        if (!(composer7.getApplier() instanceof Applier)) {
                                                                            ComposablesKt.invalidApplier();
                                                                        }
                                                                        composer7.startReusableNode();
                                                                        if (composer7.getInserting()) {
                                                                            composer7.createNode(constructor3);
                                                                        } else {
                                                                            composer7.useNode();
                                                                        }
                                                                        composer7.disableReusing();
                                                                        Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer7);
                                                                        Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                        Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                                        Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                        Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                        composer7.enableReusing();
                                                                        materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                                        composer7.startReplaceableGroup(2058660585);
                                                                        composer7.startReplaceableGroup(-2137368960);
                                                                        ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                        composer7.startReplaceableGroup(-370889391);
                                                                        ComposerKt.sourceInformation(composer7, "C266@12539L204:Chip.kt#jmzs0o");
                                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(m2122unboximpl))}, function222, composer7, ((i35 >> 24) & 112) | 8);
                                                                        composer7.endReplaceableGroup();
                                                                        composer7.endReplaceableGroup();
                                                                        composer7.endReplaceableGroup();
                                                                        composer7.endNode();
                                                                        composer7.endReplaceableGroup();
                                                                        composer7.endReplaceableGroup();
                                                                    }
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endNode();
                                                                    composer7.endReplaceableGroup();
                                                                    composer7.endReplaceableGroup();
                                                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                                                    f2 = ChipKt.LeadingIconEndSpacing;
                                                                    i33 = 6;
                                                                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion6, f2), composer7, 6);
                                                                } else {
                                                                    rowScopeInstance = rowScopeInstance2;
                                                                    i33 = 6;
                                                                    function33 = function34;
                                                                }
                                                                composer7.endReplaceableGroup();
                                                                function33.invoke(rowScopeInstance, composer7, Integer.valueOf((i34 & 112) | i33));
                                                                if (function223 != null) {
                                                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                                                    f4 = ChipKt.TrailingIconSpacing;
                                                                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion7, f4), composer7, i33);
                                                                    function223.invoke(composer7, Integer.valueOf(i34 & 14));
                                                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                                                    f5 = ChipKt.TrailingIconSpacing;
                                                                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion8, f5), composer7, i33);
                                                                }
                                                                composer7.endReplaceableGroup();
                                                                composer7.endReplaceableGroup();
                                                                composer7.endReplaceableGroup();
                                                                composer7.endNode();
                                                                composer7.endReplaceableGroup();
                                                                composer7.endReplaceableGroup();
                                                                return;
                                                            }
                                                            composer7.skipToGroupEnd();
                                                        }
                                                    }), composer6, 48);
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        }), composer5, 56);
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }), composer4, (i17 & 126) | ((i17 >> 3) & 57344) | (i24 & 29360128) | ((i17 << 15) & 1879048192), 6, 264);
                            composer3 = composer4;
                            shape3 = shape4;
                            borderStroke2 = borderStroke4;
                            mutableInteractionSource4 = mutableInteractionSource5;
                            modifier4 = modifier3;
                            selectableChipColors2 = selectableChipColors2;
                            z5 = z7;
                            function28 = function212;
                            function29 = function213;
                            function210 = function214;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            mutableInteractionSource4 = mutableInteractionSource;
                            function29 = function22;
                            composer3 = startRestartGroup;
                            shape3 = cornerBasedShape;
                            modifier4 = modifier2;
                            z5 = z3;
                            function210 = function24;
                            function28 = function2;
                        }
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i26) {
                                ChipKt.FilterChip(z, onClick, modifier4, z5, mutableInteractionSource4, shape3, borderStroke2, selectableChipColors2, function28, function29, function210, content, composer5, i | 1, i2, i3);
                            }
                        });
                        return;
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    i15 = i4;
                    if ((i3 & 2048) != 0) {
                    }
                    i16 = i14;
                    if ((i15 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    if (i18 != 0) {
                    }
                    shape2 = cornerBasedShape;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    function25 = i19 != 0 ? null : function22;
                    modifier3 = companion;
                    z4 = z6;
                    if (i20 != 0) {
                    }
                    function27 = function211;
                    composer2.endDefaults();
                    int i242 = i17 << 3;
                    int i252 = ((i17 >> 9) & 14) | (i242 & 112) | ((i17 >> 15) & 896);
                    final State<Color> contentColor2 = selectableChipColors2.contentColor(z4, z, composer2, i252);
                    final Function2<? super Composer, ? super Integer, Unit> function2122 = function27;
                    final Function2<? super Composer, ? super Integer, Unit> function2132 = function25;
                    final Function2<? super Composer, ? super Integer, Unit> function2142 = function26;
                    MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                    boolean z72 = z4;
                    Shape shape42 = shape2;
                    Composer composer42 = composer2;
                    BorderStroke borderStroke42 = borderStroke3;
                    SurfaceKt.m1522SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.m3783setRolekuIjeqM(semantics, Role.INSTANCE.m3768getCheckboxo7Vup1c());
                        }
                    }, 1, null), false, shape42, selectableChipColors2.backgroundColor(z4, z, composer2, i252).getValue().m2122unboximpl(), Color.m2111copywmQWz5c$default(contentColor2.getValue().m2122unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke42, 0.0f, mutableInteractionSource52, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i26) {
                            ComposerKt.sourceInformation(composer5, "C209@9597L3645:Chip.kt#jmzs0o");
                            if ((i26 & 11) != 2 || !composer5.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(contentColor2.getValue().m2122unboximpl())))};
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function2122;
                                final boolean z8 = z;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = function2132;
                                final Function2<? super Composer, ? super Integer, Unit> function217 = function2142;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                final int i27 = i16;
                                final SelectableChipColors selectableChipColors3 = selectableChipColors2;
                                final boolean z9 = z4;
                                final int i28 = i17;
                                final State<Color> state = contentColor2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer5, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i29) {
                                        ComposerKt.sourceInformation(composer6, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                                        if ((i29 & 11) != 2 || !composer6.getSkipping()) {
                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer6, 6).getBody2();
                                            final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                            final boolean z10 = z8;
                                            final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                            final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            final int i30 = i27;
                                            final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                            final boolean z11 = z9;
                                            final int i31 = i28;
                                            final State<Color> state2 = state;
                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer6, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                    invoke(composer7, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer7, int i32) {
                                                    float m4440constructorimpl;
                                                    float m4440constructorimpl2;
                                                    float f;
                                                    RowScopeInstance rowScopeInstance;
                                                    Function3<RowScope, Composer, Integer, Unit> function33;
                                                    float f2;
                                                    int i33;
                                                    float f3;
                                                    float f4;
                                                    float f5;
                                                    ComposerKt.sourceInformation(composer7, "C213@9794L3424:Chip.kt#jmzs0o");
                                                    if ((i32 & 11) != 2 || !composer7.getSkipping()) {
                                                        Modifier m619defaultMinSizeVpY3zN4$default = SizeKt.m619defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1307getMinHeightD9Ej5fM(), 1, null);
                                                        if (function218 == null && (!z10 || function219 == null)) {
                                                            m4440constructorimpl = ChipKt.HorizontalPadding;
                                                        } else {
                                                            m4440constructorimpl = Dp.m4440constructorimpl(0);
                                                        }
                                                        float f6 = m4440constructorimpl;
                                                        if (function220 == null) {
                                                            m4440constructorimpl2 = ChipKt.HorizontalPadding;
                                                        } else {
                                                            m4440constructorimpl2 = Dp.m4440constructorimpl(0);
                                                        }
                                                        Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(m619defaultMinSizeVpY3zN4$default, f6, 0.0f, m4440constructorimpl2, 0.0f, 10, null);
                                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        Function2<Composer, Integer, Unit> function221 = function218;
                                                        boolean z12 = z10;
                                                        Function2<Composer, Integer, Unit> function222 = function219;
                                                        Function3<RowScope, Composer, Integer, Unit> function34 = function32;
                                                        int i34 = i30;
                                                        Function2<Composer, Integer, Unit> function223 = function220;
                                                        SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                        boolean z13 = z11;
                                                        int i35 = i31;
                                                        State<Color> state3 = state2;
                                                        composer7.startReplaceableGroup(693286680);
                                                        ComposerKt.sourceInformation(composer7, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer7, 54);
                                                        composer7.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume = composer7.consume(localDensity);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        Density density = (Density) consume;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume2 = composer7.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume3 = composer7.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                        if (!(composer7.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        composer7.disableReusing();
                                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer7.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                        composer7.startReplaceableGroup(2058660585);
                                                        composer7.startReplaceableGroup(-678309503);
                                                        ComposerKt.sourceInformation(composer7, "C80@3988L9:Row.kt#2w3rfo");
                                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                        composer7.startReplaceableGroup(1218705642);
                                                        ComposerKt.sourceInformation(composer7, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                                        composer7.startReplaceableGroup(-1943412137);
                                                        ComposerKt.sourceInformation(composer7, "236@10806L47,237@10878L1955,273@12858L45");
                                                        if (function221 != null || (z12 && function222 != null)) {
                                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                                            f = ChipKt.LeadingIconStartSpacing;
                                                            SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f), composer7, 6);
                                                            composer7.startReplaceableGroup(733328855);
                                                            ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                            composer7.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume4 = composer7.consume(localDensity2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            Density density2 = (Density) consume4;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume5 = composer7.consume(localLayoutDirection2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume6 = composer7.consume(localViewConfiguration2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                            rowScopeInstance = rowScopeInstance2;
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                            function33 = function34;
                                                            if (!(composer7.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer7.startReusableNode();
                                                            if (composer7.getInserting()) {
                                                                composer7.createNode(constructor2);
                                                            } else {
                                                                composer7.useNode();
                                                            }
                                                            composer7.disableReusing();
                                                            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer7);
                                                            Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer7.enableReusing();
                                                            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                            composer7.startReplaceableGroup(2058660585);
                                                            composer7.startReplaceableGroup(-2137368960);
                                                            ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer7.startReplaceableGroup(-626917591);
                                                            ComposerKt.sourceInformation(composer7, "C:Chip.kt#jmzs0o");
                                                            composer7.startReplaceableGroup(649985595);
                                                            ComposerKt.sourceInformation(composer7, "239@11001L141,243@11175L297");
                                                            if (function221 != null) {
                                                                State<Color> leadingIconColor = selectableChipColors5.leadingIconColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896));
                                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(leadingIconColor.getValue().m2122unboximpl())))}, function221, composer7, ((i35 >> 21) & 112) | 8);
                                                            }
                                                            composer7.endReplaceableGroup();
                                                            composer7.startReplaceableGroup(-1943411323);
                                                            ComposerKt.sourceInformation(composer7, "262@12326L451");
                                                            if (z12 && function222 != null) {
                                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                long m2122unboximpl = state3.getValue().m2122unboximpl();
                                                                composer7.startReplaceableGroup(649986426);
                                                                ComposerKt.sourceInformation(composer7, "260@12219L34");
                                                                if (function221 != null) {
                                                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                    f3 = ChipKt.SelectedIconContainerSize;
                                                                    companion4 = ClipKt.clip(BackgroundKt.m232backgroundbw27NRU(SizeKt.m626requiredSize3ABfNKs(companion5, f3), state3.getValue().m2122unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                    m2122unboximpl = selectableChipColors5.backgroundColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896)).getValue().m2122unboximpl();
                                                                }
                                                                composer7.endReplaceableGroup();
                                                                Alignment center = Alignment.INSTANCE.getCenter();
                                                                composer7.startReplaceableGroup(733328855);
                                                                ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer7, 6);
                                                                composer7.startReplaceableGroup(-1323940314);
                                                                ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume7 = composer7.consume(localDensity3);
                                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                Density density3 = (Density) consume7;
                                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume8 = composer7.consume(localLayoutDirection3);
                                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                Object consume9 = composer7.consume(localViewConfiguration3);
                                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                                if (!(composer7.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer7.startReusableNode();
                                                                if (composer7.getInserting()) {
                                                                    composer7.createNode(constructor3);
                                                                } else {
                                                                    composer7.useNode();
                                                                }
                                                                composer7.disableReusing();
                                                                Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer7);
                                                                Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                                Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                composer7.enableReusing();
                                                                materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                                composer7.startReplaceableGroup(2058660585);
                                                                composer7.startReplaceableGroup(-2137368960);
                                                                ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                composer7.startReplaceableGroup(-370889391);
                                                                ComposerKt.sourceInformation(composer7, "C266@12539L204:Chip.kt#jmzs0o");
                                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(m2122unboximpl))}, function222, composer7, ((i35 >> 24) & 112) | 8);
                                                                composer7.endReplaceableGroup();
                                                                composer7.endReplaceableGroup();
                                                                composer7.endReplaceableGroup();
                                                                composer7.endNode();
                                                                composer7.endReplaceableGroup();
                                                                composer7.endReplaceableGroup();
                                                            }
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endNode();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            Modifier.Companion companion6 = Modifier.INSTANCE;
                                                            f2 = ChipKt.LeadingIconEndSpacing;
                                                            i33 = 6;
                                                            SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion6, f2), composer7, 6);
                                                        } else {
                                                            rowScopeInstance = rowScopeInstance2;
                                                            i33 = 6;
                                                            function33 = function34;
                                                        }
                                                        composer7.endReplaceableGroup();
                                                        function33.invoke(rowScopeInstance, composer7, Integer.valueOf((i34 & 112) | i33));
                                                        if (function223 != null) {
                                                            Modifier.Companion companion7 = Modifier.INSTANCE;
                                                            f4 = ChipKt.TrailingIconSpacing;
                                                            SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion7, f4), composer7, i33);
                                                            function223.invoke(composer7, Integer.valueOf(i34 & 14));
                                                            Modifier.Companion companion8 = Modifier.INSTANCE;
                                                            f5 = ChipKt.TrailingIconSpacing;
                                                            SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion8, f5), composer7, i33);
                                                        }
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endNode();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer7.skipToGroupEnd();
                                                }
                                            }), composer6, 48);
                                            return;
                                        }
                                        composer6.skipToGroupEnd();
                                    }
                                }), composer5, 56);
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }), composer42, (i17 & 126) | ((i17 >> 3) & 57344) | (i242 & 29360128) | ((i17 << 15) & 1879048192), 6, 264);
                    composer3 = composer42;
                    shape3 = shape42;
                    borderStroke2 = borderStroke42;
                    mutableInteractionSource4 = mutableInteractionSource52;
                    modifier4 = modifier3;
                    selectableChipColors2 = selectableChipColors2;
                    z5 = z72;
                    function28 = function2122;
                    function29 = function2132;
                    function210 = function2142;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                i15 = i4;
                if ((i3 & 2048) != 0) {
                }
                i16 = i14;
                if ((i15 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i22 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if (i18 != 0) {
                }
                shape2 = cornerBasedShape;
                borderStroke3 = borderStroke2;
                mutableInteractionSource3 = mutableInteractionSource2;
                function25 = i19 != 0 ? null : function22;
                modifier3 = companion;
                z4 = z6;
                if (i20 != 0) {
                }
                function27 = function211;
                composer2.endDefaults();
                int i2422 = i17 << 3;
                int i2522 = ((i17 >> 9) & 14) | (i2422 & 112) | ((i17 >> 15) & 896);
                final State<Color> contentColor22 = selectableChipColors2.contentColor(z4, z, composer2, i2522);
                final Function2<? super Composer, ? super Integer, Unit> function21222 = function27;
                final Function2<? super Composer, ? super Integer, Unit> function21322 = function25;
                final Function2<? super Composer, ? super Integer, Unit> function21422 = function26;
                MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                boolean z722 = z4;
                Shape shape422 = shape2;
                Composer composer422 = composer2;
                BorderStroke borderStroke422 = borderStroke3;
                SurfaceKt.m1522SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        SemanticsPropertiesKt.m3783setRolekuIjeqM(semantics, Role.INSTANCE.m3768getCheckboxo7Vup1c());
                    }
                }, 1, null), false, shape422, selectableChipColors2.backgroundColor(z4, z, composer2, i2522).getValue().m2122unboximpl(), Color.m2111copywmQWz5c$default(contentColor22.getValue().m2122unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke422, 0.0f, mutableInteractionSource522, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i26) {
                        ComposerKt.sourceInformation(composer5, "C209@9597L3645:Chip.kt#jmzs0o");
                        if ((i26 & 11) != 2 || !composer5.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(contentColor22.getValue().m2122unboximpl())))};
                            final Function2<? super Composer, ? super Integer, Unit> function215 = function21222;
                            final boolean z8 = z;
                            final Function2<? super Composer, ? super Integer, Unit> function216 = function21322;
                            final Function2<? super Composer, ? super Integer, Unit> function217 = function21422;
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                            final int i27 = i16;
                            final SelectableChipColors selectableChipColors3 = selectableChipColors2;
                            final boolean z9 = z4;
                            final int i28 = i17;
                            final State<Color> state = contentColor22;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer5, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i29) {
                                    ComposerKt.sourceInformation(composer6, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                                    if ((i29 & 11) != 2 || !composer6.getSkipping()) {
                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer6, 6).getBody2();
                                        final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                        final boolean z10 = z8;
                                        final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                        final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                        final int i30 = i27;
                                        final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                        final boolean z11 = z9;
                                        final int i31 = i28;
                                        final State<Color> state2 = state;
                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer6, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                invoke(composer7, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer7, int i32) {
                                                float m4440constructorimpl;
                                                float m4440constructorimpl2;
                                                float f;
                                                RowScopeInstance rowScopeInstance;
                                                Function3<RowScope, Composer, Integer, Unit> function33;
                                                float f2;
                                                int i33;
                                                float f3;
                                                float f4;
                                                float f5;
                                                ComposerKt.sourceInformation(composer7, "C213@9794L3424:Chip.kt#jmzs0o");
                                                if ((i32 & 11) != 2 || !composer7.getSkipping()) {
                                                    Modifier m619defaultMinSizeVpY3zN4$default = SizeKt.m619defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1307getMinHeightD9Ej5fM(), 1, null);
                                                    if (function218 == null && (!z10 || function219 == null)) {
                                                        m4440constructorimpl = ChipKt.HorizontalPadding;
                                                    } else {
                                                        m4440constructorimpl = Dp.m4440constructorimpl(0);
                                                    }
                                                    float f6 = m4440constructorimpl;
                                                    if (function220 == null) {
                                                        m4440constructorimpl2 = ChipKt.HorizontalPadding;
                                                    } else {
                                                        m4440constructorimpl2 = Dp.m4440constructorimpl(0);
                                                    }
                                                    Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(m619defaultMinSizeVpY3zN4$default, f6, 0.0f, m4440constructorimpl2, 0.0f, 10, null);
                                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function2<Composer, Integer, Unit> function221 = function218;
                                                    boolean z12 = z10;
                                                    Function2<Composer, Integer, Unit> function222 = function219;
                                                    Function3<RowScope, Composer, Integer, Unit> function34 = function32;
                                                    int i34 = i30;
                                                    Function2<Composer, Integer, Unit> function223 = function220;
                                                    SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                    boolean z13 = z11;
                                                    int i35 = i31;
                                                    State<Color> state3 = state2;
                                                    composer7.startReplaceableGroup(693286680);
                                                    ComposerKt.sourceInformation(composer7, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer7, 54);
                                                    composer7.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume = composer7.consume(localDensity);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    Density density = (Density) consume;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume2 = composer7.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume3 = composer7.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer7.startReusableNode();
                                                    if (composer7.getInserting()) {
                                                        composer7.createNode(constructor);
                                                    } else {
                                                        composer7.useNode();
                                                    }
                                                    composer7.disableReusing();
                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer7.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                    composer7.startReplaceableGroup(2058660585);
                                                    composer7.startReplaceableGroup(-678309503);
                                                    ComposerKt.sourceInformation(composer7, "C80@3988L9:Row.kt#2w3rfo");
                                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                    composer7.startReplaceableGroup(1218705642);
                                                    ComposerKt.sourceInformation(composer7, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                                    composer7.startReplaceableGroup(-1943412137);
                                                    ComposerKt.sourceInformation(composer7, "236@10806L47,237@10878L1955,273@12858L45");
                                                    if (function221 != null || (z12 && function222 != null)) {
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        f = ChipKt.LeadingIconStartSpacing;
                                                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f), composer7, 6);
                                                        composer7.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                        composer7.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume4 = composer7.consume(localDensity2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        Density density2 = (Density) consume4;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume5 = composer7.consume(localLayoutDirection2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume6 = composer7.consume(localViewConfiguration2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                        rowScopeInstance = rowScopeInstance2;
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                        function33 = function34;
                                                        if (!(composer7.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor2);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        composer7.disableReusing();
                                                        Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer7);
                                                        Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer7.enableReusing();
                                                        materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                        composer7.startReplaceableGroup(2058660585);
                                                        composer7.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer7.startReplaceableGroup(-626917591);
                                                        ComposerKt.sourceInformation(composer7, "C:Chip.kt#jmzs0o");
                                                        composer7.startReplaceableGroup(649985595);
                                                        ComposerKt.sourceInformation(composer7, "239@11001L141,243@11175L297");
                                                        if (function221 != null) {
                                                            State<Color> leadingIconColor = selectableChipColors5.leadingIconColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896));
                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(leadingIconColor.getValue().m2122unboximpl())))}, function221, composer7, ((i35 >> 21) & 112) | 8);
                                                        }
                                                        composer7.endReplaceableGroup();
                                                        composer7.startReplaceableGroup(-1943411323);
                                                        ComposerKt.sourceInformation(composer7, "262@12326L451");
                                                        if (z12 && function222 != null) {
                                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                                            long m2122unboximpl = state3.getValue().m2122unboximpl();
                                                            composer7.startReplaceableGroup(649986426);
                                                            ComposerKt.sourceInformation(composer7, "260@12219L34");
                                                            if (function221 != null) {
                                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                f3 = ChipKt.SelectedIconContainerSize;
                                                                companion4 = ClipKt.clip(BackgroundKt.m232backgroundbw27NRU(SizeKt.m626requiredSize3ABfNKs(companion5, f3), state3.getValue().m2122unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                m2122unboximpl = selectableChipColors5.backgroundColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896)).getValue().m2122unboximpl();
                                                            }
                                                            composer7.endReplaceableGroup();
                                                            Alignment center = Alignment.INSTANCE.getCenter();
                                                            composer7.startReplaceableGroup(733328855);
                                                            ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer7, 6);
                                                            composer7.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume7 = composer7.consume(localDensity3);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            Density density3 = (Density) consume7;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume8 = composer7.consume(localLayoutDirection3);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume9 = composer7.consume(localViewConfiguration3);
                                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                            if (!(composer7.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer7.startReusableNode();
                                                            if (composer7.getInserting()) {
                                                                composer7.createNode(constructor3);
                                                            } else {
                                                                composer7.useNode();
                                                            }
                                                            composer7.disableReusing();
                                                            Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer7);
                                                            Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer7.enableReusing();
                                                            materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                            composer7.startReplaceableGroup(2058660585);
                                                            composer7.startReplaceableGroup(-2137368960);
                                                            ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                            composer7.startReplaceableGroup(-370889391);
                                                            ComposerKt.sourceInformation(composer7, "C266@12539L204:Chip.kt#jmzs0o");
                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(m2122unboximpl))}, function222, composer7, ((i35 >> 24) & 112) | 8);
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endNode();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                        }
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endNode();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                                        f2 = ChipKt.LeadingIconEndSpacing;
                                                        i33 = 6;
                                                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion6, f2), composer7, 6);
                                                    } else {
                                                        rowScopeInstance = rowScopeInstance2;
                                                        i33 = 6;
                                                        function33 = function34;
                                                    }
                                                    composer7.endReplaceableGroup();
                                                    function33.invoke(rowScopeInstance, composer7, Integer.valueOf((i34 & 112) | i33));
                                                    if (function223 != null) {
                                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                                        f4 = ChipKt.TrailingIconSpacing;
                                                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion7, f4), composer7, i33);
                                                        function223.invoke(composer7, Integer.valueOf(i34 & 14));
                                                        Modifier.Companion companion8 = Modifier.INSTANCE;
                                                        f5 = ChipKt.TrailingIconSpacing;
                                                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion8, f5), composer7, i33);
                                                    }
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endNode();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    return;
                                                }
                                                composer7.skipToGroupEnd();
                                            }
                                        }), composer6, 48);
                                        return;
                                    }
                                    composer6.skipToGroupEnd();
                                }
                            }), composer5, 56);
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }
                }), composer422, (i17 & 126) | ((i17 >> 3) & 57344) | (i2422 & 29360128) | ((i17 << 15) & 1879048192), 6, 264);
                composer3 = composer422;
                shape3 = shape422;
                borderStroke2 = borderStroke422;
                mutableInteractionSource4 = mutableInteractionSource522;
                modifier4 = modifier3;
                selectableChipColors2 = selectableChipColors2;
                z5 = z722;
                function28 = function21222;
                function29 = function21322;
                function210 = function21422;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & 458752) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            i15 = i4;
            if ((i3 & 2048) != 0) {
            }
            i16 = i14;
            if ((i15 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (i18 != 0) {
            }
            shape2 = cornerBasedShape;
            borderStroke3 = borderStroke2;
            mutableInteractionSource3 = mutableInteractionSource2;
            function25 = i19 != 0 ? null : function22;
            modifier3 = companion;
            z4 = z6;
            if (i20 != 0) {
            }
            function27 = function211;
            composer2.endDefaults();
            int i24222 = i17 << 3;
            int i25222 = ((i17 >> 9) & 14) | (i24222 & 112) | ((i17 >> 15) & 896);
            final State<Color> contentColor222 = selectableChipColors2.contentColor(z4, z, composer2, i25222);
            final Function2<? super Composer, ? super Integer, Unit> function212222 = function27;
            final Function2<? super Composer, ? super Integer, Unit> function213222 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function214222 = function26;
            MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
            boolean z7222 = z4;
            Shape shape4222 = shape2;
            Composer composer4222 = composer2;
            BorderStroke borderStroke4222 = borderStroke3;
            SurfaceKt.m1522SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.m3783setRolekuIjeqM(semantics, Role.INSTANCE.m3768getCheckboxo7Vup1c());
                }
            }, 1, null), false, shape4222, selectableChipColors2.backgroundColor(z4, z, composer2, i25222).getValue().m2122unboximpl(), Color.m2111copywmQWz5c$default(contentColor222.getValue().m2122unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke4222, 0.0f, mutableInteractionSource5222, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i26) {
                    ComposerKt.sourceInformation(composer5, "C209@9597L3645:Chip.kt#jmzs0o");
                    if ((i26 & 11) != 2 || !composer5.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(contentColor222.getValue().m2122unboximpl())))};
                        final Function2<? super Composer, ? super Integer, Unit> function215 = function212222;
                        final boolean z8 = z;
                        final Function2<? super Composer, ? super Integer, Unit> function216 = function213222;
                        final Function2<? super Composer, ? super Integer, Unit> function217 = function214222;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                        final int i27 = i16;
                        final SelectableChipColors selectableChipColors3 = selectableChipColors2;
                        final boolean z9 = z4;
                        final int i28 = i17;
                        final State<Color> state = contentColor222;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer5, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i29) {
                                ComposerKt.sourceInformation(composer6, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                                if ((i29 & 11) != 2 || !composer6.getSkipping()) {
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer6, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                    final boolean z10 = z8;
                                    final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                    final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                    final int i30 = i27;
                                    final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                    final boolean z11 = z9;
                                    final int i31 = i28;
                                    final State<Color> state2 = state;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer6, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                            invoke(composer7, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer7, int i32) {
                                            float m4440constructorimpl;
                                            float m4440constructorimpl2;
                                            float f;
                                            RowScopeInstance rowScopeInstance;
                                            Function3<RowScope, Composer, Integer, Unit> function33;
                                            float f2;
                                            int i33;
                                            float f3;
                                            float f4;
                                            float f5;
                                            ComposerKt.sourceInformation(composer7, "C213@9794L3424:Chip.kt#jmzs0o");
                                            if ((i32 & 11) != 2 || !composer7.getSkipping()) {
                                                Modifier m619defaultMinSizeVpY3zN4$default = SizeKt.m619defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1307getMinHeightD9Ej5fM(), 1, null);
                                                if (function218 == null && (!z10 || function219 == null)) {
                                                    m4440constructorimpl = ChipKt.HorizontalPadding;
                                                } else {
                                                    m4440constructorimpl = Dp.m4440constructorimpl(0);
                                                }
                                                float f6 = m4440constructorimpl;
                                                if (function220 == null) {
                                                    m4440constructorimpl2 = ChipKt.HorizontalPadding;
                                                } else {
                                                    m4440constructorimpl2 = Dp.m4440constructorimpl(0);
                                                }
                                                Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(m619defaultMinSizeVpY3zN4$default, f6, 0.0f, m4440constructorimpl2, 0.0f, 10, null);
                                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function2<Composer, Integer, Unit> function221 = function218;
                                                boolean z12 = z10;
                                                Function2<Composer, Integer, Unit> function222 = function219;
                                                Function3<RowScope, Composer, Integer, Unit> function34 = function32;
                                                int i34 = i30;
                                                Function2<Composer, Integer, Unit> function223 = function220;
                                                SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                                boolean z13 = z11;
                                                int i35 = i31;
                                                State<Color> state3 = state2;
                                                composer7.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer7, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer7, 54);
                                                composer7.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume = composer7.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                Density density = (Density) consume;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer7.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer7.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                                if (!(composer7.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer7.startReusableNode();
                                                if (composer7.getInserting()) {
                                                    composer7.createNode(constructor);
                                                } else {
                                                    composer7.useNode();
                                                }
                                                composer7.disableReusing();
                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer7.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                composer7.startReplaceableGroup(2058660585);
                                                composer7.startReplaceableGroup(-678309503);
                                                ComposerKt.sourceInformation(composer7, "C80@3988L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                composer7.startReplaceableGroup(1218705642);
                                                ComposerKt.sourceInformation(composer7, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                                composer7.startReplaceableGroup(-1943412137);
                                                ComposerKt.sourceInformation(composer7, "236@10806L47,237@10878L1955,273@12858L45");
                                                if (function221 != null || (z12 && function222 != null)) {
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    f = ChipKt.LeadingIconStartSpacing;
                                                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f), composer7, 6);
                                                    composer7.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                    composer7.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume4 = composer7.consume(localDensity2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    Density density2 = (Density) consume4;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume5 = composer7.consume(localLayoutDirection2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume6 = composer7.consume(localViewConfiguration2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                    rowScopeInstance = rowScopeInstance2;
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                    function33 = function34;
                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer7.startReusableNode();
                                                    if (composer7.getInserting()) {
                                                        composer7.createNode(constructor2);
                                                    } else {
                                                        composer7.useNode();
                                                    }
                                                    composer7.disableReusing();
                                                    Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer7);
                                                    Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer7.enableReusing();
                                                    materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                    composer7.startReplaceableGroup(2058660585);
                                                    composer7.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer7.startReplaceableGroup(-626917591);
                                                    ComposerKt.sourceInformation(composer7, "C:Chip.kt#jmzs0o");
                                                    composer7.startReplaceableGroup(649985595);
                                                    ComposerKt.sourceInformation(composer7, "239@11001L141,243@11175L297");
                                                    if (function221 != null) {
                                                        State<Color> leadingIconColor = selectableChipColors5.leadingIconColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896));
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(leadingIconColor.getValue().m2122unboximpl())))}, function221, composer7, ((i35 >> 21) & 112) | 8);
                                                    }
                                                    composer7.endReplaceableGroup();
                                                    composer7.startReplaceableGroup(-1943411323);
                                                    ComposerKt.sourceInformation(composer7, "262@12326L451");
                                                    if (z12 && function222 != null) {
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        long m2122unboximpl = state3.getValue().m2122unboximpl();
                                                        composer7.startReplaceableGroup(649986426);
                                                        ComposerKt.sourceInformation(composer7, "260@12219L34");
                                                        if (function221 != null) {
                                                            Modifier.Companion companion5 = Modifier.INSTANCE;
                                                            f3 = ChipKt.SelectedIconContainerSize;
                                                            companion4 = ClipKt.clip(BackgroundKt.m232backgroundbw27NRU(SizeKt.m626requiredSize3ABfNKs(companion5, f3), state3.getValue().m2122unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                            m2122unboximpl = selectableChipColors5.backgroundColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896)).getValue().m2122unboximpl();
                                                        }
                                                        composer7.endReplaceableGroup();
                                                        Alignment center = Alignment.INSTANCE.getCenter();
                                                        composer7.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer7, 6);
                                                        composer7.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume7 = composer7.consume(localDensity3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        Density density3 = (Density) consume7;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume8 = composer7.consume(localLayoutDirection3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume9 = composer7.consume(localViewConfiguration3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                        if (!(composer7.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor3);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        composer7.disableReusing();
                                                        Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer7);
                                                        Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer7.enableReusing();
                                                        materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                        composer7.startReplaceableGroup(2058660585);
                                                        composer7.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        composer7.startReplaceableGroup(-370889391);
                                                        ComposerKt.sourceInformation(composer7, "C266@12539L204:Chip.kt#jmzs0o");
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(m2122unboximpl))}, function222, composer7, ((i35 >> 24) & 112) | 8);
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endNode();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                    }
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endNode();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    Modifier.Companion companion6 = Modifier.INSTANCE;
                                                    f2 = ChipKt.LeadingIconEndSpacing;
                                                    i33 = 6;
                                                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion6, f2), composer7, 6);
                                                } else {
                                                    rowScopeInstance = rowScopeInstance2;
                                                    i33 = 6;
                                                    function33 = function34;
                                                }
                                                composer7.endReplaceableGroup();
                                                function33.invoke(rowScopeInstance, composer7, Integer.valueOf((i34 & 112) | i33));
                                                if (function223 != null) {
                                                    Modifier.Companion companion7 = Modifier.INSTANCE;
                                                    f4 = ChipKt.TrailingIconSpacing;
                                                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion7, f4), composer7, i33);
                                                    function223.invoke(composer7, Integer.valueOf(i34 & 14));
                                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                                    f5 = ChipKt.TrailingIconSpacing;
                                                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion8, f5), composer7, i33);
                                                }
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                composer7.endNode();
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                return;
                                            }
                                            composer7.skipToGroupEnd();
                                        }
                                    }), composer6, 48);
                                    return;
                                }
                                composer6.skipToGroupEnd();
                            }
                        }), composer5, 56);
                        return;
                    }
                    composer5.skipToGroupEnd();
                }
            }), composer4222, (i17 & 126) | ((i17 >> 3) & 57344) | (i24222 & 29360128) | ((i17 << 15) & 1879048192), 6, 264);
            composer3 = composer4222;
            shape3 = shape4222;
            borderStroke2 = borderStroke4222;
            mutableInteractionSource4 = mutableInteractionSource5222;
            modifier4 = modifier3;
            selectableChipColors2 = selectableChipColors2;
            z5 = z7222;
            function28 = function212222;
            function29 = function213222;
            function210 = function214222;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & 458752) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        i15 = i4;
        if ((i3 & 2048) != 0) {
        }
        i16 = i14;
        if ((i15 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (i18 != 0) {
        }
        shape2 = cornerBasedShape;
        borderStroke3 = borderStroke2;
        mutableInteractionSource3 = mutableInteractionSource2;
        function25 = i19 != 0 ? null : function22;
        modifier3 = companion;
        z4 = z6;
        if (i20 != 0) {
        }
        function27 = function211;
        composer2.endDefaults();
        int i242222 = i17 << 3;
        int i252222 = ((i17 >> 9) & 14) | (i242222 & 112) | ((i17 >> 15) & 896);
        final State<Color> contentColor2222 = selectableChipColors2.contentColor(z4, z, composer2, i252222);
        final Function2<? super Composer, ? super Integer, Unit> function2122222 = function27;
        final Function2<? super Composer, ? super Integer, Unit> function2132222 = function25;
        final Function2<? super Composer, ? super Integer, Unit> function2142222 = function26;
        MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
        boolean z72222 = z4;
        Shape shape42222 = shape2;
        Composer composer42222 = composer2;
        BorderStroke borderStroke42222 = borderStroke3;
        SurfaceKt.m1522SurfaceNy5ogXk(z, onClick, SemanticsModifierKt.semantics$default(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.m3783setRolekuIjeqM(semantics, Role.INSTANCE.m3768getCheckboxo7Vup1c());
            }
        }, 1, null), false, shape42222, selectableChipColors2.backgroundColor(z4, z, composer2, i252222).getValue().m2122unboximpl(), Color.m2111copywmQWz5c$default(contentColor2222.getValue().m2122unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke42222, 0.0f, mutableInteractionSource52222, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, 722126431, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                invoke(composer5, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer5, int i26) {
                ComposerKt.sourceInformation(composer5, "C209@9597L3645:Chip.kt#jmzs0o");
                if ((i26 & 11) != 2 || !composer5.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(contentColor2222.getValue().m2122unboximpl())))};
                    final Function2<? super Composer, ? super Integer, Unit> function215 = function2122222;
                    final boolean z8 = z;
                    final Function2<? super Composer, ? super Integer, Unit> function216 = function2132222;
                    final Function2<? super Composer, ? super Integer, Unit> function217 = function2142222;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                    final int i27 = i16;
                    final SelectableChipColors selectableChipColors3 = selectableChipColors2;
                    final boolean z9 = z4;
                    final int i28 = i17;
                    final State<Color> state = contentColor2222;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer5, 1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                            invoke(composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer6, int i29) {
                            ComposerKt.sourceInformation(composer6, "C211@9745L10,210@9689L3543:Chip.kt#jmzs0o");
                            if ((i29 & 11) != 2 || !composer6.getSkipping()) {
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer6, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function218 = function215;
                                final boolean z10 = z8;
                                final Function2<? super Composer, ? super Integer, Unit> function219 = function216;
                                final Function2<? super Composer, ? super Integer, Unit> function220 = function217;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                final int i30 = i27;
                                final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                final boolean z11 = z9;
                                final int i31 = i28;
                                final State<Color> state2 = state;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer6, -1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                        invoke(composer7, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer7, int i32) {
                                        float m4440constructorimpl;
                                        float m4440constructorimpl2;
                                        float f;
                                        RowScopeInstance rowScopeInstance;
                                        Function3<RowScope, Composer, Integer, Unit> function33;
                                        float f2;
                                        int i33;
                                        float f3;
                                        float f4;
                                        float f5;
                                        ComposerKt.sourceInformation(composer7, "C213@9794L3424:Chip.kt#jmzs0o");
                                        if ((i32 & 11) != 2 || !composer7.getSkipping()) {
                                            Modifier m619defaultMinSizeVpY3zN4$default = SizeKt.m619defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m1307getMinHeightD9Ej5fM(), 1, null);
                                            if (function218 == null && (!z10 || function219 == null)) {
                                                m4440constructorimpl = ChipKt.HorizontalPadding;
                                            } else {
                                                m4440constructorimpl = Dp.m4440constructorimpl(0);
                                            }
                                            float f6 = m4440constructorimpl;
                                            if (function220 == null) {
                                                m4440constructorimpl2 = ChipKt.HorizontalPadding;
                                            } else {
                                                m4440constructorimpl2 = Dp.m4440constructorimpl(0);
                                            }
                                            Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(m619defaultMinSizeVpY3zN4$default, f6, 0.0f, m4440constructorimpl2, 0.0f, 10, null);
                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function2<Composer, Integer, Unit> function221 = function218;
                                            boolean z12 = z10;
                                            Function2<Composer, Integer, Unit> function222 = function219;
                                            Function3<RowScope, Composer, Integer, Unit> function34 = function32;
                                            int i34 = i30;
                                            Function2<Composer, Integer, Unit> function223 = function220;
                                            SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                            boolean z13 = z11;
                                            int i35 = i31;
                                            State<Color> state3 = state2;
                                            composer7.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer7, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer7, 54);
                                            composer7.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume = composer7.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            Density density = (Density) consume;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer7.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer7.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                            if (!(composer7.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer7.startReusableNode();
                                            if (composer7.getInserting()) {
                                                composer7.createNode(constructor);
                                            } else {
                                                composer7.useNode();
                                            }
                                            composer7.disableReusing();
                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer7);
                                            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer7.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                            composer7.startReplaceableGroup(2058660585);
                                            composer7.startReplaceableGroup(-678309503);
                                            ComposerKt.sourceInformation(composer7, "C80@3988L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            composer7.startReplaceableGroup(1218705642);
                                            ComposerKt.sourceInformation(composer7, "C275@12946L9,277@13028L43,278@13096L14,279@13135L43:Chip.kt#jmzs0o");
                                            composer7.startReplaceableGroup(-1943412137);
                                            ComposerKt.sourceInformation(composer7, "236@10806L47,237@10878L1955,273@12858L45");
                                            if (function221 != null || (z12 && function222 != null)) {
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                f = ChipKt.LeadingIconStartSpacing;
                                                SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f), composer7, 6);
                                                composer7.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer7, 0);
                                                composer7.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer7.consume(localDensity2);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                Density density2 = (Density) consume4;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer7.consume(localLayoutDirection2);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume6 = composer7.consume(localViewConfiguration2);
                                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                rowScopeInstance = rowScopeInstance2;
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion3);
                                                function33 = function34;
                                                if (!(composer7.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer7.startReusableNode();
                                                if (composer7.getInserting()) {
                                                    composer7.createNode(constructor2);
                                                } else {
                                                    composer7.useNode();
                                                }
                                                composer7.disableReusing();
                                                Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer7);
                                                Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer7.enableReusing();
                                                materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                composer7.startReplaceableGroup(2058660585);
                                                composer7.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer7.startReplaceableGroup(-626917591);
                                                ComposerKt.sourceInformation(composer7, "C:Chip.kt#jmzs0o");
                                                composer7.startReplaceableGroup(649985595);
                                                ComposerKt.sourceInformation(composer7, "239@11001L141,243@11175L297");
                                                if (function221 != null) {
                                                    State<Color> leadingIconColor = selectableChipColors5.leadingIconColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896));
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(leadingIconColor.getValue().m2122unboximpl())))}, function221, composer7, ((i35 >> 21) & 112) | 8);
                                                }
                                                composer7.endReplaceableGroup();
                                                composer7.startReplaceableGroup(-1943411323);
                                                ComposerKt.sourceInformation(composer7, "262@12326L451");
                                                if (z12 && function222 != null) {
                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                    long m2122unboximpl = state3.getValue().m2122unboximpl();
                                                    composer7.startReplaceableGroup(649986426);
                                                    ComposerKt.sourceInformation(composer7, "260@12219L34");
                                                    if (function221 != null) {
                                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                                        f3 = ChipKt.SelectedIconContainerSize;
                                                        companion4 = ClipKt.clip(BackgroundKt.m232backgroundbw27NRU(SizeKt.m626requiredSize3ABfNKs(companion5, f3), state3.getValue().m2122unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                        m2122unboximpl = selectableChipColors5.backgroundColor(z13, z12, composer7, ((i35 >> 9) & 14) | ((i35 << 3) & 112) | ((i35 >> 15) & 896)).getValue().m2122unboximpl();
                                                    }
                                                    composer7.endReplaceableGroup();
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    composer7.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer7, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer7, 6);
                                                    composer7.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer7, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume7 = composer7.consume(localDensity3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    Density density3 = (Density) consume7;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume8 = composer7.consume(localLayoutDirection3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume9 = composer7.consume(localViewConfiguration3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(companion4);
                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer7.startReusableNode();
                                                    if (composer7.getInserting()) {
                                                        composer7.createNode(constructor3);
                                                    } else {
                                                        composer7.useNode();
                                                    }
                                                    composer7.disableReusing();
                                                    Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer7);
                                                    Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer7.enableReusing();
                                                    materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer7)), composer7, 0);
                                                    composer7.startReplaceableGroup(2058660585);
                                                    composer7.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer7, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                    composer7.startReplaceableGroup(-370889391);
                                                    ComposerKt.sourceInformation(composer7, "C266@12539L204:Chip.kt#jmzs0o");
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(m2122unboximpl))}, function222, composer7, ((i35 >> 24) & 112) | 8);
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endNode();
                                                    composer7.endReplaceableGroup();
                                                    composer7.endReplaceableGroup();
                                                }
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                composer7.endNode();
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                f2 = ChipKt.LeadingIconEndSpacing;
                                                i33 = 6;
                                                SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion6, f2), composer7, 6);
                                            } else {
                                                rowScopeInstance = rowScopeInstance2;
                                                i33 = 6;
                                                function33 = function34;
                                            }
                                            composer7.endReplaceableGroup();
                                            function33.invoke(rowScopeInstance, composer7, Integer.valueOf((i34 & 112) | i33));
                                            if (function223 != null) {
                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                f4 = ChipKt.TrailingIconSpacing;
                                                SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion7, f4), composer7, i33);
                                                function223.invoke(composer7, Integer.valueOf(i34 & 14));
                                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                                f5 = ChipKt.TrailingIconSpacing;
                                                SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion8, f5), composer7, i33);
                                            }
                                            composer7.endReplaceableGroup();
                                            composer7.endReplaceableGroup();
                                            composer7.endReplaceableGroup();
                                            composer7.endNode();
                                            composer7.endReplaceableGroup();
                                            composer7.endReplaceableGroup();
                                            return;
                                        }
                                        composer7.skipToGroupEnd();
                                    }
                                }), composer6, 48);
                                return;
                            }
                            composer6.skipToGroupEnd();
                        }
                    }), composer5, 56);
                    return;
                }
                composer5.skipToGroupEnd();
            }
        }), composer42222, (i17 & 126) | ((i17 >> 3) & 57344) | (i242222 & 29360128) | ((i17 << 15) & 1879048192), 6, 264);
        composer3 = composer42222;
        shape3 = shape42222;
        borderStroke2 = borderStroke42222;
        mutableInteractionSource4 = mutableInteractionSource52222;
        modifier4 = modifier3;
        selectableChipColors2 = selectableChipColors2;
        z5 = z72222;
        function28 = function2122222;
        function29 = function2132222;
        function210 = function2142222;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Chip$lambda-1, reason: not valid java name */
    public static final long m1312Chip$lambda1(State<Color> state) {
        return state.getValue().m2122unboximpl();
    }

    static {
        float f = 8;
        LeadingIconEndSpacing = Dp.m4440constructorimpl(f);
        TrailingIconSpacing = Dp.m4440constructorimpl(f);
    }
}
