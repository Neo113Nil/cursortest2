package com.vk.feed.core.models.header;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import java.util.List;
import xsna.j5g;

/* compiled from: SourcePhoto.kt */
/* loaded from: classes18.dex */
public final class SourcePhoto implements Serializer.StreamParcelable {
    public static final Serializer.c<SourcePhoto> CREATOR = new a();
    public final List<Owner> b;
    public final Image c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SourcePhoto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SourcePhoto a(Serializer serializer) {
            return new SourcePhoto(serializer.j(Owner.CREATOR), (Image) serializer.G(Image.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SourcePhoto[i];
        }
    }

    public SourcePhoto(List<Owner> list, Image image, String str) {
        this.b = list;
        this.c = image;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    public final Owner d() {
        List<Owner> list = this.b;
        if (list != null) {
            return (Owner) j5g.a0(list);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Owner> e() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
