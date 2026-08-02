package ru.ozon.app.android.fresh.navigation.configurators;

import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/configurators/CategoryMainPageFreshConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "cancelBackgroundChangeJob", "Landroidx/lifecycle/J;", "owner", "changeBackgroundAfterLoading", "(Landroidx/lifecycle/J;)V", "onResume", "onDestroy", "Lxe/B0;", "changeBackgroundJob", "Lxe/B0;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CategoryMainPageFreshConfigurator extends ComposerScreenConfig.PageConfigurator {
    private B0 changeBackgroundJob;

    private final void cancelBackgroundChangeJob() {
        B0 b02 = this.changeBackgroundJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.changeBackgroundJob = null;
    }

    private final void changeBackgroundAfterLoading(J owner) {
        C10727i.c(K.a(owner), null, null, new CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1(this, owner, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        cancelBackgroundChangeJob();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        changeBackgroundAfterLoading(owner);
    }
}
