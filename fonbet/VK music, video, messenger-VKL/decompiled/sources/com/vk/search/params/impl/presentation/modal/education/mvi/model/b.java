package com.vk.search.params.impl.presentation.modal.education.mvi.model;

import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.education.EducationalInstitution;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import xsna.epx;
import xsna.k9x;
import xsna.uqi;
import xsna.xl50;

/* compiled from: EducationPatch.kt */
/* loaded from: classes5.dex */
public interface b extends xl50 {

    /* compiled from: EducationPatch.kt */
    public static final class a implements b {
        public final k9x b;
        public final City c;
        public final EducationalInstitution d;
        public final Integer e;

        public a(k9x k9xVar, City city, EducationalInstitution educationalInstitution, Integer num) {
            this.b = k9xVar;
            this.c = city;
            this.d = educationalInstitution;
            this.e = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            City city = this.c;
            int hashCode2 = (hashCode + (city == null ? 0 : city.hashCode())) * 31;
            EducationalInstitution educationalInstitution = this.d;
            int hashCode3 = (hashCode2 + (educationalInstitution == null ? 0 : educationalInstitution.hashCode())) * 31;
            Integer num = this.e;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeatureInitialized(availableYearRange=");
            sb.append(this.b);
            sb.append(", city=");
            sb.append(this.c);
            sb.append(", institution=");
            sb.append(this.d);
            sb.append(", year=");
            return uqi.b(sb, this.e, ')');
        }
    }

    /* compiled from: EducationPatch.kt */
    /* renamed from: com.vk.search.params.impl.presentation.modal.education.mvi.model.b$b, reason: collision with other inner class name */
    public static final class C1769b implements b {
        public final EducationState.InstitutionType b;

        public C1769b(EducationState.InstitutionType institutionType) {
            this.b = institutionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1769b) && this.b == ((C1769b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "InstitutionTypeChanged(type=" + this.b + ')';
        }
    }

    /* compiled from: EducationPatch.kt */
    public interface c extends b {
    }
}
