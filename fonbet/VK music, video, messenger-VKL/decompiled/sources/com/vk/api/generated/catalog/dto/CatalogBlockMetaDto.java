package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogBlockMetaDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBlockMetaDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockMetaDto> CREATOR = new a();

    @pmi0("anchor")
    private final AnchorDto anchor;

    @pmi0("audio_onboarding")
    private final CatalogOnboardingInfoDto audioOnboarding;

    @pmi0("campaign_name")
    private final String campaignName;

    @pmi0("context")
    private final ContextDto context;

    @pmi0("disable_track_rec_shown")
    private final Boolean disableTrackRecShown;

    @pmi0("no_consecutive_play")
    private final Boolean noConsecutivePlay;

    @pmi0("show_all_info")
    private final CatalogShowAllInfoDto showAllInfo;

    @pmi0("uxpoll_trigger")
    private final String uxpollTrigger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBlockMetaDto.kt */
    public static final class AnchorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnchorDto[] $VALUES;

        @pmi0("activities")
        public static final AnchorDto ACTIVITIES;
        public static final Parcelable.Creator<AnchorDto> CREATOR;

        @pmi0("editors_choice")
        public static final AnchorDto EDITORS_CHOICE;

        @pmi0("genres")
        public static final AnchorDto GENRES;

        @pmi0("listenothers")
        public static final AnchorDto LISTENOTHERS;

        @pmi0("newalbums")
        public static final AnchorDto NEWALBUMS;

        @pmi0("vibes")
        public static final AnchorDto VIBES;
        private final String value;

        /* compiled from: CatalogBlockMetaDto.kt */
        public static final class a implements Parcelable.Creator<AnchorDto> {
            @Override // android.os.Parcelable.Creator
            public final AnchorDto createFromParcel(Parcel parcel) {
                return AnchorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AnchorDto[] newArray(int i) {
                return new AnchorDto[i];
            }
        }

        static {
            AnchorDto anchorDto = new AnchorDto("EDITORS_CHOICE", 0, "editors_choice");
            EDITORS_CHOICE = anchorDto;
            AnchorDto anchorDto2 = new AnchorDto("NEWALBUMS", 1, "newalbums");
            NEWALBUMS = anchorDto2;
            AnchorDto anchorDto3 = new AnchorDto("VIBES", 2, "vibes");
            VIBES = anchorDto3;
            AnchorDto anchorDto4 = new AnchorDto("GENRES", 3, "genres");
            GENRES = anchorDto4;
            AnchorDto anchorDto5 = new AnchorDto("ACTIVITIES", 4, "activities");
            ACTIVITIES = anchorDto5;
            AnchorDto anchorDto6 = new AnchorDto("LISTENOTHERS", 5, "listenothers");
            LISTENOTHERS = anchorDto6;
            AnchorDto[] anchorDtoArr = {anchorDto, anchorDto2, anchorDto3, anchorDto4, anchorDto5, anchorDto6};
            $VALUES = anchorDtoArr;
            $ENTRIES = new asp(anchorDtoArr);
            CREATOR = new a();
        }

        private AnchorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AnchorDto valueOf(String str) {
            return (AnchorDto) Enum.valueOf(AnchorDto.class, str);
        }

        public static AnchorDto[] values() {
            return (AnchorDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBlockMetaDto.kt */
    public static final class ContextDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContextDto[] $VALUES;
        public static final Parcelable.Creator<ContextDto> CREATOR;

        @pmi0("kids_section")
        public static final ContextDto KIDS_SECTION;

        @pmi0("unknown")
        public static final ContextDto UNKNOWN;
        private final String value;

        /* compiled from: CatalogBlockMetaDto.kt */
        public static final class a implements Parcelable.Creator<ContextDto> {
            @Override // android.os.Parcelable.Creator
            public final ContextDto createFromParcel(Parcel parcel) {
                return ContextDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ContextDto[] newArray(int i) {
                return new ContextDto[i];
            }
        }

        static {
            ContextDto contextDto = new ContextDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "unknown");
            UNKNOWN = contextDto;
            ContextDto contextDto2 = new ContextDto("KIDS_SECTION", 1, "kids_section");
            KIDS_SECTION = contextDto2;
            ContextDto[] contextDtoArr = {contextDto, contextDto2};
            $VALUES = contextDtoArr;
            $ENTRIES = new asp(contextDtoArr);
            CREATOR = new a();
        }

        private ContextDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ContextDto valueOf(String str) {
            return (ContextDto) Enum.valueOf(ContextDto.class, str);
        }

        public static ContextDto[] values() {
            return (ContextDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: CatalogBlockMetaDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockMetaDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            CatalogOnboardingInfoDto createFromParcel = parcel.readInt() == 0 ? null : CatalogOnboardingInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CatalogBlockMetaDto(valueOf, readString, createFromParcel, valueOf2, parcel.readInt() == 0 ? null : AnchorDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CatalogShowAllInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ContextDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockMetaDto[] newArray(int i) {
            return new CatalogBlockMetaDto[i];
        }
    }

    public CatalogBlockMetaDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final CatalogOnboardingInfoDto d() {
        return this.audioOnboarding;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.campaignName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBlockMetaDto)) {
            return false;
        }
        CatalogBlockMetaDto catalogBlockMetaDto = (CatalogBlockMetaDto) obj;
        return epx.f(this.noConsecutivePlay, catalogBlockMetaDto.noConsecutivePlay) && epx.f(this.campaignName, catalogBlockMetaDto.campaignName) && epx.f(this.audioOnboarding, catalogBlockMetaDto.audioOnboarding) && epx.f(this.disableTrackRecShown, catalogBlockMetaDto.disableTrackRecShown) && this.anchor == catalogBlockMetaDto.anchor && epx.f(this.showAllInfo, catalogBlockMetaDto.showAllInfo) && this.context == catalogBlockMetaDto.context && epx.f(this.uxpollTrigger, catalogBlockMetaDto.uxpollTrigger);
    }

    public final ContextDto f() {
        return this.context;
    }

    public final Boolean g() {
        return this.noConsecutivePlay;
    }

    public final int hashCode() {
        Boolean bool = this.noConsecutivePlay;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.campaignName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CatalogOnboardingInfoDto catalogOnboardingInfoDto = this.audioOnboarding;
        int hashCode3 = (hashCode2 + (catalogOnboardingInfoDto == null ? 0 : catalogOnboardingInfoDto.hashCode())) * 31;
        Boolean bool2 = this.disableTrackRecShown;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AnchorDto anchorDto = this.anchor;
        int hashCode5 = (hashCode4 + (anchorDto == null ? 0 : anchorDto.hashCode())) * 31;
        CatalogShowAllInfoDto catalogShowAllInfoDto = this.showAllInfo;
        int hashCode6 = (hashCode5 + (catalogShowAllInfoDto == null ? 0 : catalogShowAllInfoDto.hashCode())) * 31;
        ContextDto contextDto = this.context;
        int hashCode7 = (hashCode6 + (contextDto == null ? 0 : contextDto.hashCode())) * 31;
        String str2 = this.uxpollTrigger;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final CatalogShowAllInfoDto i() {
        return this.showAllInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBlockMetaDto(noConsecutivePlay=");
        sb.append(this.noConsecutivePlay);
        sb.append(", campaignName=");
        sb.append(this.campaignName);
        sb.append(", audioOnboarding=");
        sb.append(this.audioOnboarding);
        sb.append(", disableTrackRecShown=");
        sb.append(this.disableTrackRecShown);
        sb.append(", anchor=");
        sb.append(this.anchor);
        sb.append(", showAllInfo=");
        sb.append(this.showAllInfo);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", uxpollTrigger=");
        return ho8.a(sb, this.uxpollTrigger, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.noConsecutivePlay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.campaignName);
        CatalogOnboardingInfoDto catalogOnboardingInfoDto = this.audioOnboarding;
        if (catalogOnboardingInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogOnboardingInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.disableTrackRecShown;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        AnchorDto anchorDto = this.anchor;
        if (anchorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            anchorDto.writeToParcel(parcel, i);
        }
        CatalogShowAllInfoDto catalogShowAllInfoDto = this.showAllInfo;
        if (catalogShowAllInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogShowAllInfoDto.writeToParcel(parcel, i);
        }
        ContextDto contextDto = this.context;
        if (contextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contextDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.uxpollTrigger);
    }

    public CatalogBlockMetaDto(Boolean bool, String str, CatalogOnboardingInfoDto catalogOnboardingInfoDto, Boolean bool2, AnchorDto anchorDto, CatalogShowAllInfoDto catalogShowAllInfoDto, ContextDto contextDto, String str2) {
        this.noConsecutivePlay = bool;
        this.campaignName = str;
        this.audioOnboarding = catalogOnboardingInfoDto;
        this.disableTrackRecShown = bool2;
        this.anchor = anchorDto;
        this.showAllInfo = catalogShowAllInfoDto;
        this.context = contextDto;
        this.uxpollTrigger = str2;
    }

    public /* synthetic */ CatalogBlockMetaDto(Boolean bool, String str, CatalogOnboardingInfoDto catalogOnboardingInfoDto, Boolean bool2, AnchorDto anchorDto, CatalogShowAllInfoDto catalogShowAllInfoDto, ContextDto contextDto, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : catalogOnboardingInfoDto, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : anchorDto, (i & 32) != 0 ? null : catalogShowAllInfoDto, (i & 64) != 0 ? null : contextDto, (i & 128) != 0 ? null : str2);
    }
}
