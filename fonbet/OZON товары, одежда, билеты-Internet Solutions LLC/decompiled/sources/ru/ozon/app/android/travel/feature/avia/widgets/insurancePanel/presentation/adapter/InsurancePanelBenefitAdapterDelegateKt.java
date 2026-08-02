package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelVO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"insurancePanelBenefitAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$BenefitVO;", "clickHandler", "Landroidx/constraintlayout/widget/ConstraintLayout;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsurancePanelBenefitAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<InsurancePanelVO.BenefitVO>> insurancePanelBenefitAdapterDelegate(@NotNull ConstraintLayout clickHandler) {
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        return new DslViewBindingListAdapterDelegate(InsurancePanelBenefitAdapterDelegateKt$insurancePanelBenefitAdapterDelegate$1.INSTANCE, InsurancePanelBenefitAdapterDelegateKt$insurancePanelBenefitAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new InsurancePanelBenefitAdapterDelegateKt$insurancePanelBenefitAdapterDelegate$2(clickHandler), InsurancePanelBenefitAdapterDelegateKt$insurancePanelBenefitAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
