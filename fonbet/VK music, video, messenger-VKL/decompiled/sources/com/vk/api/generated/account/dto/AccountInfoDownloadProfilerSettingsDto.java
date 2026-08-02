package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AccountInfoDownloadProfilerSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoDownloadProfilerSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoDownloadProfilerSettingsDto> CREATOR = new a();

    @pmi0("error_probability")
    private final Float errorProbability;

    @pmi0("pattern")
    private final String pattern;

    @pmi0("probability")
    private final float probability;

    @pmi0("type")
    private final String type;

    /* compiled from: AccountInfoDownloadProfilerSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoDownloadProfilerSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoDownloadProfilerSettingsDto createFromParcel(Parcel parcel) {
            return new AccountInfoDownloadProfilerSettingsDto(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoDownloadProfilerSettingsDto[] newArray(int i) {
            return new AccountInfoDownloadProfilerSettingsDto[i];
        }
    }

    public AccountInfoDownloadProfilerSettingsDto(String str, String str2, float f, Float f2) {
        this.type = str;
        this.pattern = str2;
        this.probability = f;
        this.errorProbability = f2;
    }

    public final String d() {
        return this.pattern;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.probability;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoDownloadProfilerSettingsDto)) {
            return false;
        }
        AccountInfoDownloadProfilerSettingsDto accountInfoDownloadProfilerSettingsDto = (AccountInfoDownloadProfilerSettingsDto) obj;
        return epx.f(this.type, accountInfoDownloadProfilerSettingsDto.type) && epx.f(this.pattern, accountInfoDownloadProfilerSettingsDto.pattern) && Float.compare(this.probability, accountInfoDownloadProfilerSettingsDto.probability) == 0 && epx.f(this.errorProbability, accountInfoDownloadProfilerSettingsDto.errorProbability);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = b.a(this.probability, urd0.a(this.type.hashCode() * 31, 31, this.pattern), 31);
        Float f = this.errorProbability;
        return a2 + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoDownloadProfilerSettingsDto(type=");
        sb.append(this.type);
        sb.append(", pattern=");
        sb.append(this.pattern);
        sb.append(", probability=");
        sb.append(this.probability);
        sb.append(", errorProbability=");
        return so.b(sb, this.errorProbability, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.pattern);
        parcel.writeFloat(this.probability);
        Float f = this.errorProbability;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }

    public /* synthetic */ AccountInfoDownloadProfilerSettingsDto(String str, String str2, float f, Float f2, int i, zcl zclVar) {
        this(str, str2, f, (i & 8) != 0 ? null : f2);
    }
}
