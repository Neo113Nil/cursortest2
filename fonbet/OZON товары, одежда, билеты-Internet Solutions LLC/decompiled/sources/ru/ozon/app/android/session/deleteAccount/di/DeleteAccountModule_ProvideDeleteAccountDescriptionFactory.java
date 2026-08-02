package ru.ozon.app.android.session.deleteAccount.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data.DeleteAccountDescriptionConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.DeleteAccountDescriptionViewMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyNoUIViewMapper;

/* loaded from: classes7.dex */
public final class DeleteAccountModule_ProvideDeleteAccountDescriptionFactory implements e<Widget> {
    public static Widget provideDeleteAccountDescription(DeleteAccountDescriptionConfig deleteAccountDescriptionConfig, DeleteAccountDescriptionViewMapper deleteAccountDescriptionViewMapper, DeleteAccountDescriptionStickyNoUIViewMapper deleteAccountDescriptionStickyNoUIViewMapper) {
        Widget provideDeleteAccountDescription = DeleteAccountModule.provideDeleteAccountDescription(deleteAccountDescriptionConfig, deleteAccountDescriptionViewMapper, deleteAccountDescriptionStickyNoUIViewMapper);
        j.d(provideDeleteAccountDescription);
        return provideDeleteAccountDescription;
    }
}
