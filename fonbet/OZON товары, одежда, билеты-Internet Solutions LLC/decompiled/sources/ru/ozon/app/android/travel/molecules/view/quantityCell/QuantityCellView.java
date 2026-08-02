package ru.ozon.app.android.travel.molecules.view.quantityCell;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewQuantityCellBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewQuantityCellBinding;", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "onPlusButtonClicked", "Lkotlin/Function0;", "onMinusButtonClicked", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QuantityCellView extends ConstraintLayout {

    @NotNull
    private final ViewQuantityCellBinding binding;

    public /* synthetic */ QuantityCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @SuppressLint({"SetTextI18n"})
    public final void bind(@NotNull QuantityCellVO item, Function0<Unit> onPlusButtonClicked, Function0<Unit> onMinusButtonClicked) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomView quantityCellTitle = this.binding.quantityCellTitle;
        Intrinsics.checkNotNullExpressionValue(quantityCellTitle, "quantityCellTitle");
        TextAtomHolderKt.bind$default(quantityCellTitle, item.getTitle(), null, 2, null);
        TextAtomView quantityCellSubTitle = this.binding.quantityCellSubTitle;
        Intrinsics.checkNotNullExpressionValue(quantityCellSubTitle, "quantityCellSubTitle");
        TextAtomHolderKt.bindOrGone$default(quantityCellSubTitle, item.getSubtitle(), null, 2, null);
        this.binding.quantityCellCounter.setText(String.valueOf(item.getValue()));
        this.binding.quantityCellMinusBtn.setAlpha(item.getMinusButtonEnabled() ? 1.0f : 0.5f);
        this.binding.quantityCellPlusBtn.setAlpha(item.getPlusButtonEnabled() ? 1.0f : 0.5f);
        if (onMinusButtonClicked == null) {
            this.binding.quantityCellMinusBtn.setOnClickListener(null);
        } else {
            SmallIconButtonView quantityCellMinusBtn = this.binding.quantityCellMinusBtn;
            Intrinsics.checkNotNullExpressionValue(quantityCellMinusBtn, "quantityCellMinusBtn");
            ViewExtKt.setOnClickListenerThrottle(quantityCellMinusBtn, 500L, new QuantityCellView$bind$1$1(onMinusButtonClicked));
        }
        if (onPlusButtonClicked == null) {
            this.binding.quantityCellPlusBtn.setOnClickListener(null);
            return;
        }
        SmallIconButtonView quantityCellPlusBtn = this.binding.quantityCellPlusBtn;
        Intrinsics.checkNotNullExpressionValue(quantityCellPlusBtn, "quantityCellPlusBtn");
        ViewExtKt.setOnClickListenerThrottle(quantityCellPlusBtn, 500L, new QuantityCellView$bind$1$2(onPlusButtonClicked));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuantityCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewQuantityCellBinding inflate = ViewQuantityCellBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }
}
