package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkApiRequestActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkApiRequestActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkApiRequestActionParametersDto> CREATOR = new a();

    @pmi0("fail_actions")
    private final List<AtumAnyActionDto> failActions;

    @pmi0("method")
    private final String method;

    @pmi0("params")
    private final AtumAnyObjectDto params;

    @pmi0("success_actions")
    private final List<AtumAnyActionDto> successActions;

    /* compiled from: AtumVkApiRequestActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkApiRequestActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkApiRequestActionParametersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            ArrayList arrayList2 = null;
            AtumAnyObjectDto createFromParcel = parcel.readInt() == 0 ? null : AtumAnyObjectDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(AtumVkApiRequestActionParametersDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(AtumVkApiRequestActionParametersDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new AtumVkApiRequestActionParametersDto(readString, createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkApiRequestActionParametersDto[] newArray(int i) {
            return new AtumVkApiRequestActionParametersDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtumVkApiRequestActionParametersDto(String str, AtumAnyObjectDto atumAnyObjectDto, List<? extends AtumAnyActionDto> list, List<? extends AtumAnyActionDto> list2) {
        this.method = str;
        this.params = atumAnyObjectDto;
        this.successActions = list;
        this.failActions = list2;
    }

    public final List<AtumAnyActionDto> d() {
        return this.failActions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AtumAnyActionDto> e() {
        return this.successActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkApiRequestActionParametersDto)) {
            return false;
        }
        AtumVkApiRequestActionParametersDto atumVkApiRequestActionParametersDto = (AtumVkApiRequestActionParametersDto) obj;
        return epx.f(this.method, atumVkApiRequestActionParametersDto.method) && epx.f(this.params, atumVkApiRequestActionParametersDto.params) && epx.f(this.successActions, atumVkApiRequestActionParametersDto.successActions) && epx.f(this.failActions, atumVkApiRequestActionParametersDto.failActions);
    }

    public final int hashCode() {
        int hashCode = this.method.hashCode() * 31;
        AtumAnyObjectDto atumAnyObjectDto = this.params;
        int hashCode2 = (hashCode + (atumAnyObjectDto == null ? 0 : atumAnyObjectDto.hashCode())) * 31;
        List<AtumAnyActionDto> list = this.successActions;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AtumAnyActionDto> list2 = this.failActions;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumVkApiRequestActionParametersDto(method=");
        sb.append(this.method);
        sb.append(", params=");
        sb.append(this.params);
        sb.append(", successActions=");
        sb.append(this.successActions);
        sb.append(", failActions=");
        return ms9.a(')', sb, this.failActions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.method);
        AtumAnyObjectDto atumAnyObjectDto = this.params;
        if (atumAnyObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumAnyObjectDto.writeToParcel(parcel, i);
        }
        List<AtumAnyActionDto> list = this.successActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<AtumAnyActionDto> list2 = this.failActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ AtumVkApiRequestActionParametersDto(String str, AtumAnyObjectDto atumAnyObjectDto, List list, List list2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : atumAnyObjectDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
