package com.vk.video.growth.impl.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.video.growth.api.TrapContentParams;
import com.vk.video.growth.api.VideoGrowthStoreParams;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import xsna.epx;
import xsna.lm50;

/* compiled from: TrapState.kt */
/* loaded from: classes6.dex */
public final class TrapState implements lm50, Parcelable {
    public static final Parcelable.Creator<TrapState> CREATOR = new a();
    public final TrapContentParams b;
    public final VideoGrowthStoreParams c;
    public final VideoGrowthVideoParams d;

    /* compiled from: TrapState.kt */
    public static final class a implements Parcelable.Creator<TrapState> {
        @Override // android.os.Parcelable.Creator
        public final TrapState createFromParcel(Parcel parcel) {
            return new TrapState((TrapContentParams) parcel.readParcelable(TrapState.class.getClassLoader()), (VideoGrowthStoreParams) parcel.readParcelable(TrapState.class.getClassLoader()), (VideoGrowthVideoParams) parcel.readParcelable(TrapState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrapState[] newArray(int i) {
            return new TrapState[i];
        }
    }

    public TrapState(TrapContentParams trapContentParams, VideoGrowthStoreParams videoGrowthStoreParams, VideoGrowthVideoParams videoGrowthVideoParams) {
        this.b = trapContentParams;
        this.c = videoGrowthStoreParams;
        this.d = videoGrowthVideoParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrapState)) {
            return false;
        }
        TrapState trapState = (TrapState) obj;
        return epx.f(this.b, trapState.b) && epx.f(this.c, trapState.c) && epx.f(this.d, trapState.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        VideoGrowthVideoParams videoGrowthVideoParams = this.d;
        return hashCode + (videoGrowthVideoParams == null ? 0 : videoGrowthVideoParams.hashCode());
    }

    public final String toString() {
        return "TrapState(trapContentParams=" + this.b + ", storeParams=" + this.c + ", videoParams=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
