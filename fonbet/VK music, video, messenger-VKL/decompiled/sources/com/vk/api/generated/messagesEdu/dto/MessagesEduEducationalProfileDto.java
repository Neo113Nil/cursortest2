package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesEduEducationalProfileDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduEducationalProfileDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduEducationalProfileDto> CREATOR = new a();

    @pmi0("edu_roles")
    private final MessagesEduEduRolesDto eduRoles;

    @pmi0("schedule")
    private final MessagesEduUserScheduleDto schedule;

    /* compiled from: MessagesEduEducationalProfileDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduEducationalProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduEducationalProfileDto createFromParcel(Parcel parcel) {
            return new MessagesEduEducationalProfileDto(parcel.readInt() == 0 ? null : MessagesEduEduRolesDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MessagesEduUserScheduleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduEducationalProfileDto[] newArray(int i) {
            return new MessagesEduEducationalProfileDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesEduEducationalProfileDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduEducationalProfileDto)) {
            return false;
        }
        MessagesEduEducationalProfileDto messagesEduEducationalProfileDto = (MessagesEduEducationalProfileDto) obj;
        return epx.f(this.eduRoles, messagesEduEducationalProfileDto.eduRoles) && epx.f(this.schedule, messagesEduEducationalProfileDto.schedule);
    }

    public final int hashCode() {
        MessagesEduEduRolesDto messagesEduEduRolesDto = this.eduRoles;
        int hashCode = (messagesEduEduRolesDto == null ? 0 : messagesEduEduRolesDto.hashCode()) * 31;
        MessagesEduUserScheduleDto messagesEduUserScheduleDto = this.schedule;
        return hashCode + (messagesEduUserScheduleDto != null ? messagesEduUserScheduleDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesEduEducationalProfileDto(eduRoles=" + this.eduRoles + ", schedule=" + this.schedule + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesEduEduRolesDto messagesEduEduRolesDto = this.eduRoles;
        if (messagesEduEduRolesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesEduEduRolesDto.writeToParcel(parcel, i);
        }
        MessagesEduUserScheduleDto messagesEduUserScheduleDto = this.schedule;
        if (messagesEduUserScheduleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesEduUserScheduleDto.writeToParcel(parcel, i);
        }
    }

    public MessagesEduEducationalProfileDto(MessagesEduEduRolesDto messagesEduEduRolesDto, MessagesEduUserScheduleDto messagesEduUserScheduleDto) {
        this.eduRoles = messagesEduEduRolesDto;
        this.schedule = messagesEduUserScheduleDto;
    }

    public /* synthetic */ MessagesEduEducationalProfileDto(MessagesEduEduRolesDto messagesEduEduRolesDto, MessagesEduUserScheduleDto messagesEduUserScheduleDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesEduEduRolesDto, (i & 2) != 0 ? null : messagesEduUserScheduleDto);
    }
}
