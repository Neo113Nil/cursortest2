package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogAiAssistantDto.kt */
/* loaded from: classes14.dex */
public final class CatalogAiAssistantDto implements Parcelable {
    public static final Parcelable.Creator<CatalogAiAssistantDto> CREATOR = new a();

    @pmi0("category")
    private final String category;

    @pmi0("id")
    private final long id;

    @pmi0("query")
    private final String query;

    @pmi0("query_id")
    private final String queryId;

    /* compiled from: CatalogAiAssistantDto.kt */
    public static final class a implements Parcelable.Creator<CatalogAiAssistantDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogAiAssistantDto createFromParcel(Parcel parcel) {
            return new CatalogAiAssistantDto(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogAiAssistantDto[] newArray(int i) {
            return new CatalogAiAssistantDto[i];
        }
    }

    public CatalogAiAssistantDto(long j, String str, String str2, String str3) {
        this.id = j;
        this.category = str;
        this.queryId = str2;
        this.query = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogAiAssistantDto)) {
            return false;
        }
        CatalogAiAssistantDto catalogAiAssistantDto = (CatalogAiAssistantDto) obj;
        return this.id == catalogAiAssistantDto.id && epx.f(this.category, catalogAiAssistantDto.category) && epx.f(this.queryId, catalogAiAssistantDto.queryId) && epx.f(this.query, catalogAiAssistantDto.query);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.id) * 31, 31, this.category), 31, this.queryId);
        String str = this.query;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogAiAssistantDto(id=");
        sb.append(this.id);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", queryId=");
        sb.append(this.queryId);
        sb.append(", query=");
        return ho8.a(sb, this.query, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeString(this.category);
        parcel.writeString(this.queryId);
        parcel.writeString(this.query);
    }

    public /* synthetic */ CatalogAiAssistantDto(long j, String str, String str2, String str3, int i, zcl zclVar) {
        this(j, str, str2, (i & 8) != 0 ? null : str3);
    }
}
