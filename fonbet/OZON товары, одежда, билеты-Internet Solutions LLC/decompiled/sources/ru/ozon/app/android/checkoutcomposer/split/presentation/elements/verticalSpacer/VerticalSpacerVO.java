package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.verticalSpacer;

import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/verticalSpacer/VerticalSpacerVO;", "Ll20/c;", "", "id", "", "spacing", "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getSpacing", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VerticalSpacerVO implements c {
    private final long id;
    private final int spacing;

    public VerticalSpacerVO(long j11, int i11) {
        this.id = j11;
        this.spacing = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalSpacerVO)) {
            return false;
        }
        VerticalSpacerVO verticalSpacerVO = (VerticalSpacerVO) other;
        return this.id == verticalSpacerVO.id && this.spacing == verticalSpacerVO.spacing;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Integer.hashCode(this.spacing) + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = Ql.c.b(this.id, "VerticalSpacerVO(id=", this.spacing, ", spacing=");
        b11.append(")");
        return b11.toString();
    }
}
