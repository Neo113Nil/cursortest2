package ru.ozon.app.android.session.deleteAccount.di;

import I00.d;
import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApi;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.data.DeleteAccountButtonConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data.DeleteAccountDescriptionConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.DeleteAccountDescriptionViewMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyNoUIViewMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.ConfirmDeleteOtpConfig;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpNoUiViewMapper;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/di/DeleteAccountModule;", "", "<init>", "()V", "provideConfirmDeleteOtp", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpConfig;", "viewMapper", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpNoUiViewMapper;", "provideDeleteAccountDescription", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionConfig;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionViewMapper;", "stickyViewMapper", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyNoUIViewMapper;", "provideDeleteAccountButton", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/data/DeleteAccountButtonConfig;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewMapper;", "provideDeleteAccountApi", "Lru/ozon/app/android/session/deleteAccount/data/DeleteAccountApi;", "retrofit", "Lretrofit2/Retrofit;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteAccountModule {

    @NotNull
    public static final DeleteAccountModule INSTANCE = new DeleteAccountModule();

    private DeleteAccountModule() {
    }

    @NotNull
    public static final Widget provideConfirmDeleteOtp(@NotNull ConfirmDeleteOtpConfig config, @NotNull ConfirmDeleteOtpNoUiViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget("csma", "deleteAccountOtpMobile", config, new ConfirmDeleteOtpNoUiViewMapper[]{viewMapper});
    }

    @NotNull
    public static final DeleteAccountApi provideDeleteAccountApi(@NotNull Retrofit retrofit) {
        return (DeleteAccountApi) C4598rp.b(retrofit, "retrofit", DeleteAccountApi.class, "create(...)");
    }

    @NotNull
    public static final Widget provideDeleteAccountButton(@NotNull DeleteAccountButtonConfig config, @NotNull DeleteAccountButtonViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget("csma", "deleteAccountButtonMobile", config, new DeleteAccountButtonViewMapper[]{viewMapper});
    }

    @NotNull
    public static final Widget provideDeleteAccountDescription(@NotNull DeleteAccountDescriptionConfig config, @NotNull DeleteAccountDescriptionViewMapper viewMapper, @NotNull DeleteAccountDescriptionStickyNoUIViewMapper stickyViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(stickyViewMapper, "stickyViewMapper");
        return new Widget("csma", "deleteAccountMobile", config, new d[]{viewMapper, stickyViewMapper});
    }
}
