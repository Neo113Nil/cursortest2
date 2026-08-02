package ru.ozon.app.android.payment.ui.createorder;

import C.C2702w;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u0003\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0003\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/UsualHandledState;", "T", "Lru/ozon/app/android/payment/ui/createorder/HandledState;", "state", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "", "handle", "", "(Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UsualHandledState<T> implements HandledState<T> {
    private final T state;

    public UsualHandledState(T t2) {
        this.state = t2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UsualHandledState) && Intrinsics.d(this.state, ((UsualHandledState) other).state);
    }

    public int hashCode() {
        T t2 = this.state;
        if (t2 == null) {
            return 0;
        }
        return t2.hashCode();
    }

    @Override // ru.ozon.app.android.payment.ui.createorder.HandledState
    public void state(@NotNull Function1<? super T, Boolean> handle) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        handle.invoke(this.state);
    }

    @NotNull
    public String toString() {
        return C2702w.c(this.state, "UsualHandledState(state=", ")");
    }
}
