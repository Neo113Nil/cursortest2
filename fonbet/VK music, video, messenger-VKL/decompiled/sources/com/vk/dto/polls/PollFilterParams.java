package com.vk.dto.polls;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.common.SearchParams;
import com.vk.superapp.api.dto.identity.WebCity;

/* compiled from: PollFilterParams.kt */
/* loaded from: classes18.dex */
public final class PollFilterParams extends SearchParams {
    public static final Serializer.c<PollFilterParams> CREATOR = new a();
    public int d;
    public int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PollFilterParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PollFilterParams a(Serializer serializer) {
            return new PollFilterParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PollFilterParams[i];
        }
    }

    public PollFilterParams() {
    }

    @Override // com.vk.superapp.api.dto.common.SearchParams
    public final boolean I() {
        return super.I() && this.d == 0 && this.e == 0;
    }

    @Override // com.vk.superapp.api.dto.common.SearchParams, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.S(this.d);
        serializer.S(this.e);
    }

    @Override // com.vk.superapp.api.dto.common.SearchParams
    public final void reset() {
        zb(null);
        this.d = 0;
        this.e = 0;
    }

    public PollFilterParams(Serializer serializer) {
        this();
        this.b = serializer.u();
        this.c = (WebCity) serializer.G(WebCity.class.getClassLoader());
        this.d = serializer.u();
        this.e = serializer.u();
    }
}
