package ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation;

import El.C2971a;
import F3.G;
import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniColorToken;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;", "", "Lru/ozon/uni/core/models/UniColorToken;", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/core/models/UniColorToken;", "getBackgroundColor", "()Lru/ozon/uni/core/models/UniColorToken;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlockV5VO {
    public static final int $stable = (AtomAction.$stable | IconDTO.$stable) | UniColorToken.$stable;
    private final AtomAction action;

    @NotNull
    private final UniColorToken backgroundColor;

    @NotNull
    private final IconDTO icon;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public BlockV5VO(@NotNull UniColorToken backgroundColor, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO icon, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.subtitle = subtitle;
        this.icon = icon;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockV5VO)) {
            return false;
        }
        BlockV5VO blockV5VO = (BlockV5VO) other;
        return Intrinsics.d(this.backgroundColor, blockV5VO.backgroundColor) && Intrinsics.d(this.title, blockV5VO.title) && Intrinsics.d(this.subtitle, blockV5VO.subtitle) && Intrinsics.d(this.icon, blockV5VO.icon) && Intrinsics.d(this.action, blockV5VO.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final UniColorToken getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = C2971a.a(this.icon, b.a(this.subtitle, b.a(this.title, this.backgroundColor.hashCode() * 31, 31), 31), 31);
        AtomAction atomAction = this.action;
        return a11 + (atomAction == null ? 0 : atomAction.hashCode());
    }

    @NotNull
    public String toString() {
        UniColorToken uniColorToken = this.backgroundColor;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        IconDTO iconDTO = this.icon;
        AtomAction atomAction = this.action;
        StringBuilder sb2 = new StringBuilder("BlockV5VO(backgroundColor=");
        sb2.append(uniColorToken);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", subtitle=");
        G.f(sb2, textDTO2, ", icon=", iconDTO, ", action=");
        return B6.b.b(sb2, atomAction, ")");
    }
}
