package ru.ozon.android.messenger.blocks.buttons;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/ChatButtonsDTO;", "", "buttonsGroups", "", "Lru/ozon/android/messenger/blocks/buttons/ButtonsGroupDTO;", "<init>", "(Ljava/util/List;)V", "getButtonsGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChatButtonsDTO {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable | Icon.$stable;

    @NotNull
    private final List<ButtonsGroupDTO> buttonsGroups;

    public ChatButtonsDTO(@NotNull List<ButtonsGroupDTO> buttonsGroups) {
        Intrinsics.checkNotNullParameter(buttonsGroups, "buttonsGroups");
        this.buttonsGroups = buttonsGroups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatButtonsDTO copy$default(ChatButtonsDTO chatButtonsDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = chatButtonsDTO.buttonsGroups;
        }
        return chatButtonsDTO.copy(list);
    }

    @NotNull
    public final List<ButtonsGroupDTO> component1() {
        return this.buttonsGroups;
    }

    @NotNull
    public final ChatButtonsDTO copy(@NotNull List<ButtonsGroupDTO> buttonsGroups) {
        Intrinsics.checkNotNullParameter(buttonsGroups, "buttonsGroups");
        return new ChatButtonsDTO(buttonsGroups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChatButtonsDTO) && Intrinsics.d(this.buttonsGroups, ((ChatButtonsDTO) other).buttonsGroups);
    }

    @NotNull
    public final List<ButtonsGroupDTO> getButtonsGroups() {
        return this.buttonsGroups;
    }

    public int hashCode() {
        return this.buttonsGroups.hashCode();
    }

    @NotNull
    public String toString() {
        return H3.c.a("ChatButtonsDTO(buttonsGroups=", ")", this.buttonsGroups);
    }
}
