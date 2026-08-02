package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: GiftsGiftVotesAttachmentsConfigDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftVotesAttachmentsConfigDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftVotesAttachmentsConfigDto> CREATOR = new a();

    @pmi0("attached_amount")
    private final int attachedAmount;

    @pmi0(SignalingProtocol.KEY_LIMIT)
    private final int limit;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<GiftsGiftVotesAttachmentOptionDto> options;

    /* compiled from: GiftsGiftVotesAttachmentsConfigDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftVotesAttachmentsConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftVotesAttachmentsConfigDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(GiftsGiftVotesAttachmentOptionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GiftsGiftVotesAttachmentsConfigDto(arrayList, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftVotesAttachmentsConfigDto[] newArray(int i) {
            return new GiftsGiftVotesAttachmentsConfigDto[i];
        }
    }

    public GiftsGiftVotesAttachmentsConfigDto(List<GiftsGiftVotesAttachmentOptionDto> list, int i, int i2) {
        this.options = list;
        this.limit = i;
        this.attachedAmount = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftVotesAttachmentsConfigDto)) {
            return false;
        }
        GiftsGiftVotesAttachmentsConfigDto giftsGiftVotesAttachmentsConfigDto = (GiftsGiftVotesAttachmentsConfigDto) obj;
        return epx.f(this.options, giftsGiftVotesAttachmentsConfigDto.options) && this.limit == giftsGiftVotesAttachmentsConfigDto.limit && this.attachedAmount == giftsGiftVotesAttachmentsConfigDto.attachedAmount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.attachedAmount) + shy.a(this.limit, this.options.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsGiftVotesAttachmentsConfigDto(options=");
        sb.append(this.options);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", attachedAmount=");
        return vu5.b(sb, this.attachedAmount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.options);
        while (a2.hasNext()) {
            ((GiftsGiftVotesAttachmentOptionDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.limit);
        parcel.writeInt(this.attachedAmount);
    }
}
