package ru.ozon.app.android.pdp.widgets.delivery.async;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryErrorUpdateKey;", "LA00/a$J$a;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AsyncDeliveryErrorUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final Throwable error;

    public AsyncDeliveryErrorUpdateKey(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }
}
