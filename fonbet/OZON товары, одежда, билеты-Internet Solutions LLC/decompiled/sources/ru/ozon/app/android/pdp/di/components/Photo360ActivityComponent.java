package ru.ozon.app.android.pdp.di.components;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/di/components/Photo360ActivityComponent;", "", "inject", "", "photo360Activity", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360Activity;", "Factory", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Photo360ActivityComponent {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/di/components/Photo360ActivityComponent$Factory;", "", "create", "Lru/ozon/app/android/pdp/di/components/Photo360ActivityComponent;", "photo360Activity", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360Activity;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        Photo360ActivityComponent create(@NotNull Photo360Activity photo360Activity, @NotNull NetworkComponentApi networkComponentApi, @NotNull ContextComponentDependencies contextComponentDependencies);
    }

    void inject(@NotNull Photo360Activity photo360Activity);
}
