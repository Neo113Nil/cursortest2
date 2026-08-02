package ru.ozon.app.android.rfbs.deliverycomplain.presentation.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.rfbs.deliverycomplain.data.ComplainCompletedState;
import ru.ozon.app.android.rfbs.deliverycomplain.data.EnterComplainState;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/models/DeliveryComplainVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;", "enterComplainState", "Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;", "completedComplainState", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "actionButton", "<init>", "(JLru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;", "getEnterComplainState", "()Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;", "Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;", "getCompletedComplainState", "()Lru/ozon/app/android/rfbs/deliverycomplain/data/ComplainCompletedState;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryComplainVO implements c {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final ButtonV3Atom.LargeButton actionButton;
    private final ComplainCompletedState completedComplainState;
    private final EnterComplainState enterComplainState;
    private final long id;

    public DeliveryComplainVO(long j11, EnterComplainState enterComplainState, ComplainCompletedState complainCompletedState, ButtonV3Atom.LargeButton largeButton) {
        this.id = j11;
        this.enterComplainState = enterComplainState;
        this.completedComplainState = complainCompletedState;
        this.actionButton = largeButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryComplainVO)) {
            return false;
        }
        DeliveryComplainVO deliveryComplainVO = (DeliveryComplainVO) other;
        return this.id == deliveryComplainVO.id && Intrinsics.d(this.enterComplainState, deliveryComplainVO.enterComplainState) && Intrinsics.d(this.completedComplainState, deliveryComplainVO.completedComplainState) && Intrinsics.d(this.actionButton, deliveryComplainVO.actionButton);
    }

    public final ButtonV3Atom.LargeButton getActionButton() {
        return this.actionButton;
    }

    public final ComplainCompletedState getCompletedComplainState() {
        return this.completedComplainState;
    }

    public final EnterComplainState getEnterComplainState() {
        return this.enterComplainState;
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
        int hashCode = Long.hashCode(this.id) * 31;
        EnterComplainState enterComplainState = this.enterComplainState;
        int hashCode2 = (hashCode + (enterComplainState == null ? 0 : enterComplainState.hashCode())) * 31;
        ComplainCompletedState complainCompletedState = this.completedComplainState;
        int hashCode3 = (hashCode2 + (complainCompletedState == null ? 0 : complainCompletedState.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.actionButton;
        return hashCode3 + (largeButton != null ? largeButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeliveryComplainVO(id=" + this.id + ", enterComplainState=" + this.enterComplainState + ", completedComplainState=" + this.completedComplainState + ", actionButton=" + this.actionButton + ")";
    }
}
