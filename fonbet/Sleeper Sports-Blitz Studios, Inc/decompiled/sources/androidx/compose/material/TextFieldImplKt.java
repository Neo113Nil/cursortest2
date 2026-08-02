package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.messaging.Constants;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÙ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\t\u001a\u00020\n2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\u001c\u001aQ\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2 \u0010$\u001a\u001c\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\b¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0000H\u0001¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010)\u001a\u00020**\u00020*2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0005H\u0000\u001a\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0000\u001a\u0012\u00100\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0000\"\u001a\u00101\u001a\u0004\u0018\u000102*\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u000e\u00106\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020-X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020-X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010>\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010A\"\u0016\u0010C\u001a\u00020?X\u0080\u0004¢\u0006\n\n\u0002\u0010B\u001a\u0004\bD\u0010A¨\u0006E"}, d2 = {"CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material/TextFieldColors;", OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "defaultErrorSemantics", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "widthOrZero", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "heightOrZero", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "TextFieldId", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "AnimationDuration", "PlaceholderAnimationDuration", "PlaceholderAnimationDelayOrDuration", "TextFieldPadding", "Landroidx/compose/ui/unit/Dp;", "getTextFieldPadding", "()F", "F", "HorizontalIconPadding", "getHorizontalIconPadding", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final float TextFieldPadding = Dp.m8798constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m8798constructorimpl(12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$5(TextFieldType textFieldType, String str, Function2 function2, VisualTransformation visualTransformation, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, Shape shape, TextFieldColors textFieldColors, Function2 function26, int i, int i2, Composer composer, int i3) {
        CommonDecorationBox(textFieldType, str, function2, visualTransformation, function22, function23, function24, function25, z, z2, z3, interactionSource, paddingValues, shape, textFieldColors, function26, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_euL9pac$lambda$6(long j, TextStyle textStyle, Float f, Function2 function2, int i, int i2, Composer composer, int i3) {
        m2544DecorationeuL9pac(j, textStyle, f, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CommonDecorationBox(final TextFieldType textFieldType, final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final boolean z, final boolean z2, final boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final Shape shape, final TextFieldColors textFieldColors, final Function2<? super Composer, ? super Integer, Unit> function26, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i5;
        Composer composer2;
        InputPhase inputPhase;
        Composer startRestartGroup = composer.startRestartGroup(418608794);
        ComposerKt.sourceInformation(startRestartGroup, "C(CommonDecorationBox)N(type,value,innerTextField,visualTransformation,label,placeholder,leadingIcon,trailingIcon,singleLine,enabled,isError,interactionSource,contentPadding,shape,colors,border)80@3060L121,86@3257L25,106@3942L10,116@4385L10,121@4612L10,127@4852L4436,113@4277L5011:TextFieldImpl.kt#jmzs0o");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function27 = function2;
            i3 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
        } else {
            function27 = function2;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = 196608;
            function28 = function23;
            i3 |= startRestartGroup.changedInstance(function28) ? 131072 : 65536;
        } else {
            i4 = 196608;
            function28 = function23;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(z2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(textFieldColors) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            i5 |= startRestartGroup.changedInstance(function26) ? 131072 : 65536;
        }
        int i6 = i5;
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (74899 & i6) == 74898) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(418608794, i3, i6, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1443853485, "CC(remember):TextFieldImpl.kt#9igjgp");
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = visualTransformation.filter(new AnnotatedString(str, null, 2, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String text = ((TransformedText) rememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i6 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            Function3<InputPhase, Composer, Integer, Color> function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase2, Composer composer3, Integer num) {
                    return Color.m6029boximpl(m2546invokeXeAY9LY(inputPhase2, composer3, num.intValue()));
                }

                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m2546invokeXeAY9LY(InputPhase inputPhase2, Composer composer3, int i7) {
                    composer3.startReplaceGroup(1423138213);
                    ComposerKt.sourceInformation(composer3, "CN(it)96@3582L298:TextFieldImpl.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1423138213, i7, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
                    }
                    long m6049unboximpl = TextFieldColors.this.labelColor(z2, inputPhase2 == InputPhase.UnfocusedEmpty ? false : z3, interactionSource, composer3, 0).getValue().m6049unboximpl();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return m6049unboximpl;
                }
            };
            Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            boolean z5 = (Color.m6040equalsimpl0(subtitle1.m8262getColor0d7_KjU(), Color.INSTANCE.m6075getUnspecified0d7_KjU()) && !Color.m6040equalsimpl0(caption.m8262getColor0d7_KjU(), Color.INSTANCE.m6075getUnspecified0d7_KjU())) || (!Color.m6040equalsimpl0(subtitle1.m8262getColor0d7_KjU(), Color.INSTANCE.m6075getUnspecified0d7_KjU()) && Color.m6040equalsimpl0(caption.m8262getColor0d7_KjU(), Color.INSTANCE.m6075getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            startRestartGroup.startReplaceGroup(-1443811635);
            ComposerKt.sourceInformation(startRestartGroup, "");
            long m8262getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m8262getColor0d7_KjU();
            if (z5) {
                startRestartGroup.startReplaceGroup(-887928539);
                ComposerKt.sourceInformation(startRestartGroup, "*117@4481L22");
                if (m8262getColor0d7_KjU == 16) {
                    m8262getColor0d7_KjU = function3.invoke(inputPhase, startRestartGroup, 0).m6049unboximpl();
                }
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1218284988);
                startRestartGroup.endReplaceGroup();
            }
            long j = m8262getColor0d7_KjU;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1443804369);
            ComposerKt.sourceInformation(startRestartGroup, "");
            long m8262getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m8262getColor0d7_KjU();
            if (z5) {
                startRestartGroup.startReplaceGroup(-1026713946);
                ComposerKt.sourceInformation(startRestartGroup, "*122@4710L22");
                if (m8262getColor0d7_KjU2 == 16) {
                    m8262getColor0d7_KjU2 = function3.invoke(inputPhase, startRestartGroup, 0).m6049unboximpl();
                }
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(798166043);
                startRestartGroup.endReplaceGroup();
            }
            long j2 = m8262getColor0d7_KjU2;
            startRestartGroup.endReplaceGroup();
            textFieldTransitionScope.m2557TransitionDTcfvLk(inputPhase, j, j2, function3, function22 != null, ComposableLambdaKt.rememberComposableLambda(33336375, true, new TextFieldImplKt$CommonDecorationBox$3(function22, function28, text, textFieldColors, z2, z3, interactionSource, function24, function25, shape, textFieldType, function27, z, paddingValues, z5, function26), startRestartGroup, 54), startRestartGroup, 1769472);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CommonDecorationBox$lambda$5;
                    CommonDecorationBox$lambda$5 = TextFieldImplKt.CommonDecorationBox$lambda$5(TextFieldType.this, str, function2, visualTransformation, function22, function23, function24, function25, z, z2, z3, interactionSource, paddingValues, shape, textFieldColors, function26, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CommonDecorationBox$lambda$5;
                }
            });
        }
    }

    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m2544DecorationeuL9pac(final long j, TextStyle textStyle, Float f, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final TextStyle textStyle2;
        final Float f2;
        Composer startRestartGroup = composer.startRestartGroup(2064632657);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)N(contentColor:c#ui.graphics.Color,typography,contentAlpha,content)238@9675L550:TextFieldImpl.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
            textStyle2 = textStyle;
            f2 = f;
        } else {
            TextStyle textStyle3 = i4 != 0 ? null : textStyle;
            final Float f3 = i5 != 0 ? null : f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2064632657, i3, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-650790565, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ComposerKt.sourceInformation(composer2, "C239@9755L460,239@9689L526:TextFieldImpl.kt#jmzs0o");
                    if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-650790565, i6, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                    }
                    ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m6029boximpl(j));
                    final Float f4 = f3;
                    final Function2<Composer, Integer, Unit> function22 = function2;
                    final long j2 = j;
                    CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-1624601445, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            ComposerKt.sourceInformation(composer3, "C:TextFieldImpl.kt#jmzs0o");
                            if (!composer3.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1624601445, i7, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                            }
                            if (f4 != null) {
                                composer3.startReplaceGroup(1484860324);
                                ComposerKt.sourceInformation(composer3, "241@9821L155");
                                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f4), function22, composer3, ProvidedValue.$stable);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1485059902);
                                ComposerKt.sourceInformation(composer3, "246@10022L161");
                                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m6041getAlphaimpl(j2))), function22, composer3, ProvidedValue.$stable);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54);
            if (textStyle3 != null) {
                startRestartGroup.startReplaceGroup(-162878945);
                ComposerKt.sourceInformation(startRestartGroup, "253@10254L46");
                TextKt.ProvideTextStyle(textStyle3, rememberComposableLambda, startRestartGroup, ((i3 >> 3) & 14) | 48);
            } else {
                startRestartGroup.startReplaceGroup(-162877309);
                ComposerKt.sourceInformation(startRestartGroup, "253@10306L18");
                rememberComposableLambda.invoke(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            f2 = f3;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Decoration_euL9pac$lambda$6;
                    Decoration_euL9pac$lambda$6 = TextFieldImplKt.Decoration_euL9pac$lambda$6(j, textStyle2, f2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return Decoration_euL9pac$lambda$6;
                }
            });
        }
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit defaultErrorSemantics$lambda$7;
                defaultErrorSemantics$lambda$7 = TextFieldImplKt.defaultErrorSemantics$lambda$7(str, (SemanticsPropertyReceiver) obj);
                return defaultErrorSemantics$lambda$7;
            }
        }, 1, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit defaultErrorSemantics$lambda$7(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }
}
