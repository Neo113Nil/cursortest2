package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.viewItem;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/AtomElementVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "horizontalPadding", "<init>", "(JLru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/cscore/padding/HorizontalPadding;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "getHorizontalPadding", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AtomElementVO implements c {
    public static final int $stable = HorizontalPadding.$stable | AtomDTO.$stable;

    @NotNull
    private final AtomDTO atom;
    private final CommonControlSettings common;

    @NotNull
    private final HorizontalPadding horizontalPadding;
    private final long id;

    public AtomElementVO(long j11, @NotNull AtomDTO atom, CommonControlSettings commonControlSettings, @NotNull HorizontalPadding horizontalPadding) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.id = j11;
        this.atom = atom;
        this.common = commonControlSettings;
        this.horizontalPadding = horizontalPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtomElementVO)) {
            return false;
        }
        AtomElementVO atomElementVO = (AtomElementVO) other;
        return this.id == atomElementVO.id && Intrinsics.d(this.atom, atomElementVO.atom) && Intrinsics.d(this.common, atomElementVO.common) && Intrinsics.d(this.horizontalPadding, atomElementVO.horizontalPadding);
    }

    @NotNull
    public final AtomDTO getAtom() {
        return this.atom;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final HorizontalPadding getHorizontalPadding() {
        return this.horizontalPadding;
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
        int hashCode = (this.atom.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return this.horizontalPadding.hashCode() + ((hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "AtomElementVO(id=" + this.id + ", atom=" + this.atom + ", common=" + this.common + ", horizontalPadding=" + this.horizontalPadding + ")";
    }
}
