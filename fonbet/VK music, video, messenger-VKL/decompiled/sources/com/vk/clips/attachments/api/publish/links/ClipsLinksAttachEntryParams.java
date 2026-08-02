package com.vk.clips.attachments.api.publish.links;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ClipsLinksAttachEntryParams.kt */
/* loaded from: classes16.dex */
public final class ClipsLinksAttachEntryParams implements Parcelable {
    public static final Parcelable.Creator<ClipsLinksAttachEntryParams> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: ClipsLinksAttachEntryParams.kt */
    public static final class a implements Parcelable.Creator<ClipsLinksAttachEntryParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsLinksAttachEntryParams createFromParcel(Parcel parcel) {
            return new ClipsLinksAttachEntryParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsLinksAttachEntryParams[] newArray(int i) {
            return new ClipsLinksAttachEntryParams[i];
        }
    }

    public ClipsLinksAttachEntryParams(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsLinksAttachEntryParams)) {
            return false;
        }
        ClipsLinksAttachEntryParams clipsLinksAttachEntryParams = (ClipsLinksAttachEntryParams) obj;
        return epx.f(this.b, clipsLinksAttachEntryParams.b) && epx.f(this.c, clipsLinksAttachEntryParams.c) && epx.f(this.d, clipsLinksAttachEntryParams.d) && epx.f(this.e, clipsLinksAttachEntryParams.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsLinksAttachEntryParams(currentLinkName=");
        sb.append(this.b);
        sb.append(", currentLink=");
        sb.append(this.c);
        sb.append(", fragmentResultBundleKey=");
        sb.append(this.d);
        sb.append(", fragmentResultRequestKey=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
