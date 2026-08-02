package com.vk.ecomm.market.good.linkedcontent.mvi2;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.lm50;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: MarketLinkedContentState.kt */
/* loaded from: classes18.dex */
public final class MarketLinkedContentState implements lm50, Parcelable {
    public static final Parcelable.Creator<MarketLinkedContentState> CREATOR = new a();
    public final long b;
    public final UserId c;
    public final boolean d;
    public final boolean e;
    public final Throwable f;
    public final List<MediaContentItem> g;
    public final List<MediaContentItem> h;
    public final int i;
    public final boolean j;
    public final LinkedContentAnalyticsParams k;

    /* compiled from: MarketLinkedContentState.kt */
    public static final class a implements Parcelable.Creator<MarketLinkedContentState> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final MarketLinkedContentState createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            long readLong = parcel.readLong();
            UserId userId = (UserId) parcel.readParcelable(MarketLinkedContentState.class.getClassLoader());
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            Throwable th = (Throwable) parcel.readSerializable();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = i;
                while (i2 != readInt) {
                    i2 = en.a(MediaContentItem.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = i;
                while (i3 != readInt2) {
                    i3 = en.a(MediaContentItem.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            return new MarketLinkedContentState(readLong, userId, z2, z, th, arrayList, arrayList2, parcel.readInt(), parcel.readInt() == 0 ? i : 1, (LinkedContentAnalyticsParams) parcel.readParcelable(MarketLinkedContentState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketLinkedContentState[] newArray(int i) {
            return new MarketLinkedContentState[i];
        }
    }

    public MarketLinkedContentState() {
        this(0L, null, false, false, null, null, null, 0, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public static MarketLinkedContentState a(MarketLinkedContentState marketLinkedContentState, long j, UserId userId, boolean z, Throwable th, List list, List list2, int i, int i2) {
        long j2 = (i2 & 1) != 0 ? marketLinkedContentState.b : j;
        UserId userId2 = (i2 & 2) != 0 ? marketLinkedContentState.c : userId;
        boolean z2 = (i2 & 4) != 0 ? marketLinkedContentState.d : z;
        boolean z3 = (i2 & 8) != 0 ? marketLinkedContentState.e : false;
        Throwable th2 = (i2 & 16) != 0 ? marketLinkedContentState.f : th;
        List list3 = (i2 & 32) != 0 ? marketLinkedContentState.g : list;
        List list4 = (i2 & 64) != 0 ? marketLinkedContentState.h : list2;
        int i3 = (i2 & 128) != 0 ? marketLinkedContentState.i : i;
        boolean z4 = (i2 & 256) != 0 ? marketLinkedContentState.j : false;
        LinkedContentAnalyticsParams linkedContentAnalyticsParams = (i2 & 512) != 0 ? marketLinkedContentState.k : null;
        marketLinkedContentState.getClass();
        return new MarketLinkedContentState(j2, userId2, z2, z3, th2, list3, list4, i3, z4, linkedContentAnalyticsParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketLinkedContentState)) {
            return false;
        }
        MarketLinkedContentState marketLinkedContentState = (MarketLinkedContentState) obj;
        return this.b == marketLinkedContentState.b && epx.f(this.c, marketLinkedContentState.c) && this.d == marketLinkedContentState.d && this.e == marketLinkedContentState.e && epx.f(this.f, marketLinkedContentState.f) && epx.f(this.g, marketLinkedContentState.g) && epx.f(this.h, marketLinkedContentState.h) && this.i == marketLinkedContentState.i && this.j == marketLinkedContentState.j && epx.f(this.k, marketLinkedContentState.k);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(bh10.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e);
        Throwable th = this.f;
        int hashCode = (b + (th == null ? 0 : th.hashCode())) * 31;
        List<MediaContentItem> list = this.g;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MediaContentItem> list2 = this.h;
        int b2 = qoy.b(shy.a(this.i, (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31), 31, this.j);
        LinkedContentAnalyticsParams linkedContentAnalyticsParams = this.k;
        return b2 + (linkedContentAnalyticsParams != null ? linkedContentAnalyticsParams.hashCode() : 0);
    }

    public final String toString() {
        return "MarketLinkedContentState(itemId=" + this.b + ", ownerId=" + this.c + ", isLoading=" + this.d + ", isRefreshing=" + this.e + ", error=" + this.f + ", items=" + this.g + ", trackedItems=" + this.h + ", totalCount=" + this.i + ", isService=" + this.j + ", analyticsParams=" + this.k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeSerializable(this.f);
        List<MediaContentItem> list = this.g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MediaContentItem) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MediaContentItem> list2 = this.h;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MediaContentItem) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeParcelable(this.k, i);
    }

    public MarketLinkedContentState(long j, UserId userId, boolean z, boolean z2, Throwable th, List<MediaContentItem> list, List<MediaContentItem> list2, int i, boolean z3, LinkedContentAnalyticsParams linkedContentAnalyticsParams) {
        this.b = j;
        this.c = userId;
        this.d = z;
        this.e = z2;
        this.f = th;
        this.g = list;
        this.h = list2;
        this.i = i;
        this.j = z3;
        this.k = linkedContentAnalyticsParams;
    }

    public /* synthetic */ MarketLinkedContentState(long j, UserId userId, boolean z, boolean z2, Throwable th, List list, List list2, int i, boolean z3, LinkedContentAnalyticsParams linkedContentAnalyticsParams, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? UserId.d : userId, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : th, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? null : linkedContentAnalyticsParams);
    }
}
