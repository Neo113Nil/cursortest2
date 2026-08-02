package ru.ozon.app.android.returns.details.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/views/ReturnItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "productInfoMargin", "separatorMarginHorizontal", "separatorHeight", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "Lru/ozon/app/android/returns/details/presentation/views/ReturnProductInfoView;", "getProductInfo", "()Lru/ozon/app/android/returns/details/presentation/views/ReturnProductInfoView;", "returnReason", "Lru/ozon/app/android/returns/details/presentation/views/ReturnReasonView;", "getReturnReason", "()Lru/ozon/app/android/returns/details/presentation/views/ReturnReasonView;", "separator", "Landroid/view/View;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnItemView extends LinearLayout {

    @NotNull
    private final ReturnProductInfoView productInfo;
    private final int productInfoMargin;

    @NotNull
    private final ReturnReasonView returnReason;

    @NotNull
    private final View separator;
    private final int separatorHeight;
    private final int separatorMarginHorizontal;

    public /* synthetic */ ReturnItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final ReturnProductInfoView getProductInfo() {
        return this.productInfo;
    }

    @NotNull
    public final ReturnReasonView getReturnReason() {
        return this.returnReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.productInfoMargin = px;
        int px2 = UiExtKt.toPx(16, context);
        this.separatorMarginHorizontal = px2;
        int px3 = UiExtKt.toPx(1, context);
        this.separatorHeight = px3;
        ReturnProductInfoView returnProductInfoView = new ReturnProductInfoView(context, null, 0, 6, null);
        returnProductInfoView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px, px, px, px);
        returnProductInfoView.setLayoutParams(layoutParams);
        this.productInfo = returnProductInfoView;
        ReturnReasonView returnReasonView = new ReturnReasonView(context, null, 0, 0, 14, null);
        returnReasonView.setId(View.generateViewId());
        returnReasonView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.returnReason = returnReasonView;
        View view = new View(context);
        view.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, px3);
        layoutParams2.setMargins(px2, 0, px2, 0);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.separator = view;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.bgSecondary));
        addView(returnProductInfoView);
        addView(view);
        addView(returnReasonView);
    }
}
