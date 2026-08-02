package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: Animation.kt */
/* loaded from: classes18.dex */
public final class Animation implements Serializer.StreamParcelable {
    public static final Serializer.c<Animation> CREATOR = new a();
    public final String b;
    public final float c;
    public final float d;
    public final int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Animation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Animation a(Serializer serializer) {
            return new Animation(serializer.H(), serializer.s(), serializer.s(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Animation[i];
        }
    }

    public Animation(String str, float f, float f2, int i) {
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.P(this.c);
        serializer.P(this.d);
        serializer.S(this.e);
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
