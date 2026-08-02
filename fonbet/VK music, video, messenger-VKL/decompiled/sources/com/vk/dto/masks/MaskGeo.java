package com.vk.dto.masks;

import android.location.Location;
import com.vk.core.serialize.Serializer;

/* compiled from: MaskGeo.kt */
/* loaded from: classes18.dex */
public final class MaskGeo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MaskGeo> CREATOR = new a();
    public final MaskLocation[] b;

    /* compiled from: MaskGeo.kt */
    public static final class MaskLocation extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<MaskLocation> CREATOR = new a();
        public final double b;
        public final double c;
        public final double d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<MaskLocation> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MaskLocation a(Serializer serializer) {
                return new MaskLocation(serializer.r(), serializer.r(), serializer.r());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MaskLocation[i];
            }
        }

        public MaskLocation(double d, double d2, double d3) {
            this.b = d;
            this.c = d2;
            this.d = d3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.O(this.b);
            serializer.O(this.c);
            serializer.O(this.d);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MaskGeo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MaskGeo a(Serializer serializer) {
            return new MaskGeo((MaskLocation[]) serializer.i(MaskLocation.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaskGeo[i];
        }
    }

    public MaskGeo(MaskLocation[] maskLocationArr) {
        this.b = maskLocationArr;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.n0(this.b);
    }

    public final boolean zb(Location location) {
        float[] fArr = new float[3];
        MaskLocation[] maskLocationArr = this.b;
        if (maskLocationArr != null) {
            for (MaskLocation maskLocation : maskLocationArr) {
                if (maskLocation != null) {
                    Location.distanceBetween(maskLocation.b, maskLocation.c, location.getLatitude(), location.getLongitude(), fArr);
                    if (fArr[0] <= maskLocation.d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
