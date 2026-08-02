package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ThemedColor;

/* compiled from: Icon.kt */
/* loaded from: classes18.dex */
public final class Icon implements Serializer.StreamParcelable {
    public static final Serializer.c<Icon> CREATOR = new a();
    public final String b;
    public final Image c;
    public final String d;
    public final ThemedColor e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Icon> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Icon a(Serializer serializer) {
            return new Icon(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), serializer.H(), (ThemedColor) serializer.G(ThemedColor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Icon[i];
        }
    }

    public Icon(String str, Image image, String str2, ThemedColor themedColor) {
        this.b = str;
        this.c = image;
        this.d = str2;
        this.e = themedColor;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
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
