package com.vk.search.params.api;

import com.vk.core.serialize.Serializer;
import com.vk.search.models.VkRelation;
import com.vk.search.params.api.domain.model.education.EducationParam;
import xsna.epx;

/* compiled from: VkPeopleSearchParams.kt */
/* loaded from: classes5.dex */
public final class VkPeopleSearchParams extends SearchParamsWithCity {
    public int c;
    public int d;
    public int e;
    public VkRelation f;
    public EducationParam g;
    public String h;
    public static final VkRelation i = VkRelation.none;
    public static final Serializer.c<VkPeopleSearchParams> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkPeopleSearchParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkPeopleSearchParams a(Serializer serializer) {
            VkPeopleSearchParams vkPeopleSearchParams = new VkPeopleSearchParams();
            vkPeopleSearchParams.b = (City) serializer.A(City.class.getClassLoader());
            vkPeopleSearchParams.c = serializer.u();
            vkPeopleSearchParams.d = serializer.u();
            vkPeopleSearchParams.e = serializer.u();
            VkRelation vkRelation = (VkRelation) serializer.C();
            if (vkRelation == null) {
                vkRelation = vkPeopleSearchParams.f;
            }
            vkPeopleSearchParams.f = vkRelation;
            vkPeopleSearchParams.g = (EducationParam) serializer.A(EducationParam.class.getClassLoader());
            vkPeopleSearchParams.h = serializer.H();
            return vkPeopleSearchParams;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkPeopleSearchParams[i];
        }
    }

    public VkPeopleSearchParams() {
        super(null);
        this.f = i;
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final boolean I() {
        return super.I() && this.c == 0 && this.d == 0 && this.e == 0 && this.f == i && this.g == null && this.h == null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.g0(this.f);
        serializer.e0(this.g);
        serializer.j0(this.h);
    }

    @Override // com.vk.search.params.api.SearchParams
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final VkPeopleSearchParams copy() {
        VkPeopleSearchParams vkPeopleSearchParams = new VkPeopleSearchParams();
        vkPeopleSearchParams.h5(this);
        return vkPeopleSearchParams;
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VkPeopleSearchParams.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) obj;
        return this.c == vkPeopleSearchParams.c && this.d == vkPeopleSearchParams.d && this.e == vkPeopleSearchParams.e && this.f == vkPeopleSearchParams.f && epx.f(this.g, vkPeopleSearchParams.g) && epx.f(this.h, vkPeopleSearchParams.h);
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final <T extends SearchParams> void h5(T t) {
        super.h5(t);
        if (t instanceof VkPeopleSearchParams) {
            VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) t;
            this.c = vkPeopleSearchParams.c;
            this.d = vkPeopleSearchParams.d;
            this.e = vkPeopleSearchParams.e;
            this.f = vkPeopleSearchParams.f;
            this.g = vkPeopleSearchParams.g;
            this.h = vkPeopleSearchParams.h;
        }
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity
    public final int hashCode() {
        int hashCode = this.f.hashCode() + (((((((d() * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31);
        EducationParam educationParam = this.g;
        if (educationParam != null) {
            hashCode = (hashCode * 31) + educationParam.hashCode();
        }
        String str = this.h;
        if (str == null) {
            return hashCode;
        }
        return str.hashCode() + (hashCode * 31);
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final void reset() {
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = i;
        this.g = null;
        this.h = null;
    }
}
