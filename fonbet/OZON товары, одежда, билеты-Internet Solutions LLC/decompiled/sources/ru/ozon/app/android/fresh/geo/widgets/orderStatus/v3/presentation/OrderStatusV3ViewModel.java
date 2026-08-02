package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.data.OrderStatusV3DTO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020$0'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3ViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3Mapper;", "mapper", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/IntervalTimerDelegate;", "timerDelegate", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3Mapper;Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/IntervalTimerDelegate;)V", "", "refreshWidgetState", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/data/OrderStatusV3DTO;", "result", "onSuccessDataUpdated", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;)V", "onCleared", "()V", "timerStop", "timerStart", "Ll20/d;", "info", "setAsyncDataCache", "(Ll20/d;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3Mapper;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/IntervalTimerDelegate;", "", "asyncData", "Ljava/lang/String;", "widgetInfo", "Ll20/d;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO;", "_widgetState", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "widgetState", "Landroidx/lifecycle/P;", "getWidgetState", "()Landroidx/lifecycle/P;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusV3ViewModel implements InterfaceC6786a {

    @NotNull
    private final SingleLiveEvent<OrderStatusV3VO> _widgetState;
    private String asyncData;

    @NotNull
    private final OrderStatusV3Mapper mapper;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final IntervalTimerDelegate timerDelegate;
    private d widgetInfo;

    @NotNull
    private final P<OrderStatusV3VO> widgetState;

    public OrderStatusV3ViewModel(@NotNull ComposerAsyncWidgetRepository repository, @NotNull OrderStatusV3Mapper mapper, @NotNull IntervalTimerDelegate timerDelegate) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(timerDelegate, "timerDelegate");
        this.repository = repository;
        this.mapper = mapper;
        this.timerDelegate = timerDelegate;
        SingleLiveEvent<OrderStatusV3VO> singleLiveEvent = new SingleLiveEvent<>();
        this._widgetState = singleLiveEvent;
        this.widgetState = singleLiveEvent;
    }

    private final void onSuccessDataUpdated(ComposerAsyncWidgetResponse<OrderStatusV3DTO> result) {
        d dVar = this.widgetInfo;
        if (dVar == null) {
            return;
        }
        this._widgetState.postValue((OrderStatusV3VO) C7714v.M(this.mapper.invoke(result.getState(), dVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshWidgetState(kotlin.coroutines.d<? super Unit> dVar) {
        OrderStatusV3ViewModel$refreshWidgetState$1 orderStatusV3ViewModel$refreshWidgetState$1;
        int i11;
        Throwable th2;
        OrderStatusV3ViewModel orderStatusV3ViewModel;
        Object a11;
        if (dVar instanceof OrderStatusV3ViewModel$refreshWidgetState$1) {
            orderStatusV3ViewModel$refreshWidgetState$1 = (OrderStatusV3ViewModel$refreshWidgetState$1) dVar;
            int i12 = orderStatusV3ViewModel$refreshWidgetState$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                orderStatusV3ViewModel$refreshWidgetState$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                OrderStatusV3ViewModel$refreshWidgetState$1 orderStatusV3ViewModel$refreshWidgetState$12 = orderStatusV3ViewModel$refreshWidgetState$1;
                Object obj = orderStatusV3ViewModel$refreshWidgetState$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = orderStatusV3ViewModel$refreshWidgetState$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    String str = this.asyncData;
                    if (str != null) {
                        try {
                            r.Companion companion = r.INSTANCE;
                            ComposerAsyncWidgetRepository composerAsyncWidgetRepository = this.repository;
                            orderStatusV3ViewModel$refreshWidgetState$12.L$0 = this;
                            orderStatusV3ViewModel$refreshWidgetState$12.label = 1;
                            obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, OrderStatusV3DTO.class, null, orderStatusV3ViewModel$refreshWidgetState$12, 4, null);
                            if (obj == aVar) {
                                return aVar;
                            }
                            orderStatusV3ViewModel = this;
                        } catch (Throwable th3) {
                            th2 = th3;
                            orderStatusV3ViewModel = this;
                            r.Companion companion2 = r.INSTANCE;
                            a11 = s.a(th2);
                            if (!(a11 instanceof r.b)) {
                            }
                            return Unit.f71690a;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                orderStatusV3ViewModel = (OrderStatusV3ViewModel) orderStatusV3ViewModel$refreshWidgetState$12.L$0;
                try {
                    s.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    r.Companion companion22 = r.INSTANCE;
                    a11 = s.a(th2);
                    if (!(a11 instanceof r.b)) {
                    }
                    return Unit.f71690a;
                }
                a11 = (ComposerAsyncWidgetResponse) obj;
                r.Companion companion3 = r.INSTANCE;
                if (!(a11 instanceof r.b)) {
                    orderStatusV3ViewModel.onSuccessDataUpdated((ComposerAsyncWidgetResponse) a11);
                }
                return Unit.f71690a;
            }
        }
        orderStatusV3ViewModel$refreshWidgetState$1 = new OrderStatusV3ViewModel$refreshWidgetState$1(this, dVar);
        OrderStatusV3ViewModel$refreshWidgetState$1 orderStatusV3ViewModel$refreshWidgetState$122 = orderStatusV3ViewModel$refreshWidgetState$1;
        Object obj2 = orderStatusV3ViewModel$refreshWidgetState$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = orderStatusV3ViewModel$refreshWidgetState$122.label;
        if (i11 != 0) {
        }
        a11 = (ComposerAsyncWidgetResponse) obj2;
        r.Companion companion32 = r.INSTANCE;
        if (!(a11 instanceof r.b)) {
        }
        return Unit.f71690a;
    }

    @NotNull
    public final P<OrderStatusV3VO> getWidgetState() {
        return this.widgetState;
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        timerStop();
    }

    public final void setAsyncDataCache(@NotNull d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetInfo = info;
        this.asyncData = info.c().a();
    }

    public final void timerStart() {
        this.timerDelegate.start(new OrderStatusV3ViewModel$timerStart$1(this, null));
    }

    public final void timerStop() {
        this.timerDelegate.stop();
    }
}
