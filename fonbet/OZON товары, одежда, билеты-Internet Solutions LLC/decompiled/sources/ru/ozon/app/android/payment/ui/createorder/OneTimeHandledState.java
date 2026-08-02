package ru.ozon.app.android.payment.ui.createorder;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u0003\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0003\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/OneTimeHandledState;", "T", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "state", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "", "handle", "", "(Lkotlin/jvm/functions/Function1;)V", "oneTimeState", "Ljava/lang/Object;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneTimeHandledState<T> implements HandledState<T> {
    private T oneTimeState;

    public OneTimeHandledState(T t2) {
        this.oneTimeState = t2;
    }

    @Override // ru.ozon.app.android.payment.ui.createorder.HandledState
    public void state(@NotNull Function1<? super T, Boolean> handle) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        T t2 = this.oneTimeState;
        if (t2 != null && handle.invoke(t2).booleanValue()) {
            this.oneTimeState = null;
        }
    }
}
