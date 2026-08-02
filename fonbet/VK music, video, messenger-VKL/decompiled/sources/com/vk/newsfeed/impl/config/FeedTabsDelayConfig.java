package com.vk.newsfeed.impl.config;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: FeedTabsDelayConfig.kt */
/* loaded from: classes4.dex */
public final class FeedTabsDelayConfig implements Serializer.StreamParcelable {
    public static final Serializer.c<FeedTabsDelayConfig> CREATOR = new a();
    public final long b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FeedTabsDelayConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FeedTabsDelayConfig a(Serializer serializer) {
            return new FeedTabsDelayConfig(serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeedTabsDelayConfig[i];
        }
    }

    public FeedTabsDelayConfig(long j) {
        this.b = j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
