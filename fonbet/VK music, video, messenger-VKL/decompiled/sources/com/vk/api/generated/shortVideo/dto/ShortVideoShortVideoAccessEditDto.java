package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ShortVideoShortVideoAccessEditDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoAccessEditDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoAccessEditDto> CREATOR = new a();

    @pmi0("allow")
    private final Boolean allow;

    @pmi0("disclaimers")
    private final List<String> disclaimers;

    /* compiled from: ShortVideoShortVideoAccessEditDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoAccessEditDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoAccessEditDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoShortVideoAccessEditDto(valueOf, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoAccessEditDto[] newArray(int i) {
            return new ShortVideoShortVideoAccessEditDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoShortVideoAccessEditDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Boolean d() {
        return this.allow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.disclaimers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoAccessEditDto)) {
            return false;
        }
        ShortVideoShortVideoAccessEditDto shortVideoShortVideoAccessEditDto = (ShortVideoShortVideoAccessEditDto) obj;
        return epx.f(this.allow, shortVideoShortVideoAccessEditDto.allow) && epx.f(this.disclaimers, shortVideoShortVideoAccessEditDto.disclaimers);
    }

    public final int hashCode() {
        Boolean bool = this.allow;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.disclaimers;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoAccessEditDto(allow=");
        sb.append(this.allow);
        sb.append(", disclaimers=");
        return ms9.a(')', sb, this.disclaimers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.allow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeStringList(this.disclaimers);
    }

    public ShortVideoShortVideoAccessEditDto(Boolean bool, List<String> list) {
        this.allow = bool;
        this.disclaimers = list;
    }

    public /* synthetic */ ShortVideoShortVideoAccessEditDto(Boolean bool, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list);
    }
}
