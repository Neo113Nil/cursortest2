package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;

/* compiled from: ChannelsPinMessagesResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsPinMessagesResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsPinMessagesResponseDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.VALUE_SUCCEEDED)
    private final List<Integer> succeeded;

    /* compiled from: ChannelsPinMessagesResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsPinMessagesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsPinMessagesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new ChannelsPinMessagesResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsPinMessagesResponseDto[] newArray(int i) {
            return new ChannelsPinMessagesResponseDto[i];
        }
    }

    public ChannelsPinMessagesResponseDto(List<Integer> list) {
        this.succeeded = list;
    }

    public final List<Integer> d() {
        return this.succeeded;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelsPinMessagesResponseDto) && epx.f(this.succeeded, ((ChannelsPinMessagesResponseDto) obj).succeeded);
    }

    public final int hashCode() {
        return this.succeeded.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ChannelsPinMessagesResponseDto(succeeded="), this.succeeded);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.succeeded);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
