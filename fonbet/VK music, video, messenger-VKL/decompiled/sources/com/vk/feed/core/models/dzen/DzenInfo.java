package com.vk.feed.core.models.dzen;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.info.InfoPopup;
import xsna.epx;

/* compiled from: DzenInfo.kt */
/* loaded from: classes18.dex */
public final class DzenInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<DzenInfo> CREATOR = new a();
    public final InfoPopup b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DzenInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DzenInfo a(Serializer serializer) {
            return new DzenInfo((InfoPopup) serializer.G(InfoPopup.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DzenInfo[i];
        }
    }

    public DzenInfo(InfoPopup infoPopup) {
        this.b = infoPopup;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DzenInfo) && epx.f(this.b, ((DzenInfo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DzenInfo(popup=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
