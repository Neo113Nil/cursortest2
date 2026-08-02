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

/* compiled from: PrivacyListsOwnersDto.kt */
/* loaded from: classes15.dex */
public final class PrivacyListsOwnersDto implements Parcelable {
    public static final Parcelable.Creator<PrivacyListsOwnersDto> CREATOR = new a();

    @pmi0("allowed")
    private final List<UserId> allowed;

    @pmi0("excluded")
    private final List<UserId> excluded;

    /* compiled from: PrivacyListsOwnersDto.kt */
    public static final class a implements Parcelable.Creator<PrivacyListsOwnersDto> {
        @Override // android.os.Parcelable.Creator
        public final PrivacyListsOwnersDto createFromParcel(Parcel parcel) {
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
                    i2 = bo.b(PrivacyListsOwnersDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(PrivacyListsOwnersDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new PrivacyListsOwnersDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivacyListsOwnersDto[] newArray(int i) {
            return new PrivacyListsOwnersDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyListsOwnersDto() {
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
        if (!(obj instanceof PrivacyListsOwnersDto)) {
            return false;
        }
        PrivacyListsOwnersDto privacyListsOwnersDto = (PrivacyListsOwnersDto) obj;
        return epx.f(this.allowed, privacyListsOwnersDto.allowed) && epx.f(this.excluded, privacyListsOwnersDto.excluded);
    }

    public final int hashCode() {
        List<UserId> list = this.allowed;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UserId> list2 = this.excluded;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyListsOwnersDto(allowed=");
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

    public PrivacyListsOwnersDto(List<UserId> list, List<UserId> list2) {
        this.allowed = list;
        this.excluded = list2;
    }

    public /* synthetic */ PrivacyListsOwnersDto(List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
