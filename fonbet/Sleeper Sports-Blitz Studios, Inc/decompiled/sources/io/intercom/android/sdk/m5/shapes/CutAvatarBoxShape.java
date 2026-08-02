package io.intercom.android.sdk.m5.shapes;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CutAvatarBoxShape.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/shapes/CutAvatarBoxShape;", "Landroidx/compose/ui/graphics/Shape;", "shape", "cut", "Landroidx/compose/ui/unit/Dp;", "cutsOffsets", "", "Lkotlin/Pair;", "<init>", "(Landroidx/compose/ui/graphics/Shape;FLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "createOutline", "Landroidx/compose/ui/graphics/Outline;", RRWebVideoEvent.JsonKeys.SIZE, "Landroidx/compose/ui/geometry/Size;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "getOffset", "Landroidx/compose/ui/geometry/Offset;", "", "xOffset", "yOffset", "getOffset-Rc2DDho", "(FFFLandroidx/compose/ui/unit/LayoutDirection;)J", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CutAvatarBoxShape implements Shape {
    public static final int $stable = 0;
    private final float cut;
    private final List<Pair<Dp, Dp>> cutsOffsets;
    private final Shape shape;

    /* compiled from: CutAvatarBoxShape.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CutAvatarBoxShape(Shape shape, float f, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, f, list);
    }

    private CutAvatarBoxShape(Shape shape, float f, List<Pair<Dp, Dp>> cutsOffsets) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(cutsOffsets, "cutsOffsets");
        this.shape = shape;
        this.cut = f;
        this.cutsOffsets = cutsOffsets;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo646createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float mo744toPx0680j_4 = density.mo744toPx0680j_4(this.cut);
        Path Path = AndroidPath_androidKt.Path();
        OutlineKt.addOutline(Path, this.shape.mo646createOutlinePq9zytI(size, layoutDirection, density));
        Path Path2 = AndroidPath_androidKt.Path();
        Shape shape = this.shape;
        float intBitsToFloat = Float.intBitsToFloat((int) (size >> 32)) + mo744toPx0680j_4;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L)) + mo744toPx0680j_4;
        OutlineKt.addOutline(Path2, shape.mo646createOutlinePq9zytI(Size.m5831constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), layoutDirection, density));
        Path Path3 = AndroidPath_androidKt.Path();
        List<Pair<Dp, Dp>> list = this.cutsOffsets;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Path3.mo5903addPathUv8p0NA(Path2, m12603getOffsetRc2DDho(mo744toPx0680j_4 / 2, density.mo744toPx0680j_4(((Dp) pair.component1()).m8812unboximpl()), density.mo744toPx0680j_4(((Dp) pair.component2()).m8812unboximpl()), layoutDirection));
            arrayList.add(Unit.INSTANCE);
        }
        Path Path4 = AndroidPath_androidKt.Path();
        Path4.mo5905opN5in7k0(Path, Path3, PathOperation.INSTANCE.m6343getDifferenceb3I0S0c());
        return new Outline.Generic(Path4);
    }

    /* renamed from: getOffset-Rc2DDho, reason: not valid java name */
    private final long m12603getOffsetRc2DDho(float cut, float xOffset, float yOffset, LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            float f = yOffset - cut;
            return Offset.m5763constructorimpl((Float.floatToRawIntBits(xOffset - cut) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float f2 = yOffset - cut;
        return Offset.m5763constructorimpl((Float.floatToRawIntBits((-xOffset) - cut) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }
}
