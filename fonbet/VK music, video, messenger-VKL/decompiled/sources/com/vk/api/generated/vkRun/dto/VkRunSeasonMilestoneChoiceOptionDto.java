package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VkRunSeasonMilestoneChoiceOptionDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonMilestoneChoiceOptionDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonMilestoneChoiceOptionDto> CREATOR = new a();

    @pmi0("article")
    private final VkRunSeasonMilestoneArticleDto article;

    @pmi0("text")
    private final String text;

    /* compiled from: VkRunSeasonMilestoneChoiceOptionDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonMilestoneChoiceOptionDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonMilestoneChoiceOptionDto createFromParcel(Parcel parcel) {
            return new VkRunSeasonMilestoneChoiceOptionDto(parcel.readString(), VkRunSeasonMilestoneArticleDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonMilestoneChoiceOptionDto[] newArray(int i) {
            return new VkRunSeasonMilestoneChoiceOptionDto[i];
        }
    }

    public VkRunSeasonMilestoneChoiceOptionDto(String str, VkRunSeasonMilestoneArticleDto vkRunSeasonMilestoneArticleDto) {
        this.text = str;
        this.article = vkRunSeasonMilestoneArticleDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSeasonMilestoneChoiceOptionDto)) {
            return false;
        }
        VkRunSeasonMilestoneChoiceOptionDto vkRunSeasonMilestoneChoiceOptionDto = (VkRunSeasonMilestoneChoiceOptionDto) obj;
        return epx.f(this.text, vkRunSeasonMilestoneChoiceOptionDto.text) && epx.f(this.article, vkRunSeasonMilestoneChoiceOptionDto.article);
    }

    public final int hashCode() {
        return this.article.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "VkRunSeasonMilestoneChoiceOptionDto(text=" + this.text + ", article=" + this.article + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        this.article.writeToParcel(parcel, i);
    }
}
