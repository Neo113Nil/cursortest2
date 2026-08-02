package com.vk.catalog2.common.dto.api.music;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: ArtistsIdsList.kt */
/* loaded from: classes16.dex */
public final class ArtistsIdsList extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ArtistsIdsList> CREATOR = new a();
    public final List<String> b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ArtistsIdsList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ArtistsIdsList a(Serializer serializer) {
            return new ArtistsIdsList(com.vk.core.serialize.a.a(serializer));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArtistsIdsList[i];
        }
    }

    public ArtistsIdsList(List<String> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArtistsIdsList) && epx.f(this.b, ((ArtistsIdsList) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ArtistsIdsList(list="), this.b);
    }
}
