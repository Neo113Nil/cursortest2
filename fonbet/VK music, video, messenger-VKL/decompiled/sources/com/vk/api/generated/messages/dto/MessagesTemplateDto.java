package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesTemplateDto.kt */
/* loaded from: classes15.dex */
public final class MessagesTemplateDto implements Parcelable {
    public static final Parcelable.Creator<MessagesTemplateDto> CREATOR = new a();

    @pmi0("creation_time")
    private final int creationTime;

    @pmi0("creator_id")
    private final UserId creatorId;

    @pmi0("editor_id")
    private final UserId editorId;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("text")
    private final String text;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("usages_all_time")
    private final int usagesAllTime;

    @pmi0("usages_week")
    private final int usagesWeek;

    /* compiled from: MessagesTemplateDto.kt */
    public static final class a implements Parcelable.Creator<MessagesTemplateDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesTemplateDto createFromParcel(Parcel parcel) {
            return new MessagesTemplateDto(parcel.readInt(), (UserId) parcel.readParcelable(MessagesTemplateDto.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), (UserId) parcel.readParcelable(MessagesTemplateDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesTemplateDto[] newArray(int i) {
            return new MessagesTemplateDto[i];
        }
    }

    public MessagesTemplateDto(int i, UserId userId, int i2, String str, String str2, int i3, int i4, UserId userId2, Integer num) {
        this.creationTime = i;
        this.creatorId = userId;
        this.id = i2;
        this.name = str;
        this.text = str2;
        this.usagesAllTime = i3;
        this.usagesWeek = i4;
        this.editorId = userId2;
        this.updateTime = num;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesTemplateDto)) {
            return false;
        }
        MessagesTemplateDto messagesTemplateDto = (MessagesTemplateDto) obj;
        return this.creationTime == messagesTemplateDto.creationTime && epx.f(this.creatorId, messagesTemplateDto.creatorId) && this.id == messagesTemplateDto.id && epx.f(this.name, messagesTemplateDto.name) && epx.f(this.text, messagesTemplateDto.text) && this.usagesAllTime == messagesTemplateDto.usagesAllTime && this.usagesWeek == messagesTemplateDto.usagesWeek && epx.f(this.editorId, messagesTemplateDto.editorId) && epx.f(this.updateTime, messagesTemplateDto.updateTime);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.usagesWeek, shy.a(this.usagesAllTime, urd0.a(urd0.a(shy.a(this.id, bh10.a(Integer.hashCode(this.creationTime) * 31, 31, this.creatorId.b), 31), 31, this.name), 31, this.text), 31), 31);
        UserId userId = this.editorId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.updateTime;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesTemplateDto(creationTime=");
        sb.append(this.creationTime);
        sb.append(", creatorId=");
        sb.append(this.creatorId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", usagesAllTime=");
        sb.append(this.usagesAllTime);
        sb.append(", usagesWeek=");
        sb.append(this.usagesWeek);
        sb.append(", editorId=");
        sb.append(this.editorId);
        sb.append(", updateTime=");
        return uqi.b(sb, this.updateTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.creationTime);
        parcel.writeParcelable(this.creatorId, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.text);
        parcel.writeInt(this.usagesAllTime);
        parcel.writeInt(this.usagesWeek);
        parcel.writeParcelable(this.editorId, i);
        Integer num = this.updateTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MessagesTemplateDto(int i, UserId userId, int i2, String str, String str2, int i3, int i4, UserId userId2, Integer num, int i5, zcl zclVar) {
        this(i, userId, i2, str, str2, i3, i4, (i5 & 128) != 0 ? null : userId2, (i5 & 256) != 0 ? null : num);
    }
}
