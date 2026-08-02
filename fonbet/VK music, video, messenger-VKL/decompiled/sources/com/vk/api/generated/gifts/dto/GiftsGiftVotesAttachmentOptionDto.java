package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GiftsGiftVotesAttachmentOptionDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftVotesAttachmentOptionDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftVotesAttachmentOptionDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final GiftsGiftVotesAttachmentDto attachment;

    /* compiled from: GiftsGiftVotesAttachmentOptionDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftVotesAttachmentOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftVotesAttachmentOptionDto createFromParcel(Parcel parcel) {
            return new GiftsGiftVotesAttachmentOptionDto(parcel.readInt() == 0 ? null : GiftsGiftVotesAttachmentDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftVotesAttachmentOptionDto[] newArray(int i) {
            return new GiftsGiftVotesAttachmentOptionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftsGiftVotesAttachmentOptionDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftsGiftVotesAttachmentOptionDto) && epx.f(this.attachment, ((GiftsGiftVotesAttachmentOptionDto) obj).attachment);
    }

    public final int hashCode() {
        GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto = this.attachment;
        if (giftsGiftVotesAttachmentDto == null) {
            return 0;
        }
        return giftsGiftVotesAttachmentDto.hashCode();
    }

    public final String toString() {
        return "GiftsGiftVotesAttachmentOptionDto(attachment=" + this.attachment + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto = this.attachment;
        if (giftsGiftVotesAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftVotesAttachmentDto.writeToParcel(parcel, i);
        }
    }

    public GiftsGiftVotesAttachmentOptionDto(GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto) {
        this.attachment = giftsGiftVotesAttachmentDto;
    }

    public /* synthetic */ GiftsGiftVotesAttachmentOptionDto(GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : giftsGiftVotesAttachmentDto);
    }
}
