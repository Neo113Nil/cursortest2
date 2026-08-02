package com.vk.sdk.api.groups.dto;

import com.ironsource.Hb;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;

/* compiled from: GroupsLongPollServerDto.kt */
/* loaded from: classes5.dex */
public final class GroupsLongPollServerDto {

    @pmi0("key")
    private final String key;

    @pmi0(Hb.a)
    private final String server;

    @pmi0("ts")
    private final String ts;

    public GroupsLongPollServerDto(String str, String str2, String str3) {
        this.key = str;
        this.server = str2;
        this.ts = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsLongPollServerDto)) {
            return false;
        }
        GroupsLongPollServerDto groupsLongPollServerDto = (GroupsLongPollServerDto) obj;
        return epx.f(this.key, groupsLongPollServerDto.key) && epx.f(this.server, groupsLongPollServerDto.server) && epx.f(this.ts, groupsLongPollServerDto.ts);
    }

    public final int hashCode() {
        return this.ts.hashCode() + urd0.a(this.key.hashCode() * 31, 31, this.server);
    }

    public final String toString() {
        String str = this.key;
        String str2 = this.server;
        return i5s.a(xe9.a("GroupsLongPollServerDto(key=", str, ", server=", str2, ", ts="), this.ts, ")");
    }
}
