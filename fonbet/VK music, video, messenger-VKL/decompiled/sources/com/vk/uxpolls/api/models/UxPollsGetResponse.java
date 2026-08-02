package com.vk.uxpolls.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UxPollsModels.kt */
/* loaded from: classes6.dex */
public final class UxPollsGetResponse implements Parcelable {
    public static final Parcelable.Creator<UxPollsGetResponse> CREATOR = new a();

    @pmi0("config")
    private final UxPollsConfig config;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UxPollsPoll> items;

    /* compiled from: UxPollsModels.kt */
    public static final class a implements Parcelable.Creator<UxPollsGetResponse> {
        @Override // android.os.Parcelable.Creator
        public final UxPollsGetResponse createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(UxPollsPoll.CREATOR, parcel, arrayList, i, 1);
            }
            return new UxPollsGetResponse(readInt, arrayList, parcel.readInt() == 0 ? null : UxPollsConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollsGetResponse[] newArray(int i) {
            return new UxPollsGetResponse[i];
        }
    }

    public UxPollsGetResponse() {
        this(0, null, null, 7, null);
    }

    public final UxPollsConfig d() {
        return this.config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UxPollsPoll> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPollsGetResponse)) {
            return false;
        }
        UxPollsGetResponse uxPollsGetResponse = (UxPollsGetResponse) obj;
        return this.count == uxPollsGetResponse.count && epx.f(this.items, uxPollsGetResponse.items) && epx.f(this.config, uxPollsGetResponse.config);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        UxPollsConfig uxPollsConfig = this.config;
        return a2 + (uxPollsConfig == null ? 0 : uxPollsConfig.hashCode());
    }

    public final String toString() {
        return "UxPollsGetResponse(count=" + this.count + ", items=" + this.items + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((UxPollsPoll) a2.next()).writeToParcel(parcel, i);
        }
        UxPollsConfig uxPollsConfig = this.config;
        if (uxPollsConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uxPollsConfig.writeToParcel(parcel, i);
        }
    }

    public UxPollsGetResponse(int i, List<UxPollsPoll> list, UxPollsConfig uxPollsConfig) {
        this.count = i;
        this.items = list;
        this.config = uxPollsConfig;
    }

    public UxPollsGetResponse(int i, List list, UxPollsConfig uxPollsConfig, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? EmptyList.b : list, (i2 & 4) != 0 ? null : uxPollsConfig);
    }
}
