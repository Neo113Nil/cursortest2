package ru.ozon.app.android.storage.user.model;

import Ak.C2436a;
import B0.C2454a;
import G.g;
import Nh.a;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ`\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b#\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lru/ozon/app/android/storage/user/model/User;", "", "", "userId", "", "firstName", "lastName", "middleName", "", "sex", Scopes.EMAIL, "dateOfBirth", "accountPhone", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/storage/user/model/User;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getUserId", "()J", "Ljava/lang/String;", "getFirstName", "getLastName", "getMiddleName", "I", "getSex", "getEmail", "getDateOfBirth", "getAccountPhone", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class User {

    @NotNull
    private final String accountPhone;

    @NotNull
    private final String dateOfBirth;

    @NotNull
    private final String email;

    @NotNull
    private final String firstName;

    @NotNull
    private final String lastName;

    @NotNull
    private final String middleName;
    private final int sex;
    private final long userId;

    public User() {
        this(0L, null, null, null, 0, null, null, null, 255, null);
    }

    public static /* synthetic */ User copy$default(User user, long j11, String str, String str2, String str3, int i11, String str4, String str5, String str6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = user.userId;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            str = user.firstName;
        }
        String str7 = str;
        if ((i12 & 4) != 0) {
            str2 = user.lastName;
        }
        String str8 = str2;
        if ((i12 & 8) != 0) {
            str3 = user.middleName;
        }
        return user.copy(j12, str7, str8, str3, (i12 & 16) != 0 ? user.sex : i11, (i12 & 32) != 0 ? user.email : str4, (i12 & 64) != 0 ? user.dateOfBirth : str5, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? user.accountPhone : str6);
    }

    @NotNull
    public final User copy(long userId, @NotNull String firstName, @NotNull String lastName, @NotNull String middleName, int sex, @NotNull String email, @NotNull String dateOfBirth, @NotNull String accountPhone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(middleName, "middleName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(accountPhone, "accountPhone");
        return new User(userId, firstName, lastName, middleName, sex, email, dateOfBirth, accountPhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return this.userId == user.userId && Intrinsics.d(this.firstName, user.firstName) && Intrinsics.d(this.lastName, user.lastName) && Intrinsics.d(this.middleName, user.middleName) && this.sex == user.sex && Intrinsics.d(this.email, user.email) && Intrinsics.d(this.dateOfBirth, user.dateOfBirth) && Intrinsics.d(this.accountPhone, user.accountPhone);
    }

    @NotNull
    public final String getAccountPhone() {
        return this.accountPhone;
    }

    @NotNull
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    public final int getSex() {
        return this.sex;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.accountPhone.hashCode() + g.a(g.a(C2454a.a(this.sex, g.a(g.a(g.a(Long.hashCode(this.userId) * 31, 31, this.firstName), 31, this.lastName), 31, this.middleName), 31), 31, this.email), 31, this.dateOfBirth);
    }

    @NotNull
    public String toString() {
        long j11 = this.userId;
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.middleName;
        int i11 = this.sex;
        String str4 = this.email;
        String str5 = this.dateOfBirth;
        String str6 = this.accountPhone;
        StringBuilder c11 = C2436a.c(j11, "User(userId=", ", firstName=", str);
        a.h(c11, ", lastName=", str2, ", middleName=", str3);
        c11.append(", sex=");
        c11.append(i11);
        c11.append(", email=");
        c11.append(str4);
        a.h(c11, ", dateOfBirth=", str5, ", accountPhone=", str6);
        c11.append(")");
        return c11.toString();
    }

    public User(long j11, @NotNull String firstName, @NotNull String lastName, @NotNull String middleName, int i11, @NotNull String email, @NotNull String dateOfBirth, @NotNull String accountPhone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(middleName, "middleName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(accountPhone, "accountPhone");
        this.userId = j11;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = i11;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.accountPhone = accountPhone;
    }

    public /* synthetic */ User(long j11, String str, String str2, String str3, int i11, String str4, String str5, String str6, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j11, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? "" : str4, (i12 & 64) != 0 ? "" : str5, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str6);
    }
}
