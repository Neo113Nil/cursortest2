package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.sn;

/* compiled from: SdkDuetMeta.kt */
/* loaded from: classes17.dex */
public final class SdkDuetMeta implements Parcelable {
    public static final Parcelable.Creator<SdkDuetMeta> CREATOR = new a();
    public final Boolean b;
    public final Boolean c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: SdkDuetMeta.kt */
    public static final class a implements Parcelable.Creator<SdkDuetMeta> {
        @Override // android.os.Parcelable.Creator
        public final SdkDuetMeta createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SdkDuetMeta(valueOf, bool, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkDuetMeta[] newArray(int i) {
            return new SdkDuetMeta[i];
        }
    }

    public SdkDuetMeta(Boolean bool, Boolean bool2, String str, String str2, String str3) {
        this.b = bool;
        this.c = bool2;
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
        if (!(obj instanceof SdkDuetMeta)) {
            return false;
        }
        SdkDuetMeta sdkDuetMeta = (SdkDuetMeta) obj;
        return epx.f(this.b, sdkDuetMeta.b) && epx.f(this.c, sdkDuetMeta.c) && epx.f(this.d, sdkDuetMeta.d) && epx.f(this.e, sdkDuetMeta.e) && epx.f(this.f, sdkDuetMeta.f);
    }

    public final int hashCode() {
        Boolean bool = this.b;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.c;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkDuetMeta(canMakeDuet=");
        sb.append(this.b);
        sb.append(", showDuetTooltip=");
        sb.append(this.c);
        sb.append(", duetOwnerId=");
        sb.append(this.d);
        sb.append(", duetVideoId=");
        sb.append(this.e);
        sb.append(", duetOriginAuthorFullNameIns=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
