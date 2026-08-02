package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfo/presentation/StickyBadgeInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/badge/Badge;", "badgeInfo", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddings", "<init>", "(JLru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadgeInfo", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyBadgeInfoVO implements c {

    @NotNull
    private final Badge badgeInfo;
    private final long id;
    private final Paddings paddings;

    public StickyBadgeInfoVO(long j11, @NotNull Badge badgeInfo, Paddings paddings) {
        Intrinsics.checkNotNullParameter(badgeInfo, "badgeInfo");
        this.id = j11;
        this.badgeInfo = badgeInfo;
        this.paddings = paddings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyBadgeInfoVO)) {
            return false;
        }
        StickyBadgeInfoVO stickyBadgeInfoVO = (StickyBadgeInfoVO) other;
        return this.id == stickyBadgeInfoVO.id && Intrinsics.d(this.badgeInfo, stickyBadgeInfoVO.badgeInfo) && Intrinsics.d(this.paddings, stickyBadgeInfoVO.paddings);
    }

    @NotNull
    public final Badge getBadgeInfo() {
        return this.badgeInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Paddings getPaddings() {
        return this.paddings;
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
        int hashCode = (this.badgeInfo.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Paddings paddings = this.paddings;
        return hashCode + (paddings == null ? 0 : paddings.hashCode());
    }

    @NotNull
    public String toString() {
        return "StickyBadgeInfoVO(id=" + this.id + ", badgeInfo=" + this.badgeInfo + ", paddings=" + this.paddings + ")";
    }
}
