package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item;

import Ae.C2380A;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import Wc.a;
import androidx.lifecycle.w0;
import h20.InterfaceC6786a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.Period;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.pdp.utils.CoroutinesKt;
import ru.ozon.app.android.ugc.payout.R$plurals;
import ru.ozon.app.android.ugc.payout.R$string;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVO;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.DateUtilsKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.B0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0005R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModelImpl;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModel;", "<init>", "()V", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", DynamicElementDTO.TIMER, "", "updateTimeRemain", "(Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lorg/joda/time/Interval;", "interval", "setTimerText", "(Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;Lorg/joda/time/Interval;)Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", "bindTimer", "(Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;)V", "onCleared", "Lxe/B0;", "timerJob", "Lxe/B0;", "LAe/w0;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemViewModel$Action;", "action", "LAe/w0;", "getAction", "()LAe/w0;", "LAe/x0;", "timerState", "LAe/x0;", "getTimerState", "()LAe/x0;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoReviewItemViewModelImpl extends w0 implements InterfaceC6786a, PromoReviewItemViewModel {
    private B0 timerJob;

    @NotNull
    private final Ae.w0<PromoReviewItemViewModel.Action> action = E0.b(0, 0, null, 7);

    @NotNull
    private final x0<PromoReviewItemVO.TimerVO> timerState = O0.a(null);

    private final PromoReviewItemVO.TimerVO setTimerText(PromoReviewItemVO.TimerVO timerVO, Interval interval) {
        String quantityString;
        interval.getClass();
        Period period = new Period(interval.a(), interval.b(), interval.getChronology());
        int n11 = Days.C(interval).n();
        TextDTO timer = timerVO.getTimer();
        if (n11 < 1) {
            quantityString = StringProvider.getString(R$string.promo_review_time_remaining, DateUtilsKt.toTwoDigitString(period.u()), DateUtilsKt.toTwoDigitString(period.y()), DateUtilsKt.toTwoDigitString(period.B()));
        } else {
            int i11 = n11 + 1;
            quantityString = StringProvider.getQuantityString(R$plurals.reviews_remain_days_without_left, i11, Integer.valueOf(i11));
        }
        return PromoReviewItemVO.TimerVO.copy$default(timerVO, TextDTO.copy$default(timer, new OzonSpannableString(quantityString), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, null, null, 0L, null, null, 126, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateTimeRemain(PromoReviewItemVO.TimerVO timerVO, d<? super Unit> dVar) {
        DateTime l11 = new DateTime().l((int) timerVO.getTimeDelta());
        if (l11.compareTo(timerVO.getEndTime()) > 0) {
            Object emit = getAction().emit(PromoReviewItemViewModel.Action.Refresh.INSTANCE, dVar);
            return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
        }
        getTimerState().setValue(setTimerText(timerVO, new Interval(l11, timerVO.getEndTime())));
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemViewModel
    public void bindTimer(PromoReviewItemVO.TimerVO timer) {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        if (timer != null) {
            this.timerJob = C2399j.C(new C2408n0(new C2380A(CoroutinesKt.interval(1L, TimeUnit.SECONDS), new PromoReviewItemViewModelImpl$bindTimer$1$1(this, timer, null)), new PromoReviewItemViewModelImpl$bindTimer$1$2(this, timer, null)), androidx.lifecycle.x0.a(this));
        }
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        this.timerJob = null;
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemViewModel
    @NotNull
    public Ae.w0<PromoReviewItemViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemViewModel
    @NotNull
    public x0<PromoReviewItemVO.TimerVO> getTimerState() {
        return this.timerState;
    }
}
