package ru.ozon.app.android.pdp.view.pdp;

import AF.d;
import Fn.C3056e;
import Lm0.a;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storage.adult.AdultState;
import sc.C9653a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/view/pdp/RefreshByAdultStateConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/storage/adult/AdultState;", "adultState", "<init>", "(Lru/ozon/app/android/storage/adult/AdultState;)V", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onResume", "onPause", "Lru/ozon/app/android/storage/adult/AdultState;", "Lnc/b;", "disposable", "Lnc/b;", "", "prevValue", "Z", "skipRefresh", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByAdultStateConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AdultState adultState;

    @NotNull
    private InterfaceC8487b disposable;
    private boolean prevValue;
    private boolean skipRefresh;

    public RefreshByAdultStateConfigurator(@NotNull AdultState adultState) {
        Intrinsics.checkNotNullParameter(adultState, "adultState");
        this.adultState = adultState;
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
        this.prevValue = adultState.isUserAnAdult();
        this.skipRefresh = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.skipRefresh = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.disposable.dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(owner, "owner");
        boolean isUserAnAdult = this.adultState.isUserAnAdult();
        if (this.prevValue != isUserAnAdult && !this.skipRefresh && !isUserAnAdult && (references = getReferences()) != null && (controller = references.getController()) != null) {
            InterfaceC7851b.a.a(controller, null, null, null, null, 15);
        }
        this.disposable = this.adultState.observeUserAdultState().observeOn(C8125a.a()).subscribe(new d(new RefreshByAdultStateConfigurator$onResume$1(this), 4), new C3056e(new RefreshByAdultStateConfigurator$onResume$2(a.f17149a), 3));
        this.skipRefresh = false;
    }
}
