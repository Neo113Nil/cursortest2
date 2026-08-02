package com.vk.music.bottomsheets.promo.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.er;
import xsna.urd0;

/* compiled from: PromoInfo.kt */
/* loaded from: classes3.dex */
public final class PromoInfo implements Parcelable {
    public static final Parcelable.Creator<PromoInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final LinkButton d;
    public final Image e;
    public final Image f;

    /* compiled from: PromoInfo.kt */
    public static final class a implements Parcelable.Creator<PromoInfo> {
        @Override // android.os.Parcelable.Creator
        public final PromoInfo createFromParcel(Parcel parcel) {
            return new PromoInfo(parcel.readString(), parcel.readString(), LinkButton.CREATOR.createFromParcel(parcel), (Image) parcel.readParcelable(PromoInfo.class.getClassLoader()), (Image) parcel.readParcelable(PromoInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromoInfo[] newArray(int i) {
            return new PromoInfo[i];
        }
    }

    static {
        new PromoInfo("", "", new LinkButton("", "", null), null, null);
    }

    public PromoInfo(String str, String str2, LinkButton linkButton, Image image, Image image2) {
        this.b = str;
        this.c = str2;
        this.d = linkButton;
        this.e = image;
        this.f = image2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoInfo)) {
            return false;
        }
        PromoInfo promoInfo = (PromoInfo) obj;
        return epx.f(this.b, promoInfo.b) && epx.f(this.c, promoInfo.c) && epx.f(this.d, promoInfo.d) && epx.f(this.e, promoInfo.e) && epx.f(this.f, promoInfo.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31;
        Image image = this.e;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f;
        return hashCode2 + (image2 != null ? image2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoInfo(title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", backgroundImage=");
        return er.d(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }
}
