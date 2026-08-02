package com.google.accompanist.placeholder;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: Placeholder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PlaceholderKt$placeholder$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ long $color;
    final /* synthetic */ Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> $contentFadeTransitionSpec;
    final /* synthetic */ PlaceholderHighlight $highlight;
    final /* synthetic */ Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> $placeholderFadeTransitionSpec;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlaceholderKt$placeholder$4(Function3<? super Transition.Segment<Boolean>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function3, Function3<? super Transition.Segment<Boolean>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> function32, PlaceholderHighlight placeholderHighlight, boolean z, long j, Shape shape) {
        super(3);
        this.$placeholderFadeTransitionSpec = function3;
        this.$contentFadeTransitionSpec = function32;
        this.$highlight = placeholderHighlight;
        this.$visible = z;
        this.$color = j;
        this.$shape = shape;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-1214629560);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1214629560, i, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:137)");
        }
        composer2.startReplaceableGroup(804161266);
        Object rememberedValue = composer2.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Ref();
            composer2.updateRememberedValue(rememberedValue);
        }
        final Ref ref = (Ref) rememberedValue;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804161321);
        Object rememberedValue2 = composer2.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Ref();
            composer2.updateRememberedValue(rememberedValue2);
        }
        final Ref ref2 = (Ref) rememberedValue2;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804161379);
        Object rememberedValue3 = composer2.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Ref();
            composer2.updateRememberedValue(rememberedValue3);
        }
        final Ref ref3 = (Ref) rememberedValue3;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804161492);
        Object rememberedValue4 = composer2.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composer2.updateRememberedValue(rememberedValue4);
        }
        final MutableState mutableState = (MutableState) rememberedValue4;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804161591);
        boolean z = this.$visible;
        Object rememberedValue5 = composer2.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new MutableTransitionState(Boolean.valueOf(z));
            composer2.updateRememberedValue(rememberedValue5);
        }
        MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue5;
        composer2.endReplaceableGroup();
        mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(this.$visible));
        Transition updateTransition = TransitionKt.updateTransition(mutableTransitionState, "placeholder_crossfade", composer2, MutableTransitionState.$stable | 48, 0);
        Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = this.$placeholderFadeTransitionSpec;
        ComposerKt.sourceInformationMarkerStart(composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        boolean booleanValue = ((Boolean) updateTransition.getCurrentState()).booleanValue();
        composer2.startReplaceableGroup(-2085173843);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085173843, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:153)");
        }
        float f = booleanValue ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        Float valueOf = Float.valueOf(f);
        boolean booleanValue2 = ((Boolean) updateTransition.getTargetState()).booleanValue();
        composer2.startReplaceableGroup(-2085173843);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085173843, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:153)");
        }
        float f2 = booleanValue2 ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        final State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), function3.invoke(updateTransition.getSegment(), composer2, 0), vectorConverter, "placeholder_fade", composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> function32 = this.$contentFadeTransitionSpec;
        ComposerKt.sourceInformationMarkerStart(composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        boolean booleanValue3 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
        composer2.startReplaceableGroup(992792551);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(992792551, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:158)");
        }
        float f3 = booleanValue3 ? 0.0f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        Float valueOf2 = Float.valueOf(f3);
        boolean booleanValue4 = ((Boolean) updateTransition.getTargetState()).booleanValue();
        composer2.startReplaceableGroup(992792551);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(992792551, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:158)");
        }
        float f4 = booleanValue4 ? 0.0f : 1.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), function32.invoke(updateTransition.getSegment(), composer2, 0), vectorConverter2, "content_fade", composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        PlaceholderHighlight placeholderHighlight = this.$highlight;
        InfiniteRepeatableSpec<Float> animationSpec = placeholderHighlight != null ? placeholderHighlight.getAnimationSpec() : null;
        composer2.startReplaceableGroup(804162378);
        if (animationSpec != null && (this.$visible || invoke$lambda$9(createTransitionAnimation) >= 0.01f)) {
            State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, composer2, 0, 1), 0.0f, 1.0f, animationSpec, null, composer, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            composer2 = composer;
            invoke$lambda$5(mutableState, animateFloat.getValue().floatValue());
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804162715);
        Object rememberedValue6 = composer2.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = AndroidPaint_androidKt.Paint();
            composer2.updateRememberedValue(rememberedValue6);
        }
        final Paint paint = (Paint) rememberedValue6;
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(804162740);
        boolean changed = composer2.changed(this.$color) | composer2.changed(this.$shape) | composer2.changed(this.$highlight);
        final Shape shape = this.$shape;
        final long j = this.$color;
        final PlaceholderHighlight placeholderHighlight2 = this.$highlight;
        Object rememberedValue7 = composer2.rememberedValue();
        if (changed || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = DrawModifierKt.drawWithContent(composed, new Function1<ContentDrawScope, Unit>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$4$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope drawWithContent) {
                    float invoke$lambda$11;
                    float invoke$lambda$112;
                    float invoke$lambda$9;
                    float invoke$lambda$92;
                    float invoke$lambda$4;
                    Outline m11062drawPlaceholderhpmOzss;
                    float invoke$lambda$93;
                    float invoke$lambda$42;
                    Outline m11062drawPlaceholderhpmOzss2;
                    float invoke$lambda$113;
                    Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                    invoke$lambda$11 = PlaceholderKt$placeholder$4.invoke$lambda$11(createTransitionAnimation2);
                    if (0.01f > invoke$lambda$11 || invoke$lambda$11 > 0.99f) {
                        invoke$lambda$112 = PlaceholderKt$placeholder$4.invoke$lambda$11(createTransitionAnimation2);
                        if (invoke$lambda$112 >= 0.99f) {
                            drawWithContent.drawContent();
                        }
                    } else {
                        Paint paint2 = Paint.this;
                        invoke$lambda$113 = PlaceholderKt$placeholder$4.invoke$lambda$11(createTransitionAnimation2);
                        paint2.setAlpha(invoke$lambda$113);
                        ContentDrawScope contentDrawScope = drawWithContent;
                        Paint paint3 = Paint.this;
                        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
                        canvas.saveLayer(SizeKt.m5861toRectuvyYCjk(contentDrawScope.mo6618getSizeNHjbRc()), paint3);
                        drawWithContent.drawContent();
                        canvas.restore();
                    }
                    invoke$lambda$9 = PlaceholderKt$placeholder$4.invoke$lambda$9(createTransitionAnimation);
                    if (0.01f > invoke$lambda$9 || invoke$lambda$9 > 0.99f) {
                        invoke$lambda$92 = PlaceholderKt$placeholder$4.invoke$lambda$9(createTransitionAnimation);
                        if (invoke$lambda$92 >= 0.99f) {
                            Ref<Outline> ref4 = ref3;
                            Shape shape2 = shape;
                            long j2 = j;
                            PlaceholderHighlight placeholderHighlight3 = placeholderHighlight2;
                            invoke$lambda$4 = PlaceholderKt$placeholder$4.invoke$lambda$4(mutableState);
                            m11062drawPlaceholderhpmOzss = PlaceholderKt.m11062drawPlaceholderhpmOzss(drawWithContent, shape2, j2, placeholderHighlight3, invoke$lambda$4, ref3.getValue(), ref2.getValue(), ref.getValue());
                            ref4.setValue(m11062drawPlaceholderhpmOzss);
                        }
                    } else {
                        Paint paint4 = Paint.this;
                        invoke$lambda$93 = PlaceholderKt$placeholder$4.invoke$lambda$9(createTransitionAnimation);
                        paint4.setAlpha(invoke$lambda$93);
                        ContentDrawScope contentDrawScope2 = drawWithContent;
                        Paint paint5 = Paint.this;
                        Ref<Outline> ref5 = ref3;
                        Shape shape3 = shape;
                        long j3 = j;
                        PlaceholderHighlight placeholderHighlight4 = placeholderHighlight2;
                        Ref<LayoutDirection> ref6 = ref2;
                        Ref<Size> ref7 = ref;
                        MutableState<Float> mutableState2 = mutableState;
                        Canvas canvas2 = contentDrawScope2.getDrawContext().getCanvas();
                        canvas2.saveLayer(SizeKt.m5861toRectuvyYCjk(contentDrawScope2.mo6618getSizeNHjbRc()), paint5);
                        invoke$lambda$42 = PlaceholderKt$placeholder$4.invoke$lambda$4(mutableState2);
                        m11062drawPlaceholderhpmOzss2 = PlaceholderKt.m11062drawPlaceholderhpmOzss(contentDrawScope2, shape3, j3, placeholderHighlight4, invoke$lambda$42, ref5.getValue(), ref6.getValue(), ref7.getValue());
                        ref5.setValue(m11062drawPlaceholderhpmOzss2);
                        canvas2.restore();
                    }
                    ref.setValue(Size.m5828boximpl(drawWithContent.mo6618getSizeNHjbRc()));
                    ref2.setValue(drawWithContent.getLayoutDirection());
                }
            });
            composer2.updateRememberedValue(rememberedValue7);
        }
        Modifier modifier = (Modifier) rememberedValue7;
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$4(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void invoke$lambda$5(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }
}
