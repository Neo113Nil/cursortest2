package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsNotificationSettingsSectionItemDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingsSectionItemDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationSettingsSectionItemDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("description")
    private final String description;

    @pmi0("hint_example")
    private final NotificationsUnifiedNotificationDto hintExample;

    @pmi0("hint_text")
    private final String hintText;

    @pmi0("icon_type")
    private final String iconType;

    @pmi0(CampaignEx.JSON_KEY_ICON_URL)
    private final String iconUrl;

    @pmi0("id")
    private final String id;

    @pmi0("inner_label")
    private final String innerLabel;

    @pmi0("label")
    private final String label;

    @pmi0("push_key")
    private final String pushKey;

    @pmi0("push_value")
    private final PushValueDto pushValue;

    @pmi0("settings")
    private final List<NotificationsNotificationSettingDto> settings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsNotificationSettingsSectionItemDto.kt */
    public static final class PushValueDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PushValueDto[] $VALUES;
        public static final Parcelable.Creator<PushValueDto> CREATOR;

        @pmi0("off")
        public static final PushValueDto OFF;

        @pmi0("on")
        public static final PushValueDto ON;
        private final String value;

        /* compiled from: NotificationsNotificationSettingsSectionItemDto.kt */
        public static final class a implements Parcelable.Creator<PushValueDto> {
            @Override // android.os.Parcelable.Creator
            public final PushValueDto createFromParcel(Parcel parcel) {
                return PushValueDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PushValueDto[] newArray(int i) {
                return new PushValueDto[i];
            }
        }

        static {
            PushValueDto pushValueDto = new PushValueDto("ON", 0, "on");
            ON = pushValueDto;
            PushValueDto pushValueDto2 = new PushValueDto("OFF", 1, "off");
            OFF = pushValueDto2;
            PushValueDto[] pushValueDtoArr = {pushValueDto, pushValueDto2};
            $VALUES = pushValueDtoArr;
            $ENTRIES = new asp(pushValueDtoArr);
            CREATOR = new a();
        }

        private PushValueDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PushValueDto valueOf(String str) {
            return (PushValueDto) Enum.valueOf(PushValueDto.class, str);
        }

        public static PushValueDto[] values() {
            return (PushValueDto[]) $VALUES.clone();
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

    /* compiled from: NotificationsNotificationSettingsSectionItemDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingsSectionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingsSectionItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NotificationsNotificationSettingDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NotificationsNotificationSettingsSectionItemDto(readString, readString2, readString3, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PushValueDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? NotificationsUnifiedNotificationDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingsSectionItemDto[] newArray(int i) {
            return new NotificationsNotificationSettingsSectionItemDto[i];
        }
    }

    public NotificationsNotificationSettingsSectionItemDto(String str, String str2, String str3, List<NotificationsNotificationSettingDto> list, String str4, String str5, Integer num, String str6, String str7, PushValueDto pushValueDto, String str8, NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto) {
        this.id = str;
        this.label = str2;
        this.innerLabel = str3;
        this.settings = list;
        this.iconType = str4;
        this.description = str5;
        this.count = num;
        this.iconUrl = str6;
        this.pushKey = str7;
        this.pushValue = pushValueDto;
        this.hintText = str8;
        this.hintExample = notificationsUnifiedNotificationDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationSettingsSectionItemDto)) {
            return false;
        }
        NotificationsNotificationSettingsSectionItemDto notificationsNotificationSettingsSectionItemDto = (NotificationsNotificationSettingsSectionItemDto) obj;
        return epx.f(this.id, notificationsNotificationSettingsSectionItemDto.id) && epx.f(this.label, notificationsNotificationSettingsSectionItemDto.label) && epx.f(this.innerLabel, notificationsNotificationSettingsSectionItemDto.innerLabel) && epx.f(this.settings, notificationsNotificationSettingsSectionItemDto.settings) && epx.f(this.iconType, notificationsNotificationSettingsSectionItemDto.iconType) && epx.f(this.description, notificationsNotificationSettingsSectionItemDto.description) && epx.f(this.count, notificationsNotificationSettingsSectionItemDto.count) && epx.f(this.iconUrl, notificationsNotificationSettingsSectionItemDto.iconUrl) && epx.f(this.pushKey, notificationsNotificationSettingsSectionItemDto.pushKey) && this.pushValue == notificationsNotificationSettingsSectionItemDto.pushValue && epx.f(this.hintText, notificationsNotificationSettingsSectionItemDto.hintText) && epx.f(this.hintExample, notificationsNotificationSettingsSectionItemDto.hintExample);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.label), 31, this.innerLabel), 31, this.settings), 31, this.iconType);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pushKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PushValueDto pushValueDto = this.pushValue;
        int hashCode5 = (hashCode4 + (pushValueDto == null ? 0 : pushValueDto.hashCode())) * 31;
        String str4 = this.hintText;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto = this.hintExample;
        return hashCode6 + (notificationsUnifiedNotificationDto != null ? notificationsUnifiedNotificationDto.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsNotificationSettingsSectionItemDto(id=" + this.id + ", label=" + this.label + ", innerLabel=" + this.innerLabel + ", settings=" + this.settings + ", iconType=" + this.iconType + ", description=" + this.description + ", count=" + this.count + ", iconUrl=" + this.iconUrl + ", pushKey=" + this.pushKey + ", pushValue=" + this.pushValue + ", hintText=" + this.hintText + ", hintExample=" + this.hintExample + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.label);
        parcel.writeString(this.innerLabel);
        Iterator a2 = ao.a(parcel, this.settings);
        while (a2.hasNext()) {
            ((NotificationsNotificationSettingDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.iconType);
        parcel.writeString(this.description);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.pushKey);
        PushValueDto pushValueDto = this.pushValue;
        if (pushValueDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pushValueDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.hintText);
        NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto = this.hintExample;
        if (notificationsUnifiedNotificationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsUnifiedNotificationDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NotificationsNotificationSettingsSectionItemDto(String str, String str2, String str3, List list, String str4, String str5, Integer num, String str6, String str7, PushValueDto pushValueDto, String str8, NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto, int i, zcl zclVar) {
        this(str, str2, str3, list, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : pushValueDto, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : notificationsUnifiedNotificationDto);
    }
}
