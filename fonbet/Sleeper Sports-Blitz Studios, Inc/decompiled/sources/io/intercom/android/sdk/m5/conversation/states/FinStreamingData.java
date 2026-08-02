package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationClientState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\nH×\u0001J\t\u0010\u001c\u001a\u00020\bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FinStreamingData;", "", "isFinStreaming", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "clientAssignedUUID", "", "tokenSequenceIndex", "", "<init>", "(ZLjava/util/List;Ljava/lang/String;I)V", "()Z", "getBlocks", "()Ljava/util/List;", "getClientAssignedUUID", "()Ljava/lang/String;", "getTokenSequenceIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FinStreamingData {
    public static final int $stable = 8;
    private final List<Block> blocks;
    private final String clientAssignedUUID;
    private final boolean isFinStreaming;
    private final int tokenSequenceIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinStreamingData copy$default(FinStreamingData finStreamingData, boolean z, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = finStreamingData.isFinStreaming;
        }
        if ((i2 & 2) != 0) {
            list = finStreamingData.blocks;
        }
        if ((i2 & 4) != 0) {
            str = finStreamingData.clientAssignedUUID;
        }
        if ((i2 & 8) != 0) {
            i = finStreamingData.tokenSequenceIndex;
        }
        return finStreamingData.copy(z, list, str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsFinStreaming() {
        return this.isFinStreaming;
    }

    public final List<Block> component2() {
        return this.blocks;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientAssignedUUID() {
        return this.clientAssignedUUID;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTokenSequenceIndex() {
        return this.tokenSequenceIndex;
    }

    public final FinStreamingData copy(boolean isFinStreaming, List<? extends Block> blocks, String clientAssignedUUID, int tokenSequenceIndex) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
        return new FinStreamingData(isFinStreaming, blocks, clientAssignedUUID, tokenSequenceIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinStreamingData)) {
            return false;
        }
        FinStreamingData finStreamingData = (FinStreamingData) other;
        return this.isFinStreaming == finStreamingData.isFinStreaming && Intrinsics.areEqual(this.blocks, finStreamingData.blocks) && Intrinsics.areEqual(this.clientAssignedUUID, finStreamingData.clientAssignedUUID) && this.tokenSequenceIndex == finStreamingData.tokenSequenceIndex;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isFinStreaming) * 31) + this.blocks.hashCode()) * 31) + this.clientAssignedUUID.hashCode()) * 31) + Integer.hashCode(this.tokenSequenceIndex);
    }

    public String toString() {
        return "FinStreamingData(isFinStreaming=" + this.isFinStreaming + ", blocks=" + this.blocks + ", clientAssignedUUID=" + this.clientAssignedUUID + ", tokenSequenceIndex=" + this.tokenSequenceIndex + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinStreamingData(boolean z, List<? extends Block> blocks, String clientAssignedUUID, int i) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
        this.isFinStreaming = z;
        this.blocks = blocks;
        this.clientAssignedUUID = clientAssignedUUID;
        this.tokenSequenceIndex = i;
    }

    public final boolean isFinStreaming() {
        return this.isFinStreaming;
    }

    public final List<Block> getBlocks() {
        return this.blocks;
    }

    public final String getClientAssignedUUID() {
        return this.clientAssignedUUID;
    }

    public final int getTokenSequenceIndex() {
        return this.tokenSequenceIndex;
    }
}
