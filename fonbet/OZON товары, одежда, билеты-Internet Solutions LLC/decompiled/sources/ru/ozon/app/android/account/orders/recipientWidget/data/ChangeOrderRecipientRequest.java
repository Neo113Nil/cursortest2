package ru.ozon.app.android.account.orders.recipientWidget.data;

import G.g;
import I0.C3173b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeOrderRecipientRequest;", "", "orderNumber", "", "firstName", "lastName", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderNumber", "()Ljava/lang/String;", "getFirstName", "getLastName", "getPhone", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChangeOrderRecipientRequest {
    public static final int $stable = 0;

    @NotNull
    private final String firstName;

    @NotNull
    private final String lastName;

    @NotNull
    private final String orderNumber;

    @NotNull
    private final String phone;

    public ChangeOrderRecipientRequest(@NotNull String orderNumber, @NotNull String firstName, @NotNull String lastName, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.orderNumber = orderNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public static /* synthetic */ ChangeOrderRecipientRequest copy$default(ChangeOrderRecipientRequest changeOrderRecipientRequest, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = changeOrderRecipientRequest.orderNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = changeOrderRecipientRequest.firstName;
        }
        if ((i11 & 4) != 0) {
            str3 = changeOrderRecipientRequest.lastName;
        }
        if ((i11 & 8) != 0) {
            str4 = changeOrderRecipientRequest.phone;
        }
        return changeOrderRecipientRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final ChangeOrderRecipientRequest copy(@NotNull String orderNumber, @NotNull String firstName, @NotNull String lastName, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new ChangeOrderRecipientRequest(orderNumber, firstName, lastName, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeOrderRecipientRequest)) {
            return false;
        }
        ChangeOrderRecipientRequest changeOrderRecipientRequest = (ChangeOrderRecipientRequest) other;
        return Intrinsics.d(this.orderNumber, changeOrderRecipientRequest.orderNumber) && Intrinsics.d(this.firstName, changeOrderRecipientRequest.firstName) && Intrinsics.d(this.lastName, changeOrderRecipientRequest.lastName) && Intrinsics.d(this.phone, changeOrderRecipientRequest.phone);
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return this.phone.hashCode() + g.a(g.a(this.orderNumber.hashCode() * 31, 31, this.firstName), 31, this.lastName);
    }

    @NotNull
    public String toString() {
        String str = this.orderNumber;
        String str2 = this.firstName;
        return C3173b.c(C3660k.d("ChangeOrderRecipientRequest(orderNumber=", str, ", firstName=", str2, ", lastName="), this.lastName, ", phone=", this.phone, ")");
    }
}
