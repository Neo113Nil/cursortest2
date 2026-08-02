package ru.ozon.android.messenger.blocks.ai.divider;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/divider/AiDividerDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isEmpty", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;)Lru/ozon/android/messenger/blocks/ai/divider/AiDividerDTO;", "equals", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AiDividerDTO {
    public static final int $stable = 0;
    private final Boolean isEmpty;
    private final TextDTO text;

    public AiDividerDTO(TextDTO textDTO, Boolean bool) {
        this.text = textDTO;
        this.isEmpty = bool;
    }

    public static /* synthetic */ AiDividerDTO copy$default(AiDividerDTO aiDividerDTO, TextDTO textDTO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = aiDividerDTO.text;
        }
        if ((i11 & 2) != 0) {
            bool = aiDividerDTO.isEmpty;
        }
        return aiDividerDTO.copy(textDTO, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsEmpty() {
        return this.isEmpty;
    }

    @NotNull
    public final AiDividerDTO copy(TextDTO text, Boolean isEmpty) {
        return new AiDividerDTO(text, isEmpty);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiDividerDTO)) {
            return false;
        }
        AiDividerDTO aiDividerDTO = (AiDividerDTO) other;
        return Intrinsics.d(this.text, aiDividerDTO.text) && Intrinsics.d(this.isEmpty, aiDividerDTO.isEmpty);
    }

    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        TextDTO textDTO = this.text;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        Boolean bool = this.isEmpty;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isEmpty() {
        return this.isEmpty;
    }

    @NotNull
    public String toString() {
        return "AiDividerDTO(text=" + this.text + ", isEmpty=" + this.isEmpty + ")";
    }
}
