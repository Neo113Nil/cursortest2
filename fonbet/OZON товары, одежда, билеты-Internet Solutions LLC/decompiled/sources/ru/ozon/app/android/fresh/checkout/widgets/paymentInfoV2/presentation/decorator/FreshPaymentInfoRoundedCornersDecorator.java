package ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.decorator;

import Sc.InterfaceC4008j;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorViewHolder;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.FreshPaymentInfoWidgetViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001b\u0010.\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/decorator/FreshPaymentInfoRoundedCornersDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "", "dy", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;FLandroid/graphics/Canvas;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "initIslandSeparators", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/decorator/FreshPaymentInfoRoundedCornersDecorator$IslandSeparatorType;", "type", "createIslandSeparator", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/decorator/FreshPaymentInfoRoundedCornersDecorator$IslandSeparatorType;)Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "", "vhHeight", "setSeparatorsState", "(I)V", "i", "", "checkSeparators", "(Landroidx/recyclerview/widget/RecyclerView;I)Z", "Landroidx/recyclerview/widget/RecyclerView$C;", "getSeparatorViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;I)Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "separatorHeight$delegate", "LSc/j;", "getSeparatorHeight", "()I", "separatorHeight", "dp8$delegate", "getDp8", "dp8", "dp1$delegate", "getDp1", "()F", "dp1", "islandSeparatorTop", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "islandSeparatorBottom", "vhPrevHeight", "I", "drawSeparators", "Z", "IslandSeparatorType", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshPaymentInfoRoundedCornersDecorator extends RecyclerView.n {
    private boolean drawSeparators;
    private IslandSeparatorView islandSeparatorBottom;
    private IslandSeparatorView islandSeparatorTop;

    /* renamed from: separatorHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j separatorHeight = LazyUtilsKt.unsafeLazy(FreshPaymentInfoRoundedCornersDecorator$separatorHeight$2.INSTANCE);

    /* renamed from: dp8$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp8 = LazyUtilsKt.unsafeLazy(FreshPaymentInfoRoundedCornersDecorator$dp8$2.INSTANCE);

    /* renamed from: dp1$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dp1 = LazyUtilsKt.unsafeLazy(FreshPaymentInfoRoundedCornersDecorator$dp1$2.INSTANCE);
    private int vhPrevHeight = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/paymentInfoV2/presentation/decorator/FreshPaymentInfoRoundedCornersDecorator$IslandSeparatorType;", "", "<init>", "(Ljava/lang/String;I)V", "ROUND_TOP", "ROUND_BOTTOM", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    private final boolean checkSeparators(RecyclerView parent, int i11) {
        return (getSeparatorViewHolder(parent, i11 + (-1)) instanceof IslandSeparatorViewHolder) && (getSeparatorViewHolder(parent, i11 + 1) instanceof IslandSeparatorViewHolder);
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
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = islandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(z11, z12, 0, styleParser.parseColor(context2, (String) null, StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY), 4, null));
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

    private final float getDp1() {
        return ((Number) this.dp1.getValue()).floatValue();
    }

    private final int getDp8() {
        return ((Number) this.dp8.getValue()).intValue();
    }

    private final int getSeparatorHeight() {
        return ((Number) this.separatorHeight.getValue()).intValue();
    }

    private final RecyclerView.C getSeparatorViewHolder(RecyclerView parent, int i11) {
        View childAt = parent.getChildAt(i11);
        if (childAt != null) {
            return parent.getChildViewHolder(childAt);
        }
        return null;
    }

    private final void initIslandSeparators(RecyclerView parent) {
        if (this.islandSeparatorTop == null) {
            this.islandSeparatorTop = createIslandSeparator(parent, IslandSeparatorType.ROUND_TOP);
        }
        if (this.islandSeparatorBottom == null) {
            this.islandSeparatorBottom = createIslandSeparator(parent, IslandSeparatorType.ROUND_BOTTOM);
        }
    }

    private final void setSeparatorsState(int vhHeight) {
        int i11 = this.vhPrevHeight;
        if (i11 > vhHeight) {
            this.drawSeparators = true;
        } else if (i11 < vhHeight) {
            this.drawSeparators = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView.C childViewHolder = parent.getChildViewHolder(parent.getChildAt(i11));
            if ((childViewHolder instanceof FreshPaymentInfoWidgetViewHolder) && checkSeparators(parent, i11)) {
                initIslandSeparators(parent);
                FreshPaymentInfoWidgetViewHolder freshPaymentInfoWidgetViewHolder = (FreshPaymentInfoWidgetViewHolder) childViewHolder;
                setSeparatorsState(freshPaymentInfoWidgetViewHolder.itemView.getMeasuredHeight());
                this.vhPrevHeight = freshPaymentInfoWidgetViewHolder.itemView.getMeasuredHeight();
                if (this.drawSeparators) {
                    IslandSeparatorView islandSeparatorView = this.islandSeparatorTop;
                    if (islandSeparatorView != null) {
                        draw(islandSeparatorView, freshPaymentInfoWidgetViewHolder.itemView.getY() - getDp8(), canvas);
                    }
                    IslandSeparatorView islandSeparatorView2 = this.islandSeparatorBottom;
                    if (islandSeparatorView2 != null) {
                        draw(islandSeparatorView2, ((freshPaymentInfoWidgetViewHolder.itemView.getY() + freshPaymentInfoWidgetViewHolder.itemView.getHeight()) - (this.islandSeparatorBottom != null ? r2.getHeight() : 0)) - getDp8(), canvas);
                    }
                }
            }
        }
    }
}
