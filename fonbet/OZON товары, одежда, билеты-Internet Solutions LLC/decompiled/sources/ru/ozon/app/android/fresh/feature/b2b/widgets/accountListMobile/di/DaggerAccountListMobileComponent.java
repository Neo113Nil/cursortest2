package ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.di;

import Jb.j;
import WZ.l;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.data.AccountListMobileMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.di.AccountListMobileComponent;

/* loaded from: classes12.dex */
public final class DaggerAccountListMobileComponent {

    private static final class AccountListMobileComponentImpl implements AccountListMobileComponent {
        private final AccountListMobileComponentImpl accountListMobileComponentImpl;
        private final RetainComposerComponentApi retainComposerComponentApi;

        /* synthetic */ AccountListMobileComponentImpl(RetainComposerComponentApi retainComposerComponentApi, int i11) {
            this(retainComposerComponentApi);
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.di.AccountListMobileComponent
        public AccountListMobileMapper getAccountListMobileMapper() {
            return new AccountListMobileMapper();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.di.AccountListMobileComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        private AccountListMobileComponentImpl(RetainComposerComponentApi retainComposerComponentApi) {
            this.accountListMobileComponentImpl = this;
            this.retainComposerComponentApi = retainComposerComponentApi;
        }
    }

    private static final class Factory implements AccountListMobileComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.di.AccountListMobileComponent.Factory
        public AccountListMobileComponent create(RetainComposerComponentApi retainComposerComponentApi) {
            retainComposerComponentApi.getClass();
            return new AccountListMobileComponentImpl(retainComposerComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AccountListMobileComponent.Factory factory() {
        return new Factory(0);
    }
}
