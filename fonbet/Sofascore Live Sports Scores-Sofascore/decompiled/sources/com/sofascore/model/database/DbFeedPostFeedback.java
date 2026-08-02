package com.sofascore.model.database;

import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/model/database/DbFeedPostFeedback;", "", "postId", "", "feedbackTimestamp", "", "<init>", "(IJ)V", "getPostId", "()I", "getFeedbackTimestamp", "()J", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DbFeedPostFeedback {
    private final long feedbackTimestamp;
    private final int postId;

    public DbFeedPostFeedback(int i, long j) {
        this.postId = i;
        this.feedbackTimestamp = j;
    }

    public final long getFeedbackTimestamp() {
        return this.feedbackTimestamp;
    }

    public final int getPostId() {
        return this.postId;
    }
}
