package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapSettingsEventItem implements SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    public CommonAudioStat$TypeAudioTapSettingsEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonAudioStat$TypeAudioTapSettingsEventItem) && epx.f(this.event, ((CommonAudioStat$TypeAudioTapSettingsEventItem) obj).event);
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "TypeAudioTapSettingsEventItem(event=" + this.event + ')';
    }
}
