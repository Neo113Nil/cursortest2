package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/adapter/InsurancePanelAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$InsuranceVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsurancePanelAdapter extends AsyncListDifferDelegationAdapter<InsurancePanelVO.InsuranceVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsurancePanelAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<InsurancePanelVO.InsuranceVO>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.InsurancePanelAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(InsurancePanelVO.InsuranceVO oldItem, InsurancePanelVO.InsuranceVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(InsurancePanelVO.InsuranceVO oldItem, InsurancePanelVO.InsuranceVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(InsurancePanelVO.InsuranceVO oldItem, InsurancePanelVO.InsuranceVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (oldItem.getIsSelected() != newItem.getIsSelected()) {
                    return newItem;
                }
                return null;
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.delegatesManager.addDelegate(InsurancePanelAdapterDelegateKt.insurancePanelAdapterDelegate(actionHandler));
    }
}
