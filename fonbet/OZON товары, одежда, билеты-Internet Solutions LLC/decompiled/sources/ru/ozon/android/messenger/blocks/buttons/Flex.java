package ru.ozon.android.messenger.blocks.buttons;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/Flex;", "", "text", "", "Lru/ozon/android/messenger/blocks/buttons/ButtonTextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/Icon;)V", "getText", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Flex {
    public static final int $stable = Icon.$stable;

    @NotNull
    private final AtomActionDTO action;
    private final Icon icon;

    @NotNull
    private final List<ButtonTextDTO> text;

    public Flex(@NotNull List<ButtonTextDTO> text, @NotNull AtomActionDTO action, Icon icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.text = text;
        this.action = action;
        this.icon = icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flex copy$default(Flex flex, List list, AtomActionDTO atomActionDTO, Icon icon, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = flex.text;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = flex.action;
        }
        if ((i11 & 4) != 0) {
            icon = flex.icon;
        }
        return flex.copy(list, atomActionDTO, icon);
    }

    @NotNull
    public final List<ButtonTextDTO> component1() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final Flex copy(@NotNull List<ButtonTextDTO> text, @NotNull AtomActionDTO action, Icon icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        return new Flex(text, action, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Flex)) {
            return false;
        }
        Flex flex = (Flex) other;
        return Intrinsics.d(this.text, flex.text) && Intrinsics.d(this.action, flex.action) && Intrinsics.d(this.icon, flex.icon);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<ButtonTextDTO> getText() {
        return this.text;
    }

    public int hashCode() {
        int b11 = Ih.a.b(this.action, this.text.hashCode() * 31, 31);
        Icon icon = this.icon;
        return b11 + (icon == null ? 0 : icon.hashCode());
    }

    @NotNull
    public String toString() {
        return "Flex(text=" + this.text + ", action=" + this.action + ", icon=" + this.icon + ")";
    }
}
