package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsMediascopeResearchEventDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsMediascopeResearchEventDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsMediascopeResearchEventDto> CREATOR = new a();

    @pmi0("item_id")
    private final String itemId;

    @pmi0("source_id")
    private final Integer sourceId;

    /* compiled from: ChannelsMediascopeResearchEventDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsMediascopeResearchEventDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsMediascopeResearchEventDto createFromParcel(Parcel parcel) {
            return new ChannelsMediascopeResearchEventDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsMediascopeResearchEventDto[] newArray(int i) {
            return new ChannelsMediascopeResearchEventDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsMediascopeResearchEventDto() {
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
        if (!(obj instanceof ChannelsMediascopeResearchEventDto)) {
            return false;
        }
        ChannelsMediascopeResearchEventDto channelsMediascopeResearchEventDto = (ChannelsMediascopeResearchEventDto) obj;
        return epx.f(this.sourceId, channelsMediascopeResearchEventDto.sourceId) && epx.f(this.itemId, channelsMediascopeResearchEventDto.itemId);
    }

    public final int hashCode() {
        Integer num = this.sourceId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.itemId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsMediascopeResearchEventDto(sourceId=");
        sb.append(this.sourceId);
        sb.append(", itemId=");
        return ho8.a(sb, this.itemId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.sourceId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.itemId);
    }

    public ChannelsMediascopeResearchEventDto(Integer num, String str) {
        this.sourceId = num;
        this.itemId = str;
    }

    public /* synthetic */ ChannelsMediascopeResearchEventDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
