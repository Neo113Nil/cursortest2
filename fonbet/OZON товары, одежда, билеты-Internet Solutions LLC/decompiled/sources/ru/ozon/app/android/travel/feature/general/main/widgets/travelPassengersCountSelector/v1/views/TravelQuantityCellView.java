package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views;

import AE.a;
import Cy.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.databinding.ViewTravelQuantityCellBinding;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;)V", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewTravelQuantityCellBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/ViewTravelQuantityCellBinding;", "Lkotlin/Function1;", "onPlusButtonClicked", "Lkotlin/jvm/functions/Function1;", "getOnPlusButtonClicked", "()Lkotlin/jvm/functions/Function1;", "setOnPlusButtonClicked", "(Lkotlin/jvm/functions/Function1;)V", "onMinusButtonClicked", "getOnMinusButtonClicked", "setOnMinusButtonClicked", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelQuantityCellView extends ConstraintLayout {

    @NotNull
    private final ViewTravelQuantityCellBinding binding;
    private Function1<? super TravelQuantityCellVO, Unit> onMinusButtonClicked;
    private Function1<? super TravelQuantityCellVO, Unit> onPlusButtonClicked;

    public /* synthetic */ TravelQuantityCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1$lambda$0(TravelQuantityCellView travelQuantityCellView, TravelQuantityCellVO travelQuantityCellVO, View view) {
        Function1<? super TravelQuantityCellVO, Unit> function1 = travelQuantityCellView.onMinusButtonClicked;
        if (function1 != null) {
            function1.invoke(travelQuantityCellVO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(TravelQuantityCellView travelQuantityCellView, TravelQuantityCellVO travelQuantityCellVO, View view) {
        Function1<? super TravelQuantityCellVO, Unit> function1 = travelQuantityCellView.onPlusButtonClicked;
        if (function1 != null) {
            function1.invoke(travelQuantityCellVO);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void bind(@NotNull TravelQuantityCellVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.titleTav.setText(item.getTitle());
        this.binding.subtitleTav.setText(item.getSubtitle());
        this.binding.countTav.setText(String.valueOf(item.getCurrentValue()));
        IconButtonV3View iconButtonV3View = this.binding.minusButtonView;
        Intrinsics.f(iconButtonV3View);
        IconButtonV3HolderKt.bind$default(iconButtonV3View, item.getMinusButton(), null, 2, null);
        iconButtonV3View.setOnClickListener(new a(3, this, item));
        IconButtonV3View iconButtonV3View2 = this.binding.plusButtonView;
        Intrinsics.f(iconButtonV3View2);
        IconButtonV3HolderKt.bind$default(iconButtonV3View2, item.getPlusButton(), null, 2, null);
        iconButtonV3View2.setOnClickListener(new b(2, this, item));
    }

    public final void setOnMinusButtonClicked(Function1<? super TravelQuantityCellVO, Unit> function1) {
        this.onMinusButtonClicked = function1;
    }

    public final void setOnPlusButtonClicked(Function1<? super TravelQuantityCellVO, Unit> function1) {
        this.onPlusButtonClicked = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelQuantityCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewTravelQuantityCellBinding inflate = ViewTravelQuantityCellBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }
}
