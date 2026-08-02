package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AuthSilentProviderDto.kt */
/* loaded from: classes14.dex */
public final class AuthSilentProviderDto implements Parcelable {
    public static final Parcelable.Creator<AuthSilentProviderDto> CREATOR = new a();

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("is_provider")
    private final Boolean isProvider;

    @pmi0("pkg")
    private final String pkg;

    @pmi0("sha256")
    private final String sha256;

    @pmi0("universal_link")
    private final String universalLink;

    @pmi0("weight")
    private final Integer weight;

    /* compiled from: AuthSilentProviderDto.kt */
    public static final class a implements Parcelable.Creator<AuthSilentProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSilentProviderDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthSilentProviderDto(readString, readString2, valueOf, valueOf2, readString3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSilentProviderDto[] newArray(int i) {
            return new AuthSilentProviderDto[i];
        }
    }

    public AuthSilentProviderDto() {
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
        if (!(obj instanceof AuthSilentProviderDto)) {
            return false;
        }
        AuthSilentProviderDto authSilentProviderDto = (AuthSilentProviderDto) obj;
        return epx.f(this.pkg, authSilentProviderDto.pkg) && epx.f(this.sha256, authSilentProviderDto.sha256) && epx.f(this.appId, authSilentProviderDto.appId) && epx.f(this.weight, authSilentProviderDto.weight) && epx.f(this.universalLink, authSilentProviderDto.universalLink) && epx.f(this.isProvider, authSilentProviderDto.isProvider);
    }

    public final int hashCode() {
        String str = this.pkg;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sha256;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.appId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.weight;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.universalLink;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isProvider;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSilentProviderDto(pkg=");
        sb.append(this.pkg);
        sb.append(", sha256=");
        sb.append(this.sha256);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", universalLink=");
        sb.append(this.universalLink);
        sb.append(", isProvider=");
        return tn.a(sb, this.isProvider, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pkg);
        parcel.writeString(this.sha256);
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.weight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.universalLink);
        Boolean bool = this.isProvider;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public AuthSilentProviderDto(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.pkg = str;
        this.sha256 = str2;
        this.appId = num;
        this.weight = num2;
        this.universalLink = str3;
        this.isProvider = bool;
    }

    public /* synthetic */ AuthSilentProviderDto(String str, String str2, Integer num, Integer num2, String str3, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool);
    }
}
