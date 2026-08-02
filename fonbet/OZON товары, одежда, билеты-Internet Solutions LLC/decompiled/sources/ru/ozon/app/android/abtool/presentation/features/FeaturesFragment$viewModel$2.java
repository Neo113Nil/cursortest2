package ru.ozon.app.android.abtool.presentation.features;

import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.presentation.AbToggleViewModel;
import ru.ozon.app.android.abtool.presentation.AbToggleViewModelFactory;
import ru.ozon.app.android.abtool.utils.NamespaceUtilsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/abtool/presentation/AbToggleViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FeaturesFragment$viewModel$2 extends AbstractC7737t implements Function0<AbToggleViewModel> {
    final /* synthetic */ FeaturesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeaturesFragment$viewModel$2(FeaturesFragment featuresFragment) {
        super(0);
        this.this$0 = featuresFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbToggleViewModel invoke() {
        return (AbToggleViewModel) new z0(this.this$0, new AbToggleViewModelFactory(NamespaceUtilsKt.getNamespace(this.this$0.getArguments()))).a(AbToggleViewModel.class);
    }
}
