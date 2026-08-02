package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.decoration;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.databinding.PdpWidgetIslandSeparatorBinding;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemVO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleVO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleWidgetViewHolder;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\t*\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/decoration/CartSplitRoundedDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Canvas;", "Landroid/view/View;", "view", "", "dy", "", "drawSeparator", "(Landroid/graphics/Canvas;Landroid/view/View;F)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "isDisableRounding", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)Z", "Ll20/c;", "getItemVoOfView", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Ll20/c;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "canvas", "draw", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;FLandroid/graphics/Canvas;)V", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/decoration/CartSplitRoundedDecoration$IslandSeparatorType;", "type", "createIslandSeparator", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/decoration/CartSplitRoundedDecoration$IslandSeparatorType;)Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "outRect", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "islandSeparatorTop", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "islandSeparatorBottom", "rect", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Companion", "IslandSeparatorType", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitRoundedDecoration extends RecyclerView.n {
    private IslandSeparatorView islandSeparatorBottom;
    private IslandSeparatorView islandSeparatorTop;
    private Paint paint;

    @NotNull
    private final Rect rect;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int separatorHeight = (int) IslandSeparatorView.INSTANCE.getCORNER_HEIGHT_PX();
    private static final int dp8 = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/decoration/CartSplitRoundedDecoration$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/decoration/CartSplitRoundedDecoration$IslandSeparatorType;", "", "<init>", "(Ljava/lang/String;I)V", "ROUND_TOP", "ROUND_BOTTOM", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IslandSeparatorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IslandSeparatorType[] $VALUES;
        public static final IslandSeparatorType ROUND_TOP = new IslandSeparatorType("ROUND_TOP", 0);
        public static final IslandSeparatorType ROUND_BOTTOM = new IslandSeparatorType("ROUND_BOTTOM", 1);

        private static final /* synthetic */ IslandSeparatorType[] $values() {
            return new IslandSeparatorType[]{ROUND_TOP, ROUND_BOTTOM};
        }

        static {
            IslandSeparatorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IslandSeparatorType(String str, int i11) {
        }

        public static IslandSeparatorType valueOf(String str) {
            return (IslandSeparatorType) Enum.valueOf(IslandSeparatorType.class, str);
        }

        public static IslandSeparatorType[] values() {
            return (IslandSeparatorType[]) $VALUES.clone();
        }
    }

    public CartSplitRoundedDecoration() {
        Rect rect = new Rect();
        rect.bottom = dp8;
        this.rect = rect;
    }

    private final IslandSeparatorView createIslandSeparator(RecyclerView parent, IslandSeparatorType type) {
        IslandSeparatorView islandSeparatorView = PdpWidgetIslandSeparatorBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false).islandSeparatorV;
        boolean z11 = type == IslandSeparatorType.ROUND_BOTTOM;
        boolean z12 = type == IslandSeparatorType.ROUND_TOP;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = islandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(z11, z12, 0, styleParser.parseColor(context, (String) null, R$color.layer_floor_0), 4, null));
        Intrinsics.checkNotNullExpressionValue(islandSeparatorView, "apply(...)");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824);
        int i11 = separatorHeight;
        islandSeparatorView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        islandSeparatorView.layout(0, 0, parent.getWidth(), i11);
        return islandSeparatorView;
    }

    private final void draw(IslandSeparatorView islandSeparatorView, float f7, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, f7);
        islandSeparatorView.draw(canvas);
        canvas.restore();
    }

    private final void drawSeparator(Canvas canvas, View view, float f7) {
        Paint paint = this.paint;
        if (paint == null) {
            paint = new Paint();
            paint.setColor(view.getContext().getColor(R$color.layer_floor_1));
            this.paint = paint;
        }
        this.rect.right = view.getRight();
        int save = canvas.save();
        canvas.translate(0.0f, f7);
        try {
            canvas.drawRect(this.rect, paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    private final c getItemVoOfView(RecyclerView recyclerView, View view) {
        int childAdapterPosition;
        Object adapter = recyclerView.getAdapter();
        if (adapter != null && (adapter instanceof l) && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) >= 0) {
            l lVar = (l) adapter;
            if (childAdapterPosition < lVar.getItemCount() - 1) {
                if (!lVar.a(childAdapterPosition)) {
                    adapter = null;
                }
                if (adapter != null) {
                    return ((l) adapter).b(childAdapterPosition);
                }
            }
        }
        return null;
    }

    private final boolean isDisableRounding(View view, RecyclerView parent) {
        CartSplitV2TitleVO.Header header;
        c itemVoOfView = getItemVoOfView(parent, view);
        CartSplitV2TitleVO cartSplitV2TitleVO = itemVoOfView instanceof CartSplitV2TitleVO ? (CartSplitV2TitleVO) itemVoOfView : null;
        return (cartSplitV2TitleVO == null || (header = cartSplitV2TitleVO.getHeader()) == null || !header.getDisableRounding()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (getItemVoOfView(parent, view) instanceof CartSplitV2TitleVO) {
            outRect.top = dp8;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        RecyclerView.C childViewHolder;
        CartSplitV2ItemVO boundedData;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            if (childAt != null && (childViewHolder = parent.getChildViewHolder(childAt)) != null) {
                if (childViewHolder instanceof CartSplitV2TitleWidgetViewHolder) {
                    float y11 = childAt.getY() - dp8;
                    if (isDisableRounding(childAt, parent)) {
                        drawSeparator(canvas, childAt, y11);
                    } else {
                        if (this.islandSeparatorTop == null) {
                            this.islandSeparatorTop = createIslandSeparator(parent, IslandSeparatorType.ROUND_TOP);
                        }
                        IslandSeparatorView islandSeparatorView = this.islandSeparatorTop;
                        if (islandSeparatorView != null) {
                            draw(islandSeparatorView, y11, canvas);
                        }
                    }
                } else if ((childViewHolder instanceof CartSplitV2ItemWidgetViewHolder) && (boundedData = ((CartSplitV2ItemWidgetViewHolder) childViewHolder).getBoundedData()) != null && boundedData.getRoundBottom()) {
                    if (this.islandSeparatorBottom == null) {
                        this.islandSeparatorBottom = createIslandSeparator(parent, IslandSeparatorType.ROUND_BOTTOM);
                    }
                    IslandSeparatorView islandSeparatorView2 = this.islandSeparatorBottom;
                    if (islandSeparatorView2 != null) {
                        draw(islandSeparatorView2, (childViewHolder.itemView.getY() + childViewHolder.itemView.getHeight()) - (this.islandSeparatorBottom != null ? r3.getHeight() : 0), canvas);
                    }
                }
            }
        }
    }
}
