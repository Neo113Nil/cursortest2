package ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\f\b\u0011\u0018\u00002\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0013\u0010\u0017\u001a\u00020\n*\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u000eJ7\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "clearAllViews", "()V", "addAllViews", "", "widthMeasureSpec", "heightMeasureSpec", "measureLayoutChildren", "(II)V", "", "Landroid/view/View;", "centerWidth", "measure", "(Ljava/util/List;III)I", "layoutLeftViews", "layoutRightViews", "layoutPlaceholderContainer", "computeTop", "(Landroid/view/View;)I", "onMeasure", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/widget/FrameLayout;", "placeholderContainer", "Landroid/widget/FrameLayout;", "getPlaceholderContainer", "()Landroid/widget/FrameLayout;", "", "leftViews", "Ljava/util/List;", "rightViews", "maxHeight", "I", "leftOffset", "rightOffset", "getCenterHeight", "()I", "centerHeight", "LayoutBuilder", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class RoundedNavBarLayout extends ViewGroup {
    private int leftOffset;

    @NotNull
    private final List<View> leftViews;
    private int maxHeight;

    @NotNull
    private final FrameLayout placeholderContainer;
    private int rightOffset;

    @NotNull
    private final List<View> rightViews;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarLayout$LayoutBuilder;", "", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarLayout;)V", "addLeftView", "", "view", "Landroid/view/View;", "addRightView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected final class LayoutBuilder {
        public LayoutBuilder() {
        }

        public final void addLeftView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            RoundedNavBarLayout.this.leftViews.add(view);
        }

        public final void addRightView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            RoundedNavBarLayout.this.rightViews.add(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedNavBarLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.placeholderContainer = frameLayout;
        this.leftViews = new ArrayList();
        this.rightViews = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAllViews() {
        Iterator it = C7714v.p0(C7714v.a0(this.placeholderContainer), C7714v.p0(this.rightViews, this.leftViews)).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            addViewInLayout((View) next, i11, getLayoutParams(), true);
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAllViews() {
        removeAllViewsInLayout();
        this.leftViews.clear();
        this.rightViews.clear();
    }

    private final int computeTop(View view) {
        return getCenterHeight() - (view.getMeasuredHeight() / 2);
    }

    private final int getCenterHeight() {
        return ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
    }

    private final void layoutLeftViews() {
        this.leftOffset = getPaddingLeft();
        for (View view : this.leftViews) {
            LayoutExtKt.layoutLeftTop(view, this.leftOffset, computeTop(view));
            this.leftOffset = view.getMeasuredWidth() + this.leftOffset;
        }
    }

    private final void layoutPlaceholderContainer() {
        int max = Math.max(this.leftOffset, getMeasuredWidth() - this.rightOffset);
        FrameLayout frameLayout = this.placeholderContainer;
        LayoutExtKt.layoutLeftTop(frameLayout, max, computeTop(frameLayout));
    }

    private final void layoutRightViews() {
        this.rightOffset = getMeasuredWidth() - getPaddingRight();
        for (View view : this.rightViews) {
            LayoutExtKt.layoutRightTop(view, this.rightOffset, computeTop(view));
            this.rightOffset -= view.getMeasuredWidth();
        }
    }

    private final int measure(List<? extends View> list, int i11, int i12, int i13) {
        int i14 = 0;
        for (View view : list) {
            measureChild(view, i11, i12);
            boolean z11 = view.getMeasuredWidth() + i14 <= i13;
            view.setVisibility(z11 ? 0 : 8);
            if (z11) {
                i14 += view.getMeasuredWidth();
            }
            this.maxHeight = Math.max(this.maxHeight, view.getMeasuredHeight());
        }
        return i14;
    }

    private final void measureLayoutChildren(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxHeight = 0;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i11 = size / 2;
        measureChild(this.placeholderContainer, View.MeasureSpec.makeMeasureSpec(size - (Math.max(measure(this.leftViews, widthMeasureSpec, heightMeasureSpec, i11), measure(this.rightViews, widthMeasureSpec, heightMeasureSpec, i11)) * 2), 1073741824), heightMeasureSpec);
        this.maxHeight = Math.max(this.maxHeight, this.placeholderContainer.getMeasuredHeight());
    }

    @NotNull
    public final FrameLayout getPlaceholderContainer() {
        return this.placeholderContainer;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        layoutLeftViews();
        layoutRightViews();
        layoutPlaceholderContainer();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureLayoutChildren(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + this.maxHeight, 1073741824));
    }
}
