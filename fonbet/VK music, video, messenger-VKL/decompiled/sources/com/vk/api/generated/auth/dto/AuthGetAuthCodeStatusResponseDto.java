package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthGetAuthCodeStatusResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthCodeStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthCodeStatusResponseDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
    private final String accessToken;

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final Integer expiresIn;

    @pmi0("status")
    private final Integer status;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("user_session")
    private final List<AuthGetAuthCodeStatusUserSessionDto> userSession;

    /* compiled from: AuthGetAuthCodeStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthCodeStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthCodeStatusResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId = (UserId) parcel.readParcelable(AuthGetAuthCodeStatusResponseDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AuthGetAuthCodeStatusUserSessionDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AuthGetAuthCodeStatusResponseDto(valueOf, readString, valueOf2, userId, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthCodeStatusResponseDto[] newArray(int i) {
            return new AuthGetAuthCodeStatusResponseDto[i];
        }
    }

    public AuthGetAuthCodeStatusResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.accessToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.expiresIn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthCodeStatusResponseDto)) {
            return false;
        }
        AuthGetAuthCodeStatusResponseDto authGetAuthCodeStatusResponseDto = (AuthGetAuthCodeStatusResponseDto) obj;
        return epx.f(this.status, authGetAuthCodeStatusResponseDto.status) && epx.f(this.accessToken, authGetAuthCodeStatusResponseDto.accessToken) && epx.f(this.expiresIn, authGetAuthCodeStatusResponseDto.expiresIn) && epx.f(this.userId, authGetAuthCodeStatusResponseDto.userId) && epx.f(this.userSession, authGetAuthCodeStatusResponseDto.userSession);
    }

    public final Integer f() {
        return this.status;
    }

    public final List<AuthGetAuthCodeStatusUserSessionDto> g() {
        return this.userSession;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.accessToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.expiresIn;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<AuthGetAuthCodeStatusUserSessionDto> list = this.userSession;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthCodeStatusResponseDto(status=");
        sb.append(this.status);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", userSession=");
        return ms9.a(')', sb, this.userSession);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.accessToken);
        Integer num2 = this.expiresIn;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.userId, i);
        List<AuthGetAuthCodeStatusUserSessionDto> list = this.userSession;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AuthGetAuthCodeStatusUserSessionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public AuthGetAuthCodeStatusResponseDto(Integer num, String str, Integer num2, UserId userId, List<AuthGetAuthCodeStatusUserSessionDto> list) {
        this.status = num;
        this.accessToken = str;
        this.expiresIn = num2;
        this.userId = userId;
        this.userSession = list;
    }

    public /* synthetic */ AuthGetAuthCodeStatusResponseDto(Integer num, String str, Integer num2, UserId userId, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : list);
    }
}
