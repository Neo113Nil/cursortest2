package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceBar.presentation;

import G.g;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceBar/presentation/AccountBalanceBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "balanceBar", "", "backgroundColor", "containerBackground", "<init>", "(JLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "getBalanceBar", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCounter;", "Ljava/lang/String;", "getBackgroundColor", "getContainerBackground", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccountBalanceBarVO implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter balanceBar;

    @NotNull
    private final String containerBackground;
    private final long id;

    public AccountBalanceBarVO(long j11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter balanceBar, @NotNull String backgroundColor, @NotNull String containerBackground) {
        Intrinsics.checkNotNullParameter(balanceBar, "balanceBar");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(containerBackground, "containerBackground");
        this.id = j11;
        this.balanceBar = balanceBar;
        this.backgroundColor = backgroundColor;
        this.containerBackground = containerBackground;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountBalanceBarVO)) {
            return false;
        }
        AccountBalanceBarVO accountBalanceBarVO = (AccountBalanceBarVO) other;
        return this.id == accountBalanceBarVO.id && Intrinsics.d(this.balanceBar, accountBalanceBarVO.balanceBar) && Intrinsics.d(this.backgroundColor, accountBalanceBarVO.backgroundColor) && Intrinsics.d(this.containerBackground, accountBalanceBarVO.containerBackground);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter getBalanceBar() {
        return this.balanceBar;
    }

    @NotNull
    public final String getContainerBackground() {
        return this.containerBackground;
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
        return this.containerBackground.hashCode() + g.a((this.balanceBar.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.backgroundColor);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCounter cellWithSubtitleCounter = this.balanceBar;
        String str = this.backgroundColor;
        String str2 = this.containerBackground;
        StringBuilder sb2 = new StringBuilder("AccountBalanceBarVO(id=");
        sb2.append(j11);
        sb2.append(", balanceBar=");
        sb2.append(cellWithSubtitleCounter);
        a.h(sb2, ", backgroundColor=", str, ", containerBackground=", str2);
        sb2.append(")");
        return sb2.toString();
    }
}
