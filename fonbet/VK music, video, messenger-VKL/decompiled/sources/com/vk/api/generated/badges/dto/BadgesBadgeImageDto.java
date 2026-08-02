package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BadgesBadgeImageDto.kt */
/* loaded from: classes14.dex */
public final class BadgesBadgeImageDto implements Parcelable {
    public static final Parcelable.Creator<BadgesBadgeImageDto> CREATOR = new a();

    @pmi0("base_url")
    private final String baseUrl;

    @pmi0("version")
    private final Integer version;

    /* compiled from: BadgesBadgeImageDto.kt */
    public static final class a implements Parcelable.Creator<BadgesBadgeImageDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeImageDto createFromParcel(Parcel parcel) {
            return new BadgesBadgeImageDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeImageDto[] newArray(int i) {
            return new BadgesBadgeImageDto[i];
        }
    }

    public BadgesBadgeImageDto(String str, Integer num) {
        this.baseUrl = str;
        this.version = num;
    }

    public final String d() {
        return this.baseUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesBadgeImageDto)) {
            return false;
        }
        BadgesBadgeImageDto badgesBadgeImageDto = (BadgesBadgeImageDto) obj;
        return epx.f(this.baseUrl, badgesBadgeImageDto.baseUrl) && epx.f(this.version, badgesBadgeImageDto.version);
    }

    public final int hashCode() {
        int hashCode = this.baseUrl.hashCode() * 31;
        Integer num = this.version;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesBadgeImageDto(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", version=");
        return uqi.b(sb, this.version, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.baseUrl);
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ BadgesBadgeImageDto(String str, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
