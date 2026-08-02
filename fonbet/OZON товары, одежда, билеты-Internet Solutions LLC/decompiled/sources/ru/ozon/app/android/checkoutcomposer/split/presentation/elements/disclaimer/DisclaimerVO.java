package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.disclaimer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/disclaimer/DisclaimerVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddings", "<init>", "(JLru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclaimerVO implements c {

    @NotNull
    private final DisclaimerDTO disclaimer;
    private final long id;
    private final Paddings paddings;

    public DisclaimerVO(long j11, @NotNull DisclaimerDTO disclaimer, Paddings paddings) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.id = j11;
        this.disclaimer = disclaimer;
        this.paddings = paddings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerVO)) {
            return false;
        }
        DisclaimerVO disclaimerVO = (DisclaimerVO) other;
        return this.id == disclaimerVO.id && Intrinsics.d(this.disclaimer, disclaimerVO.disclaimer) && Intrinsics.d(this.paddings, disclaimerVO.paddings);
    }

    @NotNull
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
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
        int hashCode = (this.disclaimer.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Paddings paddings = this.paddings;
        return hashCode + (paddings == null ? 0 : paddings.hashCode());
    }

    @NotNull
    public String toString() {
        return "DisclaimerVO(id=" + this.id + ", disclaimer=" + this.disclaimer + ", paddings=" + this.paddings + ")";
    }
}
