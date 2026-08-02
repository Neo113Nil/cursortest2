package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: EntryTitle.kt */
/* loaded from: classes18.dex */
public final class EntryTitle implements Serializer.StreamParcelable {
    public static final Serializer.c<EntryTitle> CREATOR = new a();
    public final Text b;
    public final boolean c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EntryTitle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EntryTitle a(Serializer serializer) {
            return new EntryTitle((Text) serializer.G(Text.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntryTitle[i];
        }
    }

    public EntryTitle(Text text, boolean z) {
        this.b = text;
        this.c = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
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
