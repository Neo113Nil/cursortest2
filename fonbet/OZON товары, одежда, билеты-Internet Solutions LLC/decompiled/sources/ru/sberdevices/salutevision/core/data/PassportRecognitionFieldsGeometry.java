package ru.sberdevices.salutevision.core.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0002\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020KHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001a¨\u0006L"}, d2 = {"Lru/sberdevices/salutevision/core/data/PassportRecognitionFieldsGeometry;", "", "mrz", "Lru/sberdevices/salutevision/core/data/Quad;", "mrz1", "birth_date", "date_of_issue", "division_code", "fam_name", AppMeasurementSdk.ConditionalUserProperty.NAME, "number_top", "photo", "place_birth_0", "place_birth_1", "place_birth_2", "place_birth_3", "place_of_issue_0", "place_of_issue_1", "place_of_issue_2", "place_of_issue_3", "seria_top", "surname", "number_bottom", "seria_bottom", "(Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;Lru/sberdevices/salutevision/core/data/Quad;)V", "getBirth_date", "()Lru/sberdevices/salutevision/core/data/Quad;", "getDate_of_issue", "getDivision_code", "getFam_name", "getMrz", "getMrz1", "getName", "getNumber_bottom", "getNumber_top", "getPhoto", "getPlace_birth_0", "getPlace_birth_1", "getPlace_birth_2", "getPlace_birth_3", "getPlace_of_issue_0", "getPlace_of_issue_1", "getPlace_of_issue_2", "getPlace_of_issue_3", "getSeria_bottom", "getSeria_top", "getSurname", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PassportRecognitionFieldsGeometry {
    private final Quad birth_date;
    private final Quad date_of_issue;
    private final Quad division_code;
    private final Quad fam_name;
    private final Quad mrz;
    private final Quad mrz1;
    private final Quad name;
    private final Quad number_bottom;
    private final Quad number_top;
    private final Quad photo;
    private final Quad place_birth_0;
    private final Quad place_birth_1;
    private final Quad place_birth_2;
    private final Quad place_birth_3;
    private final Quad place_of_issue_0;
    private final Quad place_of_issue_1;
    private final Quad place_of_issue_2;
    private final Quad place_of_issue_3;
    private final Quad seria_bottom;
    private final Quad seria_top;
    private final Quad surname;

    public PassportRecognitionFieldsGeometry(Quad quad, Quad quad2, Quad quad3, Quad quad4, Quad quad5, Quad quad6, Quad quad7, Quad quad8, Quad quad9, Quad quad10, Quad quad11, Quad quad12, Quad quad13, Quad quad14, Quad quad15, Quad quad16, Quad quad17, Quad quad18, Quad quad19, Quad quad20, Quad quad21) {
        this.mrz = quad;
        this.mrz1 = quad2;
        this.birth_date = quad3;
        this.date_of_issue = quad4;
        this.division_code = quad5;
        this.fam_name = quad6;
        this.name = quad7;
        this.number_top = quad8;
        this.photo = quad9;
        this.place_birth_0 = quad10;
        this.place_birth_1 = quad11;
        this.place_birth_2 = quad12;
        this.place_birth_3 = quad13;
        this.place_of_issue_0 = quad14;
        this.place_of_issue_1 = quad15;
        this.place_of_issue_2 = quad16;
        this.place_of_issue_3 = quad17;
        this.seria_top = quad18;
        this.surname = quad19;
        this.number_bottom = quad20;
        this.seria_bottom = quad21;
    }

    public static /* synthetic */ PassportRecognitionFieldsGeometry copy$default(PassportRecognitionFieldsGeometry passportRecognitionFieldsGeometry, Quad quad, Quad quad2, Quad quad3, Quad quad4, Quad quad5, Quad quad6, Quad quad7, Quad quad8, Quad quad9, Quad quad10, Quad quad11, Quad quad12, Quad quad13, Quad quad14, Quad quad15, Quad quad16, Quad quad17, Quad quad18, Quad quad19, Quad quad20, Quad quad21, int i11, Object obj) {
        Quad quad22;
        Quad quad23;
        Quad quad24 = (i11 & 1) != 0 ? passportRecognitionFieldsGeometry.mrz : quad;
        Quad quad25 = (i11 & 2) != 0 ? passportRecognitionFieldsGeometry.mrz1 : quad2;
        Quad quad26 = (i11 & 4) != 0 ? passportRecognitionFieldsGeometry.birth_date : quad3;
        Quad quad27 = (i11 & 8) != 0 ? passportRecognitionFieldsGeometry.date_of_issue : quad4;
        Quad quad28 = (i11 & 16) != 0 ? passportRecognitionFieldsGeometry.division_code : quad5;
        Quad quad29 = (i11 & 32) != 0 ? passportRecognitionFieldsGeometry.fam_name : quad6;
        Quad quad30 = (i11 & 64) != 0 ? passportRecognitionFieldsGeometry.name : quad7;
        Quad quad31 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? passportRecognitionFieldsGeometry.number_top : quad8;
        Quad quad32 = (i11 & 256) != 0 ? passportRecognitionFieldsGeometry.photo : quad9;
        Quad quad33 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? passportRecognitionFieldsGeometry.place_birth_0 : quad10;
        Quad quad34 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? passportRecognitionFieldsGeometry.place_birth_1 : quad11;
        Quad quad35 = (i11 & 2048) != 0 ? passportRecognitionFieldsGeometry.place_birth_2 : quad12;
        Quad quad36 = (i11 & 4096) != 0 ? passportRecognitionFieldsGeometry.place_birth_3 : quad13;
        Quad quad37 = (i11 & 8192) != 0 ? passportRecognitionFieldsGeometry.place_of_issue_0 : quad14;
        Quad quad38 = quad24;
        Quad quad39 = (i11 & 16384) != 0 ? passportRecognitionFieldsGeometry.place_of_issue_1 : quad15;
        Quad quad40 = (i11 & 32768) != 0 ? passportRecognitionFieldsGeometry.place_of_issue_2 : quad16;
        Quad quad41 = (i11 & 65536) != 0 ? passportRecognitionFieldsGeometry.place_of_issue_3 : quad17;
        Quad quad42 = (i11 & 131072) != 0 ? passportRecognitionFieldsGeometry.seria_top : quad18;
        Quad quad43 = (i11 & 262144) != 0 ? passportRecognitionFieldsGeometry.surname : quad19;
        Quad quad44 = (i11 & 524288) != 0 ? passportRecognitionFieldsGeometry.number_bottom : quad20;
        if ((i11 & 1048576) != 0) {
            quad23 = quad44;
            quad22 = passportRecognitionFieldsGeometry.seria_bottom;
        } else {
            quad22 = quad21;
            quad23 = quad44;
        }
        return passportRecognitionFieldsGeometry.copy(quad38, quad25, quad26, quad27, quad28, quad29, quad30, quad31, quad32, quad33, quad34, quad35, quad36, quad37, quad39, quad40, quad41, quad42, quad43, quad23, quad22);
    }

    /* renamed from: component1, reason: from getter */
    public final Quad getMrz() {
        return this.mrz;
    }

    /* renamed from: component10, reason: from getter */
    public final Quad getPlace_birth_0() {
        return this.place_birth_0;
    }

    /* renamed from: component11, reason: from getter */
    public final Quad getPlace_birth_1() {
        return this.place_birth_1;
    }

    /* renamed from: component12, reason: from getter */
    public final Quad getPlace_birth_2() {
        return this.place_birth_2;
    }

    /* renamed from: component13, reason: from getter */
    public final Quad getPlace_birth_3() {
        return this.place_birth_3;
    }

    /* renamed from: component14, reason: from getter */
    public final Quad getPlace_of_issue_0() {
        return this.place_of_issue_0;
    }

    /* renamed from: component15, reason: from getter */
    public final Quad getPlace_of_issue_1() {
        return this.place_of_issue_1;
    }

    /* renamed from: component16, reason: from getter */
    public final Quad getPlace_of_issue_2() {
        return this.place_of_issue_2;
    }

    /* renamed from: component17, reason: from getter */
    public final Quad getPlace_of_issue_3() {
        return this.place_of_issue_3;
    }

    /* renamed from: component18, reason: from getter */
    public final Quad getSeria_top() {
        return this.seria_top;
    }

    /* renamed from: component19, reason: from getter */
    public final Quad getSurname() {
        return this.surname;
    }

    /* renamed from: component2, reason: from getter */
    public final Quad getMrz1() {
        return this.mrz1;
    }

    /* renamed from: component20, reason: from getter */
    public final Quad getNumber_bottom() {
        return this.number_bottom;
    }

    /* renamed from: component21, reason: from getter */
    public final Quad getSeria_bottom() {
        return this.seria_bottom;
    }

    /* renamed from: component3, reason: from getter */
    public final Quad getBirth_date() {
        return this.birth_date;
    }

    /* renamed from: component4, reason: from getter */
    public final Quad getDate_of_issue() {
        return this.date_of_issue;
    }

    /* renamed from: component5, reason: from getter */
    public final Quad getDivision_code() {
        return this.division_code;
    }

    /* renamed from: component6, reason: from getter */
    public final Quad getFam_name() {
        return this.fam_name;
    }

    /* renamed from: component7, reason: from getter */
    public final Quad getName() {
        return this.name;
    }

    /* renamed from: component8, reason: from getter */
    public final Quad getNumber_top() {
        return this.number_top;
    }

    /* renamed from: component9, reason: from getter */
    public final Quad getPhoto() {
        return this.photo;
    }

    @NotNull
    public final PassportRecognitionFieldsGeometry copy(Quad mrz, Quad mrz1, Quad birth_date, Quad date_of_issue, Quad division_code, Quad fam_name, Quad name, Quad number_top, Quad photo, Quad place_birth_0, Quad place_birth_1, Quad place_birth_2, Quad place_birth_3, Quad place_of_issue_0, Quad place_of_issue_1, Quad place_of_issue_2, Quad place_of_issue_3, Quad seria_top, Quad surname, Quad number_bottom, Quad seria_bottom) {
        return new PassportRecognitionFieldsGeometry(mrz, mrz1, birth_date, date_of_issue, division_code, fam_name, name, number_top, photo, place_birth_0, place_birth_1, place_birth_2, place_birth_3, place_of_issue_0, place_of_issue_1, place_of_issue_2, place_of_issue_3, seria_top, surname, number_bottom, seria_bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportRecognitionFieldsGeometry)) {
            return false;
        }
        PassportRecognitionFieldsGeometry passportRecognitionFieldsGeometry = (PassportRecognitionFieldsGeometry) other;
        return Intrinsics.d(this.mrz, passportRecognitionFieldsGeometry.mrz) && Intrinsics.d(this.mrz1, passportRecognitionFieldsGeometry.mrz1) && Intrinsics.d(this.birth_date, passportRecognitionFieldsGeometry.birth_date) && Intrinsics.d(this.date_of_issue, passportRecognitionFieldsGeometry.date_of_issue) && Intrinsics.d(this.division_code, passportRecognitionFieldsGeometry.division_code) && Intrinsics.d(this.fam_name, passportRecognitionFieldsGeometry.fam_name) && Intrinsics.d(this.name, passportRecognitionFieldsGeometry.name) && Intrinsics.d(this.number_top, passportRecognitionFieldsGeometry.number_top) && Intrinsics.d(this.photo, passportRecognitionFieldsGeometry.photo) && Intrinsics.d(this.place_birth_0, passportRecognitionFieldsGeometry.place_birth_0) && Intrinsics.d(this.place_birth_1, passportRecognitionFieldsGeometry.place_birth_1) && Intrinsics.d(this.place_birth_2, passportRecognitionFieldsGeometry.place_birth_2) && Intrinsics.d(this.place_birth_3, passportRecognitionFieldsGeometry.place_birth_3) && Intrinsics.d(this.place_of_issue_0, passportRecognitionFieldsGeometry.place_of_issue_0) && Intrinsics.d(this.place_of_issue_1, passportRecognitionFieldsGeometry.place_of_issue_1) && Intrinsics.d(this.place_of_issue_2, passportRecognitionFieldsGeometry.place_of_issue_2) && Intrinsics.d(this.place_of_issue_3, passportRecognitionFieldsGeometry.place_of_issue_3) && Intrinsics.d(this.seria_top, passportRecognitionFieldsGeometry.seria_top) && Intrinsics.d(this.surname, passportRecognitionFieldsGeometry.surname) && Intrinsics.d(this.number_bottom, passportRecognitionFieldsGeometry.number_bottom) && Intrinsics.d(this.seria_bottom, passportRecognitionFieldsGeometry.seria_bottom);
    }

    public final Quad getBirth_date() {
        return this.birth_date;
    }

    public final Quad getDate_of_issue() {
        return this.date_of_issue;
    }

    public final Quad getDivision_code() {
        return this.division_code;
    }

    public final Quad getFam_name() {
        return this.fam_name;
    }

    public final Quad getMrz() {
        return this.mrz;
    }

    public final Quad getMrz1() {
        return this.mrz1;
    }

    public final Quad getName() {
        return this.name;
    }

    public final Quad getNumber_bottom() {
        return this.number_bottom;
    }

    public final Quad getNumber_top() {
        return this.number_top;
    }

    public final Quad getPhoto() {
        return this.photo;
    }

    public final Quad getPlace_birth_0() {
        return this.place_birth_0;
    }

    public final Quad getPlace_birth_1() {
        return this.place_birth_1;
    }

    public final Quad getPlace_birth_2() {
        return this.place_birth_2;
    }

    public final Quad getPlace_birth_3() {
        return this.place_birth_3;
    }

    public final Quad getPlace_of_issue_0() {
        return this.place_of_issue_0;
    }

    public final Quad getPlace_of_issue_1() {
        return this.place_of_issue_1;
    }

    public final Quad getPlace_of_issue_2() {
        return this.place_of_issue_2;
    }

    public final Quad getPlace_of_issue_3() {
        return this.place_of_issue_3;
    }

    public final Quad getSeria_bottom() {
        return this.seria_bottom;
    }

    public final Quad getSeria_top() {
        return this.seria_top;
    }

    public final Quad getSurname() {
        return this.surname;
    }

    public int hashCode() {
        Quad quad = this.mrz;
        int hashCode = (quad == null ? 0 : quad.hashCode()) * 31;
        Quad quad2 = this.mrz1;
        int hashCode2 = (hashCode + (quad2 == null ? 0 : quad2.hashCode())) * 31;
        Quad quad3 = this.birth_date;
        int hashCode3 = (hashCode2 + (quad3 == null ? 0 : quad3.hashCode())) * 31;
        Quad quad4 = this.date_of_issue;
        int hashCode4 = (hashCode3 + (quad4 == null ? 0 : quad4.hashCode())) * 31;
        Quad quad5 = this.division_code;
        int hashCode5 = (hashCode4 + (quad5 == null ? 0 : quad5.hashCode())) * 31;
        Quad quad6 = this.fam_name;
        int hashCode6 = (hashCode5 + (quad6 == null ? 0 : quad6.hashCode())) * 31;
        Quad quad7 = this.name;
        int hashCode7 = (hashCode6 + (quad7 == null ? 0 : quad7.hashCode())) * 31;
        Quad quad8 = this.number_top;
        int hashCode8 = (hashCode7 + (quad8 == null ? 0 : quad8.hashCode())) * 31;
        Quad quad9 = this.photo;
        int hashCode9 = (hashCode8 + (quad9 == null ? 0 : quad9.hashCode())) * 31;
        Quad quad10 = this.place_birth_0;
        int hashCode10 = (hashCode9 + (quad10 == null ? 0 : quad10.hashCode())) * 31;
        Quad quad11 = this.place_birth_1;
        int hashCode11 = (hashCode10 + (quad11 == null ? 0 : quad11.hashCode())) * 31;
        Quad quad12 = this.place_birth_2;
        int hashCode12 = (hashCode11 + (quad12 == null ? 0 : quad12.hashCode())) * 31;
        Quad quad13 = this.place_birth_3;
        int hashCode13 = (hashCode12 + (quad13 == null ? 0 : quad13.hashCode())) * 31;
        Quad quad14 = this.place_of_issue_0;
        int hashCode14 = (hashCode13 + (quad14 == null ? 0 : quad14.hashCode())) * 31;
        Quad quad15 = this.place_of_issue_1;
        int hashCode15 = (hashCode14 + (quad15 == null ? 0 : quad15.hashCode())) * 31;
        Quad quad16 = this.place_of_issue_2;
        int hashCode16 = (hashCode15 + (quad16 == null ? 0 : quad16.hashCode())) * 31;
        Quad quad17 = this.place_of_issue_3;
        int hashCode17 = (hashCode16 + (quad17 == null ? 0 : quad17.hashCode())) * 31;
        Quad quad18 = this.seria_top;
        int hashCode18 = (hashCode17 + (quad18 == null ? 0 : quad18.hashCode())) * 31;
        Quad quad19 = this.surname;
        int hashCode19 = (hashCode18 + (quad19 == null ? 0 : quad19.hashCode())) * 31;
        Quad quad20 = this.number_bottom;
        int hashCode20 = (hashCode19 + (quad20 == null ? 0 : quad20.hashCode())) * 31;
        Quad quad21 = this.seria_bottom;
        return hashCode20 + (quad21 != null ? quad21.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PassportRecognitionFieldsGeometry(mrz=" + this.mrz + ", mrz1=" + this.mrz1 + ", birth_date=" + this.birth_date + ", date_of_issue=" + this.date_of_issue + ", division_code=" + this.division_code + ", fam_name=" + this.fam_name + ", name=" + this.name + ", number_top=" + this.number_top + ", photo=" + this.photo + ", place_birth_0=" + this.place_birth_0 + ", place_birth_1=" + this.place_birth_1 + ", place_birth_2=" + this.place_birth_2 + ", place_birth_3=" + this.place_birth_3 + ", place_of_issue_0=" + this.place_of_issue_0 + ", place_of_issue_1=" + this.place_of_issue_1 + ", place_of_issue_2=" + this.place_of_issue_2 + ", place_of_issue_3=" + this.place_of_issue_3 + ", seria_top=" + this.seria_top + ", surname=" + this.surname + ", number_bottom=" + this.number_bottom + ", seria_bottom=" + this.seria_bottom + ')';
    }
}
