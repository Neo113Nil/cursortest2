package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseOwnerButtonActionTargetDto.kt */
/* loaded from: classes14.dex */
public final class BaseOwnerButtonActionTargetDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseOwnerButtonActionTargetDto[] $VALUES;

    @pmi0("authorize")
    public static final BaseOwnerButtonActionTargetDto AUTHORIZE;
    public static final Parcelable.Creator<BaseOwnerButtonActionTargetDto> CREATOR;

    @pmi0(D1.e)
    public static final BaseOwnerButtonActionTargetDto EXTERNAL;

    @pmi0("internal")
    public static final BaseOwnerButtonActionTargetDto INTERNAL;
    private final String value;

    /* compiled from: BaseOwnerButtonActionTargetDto.kt */
    public static final class a implements Parcelable.Creator<BaseOwnerButtonActionTargetDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseOwnerButtonActionTargetDto createFromParcel(Parcel parcel) {
            return BaseOwnerButtonActionTargetDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseOwnerButtonActionTargetDto[] newArray(int i) {
            return new BaseOwnerButtonActionTargetDto[i];
        }
    }

    static {
        BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto = new BaseOwnerButtonActionTargetDto("INTERNAL", 0, "internal");
        INTERNAL = baseOwnerButtonActionTargetDto;
        BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto2 = new BaseOwnerButtonActionTargetDto("EXTERNAL", 1, D1.e);
        EXTERNAL = baseOwnerButtonActionTargetDto2;
        BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto3 = new BaseOwnerButtonActionTargetDto("AUTHORIZE", 2, "authorize");
        AUTHORIZE = baseOwnerButtonActionTargetDto3;
        BaseOwnerButtonActionTargetDto[] baseOwnerButtonActionTargetDtoArr = {baseOwnerButtonActionTargetDto, baseOwnerButtonActionTargetDto2, baseOwnerButtonActionTargetDto3};
        $VALUES = baseOwnerButtonActionTargetDtoArr;
        $ENTRIES = new asp(baseOwnerButtonActionTargetDtoArr);
        CREATOR = new a();
    }

    private BaseOwnerButtonActionTargetDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BaseOwnerButtonActionTargetDto valueOf(String str) {
        return (BaseOwnerButtonActionTargetDto) Enum.valueOf(BaseOwnerButtonActionTargetDto.class, str);
    }

    public static BaseOwnerButtonActionTargetDto[] values() {
        return (BaseOwnerButtonActionTargetDto[]) $VALUES.clone();
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
