package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "cellId", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "tariffAspectVO", "Lkotlin/Function1;", "", "actionHandler", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;ILru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getCellId", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "getTariffAspectVO", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdditionalServicesTariffActionWrapper {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final AtomAction atomAction;
    private final int cellId;

    @NotNull
    private final AdditionalServicesTariffAspectVO tariffAspectVO;

    /* JADX WARN: Multi-variable type inference failed */
    public AdditionalServicesTariffActionWrapper(AtomAction atomAction, int i11, @NotNull AdditionalServicesTariffAspectVO tariffAspectVO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(tariffAspectVO, "tariffAspectVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.atomAction = atomAction;
        this.cellId = i11;
        this.tariffAspectVO = tariffAspectVO;
        this.actionHandler = actionHandler;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesTariffActionWrapper)) {
            return false;
        }
        AdditionalServicesTariffActionWrapper additionalServicesTariffActionWrapper = (AdditionalServicesTariffActionWrapper) other;
        return Intrinsics.d(this.atomAction, additionalServicesTariffActionWrapper.atomAction) && this.cellId == additionalServicesTariffActionWrapper.cellId && Intrinsics.d(this.tariffAspectVO, additionalServicesTariffActionWrapper.tariffAspectVO) && Intrinsics.d(this.actionHandler, additionalServicesTariffActionWrapper.actionHandler);
    }

    @NotNull
    public final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    public final AtomAction getAtomAction() {
        return this.atomAction;
    }

    public final int getCellId() {
        return this.cellId;
    }

    @NotNull
    public final AdditionalServicesTariffAspectVO getTariffAspectVO() {
        return this.tariffAspectVO;
    }

    public int hashCode() {
        AtomAction atomAction = this.atomAction;
        return this.actionHandler.hashCode() + ((this.tariffAspectVO.hashCode() + C2454a.a(this.cellId, (atomAction == null ? 0 : atomAction.hashCode()) * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AdditionalServicesTariffActionWrapper(atomAction=" + this.atomAction + ", cellId=" + this.cellId + ", tariffAspectVO=" + this.tariffAspectVO + ", actionHandler=" + this.actionHandler + ")";
    }
}
