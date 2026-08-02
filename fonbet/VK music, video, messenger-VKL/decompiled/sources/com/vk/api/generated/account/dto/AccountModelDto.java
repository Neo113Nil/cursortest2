package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountModelDto.kt */
/* loaded from: classes14.dex */
public final class AccountModelDto implements Parcelable {
    public static final Parcelable.Creator<AccountModelDto> CREATOR = new a();

    @pmi0(L2.g)
    private final boolean background;

    @pmi0("encrypted")
    private final boolean encrypted;

    @pmi0("meta_url")
    private final String metaUrl;

    @pmi0("meta_version")
    private final Integer metaVersion;

    @pmi0("name")
    private final String name;

    @pmi0("url")
    private final String url;

    @pmi0("version")
    private final int version;

    /* compiled from: AccountModelDto.kt */
    public static final class a implements Parcelable.Creator<AccountModelDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountModelDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString = parcel.readString();
            boolean z3 = true;
            String readString2 = parcel.readString();
            boolean z4 = z2;
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                z3 = z4;
            }
            return new AccountModelDto(z, readString, readString2, readInt, z3, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountModelDto[] newArray(int i) {
            return new AccountModelDto[i];
        }
    }

    public AccountModelDto(boolean z, String str, String str2, int i, boolean z2, String str3, Integer num) {
        this.background = z;
        this.name = str;
        this.url = str2;
        this.version = i;
        this.encrypted = z2;
        this.metaUrl = str3;
        this.metaVersion = num;
    }

    public final boolean d() {
        return this.encrypted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.metaUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountModelDto)) {
            return false;
        }
        AccountModelDto accountModelDto = (AccountModelDto) obj;
        return this.background == accountModelDto.background && epx.f(this.name, accountModelDto.name) && epx.f(this.url, accountModelDto.url) && this.version == accountModelDto.version && this.encrypted == accountModelDto.encrypted && epx.f(this.metaUrl, accountModelDto.metaUrl) && epx.f(this.metaVersion, accountModelDto.metaVersion);
    }

    public final Integer f() {
        return this.metaVersion;
    }

    public final String g() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.version, urd0.a(urd0.a(Boolean.hashCode(this.background) * 31, 31, this.name), 31, this.url), 31), 31, this.encrypted);
        String str = this.metaUrl;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.metaVersion;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final int i() {
        return this.version;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountModelDto(background=");
        sb.append(this.background);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", encrypted=");
        sb.append(this.encrypted);
        sb.append(", metaUrl=");
        sb.append(this.metaUrl);
        sb.append(", metaVersion=");
        return uqi.b(sb, this.metaVersion, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.background ? 1 : 0);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeInt(this.version);
        parcel.writeInt(this.encrypted ? 1 : 0);
        parcel.writeString(this.metaUrl);
        Integer num = this.metaVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AccountModelDto(boolean z, String str, String str2, int i, boolean z2, String str3, Integer num, int i2, zcl zclVar) {
        this(z, str, str2, i, z2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : num);
    }
}
