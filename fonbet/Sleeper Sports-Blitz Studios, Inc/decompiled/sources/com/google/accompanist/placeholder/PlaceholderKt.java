package com.google.accompanist.placeholder;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Placeholder.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aX\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0094\u0001\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2*\b\u0002\u0010\u0016\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u0017¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2*\b\u0002\u0010\u001c\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u0017¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a.\u0010\u001f\u001a\u00020 *\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\u0017¢\u0006\u0002\b\u001bH\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$²\u0006\n\u0010%\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"drawPlaceholder", "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "highlight", "Lcom/google/accompanist/placeholder/PlaceholderHighlight;", "progress", "", "lastOutline", "lastLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastSize", "Landroidx/compose/ui/geometry/Size;", "drawPlaceholder-hpmOzss", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Shape;JLcom/google/accompanist/placeholder/PlaceholderHighlight;FLandroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Size;)Landroidx/compose/ui/graphics/Outline;", "placeholder", "Landroidx/compose/ui/Modifier;", ViewProps.VISIBLE, "", "placeholderFadeTransitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "contentFadeTransitionSpec", "placeholder-cf5BqRc", "(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/ui/graphics/Shape;Lcom/google/accompanist/placeholder/PlaceholderHighlight;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "withLayer", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawBlock", "placeholder_release", "highlightProgress", "placeholderAlpha", "contentAlpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceholderKt {
    /* renamed from: placeholder-cf5BqRc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m11064placeholdercf5BqRc$default(Modifier modifier, boolean z, long j, Shape shape, PlaceholderHighlight placeholderHighlight, Function3 function3, Function3 function32, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        Shape shape2 = shape;
        if ((i & 8) != 0) {
            placeholderHighlight = null;
        }
        PlaceholderHighlight placeholderHighlight2 = placeholderHighlight;
        if ((i & 16) != 0) {
            function3 = new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$1
                public final SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(segment, "$this$null");
                    composer.startReplaceableGroup(87515116);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(87515116, i2, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:124)");
                    }
                    SpringSpec<Float> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return spring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
                    return invoke(segment, composer, num.intValue());
                }
            };
        }
        return m11063placeholdercf5BqRc(modifier, z, j, shape2, placeholderHighlight2, function3, (i & 32) != 0 ? new Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder$2
            public final SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(segment, "$this$null");
                composer.startReplaceableGroup(-439090190);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-439090190, i2, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:125)");
                }
                SpringSpec<Float> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return spring$default;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
                return invoke(segment, composer, num.intValue());
            }
        } : function32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawPlaceholder-hpmOzss, reason: not valid java name */
    public static final Outline m11062drawPlaceholderhpmOzss(DrawScope drawScope, Shape shape, long j, PlaceholderHighlight placeholderHighlight, float f, Outline outline, LayoutDirection layoutDirection, Size size) {
        Outline outline2 = null;
        if (shape == RectangleShapeKt.getRectangleShape()) {
            DrawScope.m6612drawRectnJ9OG0$default(drawScope, j, 0L, 0L, 0.0f, null, null, 0, 126, null);
            if (placeholderHighlight != null) {
                DrawScope.m6611drawRectAsUm42w$default(drawScope, placeholderHighlight.mo11055brushd16Qtg0(f, drawScope.mo6618getSizeNHjbRc()), 0L, 0L, placeholderHighlight.alpha(f), null, null, 0, 118, null);
            }
            return null;
        }
        if (Size.m5835equalsimpl(drawScope.mo6618getSizeNHjbRc(), size) && drawScope.getLayoutDirection() == layoutDirection) {
            outline2 = outline;
        }
        if (outline2 == null) {
            outline2 = shape.mo646createOutlinePq9zytI(drawScope.mo6618getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope);
        }
        Outline outline3 = outline2;
        OutlineKt.m6310drawOutlinewDX37Ww$default(drawScope, outline3, j, 0.0f, null, null, 0, 60, null);
        if (placeholderHighlight != null) {
            OutlineKt.m6308drawOutlinehn5TExg$default(drawScope, outline3, placeholderHighlight.mo11055brushd16Qtg0(f, drawScope.mo6618getSizeNHjbRc()), placeholderHighlight.alpha(f), null, null, 0, 56, null);
        }
        return outline3;
    }

    @Deprecated(message = "\naccompanist/placeholder is deprecated and the API is no longer maintained. \nWe recommend forking the implementation and customising it to your needs. \nFor more information please visit https://google.github.io/accompanist/placeholder\n")
    /* renamed from: placeholder-cf5BqRc, reason: not valid java name */
    public static final Modifier m11063placeholdercf5BqRc(Modifier placeholder, final boolean z, final long j, final Shape shape, final PlaceholderHighlight placeholderHighlight, Function3<? super Transition.Segment<Boolean>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> placeholderFadeTransitionSpec, Function3<? super Transition.Segment<Boolean>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> contentFadeTransitionSpec) {
        Intrinsics.checkNotNullParameter(placeholder, "$this$placeholder");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(placeholderFadeTransitionSpec, "placeholderFadeTransitionSpec");
        Intrinsics.checkNotNullParameter(contentFadeTransitionSpec, "contentFadeTransitionSpec");
        return ComposedModifierKt.composed(placeholder, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.google.accompanist.placeholder.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("placeholder");
                inspectorInfo.setValue(Boolean.valueOf(z));
                inspectorInfo.getProperties().set(ViewProps.VISIBLE, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("color", Color.m6029boximpl(j));
                inspectorInfo.getProperties().set("highlight", placeholderHighlight);
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new PlaceholderKt$placeholder$4(placeholderFadeTransitionSpec, contentFadeTransitionSpec, placeholderHighlight, z, j, shape));
    }

    private static final void withLayer(DrawScope drawScope, Paint paint, Function1<? super DrawScope, Unit> function1) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        canvas.saveLayer(SizeKt.m5861toRectuvyYCjk(drawScope.mo6618getSizeNHjbRc()), paint);
        function1.invoke(drawScope);
        canvas.restore();
    }
}
