package com.vk.music.screens.about.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.profile.community.details.api.di.links.data.LinkItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.lm50;
import xsna.ms9;
import xsna.zcl;

/* compiled from: CommunityProfileLinksState.kt */
/* loaded from: classes3.dex */
public final class CommunityProfileLinksState implements lm50, Parcelable {
    public static final Parcelable.Creator<CommunityProfileLinksState> CREATOR = new a();
    public final List<LinkItemModel> b;

    /* compiled from: CommunityProfileLinksState.kt */
    public static final class a implements Parcelable.Creator<CommunityProfileLinksState> {
        @Override // android.os.Parcelable.Creator
        public final CommunityProfileLinksState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(CommunityProfileLinksState.class, parcel, arrayList, i, 1);
            }
            return new CommunityProfileLinksState(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityProfileLinksState[] newArray(int i) {
            return new CommunityProfileLinksState[i];
        }
    }

    public CommunityProfileLinksState() {
        this(null, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommunityProfileLinksState) && epx.f(this.b, ((CommunityProfileLinksState) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CommunityProfileLinksState(links="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }

    public CommunityProfileLinksState(List<LinkItemModel> list) {
        this.b = list;
    }

    public CommunityProfileLinksState(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list);
    }
}
