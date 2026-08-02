package ru.ozon.app.android.pdp.ui.configurators.common.additionalViewPool;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0012\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionRecycledViewPoolConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "level", "", "clearCache", "(I)V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onStart", "onDestroy", "Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionalRecycledViewPool;", "additionalViewPool", "Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionalRecycledViewPool;", "ru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionRecycledViewPoolConfigurator$clearCacheMemoryCallback$1", "clearCacheMemoryCallback", "Lru/ozon/app/android/pdp/ui/configurators/common/additionalViewPool/AdditionRecycledViewPoolConfigurator$clearCacheMemoryCallback$1;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdditionRecycledViewPoolConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AdditionalRecycledViewPool additionalViewPool = new AdditionalRecycledViewPool();

    @NotNull
    private final AdditionRecycledViewPoolConfigurator$clearCacheMemoryCallback$1 clearCacheMemoryCallback = new ComponentCallbacks2() { // from class: ru.ozon.app.android.pdp.ui.configurators.common.additionalViewPool.AdditionRecycledViewPoolConfigurator$clearCacheMemoryCallback$1
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            AdditionRecycledViewPoolConfigurator.this.clearCache(level);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearCache(int level) {
        if (level >= 10) {
            this.additionalViewPool.clear();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 != null) {
            a11.registerComponentCallbacks(this.clearCacheMemoryCallback);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 != null) {
            a11.unregisterComponentCallbacks(this.clearCacheMemoryCallback);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        View view;
        RecyclerView composerRecyclerView;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        RecyclerView.u recycledViewPool = composerRecyclerView.getRecycledViewPool();
        Intrinsics.checkNotNullExpressionValue(recycledViewPool, "getRecycledViewPool(...)");
        if (recycledViewPool instanceof AdditionalRecycledViewPoolWrapper) {
            return;
        }
        composerRecyclerView.setRecycledViewPool(new AdditionalRecycledViewPoolWrapper(recycledViewPool, this.additionalViewPool));
    }
}
