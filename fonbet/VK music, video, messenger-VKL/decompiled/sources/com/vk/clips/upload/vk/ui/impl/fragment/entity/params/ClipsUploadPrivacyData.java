package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.posting.PostingVisibilityMode;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ClipsUploadPrivacyData.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadPrivacyData implements Parcelable {
    public final PostingVisibilityMode b;
    public final String c;
    public final String d;
    public static final a e = new a();
    public static final Parcelable.Creator<ClipsUploadPrivacyData> CREATOR = new b();
    private static final ClipsUploadPrivacyData STUB = new ClipsUploadPrivacyData(PostingVisibilityMode.ALL, "all", "all");

    /* compiled from: ClipsUploadPrivacyData.kt */
    public static final class a {
        public final ClipsUploadPrivacyData getSTUB() {
            return ClipsUploadPrivacyData.STUB;
        }
    }

    /* compiled from: ClipsUploadPrivacyData.kt */
    public static final class b implements Parcelable.Creator<ClipsUploadPrivacyData> {
        @Override // android.os.Parcelable.Creator
        public final ClipsUploadPrivacyData createFromParcel(Parcel parcel) {
            return new ClipsUploadPrivacyData(PostingVisibilityMode.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsUploadPrivacyData[] newArray(int i) {
            return new ClipsUploadPrivacyData[i];
        }
    }

    public ClipsUploadPrivacyData(PostingVisibilityMode postingVisibilityMode, String str, String str2) {
        this.b = postingVisibilityMode;
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
        if (!(obj instanceof ClipsUploadPrivacyData)) {
            return false;
        }
        ClipsUploadPrivacyData clipsUploadPrivacyData = (ClipsUploadPrivacyData) obj;
        return this.b == clipsUploadPrivacyData.b && epx.f(this.c, clipsUploadPrivacyData.c) && epx.f(this.d, clipsUploadPrivacyData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadPrivacyData(privacy=");
        sb.append(this.b);
        sb.append(", settingApiValue=");
        sb.append(this.c);
        sb.append(", descriptionString=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
