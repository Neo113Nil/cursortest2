package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: EducationEducationConversationPayloadDto.kt */
/* loaded from: classes14.dex */
public final class EducationEducationConversationPayloadDto implements Parcelable {
    public static final Parcelable.Creator<EducationEducationConversationPayloadDto> CREATOR = new a();

    @pmi0("chat_link")
    private final String chatLink;

    @pmi0("education_class_info")
    private final EducationClassInfoDto educationClassInfo;

    /* compiled from: EducationEducationConversationPayloadDto.kt */
    public static final class a implements Parcelable.Creator<EducationEducationConversationPayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationEducationConversationPayloadDto createFromParcel(Parcel parcel) {
            return new EducationEducationConversationPayloadDto(parcel.readInt() == 0 ? null : EducationClassInfoDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationEducationConversationPayloadDto[] newArray(int i) {
            return new EducationEducationConversationPayloadDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EducationEducationConversationPayloadDto() {
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
        if (!(obj instanceof EducationEducationConversationPayloadDto)) {
            return false;
        }
        EducationEducationConversationPayloadDto educationEducationConversationPayloadDto = (EducationEducationConversationPayloadDto) obj;
        return epx.f(this.educationClassInfo, educationEducationConversationPayloadDto.educationClassInfo) && epx.f(this.chatLink, educationEducationConversationPayloadDto.chatLink);
    }

    public final int hashCode() {
        EducationClassInfoDto educationClassInfoDto = this.educationClassInfo;
        int hashCode = (educationClassInfoDto == null ? 0 : educationClassInfoDto.hashCode()) * 31;
        String str = this.chatLink;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationEducationConversationPayloadDto(educationClassInfo=");
        sb.append(this.educationClassInfo);
        sb.append(", chatLink=");
        return ho8.a(sb, this.chatLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EducationClassInfoDto educationClassInfoDto = this.educationClassInfo;
        if (educationClassInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationClassInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.chatLink);
    }

    public EducationEducationConversationPayloadDto(EducationClassInfoDto educationClassInfoDto, String str) {
        this.educationClassInfo = educationClassInfoDto;
        this.chatLink = str;
    }

    public /* synthetic */ EducationEducationConversationPayloadDto(EducationClassInfoDto educationClassInfoDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : educationClassInfoDto, (i & 2) != 0 ? null : str);
    }
}
