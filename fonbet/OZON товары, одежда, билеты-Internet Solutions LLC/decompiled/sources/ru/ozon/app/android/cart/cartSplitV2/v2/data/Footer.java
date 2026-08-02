package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/Footer;", "", "isRounded", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/Footer;", "equals", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Footer {
    public static final int $stable = 0;
    private final Boolean isRounded;

    public Footer(Boolean bool) {
        this.isRounded = bool;
    }

    public static /* synthetic */ Footer copy$default(Footer footer, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = footer.isRounded;
        }
        return footer.copy(bool);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsRounded() {
        return this.isRounded;
    }

    @NotNull
    public final Footer copy(Boolean isRounded) {
        return new Footer(isRounded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Footer) && Intrinsics.d(this.isRounded, ((Footer) other).isRounded);
    }

    public int hashCode() {
        Boolean bool = this.isRounded;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        return "Footer(isRounded=" + this.isRounded + ")";
    }
}
