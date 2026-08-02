package com.vk.dto.stickers.images;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.shy;

/* compiled from: ImagesConfigsSet.kt */
/* loaded from: classes18.dex */
public final class ImagesConfigsSet extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ImagesConfigsSet> CREATOR = new a();
    public final String b;
    public final int c;
    public final List<ImageConfig> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ImagesConfigsSet> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImagesConfigsSet a(Serializer serializer) {
            return new ImagesConfigsSet(serializer.H(), serializer.u(), serializer.j(ImageConfig.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImagesConfigsSet[i];
        }
    }

    public ImagesConfigsSet(String str, int i, List<ImageConfig> list) {
        this.b = str;
        this.c = i;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.o0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesConfigsSet)) {
            return false;
        }
        ImagesConfigsSet imagesConfigsSet = (ImagesConfigsSet) obj;
        return epx.f(this.b, imagesConfigsSet.b) && this.c == imagesConfigsSet.c && epx.f(this.d, imagesConfigsSet.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImagesConfigsSet(hash=");
        sb.append(this.b);
        sb.append(", defaultConfig=");
        sb.append(this.c);
        sb.append(", configs=");
        return ms9.a(')', sb, this.d);
    }
}
