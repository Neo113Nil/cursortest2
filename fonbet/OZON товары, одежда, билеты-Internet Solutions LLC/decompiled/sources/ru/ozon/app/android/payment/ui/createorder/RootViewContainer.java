package ru.ozon.app.android.payment.ui.createorder;

import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/RootViewContainer;", "", "Landroid/view/ViewGroup;", "rootView", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Landroid/view/ViewGroup;Landroidx/lifecycle/J;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "Landroidx/lifecycle/J;", "getLifecycleOwner", "()Landroidx/lifecycle/J;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RootViewContainer {

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final ViewGroup rootView;

    public RootViewContainer(@NotNull ViewGroup rootView, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.rootView = rootView;
        this.lifecycleOwner = lifecycleOwner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RootViewContainer)) {
            return false;
        }
        RootViewContainer rootViewContainer = (RootViewContainer) other;
        return Intrinsics.d(this.rootView, rootViewContainer.rootView) && Intrinsics.d(this.lifecycleOwner, rootViewContainer.lifecycleOwner);
    }

    @NotNull
    public final J getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final ViewGroup getRootView() {
        return this.rootView;
    }

    public int hashCode() {
        return this.lifecycleOwner.hashCode() + (this.rootView.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RootViewContainer(rootView=" + this.rootView + ", lifecycleOwner=" + this.lifecycleOwner + ")";
    }
}
