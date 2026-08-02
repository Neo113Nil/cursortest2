package ru.ozon.app.android.geo.common.configurators;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.location.ComposerLocationRepository;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/geo/common/configurators/RefreshByLocationConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/location/ComposerLocationRepository;", "composerLocationRepository", "<init>", "(Lru/ozon/app/android/location/ComposerLocationRepository;)V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/location/ComposerLocationRepository;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByLocationConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final ComposerLocationRepository composerLocationRepository;

    public RefreshByLocationConfigurator(@NotNull ComposerLocationRepository composerLocationRepository) {
        Intrinsics.checkNotNullParameter(composerLocationRepository, "composerLocationRepository");
        this.composerLocationRepository = composerLocationRepository;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C2399j.C(new C(new C2408n0(C5427n.a(this.composerLocationRepository.getCurrentAreaIdChangedFlow(), owner.getLifecycle(), AbstractC5434v.b.STARTED), new RefreshByLocationConfigurator$onCreate$1(this, null)), new RefreshByLocationConfigurator$onCreate$2(null)), K.a(owner));
    }
}
