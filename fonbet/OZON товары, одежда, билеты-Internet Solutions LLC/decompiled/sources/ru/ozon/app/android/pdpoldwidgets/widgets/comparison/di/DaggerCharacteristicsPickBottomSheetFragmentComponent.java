package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.di;

import Jb.j;
import Pc.a;
import retrofit2.Retrofit;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonApi;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonMapper;
import ru.ozon.app.android.pdp.ui.configurators.comparison.data.ComparisonRepository;
import ru.ozon.app.android.pdp.ui.configurators.di.PdpComparisonModule_Companion_ProvideComparisonApiFactory;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.CharacteristicsPickBottomSheetFragment;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.CharacteristicsPickBottomSheetFragment_MembersInjector;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.ComparisonBottomSheetViewModel;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.di.CharacteristicsPickBottomSheetFragmentComponent;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes13.dex */
public final class DaggerCharacteristicsPickBottomSheetFragmentComponent {

    private static final class CharacteristicsPickBottomSheetFragmentComponentImpl implements CharacteristicsPickBottomSheetFragmentComponent {
        private final AndroidPlatformComponentApi androidPlatformComponentApi;
        private final CharacteristicsPickBottomSheetFragmentComponentImpl characteristicsPickBottomSheetFragmentComponentImpl;
        private a<ComparisonBottomSheetViewModel> comparisonBottomSheetViewModelProvider;
        private final NetworkComponentApi networkComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CharacteristicsPickBottomSheetFragmentComponentImpl characteristicsPickBottomSheetFragmentComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f93197id;

            SwitchingProvider(CharacteristicsPickBottomSheetFragmentComponentImpl characteristicsPickBottomSheetFragmentComponentImpl, int i11) {
                this.characteristicsPickBottomSheetFragmentComponentImpl = characteristicsPickBottomSheetFragmentComponentImpl;
                this.f93197id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f93197id == 0) {
                    return (T) new ComparisonBottomSheetViewModel(this.characteristicsPickBottomSheetFragmentComponentImpl.comparisonRepository());
                }
                throw new AssertionError(this.f93197id);
            }
        }

        /* synthetic */ CharacteristicsPickBottomSheetFragmentComponentImpl(AndroidPlatformComponentApi androidPlatformComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(androidPlatformComponentApi, networkComponentApi);
        }

        private ComparisonApi comparisonApi() {
            Retrofit retrofit = this.networkComponentApi.getRetrofit();
            j.c(retrofit);
            return PdpComparisonModule_Companion_ProvideComparisonApiFactory.provideComparisonApi(retrofit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComparisonRepository comparisonRepository() {
            return new ComparisonRepository(comparisonApi(), new ComparisonMapper());
        }

        private void initialize(AndroidPlatformComponentApi androidPlatformComponentApi, NetworkComponentApi networkComponentApi) {
            this.comparisonBottomSheetViewModelProvider = new SwitchingProvider(this.characteristicsPickBottomSheetFragmentComponentImpl, 0);
        }

        private CharacteristicsPickBottomSheetFragment injectCharacteristicsPickBottomSheetFragment(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment) {
            AppType appType = this.androidPlatformComponentApi.getAppType();
            j.c(appType);
            CharacteristicsPickBottomSheetFragment_MembersInjector.injectAppType(characteristicsPickBottomSheetFragment, appType);
            CharacteristicsPickBottomSheetFragment_MembersInjector.injectProvider(characteristicsPickBottomSheetFragment, this.comparisonBottomSheetViewModelProvider);
            return characteristicsPickBottomSheetFragment;
        }

        @Override // ru.ozon.app.android.pdpoldwidgets.widgets.comparison.di.CharacteristicsPickBottomSheetFragmentComponent
        public void inject(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment) {
            injectCharacteristicsPickBottomSheetFragment(characteristicsPickBottomSheetFragment);
        }

        private CharacteristicsPickBottomSheetFragmentComponentImpl(AndroidPlatformComponentApi androidPlatformComponentApi, NetworkComponentApi networkComponentApi) {
            this.characteristicsPickBottomSheetFragmentComponentImpl = this;
            this.androidPlatformComponentApi = androidPlatformComponentApi;
            this.networkComponentApi = networkComponentApi;
            initialize(androidPlatformComponentApi, networkComponentApi);
        }
    }

    private static final class Factory implements CharacteristicsPickBottomSheetFragmentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.pdpoldwidgets.widgets.comparison.di.CharacteristicsPickBottomSheetFragmentComponent.Factory
        public CharacteristicsPickBottomSheetFragmentComponent create(AndroidPlatformComponentApi androidPlatformComponentApi, NetworkComponentApi networkComponentApi) {
            androidPlatformComponentApi.getClass();
            networkComponentApi.getClass();
            return new CharacteristicsPickBottomSheetFragmentComponentImpl(androidPlatformComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CharacteristicsPickBottomSheetFragmentComponent.Factory factory() {
        return new Factory(0);
    }
}
