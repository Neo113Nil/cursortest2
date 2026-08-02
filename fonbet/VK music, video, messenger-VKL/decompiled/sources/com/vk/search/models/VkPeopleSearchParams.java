package com.vk.search.models;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.common.SearchParams;

/* compiled from: VkPeopleSearchParams.kt */
/* loaded from: classes5.dex */
public final class VkPeopleSearchParams extends SearchParams {
    public int d;
    public int e;
    public int f;
    public VkRelation g = h;
    public static final VkRelation h = VkRelation.none;
    public static final Serializer.c<VkPeopleSearchParams> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkPeopleSearchParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkPeopleSearchParams a(Serializer serializer) {
            return new VkPeopleSearchParams();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkPeopleSearchParams[i];
        }
    }

    public final <T extends SearchParams> void Ab(T t) {
        this.b = t.b;
        this.c = t.c;
        VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) t;
        this.d = vkPeopleSearchParams.d;
        this.e = vkPeopleSearchParams.e;
        this.f = vkPeopleSearchParams.f;
        this.g = vkPeopleSearchParams.g;
    }

    @Override // com.vk.superapp.api.dto.common.SearchParams
    public final boolean I() {
        return super.I() && this.d == 0 && this.e == 0 && this.f == 0 && this.g == h;
    }

    @Override // com.vk.superapp.api.dto.common.SearchParams
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VkPeopleSearchParams.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) obj;
        return this.d == vkPeopleSearchParams.d && this.e == vkPeopleSearchParams.e && this.f == vkPeopleSearchParams.f && this.g == vkPeopleSearchParams.g;
    }

    @Override // com.vk.superapp.api.dto.common.SearchParams
    public final int hashCode() {
        return this.g.hashCode() + (((((((this.b * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31);
    }

    @Override // com.vk.superapp.api.dto.common.SearchParams
    public final void reset() {
        zb(null);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = h;
    }
}
