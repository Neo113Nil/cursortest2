package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item;

import Ae.InterfaceC2395h;
import Ae.M0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModel;", "", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", DynamicElementDTO.TIMER, "", "bindTimer", "(Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;)V", "LAe/M0;", "getTimerState", "()LAe/M0;", "timerState", "LAe/h;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModel$Action;", "getAction", "()LAe/h;", "action", "Action", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PromoReviewItemViewModel {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModel$Action;", "", "<init>", "()V", "Refresh", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModel$Action$Refresh;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModel$Action$Refresh;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Refresh extends Action {

            @NotNull
            public static final Refresh INSTANCE = new Refresh();

            private Refresh() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Refresh);
            }

            public int hashCode() {
                return -1377101707;
            }

            @NotNull
            public String toString() {
                return "Refresh";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    void bindTimer(PromoReviewItemVO.TimerVO timer);

    @NotNull
    InterfaceC2395h<Action> getAction();

    @NotNull
    M0<PromoReviewItemVO.TimerVO> getTimerState();
}
