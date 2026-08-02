package com.vk.api.generated.email.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: EmailCreationResponseDto.kt */
/* loaded from: classes14.dex */
public final class EmailCreationResponseDto implements Parcelable {
    public static final Parcelable.Creator<EmailCreationResponseDto> CREATOR = new a();

    @pmi0("reason")
    private final String reason;

    @pmi0("reason_code")
    private final Integer reasonCode;

    @pmi0("status")
    private final boolean status;

    @pmi0("suggestions")
    private final List<String> suggestions;

    @pmi0("username")
    private final String username;

    /* compiled from: EmailCreationResponseDto.kt */
    public static final class a implements Parcelable.Creator<EmailCreationResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EmailCreationResponseDto createFromParcel(Parcel parcel) {
            return new EmailCreationResponseDto(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final EmailCreationResponseDto[] newArray(int i) {
            return new EmailCreationResponseDto[i];
        }
    }

    public EmailCreationResponseDto(boolean z, String str, String str2, Integer num, List<String> list) {
        this.status = z;
        this.username = str;
        this.reason = str2;
        this.reasonCode = num;
        this.suggestions = list;
    }

    public final String d() {
        return this.reason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailCreationResponseDto)) {
            return false;
        }
        EmailCreationResponseDto emailCreationResponseDto = (EmailCreationResponseDto) obj;
        return this.status == emailCreationResponseDto.status && epx.f(this.username, emailCreationResponseDto.username) && epx.f(this.reason, emailCreationResponseDto.reason) && epx.f(this.reasonCode, emailCreationResponseDto.reasonCode) && epx.f(this.suggestions, emailCreationResponseDto.suggestions);
    }

    public final List<String> f() {
        return this.suggestions;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.status) * 31;
        String str = this.username;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reason;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.reasonCode;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.suggestions;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmailCreationResponseDto(status=");
        sb.append(this.status);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", reasonCode=");
        sb.append(this.reasonCode);
        sb.append(", suggestions=");
        return ms9.a(')', sb, this.suggestions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status ? 1 : 0);
        parcel.writeString(this.username);
        parcel.writeString(this.reason);
        Integer num = this.reasonCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.suggestions);
    }

    public /* synthetic */ EmailCreationResponseDto(boolean z, String str, String str2, Integer num, List list, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list);
    }
}
