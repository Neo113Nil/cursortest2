package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelVO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/adapter/InsurancePanelBenefitAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$BenefitVO;", "clickHandler", "Landroidx/constraintlayout/widget/ConstraintLayout;", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsurancePanelBenefitAdapter extends AsyncListDifferDelegationAdapter<InsurancePanelVO.BenefitVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsurancePanelBenefitAdapter(@NotNull ConstraintLayout clickHandler) {
        super(new i.d<InsurancePanelVO.BenefitVO>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.InsurancePanelBenefitAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(InsurancePanelVO.BenefitVO oldItem, InsurancePanelVO.BenefitVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(InsurancePanelVO.BenefitVO oldItem, InsurancePanelVO.BenefitVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.delegatesManager.addDelegate(InsurancePanelBenefitAdapterDelegateKt.insurancePanelBenefitAdapterDelegate(clickHandler));
    }
}
