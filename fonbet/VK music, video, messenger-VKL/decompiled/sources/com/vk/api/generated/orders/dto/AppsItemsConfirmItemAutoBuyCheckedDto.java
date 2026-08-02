package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsItemsConfirmItemAutoBuyCheckedDto.kt */
/* loaded from: classes15.dex */
public final class AppsItemsConfirmItemAutoBuyCheckedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsItemsConfirmItemAutoBuyCheckedDto[] $VALUES;

    @pmi0("checked")
    public static final AppsItemsConfirmItemAutoBuyCheckedDto CHECKED;
    public static final Parcelable.Creator<AppsItemsConfirmItemAutoBuyCheckedDto> CREATOR;

    @pmi0(C4217a2.e)
    public static final AppsItemsConfirmItemAutoBuyCheckedDto DISABLED;

    @pmi0("null")
    public static final AppsItemsConfirmItemAutoBuyCheckedDto NULL;

    @pmi0("unchecked")
    public static final AppsItemsConfirmItemAutoBuyCheckedDto UNCHECKED;
    private final String value;

    /* compiled from: AppsItemsConfirmItemAutoBuyCheckedDto.kt */
    public static final class a implements Parcelable.Creator<AppsItemsConfirmItemAutoBuyCheckedDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsItemsConfirmItemAutoBuyCheckedDto createFromParcel(Parcel parcel) {
            return AppsItemsConfirmItemAutoBuyCheckedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsItemsConfirmItemAutoBuyCheckedDto[] newArray(int i) {
            return new AppsItemsConfirmItemAutoBuyCheckedDto[i];
        }
    }

    static {
        AppsItemsConfirmItemAutoBuyCheckedDto appsItemsConfirmItemAutoBuyCheckedDto = new AppsItemsConfirmItemAutoBuyCheckedDto("CHECKED", 0, "checked");
        CHECKED = appsItemsConfirmItemAutoBuyCheckedDto;
        AppsItemsConfirmItemAutoBuyCheckedDto appsItemsConfirmItemAutoBuyCheckedDto2 = new AppsItemsConfirmItemAutoBuyCheckedDto("DISABLED", 1, C4217a2.e);
        DISABLED = appsItemsConfirmItemAutoBuyCheckedDto2;
        AppsItemsConfirmItemAutoBuyCheckedDto appsItemsConfirmItemAutoBuyCheckedDto3 = new AppsItemsConfirmItemAutoBuyCheckedDto("NULL", 2, "null");
        NULL = appsItemsConfirmItemAutoBuyCheckedDto3;
        AppsItemsConfirmItemAutoBuyCheckedDto appsItemsConfirmItemAutoBuyCheckedDto4 = new AppsItemsConfirmItemAutoBuyCheckedDto("UNCHECKED", 3, "unchecked");
        UNCHECKED = appsItemsConfirmItemAutoBuyCheckedDto4;
        AppsItemsConfirmItemAutoBuyCheckedDto[] appsItemsConfirmItemAutoBuyCheckedDtoArr = {appsItemsConfirmItemAutoBuyCheckedDto, appsItemsConfirmItemAutoBuyCheckedDto2, appsItemsConfirmItemAutoBuyCheckedDto3, appsItemsConfirmItemAutoBuyCheckedDto4};
        $VALUES = appsItemsConfirmItemAutoBuyCheckedDtoArr;
        $ENTRIES = new asp(appsItemsConfirmItemAutoBuyCheckedDtoArr);
        CREATOR = new a();
    }

    private AppsItemsConfirmItemAutoBuyCheckedDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsItemsConfirmItemAutoBuyCheckedDto valueOf(String str) {
        return (AppsItemsConfirmItemAutoBuyCheckedDto) Enum.valueOf(AppsItemsConfirmItemAutoBuyCheckedDto.class, str);
    }

    public static AppsItemsConfirmItemAutoBuyCheckedDto[] values() {
        return (AppsItemsConfirmItemAutoBuyCheckedDto[]) $VALUES.clone();
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
