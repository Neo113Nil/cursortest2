package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import B0.C2454a;
import He.b;
import Sc.r;
import Sc.s;
import T00.m;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h3.C6788a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.SecureDealCurtainDTO;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.mapper.SecureDealCurtainAsyncUpdateMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainAsyncUpdateUiState;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001:B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u00020\n2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R(\u0010-\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001e\u00101\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealCurtainAsyncUpdateMapper;", "updateMapper", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealCurtainAsyncUpdateMapper;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "requestAsyncUpdate", "(Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "createExtraBody", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/util/Map;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/SecureDealCurtainDTO;", "response", "handleAsyncUpdate", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onCleared", "()V", "LAe/M0;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainAsyncUpdateUiState;", "uiStateFlow", "()LAe/M0;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "inputDelay", "setWidgetInfo", "(Ll20/d;Ljava/lang/Long;)V", "sum", "setDealSum", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "updateWidget", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealCurtainAsyncUpdateMapper;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "dealSum", "Ljava/lang/String;", "getDealSum", "()Ljava/lang/String;", "widgetInfo", "Ll20/d;", "Lxe/B0;", "debounceJob", "Lxe/B0;", "debounceDelayMillis", "J", "LAe/x0;", "LAe/x0;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealCurtainViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetRepository;
    private String dealSum;
    private long debounceDelayMillis;
    private B0 debounceJob;

    @NotNull
    private final x0<SecureDealCurtainAsyncUpdateUiState> uiStateFlow;

    @NotNull
    private final SecureDealCurtainAsyncUpdateMapper updateMapper;
    private d widgetInfo;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel$Companion;", "", "<init>", "()V", "KEY_SECURE_DEAL_SUM", "", "EXTRA_BODY_PARAMS", "KEY_AMOUNT", "DEFAULT_DEBOUNCE_MS", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SecureDealCurtainViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull SecureDealCurtainAsyncUpdateMapper updateMapper) {
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(updateMapper, "updateMapper");
        this.asyncWidgetRepository = asyncWidgetRepository;
        this.updateMapper = updateMapper;
        this.debounceDelayMillis = 500L;
        this.uiStateFlow = O0.a(null);
    }

    private final Map<String, String> createExtraBody(AtomAction action) {
        if (!(action instanceof AtomAction.Click)) {
            String str = this.dealSum;
            Map<String, String> b11 = str != null ? C2454a.b("secureDealValue", str) : null;
            return b11 == null ? U.c() : b11;
        }
        Map<String, String> params = ((AtomAction.Click) action).getParams();
        if (params == null) {
            params = U.c();
        }
        LinkedHashMap u11 = U.u(params);
        String str2 = this.dealSum;
        if (str2 != null) {
            u11.put("secureDealValue", str2);
        }
        return u11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAsyncUpdate(ComposerAsyncWidgetResponse<SecureDealCurtainDTO> composerAsyncWidgetResponse, kotlin.coroutines.d<? super Unit> dVar) {
        SecureDealCurtainViewModel$handleAsyncUpdate$1 secureDealCurtainViewModel$handleAsyncUpdate$1;
        int i11;
        SecureDealCurtainUpdate secureDealCurtainUpdate;
        if (dVar instanceof SecureDealCurtainViewModel$handleAsyncUpdate$1) {
            secureDealCurtainViewModel$handleAsyncUpdate$1 = (SecureDealCurtainViewModel$handleAsyncUpdate$1) dVar;
            int i12 = secureDealCurtainViewModel$handleAsyncUpdate$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                secureDealCurtainViewModel$handleAsyncUpdate$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = secureDealCurtainViewModel$handleAsyncUpdate$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = secureDealCurtainViewModel$handleAsyncUpdate$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    d dVar2 = this.widgetInfo;
                    if (dVar2 != null && (secureDealCurtainUpdate = (SecureDealCurtainUpdate) C7714v.M(this.updateMapper.invoke(composerAsyncWidgetResponse.getState(), dVar2))) != null) {
                        SecureDealCurtainAsyncUpdateUiState.Loaded loaded = new SecureDealCurtainAsyncUpdateUiState.Loaded(secureDealCurtainUpdate, composerAsyncWidgetResponse.getTrackingPayloads());
                        x0<SecureDealCurtainAsyncUpdateUiState> x0Var = this.uiStateFlow;
                        secureDealCurtainViewModel$handleAsyncUpdate$1.label = 1;
                        if (x0Var.emit(loaded, secureDealCurtainViewModel$handleAsyncUpdate$1) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        secureDealCurtainViewModel$handleAsyncUpdate$1 = new SecureDealCurtainViewModel$handleAsyncUpdate$1(this, dVar);
        Object obj2 = secureDealCurtainViewModel$handleAsyncUpdate$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = secureDealCurtainViewModel$handleAsyncUpdate$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|(1:(1:(1:(1:(4:13|14|15|16)(2:18|19))(5:20|21|(2:23|(3:25|(2:28|14)|27)(1:29))|15|16))(11:30|31|32|33|34|35|(1:37)|21|(0)|15|16))(4:42|43|44|45))(2:67|(2:80|81)(4:73|74|(1:76)|27))|46|47|48|49|50|51|52|(9:54|33|34|35|(0)|21|(0)|15|16)|27))|82|6|7|(0)(0)|46|47|48|49|50|51|52|(0)|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
    
        if (r2.handleAsyncUpdate((ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse) r15, r7) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
    
        r15 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestAsyncUpdate(AtomAction atomAction, kotlin.coroutines.d<? super Unit> dVar) {
        SecureDealCurtainViewModel$requestAsyncUpdate$1 secureDealCurtainViewModel$requestAsyncUpdate$1;
        Object obj;
        a aVar;
        int i11;
        m c11;
        String a11;
        SecureDealCurtainViewModel secureDealCurtainViewModel;
        SecureDealCurtainViewModel secureDealCurtainViewModel2;
        AtomAction atomAction2;
        SecureDealCurtainViewModel secureDealCurtainViewModel3;
        Object a12;
        SecureDealCurtainViewModel secureDealCurtainViewModel4;
        Object obj2;
        Throwable b11;
        Throwable th2;
        if (dVar instanceof SecureDealCurtainViewModel$requestAsyncUpdate$1) {
            secureDealCurtainViewModel$requestAsyncUpdate$1 = (SecureDealCurtainViewModel$requestAsyncUpdate$1) dVar;
            int i12 = secureDealCurtainViewModel$requestAsyncUpdate$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                secureDealCurtainViewModel$requestAsyncUpdate$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                SecureDealCurtainViewModel$requestAsyncUpdate$1 secureDealCurtainViewModel$requestAsyncUpdate$12 = secureDealCurtainViewModel$requestAsyncUpdate$1;
                obj = secureDealCurtainViewModel$requestAsyncUpdate$12.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = secureDealCurtainViewModel$requestAsyncUpdate$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    d dVar2 = this.widgetInfo;
                    if (dVar2 == null || (c11 = dVar2.c()) == null || (a11 = c11.a()) == null) {
                        return Unit.f71690a;
                    }
                    try {
                        r.Companion companion = r.INSTANCE;
                        x0<SecureDealCurtainAsyncUpdateUiState> x0Var = this.uiStateFlow;
                        SecureDealCurtainAsyncUpdateUiState.Loading loading = SecureDealCurtainAsyncUpdateUiState.Loading.INSTANCE;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.L$0 = this;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.L$1 = atomAction;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.L$2 = a11;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.L$3 = this;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.label = 1;
                        if (x0Var.emit(loading, secureDealCurtainViewModel$requestAsyncUpdate$12) != aVar) {
                            secureDealCurtainViewModel2 = this;
                            atomAction2 = atomAction;
                            secureDealCurtainViewModel3 = secureDealCurtainViewModel2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        secureDealCurtainViewModel = this;
                        r.Companion companion2 = r.INSTANCE;
                        a12 = s.a(th);
                        secureDealCurtainViewModel4 = secureDealCurtainViewModel;
                        obj2 = a12;
                        if (!(obj2 instanceof r.b)) {
                        }
                        b11 = r.b(obj2);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        secureDealCurtainViewModel = (SecureDealCurtainViewModel) secureDealCurtainViewModel$requestAsyncUpdate$12.L$0;
                        try {
                            s.b(obj);
                            a12 = (ComposerAsyncWidgetResponse) obj;
                            r.Companion companion3 = r.INSTANCE;
                        } catch (Throwable th4) {
                            th = th4;
                            r.Companion companion22 = r.INSTANCE;
                            a12 = s.a(th);
                            secureDealCurtainViewModel4 = secureDealCurtainViewModel;
                            obj2 = a12;
                            if (!(obj2 instanceof r.b)) {
                            }
                            b11 = r.b(obj2);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                        secureDealCurtainViewModel4 = secureDealCurtainViewModel;
                        obj2 = a12;
                        if (!(obj2 instanceof r.b)) {
                            secureDealCurtainViewModel$requestAsyncUpdate$12.L$0 = secureDealCurtainViewModel4;
                            secureDealCurtainViewModel$requestAsyncUpdate$12.L$1 = obj2;
                            secureDealCurtainViewModel$requestAsyncUpdate$12.L$2 = null;
                            secureDealCurtainViewModel$requestAsyncUpdate$12.L$3 = null;
                            secureDealCurtainViewModel$requestAsyncUpdate$12.label = 3;
                        }
                        b11 = r.b(obj2);
                        if (b11 != null) {
                        }
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) secureDealCurtainViewModel$requestAsyncUpdate$12.L$1;
                        s.b(obj);
                        Lm0.a.f17149a.e(th2);
                        return Unit.f71690a;
                    }
                    obj2 = secureDealCurtainViewModel$requestAsyncUpdate$12.L$1;
                    secureDealCurtainViewModel4 = (SecureDealCurtainViewModel) secureDealCurtainViewModel$requestAsyncUpdate$12.L$0;
                    s.b(obj);
                    b11 = r.b(obj2);
                    if (b11 != null) {
                        if (b11 instanceof CancellationException) {
                            throw b11;
                        }
                        x0<SecureDealCurtainAsyncUpdateUiState> x0Var2 = secureDealCurtainViewModel4.uiStateFlow;
                        SecureDealCurtainAsyncUpdateUiState.Error error = SecureDealCurtainAsyncUpdateUiState.Error.INSTANCE;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.L$0 = obj2;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.L$1 = b11;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.L$2 = null;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.L$3 = null;
                        secureDealCurtainViewModel$requestAsyncUpdate$12.label = 4;
                        if (x0Var2.emit(error, secureDealCurtainViewModel$requestAsyncUpdate$12) != aVar) {
                            th2 = b11;
                            Lm0.a.f17149a.e(th2);
                        }
                        return aVar;
                    }
                    return Unit.f71690a;
                }
                secureDealCurtainViewModel3 = (SecureDealCurtainViewModel) secureDealCurtainViewModel$requestAsyncUpdate$12.L$3;
                a11 = (String) secureDealCurtainViewModel$requestAsyncUpdate$12.L$2;
                atomAction2 = (AtomAction) secureDealCurtainViewModel$requestAsyncUpdate$12.L$1;
                SecureDealCurtainViewModel secureDealCurtainViewModel5 = (SecureDealCurtainViewModel) secureDealCurtainViewModel$requestAsyncUpdate$12.L$0;
                try {
                    s.b(obj);
                    secureDealCurtainViewModel2 = secureDealCurtainViewModel5;
                } catch (Throwable th5) {
                    th = th5;
                    secureDealCurtainViewModel = secureDealCurtainViewModel5;
                    r.Companion companion222 = r.INSTANCE;
                    a12 = s.a(th);
                    secureDealCurtainViewModel4 = secureDealCurtainViewModel;
                    obj2 = a12;
                    if (!(obj2 instanceof r.b)) {
                    }
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                ComposerAsyncWidgetRepository composerAsyncWidgetRepository = secureDealCurtainViewModel3.asyncWidgetRepository;
                Map i13 = U.i(new Pair("extraBody", secureDealCurtainViewModel3.createExtraBody(atomAction2)));
                secureDealCurtainViewModel$requestAsyncUpdate$12.L$0 = secureDealCurtainViewModel2;
                secureDealCurtainViewModel$requestAsyncUpdate$12.L$1 = null;
                secureDealCurtainViewModel$requestAsyncUpdate$12.L$2 = null;
                secureDealCurtainViewModel$requestAsyncUpdate$12.L$3 = null;
                secureDealCurtainViewModel$requestAsyncUpdate$12.label = 2;
                obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, a11, i13, SecureDealCurtainDTO.class, null, secureDealCurtainViewModel$requestAsyncUpdate$12, 8, null);
                if (obj != aVar) {
                    secureDealCurtainViewModel = secureDealCurtainViewModel2;
                    a12 = (ComposerAsyncWidgetResponse) obj;
                    r.Companion companion32 = r.INSTANCE;
                    secureDealCurtainViewModel4 = secureDealCurtainViewModel;
                    obj2 = a12;
                    if (!(obj2 instanceof r.b)) {
                    }
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        secureDealCurtainViewModel$requestAsyncUpdate$1 = new SecureDealCurtainViewModel$requestAsyncUpdate$1(this, dVar);
        SecureDealCurtainViewModel$requestAsyncUpdate$1 secureDealCurtainViewModel$requestAsyncUpdate$122 = secureDealCurtainViewModel$requestAsyncUpdate$1;
        obj = secureDealCurtainViewModel$requestAsyncUpdate$122.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = secureDealCurtainViewModel$requestAsyncUpdate$122.label;
        if (i11 != 0) {
        }
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository2 = secureDealCurtainViewModel3.asyncWidgetRepository;
        Map i132 = U.i(new Pair("extraBody", secureDealCurtainViewModel3.createExtraBody(atomAction2)));
        secureDealCurtainViewModel$requestAsyncUpdate$122.L$0 = secureDealCurtainViewModel2;
        secureDealCurtainViewModel$requestAsyncUpdate$122.L$1 = null;
        secureDealCurtainViewModel$requestAsyncUpdate$122.L$2 = null;
        secureDealCurtainViewModel$requestAsyncUpdate$122.L$3 = null;
        secureDealCurtainViewModel$requestAsyncUpdate$122.label = 2;
        obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository2, a11, i132, SecureDealCurtainDTO.class, null, secureDealCurtainViewModel$requestAsyncUpdate$122, 8, null);
        if (obj != aVar) {
        }
        return aVar;
    }

    public final String getDealSum() {
        return this.dealSum;
    }

    @NotNull
    public final AtomAction handleAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction)) {
            return action;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        Map<String, String> params = composerAction.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        String str = this.dealSum;
        if (str != null) {
            u11.put("amount", str);
        }
        return AtomAction.ComposerAction.copy$default(composerAction, null, null, u11, null, null, 27, null);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        B0 b02 = this.debounceJob;
        if (b02 != null) {
            b02.j(null);
        }
        super.onCleared();
    }

    public final void setDealSum(@NotNull String sum, AtomAction action) {
        Intrinsics.checkNotNullParameter(sum, "sum");
        StringBuilder sb2 = new StringBuilder();
        int length = sum.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = sum.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        if (Intrinsics.d(sb3, this.dealSum)) {
            return;
        }
        this.dealSum = sb3;
        if (action != null) {
            B0 b02 = this.debounceJob;
            if (b02 != null) {
                b02.j(null);
            }
            C6788a a11 = androidx.lifecycle.x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            this.debounceJob = C10727i.c(a11, b.f10879b, null, new SecureDealCurtainViewModel$setDealSum$1(this, action, null), 2);
        }
    }

    public final void setWidgetInfo(@NotNull d info, Long inputDelay) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.widgetInfo = info;
        this.debounceDelayMillis = inputDelay != null ? inputDelay.longValue() : 500L;
    }

    @NotNull
    public final M0<SecureDealCurtainAsyncUpdateUiState> uiStateFlow() {
        return C2399j.b(this.uiStateFlow);
    }

    public final void updateWidget(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new SecureDealCurtainViewModel$updateWidget$1(this, action, null), 2);
    }
}
