package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapSearchEventItem implements SchemeStat$TypeAction.b {

    @pmi0("by_voice")
    private final boolean byVoice;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("tap_event")
    private final CommonAudioStat$AudioDomainTapEvent tapEvent;

    public CommonAudioStat$TypeAudioTapSearchEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent, boolean z) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.tapEvent = commonAudioStat$AudioDomainTapEvent;
        this.byVoice = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapSearchEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapSearchEventItem commonAudioStat$TypeAudioTapSearchEventItem = (CommonAudioStat$TypeAudioTapSearchEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapSearchEventItem.event) && epx.f(this.tapEvent, commonAudioStat$TypeAudioTapSearchEventItem.tapEvent) && this.byVoice == commonAudioStat$TypeAudioTapSearchEventItem.byVoice;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.byVoice) + ((this.tapEvent.hashCode() + (this.event.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioTapSearchEventItem(event=");
        sb.append(this.event);
        sb.append(", tapEvent=");
        sb.append(this.tapEvent);
        sb.append(", byVoice=");
        return defpackage.q0.a(sb, this.byVoice, ')');
    }
}
