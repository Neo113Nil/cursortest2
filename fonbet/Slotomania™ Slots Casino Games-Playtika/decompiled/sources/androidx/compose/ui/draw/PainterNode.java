package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u000207H\u0016J\f\u00108\u001a\u000209*\u00020:H\u0016J\u0016\u0010;\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010=J\u001c\u0010@\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010F\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016J&\u0010H\u001a\u00020I*\u00020J2\u0006\u0010C\u001a\u00020K2\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010O\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010'\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "getSizeToIntrinsics", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public /* synthetic */ PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != Size.INSTANCE.m1948getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo113measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo3383measureBRTryo0 = measurable.mo3383measureBRTryo0(m1782modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, mo3383measureBRTryo0.getWidth(), mo3383measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m1782modifyConstraintsZezNO4M = m1782modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m4398getMinWidthimpl(m1782modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m1782modifyConstraintsZezNO4M = m1782modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m4398getMinWidthimpl(m1782modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m1782modifyConstraintsZezNO4M = m1782modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m4397getMinHeightimpl(m1782modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m1782modifyConstraintsZezNO4M = m1782modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m4397getMinHeightimpl(m1782modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m1779calculateScaledSizeE7KxVPU(long dstSize) {
        float m1940getWidthimpl;
        float m1937getHeightimpl;
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        if (!m1781hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize())) {
            m1940getWidthimpl = Size.m1940getWidthimpl(dstSize);
        } else {
            m1940getWidthimpl = Size.m1940getWidthimpl(this.painter.getIntrinsicSize());
        }
        if (!m1780hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize())) {
            m1937getHeightimpl = Size.m1937getHeightimpl(dstSize);
        } else {
            m1937getHeightimpl = Size.m1937getHeightimpl(this.painter.getIntrinsicSize());
        }
        long Size = SizeKt.Size(m1940getWidthimpl, m1937getHeightimpl);
        if (Size.m1940getWidthimpl(dstSize) != 0.0f && Size.m1937getHeightimpl(dstSize) != 0.0f) {
            return ScaleFactorKt.m3469timesUQTWf7w(Size, this.contentScale.mo3374computeScaleFactorH7hwNQA(Size, dstSize));
        }
        return Size.INSTANCE.m1949getZeroNHjbRc();
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m1782modifyConstraintsZezNO4M(long constraints) {
        int m4398getMinWidthimpl;
        int m4397getMinHeightimpl;
        boolean z = Constraints.m4392getHasBoundedWidthimpl(constraints) && Constraints.m4391getHasBoundedHeightimpl(constraints);
        boolean z2 = Constraints.m4394getHasFixedWidthimpl(constraints) && Constraints.m4393getHasFixedHeightimpl(constraints);
        if ((!getUseIntrinsicSize() && z) || z2) {
            return Constraints.m4387copyZbe2FdA$default(constraints, Constraints.m4396getMaxWidthimpl(constraints), 0, Constraints.m4395getMaxHeightimpl(constraints), 0, 10, null);
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (m1781hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize)) {
            m4398getMinWidthimpl = MathKt.roundToInt(Size.m1940getWidthimpl(intrinsicSize));
        } else {
            m4398getMinWidthimpl = Constraints.m4398getMinWidthimpl(constraints);
        }
        if (m1780hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize)) {
            m4397getMinHeightimpl = MathKt.roundToInt(Size.m1937getHeightimpl(intrinsicSize));
        } else {
            m4397getMinHeightimpl = Constraints.m4397getMinHeightimpl(constraints);
        }
        long m1779calculateScaledSizeE7KxVPU = m1779calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m4410constrainWidthK40F9xA(constraints, m4398getMinWidthimpl), ConstraintsKt.m4409constrainHeightK40F9xA(constraints, m4397getMinHeightimpl)));
        return Constraints.m4387copyZbe2FdA$default(constraints, ConstraintsKt.m4410constrainWidthK40F9xA(constraints, MathKt.roundToInt(Size.m1940getWidthimpl(m1779calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m4409constrainHeightK40F9xA(constraints, MathKt.roundToInt(Size.m1937getHeightimpl(m1779calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float m1940getWidthimpl;
        float m1937getHeightimpl;
        long m1949getZeroNHjbRc;
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (m1781hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize)) {
            m1940getWidthimpl = Size.m1940getWidthimpl(intrinsicSize);
        } else {
            m1940getWidthimpl = Size.m1940getWidthimpl(contentDrawScope.mo2662getSizeNHjbRc());
        }
        if (m1780hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize)) {
            m1937getHeightimpl = Size.m1937getHeightimpl(intrinsicSize);
        } else {
            m1937getHeightimpl = Size.m1937getHeightimpl(contentDrawScope.mo2662getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m1940getWidthimpl, m1937getHeightimpl);
        if (Size.m1940getWidthimpl(contentDrawScope.mo2662getSizeNHjbRc()) != 0.0f && Size.m1937getHeightimpl(contentDrawScope.mo2662getSizeNHjbRc()) != 0.0f) {
            m1949getZeroNHjbRc = ScaleFactorKt.m3469timesUQTWf7w(Size, this.contentScale.mo3374computeScaleFactorH7hwNQA(Size, contentDrawScope.mo2662getSizeNHjbRc()));
        } else {
            m1949getZeroNHjbRc = Size.INSTANCE.m1949getZeroNHjbRc();
        }
        long j = m1949getZeroNHjbRc;
        long mo1748alignKFBX0sM = this.alignment.mo1748alignKFBX0sM(IntSizeKt.IntSize(MathKt.roundToInt(Size.m1940getWidthimpl(j)), MathKt.roundToInt(Size.m1937getHeightimpl(j))), IntSizeKt.IntSize(MathKt.roundToInt(Size.m1940getWidthimpl(contentDrawScope.mo2662getSizeNHjbRc())), MathKt.roundToInt(Size.m1937getHeightimpl(contentDrawScope.mo2662getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m4568getXimpl = IntOffset.m4568getXimpl(mo1748alignKFBX0sM);
        float m4569getYimpl = IntOffset.m4569getYimpl(mo1748alignKFBX0sM);
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        contentDrawScope2.getDrawContext().getTransform().translate(m4568getXimpl, m4569getYimpl);
        this.painter.m2738drawx_KDEd0(contentDrawScope2, j, this.alpha, this.colorFilter);
        contentDrawScope2.getDrawContext().getTransform().translate(-m4568getXimpl, -m4569getYimpl);
        contentDrawScope.drawContent();
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m1781hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (Size.m1936equalsimpl0(j, Size.INSTANCE.m1948getUnspecifiedNHjbRc())) {
            return false;
        }
        float m1940getWidthimpl = Size.m1940getWidthimpl(j);
        return (Float.isInfinite(m1940getWidthimpl) || Float.isNaN(m1940getWidthimpl)) ? false : true;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m1780hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (Size.m1936equalsimpl0(j, Size.INSTANCE.m1948getUnspecifiedNHjbRc())) {
            return false;
        }
        float m1937getHeightimpl = Size.m1937getHeightimpl(j);
        return (Float.isInfinite(m1937getHeightimpl) || Float.isNaN(m1937getHeightimpl)) ? false : true;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
