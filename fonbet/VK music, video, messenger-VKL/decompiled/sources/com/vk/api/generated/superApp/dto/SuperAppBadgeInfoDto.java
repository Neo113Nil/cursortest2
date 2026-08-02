package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: SuperAppBadgeInfoDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppBadgeInfoDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppBadgeInfoDto> CREATOR = new a();

    @pmi0("counter")
    private final Integer counter;

    @pmi0("has_dot")
    private final Boolean hasDot;

    @pmi0("has_messenger_integration")
    private final Boolean hasMessengerIntegration;

    @pmi0("is_favourite")
    private final Boolean isFavourite;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0(NotificationCompat.CATEGORY_PROMO)
    private final String promo;

    /* compiled from: SuperAppBadgeInfoDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppBadgeInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppBadgeInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppBadgeInfoDto(readString, valueOf, valueOf2, valueOf4, valueOf3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppBadgeInfoDto[] newArray(int i) {
            return new SuperAppBadgeInfoDto[i];
        }
    }

    public SuperAppBadgeInfoDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final Integer d() {
        return this.counter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.hasDot;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppBadgeInfoDto)) {
            return false;
        }
        SuperAppBadgeInfoDto superAppBadgeInfoDto = (SuperAppBadgeInfoDto) obj;
        return epx.f(this.promo, superAppBadgeInfoDto.promo) && epx.f(this.isNew, superAppBadgeInfoDto.isNew) && epx.f(this.hasDot, superAppBadgeInfoDto.hasDot) && epx.f(this.counter, superAppBadgeInfoDto.counter) && epx.f(this.isFavourite, superAppBadgeInfoDto.isFavourite) && epx.f(this.hasMessengerIntegration, superAppBadgeInfoDto.hasMessengerIntegration);
    }

    public final Boolean f() {
        return this.hasMessengerIntegration;
    }

    public final String g() {
        return this.promo;
    }

    public final int hashCode() {
        String str = this.promo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isNew;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasDot;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.counter;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.isFavourite;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasMessengerIntegration;
        return hashCode5 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isFavourite;
    }

    public final Boolean j() {
        return this.isNew;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppBadgeInfoDto(promo=");
        sb.append(this.promo);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", hasDot=");
        sb.append(this.hasDot);
        sb.append(", counter=");
        sb.append(this.counter);
        sb.append(", isFavourite=");
        sb.append(this.isFavourite);
        sb.append(", hasMessengerIntegration=");
        return tn.a(sb, this.hasMessengerIntegration, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promo);
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasDot;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.counter;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool3 = this.isFavourite;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.hasMessengerIntegration;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
    }

    public SuperAppBadgeInfoDto(String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4) {
        this.promo = str;
        this.isNew = bool;
        this.hasDot = bool2;
        this.counter = num;
        this.isFavourite = bool3;
        this.hasMessengerIntegration = bool4;
    }

    public /* synthetic */ SuperAppBadgeInfoDto(String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4);
    }
}
