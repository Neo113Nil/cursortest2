package com.vk.api.generated.phones.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: PhonesGetPhoneOwnerInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhonesGetPhoneOwnerInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhonesGetPhoneOwnerInfoResponseDto> CREATOR = new a();

    @pmi0("caller_type")
    private final Integer callerType;

    @pmi0("company_name")
    private final String companyName;

    @pmi0("good_type")
    private final PhonesGoodTypeDto goodType;

    @pmi0("need_feedback")
    private final Boolean needFeedback;

    /* compiled from: PhonesGetPhoneOwnerInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhonesGetPhoneOwnerInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhonesGetPhoneOwnerInfoResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PhonesGoodTypeDto createFromParcel = parcel.readInt() == 0 ? null : PhonesGoodTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PhonesGetPhoneOwnerInfoResponseDto(readString, valueOf, createFromParcel, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesGetPhoneOwnerInfoResponseDto[] newArray(int i) {
            return new PhonesGetPhoneOwnerInfoResponseDto[i];
        }
    }

    public PhonesGetPhoneOwnerInfoResponseDto() {
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
        if (!(obj instanceof PhonesGetPhoneOwnerInfoResponseDto)) {
            return false;
        }
        PhonesGetPhoneOwnerInfoResponseDto phonesGetPhoneOwnerInfoResponseDto = (PhonesGetPhoneOwnerInfoResponseDto) obj;
        return epx.f(this.companyName, phonesGetPhoneOwnerInfoResponseDto.companyName) && epx.f(this.callerType, phonesGetPhoneOwnerInfoResponseDto.callerType) && this.goodType == phonesGetPhoneOwnerInfoResponseDto.goodType && epx.f(this.needFeedback, phonesGetPhoneOwnerInfoResponseDto.needFeedback);
    }

    public final int hashCode() {
        String str = this.companyName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.callerType;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        PhonesGoodTypeDto phonesGoodTypeDto = this.goodType;
        int hashCode3 = (hashCode2 + (phonesGoodTypeDto == null ? 0 : phonesGoodTypeDto.hashCode())) * 31;
        Boolean bool = this.needFeedback;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhonesGetPhoneOwnerInfoResponseDto(companyName=");
        sb.append(this.companyName);
        sb.append(", callerType=");
        sb.append(this.callerType);
        sb.append(", goodType=");
        sb.append(this.goodType);
        sb.append(", needFeedback=");
        return tn.a(sb, this.needFeedback, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.companyName);
        Integer num = this.callerType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        PhonesGoodTypeDto phonesGoodTypeDto = this.goodType;
        if (phonesGoodTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            phonesGoodTypeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.needFeedback;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public PhonesGetPhoneOwnerInfoResponseDto(String str, Integer num, PhonesGoodTypeDto phonesGoodTypeDto, Boolean bool) {
        this.companyName = str;
        this.callerType = num;
        this.goodType = phonesGoodTypeDto;
        this.needFeedback = bool;
    }

    public /* synthetic */ PhonesGetPhoneOwnerInfoResponseDto(String str, Integer num, PhonesGoodTypeDto phonesGoodTypeDto, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : phonesGoodTypeDto, (i & 8) != 0 ? null : bool);
    }
}
