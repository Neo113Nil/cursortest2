package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarusiaBackendCommandDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaBackendCommandDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaBackendCommandDto> CREATOR = new a();

    @pmi0("media_type")
    private final Integer mediaType;

    @pmi0("type")
    private final String type;

    /* compiled from: MarusiaBackendCommandDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaBackendCommandDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaBackendCommandDto createFromParcel(Parcel parcel) {
            return new MarusiaBackendCommandDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaBackendCommandDto[] newArray(int i) {
            return new MarusiaBackendCommandDto[i];
        }
    }

    public MarusiaBackendCommandDto(String str, Integer num) {
        this.type = str;
        this.mediaType = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaBackendCommandDto)) {
            return false;
        }
        MarusiaBackendCommandDto marusiaBackendCommandDto = (MarusiaBackendCommandDto) obj;
        return epx.f(this.type, marusiaBackendCommandDto.type) && epx.f(this.mediaType, marusiaBackendCommandDto.mediaType);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.mediaType;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaBackendCommandDto(type=");
        sb.append(this.type);
        sb.append(", mediaType=");
        return uqi.b(sb, this.mediaType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        Integer num = this.mediaType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarusiaBackendCommandDto(String str, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
