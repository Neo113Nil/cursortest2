package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.decorator;

import Sc.InterfaceC4008j;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.DeliveryQuantityVO;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVH;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0001\u0018\u00002\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u001b\u00101\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001b\u00105\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*R\u0018\u00109\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010<R\u0016\u0010 \u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/decorator/RfbsCornerRoundedDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "", "dy", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;FLandroid/graphics/Canvas;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/decorator/RfbsCornerRoundedDecorator$IslandSeparatorType;", "type", "createIslandSeparator", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/decorator/RfbsCornerRoundedDecorator$IslandSeparatorType;)Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "showSeparator", "setShowSeparator", "(Z)V", "isRoundedSplitsFFEnabled", "setRoundedSplitsFFEnabled", "", "layoutVersion", "setLayoutVersion", "(Ljava/lang/Long;)V", "", "separatorHeight$delegate", "LSc/j;", "getSeparatorHeight", "()I", "separatorHeight", "defaultPhysicalPartHeight$delegate", "getDefaultPhysicalPartHeight", "defaultPhysicalPartHeight", "dp4$delegate", "getDp4", "dp4", "dp1$delegate", "getDp1", "()F", "dp1", "offset$delegate", "getOffset", "offset", "islandSeparatorTop", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "islandSeparatorBottom", "Z", "Ljava/lang/Long;", "IslandSeparatorType", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RfbsCornerRoundedDecorator extends RecyclerView.n {
    private boolean isRoundedSplitsFFEnabled;
    private IslandSeparatorView islandSeparatorBottom;
    private IslandSeparatorView islandSeparatorTop;
    private Long layoutVersion;

    /* renamed from: separatorHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j separatorHeight = LazyUtilsKt.unsafeLazy(RfbsCornerRoundedDecorator$separatorHeight$2.INSTANCE);

    /* renamed from: defaultPhysicalPartHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultPhysicalPartHeight = LazyUtilsKt.unsafeLazy(RfbsCornerRoundedDecorator$defaultPhysicalPartHeight$2.INSTANCE);

    /* renamed from: dp4$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp4 = LazyUtilsKt.unsafeLazy(RfbsCornerRoundedDecorator$dp4$2.INSTANCE);

    /* renamed from: dp1$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp1 = LazyUtilsKt.unsafeLazy(RfbsCornerRoundedDecorator$dp1$2.INSTANCE);

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j offset = LazyUtilsKt.unsafeLazy(RfbsCornerRoundedDecorator$offset$2.INSTANCE);
    private boolean showSeparator = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/decorator/RfbsCornerRoundedDecorator$IslandSeparatorType;", "", "<init>", "(Ljava/lang/String;I)V", "ROUND_TOP", "ROUND_BOTTOM", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    private final IslandSeparatorView createIslandSeparator(RecyclerView parent, IslandSeparatorType type) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IslandSeparatorView islandSeparatorView = new IslandSeparatorView(context, null, 0, 6, null);
        islandSeparatorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        islandSeparatorView.setElevation(getDp1());
        islandSeparatorView.setOutlineProvider(null);
        boolean z11 = type == IslandSeparatorType.ROUND_BOTTOM;
        boolean z12 = type == IslandSeparatorType.ROUND_TOP;
        int defaultPhysicalPartHeight = getDefaultPhysicalPartHeight();
        Context context2 = islandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(z11, z12, defaultPhysicalPartHeight, ThemeExtKt.themeColor(context2, R$attr.layerFloor0)));
        islandSeparatorView.measure(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getSeparatorHeight(), 1073741824));
        islandSeparatorView.layout(0, 0, parent.getWidth(), getSeparatorHeight());
        return islandSeparatorView;
    }

    private final void draw(IslandSeparatorView islandSeparatorView, float f7, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, f7);
        islandSeparatorView.draw(canvas);
        canvas.restore();
    }

    private final int getDefaultPhysicalPartHeight() {
        return ((Number) this.defaultPhysicalPartHeight.getValue()).intValue();
    }

    private final float getDp1() {
        return ((Number) this.dp1.getValue()).floatValue();
    }

    private final int getDp4() {
        return ((Number) this.dp4.getValue()).intValue();
    }

    private final int getOffset() {
        return ((Number) this.offset.getValue()).intValue();
    }

    private final int getSeparatorHeight() {
        return ((Number) this.separatorHeight.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Long l11;
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.showSeparator) {
            if (!this.isRoundedSplitsFFEnabled) {
                if (!(parent.getChildViewHolder(view) instanceof RealFbsSplitVH) || (l11 = this.layoutVersion) == null) {
                    return;
                }
                long longValue = l11.longValue();
                if (longValue == 1) {
                    outRect.top = getOffset();
                    return;
                } else if (longValue == 2) {
                    outRect.bottom = getOffset();
                    return;
                } else {
                    outRect.setEmpty();
                    return;
                }
            }
            Object adapter = parent.getAdapter();
            if (adapter != null && (adapter instanceof l) && (childAdapterPosition = parent.getChildAdapterPosition(view)) >= 0) {
                l lVar = (l) adapter;
                if (childAdapterPosition >= lVar.getItemCount() - 1) {
                    return;
                }
                int i11 = childAdapterPosition - 1;
                Object obj = lVar.a(i11) ? adapter : null;
                c b11 = obj != null ? ((l) obj).b(i11) : null;
                if ((b11 instanceof DeliveryQuantityVO) && ((DeliveryQuantityVO) b11).getHeader() == null) {
                    return;
                }
                if (!lVar.a(childAdapterPosition)) {
                    adapter = null;
                }
                if ((adapter != null ? ((l) adapter).b(childAdapterPosition) : null) instanceof RealFbsSplitVO) {
                    outRect.top = getDp4();
                    outRect.bottom = getDp4();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        RealFbsSplitVO.Footer footer;
        RealFbsSplitVO.Header header;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.showSeparator && this.isRoundedSplitsFFEnabled) {
            int childCount = parent.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                RecyclerView.C childViewHolder = parent.getChildViewHolder(parent.getChildAt(i11));
                if (childViewHolder instanceof RealFbsSplitVH) {
                    RealFbsSplitVH realFbsSplitVH = (RealFbsSplitVH) childViewHolder;
                    RealFbsSplitVO boundData = realFbsSplitVH.getBoundData();
                    if (boundData == null || (header = boundData.getHeader()) == null || header.getIsRounded()) {
                        if (this.islandSeparatorTop == null) {
                            this.islandSeparatorTop = createIslandSeparator(parent, IslandSeparatorType.ROUND_TOP);
                        }
                        IslandSeparatorView islandSeparatorView = this.islandSeparatorTop;
                        if (islandSeparatorView != null) {
                            draw(islandSeparatorView, realFbsSplitVH.itemView.getY(), canvas);
                        }
                    }
                    RealFbsSplitVO boundData2 = realFbsSplitVH.getBoundData();
                    if (boundData2 == null || (footer = boundData2.getFooter()) == null || footer.getIsRounded()) {
                        if (this.islandSeparatorBottom == null) {
                            this.islandSeparatorBottom = createIslandSeparator(parent, IslandSeparatorType.ROUND_BOTTOM);
                        }
                        IslandSeparatorView islandSeparatorView2 = this.islandSeparatorBottom;
                        if (islandSeparatorView2 != null) {
                            draw(islandSeparatorView2, (realFbsSplitVH.itemView.getY() + realFbsSplitVH.itemView.getHeight()) - (this.islandSeparatorBottom != null ? r2.getHeight() : 0), canvas);
                        }
                    }
                }
            }
        }
    }

    public final void setLayoutVersion(Long layoutVersion) {
        this.layoutVersion = layoutVersion;
    }

    public final void setRoundedSplitsFFEnabled(boolean isRoundedSplitsFFEnabled) {
        this.isRoundedSplitsFFEnabled = isRoundedSplitsFFEnabled;
    }

    public final void setShowSeparator(boolean showSeparator) {
        this.showSeparator = showSeparator;
    }
}
