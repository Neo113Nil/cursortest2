package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: LazyGridMeasuredItem.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u000e\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020DJ:\u0010E\u001a\u00020?2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003J+\u0010I\u001a\u00020\u0013*\u00020\u00132\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030KH\u0082\bø\u0001\u0000¢\u0006\u0004\bL\u0010MR\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\"R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010'\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u000e\u0010)\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010.R&\u0010/\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00103\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00105\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001bR\u001c\u00107\u001a\u000208X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00102\u001a\u0004\b9\u00101R\u0016\u0010\u0012\u001a\u00020\u0013X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00102R\u0018\u0010:\u001a\u00020\u0003*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0018\u0010%\u001a\u00020\u0003*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", FirebaseAnalytics.Param.INDEX, "", "key", "", "isVertical", "", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeContentPadding", "afterContentPadding", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "contentType", "animator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "column", "getColumn", "()I", "getContentType", "()Ljava/lang/Object;", "crossAxisOffset", "getCrossAxisOffset", "getCrossAxisSize", "getIndex", "()Z", "getKey", "mainAxisLayoutSize", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "maxMainAxisOffset", "minMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "()J", "J", "placeablesCount", "getPlaceablesCount", "row", "getRow", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "mainAxis", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "getParentData", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", X3.i.L, "mainAxisOffset", "layoutWidth", "layoutHeight", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyGridItemPlacementAnimator animator;
    private final int beforeContentPadding;
    private int column;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, list, j, obj2, lazyGridItemPlacementAnimator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, List<? extends Placeable> list, long j, Object obj2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        long IntSize;
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = list;
        this.visualOffset = j;
        this.contentType = obj2;
        this.animator = lazyGridItemPlacementAnimator;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = (Placeable) list.get(i7);
            i6 = Math.max(i6, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i6;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(i3 + i6, 0);
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, i6);
        } else {
            IntSize = IntSizeKt.IntSize(i6, this.crossAxisSize);
        }
        this.size = IntSize;
        this.offset = IntOffset.INSTANCE.m4578getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getKey() {
        return this.key;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    public final Object getParentData(int index) {
        return this.placeables.get(index).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m4568getXimpl(getOffset()) : IntOffset.m4569getYimpl(getOffset());
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    public final void setNonScrollableItem(boolean z) {
        this.nonScrollableItem = z;
    }

    public static /* synthetic */ void position$default(LazyGridMeasuredItem lazyGridMeasuredItem, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            i5 = -1;
        }
        if ((i7 & 32) != 0) {
            i6 = -1;
        }
        lazyGridMeasuredItem.position(i, i2, i3, i4, i5, i6);
    }

    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        long IntOffset;
        boolean z = this.isVertical;
        this.mainAxisLayoutSize = z ? layoutHeight : layoutWidth;
        if (!z) {
            layoutWidth = layoutHeight;
        }
        if (z && this.layoutDirection == LayoutDirection.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        if (this.isVertical) {
            IntOffset = IntOffsetKt.IntOffset(crossAxisOffset, mainAxisOffset);
        } else {
            IntOffset = IntOffsetKt.IntOffset(mainAxisOffset, crossAxisOffset);
        }
        this.offset = IntOffset;
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void applyScrollDelta(int delta) {
        if (this.nonScrollableItem) {
            return;
        }
        long offset = getOffset();
        int m4568getXimpl = this.isVertical ? IntOffset.m4568getXimpl(offset) : IntOffset.m4568getXimpl(offset) + delta;
        boolean z = this.isVertical;
        int m4569getYimpl = IntOffset.m4569getYimpl(offset);
        if (z) {
            m4569getYimpl += delta;
        }
        this.offset = IntOffsetKt.IntOffset(m4568getXimpl, m4569getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long rawOffset = animation.getRawOffset();
                int m4568getXimpl2 = this.isVertical ? IntOffset.m4568getXimpl(rawOffset) : Integer.valueOf(IntOffset.m4568getXimpl(rawOffset) + delta).intValue();
                boolean z2 = this.isVertical;
                int m4569getYimpl2 = IntOffset.m4569getYimpl(rawOffset);
                if (z2) {
                    m4569getYimpl2 += delta;
                }
                animation.m738setRawOffsetgyyYBs(IntOffsetKt.IntOffset(m4568getXimpl2, m4569getYimpl2));
            }
        }
    }

    public final void place(Placeable.PlacementScope scope) {
        Placeable.PlacementScope placementScope;
        int m4568getXimpl;
        int m4569getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        int i = 0;
        while (i < placeablesCount) {
            Placeable placeable = this.placeables.get(i);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i2 = this.maxMainAxisOffset;
            long offset = getOffset();
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i);
            if (animation != null) {
                long m735getPlacementDeltanOccac = animation.m735getPlacementDeltanOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m4568getXimpl(offset) + IntOffset.m4568getXimpl(m735getPlacementDeltanOccac), IntOffset.m4569getYimpl(offset) + IntOffset.m4569getYimpl(m735getPlacementDeltanOccac));
                if ((m725getMainAxisgyyYBs(offset) <= mainAxisSize && m725getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m725getMainAxisgyyYBs(offset) >= i2 && m725getMainAxisgyyYBs(IntOffset) >= i2)) {
                    animation.cancelPlacementAnimation();
                }
                offset = IntOffset;
            }
            if (this.reverseLayout) {
                if (this.isVertical) {
                    m4568getXimpl = IntOffset.m4568getXimpl(offset);
                } else {
                    m4568getXimpl = (this.mainAxisLayoutSize - IntOffset.m4568getXimpl(offset)) - getMainAxisSize(placeable);
                }
                if (this.isVertical) {
                    m4569getYimpl = (this.mainAxisLayoutSize - IntOffset.m4569getYimpl(offset)) - getMainAxisSize(placeable);
                } else {
                    m4569getYimpl = IntOffset.m4569getYimpl(offset);
                }
                offset = IntOffsetKt.IntOffset(m4568getXimpl, m4569getYimpl);
            }
            long j = this.visualOffset;
            long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m4568getXimpl(offset) + IntOffset.m4568getXimpl(j), IntOffset.m4569getYimpl(offset) + IntOffset.m4569getYimpl(j));
            if (this.isVertical) {
                placementScope = scope;
                Placeable.PlacementScope.m3438placeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, null, 6, null);
            } else {
                placementScope = scope;
                Placeable.PlacementScope.m3437placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, null, 6, null);
            }
            i++;
            scope = placementScope;
        }
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m725getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m4569getYimpl(j) : IntOffset.m4568getXimpl(j);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m724copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int m4568getXimpl = this.isVertical ? IntOffset.m4568getXimpl(j) : function1.invoke(Integer.valueOf(IntOffset.m4568getXimpl(j))).intValue();
        boolean z = this.isVertical;
        int m4569getYimpl = IntOffset.m4569getYimpl(j);
        if (z) {
            m4569getYimpl = function1.invoke(Integer.valueOf(m4569getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(m4568getXimpl, m4569getYimpl);
    }
}
