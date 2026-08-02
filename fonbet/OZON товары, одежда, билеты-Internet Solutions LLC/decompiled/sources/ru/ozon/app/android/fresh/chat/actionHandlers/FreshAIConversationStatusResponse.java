package ru.ozon.app.android.fresh.chat.actionHandlers;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/chat/actionHandlers/FreshAIConversationStatusResponse;", "", "delay", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/fresh/chat/actionHandlers/FreshAIConversationStatusResponse;", "equals", "", "other", "hashCode", "", "toString", "", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshAIConversationStatusResponse {
    public static final int $stable = 0;
    private final AtomActionDTO action;
    private final Long delay;

    public FreshAIConversationStatusResponse(Long l11, AtomActionDTO atomActionDTO) {
        this.delay = l11;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ FreshAIConversationStatusResponse copy$default(FreshAIConversationStatusResponse freshAIConversationStatusResponse, Long l11, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = freshAIConversationStatusResponse.delay;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = freshAIConversationStatusResponse.action;
        }
        return freshAIConversationStatusResponse.copy(l11, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getDelay() {
        return this.delay;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final FreshAIConversationStatusResponse copy(Long delay, AtomActionDTO action) {
        return new FreshAIConversationStatusResponse(delay, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshAIConversationStatusResponse)) {
            return false;
        }
        FreshAIConversationStatusResponse freshAIConversationStatusResponse = (FreshAIConversationStatusResponse) other;
        return Intrinsics.d(this.delay, freshAIConversationStatusResponse.delay) && Intrinsics.d(this.action, freshAIConversationStatusResponse.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Long getDelay() {
        return this.delay;
    }

    public int hashCode() {
        Long l11 = this.delay;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FreshAIConversationStatusResponse(delay=" + this.delay + ", action=" + this.action + ")";
    }
}
