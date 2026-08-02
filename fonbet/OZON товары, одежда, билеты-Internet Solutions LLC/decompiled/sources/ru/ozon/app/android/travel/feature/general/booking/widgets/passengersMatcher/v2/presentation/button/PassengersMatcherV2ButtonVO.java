package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.button;

import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/button/PassengersMatcherV2ButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "agreement", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAgreement", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersMatcherV2ButtonVO implements c {
    private final TextAtom agreement;
    private final long id;

    @NotNull
    private final ButtonV3Atom.LargeButton largeButton;

    public PassengersMatcherV2ButtonVO(long j11, @NotNull ButtonV3Atom.LargeButton largeButton, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        this.id = j11;
        this.largeButton = largeButton;
        this.agreement = textAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersMatcherV2ButtonVO)) {
            return false;
        }
        PassengersMatcherV2ButtonVO passengersMatcherV2ButtonVO = (PassengersMatcherV2ButtonVO) other;
        return this.id == passengersMatcherV2ButtonVO.id && Intrinsics.d(this.largeButton, passengersMatcherV2ButtonVO.largeButton) && Intrinsics.d(this.agreement, passengersMatcherV2ButtonVO.agreement);
    }

    public final TextAtom getAgreement() {
        return this.agreement;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
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
        int a11 = b.a(this.largeButton, Long.hashCode(this.id) * 31, 31);
        TextAtom textAtom = this.agreement;
        return a11 + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        TextAtom textAtom = this.agreement;
        StringBuilder h11 = Bi.b.h("PassengersMatcherV2ButtonVO(id=", j11, ", largeButton=", largeButton);
        h11.append(", agreement=");
        h11.append(textAtom);
        h11.append(")");
        return h11.toString();
    }
}
