package ru.ozon.app.android.abtool.presentation.features;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.AbToggleViewModel;
import ru.ozon.app.android.abtool.presentation.features.recycler.FeatureItem;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "featureItem", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "isChecked", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FeaturesFragment$initRecycler$3 extends AbstractC7737t implements Function2<FeatureItem, Boolean, Unit> {
    final /* synthetic */ FeaturesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeaturesFragment$initRecycler$3(FeaturesFragment featuresFragment) {
        super(2);
        this.this$0 = featuresFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FeatureItem featureItem, Boolean bool) {
        invoke(featureItem, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(FeatureItem featureItem, boolean z11) {
        AbToggleViewModel viewModel;
        Intrinsics.checkNotNullParameter(featureItem, "featureItem");
        viewModel = this.this$0.getViewModel();
        viewModel.onLocalValueChanged(featureItem, z11);
    }
}
