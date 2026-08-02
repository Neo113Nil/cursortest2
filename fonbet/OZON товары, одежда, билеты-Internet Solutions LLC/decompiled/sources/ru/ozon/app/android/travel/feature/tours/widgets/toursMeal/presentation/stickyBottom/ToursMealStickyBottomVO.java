package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyBottom;

import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "selectButton", "returnButton", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "copy", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSelectButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getReturnButton", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursMealStickyBottomVO implements c {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final long id;

    @NotNull
    private final ButtonV3Atom.LargeButton returnButton;

    @NotNull
    private final ButtonV3Atom.LargeButton selectButton;

    public ToursMealStickyBottomVO(long j11, @NotNull ButtonV3Atom.LargeButton selectButton, @NotNull ButtonV3Atom.LargeButton returnButton) {
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        Intrinsics.checkNotNullParameter(returnButton, "returnButton");
        this.id = j11;
        this.selectButton = selectButton;
        this.returnButton = returnButton;
    }

    public static /* synthetic */ ToursMealStickyBottomVO copy$default(ToursMealStickyBottomVO toursMealStickyBottomVO, long j11, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = toursMealStickyBottomVO.id;
        }
        if ((i11 & 2) != 0) {
            largeButton = toursMealStickyBottomVO.selectButton;
        }
        if ((i11 & 4) != 0) {
            largeButton2 = toursMealStickyBottomVO.returnButton;
        }
        return toursMealStickyBottomVO.copy(j11, largeButton, largeButton2);
    }

    @NotNull
    public final ToursMealStickyBottomVO copy(long id2, @NotNull ButtonV3Atom.LargeButton selectButton, @NotNull ButtonV3Atom.LargeButton returnButton) {
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        Intrinsics.checkNotNullParameter(returnButton, "returnButton");
        return new ToursMealStickyBottomVO(id2, selectButton, returnButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursMealStickyBottomVO)) {
            return false;
        }
        ToursMealStickyBottomVO toursMealStickyBottomVO = (ToursMealStickyBottomVO) other;
        return this.id == toursMealStickyBottomVO.id && Intrinsics.d(this.selectButton, toursMealStickyBottomVO.selectButton) && Intrinsics.d(this.returnButton, toursMealStickyBottomVO.returnButton);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getReturnButton() {
        return this.returnButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSelectButton() {
        return this.selectButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.returnButton.hashCode() + b.a(this.selectButton, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.selectButton;
        ButtonV3Atom.LargeButton largeButton2 = this.returnButton;
        StringBuilder h11 = Bi.b.h("ToursMealStickyBottomVO(id=", j11, ", selectButton=", largeButton);
        h11.append(", returnButton=");
        h11.append(largeButton2);
        h11.append(")");
        return h11.toString();
    }
}
