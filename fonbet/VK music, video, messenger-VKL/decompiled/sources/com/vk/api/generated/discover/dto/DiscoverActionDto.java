package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DiscoverActionDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverActionDto implements Parcelable {
    public static final Parcelable.Creator<DiscoverActionDto> CREATOR = new a();

    @pmi0("target")
    private final String target;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: DiscoverActionDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverActionDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverActionDto createFromParcel(Parcel parcel) {
            return new DiscoverActionDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverActionDto[] newArray(int i) {
            return new DiscoverActionDto[i];
        }
    }

    public DiscoverActionDto() {
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
        if (!(obj instanceof DiscoverActionDto)) {
            return false;
        }
        DiscoverActionDto discoverActionDto = (DiscoverActionDto) obj;
        return epx.f(this.url, discoverActionDto.url) && epx.f(this.type, discoverActionDto.type) && epx.f(this.target, discoverActionDto.target);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverActionDto(url=");
        sb.append(this.url);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", target=");
        return ho8.a(sb, this.target, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.type);
        parcel.writeString(this.target);
    }

    public DiscoverActionDto(String str, String str2, String str3) {
        this.url = str;
        this.type = str2;
        this.target = str3;
    }

    public /* synthetic */ DiscoverActionDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
