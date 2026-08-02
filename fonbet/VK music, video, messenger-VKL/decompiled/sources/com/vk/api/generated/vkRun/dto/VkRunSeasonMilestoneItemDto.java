package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VkRunSeasonMilestoneItemDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonMilestoneItemDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonMilestoneItemDto> CREATOR = new a();

    @pmi0("article")
    private final VkRunSeasonMilestoneArticleDto article;

    @pmi0("choices")
    private final VkRunSeasonMilestoneChoicesDto choices;

    @pmi0("cover_image")
    private final VkRunImageUrlsDto coverImage;

    @pmi0("description")
    private final String description;

    @pmi0("linked_level_value")
    private final int linkedLevelValue;

    @pmi0("sharing_stories_description")
    private final String sharingStoriesDescription;

    @pmi0("sharing_stories_title")
    private final String sharingStoriesTitle;

    @pmi0("sharing_text")
    private final String sharingText;

    @pmi0("story_snippet_image")
    private final String storySnippetImage;

    @pmi0("title")
    private final String title;

    @pmi0("wall_snippet_image")
    private final String wallSnippetImage;

    /* compiled from: VkRunSeasonMilestoneItemDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonMilestoneItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonMilestoneItemDto createFromParcel(Parcel parcel) {
            return new VkRunSeasonMilestoneItemDto(parcel.readString(), parcel.readInt(), VkRunImageUrlsDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), VkRunSeasonMilestoneChoicesDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : VkRunSeasonMilestoneArticleDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonMilestoneItemDto[] newArray(int i) {
            return new VkRunSeasonMilestoneItemDto[i];
        }
    }

    public VkRunSeasonMilestoneItemDto(String str, int i, VkRunImageUrlsDto vkRunImageUrlsDto, String str2, String str3, String str4, String str5, String str6, VkRunSeasonMilestoneChoicesDto vkRunSeasonMilestoneChoicesDto, String str7, VkRunSeasonMilestoneArticleDto vkRunSeasonMilestoneArticleDto) {
        this.title = str;
        this.linkedLevelValue = i;
        this.coverImage = vkRunImageUrlsDto;
        this.storySnippetImage = str2;
        this.wallSnippetImage = str3;
        this.sharingText = str4;
        this.sharingStoriesTitle = str5;
        this.sharingStoriesDescription = str6;
        this.choices = vkRunSeasonMilestoneChoicesDto;
        this.description = str7;
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
        if (!(obj instanceof VkRunSeasonMilestoneItemDto)) {
            return false;
        }
        VkRunSeasonMilestoneItemDto vkRunSeasonMilestoneItemDto = (VkRunSeasonMilestoneItemDto) obj;
        return epx.f(this.title, vkRunSeasonMilestoneItemDto.title) && this.linkedLevelValue == vkRunSeasonMilestoneItemDto.linkedLevelValue && epx.f(this.coverImage, vkRunSeasonMilestoneItemDto.coverImage) && epx.f(this.storySnippetImage, vkRunSeasonMilestoneItemDto.storySnippetImage) && epx.f(this.wallSnippetImage, vkRunSeasonMilestoneItemDto.wallSnippetImage) && epx.f(this.sharingText, vkRunSeasonMilestoneItemDto.sharingText) && epx.f(this.sharingStoriesTitle, vkRunSeasonMilestoneItemDto.sharingStoriesTitle) && epx.f(this.sharingStoriesDescription, vkRunSeasonMilestoneItemDto.sharingStoriesDescription) && epx.f(this.choices, vkRunSeasonMilestoneItemDto.choices) && epx.f(this.description, vkRunSeasonMilestoneItemDto.description) && epx.f(this.article, vkRunSeasonMilestoneItemDto.article);
    }

    public final int hashCode() {
        int hashCode = (this.choices.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a((this.coverImage.hashCode() + shy.a(this.linkedLevelValue, this.title.hashCode() * 31, 31)) * 31, 31, this.storySnippetImage), 31, this.wallSnippetImage), 31, this.sharingText), 31, this.sharingStoriesTitle), 31, this.sharingStoriesDescription)) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        VkRunSeasonMilestoneArticleDto vkRunSeasonMilestoneArticleDto = this.article;
        return hashCode2 + (vkRunSeasonMilestoneArticleDto != null ? vkRunSeasonMilestoneArticleDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkRunSeasonMilestoneItemDto(title=" + this.title + ", linkedLevelValue=" + this.linkedLevelValue + ", coverImage=" + this.coverImage + ", storySnippetImage=" + this.storySnippetImage + ", wallSnippetImage=" + this.wallSnippetImage + ", sharingText=" + this.sharingText + ", sharingStoriesTitle=" + this.sharingStoriesTitle + ", sharingStoriesDescription=" + this.sharingStoriesDescription + ", choices=" + this.choices + ", description=" + this.description + ", article=" + this.article + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeInt(this.linkedLevelValue);
        this.coverImage.writeToParcel(parcel, i);
        parcel.writeString(this.storySnippetImage);
        parcel.writeString(this.wallSnippetImage);
        parcel.writeString(this.sharingText);
        parcel.writeString(this.sharingStoriesTitle);
        parcel.writeString(this.sharingStoriesDescription);
        this.choices.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        VkRunSeasonMilestoneArticleDto vkRunSeasonMilestoneArticleDto = this.article;
        if (vkRunSeasonMilestoneArticleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunSeasonMilestoneArticleDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkRunSeasonMilestoneItemDto(String str, int i, VkRunImageUrlsDto vkRunImageUrlsDto, String str2, String str3, String str4, String str5, String str6, VkRunSeasonMilestoneChoicesDto vkRunSeasonMilestoneChoicesDto, String str7, VkRunSeasonMilestoneArticleDto vkRunSeasonMilestoneArticleDto, int i2, zcl zclVar) {
        this(str, i, vkRunImageUrlsDto, str2, str3, str4, str5, str6, vkRunSeasonMilestoneChoicesDto, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : vkRunSeasonMilestoneArticleDto);
    }
}
