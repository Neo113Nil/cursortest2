package com.vk.search.params.impl.presentation.modal.education.mvi.model;

import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.b;
import xsna.epx;
import xsna.kj50;
import xsna.uqi;

/* compiled from: EducationAction.kt */
/* loaded from: classes5.dex */
public interface a extends kj50 {

    /* compiled from: EducationAction.kt */
    /* renamed from: com.vk.search.params.impl.presentation.modal.education.mvi.model.a$a, reason: collision with other inner class name */
    public static final class C1768a implements a {
        public static final C1768a b = new C1768a();
    }

    /* compiled from: EducationAction.kt */
    public static final class b implements a {
        public static final b b = new b();
    }

    /* compiled from: EducationAction.kt */
    public static final class c implements a, b.c {
        public final City b;

        public c(City city) {
            this.b = city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            City city = this.b;
            if (city == null) {
                return 0;
            }
            return city.hashCode();
        }

        public final String toString() {
            return "CitySelected(city=" + this.b + ')';
        }
    }

    /* compiled from: EducationAction.kt */
    public static final class d implements a, b.c {
        public static final d b = new d();
    }

    /* compiled from: EducationAction.kt */
    public static final class e implements a {
        public static final e b = new e();
    }

    /* compiled from: EducationAction.kt */
    public static final class f implements a {
        public static final f b = new f();
    }

    /* compiled from: EducationAction.kt */
    public static final class g implements a {
        public final EducationParam b;
        public final City c;

        public g() {
            this(null, null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            EducationParam educationParam = this.b;
            int hashCode = (educationParam == null ? 0 : educationParam.hashCode()) * 31;
            City city = this.c;
            return hashCode + (city != null ? city.hashCode() : 0);
        }

        public final String toString() {
            return "InitialArgumentsResolved(param=" + this.b + ", selectedCity=" + this.c + ')';
        }

        public g(EducationParam educationParam, City city, int i) {
            educationParam = (i & 1) != 0 ? null : educationParam;
            city = (i & 2) != 0 ? null : city;
            this.b = educationParam;
            this.c = city;
        }
    }

    /* compiled from: EducationAction.kt */
    public static final class h implements a {
        public static final h b = new h();
    }

    /* compiled from: EducationAction.kt */
    public static final class i implements a {
        public final EducationState.InstitutionType b;

        public i(EducationState.InstitutionType institutionType) {
            this.b = institutionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "InstitutionTypeChangeConfirmed(expectedType=" + this.b + ')';
        }
    }

    /* compiled from: EducationAction.kt */
    public static final class j implements a {
        public final EducationState.InstitutionType b;

        public j(EducationState.InstitutionType institutionType) {
            this.b = institutionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "InstitutionTypeSelected(type=" + this.b + ')';
        }
    }

    /* compiled from: EducationAction.kt */
    public static final class k implements a, b.c {
        public final School b;

        public k(School school) {
            this.b = school;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            School school = this.b;
            if (school == null) {
                return 0;
            }
            return school.hashCode();
        }

        public final String toString() {
            return "SchoolSelected(school=" + this.b + ')';
        }
    }

    /* compiled from: EducationAction.kt */
    public static final class l implements a, b.c {
        public final University b;

        public l(University university) {
            this.b = university;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            University university = this.b;
            if (university == null) {
                return 0;
            }
            return university.hashCode();
        }

        public final String toString() {
            return "UniversitySelected(university=" + this.b + ')';
        }
    }

    /* compiled from: EducationAction.kt */
    public static final class m implements a, b.c {
        public final Integer b;

        public m(Integer num) {
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            Integer num = this.b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return uqi.b(new StringBuilder("YearSelected(year="), this.b, ')');
        }
    }
}
