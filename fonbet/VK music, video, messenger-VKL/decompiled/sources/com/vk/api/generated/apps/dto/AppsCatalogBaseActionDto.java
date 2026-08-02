package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsCatalogBaseActionDto.kt */
/* loaded from: classes14.dex */
public final class AppsCatalogBaseActionDto implements Parcelable {
    public static final Parcelable.Creator<AppsCatalogBaseActionDto> CREATOR = new a();

    @pmi0("app_launch_params")
    private final AppsCatalogBaseAppLaunchParamsDto appLaunchParams;

    @pmi0("modal_type")
    private final ModalTypeDto modalType;

    @pmi0("type")
    private final AppsCatalogBaseActionTypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsCatalogBaseActionDto.kt */
    public static final class ModalTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ModalTypeDto[] $VALUES;

        @pmi0("achievement_what_inside")
        public static final ModalTypeDto ACHIEVEMENT_WHAT_INSIDE;
        public static final Parcelable.Creator<ModalTypeDto> CREATOR;

        @pmi0("fake_modal_for_enum")
        public static final ModalTypeDto FAKE_MODAL_FOR_ENUM;
        private final String value;

        /* compiled from: AppsCatalogBaseActionDto.kt */
        public static final class a implements Parcelable.Creator<ModalTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ModalTypeDto createFromParcel(Parcel parcel) {
                return ModalTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModalTypeDto[] newArray(int i) {
                return new ModalTypeDto[i];
            }
        }

        static {
            ModalTypeDto modalTypeDto = new ModalTypeDto("ACHIEVEMENT_WHAT_INSIDE", 0, "achievement_what_inside");
            ACHIEVEMENT_WHAT_INSIDE = modalTypeDto;
            ModalTypeDto modalTypeDto2 = new ModalTypeDto("FAKE_MODAL_FOR_ENUM", 1, "fake_modal_for_enum");
            FAKE_MODAL_FOR_ENUM = modalTypeDto2;
            ModalTypeDto[] modalTypeDtoArr = {modalTypeDto, modalTypeDto2};
            $VALUES = modalTypeDtoArr;
            $ENTRIES = new asp(modalTypeDtoArr);
            CREATOR = new a();
        }

        private ModalTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ModalTypeDto valueOf(String str) {
            return (ModalTypeDto) Enum.valueOf(ModalTypeDto.class, str);
        }

        public static ModalTypeDto[] values() {
            return (ModalTypeDto[]) $VALUES.clone();
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

    /* compiled from: AppsCatalogBaseActionDto.kt */
    public static final class a implements Parcelable.Creator<AppsCatalogBaseActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBaseActionDto createFromParcel(Parcel parcel) {
            return new AppsCatalogBaseActionDto(AppsCatalogBaseActionTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppsCatalogBaseAppLaunchParamsDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? ModalTypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCatalogBaseActionDto[] newArray(int i) {
            return new AppsCatalogBaseActionDto[i];
        }
    }

    public AppsCatalogBaseActionDto(AppsCatalogBaseActionTypeDto appsCatalogBaseActionTypeDto, AppsCatalogBaseAppLaunchParamsDto appsCatalogBaseAppLaunchParamsDto, String str, ModalTypeDto modalTypeDto) {
        this.type = appsCatalogBaseActionTypeDto;
        this.appLaunchParams = appsCatalogBaseAppLaunchParamsDto;
        this.url = str;
        this.modalType = modalTypeDto;
    }

    public final AppsCatalogBaseAppLaunchParamsDto d() {
        return this.appLaunchParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsCatalogBaseActionTypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCatalogBaseActionDto)) {
            return false;
        }
        AppsCatalogBaseActionDto appsCatalogBaseActionDto = (AppsCatalogBaseActionDto) obj;
        return this.type == appsCatalogBaseActionDto.type && epx.f(this.appLaunchParams, appsCatalogBaseActionDto.appLaunchParams) && epx.f(this.url, appsCatalogBaseActionDto.url) && this.modalType == appsCatalogBaseActionDto.modalType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        AppsCatalogBaseAppLaunchParamsDto appsCatalogBaseAppLaunchParamsDto = this.appLaunchParams;
        int hashCode2 = (hashCode + (appsCatalogBaseAppLaunchParamsDto == null ? 0 : appsCatalogBaseAppLaunchParamsDto.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ModalTypeDto modalTypeDto = this.modalType;
        return hashCode3 + (modalTypeDto != null ? modalTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsCatalogBaseActionDto(type=" + this.type + ", appLaunchParams=" + this.appLaunchParams + ", url=" + this.url + ", modalType=" + this.modalType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        AppsCatalogBaseAppLaunchParamsDto appsCatalogBaseAppLaunchParamsDto = this.appLaunchParams;
        if (appsCatalogBaseAppLaunchParamsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsCatalogBaseAppLaunchParamsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        ModalTypeDto modalTypeDto = this.modalType;
        if (modalTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            modalTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsCatalogBaseActionDto(AppsCatalogBaseActionTypeDto appsCatalogBaseActionTypeDto, AppsCatalogBaseAppLaunchParamsDto appsCatalogBaseAppLaunchParamsDto, String str, ModalTypeDto modalTypeDto, int i, zcl zclVar) {
        this(appsCatalogBaseActionTypeDto, (i & 2) != 0 ? null : appsCatalogBaseAppLaunchParamsDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : modalTypeDto);
    }
}
