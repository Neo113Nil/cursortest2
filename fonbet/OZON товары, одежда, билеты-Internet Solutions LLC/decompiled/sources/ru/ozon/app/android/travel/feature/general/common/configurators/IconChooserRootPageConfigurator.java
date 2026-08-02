package ru.ozon.app.android.travel.feature.general.common.configurators;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.initializer.TravelPageStorageInitializerConfigurator;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKey;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/configurators/IconChooserRootPageConfigurator;", "Lru/ozon/app/android/travel/data/storage/initializer/TravelPageStorageInitializerConfigurator;", "storageManagerHolder", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "<init>", "(Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconChooserRootPageConfigurator extends TravelPageStorageInitializerConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconChooserRootPageConfigurator(@NotNull TravelStorageManagerHolder storageManagerHolder) {
        super(storageManagerHolder, TravelPageKey.ICON_CHOOSER, true);
        Intrinsics.checkNotNullParameter(storageManagerHolder, "storageManagerHolder");
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 2836 || (references = getReferences()) == null || (controller = references.getController()) == null) {
            return;
        }
        controller.d(IconChooserUpdate.INSTANCE);
    }
}
