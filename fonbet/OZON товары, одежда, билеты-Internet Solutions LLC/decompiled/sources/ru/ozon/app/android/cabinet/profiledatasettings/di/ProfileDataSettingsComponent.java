package ru.ozon.app.android.cabinet.profiledatasettings.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileBirthdayChooseDialog;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileGenderBottomSheet;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/di/ProfileDataSettingsComponent;", "", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/ui/ProfileGenderBottomSheet;", "view", "", "inject", "(Lru/ozon/app/android/cabinet/profiledatasettings/presentation/ui/ProfileGenderBottomSheet;)V", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/ui/ProfileBirthdayChooseDialog;", "(Lru/ozon/app/android/cabinet/profiledatasettings/presentation/ui/ProfileBirthdayChooseDialog;)V", "Factory", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ProfileDataSettingsComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/di/ProfileDataSettingsComponent$Factory;", "", "create", "Lru/ozon/app/android/cabinet/profiledatasettings/di/ProfileDataSettingsComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "componentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        ProfileDataSettingsComponent create(@NotNull NetworkComponentApi networkComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull NavigationComponentApi navigationComponentApi, @NotNull ComposerComponentApi composerComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull ContextComponentDependencies componentDependencies);
    }

    void inject(@NotNull ProfileBirthdayChooseDialog view);

    void inject(@NotNull ProfileGenderBottomSheet view);
}
