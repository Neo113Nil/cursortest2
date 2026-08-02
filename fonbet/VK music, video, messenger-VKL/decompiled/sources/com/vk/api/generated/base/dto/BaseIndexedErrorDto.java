package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseIndexedErrorDto.kt */
/* loaded from: classes14.dex */
public final class BaseIndexedErrorDto implements Parcelable {
    public static final Parcelable.Creator<BaseIndexedErrorDto> CREATOR = new a();

    @pmi0("error_code")
    private final int errorCode;

    @pmi0(SharedKt.PARAM_ERROR_MSG)
    private final String errorMsg;

    @pmi0("error_subcode")
    private final Integer errorSubcode;

    @pmi0("error_text")
    private final String errorText;

    @pmi0("index")
    private final int index;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("request_params")
    private final List<BaseRequestParamDto> requestParams;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseIndexedErrorDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;

        @pmi0("base_error")
        public static final InnerTypeDto BASE_ERROR;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;
        private final String value;

        /* compiled from: BaseIndexedErrorDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("BASE_ERROR", 0, "base_error");
            BASE_ERROR = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: BaseIndexedErrorDto.kt */
    public static final class a implements Parcelable.Creator<BaseIndexedErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseIndexedErrorDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(BaseRequestParamDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new BaseIndexedErrorDto(readInt, createFromParcel, readInt2, valueOf, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseIndexedErrorDto[] newArray(int i) {
            return new BaseIndexedErrorDto[i];
        }
    }

    public BaseIndexedErrorDto(int i, InnerTypeDto innerTypeDto, int i2, Integer num, String str, String str2, List<BaseRequestParamDto> list) {
        this.index = i;
        this.innerType = innerTypeDto;
        this.errorCode = i2;
        this.errorSubcode = num;
        this.errorMsg = str;
        this.errorText = str2;
        this.requestParams = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseIndexedErrorDto)) {
            return false;
        }
        BaseIndexedErrorDto baseIndexedErrorDto = (BaseIndexedErrorDto) obj;
        return this.index == baseIndexedErrorDto.index && this.innerType == baseIndexedErrorDto.innerType && this.errorCode == baseIndexedErrorDto.errorCode && epx.f(this.errorSubcode, baseIndexedErrorDto.errorSubcode) && epx.f(this.errorMsg, baseIndexedErrorDto.errorMsg) && epx.f(this.errorText, baseIndexedErrorDto.errorText) && epx.f(this.requestParams, baseIndexedErrorDto.requestParams);
    }

    public final int hashCode() {
        int a2 = shy.a(this.errorCode, (this.innerType.hashCode() + (Integer.hashCode(this.index) * 31)) * 31, 31);
        Integer num = this.errorSubcode;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseRequestParamDto> list = this.requestParams;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseIndexedErrorDto(index=");
        sb.append(this.index);
        sb.append(", innerType=");
        sb.append(this.innerType);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorSubcode=");
        sb.append(this.errorSubcode);
        sb.append(", errorMsg=");
        sb.append(this.errorMsg);
        sb.append(", errorText=");
        sb.append(this.errorText);
        sb.append(", requestParams=");
        return ms9.a(')', sb, this.requestParams);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        this.innerType.writeToParcel(parcel, i);
        parcel.writeInt(this.errorCode);
        Integer num = this.errorSubcode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.errorText);
        List<BaseRequestParamDto> list = this.requestParams;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseRequestParamDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BaseIndexedErrorDto(int i, InnerTypeDto innerTypeDto, int i2, Integer num, String str, String str2, List list, int i3, zcl zclVar) {
        this(i, innerTypeDto, i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : list);
    }
}
