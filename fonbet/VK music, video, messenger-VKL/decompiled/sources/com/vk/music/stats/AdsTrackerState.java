package com.vk.music.stats;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.zcl;

/* compiled from: AdsTrackerState.kt */
/* loaded from: classes3.dex */
public final class AdsTrackerState implements Serializer.StreamParcelable {
    public static final Serializer.c<AdsTrackerState> CREATOR = new a();
    public boolean b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AdsTrackerState> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AdsTrackerState a(Serializer serializer) {
            return new AdsTrackerState(serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdsTrackerState[i];
        }
    }

    public AdsTrackerState() {
        this(false, 1, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdsTrackerState) && this.b == ((AdsTrackerState) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return q0.a(new StringBuilder("AdsTrackerState(resumed="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public AdsTrackerState(boolean z) {
        this.b = z;
    }

    public /* synthetic */ AdsTrackerState(boolean z, int i, zcl zclVar) {
        this((i & 1) != 0 ? true : z);
    }
}
