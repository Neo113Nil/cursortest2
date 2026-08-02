package ru.ozon.app.android.account.orders.recipientWidget.data;

import Ak.C2436a;
import G.g;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRegularRecipientRequest;", "", "regularId", "", "firstName", "", "lastName", "phone", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRegularId", "()J", "getFirstName", "()Ljava/lang/String;", "getLastName", "getPhone", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChangeRegularRecipientRequest {
    public static final int $stable = 0;

    @NotNull
    private final String firstName;

    @NotNull
    private final String lastName;

    @NotNull
    private final String phone;
    private final long regularId;

    public ChangeRegularRecipientRequest(long j11, @NotNull String firstName, @NotNull String lastName, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.regularId = j11;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public static /* synthetic */ ChangeRegularRecipientRequest copy$default(ChangeRegularRecipientRequest changeRegularRecipientRequest, long j11, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = changeRegularRecipientRequest.regularId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = changeRegularRecipientRequest.firstName;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = changeRegularRecipientRequest.lastName;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = changeRegularRecipientRequest.phone;
        }
        return changeRegularRecipientRequest.copy(j12, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRegularId() {
        return this.regularId;
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
    public final ChangeRegularRecipientRequest copy(long regularId, @NotNull String firstName, @NotNull String lastName, @NotNull String phone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new ChangeRegularRecipientRequest(regularId, firstName, lastName, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeRegularRecipientRequest)) {
            return false;
        }
        ChangeRegularRecipientRequest changeRegularRecipientRequest = (ChangeRegularRecipientRequest) other;
        return this.regularId == changeRegularRecipientRequest.regularId && Intrinsics.d(this.firstName, changeRegularRecipientRequest.firstName) && Intrinsics.d(this.lastName, changeRegularRecipientRequest.lastName) && Intrinsics.d(this.phone, changeRegularRecipientRequest.phone);
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
    public final String getPhone() {
        return this.phone;
    }

    public final long getRegularId() {
        return this.regularId;
    }

    public int hashCode() {
        return this.phone.hashCode() + g.a(g.a(Long.hashCode(this.regularId) * 31, 31, this.firstName), 31, this.lastName);
    }

    @NotNull
    public String toString() {
        long j11 = this.regularId;
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.phone;
        StringBuilder c11 = C2436a.c(j11, "ChangeRegularRecipientRequest(regularId=", ", firstName=", str);
        a.h(c11, ", lastName=", str2, ", phone=", str3);
        c11.append(")");
        return c11.toString();
    }
}
