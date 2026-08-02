package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aq\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0087\u0001\u0010\u001f\u001a\u00020\n2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\n0!¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010!¢\u0006\u0002\b\u00172\u001e\b\u0002\u0010#\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001ae\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0080\b\u001a,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0-2\u0006\u0010.\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010/\u001a\u00020)H\u0000\u001a\u0011\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020)H\u0082\b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"AppBarHeight", "Landroidx/compose/ui/unit/Dp;", "F", "AppBarHorizontalPadding", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "TitleIconModifier", "Landroidx/compose/ui/Modifier;", "TitleInsetWithoutIcon", "AppBar", "", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", "modifier", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "AppBar-celAv9A", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "cutoutShape", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "title", "Lkotlin/Function0;", "navigationIcon", "actions", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "calculateCutoutCircleYIntercept", "", "cutoutRadius", "verticalOffset", "calculateRoundedEdgeIntercept", "Lkotlin/Pair;", "controlPointX", "radius", "square", "x", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m4440constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;
    private static final Modifier TitleIconModifier;
    private static final Modifier TitleInsetWithoutIcon;

    private static final float square(float f) {
        return f * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0052  */
    /* renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1235TopAppBarxWeB9s(final Function2<? super Composer, ? super Integer, Unit> title, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, long j, long j2, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        int i5;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        long j3;
        long j4;
        int i6;
        int i7;
        final float f2;
        int i8;
        final int i9;
        float m1231getTopAppBarElevationD9Ej5fM;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(-2087748139);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(6,4,5!1,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.unit.Dp)81@3902L6,82@3951L32,85@4047L1254:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(title) ? 4 : 2) | i;
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
                function22 = function2;
                i3 |= startRestartGroup.changed(function22) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changed(function32) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                    } else {
                        j3 = j;
                    }
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            j4 = j2;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        j4 = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        i7 = 458752;
                        f2 = f;
                    } else {
                        i7 = 458752;
                        f2 = f;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                        }
                    }
                    i8 = i3;
                    if ((i8 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function22 = null;
                            }
                            if (i5 != 0) {
                                function32 = ComposableSingletons$AppBarKt.INSTANCE.m1347getLambda1$material_release();
                            }
                            if ((i2 & 16) == 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i9 = i8 & (-57345);
                            } else {
                                i9 = i8;
                            }
                            if ((i2 & 32) != 0) {
                                j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i9 >> 12) & 14);
                                i9 &= -458753;
                            }
                            if (i6 != 0) {
                                m1231getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m1231getTopAppBarElevationD9Ej5fM();
                                modifier3 = modifier2;
                                startRestartGroup.endDefaults();
                                int i12 = i9 >> 12;
                                composer2 = startRestartGroup;
                                m1232AppBarcelAv9A(j3, j4, m1231getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier3, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope AppBar, Composer composer3, int i13) {
                                        int i14;
                                        Modifier modifier5;
                                        int i15;
                                        Modifier modifier6;
                                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                                        ComposerKt.sourceInformation(composer3, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                                        if ((i13 & 14) == 0) {
                                            i14 = i13 | (composer3.changed(AppBar) ? 4 : 2);
                                        } else {
                                            i14 = i13;
                                        }
                                        if ((i14 & 91) != 18 || !composer3.getSkipping()) {
                                            if (function22 == null) {
                                                composer3.startReplaceableGroup(-512812651);
                                                ComposerKt.sourceInformation(composer3, "94@4259L29");
                                                modifier6 = AppBarKt.TitleInsetWithoutIcon;
                                                SpacerKt.Spacer(modifier6, composer3, 6);
                                                composer3.endReplaceableGroup();
                                                i15 = 6;
                                            } else {
                                                composer3.startReplaceableGroup(-512812592);
                                                ComposerKt.sourceInformation(composer3, "96@4318L257");
                                                modifier5 = AppBarKt.TitleIconModifier;
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function2<Composer, Integer, Unit> function23 = function22;
                                                int i16 = i9;
                                                composer3.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume = composer3.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density = (Density) consume;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer3.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer3.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier5);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                composer3.disableReusing();
                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                                                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                                                composer3.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                composer3.startReplaceableGroup(-678309503);
                                                ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                composer3.startReplaceableGroup(1485618042);
                                                ComposerKt.sourceInformation(composer3, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                                                i15 = 6;
                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function23, composer3, ((i16 >> 3) & 112) | 8);
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                            }
                                            Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                            final Function2<Composer, Integer, Unit> function24 = title;
                                            final int i17 = i9;
                                            composer3.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                                            composer3.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer3.consume(localDensity2);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Density density2 = (Density) consume4;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer3.consume(localLayoutDirection2);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume6 = composer3.consume(localViewConfiguration2);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(weight$default);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor2);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composer3.disableReusing();
                                            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer3);
                                            Updater.m1649setimpl(m1642constructorimpl2, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-678309503);
                                            ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            composer3.startReplaceableGroup(159489950);
                                            ComposerKt.sourceInformation(composer3, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer3, i15).getH6(), ComposableLambdaKt.composableLambda(composer3, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                                public final void invoke(Composer composer4, int i18) {
                                                    ComposerKt.sourceInformation(composer4, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                                                    if ((i18 & 11) != 2 || !composer4.getSkipping()) {
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))}, function24, composer4, ((i17 << 3) & 112) | 8);
                                                    } else {
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }
                                            }), composer3, 48);
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, i15)))};
                                            final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                            final int i18 = i9;
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                                    ComposerKt.sourceInformation(composer4, "C117@5070L215:AppBar.kt#jmzs0o");
                                                    if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                                        Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                                        int i20 = (i18 & 7168) | 438;
                                                        composer4.startReplaceableGroup(693286680);
                                                        ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer4, 54);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume7 = composer4.consume(localDensity3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        Density density3 = (Density) consume7;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume8 = composer4.consume(localLayoutDirection3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume9 = composer4.consume(localViewConfiguration3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor3);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        composer4.disableReusing();
                                                        Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer4);
                                                        Updater.m1649setimpl(m1642constructorimpl3, rowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-678309503);
                                                        ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                                        function34.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endNode();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 56);
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, (i12 & 896) | (i12 & 14) | 1600512 | (i12 & 112) | ((i9 << 12) & i7), 0);
                                f2 = m1231getTopAppBarElevationD9Ej5fM;
                                modifier4 = modifier3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i9 = (i2 & 16) != 0 ? i8 & (-57345) : i8;
                            if ((i2 & 32) != 0) {
                                i9 &= -458753;
                            }
                        }
                        modifier3 = modifier2;
                        m1231getTopAppBarElevationD9Ej5fM = f2;
                        startRestartGroup.endDefaults();
                        int i122 = i9 >> 12;
                        composer2 = startRestartGroup;
                        m1232AppBarcelAv9A(j3, j4, m1231getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier3, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope AppBar, Composer composer3, int i13) {
                                int i14;
                                Modifier modifier5;
                                int i15;
                                Modifier modifier6;
                                Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                                ComposerKt.sourceInformation(composer3, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                                if ((i13 & 14) == 0) {
                                    i14 = i13 | (composer3.changed(AppBar) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if ((i14 & 91) != 18 || !composer3.getSkipping()) {
                                    if (function22 == null) {
                                        composer3.startReplaceableGroup(-512812651);
                                        ComposerKt.sourceInformation(composer3, "94@4259L29");
                                        modifier6 = AppBarKt.TitleInsetWithoutIcon;
                                        SpacerKt.Spacer(modifier6, composer3, 6);
                                        composer3.endReplaceableGroup();
                                        i15 = 6;
                                    } else {
                                        composer3.startReplaceableGroup(-512812592);
                                        ComposerKt.sourceInformation(composer3, "96@4318L257");
                                        modifier5 = AppBarKt.TitleIconModifier;
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function2<Composer, Integer, Unit> function23 = function22;
                                        int i16 = i9;
                                        composer3.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier5);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                                        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-678309503);
                                        ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(1485618042);
                                        ComposerKt.sourceInformation(composer3, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                                        i15 = 6;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function23, composer3, ((i16 >> 3) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                    }
                                    Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                    final Function2<? super Composer, ? super Integer, Unit> function24 = title;
                                    final int i17 = i9;
                                    composer3.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer3.consume(localDensity2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density2 = (Density) consume4;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer3.consume(localLayoutDirection2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume6 = composer3.consume(localViewConfiguration2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(weight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer3);
                                    Updater.m1649setimpl(m1642constructorimpl2, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(159489950);
                                    ComposerKt.sourceInformation(composer3, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer3, i15).getH6(), ComposableLambdaKt.composableLambda(composer3, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                        public final void invoke(Composer composer4, int i18) {
                                            ComposerKt.sourceInformation(composer4, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                                            if ((i18 & 11) != 2 || !composer4.getSkipping()) {
                                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))}, function24, composer4, ((i17 << 3) & 112) | 8);
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                        }
                                    }), composer3, 48);
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, i15)))};
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                    final int i18 = i9;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                            ComposerKt.sourceInformation(composer4, "C117@5070L215:AppBar.kt#jmzs0o");
                                            if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                                Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                                Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                                int i20 = (i18 & 7168) | 438;
                                                composer4.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer4, 54);
                                                composer4.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume7 = composer4.consume(localDensity3);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Density density3 = (Density) consume7;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume8 = composer4.consume(localLayoutDirection3);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume9 = composer4.consume(localViewConfiguration3);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                composer4.disableReusing();
                                                Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer4);
                                                Updater.m1649setimpl(m1642constructorimpl3, rowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-678309503);
                                                ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                                function34.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 56);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, (i122 & 896) | (i122 & 14) | 1600512 | (i122 & 112) | ((i9 << 12) & i7), 0);
                        f2 = m1231getTopAppBarElevationD9Ej5fM;
                        modifier4 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier4 = modifier2;
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                    final long j5 = j3;
                    final long j6 = j4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
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
                            AppBarKt.m1235TopAppBarxWeB9s(title, modifier4, function23, function33, j5, j6, f2, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                function32 = function3;
                if ((57344 & i) != 0) {
                }
                if ((i & 458752) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i8 = i3;
                if ((i8 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                modifier3 = modifier2;
                m1231getTopAppBarElevationD9Ej5fM = f2;
                startRestartGroup.endDefaults();
                int i1222 = i9 >> 12;
                composer2 = startRestartGroup;
                m1232AppBarcelAv9A(j3, j4, m1231getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier3, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope AppBar, Composer composer3, int i13) {
                        int i14;
                        Modifier modifier5;
                        int i15;
                        Modifier modifier6;
                        Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                        ComposerKt.sourceInformation(composer3, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                        if ((i13 & 14) == 0) {
                            i14 = i13 | (composer3.changed(AppBar) ? 4 : 2);
                        } else {
                            i14 = i13;
                        }
                        if ((i14 & 91) != 18 || !composer3.getSkipping()) {
                            if (function22 == null) {
                                composer3.startReplaceableGroup(-512812651);
                                ComposerKt.sourceInformation(composer3, "94@4259L29");
                                modifier6 = AppBarKt.TitleInsetWithoutIcon;
                                SpacerKt.Spacer(modifier6, composer3, 6);
                                composer3.endReplaceableGroup();
                                i15 = 6;
                            } else {
                                composer3.startReplaceableGroup(-512812592);
                                ComposerKt.sourceInformation(composer3, "96@4318L257");
                                modifier5 = AppBarKt.TitleIconModifier;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function232 = function22;
                                int i16 = i9;
                                composer3.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier5);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(1485618042);
                                ComposerKt.sourceInformation(composer3, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                                i15 = 6;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function232, composer3, ((i16 >> 3) & 112) | 8);
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                            Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            final Function2<? super Composer, ? super Integer, Unit> function24 = title;
                            final int i17 = i9;
                            composer3.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density2 = (Density) consume4;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(localLayoutDirection2);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume6 = composer3.consume(localViewConfiguration2);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(weight$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer3);
                            Updater.m1649setimpl(m1642constructorimpl2, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-678309503);
                            ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(159489950);
                            ComposerKt.sourceInformation(composer3, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer3, i15).getH6(), ComposableLambdaKt.composableLambda(composer3, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                                public final void invoke(Composer composer4, int i18) {
                                    ComposerKt.sourceInformation(composer4, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                                    if ((i18 & 11) != 2 || !composer4.getSkipping()) {
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))}, function24, composer4, ((i17 << 3) & 112) | 8);
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                }
                            }), composer3, 48);
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, i15)))};
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332 = function32;
                            final int i18 = i9;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                    ComposerKt.sourceInformation(composer4, "C117@5070L215:AppBar.kt#jmzs0o");
                                    if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function34 = function332;
                                        int i20 = (i18 & 7168) | 438;
                                        composer4.startReplaceableGroup(693286680);
                                        ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer4, 54);
                                        composer4.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume7 = composer4.consume(localDensity3);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        Density density3 = (Density) consume7;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume8 = composer4.consume(localLayoutDirection3);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume9 = composer4.consume(localViewConfiguration3);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor3);
                                        } else {
                                            composer4.useNode();
                                        }
                                        composer4.disableReusing();
                                        Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer4);
                                        Updater.m1649setimpl(m1642constructorimpl3, rowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-678309503);
                                        ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                        function34.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 56);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, (i1222 & 896) | (i1222 & 14) | 1600512 | (i1222 & 112) | ((i9 << 12) & i7), 0);
                f2 = m1231getTopAppBarElevationD9Ej5fM;
                modifier4 = modifier3;
                final Function2<? super Composer, ? super Integer, Unit> function232 = function22;
                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function332 = function32;
                final long j52 = j3;
                final long j62 = j4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function22 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((57344 & i) != 0) {
            }
            if ((i & 458752) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i8 = i3;
            if ((i8 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            modifier3 = modifier2;
            m1231getTopAppBarElevationD9Ej5fM = f2;
            startRestartGroup.endDefaults();
            int i12222 = i9 >> 12;
            composer2 = startRestartGroup;
            m1232AppBarcelAv9A(j3, j4, m1231getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier3, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope AppBar, Composer composer3, int i13) {
                    int i14;
                    Modifier modifier5;
                    int i15;
                    Modifier modifier6;
                    Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                    ComposerKt.sourceInformation(composer3, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                    if ((i13 & 14) == 0) {
                        i14 = i13 | (composer3.changed(AppBar) ? 4 : 2);
                    } else {
                        i14 = i13;
                    }
                    if ((i14 & 91) != 18 || !composer3.getSkipping()) {
                        if (function22 == null) {
                            composer3.startReplaceableGroup(-512812651);
                            ComposerKt.sourceInformation(composer3, "94@4259L29");
                            modifier6 = AppBarKt.TitleInsetWithoutIcon;
                            SpacerKt.Spacer(modifier6, composer3, 6);
                            composer3.endReplaceableGroup();
                            i15 = 6;
                        } else {
                            composer3.startReplaceableGroup(-512812592);
                            ComposerKt.sourceInformation(composer3, "96@4318L257");
                            modifier5 = AppBarKt.TitleIconModifier;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2322 = function22;
                            int i16 = i9;
                            composer3.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier5);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-678309503);
                            ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(1485618042);
                            ComposerKt.sourceInformation(composer3, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                            i15 = 6;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function2322, composer3, ((i16 >> 3) & 112) | 8);
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                        }
                        Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        final Function2<? super Composer, ? super Integer, Unit> function24 = title;
                        final int i17 = i9;
                        composer3.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density2 = (Density) consume4;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume6 = composer3.consume(localViewConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(weight$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer3);
                        Updater.m1649setimpl(m1642constructorimpl2, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-678309503);
                        ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(159489950);
                        ComposerKt.sourceInformation(composer3, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer3, i15).getH6(), ComposableLambdaKt.composableLambda(composer3, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                            public final void invoke(Composer composer4, int i18) {
                                ComposerKt.sourceInformation(composer4, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                                if ((i18 & 11) != 2 || !composer4.getSkipping()) {
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))}, function24, composer4, ((i17 << 3) & 112) | 8);
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                            }
                        }), composer3, 48);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, i15)))};
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3322 = function32;
                        final int i18 = i9;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                                ComposerKt.sourceInformation(composer4, "C117@5070L215:AppBar.kt#jmzs0o");
                                if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                    Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function34 = function3322;
                                    int i20 = (i18 & 7168) | 438;
                                    composer4.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer4, 54);
                                    composer4.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume7 = composer4.consume(localDensity3);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    Density density3 = (Density) consume7;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume8 = composer4.consume(localLayoutDirection3);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume9 = composer4.consume(localViewConfiguration3);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor3);
                                    } else {
                                        composer4.useNode();
                                    }
                                    composer4.disableReusing();
                                    Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer4);
                                    Updater.m1649setimpl(m1642constructorimpl3, rowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                                    composer4.enableReusing();
                                    materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                    function34.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 56);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i12222 & 896) | (i12222 & 14) | 1600512 | (i12222 & 112) | ((i9 << 12) & i7), 0);
            f2 = m1231getTopAppBarElevationD9Ej5fM;
            modifier4 = modifier3;
            final Function2<? super Composer, ? super Integer, Unit> function2322 = function22;
            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3322 = function32;
            final long j522 = j3;
            final long j622 = j4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((57344 & i) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i8 = i3;
        if ((i8 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        modifier3 = modifier2;
        m1231getTopAppBarElevationD9Ej5fM = f2;
        startRestartGroup.endDefaults();
        int i122222 = i9 >> 12;
        composer2 = startRestartGroup;
        m1232AppBarcelAv9A(j3, j4, m1231getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier3, ComposableLambdaKt.composableLambda(startRestartGroup, -1484077694, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope AppBar, Composer composer3, int i13) {
                int i14;
                Modifier modifier5;
                int i15;
                Modifier modifier6;
                Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
                ComposerKt.sourceInformation(composer3, "C104@4595L378,116@5048L6,116@4983L312:AppBar.kt#jmzs0o");
                if ((i13 & 14) == 0) {
                    i14 = i13 | (composer3.changed(AppBar) ? 4 : 2);
                } else {
                    i14 = i13;
                }
                if ((i14 & 91) != 18 || !composer3.getSkipping()) {
                    if (function22 == null) {
                        composer3.startReplaceableGroup(-512812651);
                        ComposerKt.sourceInformation(composer3, "94@4259L29");
                        modifier6 = AppBarKt.TitleInsetWithoutIcon;
                        SpacerKt.Spacer(modifier6, composer3, 6);
                        composer3.endReplaceableGroup();
                        i15 = 6;
                    } else {
                        composer3.startReplaceableGroup(-512812592);
                        ComposerKt.sourceInformation(composer3, "96@4318L257");
                        modifier5 = AppBarKt.TitleIconModifier;
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function23222 = function22;
                        int i16 = i9;
                        composer3.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier5);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-678309503);
                        ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(1485618042);
                        ComposerKt.sourceInformation(composer3, "C98@4493L4,97@4407L154:AppBar.kt#jmzs0o");
                        i15 = 6;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6)))}, function23222, composer3, ((i16 >> 3) & 112) | 8);
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                    }
                    Modifier weight$default = RowScope.weight$default(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    final Function2<? super Composer, ? super Integer, Unit> function24 = title;
                    final int i17 = i9;
                    composer3.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density2 = (Density) consume4;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer3.consume(localLayoutDirection2);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume6 = composer3.consume(localViewConfiguration2);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(weight$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer m1642constructorimpl2 = Updater.m1642constructorimpl(composer3);
                    Updater.m1649setimpl(m1642constructorimpl2, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-678309503);
                    ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(159489950);
                    ComposerKt.sourceInformation(composer3, "C108@4771L10,108@4732L231:AppBar.kt#jmzs0o");
                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer3, i15).getH6(), ComposableLambdaKt.composableLambda(composer3, -2021518195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
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

                        public final void invoke(Composer composer4, int i18) {
                            ComposerKt.sourceInformation(composer4, "C110@4890L4,109@4804L145:AppBar.kt#jmzs0o");
                            if ((i18 & 11) != 2 || !composer4.getSkipping()) {
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))}, function24, composer4, ((i17 << 3) & 112) | 8);
                            } else {
                                composer4.skipToGroupEnd();
                            }
                        }
                    }), composer3, 48);
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, i15)))};
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33222 = function32;
                    final int i18 = i9;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1157662914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
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
                            ComposerKt.sourceInformation(composer4, "C117@5070L215:AppBar.kt#jmzs0o");
                            if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function34 = function33222;
                                int i20 = (i18 & 7168) | 438;
                                composer4.startReplaceableGroup(693286680);
                                ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer4, 54);
                                composer4.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume7 = composer4.consume(localDensity3);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                Density density3 = (Density) consume7;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume8 = composer4.consume(localLayoutDirection3);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume9 = composer4.consume(localViewConfiguration3);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(fillMaxHeight$default);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer4.useNode();
                                }
                                composer4.disableReusing();
                                Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer4);
                                Updater.m1649setimpl(m1642constructorimpl3, rowMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
                                composer4.enableReusing();
                                materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(-678309503);
                                ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                function34.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 56);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i122222 & 896) | (i122222 & 14) | 1600512 | (i122222 & 112) | ((i9 << 12) & i7), 0);
        f2 = m1231getTopAppBarElevationD9Ej5fM;
        modifier4 = modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23222 = function22;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33222 = function32;
        final long j5222 = j3;
        final long j6222 = j4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008e  */
    /* renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1234TopAppBarHsRjFd4(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        Modifier modifier3;
        PaddingValues contentPadding;
        int i6;
        long j5;
        long j6;
        float f3;
        final float f4;
        final PaddingValues paddingValues3;
        final long j7;
        final long j8;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1897058582);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(5,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3)156@6973L6,157@7022L32,162@7231L182:AppBar.kt#jmzs0o");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                f2 = AppBarDefaults.INSTANCE.m1231getTopAppBarElevationD9Ej5fM();
                            }
                            if (i4 == 0) {
                                modifier3 = companion;
                                long j9 = j4;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                i6 = i3;
                                j5 = j3;
                                j6 = j9;
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                int i11 = i6;
                                int i12 = i11 >> 3;
                                m1232AppBarcelAv9A(j5, j6, f3, contentPadding, RectangleShapeKt.getRectangleShape(), modifier3, content, startRestartGroup, ((i11 << 3) & 3670016) | (i12 & 7168) | (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | ((i11 << 15) & 458752), 0);
                                f4 = f3;
                                Modifier modifier4 = modifier3;
                                paddingValues3 = contentPadding;
                                j7 = j6;
                                j8 = j5;
                                modifier2 = modifier4;
                            } else {
                                modifier3 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            modifier3 = modifier2;
                        }
                        j5 = j3;
                        f3 = f2;
                        i6 = i3;
                        j6 = j4;
                        contentPadding = paddingValues2;
                        startRestartGroup.endDefaults();
                        int i112 = i6;
                        int i122 = i112 >> 3;
                        m1232AppBarcelAv9A(j5, j6, f3, contentPadding, RectangleShapeKt.getRectangleShape(), modifier3, content, startRestartGroup, ((i112 << 3) & 3670016) | (i122 & 7168) | (i122 & 14) | 24576 | (i122 & 112) | (i122 & 896) | ((i112 << 15) & 458752), 0);
                        f4 = f3;
                        Modifier modifier42 = modifier3;
                        paddingValues3 = contentPadding;
                        j7 = j6;
                        j8 = j5;
                        modifier2 = modifier42;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j8 = j3;
                        j7 = j4;
                        f4 = f2;
                        paddingValues3 = paddingValues2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$3
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

                        public final void invoke(Composer composer2, int i13) {
                            AppBarKt.m1234TopAppBarHsRjFd4(Modifier.this, j8, j7, f4, paddingValues3, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 == 0) {
                }
            }
            paddingValues2 = paddingValues;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 == 0) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008e  */
    /* renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1233BottomAppBarY1yfwus(Modifier modifier, long j, long j2, Shape shape, float f, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        Shape shape2;
        int i4;
        float f2;
        int i5;
        int i6;
        PaddingValues paddingValues2;
        Modifier modifier2;
        PaddingValues contentPadding;
        int i7;
        long j5;
        long j6;
        float f3;
        Shape shape3;
        BottomAppBarCutoutShape rectangleShape;
        final PaddingValues paddingValues3;
        final Shape shape4;
        final float f4;
        final long j7;
        final long j8;
        final Modifier modifier3;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1651948973);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(6,0:c#ui.graphics.Color,2:c#ui.graphics.Color,4,5:c#ui.unit.Dp,3)216@9902L6,217@9951L32,223@10232L7,229@10422L152:AppBar.kt#jmzs0o");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                j3 = j;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i9 = 256;
                    i3 |= i9;
                }
            } else {
                j4 = j2;
            }
            i9 = 128;
            i3 |= i9;
        } else {
            j4 = j2;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i6 = 458752;
                    paddingValues2 = paddingValues;
                } else {
                    i6 = 458752;
                    paddingValues2 = paddingValues;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) == 0) {
                    i8 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i12 != 0) {
                                shape2 = null;
                            }
                            if (i4 != 0) {
                                f2 = AppBarDefaults.INSTANCE.m1230getBottomAppBarElevationD9Ej5fM();
                            }
                            if (i5 == 0) {
                                modifier2 = companion;
                                long j9 = j4;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                i7 = i3;
                                j5 = j3;
                                j6 = j9;
                                f3 = f2;
                                shape3 = shape2;
                                startRestartGroup.endDefaults();
                                ProvidableCompositionLocal<FabPlacement> localFabPlacement = ScaffoldKt.getLocalFabPlacement();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localFabPlacement);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                FabPlacement fabPlacement = (FabPlacement) consume;
                                if (shape3 == null && fabPlacement != null && fabPlacement.getIsDocked()) {
                                    rectangleShape = new BottomAppBarCutoutShape(shape3, fabPlacement);
                                } else {
                                    rectangleShape = RectangleShapeKt.getRectangleShape();
                                }
                                int i13 = i7 >> 6;
                                m1232AppBarcelAv9A(j5, j6, f3, contentPadding, rectangleShape, modifier2, content, startRestartGroup, ((i7 >> 3) & 126) | (i13 & 896) | (i13 & 7168) | ((i7 << 15) & i6) | (i7 & 3670016), 0);
                                paddingValues3 = contentPadding;
                                shape4 = shape3;
                                Modifier modifier4 = modifier2;
                                f4 = f3;
                                j7 = j6;
                                j8 = j5;
                                modifier3 = modifier4;
                            } else {
                                modifier2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            modifier2 = modifier;
                        }
                        j5 = j3;
                        f3 = f2;
                        shape3 = shape2;
                        i7 = i3;
                        j6 = j4;
                        contentPadding = paddingValues2;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<FabPlacement> localFabPlacement2 = ScaffoldKt.getLocalFabPlacement();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localFabPlacement2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        FabPlacement fabPlacement2 = (FabPlacement) consume2;
                        if (shape3 == null) {
                        }
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                        int i132 = i7 >> 6;
                        m1232AppBarcelAv9A(j5, j6, f3, contentPadding, rectangleShape, modifier2, content, startRestartGroup, ((i7 >> 3) & 126) | (i132 & 896) | (i132 & 7168) | ((i7 << 15) & i6) | (i7 & 3670016), 0);
                        paddingValues3 = contentPadding;
                        shape4 = shape3;
                        Modifier modifier42 = modifier2;
                        f4 = f3;
                        j7 = j6;
                        j8 = j5;
                        modifier3 = modifier42;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j8 = j3;
                        j7 = j4;
                        shape4 = shape2;
                        f4 = f2;
                        paddingValues3 = paddingValues2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$BottomAppBar$1
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

                        public final void invoke(Composer composer2, int i14) {
                            AppBarKt.m1233BottomAppBarY1yfwus(Modifier.this, j8, j7, shape4, f4, paddingValues3, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i8;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i8;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
        }
        shape2 = shape;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i8;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
    }

    public static final float calculateCutoutCircleYIntercept(float f, float f2) {
        return -((float) Math.sqrt((f * f) - (f2 * f2)));
    }

    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float f, float f2, float f3) {
        Float valueOf;
        Float valueOf2;
        Pair pair;
        Float valueOf3;
        Float valueOf4;
        float f4 = f2 * f2;
        float f5 = f3 * f3;
        float f6 = (f * f) + f4;
        float f7 = f4 * f5 * (f6 - f5);
        float f8 = f * f5;
        double d = f7;
        float sqrt = (f8 - ((float) Math.sqrt(d))) / f6;
        float sqrt2 = (f8 + ((float) Math.sqrt(d))) / f6;
        float sqrt3 = (float) Math.sqrt(f5 - (sqrt * sqrt));
        float sqrt4 = (float) Math.sqrt(f5 - (sqrt2 * sqrt2));
        if (f2 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = Float.valueOf(sqrt);
                valueOf4 = Float.valueOf(sqrt3);
            } else {
                valueOf3 = Float.valueOf(sqrt2);
                valueOf4 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.to(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = Float.valueOf(sqrt);
                valueOf2 = Float.valueOf(sqrt3);
            } else {
                valueOf = Float.valueOf(sqrt2);
                valueOf2 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.to(valueOf, valueOf2);
        }
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        if (floatValue < f) {
            floatValue2 = -floatValue2;
        }
        return TuplesKt.to(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* renamed from: AppBar-celAv9A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1232AppBarcelAv9A(final long j, final long j2, final float f, final PaddingValues paddingValues, final Shape shape, Modifier modifier, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        long j3;
        final int i3;
        long j4;
        float f2;
        Shape shape2;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1249680788);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppBar)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,3,6,5)513@22344L583:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 14) == 0) {
                i3 = (startRestartGroup.changed(j3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j4 = j2;
        } else {
            j4 = j2;
            if ((i & 112) == 0) {
                i3 |= startRestartGroup.changed(j4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            shape2 = shape;
        } else {
            shape2 = shape;
            if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
            }
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & 458752) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                i3 |= startRestartGroup.changed(function3) ? 1048576 : 524288;
            }
            if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                int i5 = i3 << 6;
                composer2 = startRestartGroup;
                SurfaceKt.m1520SurfaceFjzlyU(modifier2, shape2, j3, j4, null, f2, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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

                    public final void invoke(Composer composer3, int i6) {
                        ComposerKt.sourceInformation(composer3, "C520@22586L6,520@22521L400:AppBar.kt#jmzs0o");
                        if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)))};
                            final PaddingValues paddingValues2 = PaddingValues.this;
                            final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            final int i7 = i3;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                                public final void invoke(Composer composer4, int i8) {
                                    float f3;
                                    ComposerKt.sourceInformation(composer4, "C521@22608L303:AppBar.kt#jmzs0o");
                                    if ((i8 & 11) != 2 || !composer4.getSkipping()) {
                                        Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingValues.this);
                                        f3 = AppBarKt.AppBarHeight;
                                        Modifier m620height3ABfNKs = SizeKt.m620height3ABfNKs(padding, f3);
                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                        int i9 = ((i7 >> 9) & 7168) | 432;
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
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m620height3ABfNKs);
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
                                        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-678309503);
                                        ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                        function33.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i9 >> 6) & 112) | 6));
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 56);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i5 & 896) | (i5 & 7168) | ((i3 << 9) & 458752), 16);
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            final Modifier modifier3 = modifier2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
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

                public final void invoke(Composer composer3, int i6) {
                    AppBarKt.m1232AppBarcelAv9A(j, j2, f, paddingValues, shape, modifier3, function3, composer3, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 64) == 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        if (i4 != 0) {
        }
        int i52 = i3 << 6;
        composer2 = startRestartGroup;
        SurfaceKt.m1520SurfaceFjzlyU(modifier2, shape2, j3, j4, null, f2, ComposableLambdaKt.composableLambda(startRestartGroup, -1027830352, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
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

            public final void invoke(Composer composer3, int i6) {
                ComposerKt.sourceInformation(composer3, "C520@22586L6,520@22521L400:AppBar.kt#jmzs0o");
                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)))};
                    final PaddingValues paddingValues2 = PaddingValues.this;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                    final int i7 = i3;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer3, 1296061040, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
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

                        public final void invoke(Composer composer4, int i8) {
                            float f3;
                            ComposerKt.sourceInformation(composer4, "C521@22608L303:AppBar.kt#jmzs0o");
                            if ((i8 & 11) != 2 || !composer4.getSkipping()) {
                                Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingValues.this);
                                f3 = AppBarKt.AppBarHeight;
                                Modifier m620height3ABfNKs = SizeKt.m620height3ABfNKs(padding, f3);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                int i9 = ((i7 >> 9) & 7168) | 432;
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
                                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m620height3ABfNKs);
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
                                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
                                composer4.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                composer4.startReplaceableGroup(-678309503);
                                ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                function33.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i9 >> 6) & 112) | 6));
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 56);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, ((i3 >> 15) & 14) | 1572864 | ((i3 >> 9) & 112) | (i52 & 896) | (i52 & 7168) | ((i3 << 9) & 458752), 16);
        final Modifier modifier32 = modifier2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 4;
        float m4440constructorimpl = Dp.m4440constructorimpl(f);
        AppBarHorizontalPadding = m4440constructorimpl;
        TitleInsetWithoutIcon = SizeKt.m639width3ABfNKs(Modifier.INSTANCE, Dp.m4440constructorimpl(Dp.m4440constructorimpl(16) - m4440constructorimpl));
        TitleIconModifier = SizeKt.m639width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4440constructorimpl(Dp.m4440constructorimpl(72) - m4440constructorimpl));
        BottomAppBarCutoutOffset = Dp.m4440constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m4440constructorimpl(f);
    }
}
