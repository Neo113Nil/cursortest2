package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.button;

import Bi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "continueButton", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "copy", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getContinueButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySeatSelectStickyButtonVO implements c {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;

    @NotNull
    private final ButtonV3Atom.LargeButton continueButton;
    private final long id;

    public TravelRailwaySeatSelectStickyButtonVO(long j11, @NotNull ButtonV3Atom.LargeButton continueButton) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.id = j11;
        this.continueButton = continueButton;
    }

    public static /* synthetic */ TravelRailwaySeatSelectStickyButtonVO copy$default(TravelRailwaySeatSelectStickyButtonVO travelRailwaySeatSelectStickyButtonVO, long j11, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = travelRailwaySeatSelectStickyButtonVO.id;
        }
        if ((i11 & 2) != 0) {
            largeButton = travelRailwaySeatSelectStickyButtonVO.continueButton;
        }
        return travelRailwaySeatSelectStickyButtonVO.copy(j11, largeButton);
    }

    @NotNull
    public final TravelRailwaySeatSelectStickyButtonVO copy(long id2, @NotNull ButtonV3Atom.LargeButton continueButton) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        return new TravelRailwaySeatSelectStickyButtonVO(id2, continueButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySeatSelectStickyButtonVO)) {
            return false;
        }
        TravelRailwaySeatSelectStickyButtonVO travelRailwaySeatSelectStickyButtonVO = (TravelRailwaySeatSelectStickyButtonVO) other;
        return this.id == travelRailwaySeatSelectStickyButtonVO.id && Intrinsics.d(this.continueButton, travelRailwaySeatSelectStickyButtonVO.continueButton);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getContinueButton() {
        return this.continueButton;
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
        return this.continueButton.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder h11 = b.h("TravelRailwaySeatSelectStickyButtonVO(id=", this.id, ", continueButton=", this.continueButton);
        h11.append(")");
        return h11.toString();
    }
}
