package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0089\u0001\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ar\u0010\u001a\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ExtendedFabIconPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabTextPadding", "FabSize", "ExtendedFloatingActionButton", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m4440constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m4440constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m4440constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m4440constructorimpl(20);

    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    /* renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1419FloatingActionButtonbogVsAg(final Function0<Unit> onClick, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i5;
        long j3;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource3;
        CornerBasedShape cornerBasedShape;
        long j4;
        final int i6;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource4;
        final long j5;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        final Modifier modifier3;
        final long j6;
        final FloatingActionButtonElevation floatingActionButtonElevation4;
        final long j7;
        final Shape shape4;
        final MutableInteractionSource mutableInteractionSource5;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1028985328);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButton)P(6,5,4,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)81@3832L39,82@3906L6,83@3994L6,84@4038L32,85@4148L11,94@4393L28,88@4205L685:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(j)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                    i9 = 8192;
                    i3 |= i9;
                }
                if ((i & 458752) == 0) {
                    i5 = 57344;
                    j3 = j2;
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                } else {
                    i5 = 57344;
                    j3 = j2;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                            i8 = 1048576;
                            i3 |= i8;
                        }
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i8 = 524288;
                    i3 |= i8;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if ((i2 & 128) == 0) {
                    i7 = (29360128 & i) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                    if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i11 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 8) == 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -7169;
                            } else {
                                cornerBasedShape = shape2;
                            }
                            if ((i2 & 16) == 0) {
                                j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1326getSecondary0d7_KjU();
                                i3 &= -57345;
                            } else {
                                j4 = j;
                            }
                            if ((i2 & 32) != 0) {
                                j3 = ColorsKt.m1342contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 12) & 14);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                floatingActionButtonElevation2 = FloatingActionButtonDefaults.INSTANCE.m1417elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                i3 &= -3670017;
                            }
                            FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevation2;
                            i6 = i3;
                            shape3 = cornerBasedShape;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            j5 = j3;
                            floatingActionButtonElevation3 = floatingActionButtonElevation5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier2;
                            j5 = j3;
                            floatingActionButtonElevation3 = floatingActionButtonElevation2;
                            i6 = i3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            shape3 = shape2;
                            j4 = j;
                        }
                        startRestartGroup.endDefaults();
                        Modifier modifier4 = companion;
                        long j8 = j4;
                        long j9 = j5;
                        SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier4, false, shape3, j8, j9, null, floatingActionButtonElevation3.elevation(mutableInteractionSource4, startRestartGroup, ((i6 >> 6) & 14) | ((i6 >> 15) & 112)).getValue().m4454unboximpl(), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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

                            public final void invoke(Composer composer2, int i12) {
                                ComposerKt.sourceInformation(composer2, "C97@4492L392:FloatingActionButton.kt#jmzs0o");
                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(j5)))};
                                    final Function2<Composer, Integer, Unit> function2 = content;
                                    final int i13 = i6;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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

                                        public final void invoke(Composer composer3, int i14) {
                                            ComposerKt.sourceInformation(composer3, "C98@4609L10,98@4578L296:FloatingActionButton.kt#jmzs0o");
                                            if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                                final Function2<Composer, Integer, Unit> function22 = function2;
                                                final int i15 = i13;
                                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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

                                                    public final void invoke(Composer composer4, int i16) {
                                                        float f;
                                                        float f2;
                                                        ComposerKt.sourceInformation(composer4, "C99@4646L214:FloatingActionButton.kt#jmzs0o");
                                                        if ((i16 & 11) != 2 || !composer4.getSkipping()) {
                                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                                            f = FloatingActionButtonKt.FabSize;
                                                            f2 = FloatingActionButtonKt.FabSize;
                                                            Modifier m618defaultMinSizeVpY3zN4 = SizeKt.m618defaultMinSizeVpY3zN4(companion2, f, f2);
                                                            Alignment center = Alignment.INSTANCE.getCenter();
                                                            Function2<Composer, Integer, Unit> function23 = function22;
                                                            int i17 = i15;
                                                            composer4.startReplaceableGroup(733328855);
                                                            ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 6);
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
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m618defaultMinSizeVpY3zN4);
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
                                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer4.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                            composer4.startReplaceableGroup(2058660585);
                                                            composer4.startReplaceableGroup(-2137368960);
                                                            ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            composer4.startReplaceableGroup(-1049034642);
                                                            ComposerKt.sourceInformation(composer4, "C103@4849L9:FloatingActionButton.kt#jmzs0o");
                                                            function23.invoke(composer4, Integer.valueOf((i17 >> 21) & 14));
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
                        }), startRestartGroup, (i6 & 14) | C.ENCODING_PCM_32BIT | (i6 & 112) | (i6 & 7168) | (i6 & i5) | (i6 & 458752) | ((i6 << 18) & 234881024), 68);
                        modifier3 = modifier4;
                        j6 = j9;
                        floatingActionButtonElevation4 = floatingActionButtonElevation3;
                        j7 = j8;
                        shape4 = shape3;
                        mutableInteractionSource5 = mutableInteractionSource4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        shape4 = shape2;
                        j6 = j3;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        j7 = j;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
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

                        public final void invoke(Composer composer2, int i12) {
                            FloatingActionButtonKt.m1419FloatingActionButtonbogVsAg(onClick, modifier3, mutableInteractionSource5, shape4, j7, j6, floatingActionButtonElevation4, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i7;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                FloatingActionButtonElevation floatingActionButtonElevation52 = floatingActionButtonElevation2;
                i6 = i3;
                shape3 = cornerBasedShape;
                mutableInteractionSource4 = mutableInteractionSource3;
                j5 = j3;
                floatingActionButtonElevation3 = floatingActionButtonElevation52;
                startRestartGroup.endDefaults();
                Modifier modifier42 = companion;
                long j82 = j4;
                long j92 = j5;
                SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier42, false, shape3, j82, j92, null, floatingActionButtonElevation3.elevation(mutableInteractionSource4, startRestartGroup, ((i6 >> 6) & 14) | ((i6 >> 15) & 112)).getValue().m4454unboximpl(), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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

                    public final void invoke(Composer composer2, int i12) {
                        ComposerKt.sourceInformation(composer2, "C97@4492L392:FloatingActionButton.kt#jmzs0o");
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(j5)))};
                            final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                            final int i13 = i6;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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

                                public final void invoke(Composer composer3, int i14) {
                                    ComposerKt.sourceInformation(composer3, "C98@4609L10,98@4578L296:FloatingActionButton.kt#jmzs0o");
                                    if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                        final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
                                        final int i15 = i13;
                                        TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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

                                            public final void invoke(Composer composer4, int i16) {
                                                float f;
                                                float f2;
                                                ComposerKt.sourceInformation(composer4, "C99@4646L214:FloatingActionButton.kt#jmzs0o");
                                                if ((i16 & 11) != 2 || !composer4.getSkipping()) {
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    f = FloatingActionButtonKt.FabSize;
                                                    f2 = FloatingActionButtonKt.FabSize;
                                                    Modifier m618defaultMinSizeVpY3zN4 = SizeKt.m618defaultMinSizeVpY3zN4(companion2, f, f2);
                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                    Function2<Composer, Integer, Unit> function23 = function22;
                                                    int i17 = i15;
                                                    composer4.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 6);
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
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m618defaultMinSizeVpY3zN4);
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
                                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer4.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    composer4.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer4.startReplaceableGroup(-1049034642);
                                                    ComposerKt.sourceInformation(composer4, "C103@4849L9:FloatingActionButton.kt#jmzs0o");
                                                    function23.invoke(composer4, Integer.valueOf((i17 >> 21) & 14));
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
                }), startRestartGroup, (i6 & 14) | C.ENCODING_PCM_32BIT | (i6 & 112) | (i6 & 7168) | (i6 & i5) | (i6 & 458752) | ((i6 << 18) & 234881024), 68);
                modifier3 = modifier42;
                j6 = j92;
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                j7 = j82;
                shape4 = shape3;
                mutableInteractionSource5 = mutableInteractionSource4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((3670016 & i) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i7;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            FloatingActionButtonElevation floatingActionButtonElevation522 = floatingActionButtonElevation2;
            i6 = i3;
            shape3 = cornerBasedShape;
            mutableInteractionSource4 = mutableInteractionSource3;
            j5 = j3;
            floatingActionButtonElevation3 = floatingActionButtonElevation522;
            startRestartGroup.endDefaults();
            Modifier modifier422 = companion;
            long j822 = j4;
            long j922 = j5;
            SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier422, false, shape3, j822, j922, null, floatingActionButtonElevation3.elevation(mutableInteractionSource4, startRestartGroup, ((i6 >> 6) & 14) | ((i6 >> 15) & 112)).getValue().m4454unboximpl(), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C97@4492L392:FloatingActionButton.kt#jmzs0o");
                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(j5)))};
                        final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                        final int i13 = i6;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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

                            public final void invoke(Composer composer3, int i14) {
                                ComposerKt.sourceInformation(composer3, "C98@4609L10,98@4578L296:FloatingActionButton.kt#jmzs0o");
                                if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                    final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
                                    final int i15 = i13;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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

                                        public final void invoke(Composer composer4, int i16) {
                                            float f;
                                            float f2;
                                            ComposerKt.sourceInformation(composer4, "C99@4646L214:FloatingActionButton.kt#jmzs0o");
                                            if ((i16 & 11) != 2 || !composer4.getSkipping()) {
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                f = FloatingActionButtonKt.FabSize;
                                                f2 = FloatingActionButtonKt.FabSize;
                                                Modifier m618defaultMinSizeVpY3zN4 = SizeKt.m618defaultMinSizeVpY3zN4(companion2, f, f2);
                                                Alignment center = Alignment.INSTANCE.getCenter();
                                                Function2<Composer, Integer, Unit> function23 = function22;
                                                int i17 = i15;
                                                composer4.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 6);
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
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m618defaultMinSizeVpY3zN4);
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
                                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(-1049034642);
                                                ComposerKt.sourceInformation(composer4, "C103@4849L9:FloatingActionButton.kt#jmzs0o");
                                                function23.invoke(composer4, Integer.valueOf((i17 >> 21) & 14));
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
            }), startRestartGroup, (i6 & 14) | C.ENCODING_PCM_32BIT | (i6 & 112) | (i6 & 7168) | (i6 & i5) | (i6 & 458752) | ((i6 << 18) & 234881024), 68);
            modifier3 = modifier422;
            j6 = j922;
            floatingActionButtonElevation4 = floatingActionButtonElevation3;
            j7 = j822;
            shape4 = shape3;
            mutableInteractionSource5 = mutableInteractionSource4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((3670016 & i) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i7;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        FloatingActionButtonElevation floatingActionButtonElevation5222 = floatingActionButtonElevation2;
        i6 = i3;
        shape3 = cornerBasedShape;
        mutableInteractionSource4 = mutableInteractionSource3;
        j5 = j3;
        floatingActionButtonElevation3 = floatingActionButtonElevation5222;
        startRestartGroup.endDefaults();
        Modifier modifier4222 = companion;
        long j8222 = j4;
        long j9222 = j5;
        SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier4222, false, shape3, j8222, j9222, null, floatingActionButtonElevation3.elevation(mutableInteractionSource4, startRestartGroup, ((i6 >> 6) & 14) | ((i6 >> 15) & 112)).getValue().m4454unboximpl(), mutableInteractionSource4, ComposableLambdaKt.composableLambda(startRestartGroup, 1972871863, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
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

            public final void invoke(Composer composer2, int i12) {
                ComposerKt.sourceInformation(composer2, "C97@4492L392:FloatingActionButton.kt#jmzs0o");
                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(j5)))};
                    final Function2<? super Composer, ? super Integer, Unit> function2 = content;
                    final int i13 = i6;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1867794295, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
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

                        public final void invoke(Composer composer3, int i14) {
                            ComposerKt.sourceInformation(composer3, "C98@4609L10,98@4578L296:FloatingActionButton.kt#jmzs0o");
                            if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
                                final int i15 = i13;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -1567914264, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
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

                                    public final void invoke(Composer composer4, int i16) {
                                        float f;
                                        float f2;
                                        ComposerKt.sourceInformation(composer4, "C99@4646L214:FloatingActionButton.kt#jmzs0o");
                                        if ((i16 & 11) != 2 || !composer4.getSkipping()) {
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            f = FloatingActionButtonKt.FabSize;
                                            f2 = FloatingActionButtonKt.FabSize;
                                            Modifier m618defaultMinSizeVpY3zN4 = SizeKt.m618defaultMinSizeVpY3zN4(companion2, f, f2);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function23 = function22;
                                            int i17 = i15;
                                            composer4.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 6);
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
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m618defaultMinSizeVpY3zN4);
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
                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer4.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(-1049034642);
                                            ComposerKt.sourceInformation(composer4, "C103@4849L9:FloatingActionButton.kt#jmzs0o");
                                            function23.invoke(composer4, Integer.valueOf((i17 >> 21) & 14));
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
        }), startRestartGroup, (i6 & 14) | C.ENCODING_PCM_32BIT | (i6 & 112) | (i6 & 7168) | (i6 & i5) | (i6 & 458752) | ((i6 << 18) & 234881024), 68);
        modifier3 = modifier4222;
        j6 = j9222;
        floatingActionButtonElevation4 = floatingActionButtonElevation3;
        j7 = j8222;
        shape4 = shape3;
        mutableInteractionSource5 = mutableInteractionSource4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0293 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f1  */
    /* renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1418ExtendedFloatingActionButtonwqdebIU(final Function2<? super Composer, ? super Integer, Unit> text, final Function0<Unit> onClick, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i5;
        Shape shape2;
        int i6;
        long j3;
        int i7;
        int i8;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        CornerBasedShape cornerBasedShape;
        long j4;
        long j5;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        MutableInteractionSource mutableInteractionSource3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        long j6;
        long j7;
        final FloatingActionButtonElevation floatingActionButtonElevation4;
        final Modifier modifier3;
        final long j8;
        final long j9;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1555720195);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)P(8,6,5,3,4,7,0:c#ui.graphics.Color,1:c#ui.graphics.Color)148@7090L39,149@7164L6,150@7252L6,151@7296L32,152@7406L11,154@7426L849:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changed(function22) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i12 = 131072;
                                i3 |= i12;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 3670016) != 0) {
                        i6 = 57344;
                        j3 = j;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                    } else {
                        i6 = 57344;
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        i7 = 458752;
                        if ((i2 & 128) == 0) {
                            i8 = 3670016;
                            if (startRestartGroup.changed(j2)) {
                                i11 = 8388608;
                                i3 |= i11;
                            }
                        } else {
                            i8 = 3670016;
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    } else {
                        i7 = 458752;
                        i8 = 3670016;
                    }
                    if ((i & 234881024) != 0) {
                        i9 = i2;
                        if ((i9 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                                i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i3 |= i10;
                            }
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i10 = 33554432;
                        i3 |= i10;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        i9 = i2;
                    }
                    int i14 = i8;
                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function22 = null;
                            }
                            if (i5 == 0) {
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
                            if ((i9 & 32) == 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i3 &= -458753;
                            } else {
                                cornerBasedShape = shape2;
                            }
                            if ((i9 & 64) == 0) {
                                j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1326getSecondary0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                j4 = j3;
                            }
                            if ((i9 & 128) == 0) {
                                j5 = ColorsKt.m1342contentColorForek8zF_U(j4, startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                j5 = j2;
                            }
                            if ((i9 & 256) == 0) {
                                i3 &= -234881025;
                                shape2 = cornerBasedShape;
                                floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m1417elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            } else {
                                shape2 = cornerBasedShape;
                                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                            function23 = function22;
                            j6 = j4;
                            j7 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i9 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i9 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i9 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i9 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            function23 = function22;
                            j6 = j3;
                            floatingActionButtonElevation3 = floatingActionButtonElevation2;
                            j7 = j2;
                        }
                        startRestartGroup.endDefaults();
                        float f = ExtendedFabSize;
                        Modifier modifier4 = modifier2;
                        int i15 = i3 >> 6;
                        Shape shape4 = shape2;
                        m1419FloatingActionButtonbogVsAg(onClick, SizeKt.m638sizeInqDBjuR0$default(modifier4, f, f, 0.0f, 0.0f, 12, null), mutableInteractionSource3, shape4, j6, j7, floatingActionButtonElevation3, ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

                            public final void invoke(Composer composer2, int i16) {
                                float f2;
                                float f3;
                                ComposerKt.sourceInformation(composer2, "C167@7894L375:FloatingActionButton.kt#jmzs0o");
                                if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                                    float f4 = function23 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    f2 = FloatingActionButtonKt.ExtendedFabTextPadding;
                                    Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion, f4, 0.0f, f2, 0.0f, 10, null);
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2<Composer, Integer, Unit> function25 = function23;
                                    int i17 = i3;
                                    Function2<Composer, Integer, Unit> function26 = text;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = composer2.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density = (Density) consume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer2.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer2.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(-388203689);
                                    ComposerKt.sourceInformation(composer2, "C178@8253L6:FloatingActionButton.kt#jmzs0o");
                                    composer2.startReplaceableGroup(-1435223762);
                                    ComposerKt.sourceInformation(composer2, "175@8157L6,176@8180L46");
                                    if (function25 != null) {
                                        function25.invoke(composer2, Integer.valueOf((i17 >> 9) & 14));
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f3), composer2, 6);
                                    }
                                    composer2.endReplaceableGroup();
                                    function26.invoke(composer2, Integer.valueOf(i17 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, ((i3 >> 3) & 14) | 12582912 | (i15 & 896) | (i15 & 7168) | (i15 & i6) | (i15 & i7) | (i15 & i14), 0);
                        floatingActionButtonElevation4 = floatingActionButtonElevation3;
                        modifier3 = modifier4;
                        j8 = j7;
                        j9 = j6;
                        shape3 = shape4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        function24 = function23;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function24 = function22;
                        j9 = j3;
                        shape3 = shape2;
                        floatingActionButtonElevation4 = floatingActionButtonElevation2;
                        mutableInteractionSource4 = mutableInteractionSource;
                        j8 = j2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
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

                        public final void invoke(Composer composer2, int i16) {
                            FloatingActionButtonKt.m1418ExtendedFloatingActionButtonwqdebIU(text, onClick, modifier3, function24, mutableInteractionSource4, shape3, j9, j8, floatingActionButtonElevation4, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                if ((i & 458752) != 0) {
                }
                if ((i & 3670016) != 0) {
                }
                if ((i & 29360128) != 0) {
                }
                if ((i & 234881024) != 0) {
                }
                int i142 = i8;
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i9 & 32) == 0) {
                }
                if ((i9 & 64) == 0) {
                }
                if ((i9 & 128) == 0) {
                }
                if ((i9 & 256) == 0) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                function23 = function22;
                j6 = j4;
                j7 = j5;
                startRestartGroup.endDefaults();
                float f2 = ExtendedFabSize;
                Modifier modifier42 = modifier2;
                int i152 = i3 >> 6;
                Shape shape42 = shape2;
                m1419FloatingActionButtonbogVsAg(onClick, SizeKt.m638sizeInqDBjuR0$default(modifier42, f2, f2, 0.0f, 0.0f, 12, null), mutableInteractionSource3, shape42, j6, j7, floatingActionButtonElevation3, ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

                    public final void invoke(Composer composer2, int i16) {
                        float f22;
                        float f3;
                        ComposerKt.sourceInformation(composer2, "C167@7894L375:FloatingActionButton.kt#jmzs0o");
                        if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                            float f4 = function23 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            f22 = FloatingActionButtonKt.ExtendedFabTextPadding;
                            Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion, f4, 0.0f, f22, 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function25 = function23;
                            int i17 = i3;
                            Function2<Composer, Integer, Unit> function26 = text;
                            composer2.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-388203689);
                            ComposerKt.sourceInformation(composer2, "C178@8253L6:FloatingActionButton.kt#jmzs0o");
                            composer2.startReplaceableGroup(-1435223762);
                            ComposerKt.sourceInformation(composer2, "175@8157L6,176@8180L46");
                            if (function25 != null) {
                                function25.invoke(composer2, Integer.valueOf((i17 >> 9) & 14));
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                                SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f3), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function26.invoke(composer2, Integer.valueOf(i17 & 14));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, ((i3 >> 3) & 14) | 12582912 | (i152 & 896) | (i152 & 7168) | (i152 & i6) | (i152 & i7) | (i152 & i142), 0);
                floatingActionButtonElevation4 = floatingActionButtonElevation3;
                modifier3 = modifier42;
                j8 = j7;
                j9 = j6;
                shape3 = shape42;
                mutableInteractionSource4 = mutableInteractionSource3;
                function24 = function23;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function22 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((i & 458752) != 0) {
            }
            if ((i & 3670016) != 0) {
            }
            if ((i & 29360128) != 0) {
            }
            if ((i & 234881024) != 0) {
            }
            int i1422 = i8;
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i9 & 32) == 0) {
            }
            if ((i9 & 64) == 0) {
            }
            if ((i9 & 128) == 0) {
            }
            if ((i9 & 256) == 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            function23 = function22;
            j6 = j4;
            j7 = j5;
            startRestartGroup.endDefaults();
            float f22 = ExtendedFabSize;
            Modifier modifier422 = modifier2;
            int i1522 = i3 >> 6;
            Shape shape422 = shape2;
            m1419FloatingActionButtonbogVsAg(onClick, SizeKt.m638sizeInqDBjuR0$default(modifier422, f22, f22, 0.0f, 0.0f, 12, null), mutableInteractionSource3, shape422, j6, j7, floatingActionButtonElevation3, ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

                public final void invoke(Composer composer2, int i16) {
                    float f222;
                    float f3;
                    ComposerKt.sourceInformation(composer2, "C167@7894L375:FloatingActionButton.kt#jmzs0o");
                    if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                        float f4 = function23 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        f222 = FloatingActionButtonKt.ExtendedFabTextPadding;
                        Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion, f4, 0.0f, f222, 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function25 = function23;
                        int i17 = i3;
                        Function2<Composer, Integer, Unit> function26 = text;
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-388203689);
                        ComposerKt.sourceInformation(composer2, "C178@8253L6:FloatingActionButton.kt#jmzs0o");
                        composer2.startReplaceableGroup(-1435223762);
                        ComposerKt.sourceInformation(composer2, "175@8157L6,176@8180L46");
                        if (function25 != null) {
                            function25.invoke(composer2, Integer.valueOf((i17 >> 9) & 14));
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                            SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f3), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function26.invoke(composer2, Integer.valueOf(i17 & 14));
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i3 >> 3) & 14) | 12582912 | (i1522 & 896) | (i1522 & 7168) | (i1522 & i6) | (i1522 & i7) | (i1522 & i1422), 0);
            floatingActionButtonElevation4 = floatingActionButtonElevation3;
            modifier3 = modifier422;
            j8 = j7;
            j9 = j6;
            shape3 = shape422;
            mutableInteractionSource4 = mutableInteractionSource3;
            function24 = function23;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((i & 458752) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if ((i & 234881024) != 0) {
        }
        int i14222 = i8;
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i9 & 32) == 0) {
        }
        if ((i9 & 64) == 0) {
        }
        if ((i9 & 128) == 0) {
        }
        if ((i9 & 256) == 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource2;
        function23 = function22;
        j6 = j4;
        j7 = j5;
        startRestartGroup.endDefaults();
        float f222 = ExtendedFabSize;
        Modifier modifier4222 = modifier2;
        int i15222 = i3 >> 6;
        Shape shape4222 = shape2;
        m1419FloatingActionButtonbogVsAg(onClick, SizeKt.m638sizeInqDBjuR0$default(modifier4222, f222, f222, 0.0f, 0.0f, 12, null), mutableInteractionSource3, shape4222, j6, j7, floatingActionButtonElevation3, ComposableLambdaKt.composableLambda(startRestartGroup, 1418981691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
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

            public final void invoke(Composer composer2, int i16) {
                float f2222;
                float f3;
                ComposerKt.sourceInformation(composer2, "C167@7894L375:FloatingActionButton.kt#jmzs0o");
                if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                    float f4 = function23 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    f2222 = FloatingActionButtonKt.ExtendedFabTextPadding;
                    Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion, f4, 0.0f, f2222, 0.0f, 10, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function25 = function23;
                    int i17 = i3;
                    Function2<Composer, Integer, Unit> function26 = text;
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-388203689);
                    ComposerKt.sourceInformation(composer2, "C178@8253L6:FloatingActionButton.kt#jmzs0o");
                    composer2.startReplaceableGroup(-1435223762);
                    ComposerKt.sourceInformation(composer2, "175@8157L6,176@8180L46");
                    if (function25 != null) {
                        function25.invoke(composer2, Integer.valueOf((i17 >> 9) & 14));
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, f3), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function26.invoke(composer2, Integer.valueOf(i17 & 14));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i3 >> 3) & 14) | 12582912 | (i15222 & 896) | (i15222 & 7168) | (i15222 & i6) | (i15222 & i7) | (i15222 & i14222), 0);
        floatingActionButtonElevation4 = floatingActionButtonElevation3;
        modifier3 = modifier4222;
        j8 = j7;
        j9 = j6;
        shape3 = shape4222;
        mutableInteractionSource4 = mutableInteractionSource3;
        function24 = function23;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
