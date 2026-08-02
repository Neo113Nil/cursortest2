package com.vk.dto.reactions;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ThemedColor;

/* compiled from: ReactionAsset.kt */
/* loaded from: classes18.dex */
public final class ReactionAsset implements Serializer.StreamParcelable {
    public static final Serializer.c<ReactionAsset> CREATOR = new a();
    public final String b;
    public final Image c;
    public final ThemedColor d;
    public final ThemedColor e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ReactionAsset> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ReactionAsset a(Serializer serializer) {
            return new ReactionAsset(serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), (ThemedColor) serializer.G(ThemedColor.class.getClassLoader()), (ThemedColor) serializer.G(ThemedColor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReactionAsset[i];
        }
    }

    public ReactionAsset(String str, Image image, ThemedColor themedColor, ThemedColor themedColor2) {
        this.b = str;
        this.c = image;
        this.d = themedColor;
        this.e = themedColor2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.i0(this.e);
    }

    public final Image d() {
        return this.c;
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
