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
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.objectweb.asm.Opcodes;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001an\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0085\u0001\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a\"\u0010\u0010\u001b\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a\"\u0010\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a\"\u0010\u0010\u001d\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006\u001e"}, d2 = {"FloatingActionButton", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "content", "Landroidx/compose/runtime/Composable;", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ExtendedFloatingActionButton", "text", "icon", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "FabSize", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabSize", "ExtendedFabIconPadding", "ExtendedFabTextPadding", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final float FabSize = Dp.m8798constructorimpl(56);
    private static final float ExtendedFabSize = Dp.m8798constructorimpl(48);
    private static final float ExtendedFabIconPadding = Dp.m8798constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m8798constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExtendedFloatingActionButton_wqdebIU$lambda$4(Function2 function2, Function0 function0, Modifier modifier, Function2 function22, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, int i, int i2, Composer composer, int i3) {
        m2362ExtendedFloatingActionButtonwqdebIU(function2, function0, modifier, function22, mutableInteractionSource, shape, j, j2, floatingActionButtonElevation, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButton_bogVsAg$lambda$3(Function0 function0, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, Function2 function2, int i, int i2, Composer composer, int i3) {
        m2363FloatingActionButtonbogVsAg(function0, modifier, mutableInteractionSource, shape, j, j2, floatingActionButtonElevation, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2363FloatingActionButtonbogVsAg(final Function0<Unit> function0, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        long j3;
        final long j4;
        final Modifier modifier2;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final long j5;
        final long j6;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        CornerBasedShape cornerBasedShape;
        long j7;
        Composer composer3;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        Shape shape4;
        long j8;
        boolean z;
        int i5;
        MutableInteractionSource mutableInteractionSource4;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-482679837);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButton)N(onClick,modifier,interactionSource,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation,content)95@4354L22,99@4501L28,101@4590L420,93@4280L730:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i8 = 2048;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 1024;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        j3 = j;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    j3 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        j4 = j2;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    j4 = j2;
                }
                if ((i & 1572864) == 0) {
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(floatingActionButtonElevation)) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "85@3859L6,86@3947L6,87@3991L32,88@4101L11");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
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
                        companion = modifier;
                        composer3 = startRestartGroup;
                        shape4 = shape2;
                        j8 = j3;
                        z = false;
                        i5 = -482679837;
                        floatingActionButtonElevation3 = floatingActionButtonElevation;
                    } else {
                        companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if (i4 != 0) {
                            mutableInteractionSource2 = null;
                        }
                        if ((i2 & 8) != 0) {
                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i3 &= -7169;
                        } else {
                            cornerBasedShape = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            j7 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2275getSecondary0d7_KjU();
                            i3 &= -57345;
                        } else {
                            j7 = j3;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ColorsKt.m2291contentColorForek8zF_U(j7, startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m2359elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                            composer3 = startRestartGroup;
                            i3 &= -3670017;
                        } else {
                            composer3 = startRestartGroup;
                            floatingActionButtonElevation3 = floatingActionButtonElevation;
                        }
                        shape4 = cornerBasedShape;
                        j8 = j7;
                        z = false;
                        i5 = -482679837;
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i5, i3, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)");
                    }
                    if (mutableInteractionSource2 == null) {
                        composer3.startReplaceGroup(36083320);
                        ComposerKt.sourceInformation(composer3, "92@4236L39");
                        ComposerKt.sourceInformationMarkerStart(composer3, 1163978, "CC(remember):FloatingActionButton.kt#9igjgp");
                        Object rememberedValue = composer3.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceGroup();
                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                    } else {
                        composer3.startReplaceGroup(1163327);
                        composer3.endReplaceGroup();
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    ComposerKt.sourceInformationMarkerStart(composer3, 1167737, "CC(remember):FloatingActionButton.kt#9igjgp");
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material.FloatingActionButtonKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit FloatingActionButton_bogVsAg$lambda$2$lambda$1;
                                FloatingActionButton_bogVsAg$lambda$2$lambda$1 = FloatingActionButtonKt.FloatingActionButton_bogVsAg$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
                                return FloatingActionButton_bogVsAg$lambda$2$lambda$1;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    long j9 = j4;
                    SurfaceKt.m2490SurfaceLPr_se0(function02, SemanticsModifierKt.semantics$default(companion, z, (Function1) rememberedValue2, 1, null), false, shape4, j8, j9, null, floatingActionButtonElevation3.elevation(mutableInteractionSource4, composer3, (i3 >> 15) & 112).getValue().m8812unboximpl(), mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1823447062, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            ComposerKt.sourceInformation(composer4, "C102@4672L332,102@4600L404:FloatingActionButton.kt#jmzs0o");
                            if (!composer4.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1823447062, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:102)");
                            }
                            ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m6041getAlphaimpl(j4)));
                            final Function2<Composer, Integer, Unit> function22 = function2;
                            CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-1072292694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i11) {
                                    ComposerKt.sourceInformation(composer5, "C103@4717L10,103@4736L258,103@4686L308:FloatingActionButton.kt#jmzs0o");
                                    if (!composer5.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1072292694, i11, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:103)");
                                    }
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer5, 6).getButton();
                                    final Function2<Composer, Integer, Unit> function23 = function22;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.rememberComposableLambda(-1686273317, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt.FloatingActionButton.2.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            invoke(composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer6, int i12) {
                                            float f;
                                            float f2;
                                            ComposerKt.sourceInformation(composer6, "C104@4754L226:FloatingActionButton.kt#jmzs0o");
                                            if (!composer6.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1686273317, i12, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:104)");
                                            }
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            f = FloatingActionButtonKt.FabSize;
                                            f2 = FloatingActionButtonKt.FabSize;
                                            Modifier m1193defaultMinSizeVpY3zN4 = SizeKt.m1193defaultMinSizeVpY3zN4(companion2, f, f2);
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            Function2<Composer, Integer, Unit> function24 = function23;
                                            ComposerKt.sourceInformationMarkerStart(composer6, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer6, m1193defaultMinSizeVpY3zN4);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer6);
                                            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer6, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer6, -344600103, "C108@4953L9:FloatingActionButton.kt#jmzs0o");
                                            function24.invoke(composer6, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            composer6.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer5, 54), composer5, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, (i3 & 14) | 805306368 | (i3 & 7168) | (57344 & i3) | (i3 & Opcodes.ASM7), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = companion;
                    floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    composer2 = composer3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = shape4;
                    j5 = j8;
                    j6 = j9;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    composer2 = startRestartGroup;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FloatingActionButton_bogVsAg$lambda$3;
                            FloatingActionButton_bogVsAg$lambda$3 = FloatingActionButtonKt.FloatingActionButton_bogVsAg$lambda$3(Function0.this, modifier2, mutableInteractionSource3, shape3, j5, j6, floatingActionButtonElevation2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return FloatingActionButton_bogVsAg$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButton_bogVsAg$lambda$2$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7998setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7979getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2362ExtendedFloatingActionButtonwqdebIU(final Function2<? super Composer, ? super Integer, Unit> function2, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, MutableInteractionSource mutableInteractionSource, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        final Modifier modifier3;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final long j3;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        long j5;
        long j6;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource4;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        long j7;
        long j8;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1506973027);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExtendedFloatingActionButton)N(text,onClick,modifier,icon,interactionSource,shape,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation)168@7792L442,160@7463L771:FloatingActionButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) == 0) {
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i) != 0) {
                        if ((i2 & 256) == 0) {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                            if (startRestartGroup.changed(floatingActionButtonElevation2)) {
                                i7 = 67108864;
                                i3 |= i7;
                            }
                        } else {
                            floatingActionButtonElevation2 = floatingActionButtonElevation;
                        }
                        i7 = 33554432;
                        i3 |= i7;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "155@7200L6,156@7288L6,157@7332L32,158@7442L11");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function23 = null;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            }
                            if ((i2 & 64) != 0) {
                                i6 = i3 & (-3670017);
                                j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2275getSecondary0d7_KjU();
                            } else {
                                i6 = i3;
                                j5 = j;
                            }
                            if ((i2 & 128) != 0) {
                                j6 = ColorsKt.m2291contentColorForek8zF_U(j5, startRestartGroup, (i6 >> 18) & 14);
                                i6 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            if ((i2 & 256) != 0) {
                                composer3 = startRestartGroup;
                                i6 &= -234881025;
                                floatingActionButtonElevation3 = FloatingActionButtonDefaults.INSTANCE.m2359elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 24576, 15);
                                mutableInteractionSource4 = mutableInteractionSource2;
                            } else {
                                composer3 = startRestartGroup;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                            }
                            j7 = j6;
                            j8 = j5;
                            i3 = i6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            j8 = j;
                            j7 = j2;
                            composer3 = startRestartGroup;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        }
                        Shape shape4 = shape2;
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1506973027, i3, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                        }
                        float f = ExtendedFabSize;
                        int i10 = i3 >> 6;
                        m2363FloatingActionButtonbogVsAg(function02, SizeKt.m1213sizeInqDBjuR0$default(modifier2, f, f, 0.0f, 0.0f, 12, null), mutableInteractionSource4, shape4, j8, j7, floatingActionButtonElevation3, ComposableLambdaKt.rememberComposableLambda(-555697957, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i11) {
                                float f2;
                                float f3;
                                ComposerKt.sourceInformation(composer4, "C170@7898L330:FloatingActionButton.kt#jmzs0o");
                                if (!composer4.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-555697957, i11, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:169)");
                                }
                                float f4 = function23 == null ? FloatingActionButtonKt.ExtendedFabTextPadding : FloatingActionButtonKt.ExtendedFabIconPadding;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                f2 = FloatingActionButtonKt.ExtendedFabTextPadding;
                                Modifier m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(companion, f4, 0.0f, f2, 0.0f, 10, null);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function2<Composer, Integer, Unit> function25 = function23;
                                Function2<Composer, Integer, Unit> function26 = function2;
                                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m1161paddingqDBjuR0$default);
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
                                Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer4, 185594530, "C178@8212L6:FloatingActionButton.kt#jmzs0o");
                                if (function25 != null) {
                                    composer4.startReplaceGroup(185611238);
                                    ComposerKt.sourceInformation(composer4, "175@8116L6,176@8139L46");
                                    function25.invoke(composer4, 0);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    f3 = FloatingActionButtonKt.ExtendedFabIconPadding;
                                    SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(companion2, f3), composer4, 6);
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(185708299);
                                    composer4.endReplaceGroup();
                                }
                                function26.invoke(composer4, 0);
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
                        }, composer3, 54), composer3, 12582912 | ((i3 >> 3) & 14) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        composer2 = composer3;
                        function24 = function23;
                        mutableInteractionSource3 = mutableInteractionSource4;
                        shape3 = shape4;
                        j3 = j8;
                        j4 = j7;
                        floatingActionButtonElevation2 = floatingActionButtonElevation3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        function24 = function23;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape3 = shape2;
                        j3 = j;
                        j4 = j2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.FloatingActionButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExtendedFloatingActionButton_wqdebIU$lambda$4;
                                ExtendedFloatingActionButton_wqdebIU$lambda$4 = FloatingActionButtonKt.ExtendedFloatingActionButton_wqdebIU$lambda$4(Function2.this, function0, modifier3, function24, mutableInteractionSource3, shape3, j3, j4, floatingActionButtonElevation2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return ExtendedFloatingActionButton_wqdebIU$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((100663296 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function22;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((100663296 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((100663296 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
