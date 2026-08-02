package com.vk.api.generated.link.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LinkSellerProductPropertiesDto.kt */
/* loaded from: classes14.dex */
public final class LinkSellerProductPropertiesDto implements Parcelable {
    public static final Parcelable.Creator<LinkSellerProductPropertiesDto> CREATOR = new a();

    @pmi0("favicon_link")
    private final String faviconLink;

    @pmi0("owner_name")
    private final String ownerName;

    /* compiled from: LinkSellerProductPropertiesDto.kt */
    public static final class a implements Parcelable.Creator<LinkSellerProductPropertiesDto> {
        @Override // android.os.Parcelable.Creator
        public final LinkSellerProductPropertiesDto createFromParcel(Parcel parcel) {
            return new LinkSellerProductPropertiesDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LinkSellerProductPropertiesDto[] newArray(int i) {
            return new LinkSellerProductPropertiesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkSellerProductPropertiesDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkSellerProductPropertiesDto)) {
            return false;
        }
        LinkSellerProductPropertiesDto linkSellerProductPropertiesDto = (LinkSellerProductPropertiesDto) obj;
        return epx.f(this.ownerName, linkSellerProductPropertiesDto.ownerName) && epx.f(this.faviconLink, linkSellerProductPropertiesDto.faviconLink);
    }

    public final int hashCode() {
        String str = this.ownerName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.faviconLink;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkSellerProductPropertiesDto(ownerName=");
        sb.append(this.ownerName);
        sb.append(", faviconLink=");
        return ho8.a(sb, this.faviconLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ownerName);
        parcel.writeString(this.faviconLink);
    }

    public LinkSellerProductPropertiesDto(String str, String str2) {
        this.ownerName = str;
        this.faviconLink = str2;
    }

    public /* synthetic */ LinkSellerProductPropertiesDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
