package ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "buttonsMarginInternal", "buttonsMarginExternal", "buttonsMinHeight", "previousPageSbv", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "getPreviousPageSbv", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "nextPageSbv", "getNextPageSbv", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaginationMobileView extends LinearLayout {
    public static final int $stable = SmallButtonView.$stable;
    private final int buttonsMarginExternal;
    private final int buttonsMarginInternal;
    private final int buttonsMinHeight;

    @NotNull
    private final SmallButtonView nextPageSbv;

    @NotNull
    private final SmallButtonView previousPageSbv;

    public /* synthetic */ PaginationMobileView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final SmallButtonView getNextPageSbv() {
        return this.nextPageSbv;
    }

    @NotNull
    public final SmallButtonView getPreviousPageSbv() {
        return this.previousPageSbv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginationMobileView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.buttonsMarginInternal = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.buttonsMarginExternal = px2;
        int px3 = ResourceExtKt.toPx(48, context);
        this.buttonsMinHeight = px3;
        SmallButtonView smallButtonView = new SmallButtonView(context, null, 0, 6, null);
        smallButtonView.setId(View.generateViewId());
        setOrientation(1);
        smallButtonView.setMinHeight(px3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        int marginStart = layoutParams.getMarginStart();
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        layoutParams.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i13;
        layoutParams.setMarginEnd(px);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i14;
        layoutParams.weight = 1.0f;
        smallButtonView.setLayoutParams(layoutParams);
        this.previousPageSbv = smallButtonView;
        SmallButtonView smallButtonView2 = new SmallButtonView(context, null, 0, 6, null);
        smallButtonView2.setId(View.generateViewId());
        setOrientation(1);
        smallButtonView2.setMinHeight(px3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int marginEnd = layoutParams2.getMarginEnd();
        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        layoutParams2.setMarginStart(px);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i15;
        layoutParams2.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i16;
        layoutParams2.weight = 1.0f;
        smallButtonView2.setLayoutParams(layoutParams2);
        this.nextPageSbv = smallButtonView2;
        setOrientation(0);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
        setWeightSum(2.0f);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        setPadding(px2, ResourceExtKt.toPx(24, context), px2, ResourceExtKt.toPx(32, context));
        setLayoutParams(layoutParams3);
        addView(smallButtonView);
        addView(smallButtonView2);
    }
}
