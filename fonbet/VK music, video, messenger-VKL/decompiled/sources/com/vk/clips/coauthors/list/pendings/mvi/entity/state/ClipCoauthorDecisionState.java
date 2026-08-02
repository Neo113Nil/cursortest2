package com.vk.clips.coauthors.list.pendings.mvi.entity.state;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.lm50;

/* compiled from: ClipCoauthorDecisionState.kt */
/* loaded from: classes16.dex */
public final class ClipCoauthorDecisionState implements lm50, Parcelable {
    public static final Parcelable.Creator<ClipCoauthorDecisionState> CREATOR = new a();
    public final List<ClipCoauthorPendingItem> b;
    public final ClipCoauthorsDecisionLaunchType c;

    /* compiled from: ClipCoauthorDecisionState.kt */
    public static final class a implements Parcelable.Creator<ClipCoauthorDecisionState> {
        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorDecisionState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ClipCoauthorPendingItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClipCoauthorDecisionState(arrayList, (ClipCoauthorsDecisionLaunchType) parcel.readParcelable(ClipCoauthorDecisionState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorDecisionState[] newArray(int i) {
            return new ClipCoauthorDecisionState[i];
        }
    }

    public ClipCoauthorDecisionState(List<ClipCoauthorPendingItem> list, ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType) {
        this.b = list;
        this.c = clipCoauthorsDecisionLaunchType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipCoauthorDecisionState)) {
            return false;
        }
        ClipCoauthorDecisionState clipCoauthorDecisionState = (ClipCoauthorDecisionState) obj;
        return epx.f(this.b, clipCoauthorDecisionState.b) && epx.f(this.c, clipCoauthorDecisionState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ClipCoauthorDecisionState(owners=" + this.b + ", launchType=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((ClipCoauthorPendingItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.c, i);
    }
}
