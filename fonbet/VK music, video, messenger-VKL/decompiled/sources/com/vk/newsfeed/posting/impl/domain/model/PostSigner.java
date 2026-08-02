package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;

/* compiled from: PostingContext.kt */
/* loaded from: classes4.dex */
public final class PostSigner implements Parcelable {
    public static final Parcelable.Creator<PostSigner> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;

    /* compiled from: PostingContext.kt */
    public static final class a implements Parcelable.Creator<PostSigner> {
        @Override // android.os.Parcelable.Creator
        public final PostSigner createFromParcel(Parcel parcel) {
            return new PostSigner((UserId) parcel.readParcelable(PostSigner.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostSigner[] newArray(int i) {
            return new PostSigner[i];
        }
    }

    public PostSigner(UserId userId, String str, String str2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostSigner)) {
            return false;
        }
        PostSigner postSigner = (PostSigner) obj;
        return epx.f(this.b, postSigner.b) && epx.f(this.c, postSigner.c) && epx.f(this.d, postSigner.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostSigner(userId=");
        sb.append(this.b);
        sb.append(", firstNameGen=");
        sb.append(this.c);
        sb.append(", lastNameGen=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
