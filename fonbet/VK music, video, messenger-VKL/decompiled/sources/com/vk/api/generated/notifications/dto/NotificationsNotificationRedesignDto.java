package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NotificationsNotificationRedesignDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationRedesignDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationRedesignDto> CREATOR = new a();

    @pmi0("action")
    private final NotificationsActionDto action;

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final NotificationsNotificationAttachmentDto attachment;

    @pmi0("buttons")
    private final NotificationsNotificationButtonsDto buttons;

    @pmi0("date")
    private final int date;

    @pmi0("dots_menu")
    private final List<NotificationsNotificationDotsMenuItemDto> dotsMenu;

    @pmi0("header")
    private final String header;

    @pmi0("hide_date")
    private final Boolean hideDate;

    @pmi0("id")
    private final String id;

    @pmi0("image")
    private final NotificationsNotificationImageDto image;

    @pmi0("show_csat")
    private final Boolean showCsat;

    @pmi0("text")
    private final String text;

    /* compiled from: NotificationsNotificationRedesignDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationRedesignDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationRedesignDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            NotificationsNotificationImageDto notificationsNotificationImageDto = (NotificationsNotificationImageDto) parcel.readParcelable(NotificationsNotificationRedesignDto.class.getClassLoader());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            NotificationsActionDto notificationsActionDto = (NotificationsActionDto) parcel.readParcelable(NotificationsNotificationRedesignDto.class.getClassLoader());
            NotificationsNotificationAttachmentDto notificationsNotificationAttachmentDto = (NotificationsNotificationAttachmentDto) parcel.readParcelable(NotificationsNotificationRedesignDto.class.getClassLoader());
            Boolean bool = null;
            NotificationsNotificationButtonsDto createFromParcel = parcel.readInt() == 0 ? null : NotificationsNotificationButtonsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(NotificationsNotificationRedesignDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NotificationsNotificationRedesignDto(readString, readInt, notificationsNotificationImageDto, readString2, readString3, notificationsActionDto, notificationsNotificationAttachmentDto, createFromParcel, arrayList, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationRedesignDto[] newArray(int i) {
            return new NotificationsNotificationRedesignDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsNotificationRedesignDto(String str, int i, NotificationsNotificationImageDto notificationsNotificationImageDto, String str2, String str3, NotificationsActionDto notificationsActionDto, NotificationsNotificationAttachmentDto notificationsNotificationAttachmentDto, NotificationsNotificationButtonsDto notificationsNotificationButtonsDto, List<? extends NotificationsNotificationDotsMenuItemDto> list, Boolean bool, Boolean bool2) {
        this.id = str;
        this.date = i;
        this.image = notificationsNotificationImageDto;
        this.header = str2;
        this.text = str3;
        this.action = notificationsActionDto;
        this.attachment = notificationsNotificationAttachmentDto;
        this.buttons = notificationsNotificationButtonsDto;
        this.dotsMenu = list;
        this.hideDate = bool;
        this.showCsat = bool2;
    }

    public final NotificationsActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NotificationsNotificationAttachmentDto e() {
        return this.attachment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationRedesignDto)) {
            return false;
        }
        NotificationsNotificationRedesignDto notificationsNotificationRedesignDto = (NotificationsNotificationRedesignDto) obj;
        return epx.f(this.id, notificationsNotificationRedesignDto.id) && this.date == notificationsNotificationRedesignDto.date && epx.f(this.image, notificationsNotificationRedesignDto.image) && epx.f(this.header, notificationsNotificationRedesignDto.header) && epx.f(this.text, notificationsNotificationRedesignDto.text) && epx.f(this.action, notificationsNotificationRedesignDto.action) && epx.f(this.attachment, notificationsNotificationRedesignDto.attachment) && epx.f(this.buttons, notificationsNotificationRedesignDto.buttons) && epx.f(this.dotsMenu, notificationsNotificationRedesignDto.dotsMenu) && epx.f(this.hideDate, notificationsNotificationRedesignDto.hideDate) && epx.f(this.showCsat, notificationsNotificationRedesignDto.showCsat);
    }

    public final NotificationsNotificationButtonsDto f() {
        return this.buttons;
    }

    public final int g() {
        return this.date;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a((this.image.hashCode() + shy.a(this.date, this.id.hashCode() * 31, 31)) * 31, 31, this.header), 31, this.text);
        NotificationsActionDto notificationsActionDto = this.action;
        int hashCode = (a2 + (notificationsActionDto == null ? 0 : notificationsActionDto.hashCode())) * 31;
        NotificationsNotificationAttachmentDto notificationsNotificationAttachmentDto = this.attachment;
        int hashCode2 = (hashCode + (notificationsNotificationAttachmentDto == null ? 0 : notificationsNotificationAttachmentDto.hashCode())) * 31;
        NotificationsNotificationButtonsDto notificationsNotificationButtonsDto = this.buttons;
        int hashCode3 = (hashCode2 + (notificationsNotificationButtonsDto == null ? 0 : notificationsNotificationButtonsDto.hashCode())) * 31;
        List<NotificationsNotificationDotsMenuItemDto> list = this.dotsMenu;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hideDate;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showCsat;
        return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final List<NotificationsNotificationDotsMenuItemDto> i() {
        return this.dotsMenu;
    }

    public final String j() {
        return this.header;
    }

    public final Boolean k() {
        return this.hideDate;
    }

    public final NotificationsNotificationImageDto l() {
        return this.image;
    }

    public final String n() {
        return this.text;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationRedesignDto(id=");
        sb.append(this.id);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", attachment=");
        sb.append(this.attachment);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", dotsMenu=");
        sb.append(this.dotsMenu);
        sb.append(", hideDate=");
        sb.append(this.hideDate);
        sb.append(", showCsat=");
        return tn.a(sb, this.showCsat, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.header);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.action, i);
        parcel.writeParcelable(this.attachment, i);
        NotificationsNotificationButtonsDto notificationsNotificationButtonsDto = this.buttons;
        if (notificationsNotificationButtonsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationButtonsDto.writeToParcel(parcel, i);
        }
        List<NotificationsNotificationDotsMenuItemDto> list = this.dotsMenu;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.hideDate;
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

    public /* synthetic */ NotificationsNotificationRedesignDto(String str, int i, NotificationsNotificationImageDto notificationsNotificationImageDto, String str2, String str3, NotificationsActionDto notificationsActionDto, NotificationsNotificationAttachmentDto notificationsNotificationAttachmentDto, NotificationsNotificationButtonsDto notificationsNotificationButtonsDto, List list, Boolean bool, Boolean bool2, int i2, zcl zclVar) {
        this(str, i, notificationsNotificationImageDto, str2, str3, (i2 & 32) != 0 ? null : notificationsActionDto, (i2 & 64) != 0 ? null : notificationsNotificationAttachmentDto, (i2 & 128) != 0 ? null : notificationsNotificationButtonsDto, (i2 & 256) != 0 ? null : list, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : bool2);
    }
}
