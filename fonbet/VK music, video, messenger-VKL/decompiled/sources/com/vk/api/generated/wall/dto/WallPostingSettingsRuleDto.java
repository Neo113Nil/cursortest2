package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallPostingSettingsRuleDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsRuleDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsRuleDto> CREATOR = new a();

    @pmi0("action_button_attachment_dependencies")
    private final WallPostingRuleActionButtonAttachmentDependenciesDto actionButtonAttachmentDependencies;

    @pmi0("attachment_any_dependency")
    private final WallPostingRuleAttachmentAnyDependencyDto attachmentAnyDependency;

    @pmi0("attachment_dependencies")
    private final WallPostingRuleAttachmentDependenciesDto attachmentDependencies;

    @pmi0("media_size_restriction")
    private final WallPostingRuleMediaSizeRestrictionDto mediaSizeRestriction;

    @pmi0("primary_attachments_mode_restricted_attachments")
    private final WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto primaryAttachmentsModeRestrictedAttachments;

    @pmi0("restrict_attachments_combination")
    private final WallPostingRuleRestrictAttachmentsCombinationDto restrictAttachmentsCombination;

    @pmi0("type")
    private final String type;

    /* compiled from: WallPostingSettingsRuleDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsRuleDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsRuleDto createFromParcel(Parcel parcel) {
            return new WallPostingSettingsRuleDto(parcel.readString(), parcel.readInt() == 0 ? null : WallPostingRuleRestrictAttachmentsCombinationDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallPostingRuleAttachmentDependenciesDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallPostingRuleAttachmentAnyDependencyDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallPostingRuleMediaSizeRestrictionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? WallPostingRuleActionButtonAttachmentDependenciesDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsRuleDto[] newArray(int i) {
            return new WallPostingSettingsRuleDto[i];
        }
    }

    public WallPostingSettingsRuleDto(String str, WallPostingRuleRestrictAttachmentsCombinationDto wallPostingRuleRestrictAttachmentsCombinationDto, WallPostingRuleAttachmentDependenciesDto wallPostingRuleAttachmentDependenciesDto, WallPostingRuleAttachmentAnyDependencyDto wallPostingRuleAttachmentAnyDependencyDto, WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto, WallPostingRuleMediaSizeRestrictionDto wallPostingRuleMediaSizeRestrictionDto, WallPostingRuleActionButtonAttachmentDependenciesDto wallPostingRuleActionButtonAttachmentDependenciesDto) {
        this.type = str;
        this.restrictAttachmentsCombination = wallPostingRuleRestrictAttachmentsCombinationDto;
        this.attachmentDependencies = wallPostingRuleAttachmentDependenciesDto;
        this.attachmentAnyDependency = wallPostingRuleAttachmentAnyDependencyDto;
        this.primaryAttachmentsModeRestrictedAttachments = wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto;
        this.mediaSizeRestriction = wallPostingRuleMediaSizeRestrictionDto;
        this.actionButtonAttachmentDependencies = wallPostingRuleActionButtonAttachmentDependenciesDto;
    }

    public final WallPostingRuleActionButtonAttachmentDependenciesDto d() {
        return this.actionButtonAttachmentDependencies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final WallPostingRuleAttachmentAnyDependencyDto e() {
        return this.attachmentAnyDependency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsRuleDto)) {
            return false;
        }
        WallPostingSettingsRuleDto wallPostingSettingsRuleDto = (WallPostingSettingsRuleDto) obj;
        return epx.f(this.type, wallPostingSettingsRuleDto.type) && epx.f(this.restrictAttachmentsCombination, wallPostingSettingsRuleDto.restrictAttachmentsCombination) && epx.f(this.attachmentDependencies, wallPostingSettingsRuleDto.attachmentDependencies) && epx.f(this.attachmentAnyDependency, wallPostingSettingsRuleDto.attachmentAnyDependency) && epx.f(this.primaryAttachmentsModeRestrictedAttachments, wallPostingSettingsRuleDto.primaryAttachmentsModeRestrictedAttachments) && epx.f(this.mediaSizeRestriction, wallPostingSettingsRuleDto.mediaSizeRestriction) && epx.f(this.actionButtonAttachmentDependencies, wallPostingSettingsRuleDto.actionButtonAttachmentDependencies);
    }

    public final WallPostingRuleAttachmentDependenciesDto f() {
        return this.attachmentDependencies;
    }

    public final WallPostingRuleMediaSizeRestrictionDto g() {
        return this.mediaSizeRestriction;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        WallPostingRuleRestrictAttachmentsCombinationDto wallPostingRuleRestrictAttachmentsCombinationDto = this.restrictAttachmentsCombination;
        int hashCode2 = (hashCode + (wallPostingRuleRestrictAttachmentsCombinationDto == null ? 0 : wallPostingRuleRestrictAttachmentsCombinationDto.hashCode())) * 31;
        WallPostingRuleAttachmentDependenciesDto wallPostingRuleAttachmentDependenciesDto = this.attachmentDependencies;
        int hashCode3 = (hashCode2 + (wallPostingRuleAttachmentDependenciesDto == null ? 0 : wallPostingRuleAttachmentDependenciesDto.hashCode())) * 31;
        WallPostingRuleAttachmentAnyDependencyDto wallPostingRuleAttachmentAnyDependencyDto = this.attachmentAnyDependency;
        int hashCode4 = (hashCode3 + (wallPostingRuleAttachmentAnyDependencyDto == null ? 0 : wallPostingRuleAttachmentAnyDependencyDto.hashCode())) * 31;
        WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto = this.primaryAttachmentsModeRestrictedAttachments;
        int hashCode5 = (hashCode4 + (wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto == null ? 0 : wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.hashCode())) * 31;
        WallPostingRuleMediaSizeRestrictionDto wallPostingRuleMediaSizeRestrictionDto = this.mediaSizeRestriction;
        int hashCode6 = (hashCode5 + (wallPostingRuleMediaSizeRestrictionDto == null ? 0 : wallPostingRuleMediaSizeRestrictionDto.hashCode())) * 31;
        WallPostingRuleActionButtonAttachmentDependenciesDto wallPostingRuleActionButtonAttachmentDependenciesDto = this.actionButtonAttachmentDependencies;
        return hashCode6 + (wallPostingRuleActionButtonAttachmentDependenciesDto != null ? wallPostingRuleActionButtonAttachmentDependenciesDto.hashCode() : 0);
    }

    public final WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto i() {
        return this.primaryAttachmentsModeRestrictedAttachments;
    }

    public final WallPostingRuleRestrictAttachmentsCombinationDto j() {
        return this.restrictAttachmentsCombination;
    }

    public final String toString() {
        return "WallPostingSettingsRuleDto(type=" + this.type + ", restrictAttachmentsCombination=" + this.restrictAttachmentsCombination + ", attachmentDependencies=" + this.attachmentDependencies + ", attachmentAnyDependency=" + this.attachmentAnyDependency + ", primaryAttachmentsModeRestrictedAttachments=" + this.primaryAttachmentsModeRestrictedAttachments + ", mediaSizeRestriction=" + this.mediaSizeRestriction + ", actionButtonAttachmentDependencies=" + this.actionButtonAttachmentDependencies + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        WallPostingRuleRestrictAttachmentsCombinationDto wallPostingRuleRestrictAttachmentsCombinationDto = this.restrictAttachmentsCombination;
        if (wallPostingRuleRestrictAttachmentsCombinationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingRuleRestrictAttachmentsCombinationDto.writeToParcel(parcel, i);
        }
        WallPostingRuleAttachmentDependenciesDto wallPostingRuleAttachmentDependenciesDto = this.attachmentDependencies;
        if (wallPostingRuleAttachmentDependenciesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingRuleAttachmentDependenciesDto.writeToParcel(parcel, i);
        }
        WallPostingRuleAttachmentAnyDependencyDto wallPostingRuleAttachmentAnyDependencyDto = this.attachmentAnyDependency;
        if (wallPostingRuleAttachmentAnyDependencyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingRuleAttachmentAnyDependencyDto.writeToParcel(parcel, i);
        }
        WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto = this.primaryAttachmentsModeRestrictedAttachments;
        if (wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto.writeToParcel(parcel, i);
        }
        WallPostingRuleMediaSizeRestrictionDto wallPostingRuleMediaSizeRestrictionDto = this.mediaSizeRestriction;
        if (wallPostingRuleMediaSizeRestrictionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingRuleMediaSizeRestrictionDto.writeToParcel(parcel, i);
        }
        WallPostingRuleActionButtonAttachmentDependenciesDto wallPostingRuleActionButtonAttachmentDependenciesDto = this.actionButtonAttachmentDependencies;
        if (wallPostingRuleActionButtonAttachmentDependenciesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostingRuleActionButtonAttachmentDependenciesDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ WallPostingSettingsRuleDto(String str, WallPostingRuleRestrictAttachmentsCombinationDto wallPostingRuleRestrictAttachmentsCombinationDto, WallPostingRuleAttachmentDependenciesDto wallPostingRuleAttachmentDependenciesDto, WallPostingRuleAttachmentAnyDependencyDto wallPostingRuleAttachmentAnyDependencyDto, WallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto, WallPostingRuleMediaSizeRestrictionDto wallPostingRuleMediaSizeRestrictionDto, WallPostingRuleActionButtonAttachmentDependenciesDto wallPostingRuleActionButtonAttachmentDependenciesDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : wallPostingRuleRestrictAttachmentsCombinationDto, (i & 4) != 0 ? null : wallPostingRuleAttachmentDependenciesDto, (i & 8) != 0 ? null : wallPostingRuleAttachmentAnyDependencyDto, (i & 16) != 0 ? null : wallPostingRulePrimaryAttachmentsModeRestrictedAttachmentsDto, (i & 32) != 0 ? null : wallPostingRuleMediaSizeRestrictionDto, (i & 64) != 0 ? null : wallPostingRuleActionButtonAttachmentDependenciesDto);
    }
}
