package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseGeoDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: NotificationsFeedbackDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsFeedbackDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsFeedbackDto> CREATOR = new a();

    @pmi0("attachments")
    private final List<WallWallpostAttachmentDto> attachments;

    @pmi0("from_id")
    private final Integer fromId;

    @pmi0("geo")
    private final BaseGeoDto geo;

    @pmi0("id")
    private final Integer id;

    @pmi0("likes")
    private final BaseLikesInfoDto likes;

    @pmi0("text")
    private final String text;

    @pmi0("to_id")
    private final Integer toId;

    /* compiled from: NotificationsFeedbackDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsFeedbackDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsFeedbackDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NotificationsFeedbackDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new NotificationsFeedbackDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : BaseGeoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BaseLikesInfoDto) parcel.readParcelable(NotificationsFeedbackDto.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsFeedbackDto[] newArray(int i) {
            return new NotificationsFeedbackDto[i];
        }
    }

    public NotificationsFeedbackDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsFeedbackDto)) {
            return false;
        }
        NotificationsFeedbackDto notificationsFeedbackDto = (NotificationsFeedbackDto) obj;
        return epx.f(this.attachments, notificationsFeedbackDto.attachments) && epx.f(this.fromId, notificationsFeedbackDto.fromId) && epx.f(this.geo, notificationsFeedbackDto.geo) && epx.f(this.id, notificationsFeedbackDto.id) && epx.f(this.likes, notificationsFeedbackDto.likes) && epx.f(this.text, notificationsFeedbackDto.text) && epx.f(this.toId, notificationsFeedbackDto.toId);
    }

    public final int hashCode() {
        List<WallWallpostAttachmentDto> list = this.attachments;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.fromId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode3 = (hashCode2 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        Integer num2 = this.id;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseLikesInfoDto baseLikesInfoDto = this.likes;
        int hashCode5 = (hashCode4 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
        String str = this.text;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.toId;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsFeedbackDto(attachments=");
        sb.append(this.attachments);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", geo=");
        sb.append(this.geo);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", likes=");
        sb.append(this.likes);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", toId=");
        return uqi.b(sb, this.toId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<WallWallpostAttachmentDto> list = this.attachments;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.fromId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        BaseGeoDto baseGeoDto = this.geo;
        if (baseGeoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseGeoDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.id;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.likes, i);
        parcel.writeString(this.text);
        Integer num3 = this.toId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public NotificationsFeedbackDto(List<WallWallpostAttachmentDto> list, Integer num, BaseGeoDto baseGeoDto, Integer num2, BaseLikesInfoDto baseLikesInfoDto, String str, Integer num3) {
        this.attachments = list;
        this.fromId = num;
        this.geo = baseGeoDto;
        this.id = num2;
        this.likes = baseLikesInfoDto;
        this.text = str;
        this.toId = num3;
    }

    public /* synthetic */ NotificationsFeedbackDto(List list, Integer num, BaseGeoDto baseGeoDto, Integer num2, BaseLikesInfoDto baseLikesInfoDto, String str, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : baseGeoDto, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : baseLikesInfoDto, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : num3);
    }
}
