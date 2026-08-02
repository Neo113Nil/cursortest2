package ru.ozon.app.android.session.deleteAccount.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.ConfirmDeleteOtpConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpNoUiViewMapper;

/* loaded from: classes7.dex */
public final class DeleteAccountModule_ProvideConfirmDeleteOtpFactory implements e<Widget> {
    public static Widget provideConfirmDeleteOtp(ConfirmDeleteOtpConfig confirmDeleteOtpConfig, ConfirmDeleteOtpNoUiViewMapper confirmDeleteOtpNoUiViewMapper) {
        Widget provideConfirmDeleteOtp = DeleteAccountModule.provideConfirmDeleteOtp(confirmDeleteOtpConfig, confirmDeleteOtpNoUiViewMapper);
        j.d(provideConfirmDeleteOtp);
        return provideConfirmDeleteOtp;
    }
}
