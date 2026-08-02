package ru.ozon.app.android.cart.domain.cartMode;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import BZ.e;
import BZ.f;
import He.b;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cart.common.domain.delegate.CartModeManager;
import ru.ozon.app.android.cart.common.domain.delegate.ResetCartModesReason;
import ru.ozon.app.android.cart.domain.cartMode.CommonCartModeResponse;
import ru.ozon.app.android.cart.domain.flags.CartProductSelectMode;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.utils.LazyUtilsKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R'\u00109\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010:\u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u00101\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u0010=R\u0016\u0010@\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?¨\u0006D"}, d2 = {"Lru/ozon/app/android/cart/domain/cartMode/CartModeManagerImpl;", "Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/app/android/cart/domain/cartMode/CartModeRepository;", "cartModeRepository", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/app/android/cart/domain/cartMode/CartModeRepository;LBZ/e;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "resetCartModesInternal", "()V", "resetCartModesSuspend", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "setCartViewMode", "saveCartMode", "Lru/ozon/app/android/cart/common/domain/delegate/ResetCartModesReason;", "reason", "resetCartModes", "(Lru/ozon/app/android/cart/common/domain/delegate/ResetCartModesReason;)V", "stopResetCartModes", "resetState", "", "enabledCartModes", "()Z", "enabledResetPerAction", "enableResetForPartialClose", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/app/android/cart/domain/cartMode/CartModeRepository;", "LBZ/e;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lxe/M;", "coroutineScope", "Lxe/M;", "LAe/w0;", "_processingResetAction", "LAe/w0;", "LAe/B0;", "processingResetAction", "LAe/B0;", "getProcessingResetAction", "()LAe/B0;", "Lxe/B0;", "networkRequestJob", "Lxe/B0;", "needResetCartModesOnAppStart", "Z", "", "", "", "defaultRequestParams$delegate", "LSc/j;", "getDefaultRequestParams", "()Ljava/util/Map;", "defaultRequestParams", "needSetCartViewMode", "getNeedSetCartViewMode", "setNeedSetCartViewMode", "(Z)V", "getCurrentMiniApp", "()Ljava/lang/String;", "currentMiniApp", "getCartModeFlag", "cartModeFlag", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartModeManagerImpl implements CartModeManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final w0<Boolean> _processingResetAction;

    @NotNull
    private final CartModeRepository cartModeRepository;

    @NotNull
    private final M coroutineScope;

    /* renamed from: defaultRequestParams$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultRequestParams;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private final e miniAppConfigHolder;
    private volatile boolean needResetCartModesOnAppStart;
    private volatile boolean needSetCartViewMode;
    private B0 networkRequestJob;

    @NotNull
    private final Ae.B0<Boolean> processingResetAction;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/domain/cartMode/CartModeManagerImpl$Companion;", "", "<init>", "()V", "PARTIAL_CLOSE", "", "PER_ACTION", "PARAM_BODY_NAME", "PARAM_BODY_PARAMS", "ACTION_NAME", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResetCartModesReason.values().length];
            try {
                iArr[ResetCartModesReason.CHANGE_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResetCartModesReason.OPEN_MINIAPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResetCartModesReason.CLOSE_MINIAPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ResetCartModesReason.START_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CartModeManagerImpl(@NotNull JsonSerializer jsonSerializer, @NotNull CartModeRepository cartModeRepository, @NotNull e miniAppConfigHolder, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(cartModeRepository, "cartModeRepository");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.jsonSerializer = jsonSerializer;
        this.cartModeRepository = cartModeRepository;
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.featureService = featureService;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(b.f10879b, (H0) b11);
        Intrinsics.checkNotNullExpressionValue("CartModeManagerImpl", "getSimpleName(...)");
        this.coroutineScope = N.a(d11.plus(new L("CartModeManagerImpl")).plus(new CartModeManagerImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        C0 b12 = E0.b(1, 0, null, 6);
        this._processingResetAction = b12;
        this.processingResetAction = C2399j.a(b12);
        this.needResetCartModesOnAppStart = true;
        this.defaultRequestParams = LazyUtilsKt.unsafeLazy(new CartModeManagerImpl$defaultRequestParams$2(this));
        this.needSetCartViewMode = true;
    }

    private final String getCartModeFlag() {
        return this.featureService.getStringKey(CartProductSelectMode.INSTANCE);
    }

    private final String getCurrentMiniApp() {
        if (MiniAppExtKt.isMain(this.miniAppConfigHolder)) {
            return null;
        }
        return f.a(this.miniAppConfigHolder);
    }

    private final void resetCartModesInternal() {
        this.networkRequestJob = C10727i.c(this.coroutineScope, null, null, new CartModeManagerImpl$resetCartModesInternal$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(3:18|19|20))(5:21|22|23|(1:29)|31))(1:34))(3:38|(1:40)|33)|35|(2:37|33)|23|(3:25|27|29)|31))|46|6|7|(0)(0)|35|(0)|23|(0)|31) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r9.emit(r2, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0049, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        r2 = r2._processingResetAction;
        r4 = java.lang.Boolean.FALSE;
        r0.L$0 = r9;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r2.emit(r4, r0) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        throw r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:22:0x0045, B:23:0x007a, B:25:0x0084, B:27:0x008a, B:29:0x0090, B:35:0x0069), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6, types: [ru.ozon.app.android.cart.domain.cartMode.CartModeManagerImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resetCartModesSuspend(d<? super Unit> dVar) {
        CartModeManagerImpl$resetCartModesSuspend$1 cartModeManagerImpl$resetCartModesSuspend$1;
        Object obj;
        a aVar;
        CartModeManagerImpl cartModeManagerImpl;
        CartModeManagerImpl cartModeManagerImpl2;
        CommonCartModeResponse commonCartModeResponse;
        CommonCartModeResponse.Success success;
        if (dVar instanceof CartModeManagerImpl$resetCartModesSuspend$1) {
            cartModeManagerImpl$resetCartModesSuspend$1 = (CartModeManagerImpl$resetCartModesSuspend$1) dVar;
            int i11 = cartModeManagerImpl$resetCartModesSuspend$1.label;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cartModeManagerImpl$resetCartModesSuspend$1.label = i11 - LinearLayoutManager.INVALID_OFFSET;
                obj = cartModeManagerImpl$resetCartModesSuspend$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                cartModeManagerImpl = cartModeManagerImpl$resetCartModesSuspend$1.label;
                if (cartModeManagerImpl != 0) {
                    s.b(obj);
                    setNeedSetCartViewMode(true);
                    w0<Boolean> w0Var = this._processingResetAction;
                    Boolean bool = Boolean.TRUE;
                    cartModeManagerImpl$resetCartModesSuspend$1.L$0 = this;
                    cartModeManagerImpl$resetCartModesSuspend$1.label = 1;
                    if (w0Var.emit(bool, cartModeManagerImpl$resetCartModesSuspend$1) != aVar) {
                        cartModeManagerImpl2 = this;
                    }
                    return aVar;
                }
                if (cartModeManagerImpl == 1) {
                    CartModeManagerImpl cartModeManagerImpl3 = (CartModeManagerImpl) cartModeManagerImpl$resetCartModesSuspend$1.L$0;
                    s.b(obj);
                    cartModeManagerImpl2 = cartModeManagerImpl3;
                } else {
                    if (cartModeManagerImpl != 2) {
                        if (cartModeManagerImpl == 3) {
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        if (cartModeManagerImpl != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) cartModeManagerImpl$resetCartModesSuspend$1.L$0;
                        s.b(obj);
                        throw th2;
                    }
                    CartModeManagerImpl cartModeManagerImpl4 = (CartModeManagerImpl) cartModeManagerImpl$resetCartModesSuspend$1.L$0;
                    s.b(obj);
                    cartModeManagerImpl = cartModeManagerImpl4;
                    commonCartModeResponse = (CommonCartModeResponse) ((ActionV2Response) obj).getData();
                    if (commonCartModeResponse != null && (success = commonCartModeResponse.getSuccess()) != null && success.getValue()) {
                        cartModeManagerImpl.setNeedSetCartViewMode(false);
                    }
                    w0<Boolean> w0Var2 = cartModeManagerImpl._processingResetAction;
                    Boolean bool2 = Boolean.FALSE;
                    cartModeManagerImpl$resetCartModesSuspend$1.L$0 = null;
                    cartModeManagerImpl$resetCartModesSuspend$1.label = 3;
                }
                CartModeRepository cartModeRepository = cartModeManagerImpl2.cartModeRepository;
                String currentMiniApp = cartModeManagerImpl2.getCurrentMiniApp();
                cartModeManagerImpl$resetCartModesSuspend$1.L$0 = cartModeManagerImpl2;
                cartModeManagerImpl$resetCartModesSuspend$1.label = 2;
                obj = cartModeRepository.resetCartModes(currentMiniApp, cartModeManagerImpl$resetCartModesSuspend$1);
                cartModeManagerImpl = cartModeManagerImpl2;
                if (obj == aVar) {
                    return aVar;
                }
                commonCartModeResponse = (CommonCartModeResponse) ((ActionV2Response) obj).getData();
                if (commonCartModeResponse != null) {
                    cartModeManagerImpl.setNeedSetCartViewMode(false);
                }
                w0<Boolean> w0Var22 = cartModeManagerImpl._processingResetAction;
                Boolean bool22 = Boolean.FALSE;
                cartModeManagerImpl$resetCartModesSuspend$1.L$0 = null;
                cartModeManagerImpl$resetCartModesSuspend$1.label = 3;
            }
        }
        cartModeManagerImpl$resetCartModesSuspend$1 = new CartModeManagerImpl$resetCartModesSuspend$1(this, dVar);
        obj = cartModeManagerImpl$resetCartModesSuspend$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        cartModeManagerImpl = cartModeManagerImpl$resetCartModesSuspend$1.label;
        if (cartModeManagerImpl != 0) {
        }
        CartModeRepository cartModeRepository2 = cartModeManagerImpl2.cartModeRepository;
        String currentMiniApp2 = cartModeManagerImpl2.getCurrentMiniApp();
        cartModeManagerImpl$resetCartModesSuspend$1.L$0 = cartModeManagerImpl2;
        cartModeManagerImpl$resetCartModesSuspend$1.label = 2;
        obj = cartModeRepository2.resetCartModes(currentMiniApp2, cartModeManagerImpl$resetCartModesSuspend$1);
        cartModeManagerImpl = cartModeManagerImpl2;
        if (obj == aVar) {
        }
        commonCartModeResponse = (CommonCartModeResponse) ((ActionV2Response) obj).getData();
        if (commonCartModeResponse != null) {
        }
        w0<Boolean> w0Var222 = cartModeManagerImpl._processingResetAction;
        Boolean bool222 = Boolean.FALSE;
        cartModeManagerImpl$resetCartModesSuspend$1.L$0 = null;
        cartModeManagerImpl$resetCartModesSuspend$1.label = 3;
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public boolean enableResetForPartialClose() {
        return Intrinsics.d(getCartModeFlag(), "partialClose");
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public boolean enabledCartModes() {
        return !h.K(getCartModeFlag());
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public boolean enabledResetPerAction() {
        return Intrinsics.d(getCartModeFlag(), "perAction");
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    @NotNull
    public Map<String, Object> getDefaultRequestParams() {
        return (Map) this.defaultRequestParams.getValue();
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public boolean getNeedSetCartViewMode() {
        return this.needSetCartViewMode;
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public void resetCartModes(@NotNull ResetCartModesReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i11 = WhenMappings.$EnumSwitchMapping$0[reason.ordinal()];
        if (i11 == 1) {
            if (enabledResetPerAction()) {
                resetCartModesInternal();
            }
        } else if (i11 == 2 || i11 == 3) {
            if (enabledCartModes()) {
                resetCartModesInternal();
            }
        } else {
            if (i11 != 4) {
                throw new o();
            }
            if (enabledCartModes() && this.needResetCartModesOnAppStart) {
                resetCartModesInternal();
                this.needResetCartModesOnAppStart = false;
            }
        }
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public void resetState() {
        setNeedSetCartViewMode(true);
        this.needResetCartModesOnAppStart = true;
        B0 b02 = this.networkRequestJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.networkRequestJob = null;
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public void saveCartMode() {
        setNeedSetCartViewMode(false);
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public void setCartViewMode() {
        setNeedSetCartViewMode(true);
    }

    public void setNeedSetCartViewMode(boolean z11) {
        this.needSetCartViewMode = z11;
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    public void stopResetCartModes() {
        B0 b02 = this.networkRequestJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartModeManager
    @NotNull
    public Ae.B0<Boolean> getProcessingResetAction() {
        return this.processingResetAction;
    }
}
