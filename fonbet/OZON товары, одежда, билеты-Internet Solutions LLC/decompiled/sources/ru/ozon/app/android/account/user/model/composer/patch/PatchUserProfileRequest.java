package ru.ozon.app.android.account.user.model.composer.patch;

import I0.C3173b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileRequest;", "", "firstName", "", "lastName", "sex", "birthdate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getSex", "getBirthdate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PatchUserProfileRequest {
    private final String birthdate;
    private final String firstName;
    private final String lastName;
    private final String sex;

    public PatchUserProfileRequest(String str, String str2, String str3, String str4) {
        this.firstName = str;
        this.lastName = str2;
        this.sex = str3;
        this.birthdate = str4;
    }

    public static /* synthetic */ PatchUserProfileRequest copy$default(PatchUserProfileRequest patchUserProfileRequest, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = patchUserProfileRequest.firstName;
        }
        if ((i11 & 2) != 0) {
            str2 = patchUserProfileRequest.lastName;
        }
        if ((i11 & 4) != 0) {
            str3 = patchUserProfileRequest.sex;
        }
        if ((i11 & 8) != 0) {
            str4 = patchUserProfileRequest.birthdate;
        }
        return patchUserProfileRequest.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBirthdate() {
        return this.birthdate;
    }

    @NotNull
    public final PatchUserProfileRequest copy(String firstName, String lastName, String sex, String birthdate) {
        return new PatchUserProfileRequest(firstName, lastName, sex, birthdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PatchUserProfileRequest)) {
            return false;
        }
        PatchUserProfileRequest patchUserProfileRequest = (PatchUserProfileRequest) other;
        return Intrinsics.d(this.firstName, patchUserProfileRequest.firstName) && Intrinsics.d(this.lastName, patchUserProfileRequest.lastName) && Intrinsics.d(this.sex, patchUserProfileRequest.sex) && Intrinsics.d(this.birthdate, patchUserProfileRequest.birthdate);
    }

    public final String getBirthdate() {
        return this.birthdate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getSex() {
        return this.sex;
    }

    public int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sex;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthdate;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        return C3173b.c(C3660k.d("PatchUserProfileRequest(firstName=", str, ", lastName=", str2, ", sex="), this.sex, ", birthdate=", this.birthdate, ")");
    }
}
