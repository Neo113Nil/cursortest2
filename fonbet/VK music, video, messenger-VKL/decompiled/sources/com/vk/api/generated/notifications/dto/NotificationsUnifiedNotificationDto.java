package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsUnifiedNotificationDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnifiedNotificationDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnifiedNotificationDto> CREATOR = new a();

    @pmi0("action")
    private final NotificationsUnifiedActionDto action;

    @pmi0("action_buttons")
    private final NotificationsActionButtonsDto actionButtons;

    @pmi0("additional_item")
    private final NotificationsUnifiedEntityDto additionalItem;

    @pmi0("attachments")
    private final List<NotificationsUnifiedEntityDto> attachments;

    @pmi0("button_hide")
    private final Boolean buttonHide;

    @pmi0("buttons")
    private final List<NotificationsUnifiedButtonDto> buttons;

    @pmi0("date")
    private final int date;

    @pmi0("footer")
    private final String footer;

    @pmi0("header")
    private final String header;

    @pmi0("hide_buttons")
    private final List<NotificationsUnifiedButtonDto> hideButtons;

    @pmi0("icon_type")
    private final String iconType;

    @pmi0(CampaignEx.JSON_KEY_ICON_URL)
    private final String iconUrl;

    @pmi0("id")
    private final String id;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("main_item")
    private final NotificationsUnifiedEntityDto mainItem;

    @pmi0("show_csat")
    private final Boolean showCsat;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsUnifiedNotificationDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("notifications_unified_notification")
        public static final InnerTypeDto NOTIFICATIONS_UNIFIED_NOTIFICATION;
        private final String value;

        /* compiled from: NotificationsUnifiedNotificationDto.kt */
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
            InnerTypeDto innerTypeDto = new InnerTypeDto("NOTIFICATIONS_UNIFIED_NOTIFICATION", 0, "notifications_unified_notification");
            NOTIFICATIONS_UNIFIED_NOTIFICATION = innerTypeDto;
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

    /* compiled from: NotificationsUnifiedNotificationDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnifiedNotificationDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedNotificationDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            NotificationsUnifiedActionDto notificationsUnifiedActionDto;
            String str;
            boolean z;
            Boolean valueOf;
            Boolean valueOf2;
            InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            NotificationsUnifiedEntityDto createFromParcel2 = NotificationsUnifiedEntityDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(NotificationsUnifiedButtonDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            NotificationsActionButtonsDto createFromParcel3 = parcel.readInt() == 0 ? null : NotificationsActionButtonsDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList4 = arrayList;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int i2 = 0;
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt3);
                while (i2 != readInt3) {
                    i2 = en.a(NotificationsUnifiedEntityDto.CREATOR, parcel, arrayList5, i2, 1);
                    createFromParcel3 = createFromParcel3;
                }
                arrayList2 = arrayList5;
            }
            NotificationsActionButtonsDto notificationsActionButtonsDto = createFromParcel3;
            NotificationsUnifiedEntityDto createFromParcel4 = parcel.readInt() == 0 ? null : NotificationsUnifiedEntityDto.CREATOR.createFromParcel(parcel);
            NotificationsUnifiedActionDto createFromParcel5 = parcel.readInt() == 0 ? null : NotificationsUnifiedActionDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                notificationsUnifiedActionDto = createFromParcel5;
                str = readString;
                z = true;
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                notificationsUnifiedActionDto = createFromParcel5;
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = en.a(NotificationsUnifiedButtonDto.CREATOR, parcel, arrayList3, i3, 1);
                    createFromParcel = createFromParcel;
                    readString = readString;
                }
                str = readString;
                z = true;
            }
            InnerTypeDto innerTypeDto = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            return new NotificationsUnifiedNotificationDto(innerTypeDto, str, readInt, createFromParcel2, arrayList4, notificationsActionButtonsDto, readString2, readString3, readString4, readString5, readString6, arrayList2, createFromParcel4, notificationsUnifiedActionDto, arrayList3, valueOf, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedNotificationDto[] newArray(int i) {
            return new NotificationsUnifiedNotificationDto[i];
        }
    }

    public NotificationsUnifiedNotificationDto(InnerTypeDto innerTypeDto, String str, int i, NotificationsUnifiedEntityDto notificationsUnifiedEntityDto, List<NotificationsUnifiedButtonDto> list, NotificationsActionButtonsDto notificationsActionButtonsDto, String str2, String str3, String str4, String str5, String str6, List<NotificationsUnifiedEntityDto> list2, NotificationsUnifiedEntityDto notificationsUnifiedEntityDto2, NotificationsUnifiedActionDto notificationsUnifiedActionDto, List<NotificationsUnifiedButtonDto> list3, Boolean bool, Boolean bool2) {
        this.innerType = innerTypeDto;
        this.id = str;
        this.date = i;
        this.mainItem = notificationsUnifiedEntityDto;
        this.hideButtons = list;
        this.actionButtons = notificationsActionButtonsDto;
        this.iconType = str2;
        this.iconUrl = str3;
        this.text = str4;
        this.footer = str5;
        this.header = str6;
        this.attachments = list2;
        this.additionalItem = notificationsUnifiedEntityDto2;
        this.action = notificationsUnifiedActionDto;
        this.buttons = list3;
        this.buttonHide = bool;
        this.showCsat = bool2;
    }

    public static NotificationsUnifiedNotificationDto a(NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto, NotificationsUnifiedEntityDto notificationsUnifiedEntityDto, ArrayList arrayList, NotificationsActionButtonsDto notificationsActionButtonsDto, ArrayList arrayList2, NotificationsUnifiedEntityDto notificationsUnifiedEntityDto2, NotificationsUnifiedActionDto notificationsUnifiedActionDto, ArrayList arrayList3) {
        return new NotificationsUnifiedNotificationDto(notificationsUnifiedNotificationDto.innerType, notificationsUnifiedNotificationDto.id, notificationsUnifiedNotificationDto.date, notificationsUnifiedEntityDto, arrayList, notificationsActionButtonsDto, notificationsUnifiedNotificationDto.iconType, notificationsUnifiedNotificationDto.iconUrl, notificationsUnifiedNotificationDto.text, notificationsUnifiedNotificationDto.footer, notificationsUnifiedNotificationDto.header, arrayList2, notificationsUnifiedEntityDto2, notificationsUnifiedActionDto, arrayList3, notificationsUnifiedNotificationDto.buttonHide, notificationsUnifiedNotificationDto.showCsat);
    }

    public final NotificationsUnifiedActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NotificationsActionButtonsDto e() {
        return this.actionButtons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsUnifiedNotificationDto)) {
            return false;
        }
        NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto = (NotificationsUnifiedNotificationDto) obj;
        return this.innerType == notificationsUnifiedNotificationDto.innerType && epx.f(this.id, notificationsUnifiedNotificationDto.id) && this.date == notificationsUnifiedNotificationDto.date && epx.f(this.mainItem, notificationsUnifiedNotificationDto.mainItem) && epx.f(this.hideButtons, notificationsUnifiedNotificationDto.hideButtons) && epx.f(this.actionButtons, notificationsUnifiedNotificationDto.actionButtons) && epx.f(this.iconType, notificationsUnifiedNotificationDto.iconType) && epx.f(this.iconUrl, notificationsUnifiedNotificationDto.iconUrl) && epx.f(this.text, notificationsUnifiedNotificationDto.text) && epx.f(this.footer, notificationsUnifiedNotificationDto.footer) && epx.f(this.header, notificationsUnifiedNotificationDto.header) && epx.f(this.attachments, notificationsUnifiedNotificationDto.attachments) && epx.f(this.additionalItem, notificationsUnifiedNotificationDto.additionalItem) && epx.f(this.action, notificationsUnifiedNotificationDto.action) && epx.f(this.buttons, notificationsUnifiedNotificationDto.buttons) && epx.f(this.buttonHide, notificationsUnifiedNotificationDto.buttonHide) && epx.f(this.showCsat, notificationsUnifiedNotificationDto.showCsat);
    }

    public final NotificationsUnifiedEntityDto f() {
        return this.additionalItem;
    }

    public final List<NotificationsUnifiedEntityDto> g() {
        return this.attachments;
    }

    public final int hashCode() {
        int hashCode = (this.mainItem.hashCode() + shy.a(this.date, urd0.a(this.innerType.hashCode() * 31, 31, this.id), 31)) * 31;
        List<NotificationsUnifiedButtonDto> list = this.hideButtons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NotificationsActionButtonsDto notificationsActionButtonsDto = this.actionButtons;
        int hashCode3 = (hashCode2 + (notificationsActionButtonsDto == null ? 0 : notificationsActionButtonsDto.hashCode())) * 31;
        String str = this.iconType;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.footer;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.header;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<NotificationsUnifiedEntityDto> list2 = this.attachments;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        NotificationsUnifiedEntityDto notificationsUnifiedEntityDto = this.additionalItem;
        int hashCode10 = (hashCode9 + (notificationsUnifiedEntityDto == null ? 0 : notificationsUnifiedEntityDto.hashCode())) * 31;
        NotificationsUnifiedActionDto notificationsUnifiedActionDto = this.action;
        int hashCode11 = (hashCode10 + (notificationsUnifiedActionDto == null ? 0 : notificationsUnifiedActionDto.hashCode())) * 31;
        List<NotificationsUnifiedButtonDto> list3 = this.buttons;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.buttonHide;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showCsat;
        return hashCode13 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final List<NotificationsUnifiedButtonDto> i() {
        return this.buttons;
    }

    public final List<NotificationsUnifiedButtonDto> j() {
        return this.hideButtons;
    }

    public final NotificationsUnifiedEntityDto k() {
        return this.mainItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsUnifiedNotificationDto(innerType=");
        sb.append(this.innerType);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", mainItem=");
        sb.append(this.mainItem);
        sb.append(", hideButtons=");
        sb.append(this.hideButtons);
        sb.append(", actionButtons=");
        sb.append(this.actionButtons);
        sb.append(", iconType=");
        sb.append(this.iconType);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", footer=");
        sb.append(this.footer);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", additionalItem=");
        sb.append(this.additionalItem);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", buttonHide=");
        sb.append(this.buttonHide);
        sb.append(", showCsat=");
        return tn.a(sb, this.showCsat, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        parcel.writeString(this.id);
        parcel.writeInt(this.date);
        this.mainItem.writeToParcel(parcel, i);
        List<NotificationsUnifiedButtonDto> list = this.hideButtons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NotificationsUnifiedButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        NotificationsActionButtonsDto notificationsActionButtonsDto = this.actionButtons;
        if (notificationsActionButtonsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsActionButtonsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.iconType);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.text);
        parcel.writeString(this.footer);
        parcel.writeString(this.header);
        List<NotificationsUnifiedEntityDto> list2 = this.attachments;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((NotificationsUnifiedEntityDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        NotificationsUnifiedEntityDto notificationsUnifiedEntityDto = this.additionalItem;
        if (notificationsUnifiedEntityDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsUnifiedEntityDto.writeToParcel(parcel, i);
        }
        NotificationsUnifiedActionDto notificationsUnifiedActionDto = this.action;
        if (notificationsUnifiedActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsUnifiedActionDto.writeToParcel(parcel, i);
        }
        List<NotificationsUnifiedButtonDto> list3 = this.buttons;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((NotificationsUnifiedButtonDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.buttonHide;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showCsat;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ NotificationsUnifiedNotificationDto(InnerTypeDto innerTypeDto, String str, int i, NotificationsUnifiedEntityDto notificationsUnifiedEntityDto, List list, NotificationsActionButtonsDto notificationsActionButtonsDto, String str2, String str3, String str4, String str5, String str6, List list2, NotificationsUnifiedEntityDto notificationsUnifiedEntityDto2, NotificationsUnifiedActionDto notificationsUnifiedActionDto, List list3, Boolean bool, Boolean bool2, int i2, zcl zclVar) {
        this(innerTypeDto, str, i, notificationsUnifiedEntityDto, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : notificationsActionButtonsDto, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : list2, (i2 & 4096) != 0 ? null : notificationsUnifiedEntityDto2, (i2 & 8192) != 0 ? null : notificationsUnifiedActionDto, (i2 & 16384) != 0 ? null : list3, (32768 & i2) != 0 ? null : bool, (i2 & 65536) != 0 ? null : bool2);
    }
}
