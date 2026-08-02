package com.vk.fullscreen.promo.core;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;

/* compiled from: PromoSessionInfo.kt */
/* loaded from: classes16.dex */
public final class PromoSessionInfo implements Parcelable {
    public static final Parcelable.Creator<PromoSessionInfo> CREATOR = new a();
    public final FullscreenPromoEvent b;
    public final PromoArguments c;
    public final String d;

    /* compiled from: PromoSessionInfo.kt */
    public static final class a implements Parcelable.Creator<PromoSessionInfo> {
        @Override // android.os.Parcelable.Creator
        public final PromoSessionInfo createFromParcel(Parcel parcel) {
            return new PromoSessionInfo((FullscreenPromoEvent) parcel.readParcelable(PromoSessionInfo.class.getClassLoader()), (PromoArguments) parcel.readParcelable(PromoSessionInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromoSessionInfo[] newArray(int i) {
            return new PromoSessionInfo[i];
        }
    }

    public PromoSessionInfo(FullscreenPromoEvent fullscreenPromoEvent, PromoArguments promoArguments, String str) {
        this.b = fullscreenPromoEvent;
        this.c = promoArguments;
        this.d = str;
    }

    public final PromoArguments d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final FullscreenPromoEvent e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoSessionInfo)) {
            return false;
        }
        PromoSessionInfo promoSessionInfo = (PromoSessionInfo) obj;
        return epx.f(this.b, promoSessionInfo.b) && epx.f(this.c, promoSessionInfo.c) && epx.f(this.d, promoSessionInfo.d);
    }

    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        PromoArguments promoArguments = this.c;
        return this.d.hashCode() + ((hashCode + (promoArguments == null ? 0 : promoArguments.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoSessionInfo(event=");
        sb.append(this.b);
        sb.append(", arguments=");
        sb.append(this.c);
        sb.append(", id=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
