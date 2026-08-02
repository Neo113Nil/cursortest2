package com.vk.dto.photo;

import android.os.Parcel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSize;
import io.reactivex.rxjava3.subjects.b;
import java.util.Iterator;
import xsna.epx;
import xsna.glw;
import xsna.xq;

/* compiled from: CropPhoto.kt */
/* loaded from: classes18.dex */
public final class CropPhoto implements Serializer.StreamParcelable {
    public static final Serializer.c<CropPhoto> CREATOR = new a();
    public final Photo b;
    public final Crop c;

    /* compiled from: CropPhoto.kt */
    public static final class Crop implements Serializer.StreamParcelable {
        public static final Serializer.c<Crop> CREATOR = new a();
        public final float b;
        public final float c;
        public final float d;
        public final float e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Crop> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Crop a(Serializer serializer) {
                return new Crop(serializer.s(), serializer.s(), serializer.s(), serializer.s());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Crop[i];
            }
        }

        public Crop(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.P(this.b);
            serializer.P(this.c);
            serializer.P(this.d);
            serializer.P(this.e);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Crop)) {
                return false;
            }
            Crop crop = (Crop) obj;
            return Float.compare(this.b, crop.b) == 0 && Float.compare(this.c, crop.c) == 0 && Float.compare(this.d, crop.d) == 0 && Float.compare(this.e, crop.e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.e) + b.a(this.d, b.a(this.c, Float.hashCode(this.b) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Crop(x=");
            sb.append(this.b);
            sb.append(", y=");
            sb.append(this.c);
            sb.append(", x2=");
            sb.append(this.d);
            sb.append(", y2=");
            return xq.c(')', this.e, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public Crop() {
            this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f, 100.0f);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CropPhoto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CropPhoto a(Serializer serializer) {
            return new CropPhoto((Photo) serializer.G(Photo.class.getClassLoader()), (Crop) serializer.G(Crop.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CropPhoto[i];
        }
    }

    public CropPhoto(Photo photo, Crop crop) {
        this.b = photo;
        this.c = crop;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
    }

    public final int a(ImageSize imageSize) {
        float f = this.c.c;
        int i = imageSize.d.c;
        return (int) Math.ceil(((r0.e / 100.0f) * i) - ((f / 100.0f) * i));
    }

    public final ImageSize b(int i) {
        boolean b = glw.a().b();
        Iterator it = this.b.y.b.iterator();
        ImageSize imageSize = null;
        while (it.hasNext()) {
            ImageSize imageSize2 = (ImageSize) it.next();
            if (imageSize != null) {
                int a2 = a(imageSize);
                int a3 = a(imageSize2);
                if (b) {
                    if (a2 < a3) {
                        if (Math.abs(a3 - i) < Math.abs(a2 - i)) {
                        }
                    }
                } else if (a2 > a3) {
                }
            }
            imageSize = imageSize2;
        }
        return imageSize;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropPhoto)) {
            return false;
        }
        CropPhoto cropPhoto = (CropPhoto) obj;
        return epx.f(this.b, cropPhoto.b) && epx.f(this.c, cropPhoto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CropPhoto(photo=" + this.b + ", crop=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
