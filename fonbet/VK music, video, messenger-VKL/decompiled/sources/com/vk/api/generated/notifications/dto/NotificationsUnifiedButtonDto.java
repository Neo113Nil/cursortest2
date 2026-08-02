package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: NotificationsUnifiedButtonDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnifiedButtonDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnifiedButtonDto> CREATOR = new a();

    @pmi0("action")
    private final NotificationsUnifiedActionDto action;

    @pmi0("color")
    private final String color;

    @pmi0("destructive")
    private final Boolean destructive;

    @pmi0("icon")
    private final String icon;

    @pmi0("label")
    private final String label;

    @pmi0("short_label")
    private final String shortLabel;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    /* compiled from: NotificationsUnifiedButtonDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnifiedButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedButtonDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            NotificationsUnifiedActionDto createFromParcel = NotificationsUnifiedActionDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NotificationsUnifiedButtonDto(readString, createFromParcel, readString2, readString3, readString4, readString5, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedButtonDto[] newArray(int i) {
            return new NotificationsUnifiedButtonDto[i];
        }
    }

    public NotificationsUnifiedButtonDto(String str, NotificationsUnifiedActionDto notificationsUnifiedActionDto, String str2, String str3, String str4, String str5, Boolean bool) {
        this.label = str;
        this.action = notificationsUnifiedActionDto;
        this.style = str2;
        this.color = str3;
        this.shortLabel = str4;
        this.icon = str5;
        this.destructive = bool;
    }

    public static NotificationsUnifiedButtonDto a(NotificationsUnifiedButtonDto notificationsUnifiedButtonDto, NotificationsUnifiedActionDto notificationsUnifiedActionDto) {
        return new NotificationsUnifiedButtonDto(notificationsUnifiedButtonDto.label, notificationsUnifiedActionDto, notificationsUnifiedButtonDto.style, notificationsUnifiedButtonDto.color, notificationsUnifiedButtonDto.shortLabel, notificationsUnifiedButtonDto.icon, notificationsUnifiedButtonDto.destructive);
    }

    public final NotificationsUnifiedActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsUnifiedButtonDto)) {
            return false;
        }
        NotificationsUnifiedButtonDto notificationsUnifiedButtonDto = (NotificationsUnifiedButtonDto) obj;
        return epx.f(this.label, notificationsUnifiedButtonDto.label) && epx.f(this.action, notificationsUnifiedButtonDto.action) && epx.f(this.style, notificationsUnifiedButtonDto.style) && epx.f(this.color, notificationsUnifiedButtonDto.color) && epx.f(this.shortLabel, notificationsUnifiedButtonDto.shortLabel) && epx.f(this.icon, notificationsUnifiedButtonDto.icon) && epx.f(this.destructive, notificationsUnifiedButtonDto.destructive);
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + (this.label.hashCode() * 31)) * 31;
        String str = this.style;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortLabel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.destructive;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsUnifiedButtonDto(label=");
        sb.append(this.label);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", shortLabel=");
        sb.append(this.shortLabel);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", destructive=");
        return tn.a(sb, this.destructive, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        this.action.writeToParcel(parcel, i);
        parcel.writeString(this.style);
        parcel.writeString(this.color);
        parcel.writeString(this.shortLabel);
        parcel.writeString(this.icon);
        Boolean bool = this.destructive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ NotificationsUnifiedButtonDto(String str, NotificationsUnifiedActionDto notificationsUnifiedActionDto, String str2, String str3, String str4, String str5, Boolean bool, int i, zcl zclVar) {
        this(str, notificationsUnifiedActionDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool);
    }
}
