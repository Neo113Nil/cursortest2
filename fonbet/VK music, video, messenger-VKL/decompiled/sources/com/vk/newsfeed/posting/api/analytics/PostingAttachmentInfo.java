package com.vk.newsfeed.posting.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: PostingAttachmentInfo.kt */
/* loaded from: classes4.dex */
public final class PostingAttachmentInfo implements Parcelable {
    public static final Parcelable.Creator<PostingAttachmentInfo> CREATOR = new a();
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: PostingAttachmentInfo.kt */
    public static final class a implements Parcelable.Creator<PostingAttachmentInfo> {
        @Override // android.os.Parcelable.Creator
        public final PostingAttachmentInfo createFromParcel(Parcel parcel) {
            return new PostingAttachmentInfo(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAttachmentInfo[] newArray(int i) {
            return new PostingAttachmentInfo[i];
        }
    }

    public PostingAttachmentInfo(long j, long j2, String str, String str2, String str3) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingAttachmentInfo)) {
            return false;
        }
        PostingAttachmentInfo postingAttachmentInfo = (PostingAttachmentInfo) obj;
        return this.b == postingAttachmentInfo.b && this.c == postingAttachmentInfo.c && epx.f(this.d, postingAttachmentInfo.d) && epx.f(this.e, postingAttachmentInfo.e) && epx.f(this.f, postingAttachmentInfo.f);
    }

    public final int hashCode() {
        int a2 = bh10.a(Long.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingAttachmentInfo(attachmentOwnerId=");
        sb.append(this.b);
        sb.append(", attachmentItemId=");
        sb.append(this.c);
        sb.append(", attachmentsStringValue=");
        sb.append(this.d);
        sb.append(", ticketEventId=");
        sb.append(this.e);
        sb.append(", ticketSeanceId=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public /* synthetic */ PostingAttachmentInfo(long j, long j2, String str, String str2, String str3, int i, zcl zclVar) {
        this(j, j2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
