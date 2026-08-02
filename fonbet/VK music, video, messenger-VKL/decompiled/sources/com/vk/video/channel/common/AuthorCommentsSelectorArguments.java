package com.vk.video.channel.common;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoChannelLauncher.kt */
/* loaded from: classes5.dex */
public final class AuthorCommentsSelectorArguments implements Parcelable {
    public static final Parcelable.Creator<AuthorCommentsSelectorArguments> CREATOR = new a();
    public final String b;

    /* compiled from: VideoChannelLauncher.kt */
    public static final class a implements Parcelable.Creator<AuthorCommentsSelectorArguments> {
        @Override // android.os.Parcelable.Creator
        public final AuthorCommentsSelectorArguments createFromParcel(Parcel parcel) {
            return new AuthorCommentsSelectorArguments(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorCommentsSelectorArguments[] newArray(int i) {
            return new AuthorCommentsSelectorArguments[i];
        }
    }

    public AuthorCommentsSelectorArguments(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorCommentsSelectorArguments) && epx.f(this.b, ((AuthorCommentsSelectorArguments) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AuthorCommentsSelectorArguments(videoId="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
