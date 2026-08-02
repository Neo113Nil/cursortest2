package ru.ozon.app.android.cart.common.models.events;

import T7.E;
import WZ.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/common/models/events/TokenizedCartType;", "", "<init>", "()V", "FilterCartType", "ChangeCartType", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartType$ChangeCartType;", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartType$FilterCartType;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TokenizedCartType {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/common/models/events/TokenizedCartType$ChangeCartType;", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartType;", "", "quantity", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getQuantity", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangeCartType extends TokenizedCartType {
        private final int quantity;

        public ChangeCartType(int i11) {
            super(null);
            this.quantity = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeCartType) && this.quantity == ((ChangeCartType) other).quantity;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public int hashCode() {
            return Integer.hashCode(this.quantity);
        }

        @NotNull
        public String toString() {
            return E.a(this.quantity, "ChangeCartType(quantity=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/common/models/events/TokenizedCartType$FilterCartType;", "Lru/ozon/app/android/cart/common/models/events/TokenizedCartType;", "LWZ/i;", "filter", "<init>", "(LWZ/i;)V", "LWZ/i;", "getFilter", "()LWZ/i;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FilterCartType extends TokenizedCartType {

        @NotNull
        private final i filter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FilterCartType(@NotNull i filter) {
            super(null);
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.filter = filter;
        }

        @NotNull
        public final i getFilter() {
            return this.filter;
        }
    }

    public /* synthetic */ TokenizedCartType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TokenizedCartType() {
    }
}
