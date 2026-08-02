package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapEventItem implements SchemeStat$TypeAction.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("tap_event")
    private final CommonAudioStat$AudioDomainTapEvent tapEvent;

    public CommonAudioStat$TypeAudioTapEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.tapEvent = commonAudioStat$AudioDomainTapEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapEventItem commonAudioStat$TypeAudioTapEventItem = (CommonAudioStat$TypeAudioTapEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapEventItem.event) && epx.f(this.tapEvent, commonAudioStat$TypeAudioTapEventItem.tapEvent);
    }

    public final int hashCode() {
        return this.tapEvent.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        return "TypeAudioTapEventItem(event=" + this.event + ", tapEvent=" + this.tapEvent + ')';
    }
}
