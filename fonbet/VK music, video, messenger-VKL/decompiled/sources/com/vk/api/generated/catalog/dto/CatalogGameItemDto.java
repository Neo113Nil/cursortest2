package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogGameItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogGameItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogGameItemDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: CatalogGameItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogGameItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogGameItemDto createFromParcel(Parcel parcel) {
            return new CatalogGameItemDto((UserId) parcel.readParcelable(CatalogGameItemDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogGameItemDto[] newArray(int i) {
            return new CatalogGameItemDto[i];
        }
    }

    public CatalogGameItemDto(UserId userId, String str, String str2) {
        this.id = userId;
        this.trackCode = str;
        this.webviewUrl = str2;
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
        if (!(obj instanceof CatalogGameItemDto)) {
            return false;
        }
        CatalogGameItemDto catalogGameItemDto = (CatalogGameItemDto) obj;
        return epx.f(this.id, catalogGameItemDto.id) && epx.f(this.trackCode, catalogGameItemDto.trackCode) && epx.f(this.webviewUrl, catalogGameItemDto.webviewUrl);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        String str = this.trackCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webviewUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogGameItemDto(id=");
        sb.append(this.id);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.webviewUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.webviewUrl);
    }

    public /* synthetic */ CatalogGameItemDto(UserId userId, String str, String str2, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
