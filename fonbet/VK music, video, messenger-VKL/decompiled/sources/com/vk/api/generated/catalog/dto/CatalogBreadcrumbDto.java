package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogBreadcrumbDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBreadcrumbDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBreadcrumbDto> CREATOR = new a();

    @pmi0("badge")
    private final CatalogBadgeDto badge;

    @pmi0("href")
    private final String href;

    @pmi0("id")
    private final UserId id;

    @pmi0("label")
    private final String label;

    @pmi0("type")
    private final String type;

    /* compiled from: CatalogBreadcrumbDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBreadcrumbDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBreadcrumbDto createFromParcel(Parcel parcel) {
            return new CatalogBreadcrumbDto(parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(CatalogBreadcrumbDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : CatalogBadgeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBreadcrumbDto[] newArray(int i) {
            return new CatalogBreadcrumbDto[i];
        }
    }

    public CatalogBreadcrumbDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBreadcrumbDto)) {
            return false;
        }
        CatalogBreadcrumbDto catalogBreadcrumbDto = (CatalogBreadcrumbDto) obj;
        return epx.f(this.label, catalogBreadcrumbDto.label) && epx.f(this.href, catalogBreadcrumbDto.href) && epx.f(this.id, catalogBreadcrumbDto.id) && epx.f(this.type, catalogBreadcrumbDto.type) && epx.f(this.badge, catalogBreadcrumbDto.badge);
    }

    public final int hashCode() {
        String str = this.label;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.href;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.id;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str3 = this.type;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CatalogBadgeDto catalogBadgeDto = this.badge;
        return hashCode4 + (catalogBadgeDto != null ? catalogBadgeDto.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogBreadcrumbDto(label=" + this.label + ", href=" + this.href + ", id=" + this.id + ", type=" + this.type + ", badge=" + this.badge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        parcel.writeString(this.href);
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.type);
        CatalogBadgeDto catalogBadgeDto = this.badge;
        if (catalogBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBadgeDto.writeToParcel(parcel, i);
        }
    }

    public CatalogBreadcrumbDto(String str, String str2, UserId userId, String str3, CatalogBadgeDto catalogBadgeDto) {
        this.label = str;
        this.href = str2;
        this.id = userId;
        this.type = str3;
        this.badge = catalogBadgeDto;
    }

    public /* synthetic */ CatalogBreadcrumbDto(String str, String str2, UserId userId, String str3, CatalogBadgeDto catalogBadgeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : catalogBadgeDto);
    }
}
