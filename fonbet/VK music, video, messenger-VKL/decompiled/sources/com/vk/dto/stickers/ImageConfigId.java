package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ImageConfigId.kt */
/* loaded from: classes18.dex */
public final class ImageConfigId extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ImageConfigId> CREATOR = new a();
    public final int b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ImageConfigId> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageConfigId a(Serializer serializer) {
            return new ImageConfigId(serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageConfigId[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageConfigId() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageConfigId)) {
            return false;
        }
        ImageConfigId imageConfigId = (ImageConfigId) obj;
        return this.b == imageConfigId.b && this.c == imageConfigId.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageConfigId(version=");
        sb.append(this.b);
        sb.append(", configId=");
        return vu5.b(sb, this.c, ')');
    }

    public /* synthetic */ ImageConfigId(int i, int i2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? -1 : i2);
    }

    public ImageConfigId(int i, int i2) {
        this.b = i;
        this.c = i2;
    }
}
