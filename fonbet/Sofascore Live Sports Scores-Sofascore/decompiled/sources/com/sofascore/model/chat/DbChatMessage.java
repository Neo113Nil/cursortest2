package com.sofascore.model.chat;

import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sofascore/model/chat/DbChatMessage;", "Ljava/io/Serializable;", "eventId", "", "messageTimestamp", "", "voteTimestamp", "reportTimestamp", "<init>", "(IJJJ)V", "getEventId", "()I", "getMessageTimestamp", "()J", "getVoteTimestamp", "setVoteTimestamp", "(J)V", "getReportTimestamp", "setReportTimestamp", "isVoted", "", "()Z", "isReported", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DbChatMessage implements Serializable {
    private final int eventId;
    private final long messageTimestamp;
    private long reportTimestamp;
    private long voteTimestamp;

    public DbChatMessage(int i, long j, long j2, long j3) {
        this.eventId = i;
        this.messageTimestamp = j;
        this.voteTimestamp = j2;
        this.reportTimestamp = j3;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final long getMessageTimestamp() {
        return this.messageTimestamp;
    }

    public final long getReportTimestamp() {
        return this.reportTimestamp;
    }

    public final long getVoteTimestamp() {
        return this.voteTimestamp;
    }

    public final boolean isReported() {
        return this.reportTimestamp > 0;
    }

    public final boolean isVoted() {
        return this.voteTimestamp > 0;
    }

    public final void setReportTimestamp(long j) {
        this.reportTimestamp = j;
    }

    public final void setVoteTimestamp(long j) {
        this.voteTimestamp = j;
    }
}
