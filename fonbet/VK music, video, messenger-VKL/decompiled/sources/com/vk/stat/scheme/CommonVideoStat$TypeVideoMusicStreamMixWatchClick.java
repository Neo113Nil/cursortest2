package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoStat$TypeVideoMusicStreamMixWatchClick implements SchemeStat$TypeClick.b {

    @pmi0("event_subtype")
    private final String eventSubtype;

    @pmi0("event_type")
    private final String eventType;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonVideoStat$TypeVideoMusicStreamMixWatchClick() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$TypeVideoMusicStreamMixWatchClick)) {
            return false;
        }
        CommonVideoStat$TypeVideoMusicStreamMixWatchClick commonVideoStat$TypeVideoMusicStreamMixWatchClick = (CommonVideoStat$TypeVideoMusicStreamMixWatchClick) obj;
        return epx.f(this.eventType, commonVideoStat$TypeVideoMusicStreamMixWatchClick.eventType) && epx.f(this.eventSubtype, commonVideoStat$TypeVideoMusicStreamMixWatchClick.eventSubtype);
    }

    public final int hashCode() {
        return this.eventSubtype.hashCode() + (this.eventType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVideoMusicStreamMixWatchClick(eventType=");
        sb.append(this.eventType);
        sb.append(", eventSubtype=");
        return ho8.a(sb, this.eventSubtype, ')');
    }

    public CommonVideoStat$TypeVideoMusicStreamMixWatchClick(String str, String str2) {
        this.eventType = str;
        this.eventSubtype = str2;
    }

    public /* synthetic */ CommonVideoStat$TypeVideoMusicStreamMixWatchClick(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "top_shelf_click" : str, (i & 2) != 0 ? "video_music_mix_watch" : str2);
    }
}
