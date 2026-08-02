package ru.ozon.android.messenger.blocks.buttons;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/ButtonsGroupDTO;", "", "Lru/ozon/android/messenger/blocks/buttons/b;", "layout", "", "Lru/ozon/android/messenger/blocks/buttons/ChatButtonDTO;", "buttons", "<init>", "(Lru/ozon/android/messenger/blocks/buttons/b;Ljava/util/List;)V", "component1", "()Lru/ozon/android/messenger/blocks/buttons/b;", "component2", "()Ljava/util/List;", "copy", "(Lru/ozon/android/messenger/blocks/buttons/b;Ljava/util/List;)Lru/ozon/android/messenger/blocks/buttons/ButtonsGroupDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/blocks/buttons/b;", "getLayout", "Ljava/util/List;", "getButtons", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ButtonsGroupDTO {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable | Icon.$stable;

    @NotNull
    private final List<ChatButtonDTO> buttons;

    @NotNull
    private final b layout;

    public ButtonsGroupDTO(@NotNull b layout, @NotNull List<ChatButtonDTO> buttons) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.layout = layout;
        this.buttons = buttons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonsGroupDTO copy$default(ButtonsGroupDTO buttonsGroupDTO, b bVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = buttonsGroupDTO.layout;
        }
        if ((i11 & 2) != 0) {
            list = buttonsGroupDTO.buttons;
        }
        return buttonsGroupDTO.copy(bVar, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final b getLayout() {
        return this.layout;
    }

    @NotNull
    public final List<ChatButtonDTO> component2() {
        return this.buttons;
    }

    @NotNull
    public final ButtonsGroupDTO copy(@NotNull b layout, @NotNull List<ChatButtonDTO> buttons) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new ButtonsGroupDTO(layout, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsGroupDTO)) {
            return false;
        }
        ButtonsGroupDTO buttonsGroupDTO = (ButtonsGroupDTO) other;
        return this.layout == buttonsGroupDTO.layout && Intrinsics.d(this.buttons, buttonsGroupDTO.buttons);
    }

    @NotNull
    public final List<ChatButtonDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final b getLayout() {
        return this.layout;
    }

    public int hashCode() {
        return this.buttons.hashCode() + (this.layout.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ButtonsGroupDTO(layout=" + this.layout + ", buttons=" + this.buttons + ")";
    }
}
