package ru.ozon.app.android.utils.rx;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/utils/rx/RepeatLifecycleDisposable;", "Lnc/b;", "Lru/ozon/app/android/utils/rx/DisposableLifecycleObserver;", "lifecycleObserver", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/utils/rx/DisposableLifecycleObserver;Landroidx/lifecycle/J;)V", "", "isDisposed", "()Z", "", "dispose", "()V", "Lru/ozon/app/android/utils/rx/DisposableLifecycleObserver;", "Landroidx/lifecycle/J;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RepeatLifecycleDisposable implements InterfaceC8487b {

    @NotNull
    private final DisposableLifecycleObserver lifecycleObserver;

    @NotNull
    private final J lifecycleOwner;

    public RepeatLifecycleDisposable(@NotNull DisposableLifecycleObserver lifecycleObserver, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.lifecycleObserver = lifecycleObserver;
        this.lifecycleOwner = lifecycleOwner;
    }

    @Override // nc.InterfaceC8487b
    public void dispose() {
        this.lifecycleObserver.dispose();
        this.lifecycleOwner.getLifecycle().e(this.lifecycleObserver);
    }

    @Override // nc.InterfaceC8487b
    public boolean isDisposed() {
        return this.lifecycleObserver.isDisposed() && this.lifecycleOwner.getLifecycle().b() == AbstractC5434v.b.DESTROYED;
    }
}
