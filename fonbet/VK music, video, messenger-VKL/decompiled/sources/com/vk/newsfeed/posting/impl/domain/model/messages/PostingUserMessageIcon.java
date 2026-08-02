package com.vk.newsfeed.posting.impl.domain.model.messages;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.vu5;

/* compiled from: PostingUserMessageIcon.kt */
/* loaded from: classes4.dex */
public final class PostingUserMessageIcon implements Parcelable {
    public static final Parcelable.Creator<PostingUserMessageIcon> CREATOR = new a();
    public final int b;
    public final int c;

    /* compiled from: PostingUserMessageIcon.kt */
    public static final class a implements Parcelable.Creator<PostingUserMessageIcon> {
        @Override // android.os.Parcelable.Creator
        public final PostingUserMessageIcon createFromParcel(Parcel parcel) {
            return new PostingUserMessageIcon(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingUserMessageIcon[] newArray(int i) {
            return new PostingUserMessageIcon[i];
        }
    }

    public PostingUserMessageIcon(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingUserMessageIcon)) {
            return false;
        }
        PostingUserMessageIcon postingUserMessageIcon = (PostingUserMessageIcon) obj;
        return this.b == postingUserMessageIcon.b && this.c == postingUserMessageIcon.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingUserMessageIcon(id=");
        sb.append(this.b);
        sb.append(", tintRes=");
        return vu5.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
