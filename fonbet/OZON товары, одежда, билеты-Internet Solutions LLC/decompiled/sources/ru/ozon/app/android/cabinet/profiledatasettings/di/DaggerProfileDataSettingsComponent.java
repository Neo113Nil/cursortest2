package ru.ozon.app.android.cabinet.profiledatasettings.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cabinet.profiledatasettings.di.ProfileDataSettingsComponent;
import ru.ozon.app.android.cabinet.profiledatasettings.domain.ProfileSettingsInteractorImpl;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper.ProfileDateMapper;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.mapper.ProfileUserViewMapper;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileBirthdayChooseDialog;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileBirthdayChooseDialog_MembersInjector;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileGenderBottomSheet;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileGenderBottomSheet_MembersInjector;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.viewmodel.ProfileDataSettingsViewModel;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

/* loaded from: classes11.dex */
public final class DaggerProfileDataSettingsComponent {

    private static final class Factory implements ProfileDataSettingsComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cabinet.profiledatasettings.di.ProfileDataSettingsComponent.Factory
        public ProfileDataSettingsComponent create(NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            networkComponentApi.getClass();
            accountComponentApi.getClass();
            navigationComponentApi.getClass();
            composerComponentApi.getClass();
            actionComponentApi.getClass();
            contextComponentDependencies.getClass();
            return new ProfileDataSettingsComponentImpl(networkComponentApi, accountComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class ProfileDataSettingsComponentImpl implements ProfileDataSettingsComponent {
        private final AccountComponentApi accountComponentApi;
        private final ProfileDataSettingsComponentImpl profileDataSettingsComponentImpl;
        private a<ProfileDataSettingsViewModel> profileDataSettingsViewModelProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92222id;
            private final ProfileDataSettingsComponentImpl profileDataSettingsComponentImpl;

            SwitchingProvider(ProfileDataSettingsComponentImpl profileDataSettingsComponentImpl, int i11) {
                this.profileDataSettingsComponentImpl = profileDataSettingsComponentImpl;
                this.f92222id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92222id == 0) {
                    return (T) new ProfileDataSettingsViewModel(this.profileDataSettingsComponentImpl.profileSettingsInteractorImpl(), new ProfileUserViewMapper(), new ProfileDateMapper());
                }
                throw new AssertionError(this.f92222id);
            }
        }

        /* synthetic */ ProfileDataSettingsComponentImpl(NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies, int i11) {
            this(networkComponentApi, accountComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.profileDataSettingsViewModelProvider = new SwitchingProvider(this.profileDataSettingsComponentImpl, 0);
        }

        private ProfileBirthdayChooseDialog injectProfileBirthdayChooseDialog(ProfileBirthdayChooseDialog profileBirthdayChooseDialog) {
            ProfileBirthdayChooseDialog_MembersInjector.injectPViewModel(profileBirthdayChooseDialog, d.a(this.profileDataSettingsViewModelProvider));
            return profileBirthdayChooseDialog;
        }

        private ProfileGenderBottomSheet injectProfileGenderBottomSheet(ProfileGenderBottomSheet profileGenderBottomSheet) {
            ProfileGenderBottomSheet_MembersInjector.injectPViewModel(profileGenderBottomSheet, d.a(this.profileDataSettingsViewModelProvider));
            return profileGenderBottomSheet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ProfileSettingsInteractorImpl profileSettingsInteractorImpl() {
            UserManager userManager = this.accountComponentApi.getUserManager();
            j.c(userManager);
            return new ProfileSettingsInteractorImpl(userManager);
        }

        @Override // ru.ozon.app.android.cabinet.profiledatasettings.di.ProfileDataSettingsComponent
        public void inject(ProfileGenderBottomSheet profileGenderBottomSheet) {
            injectProfileGenderBottomSheet(profileGenderBottomSheet);
        }

        private ProfileDataSettingsComponentImpl(NetworkComponentApi networkComponentApi, AccountComponentApi accountComponentApi, NavigationComponentApi navigationComponentApi, ComposerComponentApi composerComponentApi, ActionComponentApi actionComponentApi, ContextComponentDependencies contextComponentDependencies) {
            this.profileDataSettingsComponentImpl = this;
            this.accountComponentApi = accountComponentApi;
            initialize(networkComponentApi, accountComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies);
        }

        @Override // ru.ozon.app.android.cabinet.profiledatasettings.di.ProfileDataSettingsComponent
        public void inject(ProfileBirthdayChooseDialog profileBirthdayChooseDialog) {
            injectProfileBirthdayChooseDialog(profileBirthdayChooseDialog);
        }
    }

    public static ProfileDataSettingsComponent.Factory factory() {
        return new Factory(0);
    }
}
