package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
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
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"Button", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material", "contentColor", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$4(Function0 function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3 function3, int i, int i2, Composer composer, int i3) {
        Button(function0, modifier, z, mutableInteractionSource, buttonElevation, shape, borderStroke, buttonColors, paddingValues, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final Shape shape2;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource3;
        final ButtonElevation buttonElevation3;
        final ButtonColors buttonColors2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        MutableInteractionSource mutableInteractionSource4;
        int i10;
        CornerBasedShape cornerBasedShape;
        Composer composer3;
        int i11;
        boolean z4;
        ButtonColors buttonColors3;
        final PaddingValues contentPadding;
        Shape shape3;
        BorderStroke borderStroke3;
        boolean z5;
        int i12;
        ?? r6;
        MutableInteractionSource mutableInteractionSource5;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1084573925);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)N(onClick,modifier,enabled,interactionSource,elevation,shape,border,colors,contentPadding,content)108@5157L21,111@5257L22,114@5354L24,119@5603L646,109@5183L1066:Button.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            buttonElevation2 = buttonElevation;
                            if (startRestartGroup.changed(buttonElevation2)) {
                                i15 = 16384;
                                i3 |= i15;
                            }
                        } else {
                            buttonElevation2 = buttonElevation;
                        }
                        i15 = 8192;
                        i3 |= i15;
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(shape)) {
                            i14 = 131072;
                            i3 |= i14;
                        }
                        i14 = 65536;
                        i3 |= i14;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(buttonColors)) {
                            i13 = 8388608;
                            i3 |= i13;
                        }
                        i13 = 4194304;
                        i3 |= i13;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i8 = i7;
                        i3 |= startRestartGroup.changed(paddingValues) ? 67108864 : 33554432;
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        }
                        i9 = i3;
                        if (startRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "99@4736L11,100@4782L6,102@4872L14");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                i12 = (i2 & 16) != 0 ? i9 & (-57345) : i9;
                                if ((i2 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                shape3 = shape;
                                borderStroke3 = borderStroke;
                                z5 = z2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                r6 = 0;
                                contentPadding = paddingValues;
                                composer3 = startRestartGroup;
                                buttonColors3 = buttonColors;
                            } else {
                                Modifier.Companion companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z6 = i4 != 0 ? true : z2;
                                mutableInteractionSource4 = i5 != 0 ? null : mutableInteractionSource2;
                                if ((i2 & 16) != 0) {
                                    i10 = i9 & (-57345);
                                    buttonElevation2 = ButtonDefaults.INSTANCE.m2239elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                } else {
                                    i10 = i9;
                                }
                                if ((i2 & 32) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                                    i10 &= -458753;
                                } else {
                                    cornerBasedShape = shape;
                                }
                                BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                                if ((i2 & 128) != 0) {
                                    i11 = i8;
                                    z4 = false;
                                    buttonColors3 = ButtonDefaults.INSTANCE.m2238buttonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                    composer3 = startRestartGroup;
                                    i10 &= -29360129;
                                } else {
                                    composer3 = startRestartGroup;
                                    i11 = i8;
                                    z4 = false;
                                    buttonColors3 = buttonColors;
                                }
                                contentPadding = i11 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                shape3 = cornerBasedShape;
                                borderStroke3 = borderStroke4;
                                z5 = z6;
                                modifier2 = companion;
                                i12 = i10;
                                r6 = z4;
                            }
                            composer3.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1084573925, i12, -1, "androidx.compose.material.Button (Button.kt:105)");
                            }
                            if (mutableInteractionSource4 == null) {
                                composer3.startReplaceGroup(497772480);
                                ComposerKt.sourceInformation(composer3, "107@5086L39");
                                ComposerKt.sourceInformationMarkerStart(composer3, 1401530498, "CC(remember):Button.kt#9igjgp");
                                Object rememberedValue = composer3.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceGroup();
                                mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                            } else {
                                composer3.startReplaceGroup(1401529847);
                                composer3.endReplaceGroup();
                                mutableInteractionSource5 = mutableInteractionSource4;
                            }
                            int i17 = i12 >> 6;
                            int i18 = (i17 & 14) | ((i12 >> 18) & 112);
                            final State<Color> contentColor = buttonColors3.contentColor(z5, composer3, i18);
                            ComposerKt.sourceInformationMarkerStart(composer3, 1401535953, "CC(remember):Button.kt#9igjgp");
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: androidx.compose.material.ButtonKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit Button$lambda$3$lambda$2;
                                        Button$lambda$3$lambda$2 = ButtonKt.Button$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
                                        return Button$lambda$3$lambda$2;
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            State<Dp> state = null;
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier2, r6, (Function1) rememberedValue2, 1, null);
                            long m6049unboximpl = buttonColors3.backgroundColor(z5, composer3, i18).getValue().m6049unboximpl();
                            long m6038copywmQWz5c$default = Color.m6038copywmQWz5c$default(Button$lambda$1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            if (buttonElevation2 == null) {
                                composer3.startReplaceGroup(498179137);
                            } else {
                                composer3.startReplaceGroup(1401543616);
                                ComposerKt.sourceInformation(composer3, "117@5496L37");
                                state = buttonElevation2.elevation(z5, mutableInteractionSource5, composer3, i17 & 910);
                            }
                            composer3.endReplaceGroup();
                            Composer composer4 = composer3;
                            SurfaceKt.m2490SurfaceLPr_se0(function0, semantics$default, z5, shape3, m6049unboximpl, m6038copywmQWz5c$default, borderStroke3, state != null ? state.getValue().m8812unboximpl() : Dp.m8798constructorimpl((float) r6), mutableInteractionSource5, ComposableLambdaKt.rememberComposableLambda(-20345758, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i19) {
                                    long Button$lambda$1;
                                    ComposerKt.sourceInformation(composer5, "C120@5685L558,120@5613L630:Button.kt#jmzs0o");
                                    if (!composer5.shouldExecute((i19 & 3) != 2, i19 & 1)) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-20345758, i19, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:120)");
                                    }
                                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                    Button$lambda$1 = ButtonKt.Button$lambda$1(contentColor);
                                    ProvidedValue<Float> provides = localContentAlpha.provides(Float.valueOf(Color.m6041getAlphaimpl(Button$lambda$1)));
                                    final PaddingValues paddingValues3 = contentPadding;
                                    final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-869936862, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            invoke(composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer6, int i20) {
                                            ComposerKt.sourceInformation(composer6, "C121@5738L10,121@5757L476,121@5699L534:Button.kt#jmzs0o");
                                            if (!composer6.shouldExecute((i20 & 3) != 2, i20 & 1)) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-869936862, i20, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:121)");
                                            }
                                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer6, 6).getButton();
                                            final PaddingValues paddingValues4 = PaddingValues.this;
                                            final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.rememberComposableLambda(165539859, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                    invoke(composer7, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer7, int i21) {
                                                    ComposerKt.sourceInformation(composer7, "C122@5775L444:Button.kt#jmzs0o");
                                                    if (!composer7.shouldExecute((i21 & 3) != 2, i21 & 1)) {
                                                        composer7.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(165539859, i21, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:122)");
                                                    }
                                                    Modifier padding = PaddingKt.padding(SizeKt.m1193defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m2244getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m2243getMinHeightD9Ej5fM()), PaddingValues.this);
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                                    ComposerKt.sourceInformationMarkerStart(composer7, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer7, 54);
                                                    ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer7, padding);
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(composer7, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(composer7.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer7.startReusableNode();
                                                    if (composer7.getInserting()) {
                                                        composer7.createNode(constructor);
                                                    } else {
                                                        composer7.useNode();
                                                    }
                                                    Composer m5333constructorimpl = Updater.m5333constructorimpl(composer7);
                                                    Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer7, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                    function34.invoke(RowScopeInstance.INSTANCE, composer7, 6);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    composer7.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer6, 54), composer6, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer5, 54), composer5, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer4, (i17 & 7168) | (i12 & 14) | 805306368 | (i12 & 896) | (i12 & 3670016), 0);
                            composer2 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ButtonElevation buttonElevation4 = buttonElevation2;
                            paddingValues2 = contentPadding;
                            buttonElevation3 = buttonElevation4;
                            modifier3 = modifier2;
                            buttonColors2 = buttonColors3;
                            z3 = z5;
                            shape2 = shape3;
                            borderStroke2 = borderStroke3;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            shape2 = shape;
                            borderStroke2 = borderStroke;
                            modifier3 = modifier2;
                            z3 = z2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            buttonElevation3 = buttonElevation2;
                            buttonColors2 = buttonColors;
                            paddingValues2 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ButtonKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit Button$lambda$4;
                                    Button$lambda$4 = ButtonKt.Button$lambda$4(Function0.this, modifier3, z3, mutableInteractionSource3, buttonElevation3, shape2, borderStroke2, buttonColors2, paddingValues2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return Button$lambda$4;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i7;
                    if ((i2 & 512) != 0) {
                    }
                    i9 = i3;
                    if (startRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & 512) != 0) {
                }
                i9 = i3;
                if (startRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & 512) != 0) {
            }
            i9 = i3;
            if (startRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
            }
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
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & 512) != 0) {
        }
        i9 = i3;
        if (startRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button$lambda$3$lambda$2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7998setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7979getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    public static final void OutlinedButton(Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1445054947, "C(OutlinedButton)N(onClick,modifier,enabled,interactionSource,elevation,shape,border,colors,contentPadding,content)175@8304L6,176@8361L14,177@8419L22,181@8564L315:Button.kt#jmzs0o");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        MutableInteractionSource mutableInteractionSource2 = (i2 & 8) != 0 ? null : mutableInteractionSource;
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        Shape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke outlinedBorder = (i2 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke;
        ButtonColors m2246outlinedButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m2246outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues contentPadding = (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1445054947, i, -1, "androidx.compose.material.OutlinedButton (Button.kt:181)");
        }
        Button(function0, modifier2, z2, mutableInteractionSource2, buttonElevation2, small, outlinedBorder, m2246outlinedButtonColorsRGew2ao, contentPadding, function3, composer, i & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void TextButton(Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 724562088, "C(TextButton)N(onClick,modifier,enabled,interactionSource,elevation,shape,border,colors,contentPadding,content)232@10929L6,234@11019L18,238@11170L315:Button.kt#jmzs0o");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        MutableInteractionSource mutableInteractionSource2 = (i2 & 8) != 0 ? null : mutableInteractionSource;
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        Shape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        ButtonColors m2247textButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m2247textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues textButtonContentPadding = (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(724562088, i, -1, "androidx.compose.material.TextButton (Button.kt:238)");
        }
        Button(function0, modifier2, z2, mutableInteractionSource2, buttonElevation2, small, borderStroke2, m2247textButtonColorsRGew2ao, textButtonContentPadding, function3, composer, i & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        return state.getValue().m6049unboximpl();
    }
}
