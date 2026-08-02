package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import B6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"ru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$BonusInfo", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV2VO$BonusInfo {
    public static final int $stable = AtomAction.$stable | Icon.$stable;
    private final AtomAction action;
    private final Icon icon;

    @NotNull
    private final TextDTO text;

    public PriceV2VO$BonusInfo(@NotNull TextDTO text, Icon icon, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = icon;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV2VO$BonusInfo)) {
            return false;
        }
        PriceV2VO$BonusInfo priceV2VO$BonusInfo = (PriceV2VO$BonusInfo) other;
        return Intrinsics.d(this.text, priceV2VO$BonusInfo.text) && Intrinsics.d(this.icon, priceV2VO$BonusInfo.icon) && Intrinsics.d(this.action, priceV2VO$BonusInfo.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        AtomAction atomAction = this.action;
        return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        Icon icon = this.icon;
        AtomAction atomAction = this.action;
        StringBuilder sb2 = new StringBuilder("BonusInfo(text=");
        sb2.append(textDTO);
        sb2.append(", icon=");
        sb2.append(icon);
        sb2.append(", action=");
        return b.b(sb2, atomAction, ")");
    }
}
