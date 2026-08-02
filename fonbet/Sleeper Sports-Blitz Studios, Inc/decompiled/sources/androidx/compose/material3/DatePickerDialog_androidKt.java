package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.profileinstaller.ProfileVerifier;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DatePickerDialog.android.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0097\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0019\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a\"\u0010\u0010\u001b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006\u001c"}, d2 = {"DatePickerDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "shape", "Landroidx/compose/ui/graphics/Shape;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material3/DatePickerColors;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DatePickerDialog-GmEhDVc", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DialogButtonsPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogButtonsMainAxisSpacing", "F", "DialogButtonsCrossAxisSpacing", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerDialog_androidKt {
    private static final float DialogButtonsCrossAxisSpacing = Dp.m8798constructorimpl(12);
    private static final float DialogButtonsMainAxisSpacing;
    private static final PaddingValues DialogButtonsPadding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DatePickerDialog_GmEhDVc$lambda$0(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Shape shape, float f, DatePickerColors datePickerColors, DialogProperties dialogProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2952DatePickerDialogGmEhDVc(function0, function2, modifier, function22, shape, f, datePickerColors, dialogProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e2  */
    /* renamed from: DatePickerDialog-GmEhDVc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2952DatePickerDialogGmEhDVc(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, float f, DatePickerColors datePickerColors, DialogProperties dialogProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape2;
        int i6;
        float f2;
        final DatePickerColors datePickerColors2;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Shape shape3;
        final float f3;
        final DialogProperties dialogProperties2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        DialogProperties dialogProperties3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final float f4;
        int i11;
        Modifier modifier4;
        final Shape shape4;
        boolean z;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(219718641);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerDialog)N(onDismissRequest,confirmButton,modifier,dismissButton,shape,tonalElevation:c#ui.unit.Dp,colors,properties,content)79@3746L1617,75@3595L1768:DatePickerDialog.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function23 = function22;
                    i3 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i13 = 16384;
                                i3 |= i13;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                datePickerColors2 = datePickerColors;
                                if (startRestartGroup.changed(datePickerColors2)) {
                                    i12 = 1048576;
                                    i3 |= i12;
                                }
                            } else {
                                datePickerColors2 = datePickerColors;
                            }
                            i12 = 524288;
                            i3 |= i12;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(dialogProperties) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
                            i8 = i3;
                            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "55@2765L5,57@2882L8");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        function23 = null;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i9 = i8 & (-57345);
                                        shape2 = DatePickerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    } else {
                                        i9 = i8;
                                    }
                                    if (i6 != 0) {
                                        f2 = DatePickerDefaults.INSTANCE.m2951getTonalElevationD9Ej5fM();
                                    }
                                    if ((i2 & 64) != 0) {
                                        datePickerColors2 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i10 = i9 & (-3670017);
                                    } else {
                                        i10 = i9;
                                    }
                                    if (i7 != 0) {
                                        dialogProperties3 = new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null);
                                        function25 = function23;
                                        f4 = f2;
                                        i11 = i10;
                                        modifier4 = modifier2;
                                        shape4 = shape2;
                                        z = false;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(219718641, i11, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:74)");
                                        }
                                        AlertDialogKt.BasicAlertDialog(function0, SizeKt.wrapContentHeight$default(modifier4, null, z, 3, null), dialogProperties3, ComposableLambdaKt.rememberComposableLambda(1108953335, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i14) {
                                                ComposerKt.sourceInformation(composer3, "C87@4066L1291,80@3756L1601:DatePickerDialog.android.kt#uh7d8r");
                                                if (!composer3.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1108953335, i14, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:80)");
                                                }
                                                Modifier m1197heightInVpY3zN4$default = SizeKt.m1197heightInVpY3zN4$default(SizeKt.m1206requiredWidth3ABfNKs(Modifier.INSTANCE, DatePickerModalTokens.INSTANCE.m4613getContainerWidthD9Ej5fM()), 0.0f, DatePickerModalTokens.INSTANCE.m4612getContainerHeightD9Ej5fM(), 1, null);
                                                Shape shape5 = Shape.this;
                                                long containerColor = datePickerColors2.getContainerColor();
                                                float f5 = f4;
                                                final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                                final Function2<Composer, Integer, Unit> function26 = function25;
                                                final Function2<Composer, Integer, Unit> function27 = function2;
                                                SurfaceKt.m3729SurfaceT9BRK9s(m1197heightInVpY3zN4$default, shape5, containerColor, 0L, f5, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1782015378, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i15) {
                                                        PaddingValues paddingValues;
                                                        ComposerKt.sourceInformation(composer4, "C88@4080L1267:DatePickerDialog.android.kt#uh7d8r");
                                                        if (!composer4.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1782015378, i15, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:88)");
                                                        }
                                                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                        Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                                        final Function2<Composer, Integer, Unit> function28 = function26;
                                                        final Function2<Composer, Integer, Unit> function29 = function27;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), composer4, 6);
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, companion);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer m5333constructorimpl = Updater.m5333constructorimpl(composer4);
                                                        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1407374204, "C94@4530L64,96@4638L695:DatePickerDialog.android.kt#uh7d8r");
                                                        Modifier weight = columnScopeInstance.weight(Modifier.INSTANCE, 1.0f, false);
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, weight);
                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor2);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer4);
                                                        Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -114868488, "C94@4583L9:DatePickerDialog.android.kt#uh7d8r");
                                                        function33.invoke(columnScopeInstance, composer4, 6);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        composer4.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd());
                                                        paddingValues = DatePickerDialog_androidKt.DialogButtonsPadding;
                                                        Modifier padding = PaddingKt.padding(align, paddingValues);
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, padding);
                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor3);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer4);
                                                        Updater.m5340setimpl(m5333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            m5333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            m5333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 775961793, "C98@4839L5,99@4915L5,100@4944L371,97@4736L579:DatePickerDialog.android.kt#uh7d8r");
                                                        ProvideContentColorTextStyleKt.m4299ProvideContentColorTextStyle3JVO9M(ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer4, 6), TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer4, 6), ComposableLambdaKt.rememberComposableLambda(-1103927529, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                                invoke(composer5, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer5, int i16) {
                                                                float f6;
                                                                float f7;
                                                                ComposerKt.sourceInformation(composer5, "C104@5170L123,101@4970L323:DatePickerDialog.android.kt#uh7d8r");
                                                                if (composer5.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-1103927529, i16, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
                                                                    }
                                                                    f6 = DatePickerDialog_androidKt.DialogButtonsMainAxisSpacing;
                                                                    f7 = DatePickerDialog_androidKt.DialogButtonsCrossAxisSpacing;
                                                                    final Function2<Composer, Integer, Unit> function210 = function28;
                                                                    final Function2<Composer, Integer, Unit> function211 = function29;
                                                                    AlertDialogKt.m2612AlertDialogFlowRowixp7dh8(f6, f7, ComposableLambdaKt.rememberComposableLambda(-1980163584, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                            invoke(composer6, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer6, int i17) {
                                                                            ComposerKt.sourceInformation(composer6, "C106@5252L15:DatePickerDialog.android.kt#uh7d8r");
                                                                            if (!composer6.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                                                composer6.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(-1980163584, i17, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                                                                            }
                                                                            Function2<Composer, Integer, Unit> function212 = function210;
                                                                            if (function212 == null) {
                                                                                composer6.startReplaceGroup(322524505);
                                                                            } else {
                                                                                composer6.startReplaceGroup(-266690648);
                                                                                ComposerKt.sourceInformation(composer6, "105@5215L8");
                                                                                function212.invoke(composer6, 0);
                                                                            }
                                                                            composer6.endReplaceGroup();
                                                                            function211.invoke(composer6, 0);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }, composer5, 54), composer5, 438);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer5.skipToGroupEnd();
                                                            }
                                                        }, composer4, 54), composer4, 384);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        composer4.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        composer4.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54), composer3, 12582918, 104);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, (i11 & 14) | 3072 | ((i11 >> 15) & 896), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        dialogProperties2 = dialogProperties3;
                                        f3 = f4;
                                        function24 = function25;
                                        modifier3 = modifier4;
                                        composer2 = startRestartGroup;
                                        shape3 = shape4;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i10 = (i2 & 16) != 0 ? i8 & (-57345) : i8;
                                    if ((i2 & 64) != 0) {
                                        i10 &= -3670017;
                                    }
                                }
                                dialogProperties3 = dialogProperties;
                                i11 = i10;
                                modifier4 = modifier2;
                                function25 = function23;
                                f4 = f2;
                                z = false;
                                shape4 = shape2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                AlertDialogKt.BasicAlertDialog(function0, SizeKt.wrapContentHeight$default(modifier4, null, z, 3, null), dialogProperties3, ComposableLambdaKt.rememberComposableLambda(1108953335, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        ComposerKt.sourceInformation(composer3, "C87@4066L1291,80@3756L1601:DatePickerDialog.android.kt#uh7d8r");
                                        if (!composer3.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1108953335, i14, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:80)");
                                        }
                                        Modifier m1197heightInVpY3zN4$default = SizeKt.m1197heightInVpY3zN4$default(SizeKt.m1206requiredWidth3ABfNKs(Modifier.INSTANCE, DatePickerModalTokens.INSTANCE.m4613getContainerWidthD9Ej5fM()), 0.0f, DatePickerModalTokens.INSTANCE.m4612getContainerHeightD9Ej5fM(), 1, null);
                                        Shape shape5 = Shape.this;
                                        long containerColor = datePickerColors2.getContainerColor();
                                        float f5 = f4;
                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function2;
                                        SurfaceKt.m3729SurfaceT9BRK9s(m1197heightInVpY3zN4$default, shape5, containerColor, 0L, f5, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1782015378, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i15) {
                                                PaddingValues paddingValues;
                                                ComposerKt.sourceInformation(composer4, "C88@4080L1267:DatePickerDialog.android.kt#uh7d8r");
                                                if (!composer4.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1782015378, i15, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:88)");
                                                }
                                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                                final Function2<? super Composer, ? super Integer, Unit> function28 = function26;
                                                final Function2<? super Composer, ? super Integer, Unit> function29 = function27;
                                                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), composer4, 6);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, companion);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m5333constructorimpl = Updater.m5333constructorimpl(composer4);
                                                Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1407374204, "C94@4530L64,96@4638L695:DatePickerDialog.android.kt#uh7d8r");
                                                Modifier weight = columnScopeInstance.weight(Modifier.INSTANCE, 1.0f, false);
                                                ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, weight);
                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor2);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer4);
                                                Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer4, -114868488, "C94@4583L9:DatePickerDialog.android.kt#uh7d8r");
                                                function33.invoke(columnScopeInstance, composer4, 6);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Modifier align = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd());
                                                paddingValues = DatePickerDialog_androidKt.DialogButtonsPadding;
                                                Modifier padding = PaddingKt.padding(align, paddingValues);
                                                ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, padding);
                                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor3);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer4);
                                                Updater.m5340setimpl(m5333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    m5333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    m5333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                }
                                                Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 775961793, "C98@4839L5,99@4915L5,100@4944L371,97@4736L579:DatePickerDialog.android.kt#uh7d8r");
                                                ProvideContentColorTextStyleKt.m4299ProvideContentColorTextStyle3JVO9M(ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer4, 6), TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer4, 6), ComposableLambdaKt.rememberComposableLambda(-1103927529, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i16) {
                                                        float f6;
                                                        float f7;
                                                        ComposerKt.sourceInformation(composer5, "C104@5170L123,101@4970L323:DatePickerDialog.android.kt#uh7d8r");
                                                        if (composer5.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1103927529, i16, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
                                                            }
                                                            f6 = DatePickerDialog_androidKt.DialogButtonsMainAxisSpacing;
                                                            f7 = DatePickerDialog_androidKt.DialogButtonsCrossAxisSpacing;
                                                            final Function2<? super Composer, ? super Integer, Unit> function210 = function28;
                                                            final Function2<? super Composer, ? super Integer, Unit> function211 = function29;
                                                            AlertDialogKt.m2612AlertDialogFlowRowixp7dh8(f6, f7, ComposableLambdaKt.rememberComposableLambda(-1980163584, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                    invoke(composer6, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer6, int i17) {
                                                                    ComposerKt.sourceInformation(composer6, "C106@5252L15:DatePickerDialog.android.kt#uh7d8r");
                                                                    if (!composer6.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                                        composer6.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-1980163584, i17, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                                                                    }
                                                                    Function2<Composer, Integer, Unit> function212 = function210;
                                                                    if (function212 == null) {
                                                                        composer6.startReplaceGroup(322524505);
                                                                    } else {
                                                                        composer6.startReplaceGroup(-266690648);
                                                                        ComposerKt.sourceInformation(composer6, "105@5215L8");
                                                                        function212.invoke(composer6, 0);
                                                                    }
                                                                    composer6.endReplaceGroup();
                                                                    function211.invoke(composer6, 0);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }, composer5, 54), composer5, 438);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }, composer4, 54), composer4, 384);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 12582918, 104);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i11 & 14) | 3072 | ((i11 >> 15) & 896), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                dialogProperties2 = dialogProperties3;
                                f3 = f4;
                                function24 = function25;
                                modifier3 = modifier4;
                                composer2 = startRestartGroup;
                                shape3 = shape4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                composer2 = startRestartGroup;
                                modifier3 = modifier2;
                                function24 = function23;
                                shape3 = shape2;
                                f3 = f2;
                                dialogProperties2 = dialogProperties;
                            }
                            final DatePickerColors datePickerColors3 = datePickerColors2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit DatePickerDialog_GmEhDVc$lambda$0;
                                        DatePickerDialog_GmEhDVc$lambda$0 = DatePickerDialog_androidKt.DatePickerDialog_GmEhDVc$lambda$0(Function0.this, function2, modifier3, function24, shape3, f3, datePickerColors3, dialogProperties2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return DatePickerDialog_GmEhDVc$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 = i3;
                        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
                        }
                        final DatePickerColors datePickerColors32 = datePickerColors2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    i8 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
                    }
                    final DatePickerColors datePickerColors322 = datePickerColors2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function23 = function22;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i8 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
                }
                final DatePickerColors datePickerColors3222 = datePickerColors2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function23 = function22;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i8 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
            }
            final DatePickerColors datePickerColors32222 = datePickerColors2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function23 = function22;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i8 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i8 & 1)) {
        }
        final DatePickerColors datePickerColors322222 = datePickerColors2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    static {
        float f = 8;
        DialogButtonsPadding = PaddingKt.m1154PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m8798constructorimpl(6), Dp.m8798constructorimpl(f), 3, null);
        DialogButtonsMainAxisSpacing = Dp.m8798constructorimpl(f);
    }
}
