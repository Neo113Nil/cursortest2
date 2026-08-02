package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jµ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2e\u0010\u000f\u001aa\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e5, code lost:
    
        if (r35 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b5, code lost:
    
        if (r35 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0267, code lost:
    
        if (r13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cc  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1589TransitionDTcfvLk(final InputPhase inputState, long j, final long j2, final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> contentColor, final boolean z, final Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        long j3;
        float f;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        boolean changed;
        State state;
        boolean changed2;
        Object rememberedValue;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1988729962);
        ComposerKt.sourceInformation(startRestartGroup, "C(Transition)P(3,2:c#ui.graphics.Color,5:c#ui.graphics.Color,1,4)276@11184L59,278@11285L325,289@11657L1101,317@12806L299,327@13151L186,333@13347L140:TextFieldImpl.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(inputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            j3 = j;
            i2 |= startRestartGroup.changed(j3) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(contentColor) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(content) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            Transition updateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", startRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-611722692);
                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(1847725064);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            InputPhase inputPhase = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1158004136);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            int i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
            float f4 = 0.0f;
            if (i6 != 1) {
                if (i6 == 2) {
                    f = 0.0f;
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase2 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1158004136);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f2 = 0.0f;
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer2, int i7) {
                                    TweenSpec tween;
                                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                                    composer2.startReplaceableGroup(-1079955085);
                                    if (animateFloat.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                        tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                                    } else if (animateFloat.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                        tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                                    } else {
                                        tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                    }
                                    composer2.endReplaceableGroup();
                                    return tween;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(1399891485);
                            ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(1847725064);
                            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                            InputPhase inputPhase3 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1376159017);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase3.ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                f3 = 0.0f;
                                startRestartGroup.endReplaceableGroup();
                                Float valueOf2 = Float.valueOf(f3);
                                InputPhase inputPhase4 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1376159017);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase4.ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i7) {
                                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                            composer2.startReplaceableGroup(-130058045);
                                            TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    startRestartGroup.startReplaceableGroup(-1462136984);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                    InputPhase inputPhase5 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                    long j4 = WhenMappings.$EnumSwitchMapping$0[inputPhase5.ordinal()] == 1 ? j3 : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    ColorSpace m2116getColorSpaceimpl = Color.m2116getColorSpaceimpl(j4);
                                    startRestartGroup.startReplaceableGroup(-3686930);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    changed = startRestartGroup.changed(m2116getColorSpaceimpl);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed) {
                                        state = createTransitionAnimation2;
                                    } else {
                                        state = createTransitionAnimation2;
                                    }
                                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    startRestartGroup.endReplaceableGroup();
                                    TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue2;
                                    startRestartGroup.startReplaceableGroup(1847725064);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase6 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                    long j5 = WhenMappings.$EnumSwitchMapping$0[inputPhase6.ordinal()] == 1 ? j3 : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    Color m2102boximpl = Color.m2102boximpl(j5);
                                    InputPhase inputPhase7 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                    long j6 = WhenMappings.$EnumSwitchMapping$0[inputPhase7.ordinal()] == 1 ? j3 : j2;
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, m2102boximpl, Color.m2102boximpl(j6), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                            return invoke(segment, composer2, num.intValue());
                                        }

                                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i7) {
                                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                            composer2.startReplaceableGroup(-32667848);
                                            TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                            composer2.endReplaceableGroup();
                                            return tween$default;
                                        }
                                    };
                                    int i7 = (i2 & 7168) | RendererCapabilities.MODE_SUPPORT_MASK;
                                    startRestartGroup.startReplaceableGroup(-1462136984);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                    ColorSpace m2116getColorSpaceimpl2 = Color.m2116getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i7 >> 6) & 112)).m2122unboximpl());
                                    startRestartGroup.startReplaceableGroup(-3686930);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(m2116getColorSpaceimpl2);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl2);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.startReplaceableGroup(1847725064);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                    int i8 = ((((i7 << 3) & 57344) | 3136) >> 9) & 112;
                                    State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i8)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i8)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue, "LabelContentColor", startRestartGroup, 229376);
                                    startRestartGroup = startRestartGroup;
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    content.invoke(Float.valueOf(m1585Transition_DTcfvLk$lambda1(createTransitionAnimation)), Color.m2102boximpl(m1587Transition_DTcfvLk$lambda5(createTransitionAnimation3)), Color.m2102boximpl(m1588Transition_DTcfvLk$lambda6(createTransitionAnimation4)), Float.valueOf(m1586Transition_DTcfvLk$lambda3(state)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                                }
                                f4 = 1.0f;
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                        return invoke(segment, composer2, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i72) {
                                        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                        composer2.startReplaceableGroup(-130058045);
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                startRestartGroup.startReplaceableGroup(-1462136984);
                                ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                InputPhase inputPhase52 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase52.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                ColorSpace m2116getColorSpaceimpl3 = Color.m2116getColorSpaceimpl(j4);
                                startRestartGroup.startReplaceableGroup(-3686930);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(m2116getColorSpaceimpl3);
                                Object rememberedValue22 = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                rememberedValue22 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl3);
                                startRestartGroup.updateRememberedValue(rememberedValue22);
                                startRestartGroup.endReplaceableGroup();
                                TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue22;
                                startRestartGroup.startReplaceableGroup(1847725064);
                                ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                InputPhase inputPhase62 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase62.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Color m2102boximpl2 = Color.m2102boximpl(j5);
                                InputPhase inputPhase72 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase72.ordinal()] == 1) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, m2102boximpl2, Color.m2102boximpl(j6), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                        return invoke(segment, composer2, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i72) {
                                        Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                        composer2.startReplaceableGroup(-32667848);
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                        composer2.endReplaceableGroup();
                                        return tween$default;
                                    }
                                };
                                int i72 = (i2 & 7168) | RendererCapabilities.MODE_SUPPORT_MASK;
                                startRestartGroup.startReplaceableGroup(-1462136984);
                                ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                                ColorSpace m2116getColorSpaceimpl22 = Color.m2116getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i72 >> 6) & 112)).m2122unboximpl());
                                startRestartGroup.startReplaceableGroup(-3686930);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(m2116getColorSpaceimpl22);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl22);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.startReplaceableGroup(1847725064);
                                ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                                int i82 = ((((i72 << 3) & 57344) | 3136) >> 9) & 112;
                                State createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i82)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i82)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue, "LabelContentColor", startRestartGroup, 229376);
                                startRestartGroup = startRestartGroup;
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                content.invoke(Float.valueOf(m1585Transition_DTcfvLk$lambda1(createTransitionAnimation)), Color.m2102boximpl(m1587Transition_DTcfvLk$lambda5(createTransitionAnimation32)), Color.m2102boximpl(m1588Transition_DTcfvLk$lambda6(createTransitionAnimation42)), Float.valueOf(m1586Transition_DTcfvLk$lambda3(state)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                            }
                            f3 = 1.0f;
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase42 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1376159017);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase42.ordinal()];
                            if (i5 != 1) {
                            }
                            f4 = 1.0f;
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i722) {
                                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                    composer2.startReplaceableGroup(-130058045);
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            startRestartGroup.startReplaceableGroup(-1462136984);
                            ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                            InputPhase inputPhase522 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase522.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            ColorSpace m2116getColorSpaceimpl32 = Color.m2116getColorSpaceimpl(j4);
                            startRestartGroup.startReplaceableGroup(-3686930);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(m2116getColorSpaceimpl32);
                            Object rememberedValue222 = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            rememberedValue222 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl32);
                            startRestartGroup.updateRememberedValue(rememberedValue222);
                            startRestartGroup.endReplaceableGroup();
                            TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue222;
                            startRestartGroup.startReplaceableGroup(1847725064);
                            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                            InputPhase inputPhase622 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase622.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Color m2102boximpl22 = Color.m2102boximpl(j5);
                            InputPhase inputPhase722 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase722.ordinal()] == 1) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, m2102boximpl22, Color.m2102boximpl(j6), textFieldTransitionScope$Transition$labelTextStyleColor$222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter22, "LabelTextStyleColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i722) {
                                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                                    composer2.startReplaceableGroup(-32667848);
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                    composer2.endReplaceableGroup();
                                    return tween$default;
                                }
                            };
                            int i722 = (i2 & 7168) | RendererCapabilities.MODE_SUPPORT_MASK;
                            startRestartGroup.startReplaceableGroup(-1462136984);
                            ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                            ColorSpace m2116getColorSpaceimpl222 = Color.m2116getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i722 >> 6) & 112)).m2122unboximpl());
                            startRestartGroup.startReplaceableGroup(-3686930);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(m2116getColorSpaceimpl222);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl222);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(1847725064);
                            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                            int i822 = ((((i722 << 3) & 57344) | 3136) >> 9) & 112;
                            State createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i822)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i822)), textFieldTransitionScope$Transition$labelContentColor$222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue, "LabelContentColor", startRestartGroup, 229376);
                            startRestartGroup = startRestartGroup;
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            content.invoke(Float.valueOf(m1585Transition_DTcfvLk$lambda1(createTransitionAnimation)), Color.m2102boximpl(m1587Transition_DTcfvLk$lambda5(createTransitionAnimation322)), Color.m2102boximpl(m1588Transition_DTcfvLk$lambda6(createTransitionAnimation422)), Float.valueOf(m1586Transition_DTcfvLk$lambda3(state)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer2, int i73) {
                            TweenSpec tween;
                            Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                            composer2.startReplaceableGroup(-1079955085);
                            if (animateFloat.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                            } else if (animateFloat.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                            } else {
                                tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            }
                            composer2.endReplaceableGroup();
                            return tween;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(1399891485);
                    ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(1847725064);
                    ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    InputPhase inputPhase32 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1376159017);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase32.ordinal()];
                    if (i4 != 1) {
                    }
                    f3 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf222 = Float.valueOf(f3);
                    InputPhase inputPhase422 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1376159017);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase422.ordinal()];
                    if (i5 != 1) {
                    }
                    f4 = 1.0f;
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$22.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i7222) {
                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                            composer2.startReplaceableGroup(-130058045);
                            TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    startRestartGroup.startReplaceableGroup(-1462136984);
                    ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                    InputPhase inputPhase5222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase5222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ColorSpace m2116getColorSpaceimpl322 = Color.m2116getColorSpaceimpl(j4);
                    startRestartGroup.startReplaceableGroup(-3686930);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m2116getColorSpaceimpl322);
                    Object rememberedValue2222 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    rememberedValue2222 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl322);
                    startRestartGroup.updateRememberedValue(rememberedValue2222);
                    startRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue2222;
                    startRestartGroup.startReplaceableGroup(1847725064);
                    ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    InputPhase inputPhase6222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase6222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Color m2102boximpl222 = Color.m2102boximpl(j5);
                    InputPhase inputPhase7222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase7222.ordinal()] == 1) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, m2102boximpl222, Color.m2102boximpl(j6), textFieldTransitionScope$Transition$labelTextStyleColor$2222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter222, "LabelTextStyleColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i7222) {
                            Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                            composer2.startReplaceableGroup(-32667848);
                            TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                            composer2.endReplaceableGroup();
                            return tween$default;
                        }
                    };
                    int i7222 = (i2 & 7168) | RendererCapabilities.MODE_SUPPORT_MASK;
                    startRestartGroup.startReplaceableGroup(-1462136984);
                    ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
                    ColorSpace m2116getColorSpaceimpl2222 = Color.m2116getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i7222 >> 6) & 112)).m2122unboximpl());
                    startRestartGroup.startReplaceableGroup(-3686930);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(m2116getColorSpaceimpl2222);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl2222);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(1847725064);
                    ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
                    int i8222 = ((((i7222 << 3) & 57344) | 3136) >> 9) & 112;
                    State createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i8222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i8222)), textFieldTransitionScope$Transition$labelContentColor$2222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue, "LabelContentColor", startRestartGroup, 229376);
                    startRestartGroup = startRestartGroup;
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    content.invoke(Float.valueOf(m1585Transition_DTcfvLk$lambda1(createTransitionAnimation5)), Color.m2102boximpl(m1587Transition_DTcfvLk$lambda5(createTransitionAnimation3222)), Color.m2102boximpl(m1588Transition_DTcfvLk$lambda6(createTransitionAnimation4222)), Float.valueOf(m1586Transition_DTcfvLk$lambda3(state)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                } else if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            startRestartGroup.endReplaceableGroup();
            Float valueOf3 = Float.valueOf(f);
            InputPhase inputPhase22 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1158004136);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase22.ordinal()];
            if (i3 != 1) {
            }
            f2 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> animateFloat, Composer composer2, int i73) {
                    TweenSpec tween;
                    Intrinsics.checkNotNullParameter(animateFloat, "$this$animateFloat");
                    composer2.startReplaceableGroup(-1079955085);
                    if (animateFloat.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                        tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                    } else if (animateFloat.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || animateFloat.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                        tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                    } else {
                        tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    composer2.endReplaceableGroup();
                    return tween;
                }
            };
            startRestartGroup.startReplaceableGroup(1399891485);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateFloat)P(2)925@36712L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(1847725064);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            InputPhase inputPhase322 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1376159017);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase322.ordinal()];
            if (i4 != 1) {
            }
            f3 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            Float valueOf2222 = Float.valueOf(f3);
            InputPhase inputPhase4222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1376159017);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase4222.ordinal()];
            if (i5 != 1) {
            }
            f4 = 1.0f;
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$222.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i72222) {
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-130058045);
                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1462136984);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
            InputPhase inputPhase52222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase52222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m2116getColorSpaceimpl3222 = Color.m2116getColorSpaceimpl(j4);
            startRestartGroup.startReplaceableGroup(-3686930);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m2116getColorSpaceimpl3222);
            Object rememberedValue22222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            rememberedValue22222 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl3222);
            startRestartGroup.updateRememberedValue(rememberedValue22222);
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue22222;
            startRestartGroup.startReplaceableGroup(1847725064);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            InputPhase inputPhase62222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase62222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            Color m2102boximpl2222 = Color.m2102boximpl(j5);
            InputPhase inputPhase72222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase72222.ordinal()] == 1) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, m2102boximpl2222, Color.m2102boximpl(j6), textFieldTransitionScope$Transition$labelTextStyleColor$22222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2222, "LabelTextStyleColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> animateColor, Composer composer2, int i72222) {
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-32667848);
                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            int i72222 = (i2 & 7168) | RendererCapabilities.MODE_SUPPORT_MASK;
            startRestartGroup.startReplaceableGroup(-1462136984);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
            ColorSpace m2116getColorSpaceimpl22222 = Color.m2116getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i72222 >> 6) & 112)).m2122unboximpl());
            startRestartGroup.startReplaceableGroup(-3686930);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(m2116getColorSpaceimpl22222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl22222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1847725064);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            int i82222 = ((((i72222 << 3) & 57344) | 3136) >> 9) & 112;
            State createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i82222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i82222)), textFieldTransitionScope$Transition$labelContentColor$22222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue, "LabelContentColor", startRestartGroup, 229376);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            content.invoke(Float.valueOf(m1585Transition_DTcfvLk$lambda1(createTransitionAnimation52)), Color.m2102boximpl(m1587Transition_DTcfvLk$lambda5(createTransitionAnimation32222)), Color.m2102boximpl(m1588Transition_DTcfvLk$lambda6(createTransitionAnimation42222)), Float.valueOf(m1586Transition_DTcfvLk$lambda3(state)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final long j7 = j3;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$1
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

            public final void invoke(Composer composer2, int i9) {
                TextFieldTransitionScope.this.m1589TransitionDTcfvLk(inputState, j7, j2, contentColor, z, content, composer2, i | 1);
            }
        });
    }

    /* renamed from: Transition_DTcfvLk$lambda-1, reason: not valid java name */
    private static final float m1585Transition_DTcfvLk$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-3, reason: not valid java name */
    private static final float m1586Transition_DTcfvLk$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-5, reason: not valid java name */
    private static final long m1587Transition_DTcfvLk$lambda5(State<Color> state) {
        return state.getValue().m2122unboximpl();
    }

    /* renamed from: Transition_DTcfvLk$lambda-6, reason: not valid java name */
    private static final long m1588Transition_DTcfvLk$lambda6(State<Color> state) {
        return state.getValue().m2122unboximpl();
    }
}
