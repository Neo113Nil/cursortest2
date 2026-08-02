package com.vk.dto.profile;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: Occupation.kt */
/* loaded from: classes18.dex */
public final class Occupation implements Serializer.StreamParcelable {
    public static final Serializer.c<Occupation> CREATOR = new a();
    public final String b;
    public final long c;
    public final String d;
    public final Long e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Occupation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Occupation a(Serializer serializer) {
            return new Occupation(serializer.H(), serializer.w(), serializer.H(), serializer.x());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Occupation[i];
        }
    }

    public Occupation(String str, long j, String str2, Long l) {
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = l;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.Y(this.c);
        serializer.j0(this.d);
        serializer.b0(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
