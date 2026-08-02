package ru.ozon.app.android.travel.molecules.view.tripLeg.v1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayout;
import ru.ozon.app.android.travel.molecules.view.rowLinearLayout.RowLinearLayoutUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegView;", "Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp1", "dp4", "dp10", "dp12", "dp16", "departureTimeTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "viewLeft", "Landroid/view/View;", "durationTimeTextView", "viewRight", "arrivalTimeTextView", "dayCountTextView", "departurePointInfoTextView", "transferInfoGroup", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TransferInfoView;", "arrivalPointInfoTextView", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/tripLeg/v1/TripLegVO;", "addViews", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TripLegView extends RowLinearLayout {
    public static final int $stable = 8;

    @NotNull
    private final AppCompatTextView arrivalPointInfoTextView;

    @NotNull
    private final AppCompatTextView arrivalTimeTextView;

    @NotNull
    private final AppCompatTextView dayCountTextView;

    @NotNull
    private final AppCompatTextView departurePointInfoTextView;

    @NotNull
    private final AppCompatTextView departureTimeTextView;
    private final int dp1;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp4;

    @NotNull
    private final AppCompatTextView durationTimeTextView;

    @NotNull
    private final TransferInfoView transferInfoGroup;

    @NotNull
    private final View viewLeft;

    @NotNull
    private final View viewRight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TripLegView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addViews() {
        RowLinearLayoutUtilsKt.addToFirstRow(this, this.departureTimeTextView);
        RowLinearLayoutUtilsKt.addToFirstRow(this, this.viewLeft);
        RowLinearLayoutUtilsKt.addToFirstRow(this, this.durationTimeTextView);
        RowLinearLayoutUtilsKt.addToFirstRow(this, this.viewRight);
        RowLinearLayoutUtilsKt.addToFirstRow(this, this.arrivalTimeTextView);
        RowLinearLayoutUtilsKt.addToFirstRow(this, this.dayCountTextView);
        RowLinearLayoutUtilsKt.addToSecondRow(this, this.departurePointInfoTextView);
        RowLinearLayoutUtilsKt.addToSecondRow(this, this.transferInfoGroup);
        RowLinearLayoutUtilsKt.addToSecondRow(this, this.arrivalPointInfoTextView);
    }

    public final void bind(@NotNull TripLegVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.departureTimeTextView.setText(item.getDepartureTime());
        this.arrivalTimeTextView.setText(item.getArrivalTime());
        this.durationTimeTextView.setText(item.getDuration());
        this.departurePointInfoTextView.setText(item.getDeparturePoint());
        this.arrivalPointInfoTextView.setText(item.getArrivalPoint());
        this.transferInfoGroup.bindOrGone(item);
        AppCompatTextView appCompatTextView = this.dayCountTextView;
        appCompatTextView.setVisibility(item.getIsArrivalDaysVisible() ? 0 : 8);
        appCompatTextView.setText(item.getArrivalDays());
    }

    public /* synthetic */ TripLegView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripLegView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        int px2 = ResourceExtKt.toPx(4, context);
        this.dp4 = px2;
        int px3 = ResourceExtKt.toPx(10, context);
        this.dp10 = px3;
        int px4 = ResourceExtKt.toPx(12, context);
        this.dp12 = px4;
        int px5 = ResourceExtKt.toPx(16, context);
        this.dp16 = px5;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        RowLinearLayout.LayoutParams layoutParams = new RowLinearLayout.LayoutParams(-2, -2);
        layoutParams.setGravity(16);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L_Bold);
        this.departureTimeTextView = appCompatTextView;
        View view = new View(context);
        RowLinearLayout.LayoutParams layoutParams2 = new RowLinearLayout.LayoutParams(0, px);
        layoutParams2.setWeight(1.0f);
        layoutParams2.setGravity(16);
        layoutParams2.setMargins(px4, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, px4, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.viewLeft = view;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        RowLinearLayout.LayoutParams layoutParams3 = new RowLinearLayout.LayoutParams(-2, -2);
        layoutParams3.setGravity(16);
        appCompatTextView2.setLayoutParams(layoutParams3);
        appCompatTextView2.setTextAppearance(R$style.TextStyle_Body_M_Gray60);
        this.durationTimeTextView = appCompatTextView2;
        View view2 = new View(context);
        RowLinearLayout.LayoutParams layoutParams4 = new RowLinearLayout.LayoutParams(0, px);
        layoutParams4.setWeight(1.0f);
        layoutParams4.setGravity(16);
        layoutParams4.setMargins(px4, ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, px4, ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
        view2.setLayoutParams(layoutParams4);
        view2.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.viewRight = view2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        RowLinearLayout.LayoutParams layoutParams5 = new RowLinearLayout.LayoutParams(-2, -2);
        layoutParams5.setGravity(16);
        appCompatTextView3.setLayoutParams(layoutParams5);
        appCompatTextView3.setTextAppearance(R$style.TextStyle_Body_L_Bold);
        this.arrivalTimeTextView = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
        RowLinearLayout.LayoutParams layoutParams6 = new RowLinearLayout.LayoutParams(-2, -2);
        layoutParams6.setGravity(16);
        layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin, px3);
        appCompatTextView4.setLayoutParams(layoutParams6);
        appCompatTextView4.setTextAppearance(R$style.TextStyle_Caption_Red);
        this.dayCountTextView = appCompatTextView4;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(context);
        RowLinearLayout.LayoutParams layoutParams7 = new RowLinearLayout.LayoutParams(0, -2);
        layoutParams7.setWeight(1.0f);
        appCompatTextView5.setLayoutParams(layoutParams7);
        appCompatTextView5.setTextAppearance(R$style.TextStyle_Body_M_Gray60);
        this.departurePointInfoTextView = appCompatTextView5;
        TransferInfoView transferInfoView = new TransferInfoView(context);
        RowLinearLayout.LayoutParams layoutParams8 = new RowLinearLayout.LayoutParams(-2, -2);
        layoutParams8.setMargins(px2, ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin, px2, ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin);
        transferInfoView.setLayoutParams(layoutParams8);
        this.transferInfoGroup = transferInfoView;
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(context);
        RowLinearLayout.LayoutParams layoutParams9 = new RowLinearLayout.LayoutParams(0, -2);
        layoutParams9.setWeight(1.0f);
        appCompatTextView6.setLayoutParams(layoutParams9);
        appCompatTextView6.setGravity(8388613);
        appCompatTextView6.setTextAppearance(R$style.TextStyle_Body_M_Gray60);
        this.arrivalPointInfoTextView = appCompatTextView6;
        setRowSpacing(px5);
        addViews();
    }
}
