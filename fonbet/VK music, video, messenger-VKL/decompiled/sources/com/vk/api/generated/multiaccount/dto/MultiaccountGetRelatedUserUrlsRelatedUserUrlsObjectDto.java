package com.vk.api.generated.multiaccount.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto.kt */
/* loaded from: classes15.dex */
public final class MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto implements Parcelable {
    public static final Parcelable.Creator<MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("related_user_id")
    private final Integer relatedUserId;

    @pmi0("url")
    private final String url;

    /* compiled from: MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto.kt */
    public static final class a implements Parcelable.Creator<MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto createFromParcel(Parcel parcel) {
            return new MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto[] newArray(int i) {
            return new MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto[i];
        }
    }

    public MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto)) {
            return false;
        }
        MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto multiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto = (MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto) obj;
        return epx.f(this.relatedUserId, multiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto.relatedUserId) && epx.f(this.key, multiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto.key) && epx.f(this.url, multiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto.url);
    }

    public final int hashCode() {
        Integer num = this.relatedUserId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.key;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto(relatedUserId=");
        sb.append(this.relatedUserId);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.relatedUserId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.key);
        parcel.writeString(this.url);
    }

    public MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto(Integer num, String str, String str2) {
        this.relatedUserId = num;
        this.key = str;
        this.url = str2;
    }

    public /* synthetic */ MultiaccountGetRelatedUserUrlsRelatedUserUrlsObjectDto(Integer num, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
