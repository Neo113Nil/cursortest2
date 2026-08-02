package com.zoho.livechat.android.modules.messages.domain.entities;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0004\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/MessageSyncData;", "", "", "hasMoreDataAvailableAtBottom", "isAllMessagesReceivedFromTop", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/zoho/livechat/android/modules/messages/domain/entities/MessageSyncData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasMoreDataAvailableAtBottom", "Companion", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageSyncData {
    public static final long SUCCEEDED = -2;
    private final boolean hasMoreDataAvailableAtBottom;
    private final boolean isAllMessagesReceivedFromTop;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageSyncData() {
        this(r2, r2, 3, null);
        boolean z10 = false;
    }

    public static /* synthetic */ MessageSyncData copy$default(MessageSyncData messageSyncData, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = messageSyncData.hasMoreDataAvailableAtBottom;
        }
        if ((i10 & 2) != 0) {
            z11 = messageSyncData.isAllMessagesReceivedFromTop;
        }
        return messageSyncData.copy(z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasMoreDataAvailableAtBottom() {
        return this.hasMoreDataAvailableAtBottom;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAllMessagesReceivedFromTop() {
        return this.isAllMessagesReceivedFromTop;
    }

    @NotNull
    public final MessageSyncData copy(boolean hasMoreDataAvailableAtBottom, boolean isAllMessagesReceivedFromTop) {
        return new MessageSyncData(hasMoreDataAvailableAtBottom, isAllMessagesReceivedFromTop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSyncData)) {
            return false;
        }
        MessageSyncData messageSyncData = (MessageSyncData) other;
        return this.hasMoreDataAvailableAtBottom == messageSyncData.hasMoreDataAvailableAtBottom && this.isAllMessagesReceivedFromTop == messageSyncData.isAllMessagesReceivedFromTop;
    }

    public final boolean getHasMoreDataAvailableAtBottom() {
        return this.hasMoreDataAvailableAtBottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.hasMoreDataAvailableAtBottom;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.isAllMessagesReceivedFromTop;
        return i10 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isAllMessagesReceivedFromTop() {
        return this.isAllMessagesReceivedFromTop;
    }

    @NotNull
    public String toString() {
        return "MessageSyncData(hasMoreDataAvailableAtBottom=" + this.hasMoreDataAvailableAtBottom + ", isAllMessagesReceivedFromTop=" + this.isAllMessagesReceivedFromTop + ')';
    }

    public MessageSyncData(boolean z10, boolean z11) {
        this.hasMoreDataAvailableAtBottom = z10;
        this.isAllMessagesReceivedFromTop = z11;
    }

    public /* synthetic */ MessageSyncData(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
