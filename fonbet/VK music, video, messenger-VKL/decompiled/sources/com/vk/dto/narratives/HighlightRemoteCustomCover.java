package com.vk.dto.narratives;

import android.graphics.RectF;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import xsna.epx;
import xsna.ixj0;

/* compiled from: HighlightCover.kt */
/* loaded from: classes18.dex */
public final class HighlightRemoteCustomCover extends HighlightCover {
    public static final Serializer.c<HighlightRemoteCustomCover> CREATOR = new a();
    public final Image b;
    public final Photo c;
    public final RectF d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HighlightRemoteCustomCover> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HighlightRemoteCustomCover a(Serializer serializer) {
            return new HighlightRemoteCustomCover((Image) serializer.G(Image.class.getClassLoader()), (Photo) serializer.G(Photo.class.getClassLoader()), (RectF) serializer.A(RectF.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HighlightRemoteCustomCover[i];
        }
    }

    public HighlightRemoteCustomCover(Image image, Photo photo, RectF rectF) {
        super(null);
        this.b = image;
        this.c = photo;
        this.d = rectF;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.e0(this.d);
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final RectF d() {
        return this.d;
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final String e(int i) {
        ImageSize Cb = this.b.Cb(i, true, false);
        if (Cb != null) {
            return Cb.d.d;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightRemoteCustomCover)) {
            return false;
        }
        HighlightRemoteCustomCover highlightRemoteCustomCover = (HighlightRemoteCustomCover) obj;
        return epx.f(this.b, highlightRemoteCustomCover.b) && epx.f(this.c, highlightRemoteCustomCover.c) && epx.f(this.d, highlightRemoteCustomCover.d);
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final String f() {
        Image image;
        Photo photo = this.c;
        if (photo == null || (image = photo.y) == null) {
            image = this.b;
        }
        return ixj0.h(image.b);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Photo photo = this.c;
        int hashCode2 = (hashCode + (photo == null ? 0 : photo.hashCode())) * 31;
        RectF rectF = this.d;
        return hashCode2 + (rectF != null ? rectF.hashCode() : 0);
    }

    public final String toString() {
        return "HighlightRemoteCustomCover(croppedImage=" + this.b + ", photo=" + this.c + ", cropRect=" + this.d + ')';
    }
}
