package com.vk.superapp.api.dto.configurations;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: ShowcaseConfiguration.kt */
/* loaded from: classes6.dex */
public final class ShowcaseConfigurationExtra extends ShowcaseConfiguration implements Parcelable {
    public static final Parcelable.Creator<ShowcaseConfigurationExtra> CREATOR = new a();
    public final String b;

    /* compiled from: ShowcaseConfiguration.kt */
    public static final class a implements Parcelable.Creator<ShowcaseConfigurationExtra> {
        @Override // android.os.Parcelable.Creator
        public final ShowcaseConfigurationExtra createFromParcel(Parcel parcel) {
            return new ShowcaseConfigurationExtra(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShowcaseConfigurationExtra[] newArray(int i) {
            return new ShowcaseConfigurationExtra[i];
        }
    }

    public ShowcaseConfigurationExtra(String str) {
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
        return (obj instanceof ShowcaseConfigurationExtra) && epx.f(this.b, ((ShowcaseConfigurationExtra) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ShowcaseConfigurationExtra(value="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
