package com.vk.attachpicker.stickers.selection.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: Sticker.kt */
/* loaded from: classes15.dex */
public final class EditorSticker implements Serializer.StreamParcelable {
    public static final Serializer.c<EditorSticker> CREATOR = new a();
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EditorSticker> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EditorSticker a(Serializer serializer) {
            return new EditorSticker(serializer.u(), serializer.u(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EditorSticker[i];
        }
    }

    public EditorSticker(int i, int i2, String str, String str2, String str3) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
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
