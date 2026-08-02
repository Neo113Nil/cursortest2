package com.facebook.react.devsupport.inspector;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.sentry.rrweb.RRWebSpanEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrameTimingSequence.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;", "", "id", "", "threadId", "beginTimestamp", "", RRWebSpanEvent.JsonKeys.END_TIMESTAMP, "screenshot", "", "<init>", "(IIJJLjava/lang/String;)V", "getId", "()I", "getThreadId", "getBeginTimestamp", "()J", "getEndTimestamp", "getScreenshot", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FrameTimingSequence {
    private final long beginTimestamp;
    private final long endTimestamp;
    private final int id;
    private final String screenshot;
    private final int threadId;

    public static /* synthetic */ FrameTimingSequence copy$default(FrameTimingSequence frameTimingSequence, int i, int i2, long j, long j2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = frameTimingSequence.id;
        }
        if ((i3 & 2) != 0) {
            i2 = frameTimingSequence.threadId;
        }
        if ((i3 & 4) != 0) {
            j = frameTimingSequence.beginTimestamp;
        }
        if ((i3 & 8) != 0) {
            j2 = frameTimingSequence.endTimestamp;
        }
        if ((i3 & 16) != 0) {
            str = frameTimingSequence.screenshot;
        }
        String str2 = str;
        long j3 = j2;
        return frameTimingSequence.copy(i, i2, j, j3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getThreadId() {
        return this.threadId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBeginTimestamp() {
        return this.beginTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScreenshot() {
        return this.screenshot;
    }

    public final FrameTimingSequence copy(int id, int threadId, long beginTimestamp, long endTimestamp, String screenshot) {
        return new FrameTimingSequence(id, threadId, beginTimestamp, endTimestamp, screenshot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameTimingSequence)) {
            return false;
        }
        FrameTimingSequence frameTimingSequence = (FrameTimingSequence) other;
        return this.id == frameTimingSequence.id && this.threadId == frameTimingSequence.threadId && this.beginTimestamp == frameTimingSequence.beginTimestamp && this.endTimestamp == frameTimingSequence.endTimestamp && Intrinsics.areEqual(this.screenshot, frameTimingSequence.screenshot);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.threadId)) * 31) + Long.hashCode(this.beginTimestamp)) * 31) + Long.hashCode(this.endTimestamp)) * 31;
        String str = this.screenshot;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FrameTimingSequence(id=" + this.id + ", threadId=" + this.threadId + ", beginTimestamp=" + this.beginTimestamp + ", endTimestamp=" + this.endTimestamp + ", screenshot=" + this.screenshot + ")";
    }

    public FrameTimingSequence(int i, int i2, long j, long j2, String str) {
        this.id = i;
        this.threadId = i2;
        this.beginTimestamp = j;
        this.endTimestamp = j2;
        this.screenshot = str;
    }

    public /* synthetic */ FrameTimingSequence(int i, int i2, long j, long j2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, j2, (i3 & 16) != 0 ? null : str);
    }

    public final int getId() {
        return this.id;
    }

    public final int getThreadId() {
        return this.threadId;
    }

    public final long getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final String getScreenshot() {
        return this.screenshot;
    }
}
