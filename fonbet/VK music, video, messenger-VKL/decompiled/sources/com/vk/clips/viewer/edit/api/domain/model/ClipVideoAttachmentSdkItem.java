package com.vk.clips.viewer.edit.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.urd0;

/* compiled from: ClipVideoAttachmentSdkItem.kt */
/* loaded from: classes17.dex */
public final class ClipVideoAttachmentSdkItem implements Parcelable {
    public static final Parcelable.Creator<ClipVideoAttachmentSdkItem> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;

    /* compiled from: ClipVideoAttachmentSdkItem.kt */
    public static final class a implements Parcelable.Creator<ClipVideoAttachmentSdkItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipVideoAttachmentSdkItem createFromParcel(Parcel parcel) {
            return new ClipVideoAttachmentSdkItem((UserId) parcel.readParcelable(ClipVideoAttachmentSdkItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipVideoAttachmentSdkItem[] newArray(int i) {
            return new ClipVideoAttachmentSdkItem[i];
        }
    }

    public ClipVideoAttachmentSdkItem(UserId userId, String str, String str2, String str3, Integer num) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipVideoAttachmentSdkItem)) {
            return false;
        }
        ClipVideoAttachmentSdkItem clipVideoAttachmentSdkItem = (ClipVideoAttachmentSdkItem) obj;
        return epx.f(this.b, clipVideoAttachmentSdkItem.b) && epx.f(this.c, clipVideoAttachmentSdkItem.c) && epx.f(this.d, clipVideoAttachmentSdkItem.d) && epx.f(this.e, clipVideoAttachmentSdkItem.e) && epx.f(this.f, clipVideoAttachmentSdkItem.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipVideoAttachmentSdkItem(ownerId=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", imageUri=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", albumId=");
        return uqi.b(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
