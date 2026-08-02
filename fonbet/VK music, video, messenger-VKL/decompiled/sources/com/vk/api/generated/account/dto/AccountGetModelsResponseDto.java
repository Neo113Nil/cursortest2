package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AccountGetModelsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetModelsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetModelsResponseDto> CREATOR = new a();

    @pmi0("models")
    private final List<AccountModelDto> models;

    @pmi0("version")
    private final Integer version;

    /* compiled from: AccountGetModelsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetModelsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetModelsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AccountModelDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AccountGetModelsResponseDto(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetModelsResponseDto[] newArray(int i) {
            return new AccountGetModelsResponseDto[i];
        }
    }

    public AccountGetModelsResponseDto(List<AccountModelDto> list, Integer num) {
        this.models = list;
        this.version = num;
    }

    public static AccountGetModelsResponseDto a(AccountGetModelsResponseDto accountGetModelsResponseDto, ArrayList arrayList) {
        Integer num = accountGetModelsResponseDto.version;
        accountGetModelsResponseDto.getClass();
        return new AccountGetModelsResponseDto(arrayList, num);
    }

    public final List<AccountModelDto> d() {
        return this.models;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetModelsResponseDto)) {
            return false;
        }
        AccountGetModelsResponseDto accountGetModelsResponseDto = (AccountGetModelsResponseDto) obj;
        return epx.f(this.models, accountGetModelsResponseDto.models) && epx.f(this.version, accountGetModelsResponseDto.version);
    }

    public final int hashCode() {
        int hashCode = this.models.hashCode() * 31;
        Integer num = this.version;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetModelsResponseDto(models=");
        sb.append(this.models);
        sb.append(", version=");
        return uqi.b(sb, this.version, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.models);
        while (a2.hasNext()) {
            ((AccountModelDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AccountGetModelsResponseDto(List list, Integer num, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num);
    }
}
