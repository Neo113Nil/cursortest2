package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.feed.core.models.actions.HeaderAction;

/* compiled from: OverlayImage.kt */
/* loaded from: classes18.dex */
public final class OverlayImage implements Serializer.StreamParcelable {
    public static final Serializer.c<OverlayImage> CREATOR = new a();
    public final Image b;
    public final String c;
    public final String d;
    public final HeaderAction e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<OverlayImage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OverlayImage a(Serializer serializer) {
            return new OverlayImage((Image) serializer.G(Image.class.getClassLoader()), serializer.H(), serializer.H(), (HeaderAction) serializer.G(HeaderAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OverlayImage[i];
        }
    }

    public OverlayImage(Image image, String str, String str2, HeaderAction headerAction) {
        this.b = image;
        this.c = str;
        this.d = str2;
        this.e = headerAction;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
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
