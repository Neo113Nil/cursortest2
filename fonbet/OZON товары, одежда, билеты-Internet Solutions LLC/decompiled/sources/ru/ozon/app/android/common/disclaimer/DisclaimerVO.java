package ru.ozon.app.android.common.disclaimer;

import Bl.b;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/disclaimer/DisclaimerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isRounded", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "<init>", "(JZLru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "disclaimer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclaimerVO implements c {

    @NotNull
    private final DisclaimerAtom disclaimer;
    private final long id;
    private final boolean isRounded;

    public DisclaimerVO(long j11, boolean z11, @NotNull DisclaimerAtom disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.id = j11;
        this.isRounded = z11;
        this.disclaimer = disclaimer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerVO)) {
            return false;
        }
        DisclaimerVO disclaimerVO = (DisclaimerVO) other;
        return this.id == disclaimerVO.id && this.isRounded == disclaimerVO.isRounded && Intrinsics.d(this.disclaimer, disclaimerVO.disclaimer);
    }

    @NotNull
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
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
        return this.disclaimer.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.isRounded);
    }

    /* renamed from: isRounded, reason: from getter */
    public final boolean getIsRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isRounded;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        StringBuilder c11 = b.c(j11, "DisclaimerVO(id=", ", isRounded=", z11);
        c11.append(", disclaimer=");
        c11.append(disclaimerAtom);
        c11.append(")");
        return c11.toString();
    }
}
