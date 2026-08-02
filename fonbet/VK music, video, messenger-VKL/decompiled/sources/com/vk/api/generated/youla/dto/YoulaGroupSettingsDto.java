package com.vk.api.generated.youla.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.O6;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ao;
import xsna.asp;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: YoulaGroupSettingsDto.kt */
/* loaded from: classes15.dex */
public final class YoulaGroupSettingsDto implements Parcelable {
    public static final Parcelable.Creator<YoulaGroupSettingsDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("decline_reason")
    private final DeclineReasonDto declineReason;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("group_mode")
    private final GroupModeDto groupMode;

    @pmi0("has_group_token")
    private final Boolean hasGroupToken;

    @pmi0("is_active")
    private final boolean isActive;

    @pmi0("is_moderated")
    private final boolean isModerated;

    @pmi0(O6.s)
    private final Float lat;

    /* renamed from: long, reason: not valid java name */
    @pmi0("long")
    private final Float f29long;

    @pmi0("moderation_status")
    private final Integer moderationStatus;

    @pmi0("publish_mode")
    private final PublishModeDto publishMode;

    @pmi0("radius")
    private final Float radius;

    @pmi0("radius_area")
    private final String radiusArea;

    @pmi0("radiuses")
    private final List<Float> radiuses;

    @pmi0("selected_category_ids")
    private final List<Integer> selectedCategoryIds;

    @pmi0("show_moderation_setting")
    private final boolean showModerationSetting;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YoulaGroupSettingsDto.kt */
    public static final class DeclineReasonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DeclineReasonDto[] $VALUES;
        public static final Parcelable.Creator<DeclineReasonDto> CREATOR;

        @pmi0("large_radius")
        public static final DeclineReasonDto LARGE_RADIUS;

        @pmi0("not_relevant")
        public static final DeclineReasonDto NOT_RELEVANT;

        @pmi0("other")
        public static final DeclineReasonDto OTHER;

        @pmi0("wrong_category")
        public static final DeclineReasonDto WRONG_CATEGORY;

        @pmi0("wrong_geo")
        public static final DeclineReasonDto WRONG_GEO;
        private final String value;

        /* compiled from: YoulaGroupSettingsDto.kt */
        public static final class a implements Parcelable.Creator<DeclineReasonDto> {
            @Override // android.os.Parcelable.Creator
            public final DeclineReasonDto createFromParcel(Parcel parcel) {
                return DeclineReasonDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeclineReasonDto[] newArray(int i) {
                return new DeclineReasonDto[i];
            }
        }

        static {
            DeclineReasonDto declineReasonDto = new DeclineReasonDto(NativeAdContent.ViewTag.OTHER, 0, "other");
            OTHER = declineReasonDto;
            DeclineReasonDto declineReasonDto2 = new DeclineReasonDto("LARGE_RADIUS", 1, "large_radius");
            LARGE_RADIUS = declineReasonDto2;
            DeclineReasonDto declineReasonDto3 = new DeclineReasonDto("WRONG_CATEGORY", 2, "wrong_category");
            WRONG_CATEGORY = declineReasonDto3;
            DeclineReasonDto declineReasonDto4 = new DeclineReasonDto("NOT_RELEVANT", 3, "not_relevant");
            NOT_RELEVANT = declineReasonDto4;
            DeclineReasonDto declineReasonDto5 = new DeclineReasonDto("WRONG_GEO", 4, "wrong_geo");
            WRONG_GEO = declineReasonDto5;
            DeclineReasonDto[] declineReasonDtoArr = {declineReasonDto, declineReasonDto2, declineReasonDto3, declineReasonDto4, declineReasonDto5};
            $VALUES = declineReasonDtoArr;
            $ENTRIES = new asp(declineReasonDtoArr);
            CREATOR = new a();
        }

        private DeclineReasonDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static DeclineReasonDto valueOf(String str) {
            return (DeclineReasonDto) Enum.valueOf(DeclineReasonDto.class, str);
        }

        public static DeclineReasonDto[] values() {
            return (DeclineReasonDto[]) $VALUES.clone();
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
    /* compiled from: YoulaGroupSettingsDto.kt */
    public static final class GroupModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GroupModeDto[] $VALUES;

        @pmi0("2")
        public static final GroupModeDto ANTIBARAHOLKA;

        @pmi0("1")
        public static final GroupModeDto BARAHOLKA;
        public static final Parcelable.Creator<GroupModeDto> CREATOR;

        @pmi0("0")
        public static final GroupModeDto DISABLED;
        private final int value;

        /* compiled from: YoulaGroupSettingsDto.kt */
        public static final class a implements Parcelable.Creator<GroupModeDto> {
            @Override // android.os.Parcelable.Creator
            public final GroupModeDto createFromParcel(Parcel parcel) {
                return GroupModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GroupModeDto[] newArray(int i) {
                return new GroupModeDto[i];
            }
        }

        static {
            GroupModeDto groupModeDto = new GroupModeDto("DISABLED", 0, 0);
            DISABLED = groupModeDto;
            GroupModeDto groupModeDto2 = new GroupModeDto("BARAHOLKA", 1, 1);
            BARAHOLKA = groupModeDto2;
            GroupModeDto groupModeDto3 = new GroupModeDto("ANTIBARAHOLKA", 2, 2);
            ANTIBARAHOLKA = groupModeDto3;
            GroupModeDto[] groupModeDtoArr = {groupModeDto, groupModeDto2, groupModeDto3};
            $VALUES = groupModeDtoArr;
            $ENTRIES = new asp(groupModeDtoArr);
            CREATOR = new a();
        }

        private GroupModeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static GroupModeDto valueOf(String str) {
            return (GroupModeDto) Enum.valueOf(GroupModeDto.class, str);
        }

        public static GroupModeDto[] values() {
            return (GroupModeDto[]) $VALUES.clone();
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
    /* compiled from: YoulaGroupSettingsDto.kt */
    public static final class PublishModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PublishModeDto[] $VALUES;
        public static final Parcelable.Creator<PublishModeDto> CREATOR;

        @pmi0("2")
        public static final PublishModeDto GROUP_SECTION_ONLY;

        @pmi0("1")
        public static final PublishModeDto SUGGEST;

        @pmi0("0")
        public static final PublishModeDto WALL;
        private final int value;

        /* compiled from: YoulaGroupSettingsDto.kt */
        public static final class a implements Parcelable.Creator<PublishModeDto> {
            @Override // android.os.Parcelable.Creator
            public final PublishModeDto createFromParcel(Parcel parcel) {
                return PublishModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PublishModeDto[] newArray(int i) {
                return new PublishModeDto[i];
            }
        }

        static {
            PublishModeDto publishModeDto = new PublishModeDto("WALL", 0, 0);
            WALL = publishModeDto;
            PublishModeDto publishModeDto2 = new PublishModeDto("SUGGEST", 1, 1);
            SUGGEST = publishModeDto2;
            PublishModeDto publishModeDto3 = new PublishModeDto("GROUP_SECTION_ONLY", 2, 2);
            GROUP_SECTION_ONLY = publishModeDto3;
            PublishModeDto[] publishModeDtoArr = {publishModeDto, publishModeDto2, publishModeDto3};
            $VALUES = publishModeDtoArr;
            $ENTRIES = new asp(publishModeDtoArr);
            CREATOR = new a();
        }

        private PublishModeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static PublishModeDto valueOf(String str) {
            return (PublishModeDto) Enum.valueOf(PublishModeDto.class, str);
        }

        public static PublishModeDto[] values() {
            return (PublishModeDto[]) $VALUES.clone();
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

    /* compiled from: YoulaGroupSettingsDto.kt */
    public static final class a implements Parcelable.Creator<YoulaGroupSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final YoulaGroupSettingsDto createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            UserId userId = (UserId) parcel.readParcelable(YoulaGroupSettingsDto.class.getClassLoader());
            ArrayList arrayList2 = null;
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DeclineReasonDto createFromParcel = parcel.readInt() == 0 ? null : DeclineReasonDto.CREATOR.createFromParcel(parcel);
            PublishModeDto createFromParcel2 = parcel.readInt() == 0 ? null : PublishModeDto.CREATOR.createFromParcel(parcel);
            GroupModeDto createFromParcel3 = parcel.readInt() == 0 ? null : GroupModeDto.CREATOR.createFromParcel(parcel);
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(Float.valueOf(parcel.readFloat()));
                }
            }
            return new YoulaGroupSettingsDto(z, z2, z3, arrayList, userId, valueOf, valueOf2, createFromParcel, createFromParcel2, createFromParcel3, valueOf3, valueOf4, valueOf5, readString, readString2, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final YoulaGroupSettingsDto[] newArray(int i) {
            return new YoulaGroupSettingsDto[i];
        }
    }

    public YoulaGroupSettingsDto(boolean z, boolean z2, boolean z3, List<Integer> list, UserId userId, Boolean bool, Integer num, DeclineReasonDto declineReasonDto, PublishModeDto publishModeDto, GroupModeDto groupModeDto, Float f, Float f2, Float f3, String str, String str2, List<Float> list2) {
        this.isActive = z;
        this.isModerated = z2;
        this.showModerationSetting = z3;
        this.selectedCategoryIds = list;
        this.groupId = userId;
        this.hasGroupToken = bool;
        this.moderationStatus = num;
        this.declineReason = declineReasonDto;
        this.publishMode = publishModeDto;
        this.groupMode = groupModeDto;
        this.lat = f;
        this.f29long = f2;
        this.radius = f3;
        this.radiusArea = str;
        this.address = str2;
        this.radiuses = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YoulaGroupSettingsDto)) {
            return false;
        }
        YoulaGroupSettingsDto youlaGroupSettingsDto = (YoulaGroupSettingsDto) obj;
        return this.isActive == youlaGroupSettingsDto.isActive && this.isModerated == youlaGroupSettingsDto.isModerated && this.showModerationSetting == youlaGroupSettingsDto.showModerationSetting && epx.f(this.selectedCategoryIds, youlaGroupSettingsDto.selectedCategoryIds) && epx.f(this.groupId, youlaGroupSettingsDto.groupId) && epx.f(this.hasGroupToken, youlaGroupSettingsDto.hasGroupToken) && epx.f(this.moderationStatus, youlaGroupSettingsDto.moderationStatus) && this.declineReason == youlaGroupSettingsDto.declineReason && this.publishMode == youlaGroupSettingsDto.publishMode && this.groupMode == youlaGroupSettingsDto.groupMode && epx.f(this.lat, youlaGroupSettingsDto.lat) && epx.f(this.f29long, youlaGroupSettingsDto.f29long) && epx.f(this.radius, youlaGroupSettingsDto.radius) && epx.f(this.radiusArea, youlaGroupSettingsDto.radiusArea) && epx.f(this.address, youlaGroupSettingsDto.address) && epx.f(this.radiuses, youlaGroupSettingsDto.radiuses);
    }

    public final int hashCode() {
        int a2 = fw3.a(qoy.b(qoy.b(Boolean.hashCode(this.isActive) * 31, 31, this.isModerated), 31, this.showModerationSetting), 31, this.selectedCategoryIds);
        UserId userId = this.groupId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool = this.hasGroupToken;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.moderationStatus;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        DeclineReasonDto declineReasonDto = this.declineReason;
        int hashCode4 = (hashCode3 + (declineReasonDto == null ? 0 : declineReasonDto.hashCode())) * 31;
        PublishModeDto publishModeDto = this.publishMode;
        int hashCode5 = (hashCode4 + (publishModeDto == null ? 0 : publishModeDto.hashCode())) * 31;
        GroupModeDto groupModeDto = this.groupMode;
        int hashCode6 = (hashCode5 + (groupModeDto == null ? 0 : groupModeDto.hashCode())) * 31;
        Float f = this.lat;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f29long;
        int hashCode8 = (hashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.radius;
        int hashCode9 = (hashCode8 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str = this.radiusArea;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Float> list = this.radiuses;
        return hashCode11 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YoulaGroupSettingsDto(isActive=");
        sb.append(this.isActive);
        sb.append(", isModerated=");
        sb.append(this.isModerated);
        sb.append(", showModerationSetting=");
        sb.append(this.showModerationSetting);
        sb.append(", selectedCategoryIds=");
        sb.append(this.selectedCategoryIds);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", hasGroupToken=");
        sb.append(this.hasGroupToken);
        sb.append(", moderationStatus=");
        sb.append(this.moderationStatus);
        sb.append(", declineReason=");
        sb.append(this.declineReason);
        sb.append(", publishMode=");
        sb.append(this.publishMode);
        sb.append(", groupMode=");
        sb.append(this.groupMode);
        sb.append(", lat=");
        sb.append(this.lat);
        sb.append(", long=");
        sb.append(this.f29long);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", radiusArea=");
        sb.append(this.radiusArea);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", radiuses=");
        return ms9.a(')', sb, this.radiuses);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeInt(this.isModerated ? 1 : 0);
        parcel.writeInt(this.showModerationSetting ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.selectedCategoryIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeParcelable(this.groupId, i);
        Boolean bool = this.hasGroupToken;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.moderationStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        DeclineReasonDto declineReasonDto = this.declineReason;
        if (declineReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            declineReasonDto.writeToParcel(parcel, i);
        }
        PublishModeDto publishModeDto = this.publishMode;
        if (publishModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publishModeDto.writeToParcel(parcel, i);
        }
        GroupModeDto groupModeDto = this.groupMode;
        if (groupModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupModeDto.writeToParcel(parcel, i);
        }
        Float f = this.lat;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.f29long;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Float f3 = this.radius;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        parcel.writeString(this.radiusArea);
        parcel.writeString(this.address);
        List<Float> list = this.radiuses;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list, 1);
        while (f4.hasNext()) {
            parcel.writeFloat(((Number) f4.next()).floatValue());
        }
    }

    public /* synthetic */ YoulaGroupSettingsDto(boolean z, boolean z2, boolean z3, List list, UserId userId, Boolean bool, Integer num, DeclineReasonDto declineReasonDto, PublishModeDto publishModeDto, GroupModeDto groupModeDto, Float f, Float f2, Float f3, String str, String str2, List list2, int i, zcl zclVar) {
        this(z, z2, z3, list, (i & 16) != 0 ? null : userId, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : declineReasonDto, (i & 256) != 0 ? null : publishModeDto, (i & 512) != 0 ? null : groupModeDto, (i & 1024) != 0 ? null : f, (i & 2048) != 0 ? null : f2, (i & 4096) != 0 ? null : f3, (i & 8192) != 0 ? null : str, (i & 16384) != 0 ? null : str2, (i & 32768) != 0 ? null : list2);
    }
}
