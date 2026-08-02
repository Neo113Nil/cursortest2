package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesAddChatUserResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesAddChatUserResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesAddChatUserResponseDto> CREATOR = new a();

    @pmi0("failed_phone_numbers")
    private final List<String> failedPhoneNumbers;

    @pmi0("result")
    private final BaseBoolIntDto result;

    /* compiled from: MessagesAddChatUserResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesAddChatUserResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesAddChatUserResponseDto createFromParcel(Parcel parcel) {
            return new MessagesAddChatUserResponseDto((BaseBoolIntDto) parcel.readParcelable(MessagesAddChatUserResponseDto.class.getClassLoader()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesAddChatUserResponseDto[] newArray(int i) {
            return new MessagesAddChatUserResponseDto[i];
        }
    }

    public MessagesAddChatUserResponseDto(BaseBoolIntDto baseBoolIntDto, List<String> list) {
        this.result = baseBoolIntDto;
        this.failedPhoneNumbers = list;
    }

    public final BaseBoolIntDto d() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesAddChatUserResponseDto)) {
            return false;
        }
        MessagesAddChatUserResponseDto messagesAddChatUserResponseDto = (MessagesAddChatUserResponseDto) obj;
        return this.result == messagesAddChatUserResponseDto.result && epx.f(this.failedPhoneNumbers, messagesAddChatUserResponseDto.failedPhoneNumbers);
    }

    public final int hashCode() {
        int hashCode = this.result.hashCode() * 31;
        List<String> list = this.failedPhoneNumbers;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesAddChatUserResponseDto(result=");
        sb.append(this.result);
        sb.append(", failedPhoneNumbers=");
        return ms9.a(')', sb, this.failedPhoneNumbers);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.result, i);
        parcel.writeStringList(this.failedPhoneNumbers);
    }

    public /* synthetic */ MessagesAddChatUserResponseDto(BaseBoolIntDto baseBoolIntDto, List list, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : list);
    }
}
