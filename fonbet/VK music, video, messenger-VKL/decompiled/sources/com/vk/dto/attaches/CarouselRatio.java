package com.vk.dto.attaches;

import android.os.Parcel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import xsna.xq;
import xsna.zcl;

/* compiled from: AttachmentsArrangementModels.kt */
/* loaded from: classes18.dex */
public final class CarouselRatio implements Serializer.StreamParcelable {
    public static final Serializer.c<CarouselRatio> CREATOR = new a();
    public final float b;
    public final float c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CarouselRatio> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CarouselRatio a(Serializer serializer) {
            return new CarouselRatio(serializer.s(), serializer.s());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarouselRatio[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CarouselRatio() {
        this(r2, r2, 3, null);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.P(this.b);
        serializer.P(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselRatio)) {
            return false;
        }
        CarouselRatio carouselRatio = (CarouselRatio) obj;
        return Float.compare(this.b, carouselRatio.b) == 0 && Float.compare(this.c, carouselRatio.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselRatio(min=");
        sb.append(this.b);
        sb.append(", max=");
        return xq.c(')', this.c, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public CarouselRatio(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public /* synthetic */ CarouselRatio(float f, float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0.75f : f, (i & 2) != 0 ? 1.33f : f2);
    }
}
