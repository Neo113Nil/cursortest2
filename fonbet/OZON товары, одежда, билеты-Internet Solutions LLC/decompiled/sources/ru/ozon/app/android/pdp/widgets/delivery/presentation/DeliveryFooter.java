package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "moreInfoButton", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getMoreInfoButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryFooter {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

    @NotNull
    private final ButtonV3Atom.SmallBorderlessButton moreInfoButton;

    public DeliveryFooter(@NotNull ButtonV3Atom.SmallBorderlessButton moreInfoButton) {
        Intrinsics.checkNotNullParameter(moreInfoButton, "moreInfoButton");
        this.moreInfoButton = moreInfoButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeliveryFooter) && Intrinsics.d(this.moreInfoButton, ((DeliveryFooter) other).moreInfoButton);
    }

    @NotNull
    public final ButtonV3Atom.SmallBorderlessButton getMoreInfoButton() {
        return this.moreInfoButton;
    }

    public int hashCode() {
        return this.moreInfoButton.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeliveryFooter(moreInfoButton=" + this.moreInfoButton + ")";
    }
}
