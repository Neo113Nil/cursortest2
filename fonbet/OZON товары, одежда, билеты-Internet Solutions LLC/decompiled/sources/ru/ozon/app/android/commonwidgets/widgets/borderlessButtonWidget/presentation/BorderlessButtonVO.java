package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation;

import D3.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "borderlessBtn", "", "gravity", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getBorderlessBtn", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "I", "getGravity", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BorderlessButtonVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton borderlessBtn;
    private final int gravity;
    private final long id;

    public BorderlessButtonVO(long j11, @NotNull ButtonV3Atom.LargeBorderlessButton borderlessBtn, int i11) {
        Intrinsics.checkNotNullParameter(borderlessBtn, "borderlessBtn");
        this.id = j11;
        this.borderlessBtn = borderlessBtn;
        this.gravity = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderlessButtonVO)) {
            return false;
        }
        BorderlessButtonVO borderlessButtonVO = (BorderlessButtonVO) other;
        return this.id == borderlessButtonVO.id && Intrinsics.d(this.borderlessBtn, borderlessButtonVO.borderlessBtn) && this.gravity == borderlessButtonVO.gravity;
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getBorderlessBtn() {
        return this.borderlessBtn;
    }

    public final int getGravity() {
        return this.gravity;
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
        return Integer.hashCode(this.gravity) + ((this.borderlessBtn.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.borderlessBtn;
        int i11 = this.gravity;
        StringBuilder sb2 = new StringBuilder("BorderlessButtonVO(id=");
        sb2.append(j11);
        sb2.append(", borderlessBtn=");
        sb2.append(largeBorderlessButton);
        return h.b(sb2, ", gravity=", i11, ")");
    }
}
