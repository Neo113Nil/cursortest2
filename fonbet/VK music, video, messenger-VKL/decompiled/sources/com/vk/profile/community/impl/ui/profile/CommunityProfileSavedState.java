package com.vk.profile.community.impl.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.uqi;

/* compiled from: CommunityProfileSavedState.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileSavedState implements Parcelable {
    public static final Parcelable.Creator<CommunityProfileSavedState> CREATOR = new a();
    public final Integer b;

    /* compiled from: CommunityProfileSavedState.kt */
    public static final class a implements Parcelable.Creator<CommunityProfileSavedState> {
        @Override // android.os.Parcelable.Creator
        public final CommunityProfileSavedState createFromParcel(Parcel parcel) {
            return new CommunityProfileSavedState(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityProfileSavedState[] newArray(int i) {
            return new CommunityProfileSavedState[i];
        }
    }

    public CommunityProfileSavedState(Integer num) {
        this.b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommunityProfileSavedState) && epx.f(this.b, ((CommunityProfileSavedState) obj).b);
    }

    public final int hashCode() {
        Integer num = this.b;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("CommunityProfileSavedState(initialTabIndex="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }
}
