package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: WallPostingRuleActionButtonAttachmentDependenciesDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingRuleActionButtonAttachmentDependenciesDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingRuleActionButtonAttachmentDependenciesDto> CREATOR = new a();

    @pmi0("action_button_type")
    private final String actionButtonType;

    @pmi0("availability")
    private final AvailabilityDto availability;

    @pmi0("dependencies_attachments")
    private final List<String> dependenciesAttachments;

    @pmi0("error_message")
    private final String errorMessage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallPostingRuleActionButtonAttachmentDependenciesDto.kt */
    public static final class AvailabilityDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AvailabilityDto[] $VALUES;
        public static final Parcelable.Creator<AvailabilityDto> CREATOR;

        @pmi0(C4217a2.e)
        public static final AvailabilityDto DISABLED;

        @pmi0("hidden")
        public static final AvailabilityDto HIDDEN;
        private final String value;

        /* compiled from: WallPostingRuleActionButtonAttachmentDependenciesDto.kt */
        public static final class a implements Parcelable.Creator<AvailabilityDto> {
            @Override // android.os.Parcelable.Creator
            public final AvailabilityDto createFromParcel(Parcel parcel) {
                return AvailabilityDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AvailabilityDto[] newArray(int i) {
                return new AvailabilityDto[i];
            }
        }

        static {
            AvailabilityDto availabilityDto = new AvailabilityDto("DISABLED", 0, C4217a2.e);
            DISABLED = availabilityDto;
            AvailabilityDto availabilityDto2 = new AvailabilityDto("HIDDEN", 1, "hidden");
            HIDDEN = availabilityDto2;
            AvailabilityDto[] availabilityDtoArr = {availabilityDto, availabilityDto2};
            $VALUES = availabilityDtoArr;
            $ENTRIES = new asp(availabilityDtoArr);
            CREATOR = new a();
        }

        private AvailabilityDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AvailabilityDto valueOf(String str) {
            return (AvailabilityDto) Enum.valueOf(AvailabilityDto.class, str);
        }

        public static AvailabilityDto[] values() {
            return (AvailabilityDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: WallPostingRuleActionButtonAttachmentDependenciesDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingRuleActionButtonAttachmentDependenciesDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleActionButtonAttachmentDependenciesDto createFromParcel(Parcel parcel) {
            return new WallPostingRuleActionButtonAttachmentDependenciesDto(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), AvailabilityDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingRuleActionButtonAttachmentDependenciesDto[] newArray(int i) {
            return new WallPostingRuleActionButtonAttachmentDependenciesDto[i];
        }
    }

    public WallPostingRuleActionButtonAttachmentDependenciesDto(String str, List<String> list, String str2, AvailabilityDto availabilityDto) {
        this.actionButtonType = str;
        this.dependenciesAttachments = list;
        this.errorMessage = str2;
        this.availability = availabilityDto;
    }

    public final String d() {
        return this.actionButtonType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.dependenciesAttachments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingRuleActionButtonAttachmentDependenciesDto)) {
            return false;
        }
        WallPostingRuleActionButtonAttachmentDependenciesDto wallPostingRuleActionButtonAttachmentDependenciesDto = (WallPostingRuleActionButtonAttachmentDependenciesDto) obj;
        return epx.f(this.actionButtonType, wallPostingRuleActionButtonAttachmentDependenciesDto.actionButtonType) && epx.f(this.dependenciesAttachments, wallPostingRuleActionButtonAttachmentDependenciesDto.dependenciesAttachments) && epx.f(this.errorMessage, wallPostingRuleActionButtonAttachmentDependenciesDto.errorMessage) && this.availability == wallPostingRuleActionButtonAttachmentDependenciesDto.availability;
    }

    public final String f() {
        return this.errorMessage;
    }

    public final int hashCode() {
        return this.availability.hashCode() + urd0.a(fw3.a(this.actionButtonType.hashCode() * 31, 31, this.dependenciesAttachments), 31, this.errorMessage);
    }

    public final String toString() {
        return "WallPostingRuleActionButtonAttachmentDependenciesDto(actionButtonType=" + this.actionButtonType + ", dependenciesAttachments=" + this.dependenciesAttachments + ", errorMessage=" + this.errorMessage + ", availability=" + this.availability + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actionButtonType);
        parcel.writeStringList(this.dependenciesAttachments);
        parcel.writeString(this.errorMessage);
        this.availability.writeToParcel(parcel, i);
    }
}
