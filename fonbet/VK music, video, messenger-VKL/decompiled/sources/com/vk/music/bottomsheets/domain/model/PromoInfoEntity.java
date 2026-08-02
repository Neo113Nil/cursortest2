package com.vk.music.bottomsheets.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: PromoInfoEntity.kt */
/* loaded from: classes3.dex */
public final class PromoInfoEntity implements Parcelable {
    public static final Parcelable.Creator<PromoInfoEntity> CREATOR = new a();
    public final String b;
    public final String c;
    public final LinkButtonEntity d;
    public final String e;
    public final Image f;
    public final Image g;
    public final String h;

    /* compiled from: PromoInfoEntity.kt */
    public static final class a implements Parcelable.Creator<PromoInfoEntity> {
        @Override // android.os.Parcelable.Creator
        public final PromoInfoEntity createFromParcel(Parcel parcel) {
            return new PromoInfoEntity(parcel.readString(), parcel.readString(), LinkButtonEntity.CREATOR.createFromParcel(parcel), parcel.readString(), (Image) parcel.readParcelable(PromoInfoEntity.class.getClassLoader()), (Image) parcel.readParcelable(PromoInfoEntity.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromoInfoEntity[] newArray(int i) {
            return new PromoInfoEntity[i];
        }
    }

    public PromoInfoEntity(String str, String str2, LinkButtonEntity linkButtonEntity, String str3, Image image, Image image2, String str4) {
        this.b = str;
        this.c = str2;
        this.d = linkButtonEntity;
        this.e = str3;
        this.f = image;
        this.g = image2;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoInfoEntity)) {
            return false;
        }
        PromoInfoEntity promoInfoEntity = (PromoInfoEntity) obj;
        return epx.f(this.b, promoInfoEntity.b) && epx.f(this.c, promoInfoEntity.c) && epx.f(this.d, promoInfoEntity.d) && epx.f(this.e, promoInfoEntity.e) && epx.f(this.f, promoInfoEntity.f) && epx.f(this.g, promoInfoEntity.g) && epx.f(this.h, promoInfoEntity.h);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
        Image image = this.f;
        int hashCode = (a2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.g;
        return this.h.hashCode() + ((hashCode + (image2 != null ? image2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoInfoEntity(title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", style=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", backgroundImage=");
        sb.append(this.g);
        sb.append(", trackCode=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeString(this.h);
    }
}
