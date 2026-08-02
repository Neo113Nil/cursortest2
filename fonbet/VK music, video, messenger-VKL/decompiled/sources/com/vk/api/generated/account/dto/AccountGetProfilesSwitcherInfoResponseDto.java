package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AccountGetProfilesSwitcherInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetProfilesSwitcherInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetProfilesSwitcherInfoResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<AccountSwitcherInfoErrorDto> errors;

    @pmi0("success")
    private final List<AccountSwitcherInfoDto> success;

    /* compiled from: AccountGetProfilesSwitcherInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetProfilesSwitcherInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetProfilesSwitcherInfoResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AccountSwitcherInfoDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(AccountSwitcherInfoErrorDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new AccountGetProfilesSwitcherInfoResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetProfilesSwitcherInfoResponseDto[] newArray(int i) {
            return new AccountGetProfilesSwitcherInfoResponseDto[i];
        }
    }

    public AccountGetProfilesSwitcherInfoResponseDto(List<AccountSwitcherInfoDto> list, List<AccountSwitcherInfoErrorDto> list2) {
        this.success = list;
        this.errors = list2;
    }

    public final List<AccountSwitcherInfoErrorDto> d() {
        return this.errors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AccountSwitcherInfoDto> e() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetProfilesSwitcherInfoResponseDto)) {
            return false;
        }
        AccountGetProfilesSwitcherInfoResponseDto accountGetProfilesSwitcherInfoResponseDto = (AccountGetProfilesSwitcherInfoResponseDto) obj;
        return epx.f(this.success, accountGetProfilesSwitcherInfoResponseDto.success) && epx.f(this.errors, accountGetProfilesSwitcherInfoResponseDto.errors);
    }

    public final int hashCode() {
        return this.errors.hashCode() + (this.success.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetProfilesSwitcherInfoResponseDto(success=");
        sb.append(this.success);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.success);
        while (a2.hasNext()) {
            ((AccountSwitcherInfoDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.errors);
        while (a3.hasNext()) {
            ((AccountSwitcherInfoErrorDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
