package ru.ozon.app.android.bank.widgets.di;

import Jb.j;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusViewModel;
import ru.ozon.app.android.bank.widgets.di.BankAccountStatusWidgetComponent;

/* loaded from: classes11.dex */
public final class DaggerBankAccountStatusWidgetComponent {

    private static final class BankAccountStatusWidgetComponentImpl implements BankAccountStatusWidgetComponent {
        private final ActionComponentApi actionComponentApi;
        private final BankAccountStatusWidgetComponentImpl bankAccountStatusWidgetComponentImpl;

        /* synthetic */ BankAccountStatusWidgetComponentImpl(ActionComponentApi actionComponentApi, int i11) {
            this(actionComponentApi);
        }

        @Override // ru.ozon.app.android.bank.widgets.di.BankAccountStatusWidgetComponent
        public BankAccountStatusViewModel getViewModel() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            return new BankAccountStatusViewModel(actionRepository);
        }

        private BankAccountStatusWidgetComponentImpl(ActionComponentApi actionComponentApi) {
            this.bankAccountStatusWidgetComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
        }
    }

    private static final class Factory implements BankAccountStatusWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.bank.widgets.di.BankAccountStatusWidgetComponent.Factory
        public BankAccountStatusWidgetComponent create(ActionComponentApi actionComponentApi) {
            actionComponentApi.getClass();
            return new BankAccountStatusWidgetComponentImpl(actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static BankAccountStatusWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
