package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioDownloadItem implements SchemeStat$TypeAction.b {

    @pmi0("entity")
    private final CommonAudioStat$AudioDomainEventEntity entity;

    public CommonAudioStat$TypeAudioDownloadItem(CommonAudioStat$AudioDomainEventEntity commonAudioStat$AudioDomainEventEntity) {
        this.entity = commonAudioStat$AudioDomainEventEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonAudioStat$TypeAudioDownloadItem) && epx.f(this.entity, ((CommonAudioStat$TypeAudioDownloadItem) obj).entity);
    }

    public final int hashCode() {
        return this.entity.hashCode();
    }

    public final String toString() {
        return "TypeAudioDownloadItem(entity=" + this.entity + ')';
    }
}
