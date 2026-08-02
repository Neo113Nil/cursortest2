package com.facebook.react.devsupport.inspector;

import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/facebook/react/devsupport/inspector/FrameTimingSequence;", "", StackTraceHelper.ID_KEY, "", "threadId", "beginDrawingTimestamp", "", "commitTimestamp", "endDrawingTimestamp", "screenshot", "", "<init>", "(IIJJJLjava/lang/String;)V", "getId", "()I", "getThreadId", "getBeginDrawingTimestamp", "()J", "getCommitTimestamp", "getEndDrawingTimestamp", "getScreenshot", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FrameTimingSequence {
    private final long beginDrawingTimestamp;
    private final long commitTimestamp;
    private final long endDrawingTimestamp;
    private final int id;

    @Nullable
    private final String screenshot;
    private final int threadId;

    public FrameTimingSequence(int i10, int i11, long j10, long j11, long j12, @Nullable String str) {
        this.id = i10;
        this.threadId = i11;
        this.beginDrawingTimestamp = j10;
        this.commitTimestamp = j11;
        this.endDrawingTimestamp = j12;
        this.screenshot = str;
    }

    public static /* synthetic */ FrameTimingSequence copy$default(FrameTimingSequence frameTimingSequence, int i10, int i11, long j10, long j11, long j12, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = frameTimingSequence.id;
        }
        if ((i12 & 2) != 0) {
            i11 = frameTimingSequence.threadId;
        }
        if ((i12 & 4) != 0) {
            j10 = frameTimingSequence.beginDrawingTimestamp;
        }
        if ((i12 & 8) != 0) {
            j11 = frameTimingSequence.commitTimestamp;
        }
        if ((i12 & 16) != 0) {
            j12 = frameTimingSequence.endDrawingTimestamp;
        }
        if ((i12 & 32) != 0) {
            str = frameTimingSequence.screenshot;
        }
        String str2 = str;
        long j13 = j12;
        long j14 = j11;
        return frameTimingSequence.copy(i10, i11, j10, j14, j13, str2);
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
    public final long getBeginDrawingTimestamp() {
        return this.beginDrawingTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCommitTimestamp() {
        return this.commitTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEndDrawingTimestamp() {
        return this.endDrawingTimestamp;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getScreenshot() {
        return this.screenshot;
    }

    @NotNull
    public final FrameTimingSequence copy(int id2, int threadId, long beginDrawingTimestamp, long commitTimestamp, long endDrawingTimestamp, @Nullable String screenshot) {
        return new FrameTimingSequence(id2, threadId, beginDrawingTimestamp, commitTimestamp, endDrawingTimestamp, screenshot);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameTimingSequence)) {
            return false;
        }
        FrameTimingSequence frameTimingSequence = (FrameTimingSequence) other;
        return this.id == frameTimingSequence.id && this.threadId == frameTimingSequence.threadId && this.beginDrawingTimestamp == frameTimingSequence.beginDrawingTimestamp && this.commitTimestamp == frameTimingSequence.commitTimestamp && this.endDrawingTimestamp == frameTimingSequence.endDrawingTimestamp && Intrinsics.areEqual(this.screenshot, frameTimingSequence.screenshot);
    }

    public final long getBeginDrawingTimestamp() {
        return this.beginDrawingTimestamp;
    }

    public final long getCommitTimestamp() {
        return this.commitTimestamp;
    }

    public final long getEndDrawingTimestamp() {
        return this.endDrawingTimestamp;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getScreenshot() {
        return this.screenshot;
    }

    public final int getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.threadId)) * 31) + Long.hashCode(this.beginDrawingTimestamp)) * 31) + Long.hashCode(this.commitTimestamp)) * 31) + Long.hashCode(this.endDrawingTimestamp)) * 31;
        String str = this.screenshot;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "FrameTimingSequence(id=" + this.id + ", threadId=" + this.threadId + ", beginDrawingTimestamp=" + this.beginDrawingTimestamp + ", commitTimestamp=" + this.commitTimestamp + ", endDrawingTimestamp=" + this.endDrawingTimestamp + ", screenshot=" + this.screenshot + ")";
    }

    public /* synthetic */ FrameTimingSequence(int i10, int i11, long j10, long j11, long j12, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, j11, j12, (i12 & 32) != 0 ? null : str);
    }
}
