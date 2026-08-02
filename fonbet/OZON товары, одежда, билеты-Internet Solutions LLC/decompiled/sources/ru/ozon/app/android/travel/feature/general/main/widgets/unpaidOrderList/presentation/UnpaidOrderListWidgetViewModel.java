package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation;

import G.g;
import android.os.CountDownTimer;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data.UnpaidOrderListDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data.UnpaidOrderListMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0004\b\u0019\u0010\u0017J+\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListWidgetViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListMapper;", "mapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "asyncData", "", "fetchWidget", "(Ljava/lang/String;)V", "onCleared", "()V", "Landroidx/lifecycle/P;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "ordersLiveData", "()Landroidx/lifecycle/P;", "", "orderTimerFinishedLiveData", "list", "", "maxTimerValue", "mappingTime", "startTimers", "(Ljava/util/List;JJ)V", "getActualOrders", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListMapper;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "orders", "Ljava/util/List;", "Landroid/os/CountDownTimer;", DynamicElementDTO.TIMER, "Landroid/os/CountDownTimer;", "filterTime", "Ljava/lang/Long;", "cacheMaxTimerValue", "cachedDiff", "J", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnpaidOrderListWidgetViewModel extends AbstractAsyncWidgetViewModel<UnpaidOrderListDTO, UnpaidOrderListVO.UnpaidOrderListStateWrapper> {
    private Long cacheMaxTimerValue;
    private long cachedDiff;
    private Long filterTime;

    @NotNull
    private final UnpaidOrderListMapper mapper;

    @NotNull
    private final V<Boolean> orderTimerFinishedLiveData;

    @NotNull
    private List<UnpaidOrderListVO.OrderVO> orders;

    @NotNull
    private final V<List<UnpaidOrderListVO.OrderVO>> ordersLiveData;
    private CountDownTimer timer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnpaidOrderListWidgetViewModel(@NotNull ComposerAsyncWidgetRepository repository, @NotNull UnpaidOrderListMapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        super(repository, mapper, dispatcherProvider, null, 8, null);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.mapper = mapper;
        this.ordersLiveData = new V<>();
        this.orderTimerFinishedLiveData = new V<>();
        this.orders = K.f71697a;
    }

    public void fetchWidget(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        AbstractAsyncWidgetViewModel.fetchWidget$default(this, UnpaidOrderListDTO.class, asyncData, null, 4, null);
        this.orderTimerFinishedLiveData.setValue(Boolean.FALSE);
    }

    @NotNull
    public final List<UnpaidOrderListVO.OrderVO> getActualOrders() {
        Long l11 = this.filterTime;
        if (l11 != null) {
            long longValue = l11.longValue();
            List<UnpaidOrderListVO.OrderVO> list = this.orders;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (longValue <= ((UnpaidOrderListVO.OrderVO) obj).getTimeToPay() - this.cachedDiff) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 1) {
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(UnpaidOrderListVO.OrderVO.copy$default((UnpaidOrderListVO.OrderVO) it.next(), 0L, true, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, 65533, null));
                }
                arrayList = arrayList2;
            }
            this.orders = arrayList;
            this.filterTime = null;
        }
        this.orderTimerFinishedLiveData.setValue(Boolean.FALSE);
        return this.orders;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel, h20.InterfaceC6786a
    public void onCleared() {
        super.onCleared();
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @NotNull
    public final P<Boolean> orderTimerFinishedLiveData() {
        return this.orderTimerFinishedLiveData;
    }

    @NotNull
    public final P<List<UnpaidOrderListVO.OrderVO>> ordersLiveData() {
        return this.ordersLiveData;
    }

    public final void startTimers(@NotNull List<UnpaidOrderListVO.OrderVO> list, final long maxTimerValue, long mappingTime) {
        Intrinsics.checkNotNullParameter(list, "list");
        Long l11 = this.cacheMaxTimerValue;
        if (l11 != null && l11.longValue() == maxTimerValue) {
            return;
        }
        this.cacheMaxTimerValue = Long.valueOf(maxTimerValue);
        this.orders = C7714v.W0(list);
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        final long currentTimeMillis = System.currentTimeMillis() - mappingTime;
        this.cachedDiff = currentTimeMillis;
        final long j11 = maxTimerValue - currentTimeMillis;
        final long millis = TimeUnit.SECONDS.toMillis(1L);
        CountDownTimer countDownTimer2 = new CountDownTimer(j11, this, currentTimeMillis, maxTimerValue, millis) { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListWidgetViewModel$startTimers$1
            final /* synthetic */ long $diff;
            final /* synthetic */ long $maxTimerValue;
            final /* synthetic */ long $shiftedMaxTimerValue;
            final /* synthetic */ UnpaidOrderListWidgetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(j11, millis);
                this.$shiftedMaxTimerValue = j11;
                this.this$0 = this;
                this.$diff = currentTimeMillis;
                this.$maxTimerValue = maxTimerValue;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                V v11;
                this.this$0.filterTime = Long.valueOf(this.$maxTimerValue);
                v11 = this.this$0.orderTimerFinishedLiveData;
                v11.setValue(Boolean.TRUE);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                V v11;
                List list2;
                String str;
                UnpaidOrderListMapper unpaidOrderListMapper;
                V v12;
                long j12 = this.$shiftedMaxTimerValue - millisUntilFinished;
                v11 = this.this$0.ordersLiveData;
                list2 = this.this$0.orders;
                List<UnpaidOrderListVO.OrderVO> list3 = list2;
                long j13 = this.$diff;
                UnpaidOrderListWidgetViewModel unpaidOrderListWidgetViewModel = this.this$0;
                ArrayList arrayList = new ArrayList(C7714v.z(list3, 10));
                for (UnpaidOrderListVO.OrderVO orderVO : list3) {
                    if (j12 >= orderVO.getDisplayTimerValue() - j13) {
                        if (j12 >= orderVO.getTimeToPay() - j13) {
                            unpaidOrderListWidgetViewModel.filterTime = Long.valueOf(j12);
                            v12 = unpaidOrderListWidgetViewModel.orderTimerFinishedLiveData;
                            v12.setValue(Boolean.TRUE);
                        }
                        long timeToPay = (orderVO.getTimeToPay() - j13) - j12;
                        if (timeToPay >= 0) {
                            unpaidOrderListMapper = unpaidOrderListWidgetViewModel.mapper;
                            str = unpaidOrderListMapper.formattedTimerText(timeToPay);
                        } else {
                            str = "";
                        }
                        String str2 = str;
                        orderVO = UnpaidOrderListVO.OrderVO.copy$default(orderVO, 0L, false, BadgeDTO.copy$default(orderVO.getBadge(), g.c(orderVO.getBadge().getText(), " ", str2), null, null, null, null, null, null, null, null, null, null, null, 4094, null), str2, 0L, 0L, null, null, null, null, null, null, null, null, null, null, 65523, null);
                    }
                    arrayList.add(orderVO);
                }
                v11.setValue(arrayList);
            }
        };
        this.timer = countDownTimer2;
        countDownTimer2.start();
    }
}
