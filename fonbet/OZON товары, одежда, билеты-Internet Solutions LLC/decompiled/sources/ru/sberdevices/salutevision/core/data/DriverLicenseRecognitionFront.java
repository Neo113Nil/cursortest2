package ru.sberdevices.salutevision.core.data;

import B3.D;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, d2 = {"Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionFront;", "", "name_ru", "", "middle_name_ru", "surname_ru", "birthdate", "birthplace_ru", "residence_ru", "category", "date_of_expiration", "date_of_issue", "grant_ru", "number", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthdate", "()Ljava/lang/String;", "getBirthplace_ru", "getCategory", "getDate_of_expiration", "getDate_of_issue", "getGrant_ru", "getMiddle_name_ru", "getName_ru", "getNumber", "getResidence_ru", "getSurname_ru", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DriverLicenseRecognitionFront {
    private final String birthdate;
    private final String birthplace_ru;
    private final String category;
    private final String date_of_expiration;
    private final String date_of_issue;
    private final String grant_ru;
    private final String middle_name_ru;
    private final String name_ru;
    private final String number;
    private final String residence_ru;
    private final String surname_ru;

    public DriverLicenseRecognitionFront(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.name_ru = str;
        this.middle_name_ru = str2;
        this.surname_ru = str3;
        this.birthdate = str4;
        this.birthplace_ru = str5;
        this.residence_ru = str6;
        this.category = str7;
        this.date_of_expiration = str8;
        this.date_of_issue = str9;
        this.grant_ru = str10;
        this.number = str11;
    }

    public static /* synthetic */ DriverLicenseRecognitionFront copy$default(DriverLicenseRecognitionFront driverLicenseRecognitionFront, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = driverLicenseRecognitionFront.name_ru;
        }
        if ((i11 & 2) != 0) {
            str2 = driverLicenseRecognitionFront.middle_name_ru;
        }
        if ((i11 & 4) != 0) {
            str3 = driverLicenseRecognitionFront.surname_ru;
        }
        if ((i11 & 8) != 0) {
            str4 = driverLicenseRecognitionFront.birthdate;
        }
        if ((i11 & 16) != 0) {
            str5 = driverLicenseRecognitionFront.birthplace_ru;
        }
        if ((i11 & 32) != 0) {
            str6 = driverLicenseRecognitionFront.residence_ru;
        }
        if ((i11 & 64) != 0) {
            str7 = driverLicenseRecognitionFront.category;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str8 = driverLicenseRecognitionFront.date_of_expiration;
        }
        if ((i11 & 256) != 0) {
            str9 = driverLicenseRecognitionFront.date_of_issue;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str10 = driverLicenseRecognitionFront.grant_ru;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str11 = driverLicenseRecognitionFront.number;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return driverLicenseRecognitionFront.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName_ru() {
        return this.name_ru;
    }

    /* renamed from: component10, reason: from getter */
    public final String getGrant_ru() {
        return this.grant_ru;
    }

    /* renamed from: component11, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMiddle_name_ru() {
        return this.middle_name_ru;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSurname_ru() {
        return this.surname_ru;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBirthdate() {
        return this.birthdate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBirthplace_ru() {
        return this.birthplace_ru;
    }

    /* renamed from: component6, reason: from getter */
    public final String getResidence_ru() {
        return this.residence_ru;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDate_of_expiration() {
        return this.date_of_expiration;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDate_of_issue() {
        return this.date_of_issue;
    }

    @NotNull
    public final DriverLicenseRecognitionFront copy(String name_ru, String middle_name_ru, String surname_ru, String birthdate, String birthplace_ru, String residence_ru, String category, String date_of_expiration, String date_of_issue, String grant_ru, String number) {
        return new DriverLicenseRecognitionFront(name_ru, middle_name_ru, surname_ru, birthdate, birthplace_ru, residence_ru, category, date_of_expiration, date_of_issue, grant_ru, number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriverLicenseRecognitionFront)) {
            return false;
        }
        DriverLicenseRecognitionFront driverLicenseRecognitionFront = (DriverLicenseRecognitionFront) other;
        return Intrinsics.d(this.name_ru, driverLicenseRecognitionFront.name_ru) && Intrinsics.d(this.middle_name_ru, driverLicenseRecognitionFront.middle_name_ru) && Intrinsics.d(this.surname_ru, driverLicenseRecognitionFront.surname_ru) && Intrinsics.d(this.birthdate, driverLicenseRecognitionFront.birthdate) && Intrinsics.d(this.birthplace_ru, driverLicenseRecognitionFront.birthplace_ru) && Intrinsics.d(this.residence_ru, driverLicenseRecognitionFront.residence_ru) && Intrinsics.d(this.category, driverLicenseRecognitionFront.category) && Intrinsics.d(this.date_of_expiration, driverLicenseRecognitionFront.date_of_expiration) && Intrinsics.d(this.date_of_issue, driverLicenseRecognitionFront.date_of_issue) && Intrinsics.d(this.grant_ru, driverLicenseRecognitionFront.grant_ru) && Intrinsics.d(this.number, driverLicenseRecognitionFront.number);
    }

    public final String getBirthdate() {
        return this.birthdate;
    }

    public final String getBirthplace_ru() {
        return this.birthplace_ru;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDate_of_expiration() {
        return this.date_of_expiration;
    }

    public final String getDate_of_issue() {
        return this.date_of_issue;
    }

    public final String getGrant_ru() {
        return this.grant_ru;
    }

    public final String getMiddle_name_ru() {
        return this.middle_name_ru;
    }

    public final String getName_ru() {
        return this.name_ru;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getResidence_ru() {
        return this.residence_ru;
    }

    public final String getSurname_ru() {
        return this.surname_ru;
    }

    public int hashCode() {
        String str = this.name_ru;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middle_name_ru;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname_ru;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthdate;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthplace_ru;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.residence_ru;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.category;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.date_of_expiration;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.date_of_issue;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.grant_ru;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.number;
        return hashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DriverLicenseRecognitionFront(name_ru=");
        sb2.append(this.name_ru);
        sb2.append(", middle_name_ru=");
        sb2.append(this.middle_name_ru);
        sb2.append(", surname_ru=");
        sb2.append(this.surname_ru);
        sb2.append(", birthdate=");
        sb2.append(this.birthdate);
        sb2.append(", birthplace_ru=");
        sb2.append(this.birthplace_ru);
        sb2.append(", residence_ru=");
        sb2.append(this.residence_ru);
        sb2.append(", category=");
        sb2.append(this.category);
        sb2.append(", date_of_expiration=");
        sb2.append(this.date_of_expiration);
        sb2.append(", date_of_issue=");
        sb2.append(this.date_of_issue);
        sb2.append(", grant_ru=");
        sb2.append(this.grant_ru);
        sb2.append(", number=");
        return D.c(sb2, this.number, ')');
    }
}
