package com.vk.clips.coauthors.list.common.mvi.entity.state;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.qoy;
import xsna.vu5;

/* compiled from: ClipCoauthorListState.kt */
/* loaded from: classes16.dex */
public final class ClipCoauthorListState implements lm50, Parcelable {
    public static final Parcelable.Creator<ClipCoauthorListState> CREATOR = new a();
    public final String b;
    public final List<ClipCoauthorListItem> c;
    public final boolean d;
    public final int e;

    /* compiled from: ClipCoauthorListState.kt */
    public static final class a implements Parcelable.Creator<ClipCoauthorListState> {
        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorListState createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ClipCoauthorListItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClipCoauthorListState(readString, arrayList, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorListState[] newArray(int i) {
            return new ClipCoauthorListState[i];
        }
    }

    public ClipCoauthorListState(String str, List<ClipCoauthorListItem> list, boolean z, int i) {
        this.b = str;
        this.c = list;
        this.d = z;
        this.e = i;
    }

    public static ClipCoauthorListState a(ClipCoauthorListState clipCoauthorListState, ArrayList arrayList) {
        String str = clipCoauthorListState.b;
        boolean z = clipCoauthorListState.d;
        int i = clipCoauthorListState.e;
        clipCoauthorListState.getClass();
        return new ClipCoauthorListState(str, arrayList, z, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipCoauthorListState)) {
            return false;
        }
        ClipCoauthorListState clipCoauthorListState = (ClipCoauthorListState) obj;
        return epx.f(this.b, clipCoauthorListState.b) && epx.f(this.c, clipCoauthorListState.c) && this.d == clipCoauthorListState.d && this.e == clipCoauthorListState.e;
    }

    public final int hashCode() {
        String str = this.b;
        return Integer.hashCode(this.e) + qoy.b(fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCoauthorListState(onboardingText=");
        sb.append(this.b);
        sb.append(", owners=");
        sb.append(this.c);
        sb.append(", isAuthorsLaunch=");
        sb.append(this.d);
        sb.append(", clipId=");
        return vu5.b(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            ((ClipCoauthorListItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
    }
}
