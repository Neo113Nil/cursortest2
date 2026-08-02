package ru.ozon.app.android.session.deleteAccount.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.data.DeleteAccountButtonConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewMapper;

/* loaded from: classes7.dex */
public final class DeleteAccountModule_ProvideDeleteAccountButtonFactory implements e<Widget> {
    public static Widget provideDeleteAccountButton(DeleteAccountButtonConfig deleteAccountButtonConfig, DeleteAccountButtonViewMapper deleteAccountButtonViewMapper) {
        Widget provideDeleteAccountButton = DeleteAccountModule.provideDeleteAccountButton(deleteAccountButtonConfig, deleteAccountButtonViewMapper);
        j.d(provideDeleteAccountButton);
        return provideDeleteAccountButton;
    }
}
