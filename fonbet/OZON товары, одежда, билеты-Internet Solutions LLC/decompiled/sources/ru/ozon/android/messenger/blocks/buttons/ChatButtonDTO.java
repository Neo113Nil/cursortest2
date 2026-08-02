package ru.ozon.android.messenger.blocks.buttons;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/ChatButtonDTO;", "", "flex", "Lru/ozon/android/messenger/blocks/buttons/Flex;", "fixed", "Lru/ozon/android/messenger/blocks/buttons/Fixed;", "<init>", "(Lru/ozon/android/messenger/blocks/buttons/Flex;Lru/ozon/android/messenger/blocks/buttons/Fixed;)V", "getFlex", "()Lru/ozon/android/messenger/blocks/buttons/Flex;", "getFixed", "()Lru/ozon/android/messenger/blocks/buttons/Fixed;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChatButtonDTO {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable | Icon.$stable;
    private final Fixed fixed;
    private final Flex flex;

    public ChatButtonDTO(Flex flex, Fixed fixed) {
        this.flex = flex;
        this.fixed = fixed;
    }

    public static /* synthetic */ ChatButtonDTO copy$default(ChatButtonDTO chatButtonDTO, Flex flex, Fixed fixed, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            flex = chatButtonDTO.flex;
        }
        if ((i11 & 2) != 0) {
            fixed = chatButtonDTO.fixed;
        }
        return chatButtonDTO.copy(flex, fixed);
    }

    /* renamed from: component1, reason: from getter */
    public final Flex getFlex() {
        return this.flex;
    }

    /* renamed from: component2, reason: from getter */
    public final Fixed getFixed() {
        return this.fixed;
    }

    @NotNull
    public final ChatButtonDTO copy(Flex flex, Fixed fixed) {
        return new ChatButtonDTO(flex, fixed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatButtonDTO)) {
            return false;
        }
        ChatButtonDTO chatButtonDTO = (ChatButtonDTO) other;
        return Intrinsics.d(this.flex, chatButtonDTO.flex) && Intrinsics.d(this.fixed, chatButtonDTO.fixed);
    }

    public final Fixed getFixed() {
        return this.fixed;
    }

    public final Flex getFlex() {
        return this.flex;
    }

    public int hashCode() {
        Flex flex = this.flex;
        int hashCode = (flex == null ? 0 : flex.hashCode()) * 31;
        Fixed fixed = this.fixed;
        return hashCode + (fixed != null ? fixed.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChatButtonDTO(flex=" + this.flex + ", fixed=" + this.fixed + ")";
    }
}
