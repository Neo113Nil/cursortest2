package ru.ozon.app.android.checkoutcomposer.discountcode.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Input;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/atoms/data/deprecated/Input;", "input", "Lru/ozon/uni/atoms/data/deprecated/Button;", "button", "<init>", "(JLru/ozon/app/android/atoms/data/deprecated/Input;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/deprecated/Input;", "getInput", "()Lru/ozon/app/android/atoms/data/deprecated/Input;", "Lru/ozon/uni/atoms/data/deprecated/Button;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DiscountCodeVO implements c {

    @NotNull
    private final Button button;
    private final long id;

    @NotNull
    private final Input input;

    public DiscountCodeVO(long j11, @NotNull Input input, @NotNull Button button) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.input = input;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountCodeVO)) {
            return false;
        }
        DiscountCodeVO discountCodeVO = (DiscountCodeVO) other;
        return this.id == discountCodeVO.id && Intrinsics.d(this.input, discountCodeVO.input) && Intrinsics.d(this.button, discountCodeVO.button);
    }

    @NotNull
    public final Button getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Input getInput() {
        return this.input;
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
        return this.button.hashCode() + ((this.input.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DiscountCodeVO(id=" + this.id + ", input=" + this.input + ", button=" + this.button + ")";
    }
}
