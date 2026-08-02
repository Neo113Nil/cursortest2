package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¢\u0001\u0010\u0000\u001a\u00020\u00012\u000e\b\b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0013\b\b\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0015\b\b\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\b\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\b\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0081\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u000e\b\b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0013\b\b\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0015\b\b\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\b\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0081\b¢\u0006\u0004\b\u0015\u0010\u0016\u001ax\u0010\u0017\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0002\u0010\u001c\u001a2\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\"\u0010#\"\u000e\u0010$\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(\"\u0010\u0010)\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(\"\u0010\u0010*\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(¨\u0006+"}, d2 = {"AlertDialogImpl", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialogImpl-0nD-MI0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;I)V", "buttons", "AlertDialogImpl-SxpAMN0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;I)V", "AlertDialogContent", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogBaselineLayout", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogFlowRow", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TitlePadding", "TextPadding", "TitleBaselineDistanceFromTop", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextBaselineDistanceFromTitle", "TextBaselineDistanceFromTop", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final Modifier TextPadding;
    private static final Modifier TitlePadding;
    private static final long TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
    private static final long TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
    private static final long TextBaselineDistanceFromTop = TextUnitKt.getSp(38);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogBaselineLayout$lambda$7(ColumnScope columnScope, Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        AlertDialogBaselineLayout(columnScope, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogContent_WMdw5o4$lambda$0(Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Shape shape, long j, long j2, int i, int i2, Composer composer, int i3) {
        m2167AlertDialogContentWMdw5o4(function2, modifier, function22, function23, shape, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertDialogFlowRow_ixp7dh8$lambda$9(float f, float f2, Function2 function2, int i, Composer composer, int i2) {
        m2168AlertDialogFlowRowixp7dh8(f, f2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: AlertDialogImpl-0nD-MI0, reason: not valid java name */
    public static final void m2169AlertDialogImpl0nDMI0(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1483448977, "CC(AlertDialogImpl)N(onDismissRequest,confirmButton,modifier,dismissButton,title,text,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,properties)149@6875L386,147@6799L678:AlertDialog.kt#jmzs0o");
        int i2 = i >> 3;
        AndroidAlertDialog_androidKt.m2177AlertDialogwqdebIU(function0, ComposableLambdaKt.rememberComposableLambda(-309297447, true, new AlertDialogKt$AlertDialogImpl$1(function22, function2), composer, 54), modifier, function23, function24, shape, j, j2, dialogProperties, composer, (i & 14) | 48 | (i & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (i2 & 234881024), 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: AlertDialogImpl-SxpAMN0, reason: not valid java name */
    public static final void m2170AlertDialogImplSxpAMN0(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -214309806, "CC(AlertDialogImpl)N(onDismissRequest,buttons,modifier,title,text,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,properties)180@7953L276,180@7884L345:AlertDialog.kt#jmzs0o");
        AndroidDialog_androidKt.Dialog(function0, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-488319269, true, new AlertDialogKt$AlertDialogImpl$2(function2, modifier, function22, function23, shape, j, j2), composer, 54), composer, (i & 14) | 384 | ((i >> 21) & 112), 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:
    
        if ((r34 & 64) != 0) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b2  */
    /* renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2167AlertDialogContentWMdw5o4(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        long j3;
        int i6;
        long j4;
        int i7;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Shape shape3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1945098332);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogContent)N(buttons,modifier,title,text,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color)207@8749L1016,202@8612L1153:AlertDialog.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function24 = function22;
                i3 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function25 = function23;
                    i3 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
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
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            j3 = j;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        j3 = j;
                    }
                    if ((i & 1572864) != 0) {
                        i6 = 1572864;
                        if ((i2 & 64) == 0) {
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            j4 = j2;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    } else {
                        i6 = 1572864;
                        j4 = j2;
                    }
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i7 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        function26 = function24;
                        function27 = function25;
                        shape3 = shape2;
                        j5 = j3;
                        j6 = j4;
                    } else {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "198@8470L6,199@8528L6,200@8570L32");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function24 = null;
                            }
                            if (i5 != 0) {
                                function25 = null;
                            }
                            if ((i2 & 16) != 0) {
                                i8 = i7 & (-57345);
                                shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                            } else {
                                i8 = i7;
                            }
                            if ((i2 & 32) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2277getSurface0d7_KjU();
                                i7 = i8 & (-458753);
                            } else {
                                i7 = i8;
                            }
                            if ((i2 & 64) != 0) {
                                j4 = ColorsKt.m2291contentColorForek8zF_U(j3, startRestartGroup, (i7 >> 15) & 14);
                                i7 &= -3670017;
                            }
                            int i13 = i7;
                            long j7 = j4;
                            long j8 = j3;
                            Shape shape4 = shape2;
                            Modifier modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1945098332, i13, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:201)");
                            }
                            int i14 = ((i13 >> 3) & 14) | i6;
                            int i15 = i13 >> 9;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2489SurfaceFjzlyU(modifier4, shape4, j8, j7, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(802957984, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i16) {
                                    ComposableLambda rememberComposableLambda;
                                    ComposerKt.sourceInformation(composer3, "C208@8759L1000:AlertDialog.kt#jmzs0o");
                                    if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(802957984, i16, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:208)");
                                    }
                                    final Function2<Composer, Integer, Unit> function28 = function24;
                                    final Function2<Composer, Integer, Unit> function29 = function25;
                                    Function2<Composer, Integer, Unit> function210 = function2;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                                    Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -98027836, "C209@8780L947,231@9740L9:AlertDialog.kt#jmzs0o");
                                    ComposableLambda composableLambda = null;
                                    if (function28 == null) {
                                        composer3.startReplaceGroup(-97968969);
                                        composer3.endReplaceGroup();
                                        rememberComposableLambda = null;
                                    } else {
                                        composer3.startReplaceGroup(-97968968);
                                        ComposerKt.sourceInformation(composer3, "*212@8900L308");
                                        rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1737550099, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i17) {
                                                ComposerKt.sourceInformation(composer4, "C213@8995L4,213@9001L181,213@8930L252:AlertDialog.kt#jmzs0o");
                                                if (!composer4.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1737550099, i17, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:213)");
                                                }
                                                ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)));
                                                final Function2<Composer, Integer, Unit> function211 = function28;
                                                CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-1654653485, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i18) {
                                                        ComposerKt.sourceInformation(composer5, "C214@9065L10,215@9118L34:AlertDialog.kt#jmzs0o");
                                                        if (!composer5.shouldExecute((i18 & 3) != 2, i18 & 1)) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1654653485, i18, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:214)");
                                                        }
                                                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getSubtitle1(), function211, composer5, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                        composer3.endReplaceGroup();
                                    }
                                    if (function29 == null) {
                                        composer3.startReplaceGroup(-97547524);
                                    } else {
                                        composer3.startReplaceGroup(-97547523);
                                        ComposerKt.sourceInformation(composer3, "*221@9323L367");
                                        composableLambda = ComposableLambdaKt.rememberComposableLambda(1265552690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i17) {
                                                ComposerKt.sourceInformation(composer4, "C223@9451L6,224@9488L176,222@9353L311:AlertDialog.kt#jmzs0o");
                                                if (!composer4.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1265552690, i17, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:222)");
                                                }
                                                ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer4, 6)));
                                                final Function2<Composer, Integer, Unit> function211 = function29;
                                                CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-2126650894, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i18) {
                                                        ComposerKt.sourceInformation(composer5, "C225@9552L10,226@9601L33:AlertDialog.kt#jmzs0o");
                                                        if (!composer5.shouldExecute((i18 & 3) != 2, i18 & 1)) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2126650894, i18, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:225)");
                                                        }
                                                        TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getBody2(), function211, composer5, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                    }
                                    composer3.endReplaceGroup();
                                    AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, rememberComposableLambda, composableLambda, composer3, 6);
                                    function210.invoke(composer3, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), composer2, i14 | (i15 & 112) | (i15 & 896) | (i15 & 7168), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function26 = function24;
                            function27 = function25;
                            modifier3 = modifier4;
                            shape3 = shape4;
                            j5 = j8;
                            j6 = j7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i7 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i7 &= -458753;
                            }
                        }
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AlertDialogKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit AlertDialogContent_WMdw5o4$lambda$0;
                                AlertDialogContent_WMdw5o4$lambda$0 = AlertDialogKt.AlertDialogContent_WMdw5o4$lambda$0(Function2.this, modifier3, function26, function27, shape3, j5, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return AlertDialogContent_WMdw5o4$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                function25 = function23;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function25 = function23;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function24 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function25 = function23;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AlertDialogBaselineLayout(final ColumnScope columnScope, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        boolean z;
        Composer startRestartGroup = composer.startRestartGroup(1213983107);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogBaselineLayout)N(title,text)258@10578L3363,248@10242L3699:AlertDialog.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1213983107, i2, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:247)");
            }
            Modifier weight = columnScope.weight(Modifier.INSTANCE, 1.0f, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1593319866, "CC(remember):AlertDialog.kt#9igjgp");
            AlertDialogKt$AlertDialogBaselineLayout$2$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = AlertDialogKt$AlertDialogBaselineLayout$2$1.INSTANCE;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, weight);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1809234843, "C:AlertDialog.kt#jmzs0o");
            if (function2 == null) {
                startRestartGroup.startReplaceGroup(1809237538);
                startRestartGroup.endReplaceGroup();
                z = false;
            } else {
                startRestartGroup.startReplaceGroup(1809237539);
                ComposerKt.sourceInformation(startRestartGroup, "*251@10310L70");
                Modifier align = columnScope.align(LayoutIdKt.layoutId(TitlePadding, "title"), Alignment.INSTANCE.getStart());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
                z = false;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1262627484, "C251@10371L7:AlertDialog.kt#jmzs0o");
                function2.invoke(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            }
            if (function22 == null) {
                startRestartGroup.startReplaceGroup(1809370342);
            } else {
                startRestartGroup.startReplaceGroup(1809370343);
                ComposerKt.sourceInformation(startRestartGroup, "*254@10443L67");
                Modifier align2 = columnScope.align(LayoutIdKt.layoutId(TextPadding, "text"), Alignment.INSTANCE.getStart());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                boolean z2 = z;
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, z2 ? 1 : 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, align2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5333constructorimpl3 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m5333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m5333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2120720012, "C254@10502L6:AlertDialog.kt#jmzs0o");
                function22.invoke(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AlertDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlertDialogBaselineLayout$lambda$7;
                    AlertDialogBaselineLayout$lambda$7 = AlertDialogKt.AlertDialogBaselineLayout$lambda$7(ColumnScope.this, function2, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AlertDialogBaselineLayout$lambda$7;
                }
            });
        }
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m2168AlertDialogFlowRowixp7dh8(final float f, final float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1271829505);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogFlowRow)N(mainAxisSpacing:c#ui.unit.Dp,crossAxisSpacing:c#ui.unit.Dp,content)350@14216L3557,350@14200L3573:AlertDialog.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1271829505, i2, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:349)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1837516474, "CC(remember):AlertDialog.kt#9igjgp");
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            AlertDialogKt$AlertDialogFlowRow$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new AlertDialogKt$AlertDialogFlowRow$1$1(f, f2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((i3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, Integer.valueOf((i4 >> 6) & 14));
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AlertDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlertDialogFlowRow_ixp7dh8$lambda$9;
                    AlertDialogFlowRow_ixp7dh8$lambda$9 = AlertDialogKt.AlertDialogFlowRow_ixp7dh8$lambda$9(f, f2, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AlertDialogFlowRow_ixp7dh8$lambda$9;
                }
            });
        }
    }

    static {
        float f = 24;
        TitlePadding = PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f), 0.0f, Dp.m8798constructorimpl(f), 0.0f, 10, null);
        TextPadding = PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f), 0.0f, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(28), 2, null);
    }
}
