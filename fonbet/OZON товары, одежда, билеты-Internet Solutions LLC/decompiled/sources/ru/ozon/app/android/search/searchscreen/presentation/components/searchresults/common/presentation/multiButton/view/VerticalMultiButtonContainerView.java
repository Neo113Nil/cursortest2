package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.databinding.MultiButtonViewVerticalBinding;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model.MultiButtonTemplate;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/VerticalMultiButtonContainerView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/MultiButtonItemView;", "getFirstButton", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/view/MultiButtonItemView;", "getSecondButton", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;", "getButtonsOrientation", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonTemplate$MultiButtonOrientation;", "Lru/ozon/app/android/search/databinding/MultiButtonViewVerticalBinding;", "binding", "Lru/ozon/app/android/search/databinding/MultiButtonViewVerticalBinding;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerticalMultiButtonContainerView extends LinearLayout {

    @NotNull
    private final MultiButtonViewVerticalBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalMultiButtonContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public MultiButtonTemplate.MultiButtonOrientation getButtonsOrientation() {
        return MultiButtonTemplate.MultiButtonOrientation.VERTICAL;
    }

    @NotNull
    public MultiButtonItemView getFirstButton() {
        MultiButtonItemView firstButton = this.binding.firstButton;
        Intrinsics.checkNotNullExpressionValue(firstButton, "firstButton");
        return firstButton;
    }

    @NotNull
    public MultiButtonItemView getSecondButton() {
        MultiButtonItemView secondButton = this.binding.secondButton;
        Intrinsics.checkNotNullExpressionValue(secondButton, "secondButton");
        return secondButton;
    }

    public /* synthetic */ VerticalMultiButtonContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalMultiButtonContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        MultiButtonViewVerticalBinding inflate = MultiButtonViewVerticalBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setOrientation(1);
    }
}
