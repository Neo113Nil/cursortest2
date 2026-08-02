package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapShowEventItem implements SchemeStat$TypeAction.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("target_source")
    private final CommonAudioStat$TypeAudioSourceEnum targetSource;

    public CommonAudioStat$TypeAudioTapShowEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.targetSource = commonAudioStat$TypeAudioSourceEnum;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapShowEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapShowEventItem commonAudioStat$TypeAudioTapShowEventItem = (CommonAudioStat$TypeAudioTapShowEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapShowEventItem.event) && this.targetSource == commonAudioStat$TypeAudioTapShowEventItem.targetSource;
    }

    public final int hashCode() {
        return this.targetSource.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        return "TypeAudioTapShowEventItem(event=" + this.event + ", targetSource=" + this.targetSource + ')';
    }
}
