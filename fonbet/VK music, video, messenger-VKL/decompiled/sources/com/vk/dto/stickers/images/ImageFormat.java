package com.vk.dto.stickers.images;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ImageFormat.kt */
/* loaded from: classes18.dex */
public final class ImageFormat extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ImageFormat> CREATOR = new a();

    @pmi0("format")
    private final FormatType format;

    @pmi0("modifier")
    private final String modifier;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ImageFormat> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ImageFormat a(Serializer serializer) {
            return new ImageFormat(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImageFormat[i];
        }
    }

    public /* synthetic */ ImageFormat(Serializer serializer, zcl zclVar) {
        this(serializer);
    }

    public final String Ab() {
        return this.modifier;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.format);
        serializer.j0(this.modifier);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFormat)) {
            return false;
        }
        ImageFormat imageFormat = (ImageFormat) obj;
        return this.format == imageFormat.format && epx.f(this.modifier, imageFormat.modifier);
    }

    public final int hashCode() {
        return this.modifier.hashCode() + (this.format.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageFormat(format=");
        sb.append(this.format);
        sb.append(", modifier=");
        return ho8.a(sb, this.modifier, ')');
    }

    public final FormatType zb() {
        return this.format;
    }

    public /* synthetic */ ImageFormat(FormatType formatType, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? FormatType.PNG : formatType, (i & 2) != 0 ? "" : str);
    }

    public ImageFormat(FormatType formatType, String str) {
        this.format = formatType;
        this.modifier = str;
    }

    public ImageFormat() {
        this(FormatType.PNG, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ImageFormat(Serializer serializer) {
        this(r0 == null ? FormatType.PNG : r0, serializer.H());
        FormatType formatType = (FormatType) serializer.C();
    }
}
