package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button;

import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/ButtonVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonVO implements c {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final BadgeDTO badge;

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final long id;

    public ButtonVO(long j11, @NotNull ButtonV3Atom.LargeButton button, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.button = button;
        this.badge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonVO)) {
            return false;
        }
        ButtonVO buttonVO = (ButtonVO) other;
        return this.id == buttonVO.id && Intrinsics.d(this.button, buttonVO.button) && Intrinsics.d(this.badge, buttonVO.badge);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.button, Long.hashCode(this.id) * 31, 31);
        BadgeDTO badgeDTO = this.badge;
        return a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.button;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder h11 = Bi.b.h("ButtonVO(id=", j11, ", button=", largeButton);
        h11.append(", badge=");
        h11.append(badgeDTO);
        h11.append(")");
        return h11.toString();
    }
}
