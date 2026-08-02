package com.vk.api.generated.atum.dto;

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

/* compiled from: AtumRepositoryUpdateActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumRepositoryUpdateActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumRepositoryUpdateActionParametersDto> CREATOR = new a();

    @pmi0(SignalingProtocol.KEY_UPDATES)
    private final List<AtumRepositoryUpdateDataDto> updates;

    /* compiled from: AtumRepositoryUpdateActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumRepositoryUpdateActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryUpdateActionParametersDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AtumRepositoryUpdateDataDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AtumRepositoryUpdateActionParametersDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumRepositoryUpdateActionParametersDto[] newArray(int i) {
            return new AtumRepositoryUpdateActionParametersDto[i];
        }
    }

    public AtumRepositoryUpdateActionParametersDto(List<AtumRepositoryUpdateDataDto> list) {
        this.updates = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumRepositoryUpdateActionParametersDto) && epx.f(this.updates, ((AtumRepositoryUpdateActionParametersDto) obj).updates);
    }

    public final int hashCode() {
        return this.updates.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AtumRepositoryUpdateActionParametersDto(updates="), this.updates);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.updates);
        while (a2.hasNext()) {
            ((AtumRepositoryUpdateDataDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
