package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthSignupResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthSignupResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthSignupResponseDto> CREATOR = new a();

    @pmi0("code_only_numbers")
    private final Integer codeOnlyNumbers;

    @pmi0("hash")
    private final String hash;

    @pmi0("libverify_support")
    private final Integer libverifySupport;

    @pmi0("mid")
    private final UserId mid;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("success")
    private final Boolean success;

    /* compiled from: AuthSignupResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthSignupResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSignupResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Integer num;
            Integer num2;
            Integer valueOf2;
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(AuthSignupResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
                num = null;
            }
            String readString2 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? num : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num3 = valueOf3;
                valueOf2 = num;
                num2 = num3;
            } else {
                num2 = valueOf3;
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new AuthSignupResponseDto(readString, userId, valueOf, readString2, num2, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSignupResponseDto[] newArray(int i) {
            return new AuthSignupResponseDto[i];
        }
    }

    public AuthSignupResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSignupResponseDto)) {
            return false;
        }
        AuthSignupResponseDto authSignupResponseDto = (AuthSignupResponseDto) obj;
        return epx.f(this.sid, authSignupResponseDto.sid) && epx.f(this.mid, authSignupResponseDto.mid) && epx.f(this.success, authSignupResponseDto.success) && epx.f(this.hash, authSignupResponseDto.hash) && epx.f(this.codeOnlyNumbers, authSignupResponseDto.codeOnlyNumbers) && epx.f(this.libverifySupport, authSignupResponseDto.libverifySupport);
    }

    public final int hashCode() {
        String str = this.sid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.mid;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool = this.success;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.hash;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.codeOnlyNumbers;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.libverifySupport;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSignupResponseDto(sid=");
        sb.append(this.sid);
        sb.append(", mid=");
        sb.append(this.mid);
        sb.append(", success=");
        sb.append(this.success);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", codeOnlyNumbers=");
        sb.append(this.codeOnlyNumbers);
        sb.append(", libverifySupport=");
        return uqi.b(sb, this.libverifySupport, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeParcelable(this.mid, i);
        Boolean bool = this.success;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.hash);
        Integer num = this.codeOnlyNumbers;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.libverifySupport;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public AuthSignupResponseDto(String str, UserId userId, Boolean bool, String str2, Integer num, Integer num2) {
        this.sid = str;
        this.mid = userId;
        this.success = bool;
        this.hash = str2;
        this.codeOnlyNumbers = num;
        this.libverifySupport = num2;
    }

    public /* synthetic */ AuthSignupResponseDto(String str, UserId userId, Boolean bool, String str2, Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2);
    }
}
