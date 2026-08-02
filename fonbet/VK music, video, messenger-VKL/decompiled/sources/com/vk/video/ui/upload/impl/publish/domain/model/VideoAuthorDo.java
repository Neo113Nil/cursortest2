package com.vk.video.ui.upload.impl.publish.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: VideoAuthorDo.kt */
/* loaded from: classes7.dex */
public final class VideoAuthorDo implements Parcelable {
    public static final Parcelable.Creator<VideoAuthorDo> CREATOR = new a();
    public final UserId b;
    public final boolean c;
    public final String d;
    public final String e;

    /* compiled from: VideoAuthorDo.kt */
    public static final class a implements Parcelable.Creator<VideoAuthorDo> {
        @Override // android.os.Parcelable.Creator
        public final VideoAuthorDo createFromParcel(Parcel parcel) {
            return new VideoAuthorDo((UserId) parcel.readParcelable(VideoAuthorDo.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAuthorDo[] newArray(int i) {
            return new VideoAuthorDo[i];
        }
    }

    public VideoAuthorDo(UserId userId, boolean z, String str, String str2) {
        this.b = userId;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAuthorDo)) {
            return false;
        }
        VideoAuthorDo videoAuthorDo = (VideoAuthorDo) obj;
        return epx.f(this.b, videoAuthorDo.b) && this.c == videoAuthorDo.c && epx.f(this.d, videoAuthorDo.d) && epx.f(this.e, videoAuthorDo.e);
    }

    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAuthorDo(userId=");
        sb.append(this.b);
        sb.append(", isClosed=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        sb.append(this.d);
        sb.append(", name=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
