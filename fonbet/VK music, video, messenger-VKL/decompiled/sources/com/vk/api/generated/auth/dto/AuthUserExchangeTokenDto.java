package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserProfileTypeDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthUserExchangeTokenDto.kt */
/* loaded from: classes14.dex */
public final class AuthUserExchangeTokenDto implements Parcelable {
    public static final Parcelable.Creator<AuthUserExchangeTokenDto> CREATOR = new a();

    @pmi0("common_token")
    private final String commonToken;

    @pmi0("profile_type")
    private final UsersUserProfileTypeDto profileType;

    @pmi0("tier_tokens")
    private final List<AuthExchangeTokenDto> tierTokens;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: AuthUserExchangeTokenDto.kt */
    public static final class a implements Parcelable.Creator<AuthUserExchangeTokenDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthUserExchangeTokenDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UserId userId = (UserId) parcel.readParcelable(AuthUserExchangeTokenDto.class.getClassLoader());
            UsersUserProfileTypeDto usersUserProfileTypeDto = (UsersUserProfileTypeDto) parcel.readParcelable(AuthUserExchangeTokenDto.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AuthExchangeTokenDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AuthUserExchangeTokenDto(userId, usersUserProfileTypeDto, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthUserExchangeTokenDto[] newArray(int i) {
            return new AuthUserExchangeTokenDto[i];
        }
    }

    public AuthUserExchangeTokenDto(UserId userId, UsersUserProfileTypeDto usersUserProfileTypeDto, String str, List<AuthExchangeTokenDto> list) {
        this.userId = userId;
        this.profileType = usersUserProfileTypeDto;
        this.commonToken = str;
        this.tierTokens = list;
    }

    public final String d() {
        return this.commonToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthUserExchangeTokenDto)) {
            return false;
        }
        AuthUserExchangeTokenDto authUserExchangeTokenDto = (AuthUserExchangeTokenDto) obj;
        return epx.f(this.userId, authUserExchangeTokenDto.userId) && this.profileType == authUserExchangeTokenDto.profileType && epx.f(this.commonToken, authUserExchangeTokenDto.commonToken) && epx.f(this.tierTokens, authUserExchangeTokenDto.tierTokens);
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.userId.b) * 31;
        UsersUserProfileTypeDto usersUserProfileTypeDto = this.profileType;
        int hashCode2 = (hashCode + (usersUserProfileTypeDto == null ? 0 : usersUserProfileTypeDto.hashCode())) * 31;
        String str = this.commonToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<AuthExchangeTokenDto> list = this.tierTokens;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthUserExchangeTokenDto(userId=");
        sb.append(this.userId);
        sb.append(", profileType=");
        sb.append(this.profileType);
        sb.append(", commonToken=");
        sb.append(this.commonToken);
        sb.append(", tierTokens=");
        return ms9.a(')', sb, this.tierTokens);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
        parcel.writeParcelable(this.profileType, i);
        parcel.writeString(this.commonToken);
        List<AuthExchangeTokenDto> list = this.tierTokens;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AuthExchangeTokenDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AuthUserExchangeTokenDto(UserId userId, UsersUserProfileTypeDto usersUserProfileTypeDto, String str, List list, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : usersUserProfileTypeDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
    }
}
