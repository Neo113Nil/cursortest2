package com.vk.api.generated.privacy.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PrivacyOwnersDto.kt */
/* loaded from: classes15.dex */
public final class PrivacyOwnersDto implements Parcelable {
    public static final Parcelable.Creator<PrivacyOwnersDto> CREATOR = new a();

    @pmi0("allowed")
    private final List<UserId> allowed;

    @pmi0("excluded")
    private final List<UserId> excluded;

    /* compiled from: PrivacyOwnersDto.kt */
    public static final class a implements Parcelable.Creator<PrivacyOwnersDto> {
        @Override // android.os.Parcelable.Creator
        public final PrivacyOwnersDto createFromParcel(Parcel parcel) {
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
                    i2 = bo.b(PrivacyOwnersDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(PrivacyOwnersDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new PrivacyOwnersDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivacyOwnersDto[] newArray(int i) {
            return new PrivacyOwnersDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyOwnersDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<UserId> d() {
        return this.allowed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UserId> e() {
        return this.excluded;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyOwnersDto)) {
            return false;
        }
        PrivacyOwnersDto privacyOwnersDto = (PrivacyOwnersDto) obj;
        return epx.f(this.allowed, privacyOwnersDto.allowed) && epx.f(this.excluded, privacyOwnersDto.excluded);
    }

    public final int hashCode() {
        List<UserId> list = this.allowed;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UserId> list2 = this.excluded;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyOwnersDto(allowed=");
        sb.append(this.allowed);
        sb.append(", excluded=");
        return ms9.a(')', sb, this.excluded);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<UserId> list = this.allowed;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UserId> list2 = this.excluded;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public PrivacyOwnersDto(List<UserId> list, List<UserId> list2) {
        this.allowed = list;
        this.excluded = list2;
    }

    public /* synthetic */ PrivacyOwnersDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
