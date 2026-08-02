package ru.ozon.app.android.cart;

import Ql.c;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/CartViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "checkIfFirstLoadProcessedAndReset", "()Z", "firstLoadProcessed", "Z", "SplitQuantityChange", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartViewModel extends w0 {
    private boolean firstLoadProcessed;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/CartViewModel$SplitQuantityChange;", "", "", "splitId", "", "newQuantity", "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSplitId", "()J", "I", "getNewQuantity", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SplitQuantityChange {
        private final int newQuantity;
        private final long splitId;

        public SplitQuantityChange(long j11, int i11) {
            this.splitId = j11;
            this.newQuantity = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitQuantityChange)) {
                return false;
            }
            SplitQuantityChange splitQuantityChange = (SplitQuantityChange) other;
            return this.splitId == splitQuantityChange.splitId && this.newQuantity == splitQuantityChange.newQuantity;
        }

        public final int getNewQuantity() {
            return this.newQuantity;
        }

        public final long getSplitId() {
            return this.splitId;
        }

        public int hashCode() {
            return Integer.hashCode(this.newQuantity) + (Long.hashCode(this.splitId) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = c.b(this.splitId, "SplitQuantityChange(splitId=", this.newQuantity, ", newQuantity=");
            b11.append(")");
            return b11.toString();
        }
    }

    public final boolean checkIfFirstLoadProcessedAndReset() {
        boolean z11 = this.firstLoadProcessed;
        this.firstLoadProcessed = true;
        return z11;
    }
}
