package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;

/* compiled from: GifWithQueryData.kt */
/* loaded from: classes18.dex */
public final class GifWithQueryData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GifWithQueryData> CREATOR = new a();
    public final String b;
    public final List<GifItem> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GifWithQueryData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GifWithQueryData a(Serializer serializer) {
            return new GifWithQueryData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GifWithQueryData[i];
        }
    }

    public GifWithQueryData(String str, List<GifItem> list) {
        this.b = str;
        this.c = list;
    }

    public static GifWithQueryData zb(GifWithQueryData gifWithQueryData, String str, List list, int i) {
        if ((i & 1) != 0) {
            str = gifWithQueryData.b;
        }
        if ((i & 2) != 0) {
            list = gifWithQueryData.c;
        }
        gifWithQueryData.getClass();
        return new GifWithQueryData(str, list);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.W(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifWithQueryData)) {
            return false;
        }
        GifWithQueryData gifWithQueryData = (GifWithQueryData) obj;
        return epx.f(this.b, gifWithQueryData.b) && epx.f(this.c, gifWithQueryData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifWithQueryData(query=");
        sb.append(this.b);
        sb.append(", gifStickers=");
        return ms9.a(')', sb, this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GifWithQueryData(Serializer serializer) {
        this(r0, r3 == null ? EmptyList.b : r3);
        String H = serializer.H();
        H = H == null ? "" : H;
        List k = serializer.k(GifItem.class);
    }
}
