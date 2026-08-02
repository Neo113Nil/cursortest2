package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import Hs.b;
import Hs.c;
import Mc.a;
import Sc.o;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2DTO;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.WannaDiscountV2Repository;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Request;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Action;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Result;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2State;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.vo.WannaDiscountV2VO;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\t2\u0006\u0010!\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J5\u0010+\u001a\u00020\t2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b+\u0010,J!\u00101\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R&\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000705048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0007058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewModel;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2Repository;", "repository", "<init>", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2Repository;)V", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;", "event", "", "addEventToQueue", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Result;)V", "", "price", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/vo/WannaDiscountV2VO$Discount;", "oldDiscounts", "checkPriceEqualsDiscount", "(Ljava/lang/String;Ljava/util/List;)V", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;", "priceInput", "", "isPriceTooSmall", "(DLru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;)Z", "userPrice", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;", "priceBlock", "isPriceTooHigh", "(DLru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;)Z", "s", "parsePrice", "(Ljava/lang/String;)Ljava/lang/Double;", "action", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;", "request", "sendDiscount", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;)V", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;", "sendUserAction", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2Action;)V", "priceStr", "discounts", "checkPrice", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceInputBlock;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$PriceBlock;Ljava/util/List;)V", "", "userQuantity", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;", "quantityInput", "checkQuantity", "(Ljava/lang/Long;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2DTO$QuantityInputBlock;)V", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2Repository;", "Landroidx/lifecycle/V;", "Ljava/util/concurrent/LinkedBlockingQueue;", "resultLiveData", "Landroidx/lifecycle/V;", "getResultLiveData", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2State;", "state", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/model/WannaDiscountV2State;", "events", "Ljava/util/concurrent/LinkedBlockingQueue;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountV2ViewModelImpl extends w0 implements WannaDiscountV2ViewModel {

    @NotNull
    private final LinkedBlockingQueue<WannaDiscountV2Result> events;

    @NotNull
    private final WannaDiscountV2Repository repository;

    @NotNull
    private final V<LinkedBlockingQueue<WannaDiscountV2Result>> resultLiveData;

    @NotNull
    private WannaDiscountV2State state;
    public static final int $stable = 8;

    @NotNull
    private static final Regex PRICE_REGEX = new Regex("[^0-9]");

    public WannaDiscountV2ViewModelImpl(@NotNull WannaDiscountV2Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.resultLiveData = new V<>();
        this.state = new WannaDiscountV2State(false, false, null, false, 15, null);
        this.events = new LinkedBlockingQueue<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEventToQueue(WannaDiscountV2Result event) {
        this.events.add(event);
        getResultLiveData().setValue(this.events);
    }

    private final void checkPriceEqualsDiscount(String price, List<WannaDiscountV2VO.Discount> oldDiscounts) {
        Iterator<WannaDiscountV2VO.Discount> it = oldDiscounts.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.d(it.next().getDiscountPrice(), price)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1 || !oldDiscounts.get(i11).getDiscount().isSelected()) {
            sendUserAction(new WannaDiscountV2Action.UpdateDiscounts(oldDiscounts, i11));
        }
    }

    private final boolean isPriceTooHigh(double userPrice, WannaDiscountV2DTO.PriceBlock priceBlock) {
        OzonSpannableString originalPrice = priceBlock.getPrice().getOriginalPrice();
        if (originalPrice == null) {
            originalPrice = priceBlock.getPrice().getPrice();
        }
        Double parsePrice = parsePrice(String.valueOf(originalPrice));
        return parsePrice == null || userPrice > parsePrice.doubleValue();
    }

    private final boolean isPriceTooSmall(double price, WannaDiscountV2DTO.PriceInputBlock priceInput) {
        return price < priceInput.getMinPrice();
    }

    private final Double parsePrice(String s11) {
        return h.u0(PRICE_REGEX.replace(s11, ""));
    }

    @Override // ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModel
    public void checkPrice(@NotNull String priceStr, @NotNull WannaDiscountV2DTO.PriceInputBlock priceInput, @NotNull WannaDiscountV2DTO.PriceBlock priceBlock, @NotNull List<WannaDiscountV2VO.Discount> discounts) {
        Intrinsics.checkNotNullParameter(priceStr, "priceStr");
        Intrinsics.checkNotNullParameter(priceInput, "priceInput");
        Intrinsics.checkNotNullParameter(priceBlock, "priceBlock");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        Double u02 = h.u0(priceStr);
        if (u02 == null) {
            sendUserAction(new WannaDiscountV2Action.PriceError(priceInput.getError().getRequire(), discounts));
            return;
        }
        if (u02.doubleValue() == 0.0d) {
            sendUserAction(new WannaDiscountV2Action.PriceError(priceInput.getError().getEmpty(), discounts));
            return;
        }
        if (isPriceTooSmall(u02.doubleValue(), priceInput)) {
            sendUserAction(new WannaDiscountV2Action.PriceError(priceInput.getError().getMaxDiscount(), discounts));
        } else if (isPriceTooHigh(u02.doubleValue(), priceBlock)) {
            sendUserAction(new WannaDiscountV2Action.PriceError(priceInput.getError().getMax(), discounts));
        } else {
            sendUserAction(new WannaDiscountV2Action.PriceSuccess(priceStr, discounts));
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModel
    public void checkQuantity(Long userQuantity, @NotNull WannaDiscountV2DTO.QuantityInputBlock quantityInput) {
        Intrinsics.checkNotNullParameter(quantityInput, "quantityInput");
        if (userQuantity == null || userQuantity.longValue() < quantityInput.getUserQuantityMin()) {
            sendUserAction(new WannaDiscountV2Action.QuantityError(quantityInput.getError().getEmpty()));
        } else if (userQuantity.longValue() > Math.min(99L, quantityInput.getUserQuantityMax())) {
            sendUserAction(new WannaDiscountV2Action.QuantityError(quantityInput.getError().getMax()));
        } else {
            sendUserAction(WannaDiscountV2Action.QuantitySuccess.INSTANCE);
        }
    }

    public void sendDiscount(@NotNull String action, @NotNull WannaDiscountV2Request request) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(request, "request");
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = this.repository.sendDiscountV2(action, request).j(a.b()).g(C8125a.a()).h(new b(new WannaDiscountV2ViewModelImpl$sendDiscount$1(this), 11), new c(new WannaDiscountV2ViewModelImpl$sendDiscount$2(this), 11));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    @Override // ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModel
    public void sendUserAction(@NotNull WannaDiscountV2Action action) {
        String str;
        TagV3Atom.TagAtom discount;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean priceError = this.state.getPriceError();
        boolean quantityError = this.state.getQuantityError();
        if (action instanceof WannaDiscountV2Action.PriceError) {
            this.state = WannaDiscountV2State.copy$default(this.state, true, false, null, false, 6, null);
            WannaDiscountV2Action.PriceError priceError2 = (WannaDiscountV2Action.PriceError) action;
            addEventToQueue(new WannaDiscountV2Result.PriceError(priceError2.getMessage()));
            sendUserAction(new WannaDiscountV2Action.UpdateDiscounts(priceError2.getDiscounts(), -1));
            return;
        }
        if (action instanceof WannaDiscountV2Action.QuantityError) {
            this.state = WannaDiscountV2State.copy$default(this.state, false, true, null, false, 5, null);
            addEventToQueue(new WannaDiscountV2Result.QuantityError(((WannaDiscountV2Action.QuantityError) action).getMessage()));
            return;
        }
        if (action instanceof WannaDiscountV2Action.PriceSuccess) {
            WannaDiscountV2State copy$default = WannaDiscountV2State.copy$default(this.state, false, false, null, !quantityError, 6, null);
            this.state = copy$default;
            addEventToQueue(new WannaDiscountV2Result.PriceSuccess(copy$default.getIsSendButtonEnabled()));
            WannaDiscountV2Action.PriceSuccess priceSuccess = (WannaDiscountV2Action.PriceSuccess) action;
            checkPriceEqualsDiscount(priceSuccess.getPrice(), priceSuccess.getDiscounts());
            return;
        }
        if (action instanceof WannaDiscountV2Action.QuantitySuccess) {
            WannaDiscountV2State copy$default2 = WannaDiscountV2State.copy$default(this.state, false, false, null, !priceError, 5, null);
            this.state = copy$default2;
            addEventToQueue(new WannaDiscountV2Result.QuantitySuccess(copy$default2.getIsSendButtonEnabled()));
            return;
        }
        if (!(action instanceof WannaDiscountV2Action.UpdateDiscounts)) {
            if (!(action instanceof WannaDiscountV2Action.SendDiscount)) {
                throw new o();
            }
            WannaDiscountV2Action.SendDiscount sendDiscount = (WannaDiscountV2Action.SendDiscount) action;
            sendDiscount(sendDiscount.getAction(), new WannaDiscountV2Request(sendDiscount.getSku(), sendDiscount.getUserPrice(), this.state.getPressedDiscount(), true, sendDiscount.getUserQuantity(), sendDiscount.getUserQuantity()));
            return;
        }
        WannaDiscountV2Action.UpdateDiscounts updateDiscounts = (WannaDiscountV2Action.UpdateDiscounts) action;
        List<WannaDiscountV2VO.Discount> discounts = updateDiscounts.getDiscounts();
        ArrayList arrayList = new ArrayList(C7714v.z(discounts, 10));
        int i11 = 0;
        for (Object obj : discounts) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            WannaDiscountV2VO.Discount discount2 = (WannaDiscountV2VO.Discount) obj;
            arrayList.add(WannaDiscountV2VO.Discount.copy$default(discount2, TagV3Atom.TagAtom.copy$default(discount2.getDiscount(), null, null, null, null, i11 == updateDiscounts.getPosition(), null, null, null, null, null, 1007, null), null, 2, null));
            i11 = i12;
        }
        WannaDiscountV2State wannaDiscountV2State = this.state;
        WannaDiscountV2VO.Discount discount3 = (WannaDiscountV2VO.Discount) C7714v.Q(updateDiscounts.getPosition(), arrayList);
        if (discount3 == null || (discount = discount3.getDiscount()) == null || (str = discount.getText()) == null) {
            str = "";
        }
        this.state = WannaDiscountV2State.copy$default(wannaDiscountV2State, false, false, str, false, 11, null);
        addEventToQueue(new WannaDiscountV2Result.UpdateDiscount(arrayList));
    }

    @Override // ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModel
    @NotNull
    public V<LinkedBlockingQueue<WannaDiscountV2Result>> getResultLiveData() {
        return this.resultLiveData;
    }
}
