package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsItemBlockAdAppIosDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdAppIosDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdAppIosDto> CREATOR = new a();

    @pmi0("app_id")
    private final String appId;

    @pmi0("open_inline_store")
    private final BasePropertyExistsDto openInlineStore;

    @pmi0("open_url")
    private final String openUrl;

    /* compiled from: AdsItemBlockAdAppIosDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdAppIosDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdAppIosDto createFromParcel(Parcel parcel) {
            return new AdsItemBlockAdAppIosDto(parcel.readString(), (BasePropertyExistsDto) parcel.readParcelable(AdsItemBlockAdAppIosDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdAppIosDto[] newArray(int i) {
            return new AdsItemBlockAdAppIosDto[i];
        }
    }

    public AdsItemBlockAdAppIosDto(String str, BasePropertyExistsDto basePropertyExistsDto, String str2) {
        this.appId = str;
        this.openInlineStore = basePropertyExistsDto;
        this.openUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdAppIosDto)) {
            return false;
        }
        AdsItemBlockAdAppIosDto adsItemBlockAdAppIosDto = (AdsItemBlockAdAppIosDto) obj;
        return epx.f(this.appId, adsItemBlockAdAppIosDto.appId) && this.openInlineStore == adsItemBlockAdAppIosDto.openInlineStore && epx.f(this.openUrl, adsItemBlockAdAppIosDto.openUrl);
    }

    public final int hashCode() {
        int hashCode = this.appId.hashCode() * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.openInlineStore;
        int hashCode2 = (hashCode + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        String str = this.openUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsItemBlockAdAppIosDto(appId=");
        sb.append(this.appId);
        sb.append(", openInlineStore=");
        sb.append(this.openInlineStore);
        sb.append(", openUrl=");
        return ho8.a(sb, this.openUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeParcelable(this.openInlineStore, i);
        parcel.writeString(this.openUrl);
    }

    public /* synthetic */ AdsItemBlockAdAppIosDto(String str, BasePropertyExistsDto basePropertyExistsDto, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : basePropertyExistsDto, (i & 4) != 0 ? null : str2);
    }
}
