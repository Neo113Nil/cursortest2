package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogMiniAppContentItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogMiniAppContentItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogMiniAppContentItemDto> CREATOR = new a();

    @pmi0("app_id")
    private final long appId;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final String image;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("url")
    private final String url;

    /* compiled from: CatalogMiniAppContentItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogMiniAppContentItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogMiniAppContentItemDto createFromParcel(Parcel parcel) {
            return new CatalogMiniAppContentItemDto(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogMiniAppContentItemDto[] newArray(int i) {
            return new CatalogMiniAppContentItemDto[i];
        }
    }

    public CatalogMiniAppContentItemDto(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this.appId = j;
        this.id = str;
        this.trackCode = str2;
        this.url = str3;
        this.title = str4;
        this.subtitle = str5;
        this.image = str6;
    }

    public final long d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMiniAppContentItemDto)) {
            return false;
        }
        CatalogMiniAppContentItemDto catalogMiniAppContentItemDto = (CatalogMiniAppContentItemDto) obj;
        return this.appId == catalogMiniAppContentItemDto.appId && epx.f(this.id, catalogMiniAppContentItemDto.id) && epx.f(this.trackCode, catalogMiniAppContentItemDto.trackCode) && epx.f(this.url, catalogMiniAppContentItemDto.url) && epx.f(this.title, catalogMiniAppContentItemDto.title) && epx.f(this.subtitle, catalogMiniAppContentItemDto.subtitle) && epx.f(this.image, catalogMiniAppContentItemDto.image);
    }

    public final String f() {
        return this.subtitle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.appId) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtitle;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.image;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMiniAppContentItemDto(appId=");
        sb.append(this.appId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", image=");
        return ho8.a(sb, this.image, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.appId);
        parcel.writeString(this.id);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.url);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.image);
    }

    public /* synthetic */ CatalogMiniAppContentItemDto(long j, String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
