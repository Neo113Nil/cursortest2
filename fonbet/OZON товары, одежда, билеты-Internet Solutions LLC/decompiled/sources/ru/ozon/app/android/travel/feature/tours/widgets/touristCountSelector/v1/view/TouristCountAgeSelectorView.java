package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.view;

import CT.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.databinding.ViewTouristCountSelectorAgeSelectorBinding;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorVO;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ]\u0010\u0015\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000e20\u0010\u0014\u001a,\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/view/TouristCountAgeSelectorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "ageSelector", "", "", "ageCategories", "ageSelectorPlaceholder", "Lkotlin/Function3;", "Lkotlin/Function1;", "", "onSelectorClicked", "bindVO", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;Ljava/util/List;Ljava/lang/String;Lfd/n;)V", "Lru/ozon/app/android/travel/feature/tours/databinding/ViewTouristCountSelectorAgeSelectorBinding;", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/ViewTouristCountSelectorAgeSelectorBinding;", "verticalPadding", "I", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountAgeSelectorView extends LinearLayout {

    @NotNull
    private final ViewTouristCountSelectorAgeSelectorBinding binding;
    private final int verticalPadding;

    public /* synthetic */ TouristCountAgeSelectorView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bindVO(@NotNull TouristCountSelectorVO.AgeSelectorVO ageSelector, @NotNull List<String> ageCategories, @NotNull String ageSelectorPlaceholder, @NotNull InterfaceC6511n<? super TouristCountSelectorVO.AgeSelectorVO, ? super List<String>, ? super Function1<? super String, Unit>, Unit> onSelectorClicked) {
        Intrinsics.checkNotNullParameter(ageSelector, "ageSelector");
        Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
        Intrinsics.checkNotNullParameter(ageSelectorPlaceholder, "ageSelectorPlaceholder");
        Intrinsics.checkNotNullParameter(onSelectorClicked, "onSelectorClicked");
        TouristCountAgeSelectorView$bindVO$onClickListener$1 touristCountAgeSelectorView$bindVO$onClickListener$1 = new TouristCountAgeSelectorView$bindVO$onClickListener$1(onSelectorClicked, ageSelector, ageCategories, this);
        this.binding.touristAgeSelectorTextView.setText(ageSelector.getValue());
        this.binding.touristAgeSelectorTextView.setFocusable(false);
        TravelTextInputLayout.showLeftImageView$default(this.binding.touristAgeSelectorInputLayout, R$drawable.ic_m_child, null, 2, null);
        TravelTextInputLayout.showRightImageView$default(this.binding.touristAgeSelectorInputLayout, R$drawable.ic_s_picker, null, 2, null);
        this.binding.touristAgeSelectorTextView.setOnClickListener(new a(touristCountAgeSelectorView$bindVO$onClickListener$1, 0));
        this.binding.touristAgeSelectorInputLayout.setRightImageviewClickListener(new TouristCountAgeSelectorView$bindVO$2(touristCountAgeSelectorView$bindVO$onClickListener$1));
        this.binding.touristAgeSelectorInputLayout.setShowError(ageSelector.getIsErrorVisible());
        this.binding.touristAgeSelectorInputLayout.setHint(ageSelectorPlaceholder);
        AppCompatTextView touristAgeSelectorErrorTV = this.binding.touristAgeSelectorErrorTV;
        Intrinsics.checkNotNullExpressionValue(touristAgeSelectorErrorTV, "touristAgeSelectorErrorTV");
        touristAgeSelectorErrorTV.setVisibility(ageSelector.getIsErrorVisible() ? 0 : 8);
        this.binding.touristAgeSelectorErrorTV.setText(ageSelector.getError());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountAgeSelectorView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewTouristCountSelectorAgeSelectorBinding inflate = ViewTouristCountSelectorAgeSelectorBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        int px = ResourceExtKt.toPx(4, context);
        this.verticalPadding = px;
        setOrientation(1);
        ViewExtKt.updatePadding$default(this, 0, px, 0, px, 5, null);
    }
}
