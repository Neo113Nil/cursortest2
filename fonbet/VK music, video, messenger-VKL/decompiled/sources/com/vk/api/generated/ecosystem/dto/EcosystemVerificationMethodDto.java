package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: EcosystemVerificationMethodDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemVerificationMethodDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemVerificationMethodDto> CREATOR = new a();

    @pmi0("can_fallback")
    private final Boolean canFallback;

    @pmi0("info")
    private final String info;

    @pmi0("name")
    private final String name;

    @pmi0(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)
    private final Integer priority;

    @pmi0("timeout")
    private final Integer timeout;

    /* compiled from: EcosystemVerificationMethodDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemVerificationMethodDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemVerificationMethodDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EcosystemVerificationMethodDto(readString, valueOf, valueOf2, readString2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemVerificationMethodDto[] newArray(int i) {
            return new EcosystemVerificationMethodDto[i];
        }
    }

    public EcosystemVerificationMethodDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final Boolean d() {
        return this.canFallback;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.info;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcosystemVerificationMethodDto)) {
            return false;
        }
        EcosystemVerificationMethodDto ecosystemVerificationMethodDto = (EcosystemVerificationMethodDto) obj;
        return epx.f(this.name, ecosystemVerificationMethodDto.name) && epx.f(this.priority, ecosystemVerificationMethodDto.priority) && epx.f(this.timeout, ecosystemVerificationMethodDto.timeout) && epx.f(this.info, ecosystemVerificationMethodDto.info) && epx.f(this.canFallback, ecosystemVerificationMethodDto.canFallback);
    }

    public final String f() {
        return this.name;
    }

    public final Integer g() {
        return this.priority;
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.priority;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeout;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.info;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.canFallback;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final Integer i() {
        return this.timeout;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcosystemVerificationMethodDto(name=");
        sb.append(this.name);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", timeout=");
        sb.append(this.timeout);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", canFallback=");
        return tn.a(sb, this.canFallback, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        Integer num = this.priority;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.timeout;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.info);
        Boolean bool = this.canFallback;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public EcosystemVerificationMethodDto(String str, Integer num, Integer num2, String str2, Boolean bool) {
        this.name = str;
        this.priority = num;
        this.timeout = num2;
        this.info = str2;
        this.canFallback = bool;
    }

    public /* synthetic */ EcosystemVerificationMethodDto(String str, Integer num, Integer num2, String str2, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool);
    }
}
