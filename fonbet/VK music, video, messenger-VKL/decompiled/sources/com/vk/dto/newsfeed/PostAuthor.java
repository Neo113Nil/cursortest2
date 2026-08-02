package com.vk.dto.newsfeed;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;

/* compiled from: PostAuthor.kt */
/* loaded from: classes18.dex */
public final class PostAuthor implements Serializer.StreamParcelable {
    public static final Serializer.c<PostAuthor> CREATOR = new b();
    public final UserId b;
    public final Image c;
    public final String d;

    /* compiled from: PostAuthor.kt */
    public static final class a {
        public static PostAuthor a(Owner owner) {
            return new PostAuthor(owner.b, owner.g, owner.e);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PostAuthor> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostAuthor a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            if (userId == null) {
                userId = UserId.d;
            }
            return new PostAuthor(userId, (Image) serializer.G(Image.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostAuthor[i];
        }
    }

    public PostAuthor(UserId userId, Image image, String str) {
        this.b = userId;
        this.c = image;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    public final String a(int i) {
        ImageSize Cb;
        String str;
        Image image = this.c;
        return (image == null || (Cb = image.Cb(i, true, false)) == null || (str = Cb.d.d) == null) ? this.d : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostAuthor)) {
            return false;
        }
        PostAuthor postAuthor = (PostAuthor) obj;
        return epx.f(this.b, postAuthor.b) && epx.f(this.c, postAuthor.c) && epx.f(this.d, postAuthor.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        Image image = this.c;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostAuthor(id=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", photoUrl=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
