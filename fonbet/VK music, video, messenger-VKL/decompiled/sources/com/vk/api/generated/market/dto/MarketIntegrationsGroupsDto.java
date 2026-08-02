package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MarketIntegrationsGroupsDto.kt */
/* loaded from: classes15.dex */
public final class MarketIntegrationsGroupsDto implements Parcelable {
    public static final Parcelable.Creator<MarketIntegrationsGroupsDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketIntegrationsGroupsDto.kt */
    public static final class a implements Parcelable.Creator<MarketIntegrationsGroupsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsGroupsDto createFromParcel(Parcel parcel) {
            return new MarketIntegrationsGroupsDto((UserId) parcel.readParcelable(MarketIntegrationsGroupsDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketIntegrationsGroupsDto[] newArray(int i) {
            return new MarketIntegrationsGroupsDto[i];
        }
    }

    public MarketIntegrationsGroupsDto(UserId userId, String str) {
        this.id = userId;
        this.title = str;
    }

    public final UserId d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketIntegrationsGroupsDto)) {
            return false;
        }
        MarketIntegrationsGroupsDto marketIntegrationsGroupsDto = (MarketIntegrationsGroupsDto) obj;
        return epx.f(this.id, marketIntegrationsGroupsDto.id) && epx.f(this.title, marketIntegrationsGroupsDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + (Long.hashCode(this.id.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketIntegrationsGroupsDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.title);
    }
}
