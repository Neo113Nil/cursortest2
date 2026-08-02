package com.vk.dto.status;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.er;

/* compiled from: StatusImagePopupPhoto.kt */
/* loaded from: classes18.dex */
public final class StatusImagePopupPhoto extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StatusImagePopupPhoto> CREATOR = new a();
    public final String b;
    public final Image c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StatusImagePopupPhoto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StatusImagePopupPhoto a(Serializer serializer) {
            return new StatusImagePopupPhoto(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatusImagePopupPhoto[i];
        }
    }

    public StatusImagePopupPhoto(String str, Image image) {
        this.b = str;
        this.c = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusImagePopupPhoto)) {
            return false;
        }
        StatusImagePopupPhoto statusImagePopupPhoto = (StatusImagePopupPhoto) obj;
        return epx.f(this.b, statusImagePopupPhoto.b) && epx.f(this.c, statusImagePopupPhoto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusImagePopupPhoto(type=");
        sb.append(this.b);
        sb.append(", image=");
        return er.d(sb, this.c, ')');
    }
}
