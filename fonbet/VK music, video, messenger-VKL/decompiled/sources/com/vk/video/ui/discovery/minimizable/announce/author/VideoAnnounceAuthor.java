package com.vk.video.ui.discovery.minimizable.announce.author;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.shy;

/* compiled from: VideoAnnounceAuthor.kt */
/* loaded from: classes7.dex */
public final class VideoAnnounceAuthor implements Parcelable {
    public static final Parcelable.Creator<VideoAnnounceAuthor> CREATOR = new a();
    public final CharSequence b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final Uri f;
    public final boolean g;

    /* compiled from: VideoAnnounceAuthor.kt */
    public static final class a implements Parcelable.Creator<VideoAnnounceAuthor> {
        @Override // android.os.Parcelable.Creator
        public final VideoAnnounceAuthor createFromParcel(Parcel parcel) {
            boolean z;
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            Uri uri = (Uri) parcel.readParcelable(VideoAnnounceAuthor.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new VideoAnnounceAuthor(charSequence, readInt, z3, z2, uri, z);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAnnounceAuthor[] newArray(int i) {
            return new VideoAnnounceAuthor[i];
        }
    }

    public VideoAnnounceAuthor(CharSequence charSequence, int i, boolean z, boolean z2, Uri uri, boolean z3) {
        this.b = charSequence;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = uri;
        this.g = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAnnounceAuthor)) {
            return false;
        }
        VideoAnnounceAuthor videoAnnounceAuthor = (VideoAnnounceAuthor) obj;
        return epx.f(this.b, videoAnnounceAuthor.b) && this.c == videoAnnounceAuthor.c && this.d == videoAnnounceAuthor.d && this.e == videoAnnounceAuthor.e && epx.f(this.f, videoAnnounceAuthor.f) && this.g == videoAnnounceAuthor.g;
    }

    public final int hashCode() {
        CharSequence charSequence = this.b;
        int b = qoy.b(qoy.b(shy.a(this.c, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31), 31, this.d), 31, this.e);
        Uri uri = this.f;
        return Boolean.hashCode(this.g) + ((b + (uri != null ? uri.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAnnounceAuthor(title=");
        sb.append((Object) this.b);
        sb.append(", subscribersAmount=");
        sb.append(this.c);
        sb.append(", isSubscribed=");
        sb.append(this.d);
        sb.append(", isVerified=");
        sb.append(this.e);
        sb.append(", avatarUri=");
        sb.append(this.f);
        sb.append(", isNft=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
