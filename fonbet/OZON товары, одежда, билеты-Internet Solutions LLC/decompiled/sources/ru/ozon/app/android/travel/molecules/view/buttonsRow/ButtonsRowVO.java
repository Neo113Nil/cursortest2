package ru.ozon.app.android.travel.molecules.view.buttonsRow;

import GR.b;
import Lh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/buttonsRow/ButtonsRowVO;", "", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "buttons", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "horizontalPadding", "buttonsMargin", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getHorizontalPadding", "getButtonsMargin", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ButtonsRowVO {

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final List<ButtonsDTO> buttons;

    @NotNull
    private final Paddings buttonsMargin;

    @NotNull
    private final Paddings horizontalPadding;

    @NotNull
    private final Paddings topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsRowVO(@NotNull List<? extends ButtonsDTO> buttons, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings horizontalPadding, @NotNull Paddings buttonsMargin) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(buttonsMargin, "buttonsMargin");
        this.buttons = buttons;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.horizontalPadding = horizontalPadding;
        this.buttonsMargin = buttonsMargin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsRowVO)) {
            return false;
        }
        ButtonsRowVO buttonsRowVO = (ButtonsRowVO) other;
        return Intrinsics.d(this.buttons, buttonsRowVO.buttons) && this.topPadding == buttonsRowVO.topPadding && this.bottomPadding == buttonsRowVO.bottomPadding && this.horizontalPadding == buttonsRowVO.horizontalPadding && this.buttonsMargin == buttonsRowVO.buttonsMargin;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final List<ButtonsDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final Paddings getButtonsMargin() {
        return this.buttonsMargin;
    }

    @NotNull
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        return this.buttonsMargin.hashCode() + b.b(this.horizontalPadding, b.b(this.bottomPadding, b.b(this.topPadding, this.buttons.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        List<ButtonsDTO> list = this.buttons;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.bottomPadding;
        Paddings paddings3 = this.horizontalPadding;
        Paddings paddings4 = this.buttonsMargin;
        StringBuilder sb2 = new StringBuilder("ButtonsRowVO(buttons=");
        sb2.append(list);
        sb2.append(", topPadding=");
        sb2.append(paddings);
        sb2.append(", bottomPadding=");
        a.e(sb2, paddings2, ", horizontalPadding=", paddings3, ", buttonsMargin=");
        return D40.b.b(sb2, paddings4, ")");
    }
}
