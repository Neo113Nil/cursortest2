package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogAdBlockDto.kt */
/* loaded from: classes14.dex */
public final class CatalogAdBlockDto implements Parcelable {
    public static final Parcelable.Creator<CatalogAdBlockDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final CatalogAdLayoutDto layout;

    @pmi0("sdk_source")
    private final String sdkSource;

    /* compiled from: CatalogAdBlockDto.kt */
    public static final class a implements Parcelable.Creator<CatalogAdBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogAdBlockDto createFromParcel(Parcel parcel) {
            return new CatalogAdBlockDto(parcel.readString(), CatalogAdLayoutDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogAdBlockDto[] newArray(int i) {
            return new CatalogAdBlockDto[i];
        }
    }

    public CatalogAdBlockDto(String str, CatalogAdLayoutDto catalogAdLayoutDto, String str2) {
        this.id = str;
        this.layout = catalogAdLayoutDto;
        this.sdkSource = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogAdBlockDto)) {
            return false;
        }
        CatalogAdBlockDto catalogAdBlockDto = (CatalogAdBlockDto) obj;
        return epx.f(this.id, catalogAdBlockDto.id) && epx.f(this.layout, catalogAdBlockDto.layout) && epx.f(this.sdkSource, catalogAdBlockDto.sdkSource);
    }

    public final int hashCode() {
        int hashCode = (this.layout.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.sdkSource;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogAdBlockDto(id=");
        sb.append(this.id);
        sb.append(", layout=");
        sb.append(this.layout);
        sb.append(", sdkSource=");
        return ho8.a(sb, this.sdkSource, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.layout.writeToParcel(parcel, i);
        parcel.writeString(this.sdkSource);
    }

    public /* synthetic */ CatalogAdBlockDto(String str, CatalogAdLayoutDto catalogAdLayoutDto, String str2, int i, zcl zclVar) {
        this(str, catalogAdLayoutDto, (i & 4) != 0 ? null : str2);
    }
}
