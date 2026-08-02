package ru.ozon.app.android.travel.feature.general.common.configurators;

import a00.C4911f;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.initializer.TravelPageStorageInitializerConfigurator;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKey;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/configurators/IconChooserModalPageConfigurator;", "Lru/ozon/app/android/travel/data/storage/initializer/TravelPageStorageInitializerConfigurator;", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "storageManagerHolder", "<init>", "(Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;)V", "Landroidx/lifecycle/J;", "owner", "", "onDestroy", "(Landroidx/lifecycle/J;)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IconChooserModalPageConfigurator extends TravelPageStorageInitializerConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconChooserModalPageConfigurator(@NotNull TravelStorageManagerHolder storageManagerHolder) {
        super(storageManagerHolder, TravelPageKey.ICON_CHOOSER, false);
        Intrinsics.checkNotNullParameter(storageManagerHolder, "storageManagerHolder");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        C4911f ownerContainer;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null) {
            return;
        }
        ComposerExtKt.sendResultToTargetFragment(ownerContainer, 2836, IconChooserModalPageConfigurator$onDestroy$1.INSTANCE);
    }
}
