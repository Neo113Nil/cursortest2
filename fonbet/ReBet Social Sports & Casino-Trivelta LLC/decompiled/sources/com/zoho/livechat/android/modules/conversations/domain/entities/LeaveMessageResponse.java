package com.zoho.livechat.android.modules.conversations.domain.entities;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/domain/entities/LeaveMessageResponse;", "", "chatId", "", "isConversationStarted", "", "isConversationMissed", "(Ljava/lang/String;ZZ)V", "getChatId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LeaveMessageResponse {

    @Nullable
    private final String chatId;
    private final boolean isConversationMissed;
    private final boolean isConversationStarted;

    public LeaveMessageResponse() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ LeaveMessageResponse copy$default(LeaveMessageResponse leaveMessageResponse, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = leaveMessageResponse.chatId;
        }
        if ((i10 & 2) != 0) {
            z10 = leaveMessageResponse.isConversationStarted;
        }
        if ((i10 & 4) != 0) {
            z11 = leaveMessageResponse.isConversationMissed;
        }
        return leaveMessageResponse.copy(str, z10, z11);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsConversationStarted() {
        return this.isConversationStarted;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsConversationMissed() {
        return this.isConversationMissed;
    }

    @NotNull
    public final LeaveMessageResponse copy(@Nullable String chatId, boolean isConversationStarted, boolean isConversationMissed) {
        return new LeaveMessageResponse(chatId, isConversationStarted, isConversationMissed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaveMessageResponse)) {
            return false;
        }
        LeaveMessageResponse leaveMessageResponse = (LeaveMessageResponse) other;
        return Intrinsics.areEqual(this.chatId, leaveMessageResponse.chatId) && this.isConversationStarted == leaveMessageResponse.isConversationStarted && this.isConversationMissed == leaveMessageResponse.isConversationMissed;
    }

    @Nullable
    public final String getChatId() {
        return this.chatId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.chatId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.isConversationStarted;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isConversationMissed;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isConversationMissed() {
        return this.isConversationMissed;
    }

    public final boolean isConversationStarted() {
        return this.isConversationStarted;
    }

    @NotNull
    public String toString() {
        return "LeaveMessageResponse(chatId=" + this.chatId + ", isConversationStarted=" + this.isConversationStarted + ", isConversationMissed=" + this.isConversationMissed + ')';
    }

    public LeaveMessageResponse(@Nullable String str, boolean z10, boolean z11) {
        this.chatId = str;
        this.isConversationStarted = z10;
        this.isConversationMissed = z11;
    }

    public /* synthetic */ LeaveMessageResponse(String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
