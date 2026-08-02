package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.education.dto.EducationEducationConversationPayloadDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationPayloadDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationPayloadDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationPayloadDto> CREATOR = new a();

    @pmi0("edu")
    private final EducationEducationConversationPayloadDto edu;

    /* compiled from: MessagesConversationPayloadDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationPayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationPayloadDto createFromParcel(Parcel parcel) {
            return new MessagesConversationPayloadDto(parcel.readInt() == 0 ? null : EducationEducationConversationPayloadDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationPayloadDto[] newArray(int i) {
            return new MessagesConversationPayloadDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesConversationPayloadDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesConversationPayloadDto) && epx.f(this.edu, ((MessagesConversationPayloadDto) obj).edu);
    }

    public final int hashCode() {
        EducationEducationConversationPayloadDto educationEducationConversationPayloadDto = this.edu;
        if (educationEducationConversationPayloadDto == null) {
            return 0;
        }
        return educationEducationConversationPayloadDto.hashCode();
    }

    public final String toString() {
        return "MessagesConversationPayloadDto(edu=" + this.edu + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EducationEducationConversationPayloadDto educationEducationConversationPayloadDto = this.edu;
        if (educationEducationConversationPayloadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationEducationConversationPayloadDto.writeToParcel(parcel, i);
        }
    }

    public MessagesConversationPayloadDto(EducationEducationConversationPayloadDto educationEducationConversationPayloadDto) {
        this.edu = educationEducationConversationPayloadDto;
    }

    public /* synthetic */ MessagesConversationPayloadDto(EducationEducationConversationPayloadDto educationEducationConversationPayloadDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : educationEducationConversationPayloadDto);
    }
}
