package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthSetAuthCodeStatusResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthSetAuthCodeStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthSetAuthCodeStatusResponseDto> CREATOR = new a();

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final Integer expiresIn;

    @pmi0("faq_url")
    private final String faqUrl;

    @pmi0("polling_delay")
    private final Integer pollingDelay;

    @pmi0("status")
    private final Integer status;

    /* compiled from: AuthSetAuthCodeStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthSetAuthCodeStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSetAuthCodeStatusResponseDto createFromParcel(Parcel parcel) {
            return new AuthSetAuthCodeStatusResponseDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSetAuthCodeStatusResponseDto[] newArray(int i) {
            return new AuthSetAuthCodeStatusResponseDto[i];
        }
    }

    public AuthSetAuthCodeStatusResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final String d() {
        return this.domain;
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
        if (!(obj instanceof AuthSetAuthCodeStatusResponseDto)) {
            return false;
        }
        AuthSetAuthCodeStatusResponseDto authSetAuthCodeStatusResponseDto = (AuthSetAuthCodeStatusResponseDto) obj;
        return epx.f(this.status, authSetAuthCodeStatusResponseDto.status) && epx.f(this.expiresIn, authSetAuthCodeStatusResponseDto.expiresIn) && epx.f(this.pollingDelay, authSetAuthCodeStatusResponseDto.pollingDelay) && epx.f(this.faqUrl, authSetAuthCodeStatusResponseDto.faqUrl) && epx.f(this.domain, authSetAuthCodeStatusResponseDto.domain);
    }

    public final String f() {
        return this.faqUrl;
    }

    public final Integer g() {
        return this.pollingDelay;
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expiresIn;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pollingDelay;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.faqUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.domain;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSetAuthCodeStatusResponseDto(status=");
        sb.append(this.status);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", pollingDelay=");
        sb.append(this.pollingDelay);
        sb.append(", faqUrl=");
        sb.append(this.faqUrl);
        sb.append(", domain=");
        return ho8.a(sb, this.domain, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.expiresIn;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.pollingDelay;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.faqUrl);
        parcel.writeString(this.domain);
    }

    public AuthSetAuthCodeStatusResponseDto(Integer num, Integer num2, Integer num3, String str, String str2) {
        this.status = num;
        this.expiresIn = num2;
        this.pollingDelay = num3;
        this.faqUrl = str;
        this.domain = str2;
    }

    public /* synthetic */ AuthSetAuthCodeStatusResponseDto(Integer num, Integer num2, Integer num3, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
