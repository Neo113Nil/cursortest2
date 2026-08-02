package ru.sberdevices.salutevision.core.data;

import B3.D;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006+"}, d2 = {"Lru/sberdevices/salutevision/core/data/PassportRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "number", "", "series", "dateOfBirth", "dateOfIssue", "divisionCode", AppMeasurementSdk.ConditionalUserProperty.NAME, "middle_name", "surname", "placeOfBirth", "placeOfIssue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateOfBirth", "()Ljava/lang/String;", "getDateOfIssue", "getDivisionCode", "getMiddle_name", "getName", "getNumber", "getPlaceOfBirth", "getPlaceOfIssue", "getSeries", "getSurname", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PassportRecognitionInfo implements SaluteVisionRecognition.Info {
    private final String dateOfBirth;
    private final String dateOfIssue;
    private final String divisionCode;
    private final String middle_name;
    private final String name;
    private final String number;
    private final String placeOfBirth;
    private final String placeOfIssue;
    private final String series;
    private final String surname;

    public PassportRecognitionInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.number = str;
        this.series = str2;
        this.dateOfBirth = str3;
        this.dateOfIssue = str4;
        this.divisionCode = str5;
        this.name = str6;
        this.middle_name = str7;
        this.surname = str8;
        this.placeOfBirth = str9;
        this.placeOfIssue = str10;
    }

    public static /* synthetic */ PassportRecognitionInfo copy$default(PassportRecognitionInfo passportRecognitionInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = passportRecognitionInfo.number;
        }
        if ((i11 & 2) != 0) {
            str2 = passportRecognitionInfo.series;
        }
        if ((i11 & 4) != 0) {
            str3 = passportRecognitionInfo.dateOfBirth;
        }
        if ((i11 & 8) != 0) {
            str4 = passportRecognitionInfo.dateOfIssue;
        }
        if ((i11 & 16) != 0) {
            str5 = passportRecognitionInfo.divisionCode;
        }
        if ((i11 & 32) != 0) {
            str6 = passportRecognitionInfo.name;
        }
        if ((i11 & 64) != 0) {
            str7 = passportRecognitionInfo.middle_name;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str8 = passportRecognitionInfo.surname;
        }
        if ((i11 & 256) != 0) {
            str9 = passportRecognitionInfo.placeOfBirth;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str10 = passportRecognitionInfo.placeOfIssue;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return passportRecognitionInfo.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPlaceOfIssue() {
        return this.placeOfIssue;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSeries() {
        return this.series;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDateOfIssue() {
        return this.dateOfIssue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDivisionCode() {
        return this.divisionCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMiddle_name() {
        return this.middle_name;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    @NotNull
    public final PassportRecognitionInfo copy(String number, String series, String dateOfBirth, String dateOfIssue, String divisionCode, String name, String middle_name, String surname, String placeOfBirth, String placeOfIssue) {
        return new PassportRecognitionInfo(number, series, dateOfBirth, dateOfIssue, divisionCode, name, middle_name, surname, placeOfBirth, placeOfIssue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportRecognitionInfo)) {
            return false;
        }
        PassportRecognitionInfo passportRecognitionInfo = (PassportRecognitionInfo) other;
        return Intrinsics.d(this.number, passportRecognitionInfo.number) && Intrinsics.d(this.series, passportRecognitionInfo.series) && Intrinsics.d(this.dateOfBirth, passportRecognitionInfo.dateOfBirth) && Intrinsics.d(this.dateOfIssue, passportRecognitionInfo.dateOfIssue) && Intrinsics.d(this.divisionCode, passportRecognitionInfo.divisionCode) && Intrinsics.d(this.name, passportRecognitionInfo.name) && Intrinsics.d(this.middle_name, passportRecognitionInfo.middle_name) && Intrinsics.d(this.surname, passportRecognitionInfo.surname) && Intrinsics.d(this.placeOfBirth, passportRecognitionInfo.placeOfBirth) && Intrinsics.d(this.placeOfIssue, passportRecognitionInfo.placeOfIssue);
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getDateOfIssue() {
        return this.dateOfIssue;
    }

    public final String getDivisionCode() {
        return this.divisionCode;
    }

    public final String getMiddle_name() {
        return this.middle_name;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final String getPlaceOfIssue() {
        return this.placeOfIssue;
    }

    public final String getSeries() {
        return this.series;
    }

    public final String getSurname() {
        return this.surname;
    }

    public int hashCode() {
        String str = this.number;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.series;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dateOfBirth;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateOfIssue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.divisionCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.middle_name;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.surname;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.placeOfBirth;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.placeOfIssue;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PassportRecognitionInfo(number=");
        sb2.append(this.number);
        sb2.append(", series=");
        sb2.append(this.series);
        sb2.append(", dateOfBirth=");
        sb2.append(this.dateOfBirth);
        sb2.append(", dateOfIssue=");
        sb2.append(this.dateOfIssue);
        sb2.append(", divisionCode=");
        sb2.append(this.divisionCode);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", middle_name=");
        sb2.append(this.middle_name);
        sb2.append(", surname=");
        sb2.append(this.surname);
        sb2.append(", placeOfBirth=");
        sb2.append(this.placeOfBirth);
        sb2.append(", placeOfIssue=");
        return D.c(sb2, this.placeOfIssue, ')');
    }
}
