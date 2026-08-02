package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ChannelsHistoryAttachmentItemDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsHistoryAttachmentItemDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsHistoryAttachmentItemDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final ChannelsHistoryAttachmentDto attachment;

    @pmi0("attachment_id")
    private final String attachmentId;

    @pmi0("cmid")
    private final int cmid;

    /* compiled from: ChannelsHistoryAttachmentItemDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsHistoryAttachmentItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsHistoryAttachmentItemDto createFromParcel(Parcel parcel) {
            return new ChannelsHistoryAttachmentItemDto(ChannelsHistoryAttachmentDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsHistoryAttachmentItemDto[] newArray(int i) {
            return new ChannelsHistoryAttachmentItemDto[i];
        }
    }

    public ChannelsHistoryAttachmentItemDto(ChannelsHistoryAttachmentDto channelsHistoryAttachmentDto, int i, String str) {
        this.attachment = channelsHistoryAttachmentDto;
        this.cmid = i;
        this.attachmentId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsHistoryAttachmentItemDto)) {
            return false;
        }
        ChannelsHistoryAttachmentItemDto channelsHistoryAttachmentItemDto = (ChannelsHistoryAttachmentItemDto) obj;
        return epx.f(this.attachment, channelsHistoryAttachmentItemDto.attachment) && this.cmid == channelsHistoryAttachmentItemDto.cmid && epx.f(this.attachmentId, channelsHistoryAttachmentItemDto.attachmentId);
    }

    public final int hashCode() {
        return this.attachmentId.hashCode() + shy.a(this.cmid, this.attachment.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsHistoryAttachmentItemDto(attachment=");
        sb.append(this.attachment);
        sb.append(", cmid=");
        sb.append(this.cmid);
        sb.append(", attachmentId=");
        return ho8.a(sb, this.attachmentId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.attachment.writeToParcel(parcel, i);
        parcel.writeInt(this.cmid);
        parcel.writeString(this.attachmentId);
    }
}
