package ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.stickyblock;

import G.g;
import Lh.a;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/stickyblock/StickyBlockVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "restrictionAtoms", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "currentState", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "restrictionTokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getRestrictionAtoms", "()Ljava/util/List;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "getCurrentState", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "LWZ/t;", "getRestrictionTokenizedEvent", "()LWZ/t;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyBlockVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton button;

    @NotNull
    private final ProductPickerDetailsDTO.CurrentState currentState;
    private final long id;

    @NotNull
    private final List<AtomDTO> restrictionAtoms;
    private final t restrictionTokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public StickyBlockVO(long j11, @NotNull ButtonV3Atom.LargeButton button, @NotNull List<? extends AtomDTO> restrictionAtoms, @NotNull ProductPickerDetailsDTO.CurrentState currentState, t tVar) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(restrictionAtoms, "restrictionAtoms");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        this.id = j11;
        this.button = button;
        this.restrictionAtoms = restrictionAtoms;
        this.currentState = currentState;
        this.restrictionTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyBlockVO)) {
            return false;
        }
        StickyBlockVO stickyBlockVO = (StickyBlockVO) other;
        return this.id == stickyBlockVO.id && Intrinsics.d(this.button, stickyBlockVO.button) && Intrinsics.d(this.restrictionAtoms, stickyBlockVO.restrictionAtoms) && Intrinsics.d(this.currentState, stickyBlockVO.currentState) && Intrinsics.d(this.restrictionTokenizedEvent, stickyBlockVO.restrictionTokenizedEvent);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @NotNull
    public final ProductPickerDetailsDTO.CurrentState getCurrentState() {
        return this.currentState;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<AtomDTO> getRestrictionAtoms() {
        return this.restrictionAtoms;
    }

    public final t getRestrictionTokenizedEvent() {
        return this.restrictionTokenizedEvent;
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
        int hashCode = (this.currentState.hashCode() + g.b(b.a(this.button, Long.hashCode(this.id) * 31, 31), 31, this.restrictionAtoms)) * 31;
        t tVar = this.restrictionTokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.LargeButton largeButton = this.button;
        List<AtomDTO> list = this.restrictionAtoms;
        ProductPickerDetailsDTO.CurrentState currentState = this.currentState;
        t tVar = this.restrictionTokenizedEvent;
        StringBuilder h11 = Bi.b.h("StickyBlockVO(id=", j11, ", button=", largeButton);
        h11.append(", restrictionAtoms=");
        h11.append(list);
        h11.append(", currentState=");
        h11.append(currentState);
        return a.b(h11, ", restrictionTokenizedEvent=", tVar, ")");
    }
}
