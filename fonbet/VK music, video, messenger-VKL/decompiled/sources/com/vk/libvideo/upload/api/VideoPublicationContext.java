package com.vk.libvideo.upload.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.zcl;

/* compiled from: VideoPublicationContext.kt */
/* loaded from: classes3.dex */
public final class VideoPublicationContext implements Parcelable {
    public static final Parcelable.Creator<VideoPublicationContext> CREATOR = new a();
    public final String b;
    public final UserId c;

    /* compiled from: VideoPublicationContext.kt */
    public static final class a implements Parcelable.Creator<VideoPublicationContext> {
        @Override // android.os.Parcelable.Creator
        public final VideoPublicationContext createFromParcel(Parcel parcel) {
            return new VideoPublicationContext(parcel.readString(), (UserId) parcel.readParcelable(VideoPublicationContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPublicationContext[] newArray(int i) {
            return new VideoPublicationContext[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoPublicationContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPublicationContext)) {
            return false;
        }
        VideoPublicationContext videoPublicationContext = (VideoPublicationContext) obj;
        return epx.f(this.b, videoPublicationContext.b) && epx.f(this.c, videoPublicationContext.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Long.hashCode(this.c.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final UserId q() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPublicationContext(entryPoint=");
        sb.append(this.b);
        sb.append(", ownerId=");
        return gp.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public VideoPublicationContext(String str, UserId userId) {
        this.b = str;
        this.c = userId;
    }

    public /* synthetic */ VideoPublicationContext(String str, UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? UserId.d : userId);
    }
}
