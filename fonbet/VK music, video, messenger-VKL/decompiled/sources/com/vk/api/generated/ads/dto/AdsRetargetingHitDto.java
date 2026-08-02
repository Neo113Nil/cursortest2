package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AdsRetargetingHitDto.kt */
/* loaded from: classes14.dex */
public final class AdsRetargetingHitDto implements Parcelable {
    public static final Parcelable.Creator<AdsRetargetingHitDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<AdsRetargetingHitResultErrorsDto> errors;

    @pmi0("success")
    private final Boolean success;

    /* compiled from: AdsRetargetingHitDto.kt */
    public static final class a implements Parcelable.Creator<AdsRetargetingHitDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsRetargetingHitDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int i = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = en.a(AdsRetargetingHitResultErrorsDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AdsRetargetingHitDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsRetargetingHitDto[] newArray(int i) {
            return new AdsRetargetingHitDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsRetargetingHitDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Boolean d() {
        return this.success;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsRetargetingHitDto)) {
            return false;
        }
        AdsRetargetingHitDto adsRetargetingHitDto = (AdsRetargetingHitDto) obj;
        return epx.f(this.success, adsRetargetingHitDto.success) && epx.f(this.errors, adsRetargetingHitDto.errors);
    }

    public final int hashCode() {
        Boolean bool = this.success;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<AdsRetargetingHitResultErrorsDto> list = this.errors;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsRetargetingHitDto(success=");
        sb.append(this.success);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.success;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<AdsRetargetingHitResultErrorsDto> list = this.errors;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AdsRetargetingHitResultErrorsDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AdsRetargetingHitDto(Boolean bool, List<AdsRetargetingHitResultErrorsDto> list) {
        this.success = bool;
        this.errors = list;
    }

    public /* synthetic */ AdsRetargetingHitDto(Boolean bool, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : list);
    }
}
