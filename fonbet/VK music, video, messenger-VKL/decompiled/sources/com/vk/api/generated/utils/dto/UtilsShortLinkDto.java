package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsShortLinkDto.kt */
/* loaded from: classes15.dex */
public final class UtilsShortLinkDto implements Parcelable {
    public static final Parcelable.Creator<UtilsShortLinkDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("key")
    private final String key;

    @pmi0("short_url")
    private final String shortUrl;

    @pmi0("url")
    private final String url;

    /* compiled from: UtilsShortLinkDto.kt */
    public static final class a implements Parcelable.Creator<UtilsShortLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsShortLinkDto createFromParcel(Parcel parcel) {
            return new UtilsShortLinkDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsShortLinkDto[] newArray(int i) {
            return new UtilsShortLinkDto[i];
        }
    }

    public UtilsShortLinkDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsShortLinkDto)) {
            return false;
        }
        UtilsShortLinkDto utilsShortLinkDto = (UtilsShortLinkDto) obj;
        return epx.f(this.accessKey, utilsShortLinkDto.accessKey) && epx.f(this.key, utilsShortLinkDto.key) && epx.f(this.shortUrl, utilsShortLinkDto.shortUrl) && epx.f(this.url, utilsShortLinkDto.url);
    }

    public final int hashCode() {
        String str = this.accessKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UtilsShortLinkDto(accessKey=");
        sb.append(this.accessKey);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", shortUrl=");
        sb.append(this.shortUrl);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accessKey);
        parcel.writeString(this.key);
        parcel.writeString(this.shortUrl);
        parcel.writeString(this.url);
    }

    public UtilsShortLinkDto(String str, String str2, String str3, String str4) {
        this.accessKey = str;
        this.key = str2;
        this.shortUrl = str3;
        this.url = str4;
    }

    public /* synthetic */ UtilsShortLinkDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
