package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ServerEffectsGenerationParametersCutFragmentDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsGenerationParametersCutFragmentDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsGenerationParametersCutFragmentDto> CREATOR = new a();

    @pmi0("end_time_millis")
    private final Integer endTimeMillis;

    @pmi0("start_time_millis")
    private final Integer startTimeMillis;

    /* compiled from: ServerEffectsGenerationParametersCutFragmentDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsGenerationParametersCutFragmentDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGenerationParametersCutFragmentDto createFromParcel(Parcel parcel) {
            return new ServerEffectsGenerationParametersCutFragmentDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsGenerationParametersCutFragmentDto[] newArray(int i) {
            return new ServerEffectsGenerationParametersCutFragmentDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServerEffectsGenerationParametersCutFragmentDto() {
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
        if (!(obj instanceof ServerEffectsGenerationParametersCutFragmentDto)) {
            return false;
        }
        ServerEffectsGenerationParametersCutFragmentDto serverEffectsGenerationParametersCutFragmentDto = (ServerEffectsGenerationParametersCutFragmentDto) obj;
        return epx.f(this.startTimeMillis, serverEffectsGenerationParametersCutFragmentDto.startTimeMillis) && epx.f(this.endTimeMillis, serverEffectsGenerationParametersCutFragmentDto.endTimeMillis);
    }

    public final int hashCode() {
        Integer num = this.startTimeMillis;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.endTimeMillis;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerEffectsGenerationParametersCutFragmentDto(startTimeMillis=");
        sb.append(this.startTimeMillis);
        sb.append(", endTimeMillis=");
        return uqi.b(sb, this.endTimeMillis, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.startTimeMillis;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.endTimeMillis;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public ServerEffectsGenerationParametersCutFragmentDto(Integer num, Integer num2) {
        this.startTimeMillis = num;
        this.endTimeMillis = num2;
    }

    public /* synthetic */ ServerEffectsGenerationParametersCutFragmentDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
