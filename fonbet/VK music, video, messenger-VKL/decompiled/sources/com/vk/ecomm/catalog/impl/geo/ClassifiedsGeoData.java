package com.vk.ecomm.catalog.impl.geo;

import com.vk.core.serialize.Serializer;

/* compiled from: ClassifiedsGeoData.kt */
/* loaded from: classes18.dex */
public final class ClassifiedsGeoData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClassifiedsGeoData> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClassifiedsGeoData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClassifiedsGeoData a(Serializer serializer) {
            return new ClassifiedsGeoData(serializer.H(), serializer.H(), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClassifiedsGeoData[i];
        }
    }

    public ClassifiedsGeoData(String str, String str2, String str3, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }
}
