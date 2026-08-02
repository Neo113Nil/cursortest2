package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarusiaBackendCommandsDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaBackendCommandsDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaBackendCommandsDto> CREATOR = new a();

    @pmi0("commands")
    private final List<MarusiaBackendCommandDto> commands;

    /* compiled from: MarusiaBackendCommandsDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaBackendCommandsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaBackendCommandsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MarusiaBackendCommandsDto.class, parcel, arrayList, i, 1);
            }
            return new MarusiaBackendCommandsDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaBackendCommandsDto[] newArray(int i) {
            return new MarusiaBackendCommandsDto[i];
        }
    }

    public MarusiaBackendCommandsDto(List<MarusiaBackendCommandDto> list) {
        this.commands = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarusiaBackendCommandsDto) && epx.f(this.commands, ((MarusiaBackendCommandsDto) obj).commands);
    }

    public final int hashCode() {
        return this.commands.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarusiaBackendCommandsDto(commands="), this.commands);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.commands);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
