package com.vk.feed.core.models.header;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ThemedColor;
import com.vk.feed.core.models.actions.HeaderAction;

/* compiled from: HeaderIcon.kt */
/* loaded from: classes18.dex */
public final class HeaderIcon implements Serializer.StreamParcelable {
    public static final Serializer.c<HeaderIcon> CREATOR = new a();
    public final String b;
    public final ThemedColor c;
    public final HeaderAction d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HeaderIcon> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HeaderIcon a(Serializer serializer) {
            return new HeaderIcon(serializer.H(), (ThemedColor) serializer.G(ThemedColor.class.getClassLoader()), (HeaderAction) serializer.G(HeaderAction.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HeaderIcon[i];
        }
    }

    public HeaderIcon(String str, ThemedColor themedColor, HeaderAction headerAction, String str2) {
        this.b = str;
        this.c = themedColor;
        this.d = headerAction;
        this.e = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
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
