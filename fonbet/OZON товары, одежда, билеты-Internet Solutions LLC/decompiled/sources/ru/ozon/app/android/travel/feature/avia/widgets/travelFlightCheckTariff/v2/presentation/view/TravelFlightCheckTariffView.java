package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.view;

import CG.c;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.travel.feature.avia.databinding.ViewFlightCheckTariffBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2VO;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.direction.TravelFlightCheckTariffV2DirectionAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.direction.TravelFlightCheckTariffV2DirectionItemDecoration;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/view/TravelFlightCheckTariffView;", "Lru/ozon/app/android/travel/utils/view/constraintLayoutWithBorder/ConstraintLayoutWithBorder;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/ViewFlightCheckTariffBinding;", "dpf12", "", "dp240", "directionAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/adapter/direction/TravelFlightCheckTariffV2DirectionAdapter;", "onTariffClickListener", "Lkotlin/Function0;", "", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "clickListener", "setUpRecyclerView", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TravelFlightCheckTariffView extends ConstraintLayoutWithBorder {

    @NotNull
    private final ViewFlightCheckTariffBinding binding;

    @NotNull
    private final TravelFlightCheckTariffV2DirectionAdapter directionAdapter;
    private final int dp240;
    private final float dpf12;
    private Function0<Unit> onTariffClickListener;

    public /* synthetic */ TravelFlightCheckTariffView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TravelFlightCheckTariffView travelFlightCheckTariffView, View view) {
        Function0<Unit> function0 = travelFlightCheckTariffView.onTariffClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(TravelFlightCheckTariffView travelFlightCheckTariffView, TravelFlightCheckTariffV2VO.Tariff tariff, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        travelFlightCheckTariffView.bind(tariff, function0);
    }

    private final void setUpRecyclerView(Context context) {
        RecyclerView recyclerView = this.binding.tariffV2DirectionRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(this.directionAdapter);
        recyclerView.addItemDecoration(new TravelFlightCheckTariffV2DirectionItemDecoration(context));
    }

    public final void bind(@NotNull TravelFlightCheckTariffV2VO.Tariff item, Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = item.getShouldMatchParent() ? -1 : this.dp240;
        if (getLayoutParams() != null && getLayoutParams().width != i11) {
            getLayoutParams().width = i11;
            requestLayout();
        }
        if (!item.getIsSelectable()) {
            clickListener = null;
        }
        this.onTariffClickListener = clickListener;
        setEnabled(item.getIsSelectable());
        setFocusable(item.getIsSelectable());
        TextAtomView tariffV2DiscountTextView = this.binding.tariffV2DiscountTextView;
        Intrinsics.checkNotNullExpressionValue(tariffV2DiscountTextView, "tariffV2DiscountTextView");
        TextAtomHolderKt.bindOrGone$default(tariffV2DiscountTextView, item.getDiscount(), null, 2, null);
        PriceView tariffV2PriceView = this.binding.tariffV2PriceView;
        Intrinsics.checkNotNullExpressionValue(tariffV2PriceView, "tariffV2PriceView");
        PriceHolderKt.bind$default(tariffV2PriceView, item.getPrice(), null, 2, null);
        BadgeView tariffPremiumBadgeBV = this.binding.tariffPremiumBadgeBV;
        Intrinsics.checkNotNullExpressionValue(tariffPremiumBadgeBV, "tariffPremiumBadgeBV");
        BadgeHolderKt.bindOrGone$default(tariffPremiumBadgeBV, item.getPremiumBadge(), (Function1) null, 2, (Object) null);
        TextAtomView tariffV2PriceLabelTextView = this.binding.tariffV2PriceLabelTextView;
        Intrinsics.checkNotNullExpressionValue(tariffV2PriceLabelTextView, "tariffV2PriceLabelTextView");
        TextAtomHolderKt.bindOrGone$default(tariffV2PriceLabelTextView, item.getPriceLabel(), null, 2, null);
        setBorderColor(item.getBorderColor());
        BadgeView tariffV2BadgeView = this.binding.tariffV2BadgeView;
        Intrinsics.checkNotNullExpressionValue(tariffV2BadgeView, "tariffV2BadgeView");
        BadgeHolderKt.bindOrGone$default(tariffV2BadgeView, item.getBadge(), (Function1) null, 2, (Object) null);
        AppCompatCheckBox appCompatCheckBox = this.binding.tariffV2CheckBox;
        appCompatCheckBox.setChecked(item.getIsSelected());
        appCompatCheckBox.setEnabled(item.getIsSelectable());
        appCompatCheckBox.setFocusable(item.getIsSelectable());
        TextAtomView tariffV2TitleTextView = this.binding.tariffV2TitleTextView;
        Intrinsics.checkNotNullExpressionValue(tariffV2TitleTextView, "tariffV2TitleTextView");
        TextAtomHolderKt.bind$default(tariffV2TitleTextView, item.getTitle(), null, 2, null);
        this.directionAdapter.setItems(item.getDirections());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelFlightCheckTariffView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewFlightCheckTariffBinding inflate = ViewFlightCheckTariffBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        float pxF = ResourceExtKt.toPxF(12, context);
        this.dpf12 = pxF;
        this.dp240 = ResourceExtKt.toPx(240, context);
        this.directionAdapter = new TravelFlightCheckTariffV2DirectionAdapter();
        setRadius(pxF);
        setClickable(true);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        setForeground(C7232a.a(context, typedValue.resourceId));
        setUpRecyclerView(context);
        setOnClickListener(new c(this, 11));
    }
}
