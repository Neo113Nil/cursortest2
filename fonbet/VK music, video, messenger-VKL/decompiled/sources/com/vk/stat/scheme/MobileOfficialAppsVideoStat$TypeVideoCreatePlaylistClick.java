package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick implements SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final String eventType;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick) && epx.f(this.eventType, ((MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick) obj).eventType);
    }

    public final int hashCode() {
        return this.eventType.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeVideoCreatePlaylistClick(eventType="), this.eventType, ')');
    }

    public MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick(String str) {
        this.eventType = str;
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoCreatePlaylistClick(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? "create_playlist" : str);
    }
}
