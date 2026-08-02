package com.vk.feed.core.models.discover;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: DiscoverAction.kt */
/* loaded from: classes18.dex */
public abstract class DiscoverAction implements Serializer.StreamParcelable {
    public final String b;

    public DiscoverAction(String str) {
        this.b = str;
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
