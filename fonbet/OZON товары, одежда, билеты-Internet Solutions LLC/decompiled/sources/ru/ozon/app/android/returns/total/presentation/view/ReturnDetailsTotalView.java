package ru.ozon.app.android.returns.total.presentation.view;

import Im.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/total/presentation/view/ReturnDetailsTotalView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rowsMarginTop", "marginHorizontal", "refundDetailsRowsLinerLayoutMarginTop", "refundDetailsRowsMarginHorizontal", "refundDetailsRowsMarginVertical", "refundDetailsTitleTavMargin", "rowsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRowsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "refundDetailsTitleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getRefundDetailsTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "refundDetailsRowsRecyclerView", "getRefundDetailsRowsRecyclerView", "refundDetailsRowsLinerLayout", "getRefundDetailsRowsLinerLayout", "()Landroid/widget/LinearLayout;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsTotalView extends LinearLayout {
    private final int marginHorizontal;

    @NotNull
    private final LinearLayout refundDetailsRowsLinerLayout;
    private final int refundDetailsRowsLinerLayoutMarginTop;
    private final int refundDetailsRowsMarginHorizontal;
    private final int refundDetailsRowsMarginVertical;

    @NotNull
    private final RecyclerView refundDetailsRowsRecyclerView;

    @NotNull
    private final TextAtomV2View refundDetailsTitleTav;
    private final int refundDetailsTitleTavMargin;
    private final int rowsMarginTop;

    @NotNull
    private final RecyclerView rowsRecyclerView;

    public /* synthetic */ ReturnDetailsTotalView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final LinearLayout getRefundDetailsRowsLinerLayout() {
        return this.refundDetailsRowsLinerLayout;
    }

    @NotNull
    public final RecyclerView getRefundDetailsRowsRecyclerView() {
        return this.refundDetailsRowsRecyclerView;
    }

    @NotNull
    public final TextAtomV2View getRefundDetailsTitleTav() {
        return this.refundDetailsTitleTav;
    }

    @NotNull
    public final RecyclerView getRowsRecyclerView() {
        return this.rowsRecyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnDetailsTotalView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(12, context);
        this.rowsMarginTop = px;
        int px2 = UiExtKt.toPx(16, context);
        this.marginHorizontal = px2;
        int px3 = UiExtKt.toPx(6, context);
        this.refundDetailsRowsLinerLayoutMarginTop = px3;
        int px4 = UiExtKt.toPx(12, context);
        this.refundDetailsRowsMarginHorizontal = px4;
        int px5 = UiExtKt.toPx(6, context);
        this.refundDetailsRowsMarginVertical = px5;
        int px6 = UiExtKt.toPx(12, context);
        this.refundDetailsTitleTavMargin = px6;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px2, px, px2, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.rowsRecyclerView = recyclerView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View, R$id.refundDetailsTitleTav, -1, -2);
        a11.setMargins(px6, px6, px6, ((ViewGroup.MarginLayoutParams) a11).bottomMargin);
        textAtomV2View.setLayoutParams(a11);
        this.refundDetailsTitleTav = textAtomV2View;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(px4, px5, px4, px5);
        recyclerView2.setLayoutParams(layoutParams2);
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setClipChildren(false);
        recyclerView2.setClipToPadding(false);
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.refundDetailsRowsRecyclerView = recyclerView2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.refundDetailsGroupLl);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(px2, px3, px2, ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.addView(textAtomV2View);
        linearLayout.addView(recyclerView2);
        this.refundDetailsRowsLinerLayout = linearLayout;
        setId(R$id.returnDetailsTotalLl);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        addView(recyclerView);
        addView(linearLayout);
    }
}
