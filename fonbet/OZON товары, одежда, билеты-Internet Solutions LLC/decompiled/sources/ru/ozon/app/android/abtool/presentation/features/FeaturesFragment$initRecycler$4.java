package ru.ozon.app.android.abtool.presentation.features;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.AbToggleViewModel;
import ru.ozon.app.android.abtool.presentation.features.recycler.FeatureItem;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "featureItem", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FeaturesFragment$initRecycler$4 extends AbstractC7737t implements Function2<FeatureItem, String, Unit> {
    final /* synthetic */ FeaturesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeaturesFragment$initRecycler$4(FeaturesFragment featuresFragment) {
        super(2);
        this.this$0 = featuresFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FeatureItem featureItem, String str) {
        invoke2(featureItem, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FeatureItem featureItem, String value) {
        AbToggleViewModel viewModel;
        Intrinsics.checkNotNullParameter(featureItem, "featureItem");
        Intrinsics.checkNotNullParameter(value, "value");
        viewModel = this.this$0.getViewModel();
        viewModel.onLocalValueChanged(featureItem, value);
    }
}
