package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseIndexedErrorDto;
import com.vk.api.generated.base.dto.BaseIndexedResultDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AccountManagePushDeviceMultiResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountManagePushDeviceMultiResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountManagePushDeviceMultiResponseDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_ERRORS)
    private final List<BaseIndexedErrorDto> errors;

    @pmi0("results")
    private final List<BaseIndexedResultDto> results;

    /* compiled from: AccountManagePushDeviceMultiResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountManagePushDeviceMultiResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountManagePushDeviceMultiResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(BaseIndexedResultDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(BaseIndexedErrorDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new AccountManagePushDeviceMultiResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountManagePushDeviceMultiResponseDto[] newArray(int i) {
            return new AccountManagePushDeviceMultiResponseDto[i];
        }
    }

    public AccountManagePushDeviceMultiResponseDto(List<BaseIndexedResultDto> list, List<BaseIndexedErrorDto> list2) {
        this.results = list;
        this.errors = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountManagePushDeviceMultiResponseDto)) {
            return false;
        }
        AccountManagePushDeviceMultiResponseDto accountManagePushDeviceMultiResponseDto = (AccountManagePushDeviceMultiResponseDto) obj;
        return epx.f(this.results, accountManagePushDeviceMultiResponseDto.results) && epx.f(this.errors, accountManagePushDeviceMultiResponseDto.errors);
    }

    public final int hashCode() {
        return this.errors.hashCode() + (this.results.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountManagePushDeviceMultiResponseDto(results=");
        sb.append(this.results);
        sb.append(", errors=");
        return ms9.a(')', sb, this.errors);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.results);
        while (a2.hasNext()) {
            ((BaseIndexedResultDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.errors);
        while (a3.hasNext()) {
            ((BaseIndexedErrorDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
