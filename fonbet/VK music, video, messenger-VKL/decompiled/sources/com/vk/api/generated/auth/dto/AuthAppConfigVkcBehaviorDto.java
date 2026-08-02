package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AuthAppConfigVkcBehaviorDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigVkcBehaviorDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigVkcBehaviorDto> CREATOR = new a();

    @pmi0("allow_without_phone")
    private final Boolean allowWithoutPhone;

    @pmi0("hide_oauth")
    private final Boolean hideOauth;

    @pmi0("hide_youla_match")
    private final Boolean hideYoulaMatch;

    @pmi0("is_email_auth_allowed")
    private final Boolean isEmailAuthAllowed;

    @pmi0("skin")
    private final String skin;

    @pmi0("skip_url")
    private final String skipUrl;

    /* compiled from: AuthAppConfigVkcBehaviorDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigVkcBehaviorDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigVkcBehaviorDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean bool;
            Boolean valueOf4;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
                bool = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                bool = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = bool;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthAppConfigVkcBehaviorDto(valueOf, valueOf2, valueOf3, readString, valueOf4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigVkcBehaviorDto[] newArray(int i) {
            return new AuthAppConfigVkcBehaviorDto[i];
        }
    }

    public AuthAppConfigVkcBehaviorDto() {
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
        if (!(obj instanceof AuthAppConfigVkcBehaviorDto)) {
            return false;
        }
        AuthAppConfigVkcBehaviorDto authAppConfigVkcBehaviorDto = (AuthAppConfigVkcBehaviorDto) obj;
        return epx.f(this.isEmailAuthAllowed, authAppConfigVkcBehaviorDto.isEmailAuthAllowed) && epx.f(this.hideOauth, authAppConfigVkcBehaviorDto.hideOauth) && epx.f(this.hideYoulaMatch, authAppConfigVkcBehaviorDto.hideYoulaMatch) && epx.f(this.skipUrl, authAppConfigVkcBehaviorDto.skipUrl) && epx.f(this.allowWithoutPhone, authAppConfigVkcBehaviorDto.allowWithoutPhone) && epx.f(this.skin, authAppConfigVkcBehaviorDto.skin);
    }

    public final int hashCode() {
        Boolean bool = this.isEmailAuthAllowed;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hideOauth;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hideYoulaMatch;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.skipUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.allowWithoutPhone;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.skin;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthAppConfigVkcBehaviorDto(isEmailAuthAllowed=");
        sb.append(this.isEmailAuthAllowed);
        sb.append(", hideOauth=");
        sb.append(this.hideOauth);
        sb.append(", hideYoulaMatch=");
        sb.append(this.hideYoulaMatch);
        sb.append(", skipUrl=");
        sb.append(this.skipUrl);
        sb.append(", allowWithoutPhone=");
        sb.append(this.allowWithoutPhone);
        sb.append(", skin=");
        return ho8.a(sb, this.skin, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isEmailAuthAllowed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hideOauth;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.hideYoulaMatch;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.skipUrl);
        Boolean bool4 = this.allowWithoutPhone;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeString(this.skin);
    }

    public AuthAppConfigVkcBehaviorDto(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2) {
        this.isEmailAuthAllowed = bool;
        this.hideOauth = bool2;
        this.hideYoulaMatch = bool3;
        this.skipUrl = str;
        this.allowWithoutPhone = bool4;
        this.skin = str2;
    }

    public /* synthetic */ AuthAppConfigVkcBehaviorDto(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2);
    }
}
