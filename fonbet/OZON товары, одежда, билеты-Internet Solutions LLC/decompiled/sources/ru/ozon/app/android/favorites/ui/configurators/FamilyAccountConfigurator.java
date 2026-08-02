package ru.ozon.app.android.favorites.ui.configurators;

import Ae.C2399j;
import Ae.C2408n0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.data.family.FamilyAccountRefresher;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/FamilyAccountConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/favorites/data/family/FamilyAccountRefresher;", "familyAccountRefresher", "<init>", "(Lru/ozon/app/android/favorites/data/family/FamilyAccountRefresher;)V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/favorites/data/family/FamilyAccountRefresher;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FamilyAccountConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FamilyAccountRefresher familyAccountRefresher;

    public FamilyAccountConfigurator(@NotNull FamilyAccountRefresher familyAccountRefresher) {
        Intrinsics.checkNotNullParameter(familyAccountRefresher, "familyAccountRefresher");
        this.familyAccountRefresher = familyAccountRefresher;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        this.familyAccountRefresher.initState();
        C2399j.C(C5427n.a(new C2408n0(this.familyAccountRefresher.getRefreshRequest(), new FamilyAccountConfigurator$onCreate$1(controller, null)), owner.getLifecycle(), AbstractC5434v.b.RESUMED), K.a(owner));
    }
}
