package com.zoho.livechat.android.modules.messages.domain.entities;

import androidx.annotation.Keep;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/zoho/livechat/android/modules/messages/domain/entities/MessageProgress;", "", "messageId", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "(Ljava/lang/String;I)V", "getMessageId", "()Ljava/lang/String;", "getProgress", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageProgress {

    @NotNull
    private final String messageId;
    private final int progress;

    public MessageProgress(@NotNull String messageId, int i10) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
        this.progress = i10;
    }

    public static /* synthetic */ MessageProgress copy$default(MessageProgress messageProgress, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageProgress.messageId;
        }
        if ((i11 & 2) != 0) {
            i10 = messageProgress.progress;
        }
        return messageProgress.copy(str, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final MessageProgress copy(@NotNull String messageId, int progress) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new MessageProgress(messageId, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageProgress)) {
            return false;
        }
        MessageProgress messageProgress = (MessageProgress) other;
        return Intrinsics.areEqual(this.messageId, messageProgress.messageId) && this.progress == messageProgress.progress;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return (this.messageId.hashCode() * 31) + Integer.hashCode(this.progress);
    }

    @NotNull
    public String toString() {
        return "MessageProgress(messageId=" + this.messageId + ", progress=" + this.progress + ')';
    }
}
