package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesAddTemplateResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesAddTemplateResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesAddTemplateResponseDto> CREATOR = new a();

    @pmi0("template_id")
    private final Integer templateId;

    /* compiled from: MessagesAddTemplateResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesAddTemplateResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesAddTemplateResponseDto createFromParcel(Parcel parcel) {
            return new MessagesAddTemplateResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesAddTemplateResponseDto[] newArray(int i) {
            return new MessagesAddTemplateResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesAddTemplateResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.templateId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesAddTemplateResponseDto) && epx.f(this.templateId, ((MessagesAddTemplateResponseDto) obj).templateId);
    }

    public final int hashCode() {
        Integer num = this.templateId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("MessagesAddTemplateResponseDto(templateId="), this.templateId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.templateId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MessagesAddTemplateResponseDto(Integer num) {
        this.templateId = num;
    }

    public /* synthetic */ MessagesAddTemplateResponseDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
