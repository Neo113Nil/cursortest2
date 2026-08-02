package com.vk.profile.community.details.links.feature;

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
import xsna.ms9;
import xsna.zcl;

/* compiled from: CommunityProfileLinksArgs.kt */
/* loaded from: classes5.dex */
public final class CommunityProfileLinksArgs implements Parcelable {
    public static final Parcelable.Creator<CommunityProfileLinksArgs> CREATOR = new a();
    public final List<LinkItemModel> b;

    /* compiled from: CommunityProfileLinksArgs.kt */
    public static final class a implements Parcelable.Creator<CommunityProfileLinksArgs> {
        @Override // android.os.Parcelable.Creator
        public final CommunityProfileLinksArgs createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(CommunityProfileLinksArgs.class, parcel, arrayList, i, 1);
            }
            return new CommunityProfileLinksArgs(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CommunityProfileLinksArgs[] newArray(int i) {
            return new CommunityProfileLinksArgs[i];
        }
    }

    public CommunityProfileLinksArgs() {
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
        return (obj instanceof CommunityProfileLinksArgs) && epx.f(this.b, ((CommunityProfileLinksArgs) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CommunityProfileLinksArgs(links="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }

    public CommunityProfileLinksArgs(List<LinkItemModel> list) {
        this.b = list;
    }

    public CommunityProfileLinksArgs(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list);
    }
}
