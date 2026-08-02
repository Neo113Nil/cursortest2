package com.vk.dto.stories.entities;

import android.net.Uri;
import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: StoryCameraGalleryData.kt */
/* loaded from: classes18.dex */
public final class StoryCameraGalleryData implements Serializer.StreamParcelable {
    public static final Serializer.c<StoryCameraGalleryData> CREATOR = new a();
    public final Uri b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryCameraGalleryData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryCameraGalleryData a(Serializer serializer) {
            return new StoryCameraGalleryData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryCameraGalleryData[i];
        }
    }

    public StoryCameraGalleryData(Uri uri, boolean z, boolean z2, boolean z3) {
        this.b = uri;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.toString());
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ StoryCameraGalleryData(Uri uri, boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this(uri, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    public StoryCameraGalleryData(Serializer serializer) {
        this(Uri.parse(serializer.H()), serializer.m(), serializer.m(), serializer.m());
    }
}
