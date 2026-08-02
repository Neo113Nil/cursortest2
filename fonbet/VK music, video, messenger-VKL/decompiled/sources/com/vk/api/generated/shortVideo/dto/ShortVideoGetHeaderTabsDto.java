package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoGetHeaderTabsDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetHeaderTabsDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetHeaderTabsDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    /* compiled from: ShortVideoGetHeaderTabsDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetHeaderTabsDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetHeaderTabsDto createFromParcel(Parcel parcel) {
            return new ShortVideoGetHeaderTabsDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetHeaderTabsDto[] newArray(int i) {
            return new ShortVideoGetHeaderTabsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoGetHeaderTabsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.key;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoGetHeaderTabsDto) && epx.f(this.key, ((ShortVideoGetHeaderTabsDto) obj).key);
    }

    public final int hashCode() {
        String str = this.key;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ShortVideoGetHeaderTabsDto(key="), this.key, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
    }

    public ShortVideoGetHeaderTabsDto(String str) {
        this.key = str;
    }

    public /* synthetic */ ShortVideoGetHeaderTabsDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
