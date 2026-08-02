package ru.ozon.app.android.payment.ui.fastPay.checkFastPay;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Sc.s;
import W10.c;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.fastPay.FastPayRepository;
import ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayEvent;
import ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayResponse;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.B0;
import xe.C10727i;
import xe.Y;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010#\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020&0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/payment/ui/fastPay/FastPayRepository;", "repository", "<init>", "(Lru/ozon/app/android/payment/ui/fastPay/FastPayRepository;)V", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse;", "response", "", "processCheckFastPay", "(Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse$PoolingDetails;", "details", "processPooling", "(Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayResponse$PoolingDetails;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "processAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "processError", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "actionName", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "body", "checkFastPay$payment_prodGoogleAllVendorsRelease", "(Ljava/lang/String;LW10/c;Ljava/util/Map;)V", "checkFastPay", "Lru/ozon/app/android/payment/ui/fastPay/FastPayRepository;", "Lxe/B0;", "checkFastPayJob", "Lxe/B0;", "lastTrackingData", "LW10/c;", "LAe/w0;", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayEvent;", "_eventsFlow", "LAe/w0;", "LAe/B0;", "eventsFlow", "LAe/B0;", "getEventsFlow", "()LAe/B0;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckFastPayViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Ae.w0<CheckFastPayEvent> _eventsFlow;
    private B0 checkFastPayJob;

    @NotNull
    private final Ae.B0<CheckFastPayEvent> eventsFlow;
    private c lastTrackingData;

    @NotNull
    private final FastPayRepository repository;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayViewModel$Companion;", "", "<init>", "()V", "DEFAULT_POOLING_DELAY", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CheckFastPayViewModel(@NotNull FastPayRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        C0 b11 = E0.b(0, 0, null, 7);
        this._eventsFlow = b11;
        this.eventsFlow = C2399j.a(b11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkFastPay$payment_prodGoogleAllVendorsRelease$default(CheckFastPayViewModel checkFastPayViewModel, String str, c cVar, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cVar = checkFastPayViewModel.lastTrackingData;
        }
        if ((i11 & 4) != 0) {
            map = null;
        }
        checkFastPayViewModel.checkFastPay$payment_prodGoogleAllVendorsRelease(str, cVar, map);
    }

    private final Object processAction(AtomActionDTO atomActionDTO, d<? super Unit> dVar) {
        Object emit = this._eventsFlow.emit(new CheckFastPayEvent.Action(atomActionDTO), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processCheckFastPay(CheckFastPayResponse checkFastPayResponse, d<? super Unit> dVar) {
        Object processPooling;
        if (checkFastPayResponse.getAction() == null) {
            return (checkFastPayResponse.getPoolingDetails() == null || (processPooling = processPooling(checkFastPayResponse.getPoolingDetails(), dVar)) != a.COROUTINE_SUSPENDED) ? Unit.f71690a : processPooling;
        }
        Object processAction = processAction(checkFastPayResponse.getAction(), dVar);
        return processAction == a.COROUTINE_SUSPENDED ? processAction : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processError(d<? super Unit> dVar) {
        Object emit = this._eventsFlow.emit(CheckFastPayEvent.Error.INSTANCE, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r2.processAction(r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r2.processError(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processPooling(CheckFastPayResponse.PoolingDetails poolingDetails, d<? super Unit> dVar) {
        CheckFastPayViewModel$processPooling$1 checkFastPayViewModel$processPooling$1;
        int i11;
        CheckFastPayViewModel checkFastPayViewModel;
        AtomActionDTO action;
        if (dVar instanceof CheckFastPayViewModel$processPooling$1) {
            checkFastPayViewModel$processPooling$1 = (CheckFastPayViewModel$processPooling$1) dVar;
            int i12 = checkFastPayViewModel$processPooling$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                checkFastPayViewModel$processPooling$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = checkFastPayViewModel$processPooling$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = checkFastPayViewModel$processPooling$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Long delay = poolingDetails.getDelay();
                    long longValue = delay != null ? delay.longValue() : 500L;
                    checkFastPayViewModel$processPooling$1.L$0 = this;
                    checkFastPayViewModel$processPooling$1.L$1 = poolingDetails;
                    checkFastPayViewModel$processPooling$1.label = 1;
                    if (Y.b(longValue, checkFastPayViewModel$processPooling$1) != aVar) {
                        checkFastPayViewModel = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                poolingDetails = (CheckFastPayResponse.PoolingDetails) checkFastPayViewModel$processPooling$1.L$1;
                checkFastPayViewModel = (CheckFastPayViewModel) checkFastPayViewModel$processPooling$1.L$0;
                s.b(obj);
                action = poolingDetails.getAction();
                if (action == null) {
                    checkFastPayViewModel$processPooling$1.L$0 = checkFastPayViewModel;
                    checkFastPayViewModel$processPooling$1.L$1 = null;
                    checkFastPayViewModel$processPooling$1.label = 2;
                } else {
                    checkFastPayViewModel$processPooling$1.L$0 = null;
                    checkFastPayViewModel$processPooling$1.L$1 = null;
                    checkFastPayViewModel$processPooling$1.label = 3;
                }
                return aVar;
            }
        }
        checkFastPayViewModel$processPooling$1 = new CheckFastPayViewModel$processPooling$1(this, dVar);
        Object obj2 = checkFastPayViewModel$processPooling$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = checkFastPayViewModel$processPooling$1.label;
        if (i11 != 0) {
        }
        action = poolingDetails.getAction();
        if (action == null) {
        }
        return aVar2;
    }

    public final void checkFastPay$payment_prodGoogleAllVendorsRelease(@NotNull String actionName, c trackingData, Map<String, String> body) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.lastTrackingData = trackingData;
        B0 b02 = this.checkFastPayJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.checkFastPayJob = C10727i.c(x0.a(this), null, null, new CheckFastPayViewModel$checkFastPay$1(this, actionName, trackingData, body, null), 3);
    }

    @NotNull
    public final Ae.B0<CheckFastPayEvent> getEventsFlow() {
        return this.eventsFlow;
    }
}
