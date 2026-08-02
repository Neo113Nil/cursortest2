package ru.sberdevices.salutevision.core.data;

import B3.D;
import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, d2 = {"Lru/sberdevices/salutevision/core/data/MrzRecord;", "", "doc_type_code", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "last_name", "gender", "nationality", "country", "birth_date", "personal_number", "document_number", "expiry_date", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirth_date", "()Ljava/lang/String;", "getCountry", "getDoc_type_code", "getDocument_number", "getExpiry_date", "getGender", "getLast_name", "getName", "getNationality", "getPersonal_number", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MrzRecord {

    @NotNull
    private final String birth_date;

    @NotNull
    private final String country;

    @NotNull
    private final String doc_type_code;

    @NotNull
    private final String document_number;

    @NotNull
    private final String expiry_date;

    @NotNull
    private final String gender;

    @NotNull
    private final String last_name;

    @NotNull
    private final String name;

    @NotNull
    private final String nationality;

    @NotNull
    private final String personal_number;

    public MrzRecord(@NotNull String doc_type_code, @NotNull String name, @NotNull String last_name, @NotNull String gender, @NotNull String nationality, @NotNull String country, @NotNull String birth_date, @NotNull String personal_number, @NotNull String document_number, @NotNull String expiry_date) {
        Intrinsics.checkNotNullParameter(doc_type_code, "doc_type_code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(last_name, "last_name");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(birth_date, "birth_date");
        Intrinsics.checkNotNullParameter(personal_number, "personal_number");
        Intrinsics.checkNotNullParameter(document_number, "document_number");
        Intrinsics.checkNotNullParameter(expiry_date, "expiry_date");
        this.doc_type_code = doc_type_code;
        this.name = name;
        this.last_name = last_name;
        this.gender = gender;
        this.nationality = nationality;
        this.country = country;
        this.birth_date = birth_date;
        this.personal_number = personal_number;
        this.document_number = document_number;
        this.expiry_date = expiry_date;
    }

    public static /* synthetic */ MrzRecord copy$default(MrzRecord mrzRecord, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mrzRecord.doc_type_code;
        }
        if ((i11 & 2) != 0) {
            str2 = mrzRecord.name;
        }
        if ((i11 & 4) != 0) {
            str3 = mrzRecord.last_name;
        }
        if ((i11 & 8) != 0) {
            str4 = mrzRecord.gender;
        }
        if ((i11 & 16) != 0) {
            str5 = mrzRecord.nationality;
        }
        if ((i11 & 32) != 0) {
            str6 = mrzRecord.country;
        }
        if ((i11 & 64) != 0) {
            str7 = mrzRecord.birth_date;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str8 = mrzRecord.personal_number;
        }
        if ((i11 & 256) != 0) {
            str9 = mrzRecord.document_number;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str10 = mrzRecord.expiry_date;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return mrzRecord.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDoc_type_code() {
        return this.doc_type_code;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getExpiry_date() {
        return this.expiry_date;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLast_name() {
        return this.last_name;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getBirth_date() {
        return this.birth_date;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getPersonal_number() {
        return this.personal_number;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getDocument_number() {
        return this.document_number;
    }

    @NotNull
    public final MrzRecord copy(@NotNull String doc_type_code, @NotNull String name, @NotNull String last_name, @NotNull String gender, @NotNull String nationality, @NotNull String country, @NotNull String birth_date, @NotNull String personal_number, @NotNull String document_number, @NotNull String expiry_date) {
        Intrinsics.checkNotNullParameter(doc_type_code, "doc_type_code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(last_name, "last_name");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(birth_date, "birth_date");
        Intrinsics.checkNotNullParameter(personal_number, "personal_number");
        Intrinsics.checkNotNullParameter(document_number, "document_number");
        Intrinsics.checkNotNullParameter(expiry_date, "expiry_date");
        return new MrzRecord(doc_type_code, name, last_name, gender, nationality, country, birth_date, personal_number, document_number, expiry_date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrzRecord)) {
            return false;
        }
        MrzRecord mrzRecord = (MrzRecord) other;
        return Intrinsics.d(this.doc_type_code, mrzRecord.doc_type_code) && Intrinsics.d(this.name, mrzRecord.name) && Intrinsics.d(this.last_name, mrzRecord.last_name) && Intrinsics.d(this.gender, mrzRecord.gender) && Intrinsics.d(this.nationality, mrzRecord.nationality) && Intrinsics.d(this.country, mrzRecord.country) && Intrinsics.d(this.birth_date, mrzRecord.birth_date) && Intrinsics.d(this.personal_number, mrzRecord.personal_number) && Intrinsics.d(this.document_number, mrzRecord.document_number) && Intrinsics.d(this.expiry_date, mrzRecord.expiry_date);
    }

    @NotNull
    public final String getBirth_date() {
        return this.birth_date;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final String getDoc_type_code() {
        return this.doc_type_code;
    }

    @NotNull
    public final String getDocument_number() {
        return this.document_number;
    }

    @NotNull
    public final String getExpiry_date() {
        return this.expiry_date;
    }

    @NotNull
    public final String getGender() {
        return this.gender;
    }

    @NotNull
    public final String getLast_name() {
        return this.last_name;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNationality() {
        return this.nationality;
    }

    @NotNull
    public final String getPersonal_number() {
        return this.personal_number;
    }

    public int hashCode() {
        return this.expiry_date.hashCode() + g.a(g.a(g.a(g.a(g.a(g.a(g.a(g.a(this.doc_type_code.hashCode() * 31, 31, this.name), 31, this.last_name), 31, this.gender), 31, this.nationality), 31, this.country), 31, this.birth_date), 31, this.personal_number), 31, this.document_number);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MrzRecord(doc_type_code=");
        sb2.append(this.doc_type_code);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", last_name=");
        sb2.append(this.last_name);
        sb2.append(", gender=");
        sb2.append(this.gender);
        sb2.append(", nationality=");
        sb2.append(this.nationality);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", birth_date=");
        sb2.append(this.birth_date);
        sb2.append(", personal_number=");
        sb2.append(this.personal_number);
        sb2.append(", document_number=");
        sb2.append(this.document_number);
        sb2.append(", expiry_date=");
        return D.c(sb2, this.expiry_date, ')');
    }
}
