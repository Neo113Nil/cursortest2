package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a3\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010\u0011\u001ac\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a{\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00012\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a \u0010&\u001a\u00020\f2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u000fH\u0003¢\u0006\u0002\u0010'\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\n\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"HeightToFirstLine", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarMinHeightOneLine", "SnackbarMinHeightTwoLines", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "Snackbar", "snackbarData", "Landroidx/compose/material/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "actionColor", "elevation", "Snackbar-sPrSdHI", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "content", "Snackbar-7zSek6w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TextOnlySnackbar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarKt {
    private static final float HorizontalSpacingButtonSide;
    private static final float TextEndExtraSpacing;
    private static final float HeightToFirstLine = Dp.m4440constructorimpl(30);
    private static final float HorizontalSpacing = Dp.m4440constructorimpl(16);
    private static final float SeparateButtonExtraY = Dp.m4440constructorimpl(2);
    private static final float SnackbarVerticalPadding = Dp.m4440constructorimpl(6);
    private static final float LongButtonVerticalOffset = Dp.m4440constructorimpl(12);
    private static final float SnackbarMinHeightOneLine = Dp.m4440constructorimpl(48);
    private static final float SnackbarMinHeightTwoLines = Dp.m4440constructorimpl(68);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0202 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f1  */
    /* renamed from: Snackbar-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1502Snackbar7zSek6w(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Shape shape, long j, long j2, float f, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final int i3;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        int i4;
        boolean z2;
        Shape shape2;
        long j3;
        int i5;
        long j4;
        int i6;
        int i7;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final boolean z3;
        CornerBasedShape cornerBasedShape;
        long j5;
        Modifier modifier2;
        int i8;
        long j6;
        float f2;
        Shape shape3;
        long j7;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final boolean z4;
        final Shape shape4;
        final long j8;
        final long j9;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-558258760);
        ComposerKt.sourceInformation(startRestartGroup, "C(Snackbar)P(6!2,7,2:c#ui.graphics.Color,4:c#ui.graphics.Color,5:c#ui.unit.Dp)84@3955L6,85@4015L15,86@4072L6,90@4158L631:Snackbar.kt#jmzs0o");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changed(function22) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    j3 = j;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                } else {
                    j3 = j;
                }
                if ((i & 458752) == 0) {
                    i5 = 458752;
                    j4 = j2;
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                } else {
                    i5 = 458752;
                    j4 = j2;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i7 = i10;
                    i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((29360128 & i) == 0) {
                        function23 = content;
                        i3 |= startRestartGroup.changed(function23) ? 8388608 : 4194304;
                        if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier;
                                if (i11 != 0) {
                                    function22 = null;
                                }
                                z3 = i4 != 0 ? false : z2;
                                if ((i2 & 8) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                                    i3 &= -7169;
                                } else {
                                    cornerBasedShape = shape2;
                                }
                                if ((i2 & 16) != 0) {
                                    j3 = SnackbarDefaults.INSTANCE.getBackgroundColor(startRestartGroup, 6);
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                    i3 &= -458753;
                                } else {
                                    j5 = j4;
                                }
                                if (i6 != 0) {
                                    long j10 = j3;
                                    modifier2 = companion;
                                    i8 = 1572864;
                                    j6 = j10;
                                    f2 = Dp.m4440constructorimpl(6);
                                } else {
                                    long j11 = j3;
                                    modifier2 = companion;
                                    i8 = 1572864;
                                    j6 = j11;
                                    f2 = f;
                                }
                                shape3 = cornerBasedShape;
                                j7 = j5;
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
                                f2 = f;
                                z3 = z2;
                                j7 = j4;
                                i8 = 1572864;
                                j6 = j3;
                                modifier2 = modifier;
                                shape3 = shape2;
                            }
                            startRestartGroup.endDefaults();
                            int i12 = i3 >> 6;
                            composer2 = startRestartGroup;
                            SurfaceKt.m1520SurfaceFjzlyU(modifier2, shape3, j6, j7, null, f2, ComposableLambdaKt.composableLambda(startRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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

                                public final void invoke(Composer composer3, int i13) {
                                    ComposerKt.sourceInformation(composer3, "C97@4400L4,97@4335L448:Snackbar.kt#jmzs0o");
                                    if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                                        final Function2<Composer, Integer, Unit> function25 = function22;
                                        final Function2<Composer, Integer, Unit> function26 = function23;
                                        final int i14 = i3;
                                        final boolean z5 = z3;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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

                                            public final void invoke(Composer composer4, int i15) {
                                                ComposerKt.sourceInformation(composer4, "C98@4450L10,99@4479L294:Snackbar.kt#jmzs0o");
                                                if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                    final Function2<Composer, Integer, Unit> function27 = function25;
                                                    final Function2<Composer, Integer, Unit> function28 = function26;
                                                    final int i16 = i14;
                                                    final boolean z6 = z5;
                                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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

                                                        public final void invoke(Composer composer5, int i17) {
                                                            ComposerKt.sourceInformation(composer5, "C:Snackbar.kt#jmzs0o");
                                                            if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                                if (function27 == null) {
                                                                    composer5.startReplaceableGroup(59708346);
                                                                    ComposerKt.sourceInformation(composer5, "101@4578L25");
                                                                    SnackbarKt.TextOnlySnackbar(function28, composer5, (i16 >> 21) & 14);
                                                                    composer5.endReplaceableGroup();
                                                                    return;
                                                                }
                                                                if (z6) {
                                                                    composer5.startReplaceableGroup(59708411);
                                                                    ComposerKt.sourceInformation(composer5, "102@4643L38");
                                                                    Function2<Composer, Integer, Unit> function29 = function28;
                                                                    Function2<Composer, Integer, Unit> function210 = function27;
                                                                    int i18 = i16;
                                                                    SnackbarKt.NewLineButtonSnackbar(function29, function210, composer5, (i18 & 112) | ((i18 >> 21) & 14));
                                                                    composer5.endReplaceableGroup();
                                                                    return;
                                                                }
                                                                composer5.startReplaceableGroup(59708478);
                                                                ComposerKt.sourceInformation(composer5, "103@4710L31");
                                                                Function2<Composer, Integer, Unit> function211 = function28;
                                                                Function2<Composer, Integer, Unit> function212 = function27;
                                                                int i19 = i16;
                                                                SnackbarKt.OneRowSnackbar(function211, function212, composer5, (i19 & 112) | ((i19 >> 21) & 14));
                                                                composer5.endReplaceableGroup();
                                                                return;
                                                            }
                                                            composer5.skipToGroupEnd();
                                                        }
                                                    }), composer4, 48);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 56);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, i8 | (i3 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | ((i3 >> 3) & i5), 16);
                            function24 = function22;
                            z4 = z3;
                            shape4 = shape3;
                            j8 = j6;
                            j9 = j7;
                            f3 = f2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            function24 = function22;
                            z4 = z2;
                            shape4 = shape2;
                            j9 = j4;
                            j8 = j3;
                            modifier2 = modifier;
                            f3 = f;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                        final Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
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

                            public final void invoke(Composer composer3, int i13) {
                                SnackbarKt.m1502Snackbar7zSek6w(Modifier.this, function24, z4, shape4, j8, j9, f3, function25, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    function23 = content;
                    if ((i3 & 23967451) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    shape3 = cornerBasedShape;
                    j7 = j5;
                    startRestartGroup.endDefaults();
                    int i122 = i3 >> 6;
                    composer2 = startRestartGroup;
                    SurfaceKt.m1520SurfaceFjzlyU(modifier2, shape3, j6, j7, null, f2, ComposableLambdaKt.composableLambda(startRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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

                        public final void invoke(Composer composer3, int i13) {
                            ComposerKt.sourceInformation(composer3, "C97@4400L4,97@4335L448:Snackbar.kt#jmzs0o");
                            if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                                final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                                final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
                                final int i14 = i3;
                                final boolean z5 = z3;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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

                                    public final void invoke(Composer composer4, int i15) {
                                        ComposerKt.sourceInformation(composer4, "C98@4450L10,99@4479L294:Snackbar.kt#jmzs0o");
                                        if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                            TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                            final Function2<? super Composer, ? super Integer, Unit> function27 = function252;
                                            final Function2<? super Composer, ? super Integer, Unit> function28 = function26;
                                            final int i16 = i14;
                                            final boolean z6 = z5;
                                            TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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

                                                public final void invoke(Composer composer5, int i17) {
                                                    ComposerKt.sourceInformation(composer5, "C:Snackbar.kt#jmzs0o");
                                                    if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                        if (function27 == null) {
                                                            composer5.startReplaceableGroup(59708346);
                                                            ComposerKt.sourceInformation(composer5, "101@4578L25");
                                                            SnackbarKt.TextOnlySnackbar(function28, composer5, (i16 >> 21) & 14);
                                                            composer5.endReplaceableGroup();
                                                            return;
                                                        }
                                                        if (z6) {
                                                            composer5.startReplaceableGroup(59708411);
                                                            ComposerKt.sourceInformation(composer5, "102@4643L38");
                                                            Function2<Composer, Integer, Unit> function29 = function28;
                                                            Function2<Composer, Integer, Unit> function210 = function27;
                                                            int i18 = i16;
                                                            SnackbarKt.NewLineButtonSnackbar(function29, function210, composer5, (i18 & 112) | ((i18 >> 21) & 14));
                                                            composer5.endReplaceableGroup();
                                                            return;
                                                        }
                                                        composer5.startReplaceableGroup(59708478);
                                                        ComposerKt.sourceInformation(composer5, "103@4710L31");
                                                        Function2<Composer, Integer, Unit> function211 = function28;
                                                        Function2<Composer, Integer, Unit> function212 = function27;
                                                        int i19 = i16;
                                                        SnackbarKt.OneRowSnackbar(function211, function212, composer5, (i19 & 112) | ((i19 >> 21) & 14));
                                                        composer5.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }), composer4, 48);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 56);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, i8 | (i3 & 14) | (i122 & 112) | (i122 & 896) | (i122 & 7168) | ((i3 >> 3) & i5), 16);
                    function24 = function22;
                    z4 = z3;
                    shape4 = shape3;
                    j8 = j6;
                    j9 = j7;
                    f3 = f2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i10;
                if ((i2 & 128) == 0) {
                }
                function23 = content;
                if ((i3 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                shape3 = cornerBasedShape;
                j7 = j5;
                startRestartGroup.endDefaults();
                int i1222 = i3 >> 6;
                composer2 = startRestartGroup;
                SurfaceKt.m1520SurfaceFjzlyU(modifier2, shape3, j6, j7, null, f2, ComposableLambdaKt.composableLambda(startRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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

                    public final void invoke(Composer composer3, int i13) {
                        ComposerKt.sourceInformation(composer3, "C97@4400L4,97@4335L448:Snackbar.kt#jmzs0o");
                        if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                            final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                            final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
                            final int i14 = i3;
                            final boolean z5 = z3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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

                                public final void invoke(Composer composer4, int i15) {
                                    ComposerKt.sourceInformation(composer4, "C98@4450L10,99@4479L294:Snackbar.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function252;
                                        final Function2<? super Composer, ? super Integer, Unit> function28 = function26;
                                        final int i16 = i14;
                                        final boolean z6 = z5;
                                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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

                                            public final void invoke(Composer composer5, int i17) {
                                                ComposerKt.sourceInformation(composer5, "C:Snackbar.kt#jmzs0o");
                                                if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (function27 == null) {
                                                        composer5.startReplaceableGroup(59708346);
                                                        ComposerKt.sourceInformation(composer5, "101@4578L25");
                                                        SnackbarKt.TextOnlySnackbar(function28, composer5, (i16 >> 21) & 14);
                                                        composer5.endReplaceableGroup();
                                                        return;
                                                    }
                                                    if (z6) {
                                                        composer5.startReplaceableGroup(59708411);
                                                        ComposerKt.sourceInformation(composer5, "102@4643L38");
                                                        Function2<Composer, Integer, Unit> function29 = function28;
                                                        Function2<Composer, Integer, Unit> function210 = function27;
                                                        int i18 = i16;
                                                        SnackbarKt.NewLineButtonSnackbar(function29, function210, composer5, (i18 & 112) | ((i18 >> 21) & 14));
                                                        composer5.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer5.startReplaceableGroup(59708478);
                                                    ComposerKt.sourceInformation(composer5, "103@4710L31");
                                                    Function2<Composer, Integer, Unit> function211 = function28;
                                                    Function2<Composer, Integer, Unit> function212 = function27;
                                                    int i19 = i16;
                                                    SnackbarKt.OneRowSnackbar(function211, function212, composer5, (i19 & 112) | ((i19 >> 21) & 14));
                                                    composer5.endReplaceableGroup();
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 48);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 56);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, i8 | (i3 & 14) | (i1222 & 112) | (i1222 & 896) | (i1222 & 7168) | ((i3 >> 3) & i5), 16);
                function24 = function22;
                z4 = z3;
                shape4 = shape3;
                j8 = j6;
                j9 = j7;
                f3 = f2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i10;
            if ((i2 & 128) == 0) {
            }
            function23 = content;
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            shape3 = cornerBasedShape;
            j7 = j5;
            startRestartGroup.endDefaults();
            int i12222 = i3 >> 6;
            composer2 = startRestartGroup;
            SurfaceKt.m1520SurfaceFjzlyU(modifier2, shape3, j6, j7, null, f2, ComposableLambdaKt.composableLambda(startRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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

                public final void invoke(Composer composer3, int i13) {
                    ComposerKt.sourceInformation(composer3, "C97@4400L4,97@4335L448:Snackbar.kt#jmzs0o");
                    if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                        final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                        final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
                        final int i14 = i3;
                        final boolean z5 = z3;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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

                            public final void invoke(Composer composer4, int i15) {
                                ComposerKt.sourceInformation(composer4, "C98@4450L10,99@4479L294:Snackbar.kt#jmzs0o");
                                if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                    final Function2<? super Composer, ? super Integer, Unit> function27 = function252;
                                    final Function2<? super Composer, ? super Integer, Unit> function28 = function26;
                                    final int i16 = i14;
                                    final boolean z6 = z5;
                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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

                                        public final void invoke(Composer composer5, int i17) {
                                            ComposerKt.sourceInformation(composer5, "C:Snackbar.kt#jmzs0o");
                                            if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                                if (function27 == null) {
                                                    composer5.startReplaceableGroup(59708346);
                                                    ComposerKt.sourceInformation(composer5, "101@4578L25");
                                                    SnackbarKt.TextOnlySnackbar(function28, composer5, (i16 >> 21) & 14);
                                                    composer5.endReplaceableGroup();
                                                    return;
                                                }
                                                if (z6) {
                                                    composer5.startReplaceableGroup(59708411);
                                                    ComposerKt.sourceInformation(composer5, "102@4643L38");
                                                    Function2<Composer, Integer, Unit> function29 = function28;
                                                    Function2<Composer, Integer, Unit> function210 = function27;
                                                    int i18 = i16;
                                                    SnackbarKt.NewLineButtonSnackbar(function29, function210, composer5, (i18 & 112) | ((i18 >> 21) & 14));
                                                    composer5.endReplaceableGroup();
                                                    return;
                                                }
                                                composer5.startReplaceableGroup(59708478);
                                                ComposerKt.sourceInformation(composer5, "103@4710L31");
                                                Function2<Composer, Integer, Unit> function211 = function28;
                                                Function2<Composer, Integer, Unit> function212 = function27;
                                                int i19 = i16;
                                                SnackbarKt.OneRowSnackbar(function211, function212, composer5, (i19 & 112) | ((i19 >> 21) & 14));
                                                composer5.endReplaceableGroup();
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }), composer4, 48);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 56);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, i8 | (i3 & 14) | (i12222 & 112) | (i12222 & 896) | (i12222 & 7168) | ((i3 >> 3) & i5), 16);
            function24 = function22;
            z4 = z3;
            shape4 = shape3;
            j8 = j6;
            j9 = j7;
            f3 = f2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function22 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i10;
        if ((i2 & 128) == 0) {
        }
        function23 = content;
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        shape3 = cornerBasedShape;
        j7 = j5;
        startRestartGroup.endDefaults();
        int i122222 = i3 >> 6;
        composer2 = startRestartGroup;
        SurfaceKt.m1520SurfaceFjzlyU(modifier2, shape3, j6, j7, null, f2, ComposableLambdaKt.composableLambda(startRestartGroup, -2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
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

            public final void invoke(Composer composer3, int i13) {
                ComposerKt.sourceInformation(composer3, "C97@4400L4,97@4335L448:Snackbar.kt#jmzs0o");
                if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))};
                    final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                    final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
                    final int i14 = i3;
                    final boolean z5 = z3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
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

                        public final void invoke(Composer composer4, int i15) {
                            ComposerKt.sourceInformation(composer4, "C98@4450L10,99@4479L294:Snackbar.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer4.getSkipping()) {
                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                final Function2<? super Composer, ? super Integer, Unit> function27 = function252;
                                final Function2<? super Composer, ? super Integer, Unit> function28 = function26;
                                final int i16 = i14;
                                final boolean z6 = z5;
                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer4, 225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
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

                                    public final void invoke(Composer composer5, int i17) {
                                        ComposerKt.sourceInformation(composer5, "C:Snackbar.kt#jmzs0o");
                                        if ((i17 & 11) != 2 || !composer5.getSkipping()) {
                                            if (function27 == null) {
                                                composer5.startReplaceableGroup(59708346);
                                                ComposerKt.sourceInformation(composer5, "101@4578L25");
                                                SnackbarKt.TextOnlySnackbar(function28, composer5, (i16 >> 21) & 14);
                                                composer5.endReplaceableGroup();
                                                return;
                                            }
                                            if (z6) {
                                                composer5.startReplaceableGroup(59708411);
                                                ComposerKt.sourceInformation(composer5, "102@4643L38");
                                                Function2<Composer, Integer, Unit> function29 = function28;
                                                Function2<Composer, Integer, Unit> function210 = function27;
                                                int i18 = i16;
                                                SnackbarKt.NewLineButtonSnackbar(function29, function210, composer5, (i18 & 112) | ((i18 >> 21) & 14));
                                                composer5.endReplaceableGroup();
                                                return;
                                            }
                                            composer5.startReplaceableGroup(59708478);
                                            ComposerKt.sourceInformation(composer5, "103@4710L31");
                                            Function2<Composer, Integer, Unit> function211 = function28;
                                            Function2<Composer, Integer, Unit> function212 = function27;
                                            int i19 = i16;
                                            SnackbarKt.OneRowSnackbar(function211, function212, composer5, (i19 & 112) | ((i19 >> 21) & 14));
                                            composer5.endReplaceableGroup();
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 48);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 56);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, i8 | (i3 & 14) | (i122222 & 112) | (i122222 & 896) | (i122222 & 7168) | ((i3 >> 3) & i5), 16);
        function24 = function22;
        z4 = z3;
        shape4 = shape3;
        j8 = j6;
        j9 = j7;
        f3 = f2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ab  */
    /* renamed from: Snackbar-sPrSdHI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1503SnackbarsPrSdHI(final SnackbarData snackbarData, Modifier modifier, boolean z, Shape shape, long j, long j2, long j3, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        long j4;
        int i5;
        long j5;
        int i6;
        int i7;
        final float f2;
        long j6;
        long j7;
        int i8;
        int i9;
        int i10;
        long j8;
        boolean z3;
        Shape shape3;
        float f3;
        final String actionLabel;
        int i11;
        final SnackbarData snackbarData2;
        ComposableLambda composableLambda;
        Composer composer2;
        final boolean z4;
        final long j9;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(snackbarData, "snackbarData");
        Composer startRestartGroup = composer.startRestartGroup(258660814);
        ComposerKt.sourceInformation(startRestartGroup, "C(Snackbar)P(7,5,1,6,2:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,4:c#ui.unit.Dp)155@7132L6,156@7192L15,157@7249L6,158@7307L18,173@7784L320:Snackbar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
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
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i14 = 2048;
                            i3 |= i14;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i14 = 1024;
                    i3 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(j)) {
                        i13 = 16384;
                        i3 |= i13;
                    }
                    i13 = 8192;
                    i3 |= i13;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i12 = 131072;
                            i3 |= i12;
                        }
                    } else {
                        j4 = j2;
                    }
                    i12 = 65536;
                    i3 |= i12;
                } else {
                    j4 = j2;
                }
                if ((i & 3670016) == 0) {
                    i5 = 57344;
                    j5 = j3;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                } else {
                    i5 = 57344;
                    j5 = j3;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i7 = 458752;
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                    if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                            }
                            if ((i2 & 16) == 0) {
                                j6 = SnackbarDefaults.INSTANCE.getBackgroundColor(startRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                j6 = j;
                            }
                            if ((i2 & 32) != 0) {
                                j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                j5 = SnackbarDefaults.INSTANCE.getPrimaryActionColor(startRestartGroup, 6);
                                i3 &= -3670017;
                            }
                            if (i6 != 0) {
                                j7 = j4;
                                i8 = 3670016;
                                i9 = 12582912;
                                i10 = i7;
                                j8 = j6;
                                z3 = z2;
                                shape3 = shape2;
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                actionLabel = snackbarData.getActionLabel();
                                if (actionLabel == null) {
                                    final int i16 = i3;
                                    final long j10 = j5;
                                    i11 = i16;
                                    snackbarData2 = snackbarData;
                                    composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i17) {
                                            ComposerKt.sourceInformation(composer3, "C165@7570L44,164@7518L219:Snackbar.kt#jmzs0o");
                                            if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                                ButtonColors m1283textButtonColorsRGew2ao = ButtonDefaults.INSTANCE.m1283textButtonColorsRGew2ao(0L, j10, 0L, composer3, ((i16 >> 15) & 112) | 3072, 5);
                                                final SnackbarData snackbarData3 = snackbarData;
                                                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        SnackbarData.this.performAction();
                                                    }
                                                };
                                                final String str = actionLabel;
                                                ButtonKt.TextButton(function0, null, false, null, null, null, null, m1283textButtonColorsRGew2ao, null, ComposableLambdaKt.composableLambda(composer3, -929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                                        invoke(rowScope, composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(RowScope TextButton, Composer composer4, int i18) {
                                                        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                                        ComposerKt.sourceInformation(composer4, "C167@7704L17:Snackbar.kt#jmzs0o");
                                                        if ((i18 & 81) == 16 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                        } else {
                                                            TextKt.m1591TextfLXpl1I(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                        }
                                                    }
                                                }), composer3, C.ENCODING_PCM_32BIT, 382);
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    });
                                } else {
                                    i11 = i3;
                                    snackbarData2 = snackbarData;
                                    composableLambda = null;
                                }
                                composer2 = startRestartGroup;
                                m1502Snackbar7zSek6w(PaddingKt.m585padding3ABfNKs(modifier2, Dp.m4440constructorimpl(12)), composableLambda, z3, shape3, j8, j7, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i17) {
                                        ComposerKt.sourceInformation(composer3, "C175@7858L26:Snackbar.kt#jmzs0o");
                                        if ((i17 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            TextKt.m1591TextfLXpl1I(SnackbarData.this.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                        }
                                    }
                                }), composer2, i9 | (i11 & 896) | (i11 & 7168) | (i11 & i5) | (i10 & i11) | (i8 & (i11 >> 3)), 0);
                                z4 = z3;
                                shape2 = shape3;
                                j9 = j8;
                                f2 = f3;
                            } else {
                                j7 = j4;
                                i8 = 3670016;
                                i10 = i7;
                                j8 = j6;
                                f3 = Dp.m4440constructorimpl(6);
                                z3 = z2;
                                i9 = 12582912;
                            }
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
                            f3 = f2;
                            j7 = j4;
                            i8 = 3670016;
                            i9 = 12582912;
                            i10 = i7;
                            j8 = j;
                            z3 = z2;
                        }
                        shape3 = shape2;
                        startRestartGroup.endDefaults();
                        actionLabel = snackbarData.getActionLabel();
                        if (actionLabel == null) {
                        }
                        composer2 = startRestartGroup;
                        m1502Snackbar7zSek6w(PaddingKt.m585padding3ABfNKs(modifier2, Dp.m4440constructorimpl(12)), composableLambda, z3, shape3, j8, j7, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i17) {
                                ComposerKt.sourceInformation(composer3, "C175@7858L26:Snackbar.kt#jmzs0o");
                                if ((i17 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    TextKt.m1591TextfLXpl1I(SnackbarData.this.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                }
                            }
                        }), composer2, i9 | (i11 & 896) | (i11 & 7168) | (i11 & i5) | (i10 & i11) | (i8 & (i11 >> 3)), 0);
                        z4 = z3;
                        shape2 = shape3;
                        j9 = j8;
                        f2 = f3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        snackbarData2 = snackbarData;
                        composer2 = startRestartGroup;
                        z4 = z2;
                        j7 = j4;
                        j9 = j;
                    }
                    final long j11 = j5;
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    final SnackbarData snackbarData3 = snackbarData2;
                    final Modifier modifier3 = modifier2;
                    final Shape shape4 = shape2;
                    final long j12 = j7;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i17) {
                            SnackbarKt.m1503SnackbarsPrSdHI(SnackbarData.this, modifier3, z4, shape4, j9, j12, j11, f2, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i7 = 458752;
                f2 = f;
                if ((i3 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i6 != 0) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = 458752;
            f2 = f;
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i6 != 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = 458752;
        f2 = f;
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i6 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextOnlySnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(917397959);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextOnlySnackbar)236@9927L1207:Snackbar.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo61measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (measurables.size() != 1) {
                        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
                    }
                    final Placeable mo3383measureBRTryo0 = ((Measurable) CollectionsKt.first((List) measurables)).mo3383measureBRTryo0(j);
                    int i3 = mo3383measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    int i4 = mo3383measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
                    if (i3 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                    if (i4 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                    final int max = Math.max(Layout.mo330roundToPx0680j_4(i3 == i4 ? SnackbarKt.SnackbarMinHeightOneLine : SnackbarKt.SnackbarMinHeightTwoLines), mo3383measureBRTryo0.getHeight());
                    return MeasureScope.layout$default(Layout, Constraints.m4396getMaxWidthimpl(j), max, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2$measure$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, 0, (max - mo3383measureBRTryo0.getHeight()) / 2, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
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
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, snackbarKt$TextOnlySnackbar$2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-266728784);
            ComposerKt.sourceInformation(startRestartGroup, "C237@9944L202:Snackbar.kt#jmzs0o");
            Modifier m586paddingVpY3zN4 = PaddingKt.m586paddingVpY3zN4(Modifier.INSTANCE, HorizontalSpacing, SnackbarVerticalPadding);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m586paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1392363114);
            ComposerKt.sourceInformation(startRestartGroup, "C243@10127L9:Snackbar.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$3
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

            public final void invoke(Composer composer2, int i3) {
                SnackbarKt.TextOnlySnackbar(function2, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewLineButtonSnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1229075900);
        ComposerKt.sourceInformation(startRestartGroup, "C(NewLineButtonSnackbar)P(1)274@11262L476:Snackbar.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f = HorizontalSpacing;
            float f2 = HorizontalSpacingButtonSide;
            Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(fillMaxWidth$default, f, 0.0f, f2, SeparateButtonExtraY, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
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
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1163856341);
            ComposerKt.sourceInformation(startRestartGroup, "C79@3994L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1214415430);
            ComposerKt.sourceInformation(startRestartGroup, "C282@11505L171,286@11685L47:Snackbar.kt#jmzs0o");
            Modifier m589paddingqDBjuR0$default2 = PaddingKt.m589paddingqDBjuR0$default(androidx.compose.foundation.layout.AlignmentLineKt.m468paddingFromBaselineVpY3zN4(Modifier.INSTANCE, HeightToFirstLine, LongButtonVerticalOffset), 0.0f, 0.0f, f2, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m589paddingqDBjuR0$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1193033152);
            ComposerKt.sourceInformation(startRestartGroup, "C285@11668L6:Snackbar.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd());
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume7;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(localLayoutDirection3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(localViewConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl3 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-2100387721);
            ComposerKt.sourceInformation(startRestartGroup, "C286@11722L8:Snackbar.kt#jmzs0o");
            function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$NewLineButtonSnackbar$2
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

            public final void invoke(Composer composer2, int i3) {
                SnackbarKt.NewLineButtonSnackbar(function2, function22, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OneRowSnackbar(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-534813202);
        ComposerKt.sourceInformation(startRestartGroup, "C(OneRowSnackbar)P(1)297@11913L2543:Snackbar.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, HorizontalSpacing, 0.0f, HorizontalSpacingButtonSide, 0.0f, 10, null);
            final String str = "action";
            final String str2 = "text";
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo61measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> measurables, long j) {
                    float f;
                    float f2;
                    int i3;
                    float f3;
                    int max;
                    float f4;
                    MeasureScope Layout = measureScope;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    String str3 = str;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str3)) {
                            long j2 = j;
                            final Placeable mo3383measureBRTryo0 = measurable.mo3383measureBRTryo0(j2);
                            int m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(j2) - mo3383measureBRTryo0.getWidth();
                            f = SnackbarKt.TextEndExtraSpacing;
                            int coerceAtLeast = RangesKt.coerceAtLeast(m4396getMaxWidthimpl - Layout.mo330roundToPx0680j_4(f), Constraints.m4398getMinWidthimpl(j2));
                            String str4 = str2;
                            for (Measurable measurable2 : list) {
                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str4)) {
                                    final Placeable mo3383measureBRTryo02 = measurable2.mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j2, 0, coerceAtLeast, 0, 0, 9, null));
                                    int i4 = mo3383measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                                    if (i4 == Integer.MIN_VALUE) {
                                        throw new IllegalArgumentException("No baselines for text".toString());
                                    }
                                    int i5 = mo3383measureBRTryo02.get(AlignmentLineKt.getLastBaseline());
                                    if (i5 == Integer.MIN_VALUE) {
                                        throw new IllegalArgumentException("No baselines for text".toString());
                                    }
                                    int i6 = 0;
                                    boolean z = i4 == i5;
                                    final int m4396getMaxWidthimpl2 = Constraints.m4396getMaxWidthimpl(j) - mo3383measureBRTryo0.getWidth();
                                    if (z) {
                                        f4 = SnackbarKt.SnackbarMinHeightOneLine;
                                        max = Math.max(Layout.mo330roundToPx0680j_4(f4), mo3383measureBRTryo0.getHeight());
                                        i3 = (max - mo3383measureBRTryo02.getHeight()) / 2;
                                        int i7 = mo3383measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                                        if (i7 != Integer.MIN_VALUE) {
                                            i6 = (i4 + i3) - i7;
                                        }
                                    } else {
                                        f2 = SnackbarKt.HeightToFirstLine;
                                        i3 = Layout.mo330roundToPx0680j_4(f2) - i4;
                                        f3 = SnackbarKt.SnackbarMinHeightTwoLines;
                                        max = Math.max(Layout.mo330roundToPx0680j_4(f3), mo3383measureBRTryo02.getHeight() + i3);
                                        i6 = (max - mo3383measureBRTryo0.getHeight()) / 2;
                                    }
                                    final int i8 = i6;
                                    final int i9 = i3;
                                    return MeasureScope.layout$default(Layout, Constraints.m4396getMaxWidthimpl(j), max, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$measure$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope layout) {
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, i9, 0.0f, 4, null);
                                            Placeable.PlacementScope.placeRelative$default(layout, mo3383measureBRTryo0, m4396getMaxWidthimpl2, i8, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                                Layout = measureScope;
                                j2 = j;
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        Layout = measureScope;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
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
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-643033641);
            ComposerKt.sourceInformation(startRestartGroup, "C299@11943L86,300@12042L46:Snackbar.kt#jmzs0o");
            Modifier m587paddingVpY3zN4$default = PaddingKt.m587paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m587paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1616738193);
            ComposerKt.sourceInformation(startRestartGroup, "C299@12021L6:Snackbar.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "action");
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(localDensity3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume7;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(localLayoutDirection3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(localViewConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl3 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1690150342);
            ComposerKt.sourceInformation(startRestartGroup, "C300@12078L8:Snackbar.kt#jmzs0o");
            function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$3
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

            public final void invoke(Composer composer2, int i3) {
                SnackbarKt.OneRowSnackbar(function2, function22, composer2, i | 1);
            }
        });
    }

    static {
        float f = 8;
        HorizontalSpacingButtonSide = Dp.m4440constructorimpl(f);
        TextEndExtraSpacing = Dp.m4440constructorimpl(f);
    }
}
