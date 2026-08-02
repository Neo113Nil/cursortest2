package ru.ozon.app.android.travel.actionhandler.utils;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/utils/LifecycleDisposable;", "Lnc/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "lifecycleOwner", "disposable", "<init>", "(Landroidx/lifecycle/J;Lnc/b;)V", "", "isDisposed", "()Z", "", "dispose", "()V", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "Landroidx/lifecycle/J;", "Lnc/b;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LifecycleDisposable implements InterfaceC8487b, DefaultLifecycleObserver {

    @NotNull
    private final InterfaceC8487b disposable;

    @NotNull
    private final J lifecycleOwner;

    public LifecycleDisposable(@NotNull J lifecycleOwner, @NotNull InterfaceC8487b disposable) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        this.lifecycleOwner = lifecycleOwner;
        this.disposable = disposable;
    }

    @Override // nc.InterfaceC8487b
    public void dispose() {
        this.disposable.dispose();
        this.lifecycleOwner.getLifecycle().e(this);
    }

    @Override // nc.InterfaceC8487b
    public boolean isDisposed() {
        return this.disposable.isDisposed() || this.lifecycleOwner.getLifecycle().b() == AbstractC5434v.b.DESTROYED;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.disposable.dispose();
    }
}
