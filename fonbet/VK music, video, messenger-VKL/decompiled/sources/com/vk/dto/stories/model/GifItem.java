package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.fq;
import xsna.ho8;
import xsna.zcl;

/* compiled from: GifItem.kt */
/* loaded from: classes18.dex */
public final class GifItem extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final Image c;
    public final String d;
    public static final a e = new a();
    public static final Serializer.c<GifItem> CREATOR = new b();
    private static final GifItem STUB = new GifItem("", Image.d, null, 4, null);

    /* compiled from: GifItem.kt */
    public static final class a {
        public final GifItem getSTUB() {
            return GifItem.STUB;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GifItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GifItem a(Serializer serializer) {
            return new GifItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GifItem[i];
        }
    }

    public /* synthetic */ GifItem(String str, Image image, String str2, int i, zcl zclVar) {
        this(str, image, (i & 4) != 0 ? null : str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifItem)) {
            return false;
        }
        GifItem gifItem = (GifItem) obj;
        return epx.f(this.b, gifItem.b) && epx.f(this.c, gifItem.c) && epx.f(this.d, gifItem.d);
    }

    public final int hashCode() {
        int b2 = fq.b(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        return b2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifItem(id=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", preview=");
        return ho8.a(sb, this.d, ')');
    }

    public GifItem(String str, Image image, String str2) {
        this.b = str;
        this.c = image;
        this.d = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GifItem(Serializer serializer) {
        this(r0, r1 == null ? Image.d : r1, serializer.H());
        String H = serializer.H();
        H = H == null ? "" : H;
        Image image = (Image) serializer.G(Image.class.getClassLoader());
    }
}
