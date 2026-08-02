package ru.ozon.app.android.cart.common.domain.delegate;

import Sc.InterfaceC3999a;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\fR\u001a\u0010\n\u001a\u00020\t8&X§\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8&X§\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "", "Landroidx/lifecycle/v$b;", "state", "", "setState", "(Landroidx/lifecycle/v$b;)V", "", "miniApp", "", "isOpen", "(Ljava/lang/String;)Z", "(Landroidx/lifecycle/v$b;Ljava/lang/String;)V", "()Z", "isOpen$annotations", "()V", "isStarted", "isStarted$annotations", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartScreenStateHolder {
    boolean isOpen();

    boolean isOpen(@NotNull String miniApp);

    boolean isStarted();

    @InterfaceC3999a
    void setState(@NotNull AbstractC5434v.b state);

    void setState(@NotNull AbstractC5434v.b state, @NotNull String miniApp);
}
