package com.vk.newsfeed.api.posting.dto;

import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;

/* compiled from: PosterConfigCategory.kt */
/* loaded from: classes3.dex */
public final class PosterConfigCategory extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PosterConfigCategory> CREATOR = new a();
    public final String b;
    public final String c;
    public final List<PosterBackground> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PosterConfigCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PosterConfigCategory a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            String str = H2 != null ? H2 : "";
            List k = serializer.k(PosterBackground.class);
            if (k == null) {
                k = EmptyList.b;
            }
            return new PosterConfigCategory(H, str, k);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PosterConfigCategory[i];
        }
    }

    public PosterConfigCategory(String str, String str2, List<PosterBackground> list) {
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.W(this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PosterConfigCategory)) {
            return super.equals(obj);
        }
        return epx.f(this.b, ((PosterConfigCategory) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
