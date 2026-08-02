package com.vk.feed.core.models.info;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: InfoButton.kt */
/* loaded from: classes18.dex */
public final class InfoButton implements Serializer.StreamParcelable {
    public static final Serializer.c<InfoButton> CREATOR = new a();
    public final String b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InfoButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InfoButton a(Serializer serializer) {
            return new InfoButton(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InfoButton[i];
        }
    }

    public InfoButton(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InfoButton) && epx.f(this.b, ((InfoButton) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("InfoButton(text="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
