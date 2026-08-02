package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¢\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a£\u0001\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00172\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a!\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u0014H\u0007¢\u0006\u0002\u00107\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m4440constructorimpl(16);

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1569641925);
        ComposerKt.sourceInformation(composer, "C(rememberScaffoldState)63@2263L39,64@2347L32,65@2399L62:Scaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) rememberedValue2;
        composer.endReplaceableGroup();
        return scaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ce, code lost:
    
        if (r4.changed(r57) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e8, code lost:
    
        if (r4.changed(r59) == false) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e  */
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1491Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        ScaffoldState scaffoldState2;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j6;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        boolean z3;
        CornerBasedShape cornerBasedShape;
        float m1369getElevationD9Ej5fM;
        int i20;
        long j7;
        int i21;
        int i22;
        long j8;
        int i23;
        long j9;
        long j10;
        int i24;
        int i25;
        long j11;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z4;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function35;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function36;
        Composer composer2;
        boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final int i26;
        final Shape shape2;
        final long j12;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37;
        final boolean z6;
        final ScaffoldState scaffoldState3;
        final long j13;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final float f2;
        final long j14;
        final long j15;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function38;
        final long j16;
        ScopeUpdateScope endRestartGroup;
        int i27;
        int i28;
        int i29;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1037492569);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scaffold)P(14,15,17,1,16,11,12:c#material.FabPosition,13,5,8,10,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,9:c#ui.graphics.Color,0:c#ui.graphics.Color,3:c#ui.graphics.Color)160@7052L23,169@7562L6,171@7677L6,172@7725L38,173@7810L10,174@7865L6,175@7910L32:Scaffold.kt#jmzs0o");
        int i30 = i4 & 1;
        if (i30 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i4 & 2) == 0) {
                scaffoldState2 = scaffoldState;
                if (startRestartGroup.changed(scaffoldState2)) {
                    i29 = 32;
                    i5 |= i29;
                }
            } else {
                scaffoldState2 = scaffoldState;
            }
            i29 = 16;
            i5 |= i29;
        } else {
            scaffoldState2 = scaffoldState;
        }
        int i31 = i4 & 4;
        if (i31 != 0) {
            i5 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(function2) ? 256 : 128;
            i6 = i4 & 8;
            int i32 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                function24 = function22;
                i5 |= startRestartGroup.changed(function24) ? 2048 : 1024;
                i7 = i4 & 16;
                int i33 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                    function33 = function3;
                } else {
                    function33 = function3;
                    if ((i2 & 57344) == 0) {
                        i5 |= startRestartGroup.changed(function33) ? 16384 : 8192;
                    }
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function25 = function23;
                } else {
                    function25 = function23;
                    if ((i2 & 458752) == 0) {
                        i5 |= startRestartGroup.changed(function25) ? 131072 : 65536;
                    }
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    i10 = i;
                } else {
                    i10 = i;
                    if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(i10) ? 1048576 : 524288;
                    }
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i13 = i12;
                    i5 |= startRestartGroup.changed(function32) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i14 = i4 & 512;
                    if (i14 == 0) {
                        i5 |= C.ENCODING_PCM_32BIT;
                    } else if ((i2 & 1879048192) == 0) {
                        i15 = i14;
                        i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                        if ((i3 & 14) == 0) {
                            if ((i4 & 1024) == 0 && startRestartGroup.changed(shape)) {
                                i28 = 4;
                                i16 = i3 | i28;
                            }
                            i28 = 2;
                            i16 = i3 | i28;
                        } else {
                            i16 = i3;
                        }
                        i17 = i4 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i3 & 112) == 0) {
                            i18 = i17;
                            i16 |= startRestartGroup.changed(f) ? 32 : 16;
                            if ((i3 & 896) != 0) {
                                i19 = i30;
                                j6 = j;
                                i16 |= ((i4 & 4096) == 0 && startRestartGroup.changed(j6)) ? 256 : 128;
                            } else {
                                i19 = i30;
                                j6 = j;
                            }
                            if ((i3 & 7168) == 0) {
                                if ((i4 & 8192) != 0) {
                                }
                                i32 = 1024;
                                i16 |= i32;
                            }
                            if ((i3 & 57344) == 0) {
                                if ((i4 & 16384) != 0) {
                                }
                                i33 = 8192;
                                i16 |= i33;
                            }
                            if ((i3 & 458752) == 0) {
                                i16 |= ((i4 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                            }
                            if ((i3 & 3670016) == 0) {
                                i16 |= ((i4 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                            }
                            if ((i4 & 131072) != 0) {
                                i27 = (i3 & 29360128) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                                if ((i5 & 1533916891) == 306783378 || (i16 & 23967451) != 4793490 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i19 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if ((i4 & 2) != 0) {
                                            i5 &= -113;
                                            scaffoldState2 = rememberScaffoldState(null, null, startRestartGroup, 0, 3);
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> m1350getLambda1$material_release = i31 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1350getLambda1$material_release() : function2;
                                        if (i6 != 0) {
                                            function24 = ComposableSingletons$ScaffoldKt.INSTANCE.m1351getLambda2$material_release();
                                        }
                                        if (i7 != 0) {
                                            function33 = ComposableSingletons$ScaffoldKt.INSTANCE.m1352getLambda3$material_release();
                                        }
                                        if (i8 != 0) {
                                            function25 = ComposableSingletons$ScaffoldKt.INSTANCE.m1353getLambda4$material_release();
                                        }
                                        if (i9 != 0) {
                                            i10 = FabPosition.INSTANCE.m1412getEnd5ygKITE();
                                        }
                                        boolean z7 = i11 != 0 ? false : z;
                                        function34 = i13 != 0 ? null : function32;
                                        z3 = i15 != 0 ? true : z2;
                                        Function2<? super Composer, ? super Integer, Unit> function210 = m1350getLambda1$material_release;
                                        if ((i4 & 1024) != 0) {
                                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                            i16 &= -15;
                                        } else {
                                            cornerBasedShape = shape;
                                        }
                                        int i34 = i16;
                                        m1369getElevationD9Ej5fM = i18 != 0 ? DrawerDefaults.INSTANCE.m1369getElevationD9Ej5fM() : f;
                                        if ((i4 & 4096) != 0) {
                                            j6 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                            i20 = i34 & (-897);
                                        } else {
                                            i20 = i34;
                                        }
                                        boolean z8 = z7;
                                        if ((i4 & 8192) != 0) {
                                            j7 = ColorsKt.m1342contentColorForek8zF_U(j6, startRestartGroup, (i20 >> 6) & 14);
                                            i20 &= -7169;
                                        } else {
                                            j7 = j2;
                                        }
                                        if ((i4 & 16384) != 0) {
                                            int i35 = i20;
                                            i21 = 6;
                                            j8 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                            i22 = i35 & (-57345);
                                        } else {
                                            int i36 = i20;
                                            i21 = 6;
                                            i22 = i36;
                                            j8 = j3;
                                        }
                                        int i37 = i22;
                                        if ((i4 & 32768) != 0) {
                                            j9 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i21).m1317getBackground0d7_KjU();
                                            i23 = i37 & (-458753);
                                        } else {
                                            i23 = i37;
                                            j9 = j4;
                                        }
                                        if ((i4 & 65536) != 0) {
                                            Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39 = function34;
                                            int i38 = i23 & (-3670017);
                                            i24 = i5;
                                            j10 = ColorsKt.m1342contentColorForek8zF_U(j9, startRestartGroup, (i23 >> 15) & 14);
                                            j11 = j9;
                                            i25 = i38;
                                            function26 = function210;
                                            function34 = function39;
                                        } else {
                                            j10 = j5;
                                            i24 = i5;
                                            i25 = i23;
                                            j11 = j9;
                                            function26 = function210;
                                        }
                                        z4 = z8;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 2) != 0) {
                                            i5 &= -113;
                                        }
                                        if ((i4 & 1024) != 0) {
                                            i16 &= -15;
                                        }
                                        int i39 = i16;
                                        if ((i4 & 4096) != 0) {
                                            i39 &= -897;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i39 &= -7169;
                                        }
                                        if ((i4 & 16384) != 0) {
                                            i39 &= -57345;
                                        }
                                        if ((32768 & i4) != 0) {
                                            i39 &= -458753;
                                        }
                                        if ((i4 & 65536) != 0) {
                                            i39 &= -3670017;
                                        }
                                        z4 = z;
                                        function34 = function32;
                                        z3 = z2;
                                        cornerBasedShape = shape;
                                        m1369getElevationD9Ej5fM = f;
                                        j7 = j2;
                                        j8 = j3;
                                        j11 = j4;
                                        j10 = j5;
                                        i24 = i5;
                                        i25 = i39;
                                        function26 = function2;
                                    }
                                    startRestartGroup.endDefaults();
                                    final Function2<? super Composer, ? super Integer, Unit> function211 = function26;
                                    final boolean z9 = z4;
                                    final Function2<? super Composer, ? super Integer, Unit> function212 = function24;
                                    final int i40 = i25;
                                    final ScaffoldState scaffoldState4 = scaffoldState2;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310 = function33;
                                    final Function2<? super Composer, ? super Integer, Unit> function213 = function25;
                                    final int i41 = i10;
                                    final long j17 = j11;
                                    final long j18 = j10;
                                    final int i42 = i24;
                                    function35 = function34;
                                    final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer3, Integer num) {
                                            invoke(modifier3, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Modifier childModifier, Composer composer3, int i43) {
                                            int i44;
                                            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                                            ComposerKt.sourceInformation(composer3, "C179@8062L525:Scaffold.kt#jmzs0o");
                                            if ((i43 & 14) == 0) {
                                                i44 = i43 | (composer3.changed(childModifier) ? 4 : 2);
                                            } else {
                                                i44 = i43;
                                            }
                                            if ((i44 & 91) != 18 || !composer3.getSkipping()) {
                                                long j19 = j17;
                                                long j20 = j18;
                                                final boolean z10 = z9;
                                                final int i45 = i41;
                                                final Function2<Composer, Integer, Unit> function214 = function211;
                                                final Function3<PaddingValues, Composer, Integer, Unit> function311 = content;
                                                final Function2<Composer, Integer, Unit> function215 = function213;
                                                final Function2<Composer, Integer, Unit> function216 = function212;
                                                final int i46 = i42;
                                                final int i47 = i40;
                                                final Function3<SnackbarHostState, Composer, Integer, Unit> function312 = function310;
                                                final ScaffoldState scaffoldState5 = scaffoldState4;
                                                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer3, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                                                    public final void invoke(Composer composer4, int i48) {
                                                        ComposerKt.sourceInformation(composer4, "C180@8164L413:Scaffold.kt#jmzs0o");
                                                        if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                                            boolean z11 = z10;
                                                            int i49 = i45;
                                                            Function2<Composer, Integer, Unit> function217 = function214;
                                                            Function3<PaddingValues, Composer, Integer, Unit> function313 = function311;
                                                            final Function3<SnackbarHostState, Composer, Integer, Unit> function314 = function312;
                                                            final ScaffoldState scaffoldState6 = scaffoldState5;
                                                            final int i50 = i46;
                                                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                                                public final void invoke(Composer composer5, int i51) {
                                                                    ComposerKt.sourceInformation(composer5, "C186@8417L45:Scaffold.kt#jmzs0o");
                                                                    if ((i51 & 11) == 2 && composer5.getSkipping()) {
                                                                        composer5.skipToGroupEnd();
                                                                    } else {
                                                                        function314.invoke(scaffoldState6.getSnackbarHostState(), composer5, Integer.valueOf((i50 >> 9) & 112));
                                                                    }
                                                                }
                                                            });
                                                            Function2<Composer, Integer, Unit> function218 = function215;
                                                            Function2<Composer, Integer, Unit> function219 = function216;
                                                            int i51 = i46;
                                                            ScaffoldKt.m1492ScaffoldLayoutMDYNRJg(z11, i49, function217, function313, composableLambda3, function218, function219, composer4, ((i51 >> 21) & 14) | 24576 | ((i51 >> 15) & 112) | (i51 & 896) | ((i47 >> 12) & 7168) | (458752 & i51) | ((i51 << 9) & 3670016));
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                });
                                                int i48 = 1572864 | (i44 & 14);
                                                int i49 = i40;
                                                SurfaceKt.m1520SurfaceFjzlyU(childModifier, null, j19, j20, null, 0.0f, composableLambda2, composer3, i48 | ((i49 >> 9) & 896) | ((i49 >> 9) & 7168), 50);
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    });
                                    if (function35 != null) {
                                        startRestartGroup.startReplaceableGroup(-1013848234);
                                        ComposerKt.sourceInformation(startRestartGroup, "195@8636L487");
                                        int i43 = i40 << 12;
                                        DrawerKt.m1373ModalDrawerGs3lGvM(function35, modifier2, scaffoldState4.getDrawerState(), z3, cornerBasedShape, m1369getElevationD9Ej5fM, j6, j7, j8, ComposableLambdaKt.composableLambda(startRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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

                                            public final void invoke(Composer composer3, int i44) {
                                                ComposerKt.sourceInformation(composer3, "C205@9096L15:Scaffold.kt#jmzs0o");
                                                if ((i44 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    composableLambda.invoke(Modifier.INSTANCE, composer3, 54);
                                                }
                                            }
                                        }), startRestartGroup, ((i42 >> 24) & 14) | C.ENCODING_PCM_32BIT | ((i42 << 3) & 112) | ((i42 >> 18) & 7168) | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128) | (i43 & 234881024), 0);
                                        function36 = function35;
                                        composer2 = startRestartGroup;
                                        composer2.endReplaceableGroup();
                                    } else {
                                        function36 = function35;
                                        composer2 = startRestartGroup;
                                        composer2.startReplaceableGroup(-1013847725);
                                        ComposerKt.sourceInformation(composer2, "208@9145L15");
                                        composableLambda.invoke(modifier2, composer2, Integer.valueOf((i42 & 14) | 48));
                                        composer2.endReplaceableGroup();
                                    }
                                    z5 = z9;
                                    function27 = function211;
                                    function28 = function212;
                                    i26 = i10;
                                    shape2 = cornerBasedShape;
                                    j12 = j18;
                                    function37 = function36;
                                    z6 = z3;
                                    scaffoldState3 = scaffoldState4;
                                    j13 = j6;
                                    function29 = function25;
                                    f2 = m1369getElevationD9Ej5fM;
                                    j14 = j7;
                                    j15 = j8;
                                    function38 = function310;
                                    j16 = j17;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    function27 = function2;
                                    z5 = z;
                                    function37 = function32;
                                    j14 = j2;
                                    j15 = j3;
                                    j16 = j4;
                                    j12 = j5;
                                    composer2 = startRestartGroup;
                                    function28 = function24;
                                    scaffoldState3 = scaffoldState2;
                                    i26 = i10;
                                    z6 = z2;
                                    j13 = j6;
                                    function38 = function33;
                                    function29 = function25;
                                    shape2 = shape;
                                    f2 = f;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                final Modifier modifier3 = modifier2;
                                final boolean z10 = z5;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                                    public final void invoke(Composer composer3, int i44) {
                                        ScaffoldKt.m1491Scaffold27mzLpw(Modifier.this, scaffoldState3, function27, function28, function38, function29, i26, z10, function37, z6, shape2, f2, j13, j14, j15, j16, j12, content, composer3, i2 | 1, i3, i4);
                                    }
                                });
                                return;
                            }
                            i16 |= i27;
                            if ((i5 & 1533916891) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if ((i4 & 2) != 0) {
                            }
                            if (i31 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function2102 = m1350getLambda1$material_release;
                            if ((i4 & 1024) != 0) {
                            }
                            int i342 = i16;
                            if (i18 != 0) {
                            }
                            if ((i4 & 4096) != 0) {
                            }
                            boolean z82 = z7;
                            if ((i4 & 8192) != 0) {
                            }
                            if ((i4 & 16384) != 0) {
                            }
                            int i372 = i22;
                            if ((i4 & 32768) != 0) {
                            }
                            if ((i4 & 65536) != 0) {
                            }
                            z4 = z82;
                            startRestartGroup.endDefaults();
                            final Function2<? super Composer, ? super Integer, Unit> function2112 = function26;
                            final boolean z92 = z4;
                            final Function2<? super Composer, ? super Integer, Unit> function2122 = function24;
                            final int i402 = i25;
                            final ScaffoldState scaffoldState42 = scaffoldState2;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3102 = function33;
                            final Function2<? super Composer, ? super Integer, Unit> function2132 = function25;
                            final int i412 = i10;
                            final long j172 = j11;
                            final long j182 = j10;
                            final int i422 = i24;
                            function35 = function34;
                            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier32, Composer composer3, Integer num) {
                                    invoke(modifier32, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Modifier childModifier, Composer composer3, int i432) {
                                    int i44;
                                    Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                                    ComposerKt.sourceInformation(composer3, "C179@8062L525:Scaffold.kt#jmzs0o");
                                    if ((i432 & 14) == 0) {
                                        i44 = i432 | (composer3.changed(childModifier) ? 4 : 2);
                                    } else {
                                        i44 = i432;
                                    }
                                    if ((i44 & 91) != 18 || !composer3.getSkipping()) {
                                        long j19 = j172;
                                        long j20 = j182;
                                        final boolean z102 = z92;
                                        final int i45 = i412;
                                        final Function2<? super Composer, ? super Integer, Unit> function214 = function2112;
                                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function311 = content;
                                        final Function2<? super Composer, ? super Integer, Unit> function215 = function2132;
                                        final Function2<? super Composer, ? super Integer, Unit> function216 = function2122;
                                        final int i46 = i422;
                                        final int i47 = i402;
                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function312 = function3102;
                                        final ScaffoldState scaffoldState5 = scaffoldState42;
                                        ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer3, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                                            public final void invoke(Composer composer4, int i48) {
                                                ComposerKt.sourceInformation(composer4, "C180@8164L413:Scaffold.kt#jmzs0o");
                                                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                                    boolean z11 = z102;
                                                    int i49 = i45;
                                                    Function2<Composer, Integer, Unit> function217 = function214;
                                                    Function3<PaddingValues, Composer, Integer, Unit> function313 = function311;
                                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function314 = function312;
                                                    final ScaffoldState scaffoldState6 = scaffoldState5;
                                                    final int i50 = i46;
                                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                                        public final void invoke(Composer composer5, int i51) {
                                                            ComposerKt.sourceInformation(composer5, "C186@8417L45:Scaffold.kt#jmzs0o");
                                                            if ((i51 & 11) == 2 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                            } else {
                                                                function314.invoke(scaffoldState6.getSnackbarHostState(), composer5, Integer.valueOf((i50 >> 9) & 112));
                                                            }
                                                        }
                                                    });
                                                    Function2<Composer, Integer, Unit> function218 = function215;
                                                    Function2<Composer, Integer, Unit> function219 = function216;
                                                    int i51 = i46;
                                                    ScaffoldKt.m1492ScaffoldLayoutMDYNRJg(z11, i49, function217, function313, composableLambda3, function218, function219, composer4, ((i51 >> 21) & 14) | 24576 | ((i51 >> 15) & 112) | (i51 & 896) | ((i47 >> 12) & 7168) | (458752 & i51) | ((i51 << 9) & 3670016));
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        });
                                        int i48 = 1572864 | (i44 & 14);
                                        int i49 = i402;
                                        SurfaceKt.m1520SurfaceFjzlyU(childModifier, null, j19, j20, null, 0.0f, composableLambda22, composer3, i48 | ((i49 >> 9) & 896) | ((i49 >> 9) & 7168), 50);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            });
                            if (function35 != null) {
                            }
                            z5 = z92;
                            function27 = function2112;
                            function28 = function2122;
                            i26 = i10;
                            shape2 = cornerBasedShape;
                            j12 = j182;
                            function37 = function36;
                            z6 = z3;
                            scaffoldState3 = scaffoldState42;
                            j13 = j6;
                            function29 = function25;
                            f2 = m1369getElevationD9Ej5fM;
                            j14 = j7;
                            j15 = j8;
                            function38 = function3102;
                            j16 = j172;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i18 = i17;
                        if ((i3 & 896) != 0) {
                        }
                        if ((i3 & 7168) == 0) {
                        }
                        if ((i3 & 57344) == 0) {
                        }
                        if ((i3 & 458752) == 0) {
                        }
                        if ((i3 & 3670016) == 0) {
                        }
                        if ((i4 & 131072) != 0) {
                        }
                        i16 |= i27;
                        if ((i5 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if ((i4 & 2) != 0) {
                        }
                        if (i31 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        Function2<? super Composer, ? super Integer, Unit> function21022 = m1350getLambda1$material_release;
                        if ((i4 & 1024) != 0) {
                        }
                        int i3422 = i16;
                        if (i18 != 0) {
                        }
                        if ((i4 & 4096) != 0) {
                        }
                        boolean z822 = z7;
                        if ((i4 & 8192) != 0) {
                        }
                        if ((i4 & 16384) != 0) {
                        }
                        int i3722 = i22;
                        if ((i4 & 32768) != 0) {
                        }
                        if ((i4 & 65536) != 0) {
                        }
                        z4 = z822;
                        startRestartGroup.endDefaults();
                        final Function2<? super Composer, ? super Integer, Unit> function21122 = function26;
                        final boolean z922 = z4;
                        final Function2<? super Composer, ? super Integer, Unit> function21222 = function24;
                        final int i4022 = i25;
                        final ScaffoldState scaffoldState422 = scaffoldState2;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function31022 = function33;
                        final Function2<? super Composer, ? super Integer, Unit> function21322 = function25;
                        final int i4122 = i10;
                        final long j1722 = j11;
                        final long j1822 = j10;
                        final int i4222 = i24;
                        function35 = function34;
                        final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier32, Composer composer3, Integer num) {
                                invoke(modifier32, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Modifier childModifier, Composer composer3, int i432) {
                                int i44;
                                Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                                ComposerKt.sourceInformation(composer3, "C179@8062L525:Scaffold.kt#jmzs0o");
                                if ((i432 & 14) == 0) {
                                    i44 = i432 | (composer3.changed(childModifier) ? 4 : 2);
                                } else {
                                    i44 = i432;
                                }
                                if ((i44 & 91) != 18 || !composer3.getSkipping()) {
                                    long j19 = j1722;
                                    long j20 = j1822;
                                    final boolean z102 = z922;
                                    final int i45 = i4122;
                                    final Function2<? super Composer, ? super Integer, Unit> function214 = function21122;
                                    final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function311 = content;
                                    final Function2<? super Composer, ? super Integer, Unit> function215 = function21322;
                                    final Function2<? super Composer, ? super Integer, Unit> function216 = function21222;
                                    final int i46 = i4222;
                                    final int i47 = i4022;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function312 = function31022;
                                    final ScaffoldState scaffoldState5 = scaffoldState422;
                                    ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer3, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                                        public final void invoke(Composer composer4, int i48) {
                                            ComposerKt.sourceInformation(composer4, "C180@8164L413:Scaffold.kt#jmzs0o");
                                            if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                                boolean z11 = z102;
                                                int i49 = i45;
                                                Function2<Composer, Integer, Unit> function217 = function214;
                                                Function3<PaddingValues, Composer, Integer, Unit> function313 = function311;
                                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function314 = function312;
                                                final ScaffoldState scaffoldState6 = scaffoldState5;
                                                final int i50 = i46;
                                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                                    public final void invoke(Composer composer5, int i51) {
                                                        ComposerKt.sourceInformation(composer5, "C186@8417L45:Scaffold.kt#jmzs0o");
                                                        if ((i51 & 11) == 2 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                        } else {
                                                            function314.invoke(scaffoldState6.getSnackbarHostState(), composer5, Integer.valueOf((i50 >> 9) & 112));
                                                        }
                                                    }
                                                });
                                                Function2<Composer, Integer, Unit> function218 = function215;
                                                Function2<Composer, Integer, Unit> function219 = function216;
                                                int i51 = i46;
                                                ScaffoldKt.m1492ScaffoldLayoutMDYNRJg(z11, i49, function217, function313, composableLambda3, function218, function219, composer4, ((i51 >> 21) & 14) | 24576 | ((i51 >> 15) & 112) | (i51 & 896) | ((i47 >> 12) & 7168) | (458752 & i51) | ((i51 << 9) & 3670016));
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    });
                                    int i48 = 1572864 | (i44 & 14);
                                    int i49 = i4022;
                                    SurfaceKt.m1520SurfaceFjzlyU(childModifier, null, j19, j20, null, 0.0f, composableLambda222, composer3, i48 | ((i49 >> 9) & 896) | ((i49 >> 9) & 7168), 50);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        });
                        if (function35 != null) {
                        }
                        z5 = z922;
                        function27 = function21122;
                        function28 = function21222;
                        i26 = i10;
                        shape2 = cornerBasedShape;
                        j12 = j1822;
                        function37 = function36;
                        z6 = z3;
                        scaffoldState3 = scaffoldState422;
                        j13 = j6;
                        function29 = function25;
                        f2 = m1369getElevationD9Ej5fM;
                        j14 = j7;
                        j15 = j8;
                        function38 = function31022;
                        j16 = j1722;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i15 = i14;
                    if ((i3 & 14) == 0) {
                    }
                    i17 = i4 & 2048;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    if ((i3 & 896) != 0) {
                    }
                    if ((i3 & 7168) == 0) {
                    }
                    if ((i3 & 57344) == 0) {
                    }
                    if ((i3 & 458752) == 0) {
                    }
                    if ((i3 & 3670016) == 0) {
                    }
                    if ((i4 & 131072) != 0) {
                    }
                    i16 |= i27;
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if ((i4 & 2) != 0) {
                    }
                    if (i31 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function210222 = m1350getLambda1$material_release;
                    if ((i4 & 1024) != 0) {
                    }
                    int i34222 = i16;
                    if (i18 != 0) {
                    }
                    if ((i4 & 4096) != 0) {
                    }
                    boolean z8222 = z7;
                    if ((i4 & 8192) != 0) {
                    }
                    if ((i4 & 16384) != 0) {
                    }
                    int i37222 = i22;
                    if ((i4 & 32768) != 0) {
                    }
                    if ((i4 & 65536) != 0) {
                    }
                    z4 = z8222;
                    startRestartGroup.endDefaults();
                    final Function2<? super Composer, ? super Integer, Unit> function211222 = function26;
                    final boolean z9222 = z4;
                    final Function2<? super Composer, ? super Integer, Unit> function212222 = function24;
                    final int i40222 = i25;
                    final ScaffoldState scaffoldState4222 = scaffoldState2;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310222 = function33;
                    final Function2<? super Composer, ? super Integer, Unit> function213222 = function25;
                    final int i41222 = i10;
                    final long j17222 = j11;
                    final long j18222 = j10;
                    final int i42222 = i24;
                    function35 = function34;
                    final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier32, Composer composer3, Integer num) {
                            invoke(modifier32, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Modifier childModifier, Composer composer3, int i432) {
                            int i44;
                            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                            ComposerKt.sourceInformation(composer3, "C179@8062L525:Scaffold.kt#jmzs0o");
                            if ((i432 & 14) == 0) {
                                i44 = i432 | (composer3.changed(childModifier) ? 4 : 2);
                            } else {
                                i44 = i432;
                            }
                            if ((i44 & 91) != 18 || !composer3.getSkipping()) {
                                long j19 = j17222;
                                long j20 = j18222;
                                final boolean z102 = z9222;
                                final int i45 = i41222;
                                final Function2<? super Composer, ? super Integer, Unit> function214 = function211222;
                                final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function311 = content;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function213222;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = function212222;
                                final int i46 = i42222;
                                final int i47 = i40222;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function312 = function310222;
                                final ScaffoldState scaffoldState5 = scaffoldState4222;
                                ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(composer3, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                                    public final void invoke(Composer composer4, int i48) {
                                        ComposerKt.sourceInformation(composer4, "C180@8164L413:Scaffold.kt#jmzs0o");
                                        if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                            boolean z11 = z102;
                                            int i49 = i45;
                                            Function2<Composer, Integer, Unit> function217 = function214;
                                            Function3<PaddingValues, Composer, Integer, Unit> function313 = function311;
                                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function314 = function312;
                                            final ScaffoldState scaffoldState6 = scaffoldState5;
                                            final int i50 = i46;
                                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                                public final void invoke(Composer composer5, int i51) {
                                                    ComposerKt.sourceInformation(composer5, "C186@8417L45:Scaffold.kt#jmzs0o");
                                                    if ((i51 & 11) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                    } else {
                                                        function314.invoke(scaffoldState6.getSnackbarHostState(), composer5, Integer.valueOf((i50 >> 9) & 112));
                                                    }
                                                }
                                            });
                                            Function2<Composer, Integer, Unit> function218 = function215;
                                            Function2<Composer, Integer, Unit> function219 = function216;
                                            int i51 = i46;
                                            ScaffoldKt.m1492ScaffoldLayoutMDYNRJg(z11, i49, function217, function313, composableLambda3, function218, function219, composer4, ((i51 >> 21) & 14) | 24576 | ((i51 >> 15) & 112) | (i51 & 896) | ((i47 >> 12) & 7168) | (458752 & i51) | ((i51 << 9) & 3670016));
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                int i48 = 1572864 | (i44 & 14);
                                int i49 = i40222;
                                SurfaceKt.m1520SurfaceFjzlyU(childModifier, null, j19, j20, null, 0.0f, composableLambda2222, composer3, i48 | ((i49 >> 9) & 896) | ((i49 >> 9) & 7168), 50);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    });
                    if (function35 != null) {
                    }
                    z5 = z9222;
                    function27 = function211222;
                    function28 = function212222;
                    i26 = i10;
                    shape2 = cornerBasedShape;
                    j12 = j18222;
                    function37 = function36;
                    z6 = z3;
                    scaffoldState3 = scaffoldState4222;
                    j13 = j6;
                    function29 = function25;
                    f2 = m1369getElevationD9Ej5fM;
                    j14 = j7;
                    j15 = j8;
                    function38 = function310222;
                    j16 = j17222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i13 = i12;
                i14 = i4 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                if ((i3 & 14) == 0) {
                }
                i17 = i4 & 2048;
                if (i17 != 0) {
                }
                i18 = i17;
                if ((i3 & 896) != 0) {
                }
                if ((i3 & 7168) == 0) {
                }
                if ((i3 & 57344) == 0) {
                }
                if ((i3 & 458752) == 0) {
                }
                if ((i3 & 3670016) == 0) {
                }
                if ((i4 & 131072) != 0) {
                }
                i16 |= i27;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i19 != 0) {
                }
                if ((i4 & 2) != 0) {
                }
                if (i31 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                Function2<? super Composer, ? super Integer, Unit> function2102222 = m1350getLambda1$material_release;
                if ((i4 & 1024) != 0) {
                }
                int i342222 = i16;
                if (i18 != 0) {
                }
                if ((i4 & 4096) != 0) {
                }
                boolean z82222 = z7;
                if ((i4 & 8192) != 0) {
                }
                if ((i4 & 16384) != 0) {
                }
                int i372222 = i22;
                if ((i4 & 32768) != 0) {
                }
                if ((i4 & 65536) != 0) {
                }
                z4 = z82222;
                startRestartGroup.endDefaults();
                final Function2<? super Composer, ? super Integer, Unit> function2112222 = function26;
                final boolean z92222 = z4;
                final Function2<? super Composer, ? super Integer, Unit> function2122222 = function24;
                final int i402222 = i25;
                final ScaffoldState scaffoldState42222 = scaffoldState2;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3102222 = function33;
                final Function2<? super Composer, ? super Integer, Unit> function2132222 = function25;
                final int i412222 = i10;
                final long j172222 = j11;
                final long j182222 = j10;
                final int i422222 = i24;
                function35 = function34;
                final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier32, Composer composer3, Integer num) {
                        invoke(modifier32, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Modifier childModifier, Composer composer3, int i432) {
                        int i44;
                        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        ComposerKt.sourceInformation(composer3, "C179@8062L525:Scaffold.kt#jmzs0o");
                        if ((i432 & 14) == 0) {
                            i44 = i432 | (composer3.changed(childModifier) ? 4 : 2);
                        } else {
                            i44 = i432;
                        }
                        if ((i44 & 91) != 18 || !composer3.getSkipping()) {
                            long j19 = j172222;
                            long j20 = j182222;
                            final boolean z102 = z92222;
                            final int i45 = i412222;
                            final Function2<? super Composer, ? super Integer, Unit> function214 = function2112222;
                            final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function311 = content;
                            final Function2<? super Composer, ? super Integer, Unit> function215 = function2132222;
                            final Function2<? super Composer, ? super Integer, Unit> function216 = function2122222;
                            final int i46 = i422222;
                            final int i47 = i402222;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function312 = function3102222;
                            final ScaffoldState scaffoldState5 = scaffoldState42222;
                            ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(composer3, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                                public final void invoke(Composer composer4, int i48) {
                                    ComposerKt.sourceInformation(composer4, "C180@8164L413:Scaffold.kt#jmzs0o");
                                    if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                        boolean z11 = z102;
                                        int i49 = i45;
                                        Function2<Composer, Integer, Unit> function217 = function214;
                                        Function3<PaddingValues, Composer, Integer, Unit> function313 = function311;
                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function314 = function312;
                                        final ScaffoldState scaffoldState6 = scaffoldState5;
                                        final int i50 = i46;
                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                            public final void invoke(Composer composer5, int i51) {
                                                ComposerKt.sourceInformation(composer5, "C186@8417L45:Scaffold.kt#jmzs0o");
                                                if ((i51 & 11) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                } else {
                                                    function314.invoke(scaffoldState6.getSnackbarHostState(), composer5, Integer.valueOf((i50 >> 9) & 112));
                                                }
                                            }
                                        });
                                        Function2<Composer, Integer, Unit> function218 = function215;
                                        Function2<Composer, Integer, Unit> function219 = function216;
                                        int i51 = i46;
                                        ScaffoldKt.m1492ScaffoldLayoutMDYNRJg(z11, i49, function217, function313, composableLambda3, function218, function219, composer4, ((i51 >> 21) & 14) | 24576 | ((i51 >> 15) & 112) | (i51 & 896) | ((i47 >> 12) & 7168) | (458752 & i51) | ((i51 << 9) & 3670016));
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                            int i48 = 1572864 | (i44 & 14);
                            int i49 = i402222;
                            SurfaceKt.m1520SurfaceFjzlyU(childModifier, null, j19, j20, null, 0.0f, composableLambda22222, composer3, i48 | ((i49 >> 9) & 896) | ((i49 >> 9) & 7168), 50);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                if (function35 != null) {
                }
                z5 = z92222;
                function27 = function2112222;
                function28 = function2122222;
                i26 = i10;
                shape2 = cornerBasedShape;
                j12 = j182222;
                function37 = function36;
                z6 = z3;
                scaffoldState3 = scaffoldState42222;
                j13 = j6;
                function29 = function25;
                f2 = m1369getElevationD9Ej5fM;
                j14 = j7;
                j15 = j8;
                function38 = function3102222;
                j16 = j172222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function22;
            i7 = i4 & 16;
            int i332 = 16384;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i4 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            if ((i3 & 14) == 0) {
            }
            i17 = i4 & 2048;
            if (i17 != 0) {
            }
            i18 = i17;
            if ((i3 & 896) != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            i16 |= i27;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if ((i4 & 2) != 0) {
            }
            if (i31 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            Function2<? super Composer, ? super Integer, Unit> function21022222 = m1350getLambda1$material_release;
            if ((i4 & 1024) != 0) {
            }
            int i3422222 = i16;
            if (i18 != 0) {
            }
            if ((i4 & 4096) != 0) {
            }
            boolean z822222 = z7;
            if ((i4 & 8192) != 0) {
            }
            if ((i4 & 16384) != 0) {
            }
            int i3722222 = i22;
            if ((i4 & 32768) != 0) {
            }
            if ((i4 & 65536) != 0) {
            }
            z4 = z822222;
            startRestartGroup.endDefaults();
            final Function2<? super Composer, ? super Integer, Unit> function21122222 = function26;
            final boolean z922222 = z4;
            final Function2<? super Composer, ? super Integer, Unit> function21222222 = function24;
            final int i4022222 = i25;
            final ScaffoldState scaffoldState422222 = scaffoldState2;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function31022222 = function33;
            final Function2<? super Composer, ? super Integer, Unit> function21322222 = function25;
            final int i4122222 = i10;
            final long j1722222 = j11;
            final long j1822222 = j10;
            final int i4222222 = i24;
            function35 = function34;
            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> composableLambda22222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier32, Composer composer3, Integer num) {
                    invoke(modifier32, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Modifier childModifier, Composer composer3, int i432) {
                    int i44;
                    Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                    ComposerKt.sourceInformation(composer3, "C179@8062L525:Scaffold.kt#jmzs0o");
                    if ((i432 & 14) == 0) {
                        i44 = i432 | (composer3.changed(childModifier) ? 4 : 2);
                    } else {
                        i44 = i432;
                    }
                    if ((i44 & 91) != 18 || !composer3.getSkipping()) {
                        long j19 = j1722222;
                        long j20 = j1822222;
                        final boolean z102 = z922222;
                        final int i45 = i4122222;
                        final Function2<? super Composer, ? super Integer, Unit> function214 = function21122222;
                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function311 = content;
                        final Function2<? super Composer, ? super Integer, Unit> function215 = function21322222;
                        final Function2<? super Composer, ? super Integer, Unit> function216 = function21222222;
                        final int i46 = i4222222;
                        final int i47 = i4022222;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function312 = function31022222;
                        final ScaffoldState scaffoldState5 = scaffoldState422222;
                        ComposableLambda composableLambda222222 = ComposableLambdaKt.composableLambda(composer3, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                            public final void invoke(Composer composer4, int i48) {
                                ComposerKt.sourceInformation(composer4, "C180@8164L413:Scaffold.kt#jmzs0o");
                                if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                    boolean z11 = z102;
                                    int i49 = i45;
                                    Function2<Composer, Integer, Unit> function217 = function214;
                                    Function3<PaddingValues, Composer, Integer, Unit> function313 = function311;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function314 = function312;
                                    final ScaffoldState scaffoldState6 = scaffoldState5;
                                    final int i50 = i46;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                        public final void invoke(Composer composer5, int i51) {
                                            ComposerKt.sourceInformation(composer5, "C186@8417L45:Scaffold.kt#jmzs0o");
                                            if ((i51 & 11) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                            } else {
                                                function314.invoke(scaffoldState6.getSnackbarHostState(), composer5, Integer.valueOf((i50 >> 9) & 112));
                                            }
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function218 = function215;
                                    Function2<Composer, Integer, Unit> function219 = function216;
                                    int i51 = i46;
                                    ScaffoldKt.m1492ScaffoldLayoutMDYNRJg(z11, i49, function217, function313, composableLambda3, function218, function219, composer4, ((i51 >> 21) & 14) | 24576 | ((i51 >> 15) & 112) | (i51 & 896) | ((i47 >> 12) & 7168) | (458752 & i51) | ((i51 << 9) & 3670016));
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        int i48 = 1572864 | (i44 & 14);
                        int i49 = i4022222;
                        SurfaceKt.m1520SurfaceFjzlyU(childModifier, null, j19, j20, null, 0.0f, composableLambda222222, composer3, i48 | ((i49 >> 9) & 896) | ((i49 >> 9) & 7168), 50);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            if (function35 != null) {
            }
            z5 = z922222;
            function27 = function21122222;
            function28 = function21222222;
            i26 = i10;
            shape2 = cornerBasedShape;
            j12 = j1822222;
            function37 = function36;
            z6 = z3;
            scaffoldState3 = scaffoldState422222;
            j13 = j6;
            function29 = function25;
            f2 = m1369getElevationD9Ej5fM;
            j14 = j7;
            j15 = j8;
            function38 = function31022222;
            j16 = j1722222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        int i322 = 2048;
        if (i6 == 0) {
        }
        function24 = function22;
        i7 = i4 & 16;
        int i3322 = 16384;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i4 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        if ((i3 & 14) == 0) {
        }
        i17 = i4 & 2048;
        if (i17 != 0) {
        }
        i18 = i17;
        if ((i3 & 896) != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        i16 |= i27;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if ((i4 & 2) != 0) {
        }
        if (i31 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        Function2<? super Composer, ? super Integer, Unit> function210222222 = m1350getLambda1$material_release;
        if ((i4 & 1024) != 0) {
        }
        int i34222222 = i16;
        if (i18 != 0) {
        }
        if ((i4 & 4096) != 0) {
        }
        boolean z8222222 = z7;
        if ((i4 & 8192) != 0) {
        }
        if ((i4 & 16384) != 0) {
        }
        int i37222222 = i22;
        if ((i4 & 32768) != 0) {
        }
        if ((i4 & 65536) != 0) {
        }
        z4 = z8222222;
        startRestartGroup.endDefaults();
        final Function2<? super Composer, ? super Integer, Unit> function211222222 = function26;
        final boolean z9222222 = z4;
        final Function2<? super Composer, ? super Integer, Unit> function212222222 = function24;
        final int i40222222 = i25;
        final ScaffoldState scaffoldState4222222 = scaffoldState2;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310222222 = function33;
        final Function2<? super Composer, ? super Integer, Unit> function213222222 = function25;
        final int i41222222 = i10;
        final long j17222222 = j11;
        final long j18222222 = j10;
        final int i42222222 = i24;
        function35 = function34;
        final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> composableLambda222222 = ComposableLambdaKt.composableLambda(startRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier32, Composer composer3, Integer num) {
                invoke(modifier32, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Modifier childModifier, Composer composer3, int i432) {
                int i44;
                Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                ComposerKt.sourceInformation(composer3, "C179@8062L525:Scaffold.kt#jmzs0o");
                if ((i432 & 14) == 0) {
                    i44 = i432 | (composer3.changed(childModifier) ? 4 : 2);
                } else {
                    i44 = i432;
                }
                if ((i44 & 91) != 18 || !composer3.getSkipping()) {
                    long j19 = j17222222;
                    long j20 = j18222222;
                    final boolean z102 = z9222222;
                    final int i45 = i41222222;
                    final Function2<? super Composer, ? super Integer, Unit> function214 = function211222222;
                    final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function311 = content;
                    final Function2<? super Composer, ? super Integer, Unit> function215 = function213222222;
                    final Function2<? super Composer, ? super Integer, Unit> function216 = function212222222;
                    final int i46 = i42222222;
                    final int i47 = i40222222;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function312 = function310222222;
                    final ScaffoldState scaffoldState5 = scaffoldState4222222;
                    ComposableLambda composableLambda2222222 = ComposableLambdaKt.composableLambda(composer3, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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

                        public final void invoke(Composer composer4, int i48) {
                            ComposerKt.sourceInformation(composer4, "C180@8164L413:Scaffold.kt#jmzs0o");
                            if ((i48 & 11) != 2 || !composer4.getSkipping()) {
                                boolean z11 = z102;
                                int i49 = i45;
                                Function2<Composer, Integer, Unit> function217 = function214;
                                Function3<PaddingValues, Composer, Integer, Unit> function313 = function311;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function314 = function312;
                                final ScaffoldState scaffoldState6 = scaffoldState5;
                                final int i50 = i46;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer4, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
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

                                    public final void invoke(Composer composer5, int i51) {
                                        ComposerKt.sourceInformation(composer5, "C186@8417L45:Scaffold.kt#jmzs0o");
                                        if ((i51 & 11) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                        } else {
                                            function314.invoke(scaffoldState6.getSnackbarHostState(), composer5, Integer.valueOf((i50 >> 9) & 112));
                                        }
                                    }
                                });
                                Function2<Composer, Integer, Unit> function218 = function215;
                                Function2<Composer, Integer, Unit> function219 = function216;
                                int i51 = i46;
                                ScaffoldKt.m1492ScaffoldLayoutMDYNRJg(z11, i49, function217, function313, composableLambda3, function218, function219, composer4, ((i51 >> 21) & 14) | 24576 | ((i51 >> 15) & 112) | (i51 & 896) | ((i47 >> 12) & 7168) | (458752 & i51) | ((i51 << 9) & 3670016));
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    });
                    int i48 = 1572864 | (i44 & 14);
                    int i49 = i40222222;
                    SurfaceKt.m1520SurfaceFjzlyU(childModifier, null, j19, j20, null, 0.0f, composableLambda2222222, composer3, i48 | ((i49 >> 9) & 896) | ((i49 >> 9) & 7168), 50);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        if (function35 != null) {
        }
        z5 = z9222222;
        function27 = function211222222;
        function28 = function212222222;
        i26 = i10;
        shape2 = cornerBasedShape;
        j12 = j18222222;
        function37 = function36;
        z6 = z3;
        scaffoldState3 = scaffoldState4222222;
        j13 = j6;
        function29 = function25;
        f2 = m1369getElevationD9Ej5fM;
        j14 = j7;
        j15 = j8;
        function38 = function310222222;
        j16 = j17222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m1492ScaffoldLayoutMDYNRJg(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-1401632215);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScaffoldLayout)P(4,3:c#material.FabPosition,6,1,5,2)236@10234L4498,236@10217L4515:Scaffold.kt#jmzs0o");
        int i3 = (i2 & 14) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= startRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= startRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= startRestartGroup.changed(function24) ? 1048576 : 524288;
        }
        if ((2995931 & i3) != 599186 || !startRestartGroup.getSkipping()) {
            Object[] objArr = {function2, function22, function23, FabPosition.m1404boximpl(i), Boolean.valueOf(z), function24, function3};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean z2 = false;
            for (int i4 = 0; i4 < 7; i4++) {
                z2 |= startRestartGroup.changed(objArr[i4]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final int i5 = i3;
                rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1494invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1494invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, long j) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int m4396getMaxWidthimpl = Constraints.m4396getMaxWidthimpl(j);
                        final int m4395getMaxHeightimpl = Constraints.m4395getMaxHeightimpl(j);
                        final long m4387copyZbe2FdA$default = Constraints.m4387copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function25 = function2;
                        final Function2<Composer, Integer, Unit> function26 = function22;
                        final Function2<Composer, Integer, Unit> function27 = function23;
                        final int i6 = i;
                        final boolean z3 = z;
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        final int i7 = i5;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        return MeasureScope.layout$default(SubcomposeLayout, m4396getMaxWidthimpl, m4395getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:116:0x01cc  */
                            /* JADX WARN: Removed duplicated region for block: B:47:0x01a8  */
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke2(Placeable.PlacementScope layout) {
                                Object obj;
                                Object obj2;
                                Integer num;
                                final FabPlacement fabPlacement;
                                int i8;
                                Object obj3;
                                int i9;
                                int height;
                                float f;
                                int i10;
                                int height2;
                                float f2;
                                Object obj4;
                                Object obj5;
                                int i11;
                                float f3;
                                float f4;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<Measurable> subcompose = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.TopBar, function25);
                                long j2 = m4387copyZbe2FdA$default;
                                ArrayList arrayList = new ArrayList(subcompose.size());
                                int size = subcompose.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    arrayList.add(subcompose.get(i12).mo3383measureBRTryo0(j2));
                                }
                                ArrayList arrayList2 = arrayList;
                                if (arrayList2.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = arrayList2.get(0);
                                    int height3 = ((Placeable) obj).getHeight();
                                    int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                                    if (1 <= lastIndex) {
                                        int i13 = 1;
                                        while (true) {
                                            Object obj6 = arrayList2.get(i13);
                                            int height4 = ((Placeable) obj6).getHeight();
                                            if (height3 < height4) {
                                                obj = obj6;
                                                height3 = height4;
                                            }
                                            if (i13 == lastIndex) {
                                                break;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj;
                                int height5 = placeable != null ? placeable.getHeight() : 0;
                                List<Measurable> subcompose2 = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.Snackbar, function26);
                                long j3 = m4387copyZbe2FdA$default;
                                ArrayList arrayList3 = new ArrayList(subcompose2.size());
                                int size2 = subcompose2.size();
                                for (int i14 = 0; i14 < size2; i14++) {
                                    arrayList3.add(subcompose2.get(i14).mo3383measureBRTryo0(j3));
                                }
                                ArrayList arrayList4 = arrayList3;
                                if (arrayList4.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    obj2 = arrayList4.get(0);
                                    int height6 = ((Placeable) obj2).getHeight();
                                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList4);
                                    if (1 <= lastIndex2) {
                                        int i15 = 1;
                                        while (true) {
                                            Object obj7 = arrayList4.get(i15);
                                            int height7 = ((Placeable) obj7).getHeight();
                                            if (height6 < height7) {
                                                obj2 = obj7;
                                                height6 = height7;
                                            }
                                            if (i15 == lastIndex2) {
                                                break;
                                            } else {
                                                i15++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable2 = (Placeable) obj2;
                                int height8 = placeable2 != null ? placeable2.getHeight() : 0;
                                List<Measurable> subcompose3 = SubcomposeMeasureScope.this.subcompose(ScaffoldLayoutContent.Fab, function27);
                                long j4 = m4387copyZbe2FdA$default;
                                ArrayList arrayList5 = new ArrayList();
                                Iterator<T> it = subcompose3.iterator();
                                while (it.hasNext()) {
                                    Placeable mo3383measureBRTryo0 = ((Measurable) it.next()).mo3383measureBRTryo0(j4);
                                    if (mo3383measureBRTryo0.getHeight() == 0 || mo3383measureBRTryo0.getWidth() == 0) {
                                        mo3383measureBRTryo0 = null;
                                    }
                                    if (mo3383measureBRTryo0 != null) {
                                        arrayList5.add(mo3383measureBRTryo0);
                                    }
                                }
                                ArrayList arrayList6 = arrayList5;
                                if (arrayList6.isEmpty()) {
                                    num = null;
                                    fabPlacement = null;
                                } else {
                                    if (arrayList6.isEmpty()) {
                                        obj4 = null;
                                    } else {
                                        obj4 = arrayList6.get(0);
                                        int width = ((Placeable) obj4).getWidth();
                                        int lastIndex3 = CollectionsKt.getLastIndex(arrayList6);
                                        if (1 <= lastIndex3) {
                                            int i16 = 1;
                                            while (true) {
                                                Object obj8 = arrayList6.get(i16);
                                                int width2 = ((Placeable) obj8).getWidth();
                                                if (width < width2) {
                                                    obj4 = obj8;
                                                    width = width2;
                                                }
                                                if (i16 == lastIndex3) {
                                                    break;
                                                } else {
                                                    i16++;
                                                }
                                            }
                                        }
                                    }
                                    Intrinsics.checkNotNull(obj4);
                                    int width3 = ((Placeable) obj4).getWidth();
                                    if (arrayList6.isEmpty()) {
                                        obj5 = null;
                                    } else {
                                        obj5 = arrayList6.get(0);
                                        int height9 = ((Placeable) obj5).getHeight();
                                        int lastIndex4 = CollectionsKt.getLastIndex(arrayList6);
                                        if (1 <= lastIndex4) {
                                            int i17 = 1;
                                            while (true) {
                                                Object obj9 = arrayList6.get(i17);
                                                num = null;
                                                int height10 = ((Placeable) obj9).getHeight();
                                                if (height9 < height10) {
                                                    height9 = height10;
                                                    obj5 = obj9;
                                                }
                                                if (i17 == lastIndex4) {
                                                    break;
                                                } else {
                                                    i17++;
                                                }
                                            }
                                            Intrinsics.checkNotNull(obj5);
                                            int height11 = ((Placeable) obj5).getHeight();
                                            if (!FabPosition.m1407equalsimpl0(i6, FabPosition.INSTANCE.m1412getEnd5ygKITE())) {
                                                if (SubcomposeMeasureScope.this.getLayoutDirection() == LayoutDirection.Ltr) {
                                                    int i18 = m4396getMaxWidthimpl;
                                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeMeasureScope.this;
                                                    f4 = ScaffoldKt.FabSpacing;
                                                    i11 = (i18 - subcomposeMeasureScope.mo330roundToPx0680j_4(f4)) - width3;
                                                } else {
                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeMeasureScope.this;
                                                    f3 = ScaffoldKt.FabSpacing;
                                                    i11 = subcomposeMeasureScope2.mo330roundToPx0680j_4(f3);
                                                }
                                            } else {
                                                i11 = (m4396getMaxWidthimpl - width3) / 2;
                                            }
                                            fabPlacement = new FabPlacement(z3, i11, width3, height11);
                                        }
                                    }
                                    num = null;
                                    Intrinsics.checkNotNull(obj5);
                                    int height112 = ((Placeable) obj5).getHeight();
                                    if (!FabPosition.m1407equalsimpl0(i6, FabPosition.INSTANCE.m1412getEnd5ygKITE())) {
                                    }
                                    fabPlacement = new FabPlacement(z3, i11, width3, height112);
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope3 = SubcomposeMeasureScope.this;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final Function2<Composer, Integer, Unit> function29 = function28;
                                final int i19 = i7;
                                List<Measurable> subcompose4 = subcomposeMeasureScope3.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(1529070963, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                        invoke(composer2, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i20) {
                                        ComposerKt.sourceInformation(composer2, "C285@12279L144:Scaffold.kt#jmzs0o");
                                        if ((i20 & 11) != 2 || !composer2.getSkipping()) {
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(FabPlacement.this)}, function29, composer2, ((i19 >> 15) & 112) | 8);
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                    }
                                }));
                                long j5 = m4387copyZbe2FdA$default;
                                ArrayList arrayList7 = new ArrayList(subcompose4.size());
                                int size3 = subcompose4.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    arrayList7.add(subcompose4.get(i20).mo3383measureBRTryo0(j5));
                                }
                                ArrayList arrayList8 = arrayList7;
                                if (arrayList8.isEmpty()) {
                                    obj3 = num;
                                    i8 = 0;
                                } else {
                                    i8 = 0;
                                    obj3 = arrayList8.get(0);
                                    int height12 = ((Placeable) obj3).getHeight();
                                    int lastIndex5 = CollectionsKt.getLastIndex(arrayList8);
                                    if (1 <= lastIndex5) {
                                        int i21 = 1;
                                        while (true) {
                                            Object obj10 = arrayList8.get(i21);
                                            int height13 = ((Placeable) obj10).getHeight();
                                            if (height12 < height13) {
                                                obj3 = obj10;
                                                height12 = height13;
                                            }
                                            if (i21 == lastIndex5) {
                                                break;
                                            } else {
                                                i21++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable3 = (Placeable) obj3;
                                final int height14 = placeable3 != null ? placeable3.getHeight() : i8;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope4 = SubcomposeMeasureScope.this;
                                    boolean z4 = z3;
                                    if (height14 == 0) {
                                        height = fabPlacement.getHeight();
                                        f2 = ScaffoldKt.FabSpacing;
                                        i10 = subcomposeMeasureScope4.mo330roundToPx0680j_4(f2);
                                    } else if (z4) {
                                        height2 = height14 + (fabPlacement.getHeight() / 2);
                                        num = Integer.valueOf(height2);
                                    } else {
                                        height = fabPlacement.getHeight() + height14;
                                        f = ScaffoldKt.FabSpacing;
                                        i10 = subcomposeMeasureScope4.mo330roundToPx0680j_4(f);
                                    }
                                    height2 = height + i10;
                                    num = Integer.valueOf(height2);
                                }
                                if (height8 != 0) {
                                    i9 = height8 + (num != null ? num.intValue() : height14);
                                } else {
                                    i9 = i8;
                                }
                                int i22 = m4395getMaxHeightimpl - height5;
                                SubcomposeMeasureScope subcomposeMeasureScope5 = SubcomposeMeasureScope.this;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final SubcomposeMeasureScope subcomposeMeasureScope6 = SubcomposeMeasureScope.this;
                                final Function3<PaddingValues, Composer, Integer, Unit> function33 = function32;
                                final int i23 = i7;
                                List<Measurable> subcompose5 = subcomposeMeasureScope5.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1132241596, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                        invoke(composer2, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i24) {
                                        ComposerKt.sourceInformation(composer2, "C317@13701L21:Scaffold.kt#jmzs0o");
                                        if ((i24 & 11) != 2 || !composer2.getSkipping()) {
                                            function33.invoke(PaddingKt.m582PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, SubcomposeMeasureScope.this.mo333toDpu2uoSUM(height14), 7, null), composer2, Integer.valueOf((i23 >> 6) & 112));
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                    }
                                }));
                                long j6 = m4387copyZbe2FdA$default;
                                ArrayList arrayList9 = new ArrayList(subcompose5.size());
                                int size4 = subcompose5.size();
                                int i24 = 0;
                                while (i24 < size4) {
                                    long j7 = j6;
                                    arrayList9.add(subcompose5.get(i24).mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j7, 0, 0, 0, i22, 7, null)));
                                    i24++;
                                    j6 = j7;
                                    height5 = height5;
                                }
                                int i25 = height5;
                                ArrayList arrayList10 = arrayList9;
                                int i26 = 0;
                                for (int size5 = arrayList10.size(); i26 < size5; size5 = size5) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList10.get(i26), 0, i25, 0.0f, 4, null);
                                    i26++;
                                }
                                int size6 = arrayList2.size();
                                for (int i27 = 0; i27 < size6; i27++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList2.get(i27), 0, 0, 0.0f, 4, null);
                                }
                                int i28 = m4395getMaxHeightimpl;
                                int size7 = arrayList4.size();
                                for (int i29 = 0; i29 < size7; i29++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList4.get(i29), 0, i28 - i9, 0.0f, 4, null);
                                }
                                int i30 = m4395getMaxHeightimpl;
                                int size8 = arrayList8.size();
                                for (int i31 = 0; i31 < size8; i31++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList8.get(i31), 0, i30 - height14, 0.0f, 4, null);
                                }
                                if (fabPlacement != null) {
                                    int i32 = m4395getMaxHeightimpl;
                                    int size9 = arrayList6.size();
                                    for (int i33 = 0; i33 < size9; i33++) {
                                        Placeable placeable4 = (Placeable) arrayList6.get(i33);
                                        int left = fabPlacement.getLeft();
                                        Intrinsics.checkNotNull(num);
                                        Placeable.PlacementScope.place$default(layout, placeable4, left, i32 - num.intValue(), 0.0f, 4, null);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, startRestartGroup, 0, 1);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

            public final void invoke(Composer composer2, int i6) {
                ScaffoldKt.m1492ScaffoldLayoutMDYNRJg(z, i, function2, function3, function22, function23, function24, composer2, i2 | 1);
            }
        });
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
