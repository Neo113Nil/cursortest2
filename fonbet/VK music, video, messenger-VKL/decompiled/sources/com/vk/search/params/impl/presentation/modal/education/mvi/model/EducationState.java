package com.vk.search.params.impl.presentation.modal.education.mvi.model;

import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.education.EducationalInstitution;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.api.domain.model.education.University;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.k9x;
import xsna.km50;
import xsna.uqi;
import xsna.zrp;

/* compiled from: EducationState.kt */
/* loaded from: classes5.dex */
public final class EducationState implements km50 {
    public final a b;
    public final InstitutionType c;
    public final City d;
    public final School e;
    public final University f;
    public final k9x g;
    public final Integer h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EducationState.kt */
    public static final class InstitutionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InstitutionType[] $VALUES;
        public static final InstitutionType SCHOOL;
        public static final InstitutionType UNIVERSITY;

        static {
            InstitutionType institutionType = new InstitutionType("SCHOOL", 0);
            SCHOOL = institutionType;
            InstitutionType institutionType2 = new InstitutionType("UNIVERSITY", 1);
            UNIVERSITY = institutionType2;
            InstitutionType[] institutionTypeArr = {institutionType, institutionType2};
            $VALUES = institutionTypeArr;
            $ENTRIES = new asp(institutionTypeArr);
        }

        public InstitutionType() {
            throw null;
        }

        public static InstitutionType valueOf(String str) {
            return (InstitutionType) Enum.valueOf(InstitutionType.class, str);
        }

        public static InstitutionType[] values() {
            return (InstitutionType[]) $VALUES.clone();
        }
    }

    /* compiled from: EducationState.kt */
    public static final class a {
        public final EducationalInstitution a;
        public final City b;
        public final Integer c;

        public a() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            EducationalInstitution educationalInstitution = this.a;
            int hashCode = (educationalInstitution == null ? 0 : educationalInstitution.hashCode()) * 31;
            City city = this.b;
            int hashCode2 = (hashCode + (city == null ? 0 : city.hashCode())) * 31;
            Integer num = this.c;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialValues(institution=");
            sb.append(this.a);
            sb.append(", city=");
            sb.append(this.b);
            sb.append(", year=");
            return uqi.b(sb, this.c, ')');
        }

        public a(EducationalInstitution educationalInstitution, City city, Integer num) {
            this.a = educationalInstitution;
            this.b = city;
            this.c = num;
        }
    }

    /* compiled from: EducationState.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstitutionType.values().length];
            try {
                iArr[InstitutionType.SCHOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstitutionType.UNIVERSITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EducationState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public static EducationState a(EducationState educationState, InstitutionType institutionType, City city, School school, University university, Integer num, int i) {
        a aVar = educationState.b;
        if ((i & 2) != 0) {
            institutionType = educationState.c;
        }
        InstitutionType institutionType2 = institutionType;
        if ((i & 4) != 0) {
            city = educationState.d;
        }
        City city2 = city;
        if ((i & 8) != 0) {
            school = educationState.e;
        }
        School school2 = school;
        if ((i & 16) != 0) {
            university = educationState.f;
        }
        University university2 = university;
        k9x k9xVar = educationState.g;
        if ((i & 64) != 0) {
            num = educationState.h;
        }
        educationState.getClass();
        return new EducationState(aVar, institutionType2, city2, school2, university2, k9xVar, num);
    }

    public final EducationalInstitution b() {
        int i = b.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationState)) {
            return false;
        }
        EducationState educationState = (EducationState) obj;
        return epx.f(this.b, educationState.b) && this.c == educationState.c && epx.f(this.d, educationState.d) && epx.f(this.e, educationState.e) && epx.f(this.f, educationState.f) && epx.f(this.g, educationState.g) && epx.f(this.h, educationState.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        City city = this.d;
        int hashCode2 = (hashCode + (city == null ? 0 : city.hashCode())) * 31;
        School school = this.e;
        int hashCode3 = (hashCode2 + (school == null ? 0 : school.hashCode())) * 31;
        University university = this.f;
        int hashCode4 = (hashCode3 + (university == null ? 0 : university.hashCode())) * 31;
        k9x k9xVar = this.g;
        int hashCode5 = (hashCode4 + (k9xVar == null ? 0 : k9xVar.hashCode())) * 31;
        Integer num = this.h;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationState(initialValues=");
        sb.append(this.b);
        sb.append(", institutionType=");
        sb.append(this.c);
        sb.append(", city=");
        sb.append(this.d);
        sb.append(", school=");
        sb.append(this.e);
        sb.append(", university=");
        sb.append(this.f);
        sb.append(", availableYearRange=");
        sb.append(this.g);
        sb.append(", year=");
        return uqi.b(sb, this.h, ')');
    }

    public EducationState(a aVar, InstitutionType institutionType, City city, School school, University university, k9x k9xVar, Integer num) {
        this.b = aVar;
        this.c = institutionType;
        this.d = city;
        this.e = school;
        this.f = university;
        this.g = k9xVar;
        this.h = num;
    }

    public /* synthetic */ EducationState(a aVar, InstitutionType institutionType, k9x k9xVar, int i) {
        this((i & 1) != 0 ? new a(null, null, null) : aVar, (i & 2) != 0 ? InstitutionType.SCHOOL : institutionType, null, null, null, (i & 32) != 0 ? null : k9xVar, null);
    }
}
