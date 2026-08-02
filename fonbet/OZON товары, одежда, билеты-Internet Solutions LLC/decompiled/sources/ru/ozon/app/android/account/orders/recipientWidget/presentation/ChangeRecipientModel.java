package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/ChangeRecipientModel;", "", "", "regularId", "orderNumber", "firstName", "lastName", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRegularId", "getOrderNumber", "getFirstName", "getLastName", "getPhone", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChangeRecipientModel {

    @NotNull
    private final String firstName;

    @NotNull
    private final String lastName;
    private final String orderNumber;

    @NotNull
    private final String phone;
    private final String regularId;

    public ChangeRecipientModel(String str, String str2, @NotNull String firstName, @NotNull String lastName, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.regularId = str;
        this.orderNumber = str2;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeRecipientModel)) {
            return false;
        }
        ChangeRecipientModel changeRecipientModel = (ChangeRecipientModel) other;
        return Intrinsics.d(this.regularId, changeRecipientModel.regularId) && Intrinsics.d(this.orderNumber, changeRecipientModel.orderNumber) && Intrinsics.d(this.firstName, changeRecipientModel.firstName) && Intrinsics.d(this.lastName, changeRecipientModel.lastName) && Intrinsics.d(this.phone, changeRecipientModel.phone);
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public final String getRegularId() {
        return this.regularId;
    }

    public int hashCode() {
        String str = this.regularId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderNumber;
        return this.phone.hashCode() + g.a(g.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.firstName), 31, this.lastName);
    }

    @NotNull
    public String toString() {
        String str = this.regularId;
        String str2 = this.orderNumber;
        String str3 = this.firstName;
        String str4 = this.lastName;
        String str5 = this.phone;
        StringBuilder d11 = C3660k.d("ChangeRecipientModel(regularId=", str, ", orderNumber=", str2, ", firstName=");
        a.h(d11, str3, ", lastName=", str4, ", phone=");
        return o0.c(d11, str5, ")");
    }
}
