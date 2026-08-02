package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015H&¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\u0004\u0018\u00010\u001f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u0006\u0010\u001e\u001a\u00020\u000fH&¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J/\u0010'\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010(JC\u0010-\u001a\u00020\n*\u00020\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000fH\u0004¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010\u001fH\u0004¢\u0006\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u00101\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/decorator/BaseGridOffsetColorDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "drawBackgroundForWidget", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V", "updateColor", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V", "", "spanPosition", "Landroid/graphics/Rect;", "outRect", "itemOffsetWithSpanPosition", "(ILandroid/graphics/Rect;)V", "Ljava/lang/Class;", "Landroidx/recyclerview/widget/RecyclerView$C;", "decoratedVhClass", "", "needDecorate", "(Ljava/lang/Class;)Z", "Lm10/l;", "Lru/ozon/app/android/composer/view/DecoratedAdapter;", "adapter", "position", "", "getBackgroundColorToken", "(Lm10/l;I)Ljava/lang/String;", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "left", "right", "top", "bottom", "updateRect", "(Landroid/graphics/Rect;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/content/Context;", "context", "color", "getBackgroundColorOrDefault", "(Landroid/content/Context;Ljava/lang/String;)I", "Landroid/graphics/drawable/ColorDrawable;", "colorDrawable", "Landroid/graphics/drawable/ColorDrawable;", "bounds", "Landroid/graphics/Rect;", "Ljava/lang/Integer;", "getColor", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseGridOffsetColorDecorator extends RecyclerView.n {
    private Integer color;

    @NotNull
    private final ColorDrawable colorDrawable = new ColorDrawable();

    @NotNull
    private final Rect bounds = new Rect();

    private final void drawBackgroundForWidget(Canvas canvas, RecyclerView parent, View child) {
        parent.getDecoratedBoundsWithMargins(child, this.bounds);
        updateColor(parent, child);
        this.colorDrawable.setBounds(this.bounds);
        this.colorDrawable.draw(canvas);
    }

    private final void updateColor(RecyclerView parent, View child) {
        if (this.color == null) {
            Object adapter = parent.getAdapter();
            l lVar = adapter instanceof l ? (l) adapter : null;
            if (lVar == null) {
                return;
            }
            String backgroundColorToken = getBackgroundColorToken(lVar, parent.getChildAdapterPosition(child));
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.color = Integer.valueOf(getBackgroundColorOrDefault(context, backgroundColorToken));
        }
        Integer num = this.color;
        if (num != null) {
            this.colorDrawable.setColor(num.intValue());
        }
    }

    public static /* synthetic */ void updateRect$default(BaseGridOffsetColorDecorator baseGridOffsetColorDecorator, Rect rect, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRect");
        }
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        if ((i11 & 4) != 0) {
            num3 = null;
        }
        if ((i11 & 8) != 0) {
            num4 = null;
        }
        baseGridOffsetColorDecorator.updateRect(rect, num, num2, num3, num4);
    }

    protected final int getBackgroundColorOrDefault(@NotNull Context context, String color) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StyleParser.INSTANCE.parseColor(context, color, R$color.transparent);
    }

    public abstract String getBackgroundColorToken(@NotNull l adapter, int position);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        RecyclerView.g adapter;
        int intValue;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.C findContainingViewHolder = parent.findContainingViewHolder(view);
        if (findContainingViewHolder == null || !needDecorate(findContainingViewHolder.getClass())) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer num = null;
        if (!(layoutParams instanceof GridLayoutManager.b)) {
            layoutParams = null;
        }
        GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
        if (bVar == null) {
            return;
        }
        RecyclerView.o layoutManager = parent.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager.g() == 1200 && (adapter = parent.getAdapter()) != null) {
            Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
            int intValue2 = valueOf.intValue();
            if (intValue2 < 0 || intValue2 >= adapter.getCardsCount()) {
                valueOf = null;
            }
            Integer valueOf2 = Integer.valueOf(gridLayoutManager.getPosition(view));
            int intValue3 = valueOf2.intValue();
            if (intValue3 >= 0 && intValue3 < adapter.getCardsCount()) {
                num = valueOf2;
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else if (num == null) {
                return;
            } else {
                intValue = num.intValue();
            }
            int spanSize = gridLayoutManager.k().getSpanSize(intValue);
            int c11 = bVar.c();
            itemOffsetWithSpanPosition(c11 == 0 ? 0 : c11 / spanSize, outRect);
        }
    }

    public abstract void itemOffsetWithSpanPosition(int spanPosition, @NotNull Rect outRect);

    public abstract boolean needDecorate(@NotNull Class<? extends RecyclerView.C> decoratedVhClass);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        this.color = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            if (needDecorate(parent.getChildViewHolder(childAt).getClass())) {
                Intrinsics.f(childAt);
                drawBackgroundForWidget(canvas, parent, childAt);
            }
        }
    }

    protected final void updateRect(@NotNull Rect rect, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        rect.set(num != null ? num.intValue() : rect.left, num3 != null ? num3.intValue() : rect.top, num2 != null ? num2.intValue() : rect.right, num4 != null ? num4.intValue() : rect.bottom);
    }
}
