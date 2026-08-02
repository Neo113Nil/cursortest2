package com.vk.clips.attachments.api.publish.geolocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.clips.ClipsVideoItemLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: ClipsGeolocationAttachEntryParams.kt */
/* loaded from: classes16.dex */
public final class ClipsGeolocationAttachEntryParams implements Parcelable {
    public static final Parcelable.Creator<ClipsGeolocationAttachEntryParams> CREATOR = new a();
    public final List<ClipsVideoItemLocation> b;
    public final String c;
    public final String d;

    /* compiled from: ClipsGeolocationAttachEntryParams.kt */
    public static final class a implements Parcelable.Creator<ClipsGeolocationAttachEntryParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsGeolocationAttachEntryParams createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ClipsGeolocationAttachEntryParams.class, parcel, arrayList, i, 1);
            }
            return new ClipsGeolocationAttachEntryParams(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsGeolocationAttachEntryParams[] newArray(int i) {
            return new ClipsGeolocationAttachEntryParams[i];
        }
    }

    public ClipsGeolocationAttachEntryParams(List<ClipsVideoItemLocation> list, String str, String str2) {
        this.b = list;
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
        if (!(obj instanceof ClipsGeolocationAttachEntryParams)) {
            return false;
        }
        ClipsGeolocationAttachEntryParams clipsGeolocationAttachEntryParams = (ClipsGeolocationAttachEntryParams) obj;
        return epx.f(this.b, clipsGeolocationAttachEntryParams.b) && epx.f(this.c, clipsGeolocationAttachEntryParams.c) && epx.f(this.d, clipsGeolocationAttachEntryParams.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGeolocationAttachEntryParams(suggestedLocations=");
        sb.append(this.b);
        sb.append(", fragmentResultBundleKey=");
        sb.append(this.c);
        sb.append(", fragmentResultRequestKey=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
