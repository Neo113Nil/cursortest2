package com.vk.api.generated.channels.dto;

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

/* compiled from: ChannelsGetReactionsMappingResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetReactionsMappingResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetReactionsMappingResponseDto> CREATOR = new a();

    @pmi0("mapping")
    private final List<ChannelsChannelReactionIdToMessageReactionIdDto> mapping;

    /* compiled from: ChannelsGetReactionsMappingResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetReactionsMappingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetReactionsMappingResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ChannelsChannelReactionIdToMessageReactionIdDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ChannelsGetReactionsMappingResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetReactionsMappingResponseDto[] newArray(int i) {
            return new ChannelsGetReactionsMappingResponseDto[i];
        }
    }

    public ChannelsGetReactionsMappingResponseDto(List<ChannelsChannelReactionIdToMessageReactionIdDto> list) {
        this.mapping = list;
    }

    public final List<ChannelsChannelReactionIdToMessageReactionIdDto> d() {
        return this.mapping;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelsGetReactionsMappingResponseDto) && epx.f(this.mapping, ((ChannelsGetReactionsMappingResponseDto) obj).mapping);
    }

    public final int hashCode() {
        return this.mapping.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ChannelsGetReactionsMappingResponseDto(mapping="), this.mapping);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.mapping);
        while (a2.hasNext()) {
            ((ChannelsChannelReactionIdToMessageReactionIdDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
