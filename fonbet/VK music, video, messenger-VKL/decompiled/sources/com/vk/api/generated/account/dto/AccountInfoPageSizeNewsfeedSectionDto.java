package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AccountInfoPageSizeNewsfeedSectionDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoPageSizeNewsfeedSectionDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoPageSizeNewsfeedSectionDto> CREATOR = new a();

    /* renamed from: default, reason: not valid java name */
    @pmi0(BuildConfig.FLAVOR)
    private final Integer f2default;

    @pmi0("first")
    private final Integer first;

    /* compiled from: AccountInfoPageSizeNewsfeedSectionDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoPageSizeNewsfeedSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoPageSizeNewsfeedSectionDto createFromParcel(Parcel parcel) {
            return new AccountInfoPageSizeNewsfeedSectionDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoPageSizeNewsfeedSectionDto[] newArray(int i) {
            return new AccountInfoPageSizeNewsfeedSectionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoPageSizeNewsfeedSectionDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoPageSizeNewsfeedSectionDto)) {
            return false;
        }
        AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto = (AccountInfoPageSizeNewsfeedSectionDto) obj;
        return epx.f(this.first, accountInfoPageSizeNewsfeedSectionDto.first) && epx.f(this.f2default, accountInfoPageSizeNewsfeedSectionDto.f2default);
    }

    public final int hashCode() {
        Integer num = this.first;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2default;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoPageSizeNewsfeedSectionDto(first=");
        sb.append(this.first);
        sb.append(", default=");
        return uqi.b(sb, this.f2default, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.first;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.f2default;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public AccountInfoPageSizeNewsfeedSectionDto(Integer num, Integer num2) {
        this.first = num;
        this.f2default = num2;
    }

    public /* synthetic */ AccountInfoPageSizeNewsfeedSectionDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
