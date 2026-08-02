package ru.ozon.app.android.account.orders.cancel.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.ConfirmingCancellationPopover;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/data/FetchCancelPostingsAction;", "Landroid/os/Parcelable;", "nextAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "popover", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;)V", "getNextAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPopover", "()Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/ConfirmingCancellationPopover;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FetchCancelPostingsAction implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FetchCancelPostingsAction> CREATOR = new Creator();

    @NotNull
    private final AtomActionDTO nextAction;
    private final ConfirmingCancellationPopover popover;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FetchCancelPostingsAction> {
        @Override // android.os.Parcelable.Creator
        public final FetchCancelPostingsAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FetchCancelPostingsAction((AtomActionDTO) parcel.readParcelable(FetchCancelPostingsAction.class.getClassLoader()), (ConfirmingCancellationPopover) parcel.readParcelable(FetchCancelPostingsAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FetchCancelPostingsAction[] newArray(int i11) {
            return new FetchCancelPostingsAction[i11];
        }
    }

    public FetchCancelPostingsAction(@NotNull AtomActionDTO nextAction, ConfirmingCancellationPopover confirmingCancellationPopover) {
        Intrinsics.checkNotNullParameter(nextAction, "nextAction");
        this.nextAction = nextAction;
        this.popover = confirmingCancellationPopover;
    }

    public static /* synthetic */ FetchCancelPostingsAction copy$default(FetchCancelPostingsAction fetchCancelPostingsAction, AtomActionDTO atomActionDTO, ConfirmingCancellationPopover confirmingCancellationPopover, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = fetchCancelPostingsAction.nextAction;
        }
        if ((i11 & 2) != 0) {
            confirmingCancellationPopover = fetchCancelPostingsAction.popover;
        }
        return fetchCancelPostingsAction.copy(atomActionDTO, confirmingCancellationPopover);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    /* renamed from: component2, reason: from getter */
    public final ConfirmingCancellationPopover getPopover() {
        return this.popover;
    }

    @NotNull
    public final FetchCancelPostingsAction copy(@NotNull AtomActionDTO nextAction, ConfirmingCancellationPopover popover) {
        Intrinsics.checkNotNullParameter(nextAction, "nextAction");
        return new FetchCancelPostingsAction(nextAction, popover);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchCancelPostingsAction)) {
            return false;
        }
        FetchCancelPostingsAction fetchCancelPostingsAction = (FetchCancelPostingsAction) other;
        return Intrinsics.d(this.nextAction, fetchCancelPostingsAction.nextAction) && Intrinsics.d(this.popover, fetchCancelPostingsAction.popover);
    }

    @NotNull
    public final AtomActionDTO getNextAction() {
        return this.nextAction;
    }

    public final ConfirmingCancellationPopover getPopover() {
        return this.popover;
    }

    public int hashCode() {
        int hashCode = this.nextAction.hashCode() * 31;
        ConfirmingCancellationPopover confirmingCancellationPopover = this.popover;
        return hashCode + (confirmingCancellationPopover == null ? 0 : confirmingCancellationPopover.hashCode());
    }

    @NotNull
    public String toString() {
        return "FetchCancelPostingsAction(nextAction=" + this.nextAction + ", popover=" + this.popover + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.nextAction, flags);
        dest.writeParcelable(this.popover, flags);
    }
}
