package ru.ozon.app.android.partpayment.contractbtn;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class ContractBtnModule_Companion_ProvideContractBtnWidgetFactory implements e<Widget> {
    public static Widget provideContractBtnWidget(ContractBtnConfig contractBtnConfig, ContractBtnViewMapper contractBtnViewMapper) {
        Widget provideContractBtnWidget = ContractBtnModule.INSTANCE.provideContractBtnWidget(contractBtnConfig, contractBtnViewMapper);
        j.d(provideContractBtnWidget);
        return provideContractBtnWidget;
    }
}
