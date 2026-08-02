package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: WallPostingRuleRestrictAttachmentsCombinationDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingRuleRestrictAttachmentsCombinationDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingRuleRestrictAttachmentsCombinationDto> CREATOR = new a();

    @pmi0("attachments_combination")
    private final List<String> attachmentsCombination;

    @pmi0("error_message")
    private final String errorMessage;

    /* compiled from: WallPostingRuleRestrictAttachmentsCombinationDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingRuleRestrictAttachmentsCombinationDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleRestrictAttachmentsCombinationDto createFromParcel(Parcel parcel) {
            return new WallPostingRuleRestrictAttachmentsCombinationDto(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleRestrictAttachmentsCombinationDto[] newArray(int i) {
            return new WallPostingRuleRestrictAttachmentsCombinationDto[i];
        }
    }

    public WallPostingRuleRestrictAttachmentsCombinationDto(List<String> list, String str) {
        this.attachmentsCombination = list;
        this.errorMessage = str;
    }

    public final List<String> d() {
        return this.attachmentsCombination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingRuleRestrictAttachmentsCombinationDto)) {
            return false;
        }
        WallPostingRuleRestrictAttachmentsCombinationDto wallPostingRuleRestrictAttachmentsCombinationDto = (WallPostingRuleRestrictAttachmentsCombinationDto) obj;
        return epx.f(this.attachmentsCombination, wallPostingRuleRestrictAttachmentsCombinationDto.attachmentsCombination) && epx.f(this.errorMessage, wallPostingRuleRestrictAttachmentsCombinationDto.errorMessage);
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + (this.attachmentsCombination.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingRuleRestrictAttachmentsCombinationDto(attachmentsCombination=");
        sb.append(this.attachmentsCombination);
        sb.append(", errorMessage=");
        return ho8.a(sb, this.errorMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.attachmentsCombination);
        parcel.writeString(this.errorMessage);
    }
}
