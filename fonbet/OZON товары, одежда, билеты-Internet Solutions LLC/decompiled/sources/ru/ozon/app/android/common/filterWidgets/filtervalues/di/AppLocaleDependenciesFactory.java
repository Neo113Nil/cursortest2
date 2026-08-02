package ru.ozon.app.android.common.filterWidgets.filtervalues.di;

import Sc.InterfaceC4008j;
import Sc.k;
import gi.C6740b;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.data.ChangeLocaleUseCase;
import ru.ozon.app.android.account.locale.app.di.AppLocaleDependenciesApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/di/AppLocaleDependenciesFactory;", "Lii/a;", "Lru/ozon/app/android/account/locale/app/di/AppLocaleDependenciesApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/account/locale/app/di/AppLocaleDependenciesApi;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLocaleDependenciesFactory implements InterfaceC7081a<AppLocaleDependenciesApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public AppLocaleDependenciesApi create(@NotNull final C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        return new AppLocaleDependenciesApi(componentStorage) { // from class: ru.ozon.app.android.common.filterWidgets.filtervalues.di.AppLocaleDependenciesFactory$create$1

            /* renamed from: changeLocaleUseCase$delegate, reason: from kotlin metadata */
            private final InterfaceC4008j changeLocaleUseCase;

            {
                this.changeLocaleUseCase = k.b(new AppLocaleDependenciesFactory$create$1$changeLocaleUseCase$2(componentStorage));
            }

            @Override // ru.ozon.app.android.account.locale.app.di.AppLocaleDependenciesApi
            public ChangeLocaleUseCase getChangeLocaleUseCase() {
                return (ChangeLocaleUseCase) this.changeLocaleUseCase.getValue();
            }
        };
    }
}
