package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: SdkVideoRestriction.kt */
/* loaded from: classes17.dex */
public final class SdkRestrictionButton implements Parcelable {
    public static final Parcelable.Creator<SdkRestrictionButton> CREATOR = new a();
    public final String b;

    /* compiled from: SdkVideoRestriction.kt */
    public static final class a implements Parcelable.Creator<SdkRestrictionButton> {
        @Override // android.os.Parcelable.Creator
        public final SdkRestrictionButton createFromParcel(Parcel parcel) {
            return new SdkRestrictionButton(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SdkRestrictionButton[] newArray(int i) {
            return new SdkRestrictionButton[i];
        }
    }

    public SdkRestrictionButton(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SdkRestrictionButton) && epx.f(this.b, ((SdkRestrictionButton) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SdkRestrictionButton(title="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
