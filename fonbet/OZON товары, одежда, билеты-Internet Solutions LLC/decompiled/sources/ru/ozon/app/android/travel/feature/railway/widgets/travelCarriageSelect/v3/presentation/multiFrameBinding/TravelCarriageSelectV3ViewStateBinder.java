package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.ViewHolderLifecycle;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view.TravelCarriageSelectV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/TravelCarriageSelectV3ViewStateBinder;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/multiFrameBinding/ViewHolderLifecycle;", "<init>", "()V", "", "bindTexts", "bindStoreys", "bindServices", "bindSeats", "bindPrices", "bindPremiumBadge", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;", "itemView", "init", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "prepare", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;Lkotlin/jvm/functions/Function1;)V", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/view/TravelCarriageSelectV3View;", "Lkotlin/jvm/functions/Function1;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3ViewStateBinder implements ViewHolderLifecycle {
    private Function1<? super AtomAction, Unit> actionHandler;
    private TravelCarriageSelectV3VO item;
    private TravelCarriageSelectV3View itemView;

    public void bindPremiumBadge() {
        TravelCarriageSelectV3View travelCarriageSelectV3View;
        TravelCarriageSelectV3VO travelCarriageSelectV3VO = this.item;
        if (travelCarriageSelectV3VO == null || (travelCarriageSelectV3View = this.itemView) == null) {
            return;
        }
        travelCarriageSelectV3View.bindPremiumBadge(travelCarriageSelectV3VO.getPremiumBadge(), this.actionHandler);
    }

    public void bindPrices() {
        TravelCarriageSelectV3View travelCarriageSelectV3View;
        TravelCarriageSelectV3VO travelCarriageSelectV3VO = this.item;
        if (travelCarriageSelectV3VO == null || (travelCarriageSelectV3View = this.itemView) == null) {
            return;
        }
        travelCarriageSelectV3View.bindPrices(travelCarriageSelectV3VO.getPriceBlock(), travelCarriageSelectV3VO.getOriginalPrice());
    }

    public void bindSeats() {
        TravelCarriageSelectV3View travelCarriageSelectV3View;
        TravelCarriageSelectV3VO travelCarriageSelectV3VO = this.item;
        if (travelCarriageSelectV3VO == null || (travelCarriageSelectV3View = this.itemView) == null) {
            return;
        }
        travelCarriageSelectV3View.bindSeats(travelCarriageSelectV3VO.getSeatsDetails(), travelCarriageSelectV3VO.getSeatsCount());
    }

    public void bindServices() {
        TravelCarriageSelectV3View travelCarriageSelectV3View;
        TravelCarriageSelectV3VO travelCarriageSelectV3VO = this.item;
        if (travelCarriageSelectV3VO == null || (travelCarriageSelectV3View = this.itemView) == null) {
            return;
        }
        travelCarriageSelectV3View.bindServices(travelCarriageSelectV3VO.getServices());
    }

    public void bindStoreys() {
        TravelCarriageSelectV3View travelCarriageSelectV3View;
        TravelCarriageSelectV3VO travelCarriageSelectV3VO = this.item;
        if (travelCarriageSelectV3VO == null || (travelCarriageSelectV3View = this.itemView) == null) {
            return;
        }
        travelCarriageSelectV3View.bindStoreys(travelCarriageSelectV3VO.getStoreys(), travelCarriageSelectV3VO.getAdditionalInfo());
    }

    public void bindTexts() {
        TravelCarriageSelectV3View travelCarriageSelectV3View;
        TravelCarriageSelectV3VO travelCarriageSelectV3VO = this.item;
        if (travelCarriageSelectV3VO == null || (travelCarriageSelectV3View = this.itemView) == null) {
            return;
        }
        travelCarriageSelectV3View.bindTexts(travelCarriageSelectV3VO.getType(), travelCarriageSelectV3VO.getServiceType(), travelCarriageSelectV3VO.getNumber());
    }

    public final void init(@NotNull TravelCarriageSelectV3View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.itemView = itemView;
    }

    public void onAttach() {
        ViewHolderLifecycle.DefaultImpls.onAttach(this);
    }

    public void onDetach() {
        ViewHolderLifecycle.DefaultImpls.onDetach(this);
    }

    public void onOffscreenPositionChanged(float f7) {
        ViewHolderLifecycle.DefaultImpls.onOffscreenPositionChanged(this, f7);
    }

    public void onRecycle() {
        ViewHolderLifecycle.DefaultImpls.onRecycle(this);
    }

    public final void prepare(@NotNull TravelCarriageSelectV3VO vo, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.item = vo;
        this.actionHandler = actionHandler;
        TravelCarriageSelectV3View travelCarriageSelectV3View = this.itemView;
        if (travelCarriageSelectV3View != null) {
            travelCarriageSelectV3View.bindActions(vo.getSelectSeatAction(), actionHandler);
        }
    }
}
