package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import Tl.b;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;", "", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "pickupButtonVo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "getPickupButtonVo", "()Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "setPickupButtonVo", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PickupButtonWrapper {

    @NotNull
    private final AtomAction action;

    @NotNull
    private PickupButtonVo pickupButtonVo;
    private final t tokenizedEvent;

    public PickupButtonWrapper(@NotNull PickupButtonVo pickupButtonVo, @NotNull AtomAction action, t tVar) {
        Intrinsics.checkNotNullParameter(pickupButtonVo, "pickupButtonVo");
        Intrinsics.checkNotNullParameter(action, "action");
        this.pickupButtonVo = pickupButtonVo;
        this.action = action;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupButtonWrapper)) {
            return false;
        }
        PickupButtonWrapper pickupButtonWrapper = (PickupButtonWrapper) other;
        return Intrinsics.d(this.pickupButtonVo, pickupButtonWrapper.pickupButtonVo) && Intrinsics.d(this.action, pickupButtonWrapper.action) && Intrinsics.d(this.tokenizedEvent, pickupButtonWrapper.tokenizedEvent);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final PickupButtonVo getPickupButtonVo() {
        return this.pickupButtonVo;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int a11 = C4598rp.a(this.action, this.pickupButtonVo.hashCode() * 31, 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        PickupButtonVo pickupButtonVo = this.pickupButtonVo;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("PickupButtonWrapper(pickupButtonVo=");
        sb2.append(pickupButtonVo);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        return b.d(sb2, tVar, ")");
    }
}
