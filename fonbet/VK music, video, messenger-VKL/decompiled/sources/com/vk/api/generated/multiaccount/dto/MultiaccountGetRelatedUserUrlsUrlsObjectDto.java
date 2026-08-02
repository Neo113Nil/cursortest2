package com.vk.api.generated.multiaccount.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MultiaccountGetRelatedUserUrlsUrlsObjectDto.kt */
/* loaded from: classes15.dex */
public final class MultiaccountGetRelatedUserUrlsUrlsObjectDto implements Parcelable {
    public static final Parcelable.Creator<MultiaccountGetRelatedUserUrlsUrlsObjectDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("url")
    private final String url;

    /* compiled from: MultiaccountGetRelatedUserUrlsUrlsObjectDto.kt */
    public static final class a implements Parcelable.Creator<MultiaccountGetRelatedUserUrlsUrlsObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MultiaccountGetRelatedUserUrlsUrlsObjectDto createFromParcel(Parcel parcel) {
            return new MultiaccountGetRelatedUserUrlsUrlsObjectDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiaccountGetRelatedUserUrlsUrlsObjectDto[] newArray(int i) {
            return new MultiaccountGetRelatedUserUrlsUrlsObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiaccountGetRelatedUserUrlsUrlsObjectDto() {
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
        if (!(obj instanceof MultiaccountGetRelatedUserUrlsUrlsObjectDto)) {
            return false;
        }
        MultiaccountGetRelatedUserUrlsUrlsObjectDto multiaccountGetRelatedUserUrlsUrlsObjectDto = (MultiaccountGetRelatedUserUrlsUrlsObjectDto) obj;
        return epx.f(this.key, multiaccountGetRelatedUserUrlsUrlsObjectDto.key) && epx.f(this.url, multiaccountGetRelatedUserUrlsUrlsObjectDto.url);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiaccountGetRelatedUserUrlsUrlsObjectDto(key=");
        sb.append(this.key);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.url);
    }

    public MultiaccountGetRelatedUserUrlsUrlsObjectDto(String str, String str2) {
        this.key = str;
        this.url = str2;
    }

    public /* synthetic */ MultiaccountGetRelatedUserUrlsUrlsObjectDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
