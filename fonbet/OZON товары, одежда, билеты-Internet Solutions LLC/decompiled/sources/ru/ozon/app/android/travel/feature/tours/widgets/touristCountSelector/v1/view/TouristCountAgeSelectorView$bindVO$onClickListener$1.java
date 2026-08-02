package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.view;

import androidx.appcompat.widget.AppCompatTextView;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.tours.databinding.ViewTouristCountSelectorAgeSelectorBinding;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TouristCountAgeSelectorView$bindVO$onClickListener$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ List<String> $ageCategories;
    final /* synthetic */ TouristCountSelectorVO.AgeSelectorVO $ageSelector;
    final /* synthetic */ InterfaceC6511n<TouristCountSelectorVO.AgeSelectorVO, List<String>, Function1<? super String, Unit>, Unit> $onSelectorClicked;
    final /* synthetic */ TouristCountAgeSelectorView this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.view.TouristCountAgeSelectorView$bindVO$onClickListener$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ TouristCountAgeSelectorView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TouristCountAgeSelectorView touristCountAgeSelectorView) {
            super(1);
            this.this$0 = touristCountAgeSelectorView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String newValue) {
            ViewTouristCountSelectorAgeSelectorBinding viewTouristCountSelectorAgeSelectorBinding;
            ViewTouristCountSelectorAgeSelectorBinding viewTouristCountSelectorAgeSelectorBinding2;
            ViewTouristCountSelectorAgeSelectorBinding viewTouristCountSelectorAgeSelectorBinding3;
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            viewTouristCountSelectorAgeSelectorBinding = this.this$0.binding;
            viewTouristCountSelectorAgeSelectorBinding.touristAgeSelectorTextView.setText(newValue);
            viewTouristCountSelectorAgeSelectorBinding2 = this.this$0.binding;
            viewTouristCountSelectorAgeSelectorBinding2.touristAgeSelectorInputLayout.setShowError(false);
            viewTouristCountSelectorAgeSelectorBinding3 = this.this$0.binding;
            AppCompatTextView touristAgeSelectorErrorTV = viewTouristCountSelectorAgeSelectorBinding3.touristAgeSelectorErrorTV;
            Intrinsics.checkNotNullExpressionValue(touristAgeSelectorErrorTV, "touristAgeSelectorErrorTV");
            touristAgeSelectorErrorTV.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TouristCountAgeSelectorView$bindVO$onClickListener$1(InterfaceC6511n<? super TouristCountSelectorVO.AgeSelectorVO, ? super List<String>, ? super Function1<? super String, Unit>, Unit> interfaceC6511n, TouristCountSelectorVO.AgeSelectorVO ageSelectorVO, List<String> list, TouristCountAgeSelectorView touristCountAgeSelectorView) {
        super(0);
        this.$onSelectorClicked = interfaceC6511n;
        this.$ageSelector = ageSelectorVO;
        this.$ageCategories = list;
        this.this$0 = touristCountAgeSelectorView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelectorClicked.invoke(this.$ageSelector, this.$ageCategories, new AnonymousClass1(this.this$0));
    }
}
