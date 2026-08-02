package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsCallbackSettingsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsCallbackSettingsDto {

    @pmi0("api_version")
    private final String apiVersion;

    @pmi0("events")
    private final GroupsLongPollEventsDto events;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsCallbackSettingsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCallbackSettingsDto)) {
            return false;
        }
        GroupsCallbackSettingsDto groupsCallbackSettingsDto = (GroupsCallbackSettingsDto) obj;
        return epx.f(this.apiVersion, groupsCallbackSettingsDto.apiVersion) && epx.f(this.events, groupsCallbackSettingsDto.events);
    }

    public final int hashCode() {
        String str = this.apiVersion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        GroupsLongPollEventsDto groupsLongPollEventsDto = this.events;
        return hashCode + (groupsLongPollEventsDto != null ? groupsLongPollEventsDto.hashCode() : 0);
    }

    public final String toString() {
        return "GroupsCallbackSettingsDto(apiVersion=" + this.apiVersion + ", events=" + this.events + ")";
    }

    public GroupsCallbackSettingsDto(String str, GroupsLongPollEventsDto groupsLongPollEventsDto) {
        this.apiVersion = str;
        this.events = groupsLongPollEventsDto;
    }

    public /* synthetic */ GroupsCallbackSettingsDto(String str, GroupsLongPollEventsDto groupsLongPollEventsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : groupsLongPollEventsDto);
    }
}
