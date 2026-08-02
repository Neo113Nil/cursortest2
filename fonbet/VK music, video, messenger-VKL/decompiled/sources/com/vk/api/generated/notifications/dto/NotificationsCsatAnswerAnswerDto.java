package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsCsatAnswerAnswerDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsCsatAnswerAnswerDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationsCsatAnswerAnswerDto[] $VALUES;
    public static final Parcelable.Creator<NotificationsCsatAnswerAnswerDto> CREATOR;

    @pmi0("no")
    public static final NotificationsCsatAnswerAnswerDto NO;

    @pmi0("not_sure")
    public static final NotificationsCsatAnswerAnswerDto NOT_SURE;

    @pmi0("1")
    public static final NotificationsCsatAnswerAnswerDto TYPE_1;

    @pmi0("2")
    public static final NotificationsCsatAnswerAnswerDto TYPE_2;

    @pmi0("3")
    public static final NotificationsCsatAnswerAnswerDto TYPE_3;

    @pmi0("4")
    public static final NotificationsCsatAnswerAnswerDto TYPE_4;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final NotificationsCsatAnswerAnswerDto TYPE_5;

    @pmi0("yes")
    public static final NotificationsCsatAnswerAnswerDto YES;
    private final String value;

    /* compiled from: NotificationsCsatAnswerAnswerDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsCsatAnswerAnswerDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsCsatAnswerAnswerDto createFromParcel(Parcel parcel) {
            return NotificationsCsatAnswerAnswerDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsCsatAnswerAnswerDto[] newArray(int i) {
            return new NotificationsCsatAnswerAnswerDto[i];
        }
    }

    static {
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto = new NotificationsCsatAnswerAnswerDto("TYPE_1", 0, "1");
        TYPE_1 = notificationsCsatAnswerAnswerDto;
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto2 = new NotificationsCsatAnswerAnswerDto("TYPE_2", 1, "2");
        TYPE_2 = notificationsCsatAnswerAnswerDto2;
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto3 = new NotificationsCsatAnswerAnswerDto("TYPE_3", 2, "3");
        TYPE_3 = notificationsCsatAnswerAnswerDto3;
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto4 = new NotificationsCsatAnswerAnswerDto("TYPE_4", 3, "4");
        TYPE_4 = notificationsCsatAnswerAnswerDto4;
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto5 = new NotificationsCsatAnswerAnswerDto("TYPE_5", 4, CampaignEx.CLICKMODE_ON);
        TYPE_5 = notificationsCsatAnswerAnswerDto5;
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto6 = new NotificationsCsatAnswerAnswerDto("NO", 5, "no");
        NO = notificationsCsatAnswerAnswerDto6;
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto7 = new NotificationsCsatAnswerAnswerDto("NOT_SURE", 6, "not_sure");
        NOT_SURE = notificationsCsatAnswerAnswerDto7;
        NotificationsCsatAnswerAnswerDto notificationsCsatAnswerAnswerDto8 = new NotificationsCsatAnswerAnswerDto("YES", 7, "yes");
        YES = notificationsCsatAnswerAnswerDto8;
        NotificationsCsatAnswerAnswerDto[] notificationsCsatAnswerAnswerDtoArr = {notificationsCsatAnswerAnswerDto, notificationsCsatAnswerAnswerDto2, notificationsCsatAnswerAnswerDto3, notificationsCsatAnswerAnswerDto4, notificationsCsatAnswerAnswerDto5, notificationsCsatAnswerAnswerDto6, notificationsCsatAnswerAnswerDto7, notificationsCsatAnswerAnswerDto8};
        $VALUES = notificationsCsatAnswerAnswerDtoArr;
        $ENTRIES = new asp(notificationsCsatAnswerAnswerDtoArr);
        CREATOR = new a();
    }

    private NotificationsCsatAnswerAnswerDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NotificationsCsatAnswerAnswerDto valueOf(String str) {
        return (NotificationsCsatAnswerAnswerDto) Enum.valueOf(NotificationsCsatAnswerAnswerDto.class, str);
    }

    public static NotificationsCsatAnswerAnswerDto[] values() {
        return (NotificationsCsatAnswerAnswerDto[]) $VALUES.clone();
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
