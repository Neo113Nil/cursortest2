package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.viewHolder.timer;

import B90.C2618u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState;", "", "Idle", "AnimationRequested", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState$AnimationRequested;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState$Idle;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TimerState {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState$AnimationRequested;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState;", "", "isLast", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnimationRequested implements TimerState {
        private final boolean isLast;

        public AnimationRequested(boolean z11) {
            this.isLast = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AnimationRequested) && this.isLast == ((AnimationRequested) other).isLast;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLast);
        }

        /* renamed from: isLast, reason: from getter */
        public final boolean getIsLast() {
            return this.isLast;
        }

        @NotNull
        public String toString() {
            return C2618u.g("AnimationRequested(isLast=", ")", this.isLast);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState$Idle;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/timer/TimerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Idle implements TimerState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return 731946435;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }
}
