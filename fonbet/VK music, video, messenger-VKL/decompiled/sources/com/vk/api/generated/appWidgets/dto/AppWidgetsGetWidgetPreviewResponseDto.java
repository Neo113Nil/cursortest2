package com.vk.api.generated.appWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppWidgetsGetWidgetPreviewResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppWidgetsGetWidgetPreviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppWidgetsGetWidgetPreviewResponseDto> CREATOR = new a();

    @pmi0("is_installed")
    private final Boolean isInstalled;

    @pmi0("privacy")
    private final String privacy;

    @pmi0("privacy_code")
    private final PrivacyCodeDto privacyCode;

    @pmi0("widget")
    private final AppWidgetsPreviewWidgetDto widget;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppWidgetsGetWidgetPreviewResponseDto.kt */
    public static final class PrivacyCodeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PrivacyCodeDto[] $VALUES;

        @pmi0("0")
        public static final PrivacyCodeDto ADMINS;
        public static final Parcelable.Creator<PrivacyCodeDto> CREATOR;

        @pmi0("2")
        public static final PrivacyCodeDto EVERYONE;

        @pmi0("3")
        public static final PrivacyCodeDto NO_ONE;

        @pmi0("1")
        public static final PrivacyCodeDto SUBSCRIBERS;
        private final int value;

        /* compiled from: AppWidgetsGetWidgetPreviewResponseDto.kt */
        public static final class a implements Parcelable.Creator<PrivacyCodeDto> {
            @Override // android.os.Parcelable.Creator
            public final PrivacyCodeDto createFromParcel(Parcel parcel) {
                return PrivacyCodeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PrivacyCodeDto[] newArray(int i) {
                return new PrivacyCodeDto[i];
            }
        }

        static {
            PrivacyCodeDto privacyCodeDto = new PrivacyCodeDto("ADMINS", 0, 0);
            ADMINS = privacyCodeDto;
            PrivacyCodeDto privacyCodeDto2 = new PrivacyCodeDto("SUBSCRIBERS", 1, 1);
            SUBSCRIBERS = privacyCodeDto2;
            PrivacyCodeDto privacyCodeDto3 = new PrivacyCodeDto("EVERYONE", 2, 2);
            EVERYONE = privacyCodeDto3;
            PrivacyCodeDto privacyCodeDto4 = new PrivacyCodeDto("NO_ONE", 3, 3);
            NO_ONE = privacyCodeDto4;
            PrivacyCodeDto[] privacyCodeDtoArr = {privacyCodeDto, privacyCodeDto2, privacyCodeDto3, privacyCodeDto4};
            $VALUES = privacyCodeDtoArr;
            $ENTRIES = new asp(privacyCodeDtoArr);
            CREATOR = new a();
        }

        private PrivacyCodeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static PrivacyCodeDto valueOf(String str) {
            return (PrivacyCodeDto) Enum.valueOf(PrivacyCodeDto.class, str);
        }

        public static PrivacyCodeDto[] values() {
            return (PrivacyCodeDto[]) $VALUES.clone();
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

    /* compiled from: AppWidgetsGetWidgetPreviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppWidgetsGetWidgetPreviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppWidgetsGetWidgetPreviewResponseDto createFromParcel(Parcel parcel) {
            AppWidgetsPreviewWidgetDto createFromParcel = AppWidgetsPreviewWidgetDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            Boolean bool = null;
            PrivacyCodeDto createFromParcel2 = parcel.readInt() == 0 ? null : PrivacyCodeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppWidgetsGetWidgetPreviewResponseDto(createFromParcel, readString, createFromParcel2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AppWidgetsGetWidgetPreviewResponseDto[] newArray(int i) {
            return new AppWidgetsGetWidgetPreviewResponseDto[i];
        }
    }

    public AppWidgetsGetWidgetPreviewResponseDto(AppWidgetsPreviewWidgetDto appWidgetsPreviewWidgetDto, String str, PrivacyCodeDto privacyCodeDto, Boolean bool) {
        this.widget = appWidgetsPreviewWidgetDto;
        this.privacy = str;
        this.privacyCode = privacyCodeDto;
        this.isInstalled = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppWidgetsGetWidgetPreviewResponseDto)) {
            return false;
        }
        AppWidgetsGetWidgetPreviewResponseDto appWidgetsGetWidgetPreviewResponseDto = (AppWidgetsGetWidgetPreviewResponseDto) obj;
        return epx.f(this.widget, appWidgetsGetWidgetPreviewResponseDto.widget) && epx.f(this.privacy, appWidgetsGetWidgetPreviewResponseDto.privacy) && this.privacyCode == appWidgetsGetWidgetPreviewResponseDto.privacyCode && epx.f(this.isInstalled, appWidgetsGetWidgetPreviewResponseDto.isInstalled);
    }

    public final int hashCode() {
        int hashCode = this.widget.hashCode() * 31;
        String str = this.privacy;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PrivacyCodeDto privacyCodeDto = this.privacyCode;
        int hashCode3 = (hashCode2 + (privacyCodeDto == null ? 0 : privacyCodeDto.hashCode())) * 31;
        Boolean bool = this.isInstalled;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppWidgetsGetWidgetPreviewResponseDto(widget=");
        sb.append(this.widget);
        sb.append(", privacy=");
        sb.append(this.privacy);
        sb.append(", privacyCode=");
        sb.append(this.privacyCode);
        sb.append(", isInstalled=");
        return tn.a(sb, this.isInstalled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.widget.writeToParcel(parcel, i);
        parcel.writeString(this.privacy);
        PrivacyCodeDto privacyCodeDto = this.privacyCode;
        if (privacyCodeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            privacyCodeDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isInstalled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AppWidgetsGetWidgetPreviewResponseDto(AppWidgetsPreviewWidgetDto appWidgetsPreviewWidgetDto, String str, PrivacyCodeDto privacyCodeDto, Boolean bool, int i, zcl zclVar) {
        this(appWidgetsPreviewWidgetDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : privacyCodeDto, (i & 8) != 0 ? null : bool);
    }
}
