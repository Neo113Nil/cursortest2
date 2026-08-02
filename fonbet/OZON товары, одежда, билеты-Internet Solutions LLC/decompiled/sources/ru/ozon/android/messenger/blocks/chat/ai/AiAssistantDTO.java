package ru.ozon.android.messenger.blocks.chat.ai;

import C.o0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.PreviewDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/ai/AiAssistantDTO;", "", "unreadCount", "", "preview", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "deeplink", "", "<init>", "(ILru/ozon/android/messenger/blocks/chat/common/PreviewDTO;Ljava/lang/String;)V", "getUnreadCount", "()I", "getPreview", "()Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AiAssistantDTO {
    public static final int $stable = 8;

    @NotNull
    private final String deeplink;
    private final PreviewDTO preview;
    private final int unreadCount;

    public AiAssistantDTO(int i11, PreviewDTO previewDTO, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.unreadCount = i11;
        this.preview = previewDTO;
        this.deeplink = deeplink;
    }

    public static /* synthetic */ AiAssistantDTO copy$default(AiAssistantDTO aiAssistantDTO, int i11, PreviewDTO previewDTO, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = aiAssistantDTO.unreadCount;
        }
        if ((i12 & 2) != 0) {
            previewDTO = aiAssistantDTO.preview;
        }
        if ((i12 & 4) != 0) {
            str = aiAssistantDTO.deeplink;
        }
        return aiAssistantDTO.copy(i11, previewDTO, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* renamed from: component2, reason: from getter */
    public final PreviewDTO getPreview() {
        return this.preview;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final AiAssistantDTO copy(int unreadCount, PreviewDTO preview, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new AiAssistantDTO(unreadCount, preview, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiAssistantDTO)) {
            return false;
        }
        AiAssistantDTO aiAssistantDTO = (AiAssistantDTO) other;
        return this.unreadCount == aiAssistantDTO.unreadCount && Intrinsics.d(this.preview, aiAssistantDTO.preview) && Intrinsics.d(this.deeplink, aiAssistantDTO.deeplink);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final PreviewDTO getPreview() {
        return this.preview;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.unreadCount) * 31;
        PreviewDTO previewDTO = this.preview;
        return this.deeplink.hashCode() + ((hashCode + (previewDTO == null ? 0 : previewDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.unreadCount;
        PreviewDTO previewDTO = this.preview;
        String str = this.deeplink;
        StringBuilder sb2 = new StringBuilder("AiAssistantDTO(unreadCount=");
        sb2.append(i11);
        sb2.append(", preview=");
        sb2.append(previewDTO);
        sb2.append(", deeplink=");
        return o0.c(sb2, str, ")");
    }
}
