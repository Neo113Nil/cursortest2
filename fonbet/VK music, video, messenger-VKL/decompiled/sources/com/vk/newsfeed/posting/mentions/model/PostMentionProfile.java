package com.vk.newsfeed.posting.mentions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: PostMentionProfile.kt */
/* loaded from: classes4.dex */
public final class PostMentionProfile implements Parcelable {
    public static final Parcelable.Creator<PostMentionProfile> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: PostMentionProfile.kt */
    public static final class a implements Parcelable.Creator<PostMentionProfile> {
        @Override // android.os.Parcelable.Creator
        public final PostMentionProfile createFromParcel(Parcel parcel) {
            return new PostMentionProfile((UserId) parcel.readParcelable(PostMentionProfile.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostMentionProfile[] newArray(int i) {
            return new PostMentionProfile[i];
        }
    }

    public PostMentionProfile(UserId userId, String str, String str2, String str3, String str4) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostMentionProfile)) {
            return false;
        }
        PostMentionProfile postMentionProfile = (PostMentionProfile) obj;
        return epx.f(this.b, postMentionProfile.b) && epx.f(this.c, postMentionProfile.c) && epx.f(this.d, postMentionProfile.d) && epx.f(this.e, postMentionProfile.e) && epx.f(this.f, postMentionProfile.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostMentionProfile(id=");
        sb.append(this.b);
        sb.append(", fullName=");
        sb.append(this.c);
        sb.append(", mentionName=");
        sb.append(this.d);
        sb.append(", avatarUri=");
        sb.append(this.e);
        sb.append(", domain=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
