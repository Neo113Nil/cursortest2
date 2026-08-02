package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import android.view.View;
import androidx.lifecycle.J;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.databinding.FragmentPdpComparisonCharateristicsPickBinding;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CharacteristicsPickBottomSheetFragment$setupView$1$2 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ FragmentPdpComparisonCharateristicsPickBinding $this_with;
    final /* synthetic */ CharacteristicsPickBottomSheetFragment this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.CharacteristicsPickBottomSheetFragment$setupView$1$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ FragmentPdpComparisonCharateristicsPickBinding $this_with;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FragmentPdpComparisonCharateristicsPickBinding fragmentPdpComparisonCharateristicsPickBinding) {
            super(0);
            this.$this_with = fragmentPdpComparisonCharateristicsPickBinding;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_with.searchV.p("", true);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.CharacteristicsPickBottomSheetFragment$setupView$1$2$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, CharacteristicsPickBottomSheetFragment.class, "showError", "showError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((CharacteristicsPickBottomSheetFragment) this.receiver).showError(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CharacteristicsPickBottomSheetFragment$setupView$1$2(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment, FragmentPdpComparisonCharateristicsPickBinding fragmentPdpComparisonCharateristicsPickBinding) {
        super(1);
        this.this$0 = characteristicsPickBottomSheetFragment;
        this.$this_with = fragmentPdpComparisonCharateristicsPickBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        ComparisonBottomSheetViewModel comparisonBottomSheetViewModel;
        AbstractC7094b clearSelectedCharacteristics;
        Intrinsics.checkNotNullParameter(it, "it");
        comparisonBottomSheetViewModel = this.this$0.viewModel;
        if (comparisonBottomSheetViewModel == null || (clearSelectedCharacteristics = comparisonBottomSheetViewModel.clearSelectedCharacteristics()) == null) {
            return;
        }
        J viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        RxExtKt.subscribe(clearSelectedCharacteristics, viewLifecycleOwner, new AnonymousClass1(this.$this_with), new AnonymousClass2(this.this$0));
    }
}
