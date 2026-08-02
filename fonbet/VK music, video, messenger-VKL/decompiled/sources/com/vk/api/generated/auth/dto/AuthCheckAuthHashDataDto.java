package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthCheckAuthHashDataDto.kt */
/* loaded from: classes14.dex */
public final class AuthCheckAuthHashDataDto implements Parcelable {
    public static final Parcelable.Creator<AuthCheckAuthHashDataDto> CREATOR = new a();

    @pmi0("agreements")
    private final List<String> agreements;

    @pmi0("device")
    private final String device;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0("location")
    private final String location;

    @pmi0("service")
    private final String service;

    @pmi0("user")
    private final AuthCheckAuthHashUserDto user;

    /* compiled from: AuthCheckAuthHashDataDto.kt */
    public static final class a implements Parcelable.Creator<AuthCheckAuthHashDataDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCheckAuthHashDataDto createFromParcel(Parcel parcel) {
            return new AuthCheckAuthHashDataDto(parcel.readInt() == 0 ? null : AuthCheckAuthHashUserDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCheckAuthHashDataDto[] newArray(int i) {
            return new AuthCheckAuthHashDataDto[i];
        }
    }

    public AuthCheckAuthHashDataDto() {
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
        if (!(obj instanceof AuthCheckAuthHashDataDto)) {
            return false;
        }
        AuthCheckAuthHashDataDto authCheckAuthHashDataDto = (AuthCheckAuthHashDataDto) obj;
        return epx.f(this.user, authCheckAuthHashDataDto.user) && epx.f(this.agreements, authCheckAuthHashDataDto.agreements) && epx.f(this.domain, authCheckAuthHashDataDto.domain) && epx.f(this.service, authCheckAuthHashDataDto.service) && epx.f(this.device, authCheckAuthHashDataDto.device) && epx.f(this.location, authCheckAuthHashDataDto.location);
    }

    public final int hashCode() {
        AuthCheckAuthHashUserDto authCheckAuthHashUserDto = this.user;
        int hashCode = (authCheckAuthHashUserDto == null ? 0 : authCheckAuthHashUserDto.hashCode()) * 31;
        List<String> list = this.agreements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.domain;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.service;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.device;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.location;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCheckAuthHashDataDto(user=");
        sb.append(this.user);
        sb.append(", agreements=");
        sb.append(this.agreements);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", location=");
        return ho8.a(sb, this.location, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AuthCheckAuthHashUserDto authCheckAuthHashUserDto = this.user;
        if (authCheckAuthHashUserDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authCheckAuthHashUserDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.agreements);
        parcel.writeString(this.domain);
        parcel.writeString(this.service);
        parcel.writeString(this.device);
        parcel.writeString(this.location);
    }

    public AuthCheckAuthHashDataDto(AuthCheckAuthHashUserDto authCheckAuthHashUserDto, List<String> list, String str, String str2, String str3, String str4) {
        this.user = authCheckAuthHashUserDto;
        this.agreements = list;
        this.domain = str;
        this.service = str2;
        this.device = str3;
        this.location = str4;
    }

    public /* synthetic */ AuthCheckAuthHashDataDto(AuthCheckAuthHashUserDto authCheckAuthHashUserDto, List list, String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : authCheckAuthHashUserDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
