package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: OwnersMenuItemCoverDto.kt */
/* loaded from: classes15.dex */
public final class OwnersMenuItemCoverDto implements Parcelable {
    public static final Parcelable.Creator<OwnersMenuItemCoverDto> CREATOR = new a();

    @pmi0("crop_data")
    private final String cropData;

    @pmi0("height")
    private final int height;

    @pmi0("is_base")
    private final Boolean isBase;

    @pmi0("is_miniapp_default")
    private final Boolean isMiniappDefault;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: OwnersMenuItemCoverDto.kt */
    public static final class a implements Parcelable.Creator<OwnersMenuItemCoverDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersMenuItemCoverDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OwnersMenuItemCoverDto(readString, readInt, readInt2, readString2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersMenuItemCoverDto[] newArray(int i) {
            return new OwnersMenuItemCoverDto[i];
        }
    }

    public OwnersMenuItemCoverDto(String str, int i, int i2, String str2, Boolean bool, Boolean bool2) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.cropData = str2;
        this.isMiniappDefault = bool;
        this.isBase = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnersMenuItemCoverDto)) {
            return false;
        }
        OwnersMenuItemCoverDto ownersMenuItemCoverDto = (OwnersMenuItemCoverDto) obj;
        return epx.f(this.url, ownersMenuItemCoverDto.url) && this.width == ownersMenuItemCoverDto.width && this.height == ownersMenuItemCoverDto.height && epx.f(this.cropData, ownersMenuItemCoverDto.cropData) && epx.f(this.isMiniappDefault, ownersMenuItemCoverDto.isMiniappDefault) && epx.f(this.isBase, ownersMenuItemCoverDto.isBase);
    }

    public final int hashCode() {
        int a2 = shy.a(this.height, shy.a(this.width, this.url.hashCode() * 31, 31), 31);
        String str = this.cropData;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isMiniappDefault;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBase;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnersMenuItemCoverDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", cropData=");
        sb.append(this.cropData);
        sb.append(", isMiniappDefault=");
        sb.append(this.isMiniappDefault);
        sb.append(", isBase=");
        return tn.a(sb, this.isBase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.cropData);
        Boolean bool = this.isMiniappDefault;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isBase;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ OwnersMenuItemCoverDto(String str, int i, int i2, String str2, Boolean bool, Boolean bool2, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : bool2);
    }
}
