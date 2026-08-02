package com.sofascore.model.mvvm.model;

import defpackage.dmi;
import defpackage.lnb;
import defpackage.wv8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sofascore/model/mvvm/model/TvChannelVote;", "", "eventId", "", "channelId", "isConfirmed", "", "timestamp", "", "<init>", "(IIZJ)V", "getEventId", "()I", "getChannelId", "()Z", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TvChannelVote {
    private final int channelId;
    private final int eventId;
    private final boolean isConfirmed;
    private final long timestamp;

    public TvChannelVote(int i, int i2, boolean z, long j) {
        this.eventId = i;
        this.channelId = i2;
        this.isConfirmed = z;
        this.timestamp = j;
    }

    public static /* synthetic */ TvChannelVote copy$default(TvChannelVote tvChannelVote, int i, int i2, boolean z, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tvChannelVote.eventId;
        }
        if ((i3 & 2) != 0) {
            i2 = tvChannelVote.channelId;
        }
        if ((i3 & 4) != 0) {
            z = tvChannelVote.isConfirmed;
        }
        if ((i3 & 8) != 0) {
            j = tvChannelVote.timestamp;
        }
        boolean z2 = z;
        return tvChannelVote.copy(i, i2, z2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChannelId() {
        return this.channelId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsConfirmed() {
        return this.isConfirmed;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final TvChannelVote copy(int eventId, int channelId, boolean isConfirmed, long timestamp) {
        return new TvChannelVote(eventId, channelId, isConfirmed, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TvChannelVote)) {
            return false;
        }
        TvChannelVote tvChannelVote = (TvChannelVote) other;
        return this.eventId == tvChannelVote.eventId && this.channelId == tvChannelVote.channelId && this.isConfirmed == tvChannelVote.isConfirmed && this.timestamp == tvChannelVote.timestamp;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + dmi.e(wv8.a(this.channelId, Integer.hashCode(this.eventId) * 31, 31), 31, this.isConfirmed);
    }

    public final boolean isConfirmed() {
        return this.isConfirmed;
    }

    @NotNull
    public String toString() {
        int i = this.eventId;
        int i2 = this.channelId;
        boolean z = this.isConfirmed;
        long j = this.timestamp;
        StringBuilder s = lnb.s(i, i2, "TvChannelVote(eventId=", ", channelId=", ", isConfirmed=");
        s.append(z);
        s.append(", timestamp=");
        s.append(j);
        s.append(")");
        return s.toString();
    }
}
