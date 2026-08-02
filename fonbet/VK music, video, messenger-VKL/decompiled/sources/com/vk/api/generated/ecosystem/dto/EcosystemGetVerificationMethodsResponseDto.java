package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: EcosystemGetVerificationMethodsResponseDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemGetVerificationMethodsResponseDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemGetVerificationMethodsResponseDto> CREATOR = new a();

    @pmi0(BatchApiRequest.PARAM_NAME_METHODS)
    private final List<EcosystemVerificationMethodDto> methods;

    /* compiled from: EcosystemGetVerificationMethodsResponseDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemGetVerificationMethodsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemGetVerificationMethodsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(EcosystemVerificationMethodDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new EcosystemGetVerificationMethodsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemGetVerificationMethodsResponseDto[] newArray(int i) {
            return new EcosystemGetVerificationMethodsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcosystemGetVerificationMethodsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<EcosystemVerificationMethodDto> d() {
        return this.methods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcosystemGetVerificationMethodsResponseDto) && epx.f(this.methods, ((EcosystemGetVerificationMethodsResponseDto) obj).methods);
    }

    public final int hashCode() {
        List<EcosystemVerificationMethodDto> list = this.methods;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("EcosystemGetVerificationMethodsResponseDto(methods="), this.methods);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<EcosystemVerificationMethodDto> list = this.methods;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((EcosystemVerificationMethodDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public EcosystemGetVerificationMethodsResponseDto(List<EcosystemVerificationMethodDto> list) {
        this.methods = list;
    }

    public /* synthetic */ EcosystemGetVerificationMethodsResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
