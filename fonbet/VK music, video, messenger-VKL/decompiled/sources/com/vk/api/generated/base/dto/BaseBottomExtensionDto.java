package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseBottomExtensionDto.kt */
/* loaded from: classes14.dex */
public final class BaseBottomExtensionDto implements Parcelable {
    public static final Parcelable.Creator<BaseBottomExtensionDto> CREATOR = new a();

    @pmi0("action_type")
    private final ActionTypeDto actionType;

    @pmi0("button")
    private final BaseOwnerButtonDto button;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseBottomExtensionDto.kt */
    public static final class ActionTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionTypeDto[] $VALUES;
        public static final Parcelable.Creator<ActionTypeDto> CREATOR;

        @pmi0("youla_create_product")
        public static final ActionTypeDto YOULA_CREATE_PRODUCT;
        private final String value;

        /* compiled from: BaseBottomExtensionDto.kt */
        public static final class a implements Parcelable.Creator<ActionTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionTypeDto createFromParcel(Parcel parcel) {
                return ActionTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionTypeDto[] newArray(int i) {
                return new ActionTypeDto[i];
            }
        }

        static {
            ActionTypeDto actionTypeDto = new ActionTypeDto("YOULA_CREATE_PRODUCT", 0, "youla_create_product");
            YOULA_CREATE_PRODUCT = actionTypeDto;
            ActionTypeDto[] actionTypeDtoArr = {actionTypeDto};
            $VALUES = actionTypeDtoArr;
            $ENTRIES = new asp(actionTypeDtoArr);
            CREATOR = new a();
        }

        private ActionTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionTypeDto valueOf(String str) {
            return (ActionTypeDto) Enum.valueOf(ActionTypeDto.class, str);
        }

        public static ActionTypeDto[] values() {
            return (ActionTypeDto[]) $VALUES.clone();
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

    /* compiled from: BaseBottomExtensionDto.kt */
    public static final class a implements Parcelable.Creator<BaseBottomExtensionDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseBottomExtensionDto createFromParcel(Parcel parcel) {
            return new BaseBottomExtensionDto(parcel.readString(), (BaseOwnerButtonDto) parcel.readParcelable(BaseBottomExtensionDto.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseBottomExtensionDto[] newArray(int i) {
            return new BaseBottomExtensionDto[i];
        }
    }

    public BaseBottomExtensionDto() {
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
        if (!(obj instanceof BaseBottomExtensionDto)) {
            return false;
        }
        BaseBottomExtensionDto baseBottomExtensionDto = (BaseBottomExtensionDto) obj;
        return epx.f(this.text, baseBottomExtensionDto.text) && epx.f(this.button, baseBottomExtensionDto.button) && this.actionType == baseBottomExtensionDto.actionType;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseOwnerButtonDto baseOwnerButtonDto = this.button;
        int hashCode2 = (hashCode + (baseOwnerButtonDto == null ? 0 : baseOwnerButtonDto.hashCode())) * 31;
        ActionTypeDto actionTypeDto = this.actionType;
        return hashCode2 + (actionTypeDto != null ? actionTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseBottomExtensionDto(text=" + this.text + ", button=" + this.button + ", actionType=" + this.actionType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.button, i);
        ActionTypeDto actionTypeDto = this.actionType;
        if (actionTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionTypeDto.writeToParcel(parcel, i);
        }
    }

    public BaseBottomExtensionDto(String str, BaseOwnerButtonDto baseOwnerButtonDto, ActionTypeDto actionTypeDto) {
        this.text = str;
        this.button = baseOwnerButtonDto;
        this.actionType = actionTypeDto;
    }

    public /* synthetic */ BaseBottomExtensionDto(String str, BaseOwnerButtonDto baseOwnerButtonDto, ActionTypeDto actionTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseOwnerButtonDto, (i & 4) != 0 ? null : actionTypeDto);
    }
}
