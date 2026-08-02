package ru.ozon.app.android.marketing.widgets.highlightsWrapper.core;

import Ae.E0;
import Ae.w0;
import DM.i;
import De.C2862e;
import De.s;
import GH.a;
import GH.b;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u001f\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J \u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\u0006\u0010\u0015\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\nH\u0096@¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\"2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManagerImpl;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperStateManager;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetApi", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperParser;", "parser", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperParser;)V", "", "widgetAsyncData", "", "startListenCart", "(Ljava/lang/String;)V", "clearScope", "()V", "Lxe/M;", "createScope", "()Lxe/M;", "observeCart", "asyncData", "loadAsyncData", "LSc/r;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperDTO;", "asyncResponse", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;", "parseAsyncResponse", "(Ljava/lang/Object;)Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;", "disposeCart", "requestAsync-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "requestAsync", "requestWidgetState", "LAe/B0;", "listenState", "(Ljava/lang/String;)LAe/B0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/core/HighlightsWrapperParser;", "LAe/w0;", "widgetsState", "LAe/w0;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "scope", "Lxe/M;", "Lnc/b;", "disposable", "Lnc/b;", "", "previousSubscribers", "I", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightsWrapperStateManagerImpl implements HighlightsWrapperStateManager {

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetApi;

    @NotNull
    private final CartService cartService;
    private InterfaceC8487b disposable;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final HighlightsWrapperParser parser;
    private int previousSubscribers;
    private M scope;

    @NotNull
    private final w0<HighlightsWrapperAsyncState> widgetsState;

    public HighlightsWrapperStateManagerImpl(@NotNull CartService cartService, @NotNull ComposerAsyncWidgetRepository asyncWidgetApi, @NotNull HighlightsWrapperParser parser) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(asyncWidgetApi, "asyncWidgetApi");
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.cartService = cartService;
        this.asyncWidgetApi = asyncWidgetApi;
        this.parser = parser;
        this.widgetsState = E0.b(0, 0, null, 7);
        this.exceptionHandler = new HighlightsWrapperStateManagerImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearScope() {
        M m11 = this.scope;
        if (m11 != null) {
            N.c(m11, null);
        }
        this.scope = null;
    }

    private final M createScope() {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11).plus(this.exceptionHandler));
        this.scope = a11;
        return a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeCart() {
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAsyncData(String asyncData) {
        M m11;
        if (asyncData == null || (m11 = this.scope) == null) {
            return;
        }
        C10727i.c(m11, null, null, new HighlightsWrapperStateManagerImpl$loadAsyncData$1(this, asyncData, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeCart(String widgetAsyncData) {
        if (this.widgetsState.getSubscriptionCount().getValue().intValue() != this.previousSubscribers) {
            loadAsyncData(widgetAsyncData);
        }
        int i11 = 2;
        this.disposable = this.cartService.observeCartState(true).filter(new a(HighlightsWrapperStateManagerImpl$observeCart$1.INSTANCE, i11)).subscribe(new i(new HighlightsWrapperStateManagerImpl$observeCart$2(this, widgetAsyncData), 4), new b(new HighlightsWrapperStateManagerImpl$observeCart$3(Lm0.a.f17149a), i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeCart$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HighlightsWrapperAsyncState parseAsyncResponse(Object asyncResponse) {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = this.parser.populateDTO((HighlightsWrapperDTO) (asyncResponse instanceof r.b ? null : asyncResponse));
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        HighlightsWrapperDTO highlightsWrapperDTO = (HighlightsWrapperDTO) (a11 instanceof r.b ? null : a11);
        return r.b(asyncResponse) instanceof Q00.a ? HighlightsWrapperAsyncState.WidgetSkippedException.INSTANCE : asyncResponse instanceof r.b ? HighlightsWrapperAsyncState.NetworkException.INSTANCE : highlightsWrapperDTO != null ? new HighlightsWrapperAsyncState.Success(highlightsWrapperDTO) : HighlightsWrapperAsyncState.ParseException.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* renamed from: requestAsync-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m791requestAsyncgIAlus(String str, d<? super r<HighlightsWrapperDTO>> dVar) {
        HighlightsWrapperStateManagerImpl$requestAsync$1 highlightsWrapperStateManagerImpl$requestAsync$1;
        int i11;
        try {
            if (dVar instanceof HighlightsWrapperStateManagerImpl$requestAsync$1) {
                highlightsWrapperStateManagerImpl$requestAsync$1 = (HighlightsWrapperStateManagerImpl$requestAsync$1) dVar;
                int i12 = highlightsWrapperStateManagerImpl$requestAsync$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    highlightsWrapperStateManagerImpl$requestAsync$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    HighlightsWrapperStateManagerImpl$requestAsync$1 highlightsWrapperStateManagerImpl$requestAsync$12 = highlightsWrapperStateManagerImpl$requestAsync$1;
                    Object obj = highlightsWrapperStateManagerImpl$requestAsync$12.result;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = highlightsWrapperStateManagerImpl$requestAsync$12.label;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        ComposerAsyncWidgetRepository composerAsyncWidgetRepository = this.asyncWidgetApi;
                        highlightsWrapperStateManagerImpl$requestAsync$12.label = 1;
                        obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, HighlightsWrapperDTO.class, null, highlightsWrapperStateManagerImpl$requestAsync$12, 4, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    HighlightsWrapperDTO highlightsWrapperDTO = (HighlightsWrapperDTO) ((ComposerAsyncWidgetResponse) obj).getState();
                    r.Companion companion2 = r.INSTANCE;
                    return highlightsWrapperDTO;
                }
            }
            if (i11 != 0) {
            }
            HighlightsWrapperDTO highlightsWrapperDTO2 = (HighlightsWrapperDTO) ((ComposerAsyncWidgetResponse) obj).getState();
            r.Companion companion22 = r.INSTANCE;
            return highlightsWrapperDTO2;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            return Sc.s.a(th2);
        }
        highlightsWrapperStateManagerImpl$requestAsync$1 = new HighlightsWrapperStateManagerImpl$requestAsync$1(this, dVar);
        HighlightsWrapperStateManagerImpl$requestAsync$1 highlightsWrapperStateManagerImpl$requestAsync$122 = highlightsWrapperStateManagerImpl$requestAsync$1;
        Object obj2 = highlightsWrapperStateManagerImpl$requestAsync$122.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = highlightsWrapperStateManagerImpl$requestAsync$122.label;
    }

    private final void startListenCart(String widgetAsyncData) {
        if (this.widgetsState.getSubscriptionCount().getValue().intValue() != 0) {
            return;
        }
        clearScope();
        C10727i.c(createScope(), null, null, new HighlightsWrapperStateManagerImpl$startListenCart$1(this, widgetAsyncData, null), 3);
    }

    @Override // ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager
    @NotNull
    public Ae.B0<HighlightsWrapperAsyncState> listenState(String widgetAsyncData) {
        startListenCart(widgetAsyncData);
        w0<HighlightsWrapperAsyncState> w0Var = this.widgetsState;
        startListenCart(widgetAsyncData);
        return w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperStateManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestWidgetState(@NotNull String str, @NotNull d<? super HighlightsWrapperAsyncState> dVar) {
        HighlightsWrapperStateManagerImpl$requestWidgetState$1 highlightsWrapperStateManagerImpl$requestWidgetState$1;
        int i11;
        Object m791requestAsyncgIAlus;
        HighlightsWrapperStateManagerImpl highlightsWrapperStateManagerImpl;
        if (dVar instanceof HighlightsWrapperStateManagerImpl$requestWidgetState$1) {
            highlightsWrapperStateManagerImpl$requestWidgetState$1 = (HighlightsWrapperStateManagerImpl$requestWidgetState$1) dVar;
            int i12 = highlightsWrapperStateManagerImpl$requestWidgetState$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                highlightsWrapperStateManagerImpl$requestWidgetState$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = highlightsWrapperStateManagerImpl$requestWidgetState$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = highlightsWrapperStateManagerImpl$requestWidgetState$1.label;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    highlightsWrapperStateManagerImpl$requestWidgetState$1.L$0 = this;
                    highlightsWrapperStateManagerImpl$requestWidgetState$1.label = 1;
                    m791requestAsyncgIAlus = m791requestAsyncgIAlus(str, highlightsWrapperStateManagerImpl$requestWidgetState$1);
                    if (m791requestAsyncgIAlus == aVar) {
                        return aVar;
                    }
                    highlightsWrapperStateManagerImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    highlightsWrapperStateManagerImpl = (HighlightsWrapperStateManagerImpl) highlightsWrapperStateManagerImpl$requestWidgetState$1.L$0;
                    Sc.s.b(obj);
                    m791requestAsyncgIAlus = ((r) obj).getF26106a();
                }
                return highlightsWrapperStateManagerImpl.parseAsyncResponse(m791requestAsyncgIAlus);
            }
        }
        highlightsWrapperStateManagerImpl$requestWidgetState$1 = new HighlightsWrapperStateManagerImpl$requestWidgetState$1(this, dVar);
        Object obj2 = highlightsWrapperStateManagerImpl$requestWidgetState$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = highlightsWrapperStateManagerImpl$requestWidgetState$1.label;
        if (i11 != 0) {
        }
        return highlightsWrapperStateManagerImpl.parseAsyncResponse(m791requestAsyncgIAlus);
    }
}
