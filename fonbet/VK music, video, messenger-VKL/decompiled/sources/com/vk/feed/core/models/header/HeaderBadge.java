package com.vk.feed.core.models.header;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ThemedColor;
import com.vk.feed.core.models.Text;

/* compiled from: HeaderBadge.kt */
/* loaded from: classes18.dex */
public final class HeaderBadge implements Serializer.StreamParcelable {
    public static final Serializer.c<HeaderBadge> CREATOR = new a();
    public final Text b;
    public final ThemedColor c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HeaderBadge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HeaderBadge a(Serializer serializer) {
            return new HeaderBadge((Text) serializer.G(Text.class.getClassLoader()), (ThemedColor) serializer.G(ThemedColor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HeaderBadge[i];
        }
    }

    public HeaderBadge(Text text, ThemedColor themedColor) {
        this.b = text;
        this.c = themedColor;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
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
