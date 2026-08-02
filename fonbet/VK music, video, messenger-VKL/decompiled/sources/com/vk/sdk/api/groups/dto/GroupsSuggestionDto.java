package com.vk.sdk.api.groups.dto;

import com.mbridge.msdk.foundation.entity.b;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupsSuggestionDto.kt */
/* loaded from: classes5.dex */
public final class GroupsSuggestionDto {

    @pmi0("description")
    private final String description;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("reason")
    private final ReasonDto reason;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupsSuggestionDto.kt */
    public static final class ReasonDto {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReasonDto[] $VALUES;

        @pmi0(b.JSON_KEY_ADS)
        public static final ReasonDto ADS;

        @pmi0("similar")
        public static final ReasonDto SIMILAR;
        private final String value;

        static {
            ReasonDto reasonDto = new ReasonDto("SIMILAR", 0, "similar");
            SIMILAR = reasonDto;
            ReasonDto reasonDto2 = new ReasonDto("ADS", 1, b.JSON_KEY_ADS);
            ADS = reasonDto2;
            ReasonDto[] reasonDtoArr = {reasonDto, reasonDto2};
            $VALUES = reasonDtoArr;
            $ENTRIES = new asp(reasonDtoArr);
        }

        private ReasonDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ReasonDto valueOf(String str) {
            return (ReasonDto) Enum.valueOf(ReasonDto.class, str);
        }

        public static ReasonDto[] values() {
            return (ReasonDto[]) $VALUES.clone();
        }
    }

    public GroupsSuggestionDto(GroupsGroupFullDto groupsGroupFullDto, String str, String str2, ReasonDto reasonDto) {
        this.group = groupsGroupFullDto;
        this.trackCode = str;
        this.description = str2;
        this.reason = reasonDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsSuggestionDto)) {
            return false;
        }
        GroupsSuggestionDto groupsSuggestionDto = (GroupsSuggestionDto) obj;
        return epx.f(this.group, groupsSuggestionDto.group) && epx.f(this.trackCode, groupsSuggestionDto.trackCode) && epx.f(this.description, groupsSuggestionDto.description) && this.reason == groupsSuggestionDto.reason;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.group.hashCode() * 31, 31, this.trackCode), 31, this.description);
        ReasonDto reasonDto = this.reason;
        return a + (reasonDto == null ? 0 : reasonDto.hashCode());
    }

    public final String toString() {
        return "GroupsSuggestionDto(group=" + this.group + ", trackCode=" + this.trackCode + ", description=" + this.description + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ GroupsSuggestionDto(GroupsGroupFullDto groupsGroupFullDto, String str, String str2, ReasonDto reasonDto, int i, zcl zclVar) {
        this(groupsGroupFullDto, str, str2, (i & 8) != 0 ? null : reasonDto);
    }
}
