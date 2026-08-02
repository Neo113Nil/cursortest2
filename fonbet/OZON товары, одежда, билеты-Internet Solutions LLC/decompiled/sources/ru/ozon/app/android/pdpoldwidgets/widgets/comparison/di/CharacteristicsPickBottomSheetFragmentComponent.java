package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.CharacteristicsPickBottomSheetFragment;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/di/CharacteristicsPickBottomSheetFragmentComponent;", "", "inject", "", "characteristicsPickBottomSheetFragment", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsPickBottomSheetFragment;", "Factory", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CharacteristicsPickBottomSheetFragmentComponent {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/di/CharacteristicsPickBottomSheetFragmentComponent$Factory;", "", "create", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/di/CharacteristicsPickBottomSheetFragmentComponent;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CharacteristicsPickBottomSheetFragmentComponent create(@NotNull AndroidPlatformComponentApi androidPlatformComponentApi, @NotNull NetworkComponentApi networkComponentApi);
    }

    void inject(@NotNull CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment);
}
