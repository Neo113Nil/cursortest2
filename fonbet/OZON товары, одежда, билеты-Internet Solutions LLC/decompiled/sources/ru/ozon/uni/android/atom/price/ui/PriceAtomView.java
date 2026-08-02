package ru.ozon.uni.android.atom.price.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\rJ\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0014J0\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0014J\f\u0010*\u001a\u00020\u001e*\u00020\rH\u0002J\f\u0010+\u001a\u00020\u001e*\u00020\rH\u0002J\f\u0010,\u001a\u00020\u001e*\u00020\rH\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Landroid/view/ViewGroup;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cachedData", "Lru/ozon/uni/atoms/data/price/PriceDTO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "locatorTag", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "priceLeftContentView", "Lru/ozon/uni/android/atom/price/ui/PriceLeftContentView;", "discountView", "Lru/ozon/uni/android/atom/price/ui/DiscountView;", "leftCustomPadding", "rightCustomPadding", "topCustomPadding", "bottomCustomPadding", "setContent", "", "data", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "l", "t", "r", "b", "setPaddings", "setLeftContent", "setDiscountContent", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceAtomView extends ViewGroup implements AtomView, AtomLocatableView {
    private int bottomCustomPadding;
    private PriceDTO cachedData;
    private DiscountView discountView;
    private int leftCustomPadding;

    @NotNull
    private String locatorTag;

    @NotNull
    private final PriceLeftContentView priceLeftContentView;
    private int rightCustomPadding;
    private int topCustomPadding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/atom/price/ui/PriceAtomView$Companion;", "", "<init>", "()V", "PRICE_LOCATOR_TAG", "", "PRICE_LEFT_CONTENT_LOCATOR_TAG", "DISCOUNT_LOCATOR_TAG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriceAtomView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setDiscountContent(PriceDTO priceDTO) {
        DiscountView discountView;
        String discount = priceDTO.getDiscount();
        if (discount == null || discount.length() == 0) {
            DiscountView discountView2 = this.discountView;
            if (discountView2 != null) {
                ViewExtKt.gone(discountView2);
            }
        } else {
            if (this.discountView == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                DiscountView discountView3 = new DiscountView(context, null, 0, 6, null);
                discountView3.setId(R$id.priceDiscount);
                addView(discountView3);
                this.discountView = discountView3;
            }
            DiscountView discountView4 = this.discountView;
            if (discountView4 != null) {
                ViewExtKt.show(discountView4);
            }
            DiscountView discountView5 = this.discountView;
            if (discountView5 != null) {
                discountView5.setContent(priceDTO);
            }
        }
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription() && (discountView = this.discountView) != null) {
            discountView.setContentDescription("discount");
        }
    }

    private final void setLeftContent(PriceDTO priceDTO) {
        PriceLeftContentView priceLeftContentView = this.priceLeftContentView;
        if (priceDTO.getPrice().isEmpty()) {
            ViewExtKt.gone(priceLeftContentView);
        } else {
            ViewExtKt.show(priceLeftContentView);
        }
        this.priceLeftContentView.setContent(priceDTO);
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            this.priceLeftContentView.setContentDescription(C7714v.V(priceDTO.getPrice(), " ", "price.", null, PriceAtomView$setLeftContent$2.INSTANCE, 28));
        }
    }

    private final void setPaddings(PriceDTO priceDTO) {
        Paddings paddingLeft = priceDTO.getPaddingLeft();
        this.leftCustomPadding = paddingLeft != null ? UiExtKt.toPx(paddingLeft.getPx()) : 0;
        Paddings paddingRight = priceDTO.getPaddingRight();
        this.rightCustomPadding = paddingRight != null ? UiExtKt.toPx(paddingRight.getPx()) : 0;
        Paddings paddingTop = priceDTO.getPaddingTop();
        this.topCustomPadding = paddingTop != null ? UiExtKt.toPx(paddingTop.getPx()) : 0;
        Paddings paddingBottom = priceDTO.getPaddingBottom();
        this.bottomCustomPadding = paddingBottom != null ? UiExtKt.toPx(paddingBottom.getPx()) : 0;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        this.priceLeftContentView.layout(getPaddingStart() + this.leftCustomPadding, getPaddingTop() + this.topCustomPadding, this.priceLeftContentView.getMeasuredWidth() + getPaddingStart() + this.leftCustomPadding, this.priceLeftContentView.getMeasuredHeight() + getPaddingBottom() + getPaddingTop() + this.topCustomPadding + this.bottomCustomPadding);
        DiscountView discountView = this.discountView;
        if (discountView != null) {
            int priceBaseline = this.priceLeftContentView.getPriceBaseline() - discountView.getBaseline();
            discountView.layout(this.priceLeftContentView.getMeasuredWidth() + getPaddingStart() + this.leftCustomPadding, getPaddingTop() + this.topCustomPadding + priceBaseline, getPaddingEnd() + discountView.getMeasuredWidth() + this.priceLeftContentView.getMeasuredWidth() + getPaddingStart() + this.leftCustomPadding + this.rightCustomPadding, getPaddingBottom() + getPaddingTop() + discountView.getMeasuredHeight() + priceBaseline + this.topCustomPadding + this.bottomCustomPadding);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        DiscountView discountView;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.topCustomPadding + this.bottomCustomPadding;
        int paddingEnd = getPaddingEnd() + getPaddingStart() + this.leftCustomPadding + this.rightCustomPadding;
        int size = View.MeasureSpec.getSize(widthMeasureSpec) - paddingEnd;
        DiscountView discountView2 = this.discountView;
        if (discountView2 != null) {
            discountView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        DiscountView discountView3 = this.discountView;
        int measuredWidth = (discountView3 == null || discountView3.getVisibility() != 0 || (discountView = this.discountView) == null || discountView == null) ? 0 : discountView.getMeasuredWidth();
        this.priceLeftContentView.measure(View.MeasureSpec.makeMeasureSpec(size - measuredWidth, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(this.priceLeftContentView.getMeasuredWidth() + measuredWidth + paddingEnd, this.priceLeftContentView.getMeasuredHeight() + paddingBottom);
    }

    public final void setContent(@NotNull PriceDTO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.d(this.cachedData, data)) {
            return;
        }
        this.cachedData = data;
        setPaddings(data);
        setLeftContent(data);
        setDiscountContent(data);
        requestLayout();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            setContentDescription(this.locatorTag);
        }
    }

    public /* synthetic */ PriceAtomView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceAtomView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "price";
        setLocatorTag(getLocatorTag());
        PriceLeftContentView priceLeftContentView = new PriceLeftContentView(context, null, 0, 6, null);
        priceLeftContentView.setId(R$id.priceLeftContentView);
        addView(priceLeftContentView);
        this.priceLeftContentView = priceLeftContentView;
    }
}
