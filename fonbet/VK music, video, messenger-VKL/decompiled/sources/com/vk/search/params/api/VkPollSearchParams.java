package com.vk.search.params.api;

import com.vk.core.serialize.Serializer;

/* compiled from: VkPollSearchParams.kt */
/* loaded from: classes5.dex */
public final class VkPollSearchParams extends SearchParamsWithCity {
    public int c;
    public int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkPollSearchParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkPollSearchParams a(Serializer serializer) {
            VkPollSearchParams vkPollSearchParams = new VkPollSearchParams();
            vkPollSearchParams.b = (City) serializer.A(City.class.getClassLoader());
            vkPollSearchParams.c = serializer.u();
            vkPollSearchParams.d = serializer.u();
            return vkPollSearchParams;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkPollSearchParams[i];
        }
    }

    static {
        new a();
    }

    public VkPollSearchParams() {
        super(null);
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final boolean I() {
        return super.I() && this.c == 0 && this.d == 0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    @Override // com.vk.search.params.api.SearchParams
    public final SearchParams copy() {
        VkPollSearchParams vkPollSearchParams = new VkPollSearchParams();
        vkPollSearchParams.h5(this);
        vkPollSearchParams.c = this.c;
        vkPollSearchParams.d = this.d;
        return vkPollSearchParams;
    }

    @Override // com.vk.search.params.api.SearchParamsWithCity, com.vk.search.params.api.SearchParams
    public final void reset() {
        this.b = null;
        this.c = 0;
        this.d = 0;
    }
}
