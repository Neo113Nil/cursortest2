package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarusiaGetBackendCommandsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetBackendCommandsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGetBackendCommandsResponseDto> CREATOR = new a();

    @pmi0("commands")
    private final List<MarusiaBackendCommandDto> commands;

    /* compiled from: MarusiaGetBackendCommandsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetBackendCommandsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetBackendCommandsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarusiaBackendCommandDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarusiaGetBackendCommandsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetBackendCommandsResponseDto[] newArray(int i) {
            return new MarusiaGetBackendCommandsResponseDto[i];
        }
    }

    public MarusiaGetBackendCommandsResponseDto(List<MarusiaBackendCommandDto> list) {
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
        return (obj instanceof MarusiaGetBackendCommandsResponseDto) && epx.f(this.commands, ((MarusiaGetBackendCommandsResponseDto) obj).commands);
    }

    public final int hashCode() {
        return this.commands.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarusiaGetBackendCommandsResponseDto(commands="), this.commands);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.commands);
        while (a2.hasNext()) {
            ((MarusiaBackendCommandDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
