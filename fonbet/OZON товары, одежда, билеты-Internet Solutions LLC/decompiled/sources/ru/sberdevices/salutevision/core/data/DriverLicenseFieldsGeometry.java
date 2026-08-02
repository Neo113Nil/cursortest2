package ru.sberdevices.salutevision.core.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006="}, d2 = {"Lru/sberdevices/salutevision/core/data/DriverLicenseFieldsGeometry;", "", "birthdate", "Lru/sberdevices/salutevision/core/data/Quad;", "birthplace_ru", "category_1", "category_2", "date_of_expiration", "date_of_issue", "grant_ru", "name_patronymic_ru", "number", "residence_ru", "surname_ru", "back_end_date", "back_start_date", "back_comment_1", "back_comment_2", "back_sernum", "(Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;)V", "getBack_comment_1", "()Lru/sberdevices/salutevision/core/data/Quad;", "getBack_comment_2", "getBack_end_date", "getBack_sernum", "getBack_start_date", "getBirthdate", "getBirthplace_ru", "getCategory_1", "getCategory_2", "getDate_of_expiration", "getDate_of_issue", "getGrant_ru", "getName_patronymic_ru", "getNumber", "getResidence_ru", "getSurname_ru", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DriverLicenseFieldsGeometry {
    private final Quad back_comment_1;
    private final Quad back_comment_2;
    private final Quad back_end_date;
    private final Quad back_sernum;
    private final Quad back_start_date;
    private final Quad birthdate;
    private final Quad birthplace_ru;
    private final Quad category_1;
    private final Quad category_2;
    private final Quad date_of_expiration;
    private final Quad date_of_issue;
    private final Quad grant_ru;
    private final Quad name_patronymic_ru;
    private final Quad number;
    private final Quad residence_ru;
    private final Quad surname_ru;

    public DriverLicenseFieldsGeometry(Quad quad, Quad quad2, Quad quad3, Quad quad4, Quad quad5, Quad quad6, Quad quad7, Quad quad8, Quad quad9, Quad quad10, Quad quad11, Quad quad12, Quad quad13, Quad quad14, Quad quad15, Quad quad16) {
        this.birthdate = quad;
        this.birthplace_ru = quad2;
        this.category_1 = quad3;
        this.category_2 = quad4;
        this.date_of_expiration = quad5;
        this.date_of_issue = quad6;
        this.grant_ru = quad7;
        this.name_patronymic_ru = quad8;
        this.number = quad9;
        this.residence_ru = quad10;
        this.surname_ru = quad11;
        this.back_end_date = quad12;
        this.back_start_date = quad13;
        this.back_comment_1 = quad14;
        this.back_comment_2 = quad15;
        this.back_sernum = quad16;
    }

    /* renamed from: component1, reason: from getter */
    public final Quad getBirthdate() {
        return this.birthdate;
    }

    /* renamed from: component10, reason: from getter */
    public final Quad getResidence_ru() {
        return this.residence_ru;
    }

    /* renamed from: component11, reason: from getter */
    public final Quad getSurname_ru() {
        return this.surname_ru;
    }

    /* renamed from: component12, reason: from getter */
    public final Quad getBack_end_date() {
        return this.back_end_date;
    }

    /* renamed from: component13, reason: from getter */
    public final Quad getBack_start_date() {
        return this.back_start_date;
    }

    /* renamed from: component14, reason: from getter */
    public final Quad getBack_comment_1() {
        return this.back_comment_1;
    }

    /* renamed from: component15, reason: from getter */
    public final Quad getBack_comment_2() {
        return this.back_comment_2;
    }

    /* renamed from: component16, reason: from getter */
    public final Quad getBack_sernum() {
        return this.back_sernum;
    }

    /* renamed from: component2, reason: from getter */
    public final Quad getBirthplace_ru() {
        return this.birthplace_ru;
    }

    /* renamed from: component3, reason: from getter */
    public final Quad getCategory_1() {
        return this.category_1;
    }

    /* renamed from: component4, reason: from getter */
    public final Quad getCategory_2() {
        return this.category_2;
    }

    /* renamed from: component5, reason: from getter */
    public final Quad getDate_of_expiration() {
        return this.date_of_expiration;
    }

    /* renamed from: component6, reason: from getter */
    public final Quad getDate_of_issue() {
        return this.date_of_issue;
    }

    /* renamed from: component7, reason: from getter */
    public final Quad getGrant_ru() {
        return this.grant_ru;
    }

    /* renamed from: component8, reason: from getter */
    public final Quad getName_patronymic_ru() {
        return this.name_patronymic_ru;
    }

    /* renamed from: component9, reason: from getter */
    public final Quad getNumber() {
        return this.number;
    }

    @NotNull
    public final DriverLicenseFieldsGeometry copy(Quad birthdate, Quad birthplace_ru, Quad category_1, Quad category_2, Quad date_of_expiration, Quad date_of_issue, Quad grant_ru, Quad name_patronymic_ru, Quad number, Quad residence_ru, Quad surname_ru, Quad back_end_date, Quad back_start_date, Quad back_comment_1, Quad back_comment_2, Quad back_sernum) {
        return new DriverLicenseFieldsGeometry(birthdate, birthplace_ru, category_1, category_2, date_of_expiration, date_of_issue, grant_ru, name_patronymic_ru, number, residence_ru, surname_ru, back_end_date, back_start_date, back_comment_1, back_comment_2, back_sernum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriverLicenseFieldsGeometry)) {
            return false;
        }
        DriverLicenseFieldsGeometry driverLicenseFieldsGeometry = (DriverLicenseFieldsGeometry) other;
        return Intrinsics.d(this.birthdate, driverLicenseFieldsGeometry.birthdate) && Intrinsics.d(this.birthplace_ru, driverLicenseFieldsGeometry.birthplace_ru) && Intrinsics.d(this.category_1, driverLicenseFieldsGeometry.category_1) && Intrinsics.d(this.category_2, driverLicenseFieldsGeometry.category_2) && Intrinsics.d(this.date_of_expiration, driverLicenseFieldsGeometry.date_of_expiration) && Intrinsics.d(this.date_of_issue, driverLicenseFieldsGeometry.date_of_issue) && Intrinsics.d(this.grant_ru, driverLicenseFieldsGeometry.grant_ru) && Intrinsics.d(this.name_patronymic_ru, driverLicenseFieldsGeometry.name_patronymic_ru) && Intrinsics.d(this.number, driverLicenseFieldsGeometry.number) && Intrinsics.d(this.residence_ru, driverLicenseFieldsGeometry.residence_ru) && Intrinsics.d(this.surname_ru, driverLicenseFieldsGeometry.surname_ru) && Intrinsics.d(this.back_end_date, driverLicenseFieldsGeometry.back_end_date) && Intrinsics.d(this.back_start_date, driverLicenseFieldsGeometry.back_start_date) && Intrinsics.d(this.back_comment_1, driverLicenseFieldsGeometry.back_comment_1) && Intrinsics.d(this.back_comment_2, driverLicenseFieldsGeometry.back_comment_2) && Intrinsics.d(this.back_sernum, driverLicenseFieldsGeometry.back_sernum);
    }

    public final Quad getBack_comment_1() {
        return this.back_comment_1;
    }

    public final Quad getBack_comment_2() {
        return this.back_comment_2;
    }

    public final Quad getBack_end_date() {
        return this.back_end_date;
    }

    public final Quad getBack_sernum() {
        return this.back_sernum;
    }

    public final Quad getBack_start_date() {
        return this.back_start_date;
    }

    public final Quad getBirthdate() {
        return this.birthdate;
    }

    public final Quad getBirthplace_ru() {
        return this.birthplace_ru;
    }

    public final Quad getCategory_1() {
        return this.category_1;
    }

    public final Quad getCategory_2() {
        return this.category_2;
    }

    public final Quad getDate_of_expiration() {
        return this.date_of_expiration;
    }

    public final Quad getDate_of_issue() {
        return this.date_of_issue;
    }

    public final Quad getGrant_ru() {
        return this.grant_ru;
    }

    public final Quad getName_patronymic_ru() {
        return this.name_patronymic_ru;
    }

    public final Quad getNumber() {
        return this.number;
    }

    public final Quad getResidence_ru() {
        return this.residence_ru;
    }

    public final Quad getSurname_ru() {
        return this.surname_ru;
    }

    public int hashCode() {
        Quad quad = this.birthdate;
        int hashCode = (quad == null ? 0 : quad.hashCode()) * 31;
        Quad quad2 = this.birthplace_ru;
        int hashCode2 = (hashCode + (quad2 == null ? 0 : quad2.hashCode())) * 31;
        Quad quad3 = this.category_1;
        int hashCode3 = (hashCode2 + (quad3 == null ? 0 : quad3.hashCode())) * 31;
        Quad quad4 = this.category_2;
        int hashCode4 = (hashCode3 + (quad4 == null ? 0 : quad4.hashCode())) * 31;
        Quad quad5 = this.date_of_expiration;
        int hashCode5 = (hashCode4 + (quad5 == null ? 0 : quad5.hashCode())) * 31;
        Quad quad6 = this.date_of_issue;
        int hashCode6 = (hashCode5 + (quad6 == null ? 0 : quad6.hashCode())) * 31;
        Quad quad7 = this.grant_ru;
        int hashCode7 = (hashCode6 + (quad7 == null ? 0 : quad7.hashCode())) * 31;
        Quad quad8 = this.name_patronymic_ru;
        int hashCode8 = (hashCode7 + (quad8 == null ? 0 : quad8.hashCode())) * 31;
        Quad quad9 = this.number;
        int hashCode9 = (hashCode8 + (quad9 == null ? 0 : quad9.hashCode())) * 31;
        Quad quad10 = this.residence_ru;
        int hashCode10 = (hashCode9 + (quad10 == null ? 0 : quad10.hashCode())) * 31;
        Quad quad11 = this.surname_ru;
        int hashCode11 = (hashCode10 + (quad11 == null ? 0 : quad11.hashCode())) * 31;
        Quad quad12 = this.back_end_date;
        int hashCode12 = (hashCode11 + (quad12 == null ? 0 : quad12.hashCode())) * 31;
        Quad quad13 = this.back_start_date;
        int hashCode13 = (hashCode12 + (quad13 == null ? 0 : quad13.hashCode())) * 31;
        Quad quad14 = this.back_comment_1;
        int hashCode14 = (hashCode13 + (quad14 == null ? 0 : quad14.hashCode())) * 31;
        Quad quad15 = this.back_comment_2;
        int hashCode15 = (hashCode14 + (quad15 == null ? 0 : quad15.hashCode())) * 31;
        Quad quad16 = this.back_sernum;
        return hashCode15 + (quad16 != null ? quad16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DriverLicenseFieldsGeometry(birthdate=" + this.birthdate + ", birthplace_ru=" + this.birthplace_ru + ", category_1=" + this.category_1 + ", category_2=" + this.category_2 + ", date_of_expiration=" + this.date_of_expiration + ", date_of_issue=" + this.date_of_issue + ", grant_ru=" + this.grant_ru + ", name_patronymic_ru=" + this.name_patronymic_ru + ", number=" + this.number + ", residence_ru=" + this.residence_ru + ", surname_ru=" + this.surname_ru + ", back_end_date=" + this.back_end_date + ", back_start_date=" + this.back_start_date + ", back_comment_1=" + this.back_comment_1 + ", back_comment_2=" + this.back_comment_2 + ", back_sernum=" + this.back_sernum + ')';
    }
}
