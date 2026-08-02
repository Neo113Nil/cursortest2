package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv;

import Nh.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator.FiltersIslandSeparatorView;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.HeaderCell;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 C2\u00020\u0001:\u0001CBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)J%\u0010-\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00072\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J/\u00103\u001a\u00020\u00162\u0006\u00100\u001a\u00020/2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u0014\u0010B\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010;¨\u0006D"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/FilterValuesStickyHeaderItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "shouldFadeOutHeader", "Lkotlin/Function1;", "", "isSticky", "isHeader", "Landroid/view/View;", "topContainerView", "isSelectFilterValues", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View;Z)V", "itemPosition", "getHeaderViewForItem", "(ILandroidx/recyclerview/widget/RecyclerView;)Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", CommentV3DTO.HEADER_FIELD_NAME, "paddingTop", "", "drawHeader", "(Landroid/graphics/Canvas;Landroid/view/View;I)V", "currentHeader", "nextHeader", "moveHeader", "(Landroid/graphics/Canvas;Landroid/view/View;Landroid/view/View;I)V", "contactPoint", "getChildInContact", "(Landroidx/recyclerview/widget/RecyclerView;I)Landroid/view/View;", "Landroid/view/ViewGroup;", "view", "fixLayoutSize", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "getHeaderPositionForItem", "(I)I", "getIslandShift", "()I", "calculateAdditionalMarginForStickyHeader", "(Landroidx/recyclerview/widget/RecyclerView;)I", "currentPosition", "Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "shouldSkipDecoration", "(ILandroidx/recyclerview/widget/RecyclerView$g;)Z", "Landroid/graphics/Rect;", "outRect", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Z", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "islandOffset", "I", "Landroidx/core/view/GestureDetectorCompat;", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "Lkotlin/Pair;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Pair;", "statusBarHeight", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesStickyHeaderItemDecorator extends RecyclerView.n {
    private Pair<Integer, ? extends RecyclerView.C> currentHeader;

    @NotNull
    private final GestureDetectorCompat gestureDetector;

    @NotNull
    private final Function1<Integer, Boolean> isHeader;
    private final boolean isSelectFilterValues;

    @NotNull
    private final Function1<Integer, Boolean> isSticky;
    private final int islandOffset;
    private final boolean shouldFadeOutHeader;
    private final int statusBarHeight;

    @NotNull
    private final View topContainerView;

    public /* synthetic */ FilterValuesStickyHeaderItemDecorator(RecyclerView recyclerView, boolean z11, Function1 function1, Function1 function12, View view, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(recyclerView, (i11 & 2) != 0 ? false : z11, function1, function12, view, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateAdditionalMarginForStickyHeader(RecyclerView parent) {
        return this.topContainerView.getBottom() - (parent.getTop() <= 0 ? this.statusBarHeight : 0);
    }

    private final void drawHeader(Canvas canvas, View header, int paddingTop) {
        canvas.save();
        canvas.translate(0.0f, paddingTop);
        header.draw(canvas);
        canvas.restore();
    }

    private final void fixLayoutSize(ViewGroup parent, View view) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0);
        view.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, parent.getPaddingRight() + parent.getPaddingLeft(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, parent.getPaddingBottom() + parent.getPaddingTop(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final View getChildInContact(RecyclerView parent, int contactPoint) {
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            Rect rect = new Rect();
            parent.getDecoratedBoundsWithMargins(childAt, rect);
            if (rect.bottom > contactPoint && rect.top <= contactPoint) {
                return childAt;
            }
        }
        return null;
    }

    private final int getHeaderPositionForItem(int itemPosition) {
        while (!this.isSticky.invoke(Integer.valueOf(itemPosition)).booleanValue()) {
            itemPosition--;
            if (itemPosition < 0) {
                return -1;
            }
        }
        return itemPosition;
    }

    private final View getHeaderViewForItem(int itemPosition, RecyclerView parent) {
        int headerPositionForItem;
        Pair<Integer, ? extends RecyclerView.C> pair;
        RecyclerView.C f7;
        RecyclerView.C f11;
        RecyclerView.g adapter = parent.getAdapter();
        if (adapter == null || (headerPositionForItem = getHeaderPositionForItem(itemPosition)) == -1) {
            return null;
        }
        int itemViewType = adapter.getItemViewType(headerPositionForItem);
        Pair<Integer, ? extends RecyclerView.C> pair2 = this.currentHeader;
        if (pair2 != null && pair2.e().intValue() == headerPositionForItem && (pair = this.currentHeader) != null && (f7 = pair.f()) != null && f7.getItemViewType() == itemViewType) {
            Pair<Integer, ? extends RecyclerView.C> pair3 = this.currentHeader;
            if (pair3 == null || (f11 = pair3.f()) == null) {
                return null;
            }
            return f11.itemView;
        }
        RecyclerView.C createViewHolder = adapter.createViewHolder(parent, itemViewType);
        Intrinsics.checkNotNullExpressionValue(createViewHolder, "createViewHolder(...)");
        adapter.onBindViewHolder(createViewHolder, headerPositionForItem);
        View itemView = createViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        fixLayoutSize(parent, itemView);
        this.currentHeader = new Pair<>(Integer.valueOf(headerPositionForItem), createViewHolder);
        return createViewHolder.itemView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getIslandShift() {
        Pair<Integer, ? extends RecyclerView.C> pair = this.currentHeader;
        int intValue = pair != null ? pair.e().intValue() : 0;
        if (this.isSelectFilterValues && this.isHeader.invoke(Integer.valueOf(intValue)).booleanValue()) {
            return Math.abs(this.islandOffset);
        }
        return 0;
    }

    private final void moveHeader(Canvas canvas, View currentHeader, View nextHeader, int paddingTop) {
        canvas.save();
        if (this.shouldFadeOutHeader) {
            canvas.saveLayerAlpha(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), (int) (((nextHeader.getTop() - paddingTop) / nextHeader.getHeight()) * 255));
        } else {
            canvas.clipRect(0, paddingTop, canvas.getWidth(), currentHeader.getHeight() + paddingTop);
        }
        canvas.translate(0.0f, (nextHeader.getTop() - currentHeader.getHeight()) + getIslandShift());
        currentHeader.draw(canvas);
        if (this.shouldFadeOutHeader) {
            canvas.restore();
        }
        canvas.restore();
    }

    private final boolean shouldSkipDecoration(int currentPosition, RecyclerView.g<?> adapter) {
        return !this.isSelectFilterValues || currentPosition == -1 || adapter == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = a.a(parent, "parent", state, "state", view);
        RecyclerView.g adapter = parent.getAdapter();
        if (shouldSkipDecoration(a11, adapter)) {
            outRect.setEmpty();
        } else if (this.isSticky.invoke(Integer.valueOf(a11)).booleanValue() && adapter != null && adapter.getItemViewType(a11) == HeaderCell.INSTANCE.getViewType()) {
            outRect.set(0, 0, 0, this.islandOffset);
        } else {
            outRect.setEmpty();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        View headerViewForItem;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, parent, state);
        int calculateAdditionalMarginForStickyHeader = calculateAdditionalMarginForStickyHeader(parent);
        View findChildViewUnder = parent.findChildViewUnder(parent.getPaddingLeft(), parent.getPaddingTop() + calculateAdditionalMarginForStickyHeader);
        if (findChildViewUnder == null) {
            this.currentHeader = null;
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(findChildViewUnder);
        if (childAdapterPosition == -1 || (headerViewForItem = getHeaderViewForItem(childAdapterPosition, parent)) == null) {
            return;
        }
        View childInContact = getChildInContact(parent, ((parent.getPaddingTop() + headerViewForItem.getBottom()) + calculateAdditionalMarginForStickyHeader) - getIslandShift());
        if (childInContact == null) {
            return;
        }
        if (this.isSticky.invoke(Integer.valueOf(parent.getChildAdapterPosition(childInContact))).booleanValue()) {
            moveHeader(canvas, headerViewForItem, childInContact, parent.getPaddingTop() + calculateAdditionalMarginForStickyHeader);
        } else {
            drawHeader(canvas, headerViewForItem, parent.getPaddingTop() + calculateAdditionalMarginForStickyHeader);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterValuesStickyHeaderItemDecorator(@NotNull final RecyclerView parent, boolean z11, @NotNull Function1<? super Integer, Boolean> isSticky, @NotNull Function1<? super Integer, Boolean> isHeader, @NotNull View topContainerView, boolean z12) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(isSticky, "isSticky");
        Intrinsics.checkNotNullParameter(isHeader, "isHeader");
        Intrinsics.checkNotNullParameter(topContainerView, "topContainerView");
        this.shouldFadeOutHeader = z11;
        this.isSticky = isSticky;
        this.isHeader = isHeader;
        this.topContainerView = topContainerView;
        this.isSelectFilterValues = z12;
        this.islandOffset = -FiltersIslandSeparatorView.INSTANCE.getCornersHeightPx();
        this.gestureDetector = new GestureDetectorCompat(parent.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.FilterValuesStickyHeaderItemDecorator$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                return true;
            }
        });
        parent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.FilterValuesStickyHeaderItemDecorator$special$$inlined$doOnEachNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                Intrinsics.f(view);
                FilterValuesStickyHeaderItemDecorator.this.currentHeader = null;
            }
        });
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.statusBarHeight = ResourceExtKt.getStatusBarHeight(context);
        parent.addOnItemTouchListener(new RecyclerView.y() { // from class: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.FilterValuesStickyHeaderItemDecorator.2
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                Pair pair;
                RecyclerView.C c11;
                View view;
                RecyclerView.C c12;
                View view2;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                int calculateAdditionalMarginForStickyHeader = FilterValuesStickyHeaderItemDecorator.this.calculateAdditionalMarginForStickyHeader(parent);
                if (FilterValuesStickyHeaderItemDecorator.this.gestureDetector.a(motionEvent)) {
                    Pair pair2 = FilterValuesStickyHeaderItemDecorator.this.currentHeader;
                    r1 = motionEvent.getY() <= ((float) ((pair2 == null || (c12 = (RecyclerView.C) pair2.f()) == null || (view2 = c12.itemView) == null) ? 0 : (view2.getBottom() + calculateAdditionalMarginForStickyHeader) - FilterValuesStickyHeaderItemDecorator.this.getIslandShift()));
                    if (r1 && (pair = FilterValuesStickyHeaderItemDecorator.this.currentHeader) != null && (c11 = (RecyclerView.C) pair.f()) != null && (view = c11.itemView) != null) {
                        view.performClick();
                    }
                }
                return r1;
            }
        });
    }
}
