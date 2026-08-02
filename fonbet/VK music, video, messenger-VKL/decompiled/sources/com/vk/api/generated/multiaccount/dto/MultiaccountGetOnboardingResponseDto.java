package com.vk.api.generated.multiaccount.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MultiaccountGetOnboardingResponseDto.kt */
/* loaded from: classes15.dex */
public final class MultiaccountGetOnboardingResponseDto implements Parcelable {
    public static final Parcelable.Creator<MultiaccountGetOnboardingResponseDto> CREATOR = new a();

    @pmi0("account")
    private final Boolean account;

    @pmi0("longtap")
    private final boolean longtap;

    @pmi0("multiacc")
    private final boolean multiacc;

    @pmi0("pic_url_info")
    private final String picUrlInfo;

    @pmi0("sharing")
    private final Boolean sharing;

    @pmi0("url_info")
    private final String urlInfo;

    /* compiled from: MultiaccountGetOnboardingResponseDto.kt */
    public static final class a implements Parcelable.Creator<MultiaccountGetOnboardingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MultiaccountGetOnboardingResponseDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            boolean z3 = false;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String readString = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z2 : z);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = z2;
                }
                bool = Boolean.valueOf(z);
            }
            return new MultiaccountGetOnboardingResponseDto(z4, z3, readString, valueOf, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiaccountGetOnboardingResponseDto[] newArray(int i) {
            return new MultiaccountGetOnboardingResponseDto[i];
        }
    }

    public MultiaccountGetOnboardingResponseDto(boolean z, boolean z2, String str, Boolean bool, Boolean bool2, String str2) {
        this.longtap = z;
        this.multiacc = z2;
        this.urlInfo = str;
        this.account = bool;
        this.sharing = bool2;
        this.picUrlInfo = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiaccountGetOnboardingResponseDto)) {
            return false;
        }
        MultiaccountGetOnboardingResponseDto multiaccountGetOnboardingResponseDto = (MultiaccountGetOnboardingResponseDto) obj;
        return this.longtap == multiaccountGetOnboardingResponseDto.longtap && this.multiacc == multiaccountGetOnboardingResponseDto.multiacc && epx.f(this.urlInfo, multiaccountGetOnboardingResponseDto.urlInfo) && epx.f(this.account, multiaccountGetOnboardingResponseDto.account) && epx.f(this.sharing, multiaccountGetOnboardingResponseDto.sharing) && epx.f(this.picUrlInfo, multiaccountGetOnboardingResponseDto.picUrlInfo);
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(Boolean.hashCode(this.longtap) * 31, 31, this.multiacc), 31, this.urlInfo);
        Boolean bool = this.account;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.sharing;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.picUrlInfo;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiaccountGetOnboardingResponseDto(longtap=");
        sb.append(this.longtap);
        sb.append(", multiacc=");
        sb.append(this.multiacc);
        sb.append(", urlInfo=");
        sb.append(this.urlInfo);
        sb.append(", account=");
        sb.append(this.account);
        sb.append(", sharing=");
        sb.append(this.sharing);
        sb.append(", picUrlInfo=");
        return ho8.a(sb, this.picUrlInfo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.longtap ? 1 : 0);
        parcel.writeInt(this.multiacc ? 1 : 0);
        parcel.writeString(this.urlInfo);
        Boolean bool = this.account;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.sharing;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.picUrlInfo);
    }

    public /* synthetic */ MultiaccountGetOnboardingResponseDto(boolean z, boolean z2, String str, Boolean bool, Boolean bool2, String str2, int i, zcl zclVar) {
        this(z, z2, str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : str2);
    }
}
