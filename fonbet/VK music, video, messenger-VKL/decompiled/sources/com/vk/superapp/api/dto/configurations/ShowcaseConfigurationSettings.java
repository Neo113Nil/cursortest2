package com.vk.superapp.api.dto.configurations;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: ShowcaseConfiguration.kt */
/* loaded from: classes6.dex */
public final class ShowcaseConfigurationSettings extends ShowcaseConfiguration implements Parcelable {
    public static final Parcelable.Creator<ShowcaseConfigurationSettings> CREATOR = new a();
    public final boolean b;

    /* compiled from: ShowcaseConfiguration.kt */
    public static final class a implements Parcelable.Creator<ShowcaseConfigurationSettings> {
        @Override // android.os.Parcelable.Creator
        public final ShowcaseConfigurationSettings createFromParcel(Parcel parcel) {
            return new ShowcaseConfigurationSettings(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ShowcaseConfigurationSettings[] newArray(int i) {
            return new ShowcaseConfigurationSettings[i];
        }
    }

    public ShowcaseConfigurationSettings(boolean z) {
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShowcaseConfigurationSettings) && this.b == ((ShowcaseConfigurationSettings) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return q0.a(new StringBuilder("ShowcaseConfigurationSettings(hasSettings="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
    }
}
