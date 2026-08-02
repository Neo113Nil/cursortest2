package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.k73;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountPrivacySettingValueListDto.kt */
/* loaded from: classes14.dex */
public final class AccountPrivacySettingValueListDto implements Parcelable {
    public static final Parcelable.Creator<AccountPrivacySettingValueListDto> CREATOR = new a();

    @pmi0("allowed")
    private final List<Long> allowed;

    @pmi0("excluded")
    private final List<Long> excluded;

    /* compiled from: AccountPrivacySettingValueListDto.kt */
    public static final class a implements Parcelable.Creator<AccountPrivacySettingValueListDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPrivacySettingValueListDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = k73.b(parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = k73.b(parcel, arrayList2, i, 1);
                }
            }
            return new AccountPrivacySettingValueListDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPrivacySettingValueListDto[] newArray(int i) {
            return new AccountPrivacySettingValueListDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountPrivacySettingValueListDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<Long> d() {
        return this.allowed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Long> e() {
        return this.excluded;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPrivacySettingValueListDto)) {
            return false;
        }
        AccountPrivacySettingValueListDto accountPrivacySettingValueListDto = (AccountPrivacySettingValueListDto) obj;
        return epx.f(this.allowed, accountPrivacySettingValueListDto.allowed) && epx.f(this.excluded, accountPrivacySettingValueListDto.excluded);
    }

    public final int hashCode() {
        List<Long> list = this.allowed;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Long> list2 = this.excluded;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountPrivacySettingValueListDto(allowed=");
        sb.append(this.allowed);
        sb.append(", excluded=");
        return ms9.a(')', sb, this.excluded);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Long> list = this.allowed;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeLong(((Number) f.next()).longValue());
            }
        }
        List<Long> list2 = this.excluded;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeLong(((Number) f2.next()).longValue());
        }
    }

    public AccountPrivacySettingValueListDto(List<Long> list, List<Long> list2) {
        this.allowed = list;
        this.excluded = list2;
    }

    public /* synthetic */ AccountPrivacySettingValueListDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
