package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GroupsLongPollSettingsDto.kt */
/* loaded from: classes5.dex */
public final class GroupsLongPollSettingsDto {

    @pmi0("api_version")
    private final String apiVersion;

    @pmi0("events")
    private final GroupsLongPollEventsDto events;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    public GroupsLongPollSettingsDto(GroupsLongPollEventsDto groupsLongPollEventsDto, boolean z, String str) {
        this.events = groupsLongPollEventsDto;
        this.isEnabled = z;
        this.apiVersion = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLongPollSettingsDto)) {
            return false;
        }
        GroupsLongPollSettingsDto groupsLongPollSettingsDto = (GroupsLongPollSettingsDto) obj;
        return epx.f(this.events, groupsLongPollSettingsDto.events) && this.isEnabled == groupsLongPollSettingsDto.isEnabled && epx.f(this.apiVersion, groupsLongPollSettingsDto.apiVersion);
    }

    public final int hashCode() {
        int b = qoy.b(this.events.hashCode() * 31, 31, this.isEnabled);
        String str = this.apiVersion;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        GroupsLongPollEventsDto groupsLongPollEventsDto = this.events;
        boolean z = this.isEnabled;
        String str = this.apiVersion;
        StringBuilder sb = new StringBuilder("GroupsLongPollSettingsDto(events=");
        sb.append(groupsLongPollEventsDto);
        sb.append(", isEnabled=");
        sb.append(z);
        sb.append(", apiVersion=");
        return i5s.a(sb, str, ")");
    }

    public /* synthetic */ GroupsLongPollSettingsDto(GroupsLongPollEventsDto groupsLongPollEventsDto, boolean z, String str, int i, zcl zclVar) {
        this(groupsLongPollEventsDto, z, (i & 4) != 0 ? null : str);
    }
}
