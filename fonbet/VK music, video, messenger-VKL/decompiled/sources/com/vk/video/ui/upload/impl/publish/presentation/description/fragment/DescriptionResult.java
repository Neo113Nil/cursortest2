package com.vk.video.ui.upload.impl.publish.presentation.description.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: DescriptionArguments.kt */
/* loaded from: classes7.dex */
public final class DescriptionResult implements Parcelable {
    public static final Parcelable.Creator<DescriptionResult> CREATOR = new a();
    public final String b;

    /* compiled from: DescriptionArguments.kt */
    public static final class a implements Parcelable.Creator<DescriptionResult> {
        @Override // android.os.Parcelable.Creator
        public final DescriptionResult createFromParcel(Parcel parcel) {
            return new DescriptionResult(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DescriptionResult[] newArray(int i) {
            return new DescriptionResult[i];
        }
    }

    public DescriptionResult(String str) {
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
        return (obj instanceof DescriptionResult) && epx.f(this.b, ((DescriptionResult) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("DescriptionResult(description="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
