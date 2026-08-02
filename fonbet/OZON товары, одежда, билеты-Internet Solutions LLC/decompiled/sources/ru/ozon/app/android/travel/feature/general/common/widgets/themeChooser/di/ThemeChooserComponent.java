package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.di;

import FU.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation.ThemeChooserViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/di/ThemeChooserComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserViewModel$Factory;", "getViewModelFactory", "()Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserViewModel$Factory;", "viewModelFactory", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ThemeChooserComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/di/ThemeChooserComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/di/ThemeChooserComponent;", "create", "(Lk20/g;)Lk20/e;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ThemeChooserComponent create$lambda$0(final C7475g c7475g) {
            return new ThemeChooserComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.di.ThemeChooserComponent$Companion$create$1$1

                /* renamed from: androidPlatformComponentApi$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j androidPlatformComponentApi;
                private final DarkThemeManager darkThemeManager = getAndroidPlatformComponentApi().getDarkThemeManager();

                {
                    this.androidPlatformComponentApi = k.b(new ThemeChooserComponent$Companion$create$1$1$androidPlatformComponentApi$2(c7475g));
                }

                private final AndroidPlatformComponentApi getAndroidPlatformComponentApi() {
                    return (AndroidPlatformComponentApi) this.androidPlatformComponentApi.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.di.ThemeChooserComponent
                public ThemeChooserViewModel.Factory getViewModelFactory() {
                    return new ThemeChooserViewModel.Factory(this.darkThemeManager);
                }
            };
        }

        @NotNull
        public final C7473e<ThemeChooserComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ThemeChooserComponent.class), new a(storage, 10));
        }
    }

    @NotNull
    ThemeChooserViewModel.Factory getViewModelFactory();
}
