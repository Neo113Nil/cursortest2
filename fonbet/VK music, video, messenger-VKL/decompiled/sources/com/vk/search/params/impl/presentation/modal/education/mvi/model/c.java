package com.vk.search.params.impl.presentation.modal.education.mvi.model;

import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import xsna.epx;

/* compiled from: EducationSideEffect.kt */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: EducationSideEffect.kt */
    public static final class a implements c {
        public final City a;

        public a(City city) {
            this.a = city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            City city = this.a;
            if (city == null) {
                return 0;
            }
            return city.hashCode();
        }

        public final String toString() {
            return "ChooseCity(selectedCity=" + this.a + ')';
        }
    }

    /* compiled from: EducationSideEffect.kt */
    public static final class b implements c {
        public final School a;
        public final City b;

        public b(School school, City city) {
            this.a = school;
            this.b = city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            School school = this.a;
            return this.b.hashCode() + ((school == null ? 0 : school.hashCode()) * 31);
        }

        public final String toString() {
            return "ChooseSchool(selectedSchool=" + this.a + ", city=" + this.b + ')';
        }
    }

    /* compiled from: EducationSideEffect.kt */
    /* renamed from: com.vk.search.params.impl.presentation.modal.education.mvi.model.c$c, reason: collision with other inner class name */
    public static final class C1770c implements c {
        public final University a;
        public final City b;

        public C1770c(University university, City city) {
            this.a = university;
            this.b = city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1770c)) {
                return false;
            }
            C1770c c1770c = (C1770c) obj;
            return epx.f(this.a, c1770c.a) && epx.f(this.b, c1770c.b);
        }

        public final int hashCode() {
            University university = this.a;
            return this.b.hashCode() + ((university == null ? 0 : university.hashCode()) * 31);
        }

        public final String toString() {
            return "ChooseUniversity(selectedUniversity=" + this.a + ", city=" + this.b + ')';
        }
    }

    /* compiled from: EducationSideEffect.kt */
    public static final class d implements c {
        public static final d a = new d();
    }

    /* compiled from: EducationSideEffect.kt */
    public static final class e implements c {
        public static final e a = new e();
    }

    /* compiled from: EducationSideEffect.kt */
    public static final class f implements c {
        public final EducationState.InstitutionType a;

        public f(EducationState.InstitutionType institutionType) {
            this.a = institutionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ConfirmInstitutionTypeChange(pendingInstitutionType=" + this.a + ')';
        }
    }

    /* compiled from: EducationSideEffect.kt */
    public static final class g implements c {
        public final EducationParam a;

        public g(EducationParam educationParam) {
            this.a = educationParam;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            EducationParam educationParam = this.a;
            if (educationParam == null) {
                return 0;
            }
            return educationParam.hashCode();
        }

        public final String toString() {
            return "SetResult(param=" + this.a + ')';
        }
    }
}
