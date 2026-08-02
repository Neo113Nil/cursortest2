package com.vk.video.polls.entrypoint.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.uxpolls.UxPoll;
import defpackage.q0;
import xsna.epx;

/* compiled from: UxPollEntryPoint.kt */
/* loaded from: classes6.dex */
public final class UxPollEntryPoint implements Parcelable {
    public static final Parcelable.Creator<UxPollEntryPoint> CREATOR = new a();
    public final UxPoll b;
    public final UxPollEntryPointLocation c;
    public final boolean d;

    /* compiled from: UxPollEntryPoint.kt */
    public static final class a implements Parcelable.Creator<UxPollEntryPoint> {
        @Override // android.os.Parcelable.Creator
        public final UxPollEntryPoint createFromParcel(Parcel parcel) {
            return new UxPollEntryPoint((UxPoll) parcel.readParcelable(UxPollEntryPoint.class.getClassLoader()), UxPollEntryPointLocation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollEntryPoint[] newArray(int i) {
            return new UxPollEntryPoint[i];
        }
    }

    public UxPollEntryPoint(UxPoll uxPoll, UxPollEntryPointLocation uxPollEntryPointLocation, boolean z) {
        this.b = uxPoll;
        this.c = uxPollEntryPointLocation;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPollEntryPoint)) {
            return false;
        }
        UxPollEntryPoint uxPollEntryPoint = (UxPollEntryPoint) obj;
        return epx.f(this.b, uxPollEntryPoint.b) && this.c == uxPollEntryPoint.c && this.d == uxPollEntryPoint.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxPollEntryPoint(uxPoll=");
        sb.append(this.b);
        sb.append(", location=");
        sb.append(this.c);
        sb.append(", isInviteView=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
