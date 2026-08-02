package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdentityGetLabelsTypeDto.kt */
/* loaded from: classes14.dex */
public final class IdentityGetLabelsTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdentityGetLabelsTypeDto[] $VALUES;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    public static final IdentityGetLabelsTypeDto ADDRESS;
    public static final Parcelable.Creator<IdentityGetLabelsTypeDto> CREATOR;

    @pmi0("email")
    public static final IdentityGetLabelsTypeDto EMAIL;

    @pmi0("phone")
    public static final IdentityGetLabelsTypeDto PHONE;
    private final String value;

    /* compiled from: IdentityGetLabelsTypeDto.kt */
    public static final class a implements Parcelable.Creator<IdentityGetLabelsTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityGetLabelsTypeDto createFromParcel(Parcel parcel) {
            return IdentityGetLabelsTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityGetLabelsTypeDto[] newArray(int i) {
            return new IdentityGetLabelsTypeDto[i];
        }
    }

    static {
        IdentityGetLabelsTypeDto identityGetLabelsTypeDto = new IdentityGetLabelsTypeDto("ADDRESS", 0, RTCStatsConstants.KEY_ADDRESS);
        ADDRESS = identityGetLabelsTypeDto;
        IdentityGetLabelsTypeDto identityGetLabelsTypeDto2 = new IdentityGetLabelsTypeDto(CommonConstant.RETKEY.EMAIL, 1, "email");
        EMAIL = identityGetLabelsTypeDto2;
        IdentityGetLabelsTypeDto identityGetLabelsTypeDto3 = new IdentityGetLabelsTypeDto("PHONE", 2, "phone");
        PHONE = identityGetLabelsTypeDto3;
        IdentityGetLabelsTypeDto[] identityGetLabelsTypeDtoArr = {identityGetLabelsTypeDto, identityGetLabelsTypeDto2, identityGetLabelsTypeDto3};
        $VALUES = identityGetLabelsTypeDtoArr;
        $ENTRIES = new asp(identityGetLabelsTypeDtoArr);
        CREATOR = new a();
    }

    private IdentityGetLabelsTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static IdentityGetLabelsTypeDto valueOf(String str) {
        return (IdentityGetLabelsTypeDto) Enum.valueOf(IdentityGetLabelsTypeDto.class, str);
    }

    public static IdentityGetLabelsTypeDto[] values() {
        return (IdentityGetLabelsTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
