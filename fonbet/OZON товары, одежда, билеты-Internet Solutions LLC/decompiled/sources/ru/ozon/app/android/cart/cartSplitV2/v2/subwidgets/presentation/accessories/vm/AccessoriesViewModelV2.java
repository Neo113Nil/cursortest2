package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Be.m;
import Sc.s;
import Wc.a;
import android.os.Parcelable;
import androidx.lifecycle.C5429p;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import h3.C6788a;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesActionApi;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesActionApiKt;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesResponse;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesUtilsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ve.EnumC10311b;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002EFB%\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R&\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001a0/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R&\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001a0/0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020!0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00180=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R0\u0010C\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020(0Aj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020(`B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesActionApi;", "accessoriesActionApi", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "<init>", "(Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesActionApi;Ll10/b;)V", "", "launchPerformCommands", "()V", "launchScrollStorageCleaner", "launchComposerRefreshListener", "(Ll10/b;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command;", "command", "Lxe/B0;", "performCommand", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command;)Lxe/B0;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "widgetId", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;", "fetchAccessories", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;JLkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "getState$cart_prodGoogleAllVendorsRelease", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;J)LAe/h;", "getState", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "item", "", "validateTrackViewItem", "(Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;)Z", "validateTrackViewWidget", "(J)Z", "Landroid/os/Parcelable;", "scrollState", "saveScrollState", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Landroid/os/Parcelable;)V", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesActionApi;", "LAe/x0;", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command$Request;", "_state", "LAe/x0;", "LAe/w0;", "commandFlow", "LAe/w0;", "activeJobs", "Ljava/util/Map;", "lastUpdateUiTime", "J", "LAe/M0;", "state", "LAe/M0;", "", "trackedViewItems", "Ljava/util/Set;", "viewWidgetIsTracked", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scrollStateStore", "Ljava/util/HashMap;", "Companion", "Command", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccessoriesViewModelV2 extends w0 {

    @NotNull
    private final x0<Map<Command.Request, AccessoriesAsyncState>> _state;

    @NotNull
    private final AccessoriesActionApi accessoriesActionApi;

    @NotNull
    private volatile Map<AtomAction.ComposerAction, ? extends B0> activeJobs;

    @NotNull
    private final Ae.w0<Command> commandFlow;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;
    private volatile long lastUpdateUiTime;

    @NotNull
    private final HashMap<AtomAction.ComposerAction, Parcelable> scrollStateStore;

    @NotNull
    private final M0<Map<Command.Request, AccessoriesAsyncState>> state;

    @NotNull
    private final Set<SkuThinScrollVO.ItemVO> trackedViewItems;

    @NotNull
    private final Set<Long> viewWidgetIsTracked;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command;", "", "ClearState", "Request", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command$ClearState;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command$Request;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    interface Command {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command$ClearState;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command;", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ClearState implements Command {

            @NotNull
            public static final ClearState INSTANCE = new ClearState();

            private ClearState() {
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command$Request;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Command;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "widgetId", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "J", "getWidgetId", "()J", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Request implements Command {
            public static final int $stable = AtomAction.ComposerAction.$stable;
            private final AtomAction.ComposerAction action;
            private final long widgetId;

            public Request(AtomAction.ComposerAction composerAction, long j11) {
                this.action = composerAction;
                this.widgetId = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Request)) {
                    return false;
                }
                Request request = (Request) other;
                return Intrinsics.d(this.action, request.action) && this.widgetId == request.widgetId;
            }

            public final AtomAction.ComposerAction getAction() {
                return this.action;
            }

            public final long getWidgetId() {
                return this.widgetId;
            }

            public int hashCode() {
                AtomAction.ComposerAction composerAction = this.action;
                return Long.hashCode(this.widgetId) + ((composerAction == null ? 0 : composerAction.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return "Request(action=" + this.action + ", widgetId=" + this.widgetId + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2$Companion;", "", "<init>", "()V", "UI_UPDATE_DELAY_IN_MILLISECONDS", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AccessoriesViewModelV2(@NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull AccessoriesActionApi accessoriesActionApi, @NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(accessoriesActionApi, "accessoriesActionApi");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.dispatcherProvider = dispatcherProvider;
        this.accessoriesActionApi = accessoriesActionApi;
        x0<Map<Command.Request, AccessoriesAsyncState>> a11 = O0.a(U.c());
        this._state = a11;
        this.commandFlow = E0.b(0, 1, null, 5);
        this.activeJobs = U.c();
        m D11 = C2399j.D(a11, new AccessoriesViewModelV2$state$1(this, null));
        C6788a a12 = androidx.lifecycle.x0.a(this);
        int i11 = I0.f818a;
        this.state = C2399j.M(D11, a12, I0.a.c(), U.c());
        this.trackedViewItems = new LinkedHashSet();
        this.viewWidgetIsTracked = new LinkedHashSet();
        this.scrollStateStore = new HashMap<>();
        launchComposerRefreshListener(composerController);
        launchPerformCommands();
        launchScrollStorageCleaner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:27|28))(4:29|(2:31|(1:33))|18|19)|12|(2:14|(1:16)(2:22|(1:24)(1:25)))(1:26)|(1:21)|18|19))|35|6|7|(0)(0)|12|(0)(0)|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        r9 = new ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState.Hided(null, 1, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:11:0x0026, B:12:0x004c, B:14:0x0056, B:16:0x005d, B:22:0x006b, B:24:0x0071, B:25:0x0084, B:31:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAccessories(AtomAction.ComposerAction composerAction, long j11, d<? super AccessoriesAsyncState> dVar) {
        AccessoriesViewModelV2$fetchAccessories$1 accessoriesViewModelV2$fetchAccessories$1;
        int i11;
        Object hided;
        if (dVar instanceof AccessoriesViewModelV2$fetchAccessories$1) {
            accessoriesViewModelV2$fetchAccessories$1 = (AccessoriesViewModelV2$fetchAccessories$1) dVar;
            int i12 = accessoriesViewModelV2$fetchAccessories$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                accessoriesViewModelV2$fetchAccessories$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = accessoriesViewModelV2$fetchAccessories$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = accessoriesViewModelV2$fetchAccessories$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Map<String, String> params = composerAction.getParams();
                    if (params != null) {
                        AccessoriesActionApi accessoriesActionApi = this.accessoriesActionApi;
                        String actionName = composerAction.getActionName();
                        accessoriesViewModelV2$fetchAccessories$1.J$0 = j11;
                        accessoriesViewModelV2$fetchAccessories$1.label = 1;
                        obj = accessoriesActionApi.getAccessories(actionName, params, accessoriesViewModelV2$fetchAccessories$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return new AccessoriesAsyncState.Hided(null, 1, null);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = accessoriesViewModelV2$fetchAccessories$1.J$0;
                s.b(obj);
                AccessoriesResponse accessoriesResponse = (AccessoriesResponse) ((ActionV2Response) obj).getData();
                hided = accessoriesResponse == null ? accessoriesResponse.getShelf() != null ? new AccessoriesAsyncState.Success(AccessoriesActionApiKt.toVO(accessoriesResponse.getShelf(), j11), null, 2, null) : accessoriesResponse.getEmptyShelfTrackingInfo() != null ? new AccessoriesAsyncState.Hided(TrackingInfoMapperKt.toTokenizedEvent$default(accessoriesResponse.getEmptyShelfTrackingInfo(), new Long(j11), null, 2, null)) : new AccessoriesAsyncState.Hided(null, 1, null) : null;
                if (hided != null) {
                    return hided;
                }
                return new AccessoriesAsyncState.Hided(null, 1, null);
            }
        }
        accessoriesViewModelV2$fetchAccessories$1 = new AccessoriesViewModelV2$fetchAccessories$1(this, dVar);
        Object obj2 = accessoriesViewModelV2$fetchAccessories$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = accessoriesViewModelV2$fetchAccessories$1.label;
        if (i11 != 0) {
        }
        AccessoriesResponse accessoriesResponse2 = (AccessoriesResponse) ((ActionV2Response) obj2).getData();
        if (accessoriesResponse2 == null) {
        }
        if (hided != null) {
        }
        return new AccessoriesAsyncState.Hided(null, 1, null);
    }

    private final void launchComposerRefreshListener(InterfaceC7851b composerController) {
        final InterfaceC2395h a11 = C5429p.a(composerController.getEvents());
        C2399j.C(new C2408n0(new InterfaceC2395h<A00.a>() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$launchComposerRefreshListener$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$launchComposerRefreshListener$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$launchComposerRefreshListener$$inlined$filter$1$2", f = "AccessoriesViewModelV2.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$launchComposerRefreshListener$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (AccessoriesUtilsKt.isEventRefresh((A00.a) obj)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super A00.a> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AccessoriesViewModelV2$launchComposerRefreshListener$2(this, null)), androidx.lifecycle.x0.a(this));
    }

    private final void launchPerformCommands() {
        C2399j.C(C2399j.B(new C2408n0(this.commandFlow, new AccessoriesViewModelV2$launchPerformCommands$1(this, null)), this.dispatcherProvider.getDefault()), androidx.lifecycle.x0.a(this));
    }

    private final void launchScrollStorageCleaner() {
        Ae.w0<Command> w0Var = this.commandFlow;
        b.Companion companion = b.INSTANCE;
        C2399j.C(C2399j.B(new C2408n0(C2399j.n(w0Var, kotlin.time.c.g(1, EnumC10311b.MINUTES)), new AccessoriesViewModelV2$launchScrollStorageCleaner$1(this, null)), this.dispatcherProvider.getDefault()), androidx.lifecycle.x0.a(this));
    }

    private final B0 performCommand(Command command) {
        return C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AccessoriesViewModelV2$performCommand$1(this, command, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<AccessoriesAsyncState> getState$cart_prodGoogleAllVendorsRelease(final AtomAction.ComposerAction action, long widgetId) {
        final Command.Request request = new Command.Request(action, widgetId);
        performCommand(request);
        final M0<Map<Command.Request, AccessoriesAsyncState>> m02 = this.state;
        final InterfaceC2395h<AccessoriesAsyncState> interfaceC2395h = new InterfaceC2395h<AccessoriesAsyncState>() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$getState$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$getState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ AccessoriesViewModelV2.Command.Request $cmd$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$getState$$inlined$map$1$2", f = "AccessoriesViewModelV2.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$getState$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, AccessoriesViewModelV2.Command.Request request) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$cmd$inlined = request;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Object obj3 = ((Map) obj).get(this.$cmd$inlined);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(obj3, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super AccessoriesAsyncState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, request), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
        return new InterfaceC2395h<AccessoriesAsyncState>() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$getState$$inlined$map$2

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$getState$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ AtomAction.ComposerAction $action$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ AccessoriesViewModelV2 this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$getState$$inlined$map$2$2", f = "AccessoriesViewModelV2.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2$getState$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, AccessoriesViewModelV2 accessoriesViewModelV2, AtomAction.ComposerAction composerAction) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = accessoriesViewModelV2;
                    this.$action$inlined = composerAction;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    HashMap hashMap;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                AccessoriesAsyncState accessoriesAsyncState = (AccessoriesAsyncState) obj;
                                hashMap = this.this$0.scrollStateStore;
                                Parcelable parcelable = (Parcelable) hashMap.get(this.$action$inlined);
                                if ((accessoriesAsyncState instanceof AccessoriesAsyncState.Success) && parcelable != null) {
                                    accessoriesAsyncState = new AccessoriesAsyncState.Success(((AccessoriesAsyncState.Success) accessoriesAsyncState).getShelf(), parcelable);
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(accessoriesAsyncState, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super AccessoriesAsyncState> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this, action), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    public final void saveScrollState(@NotNull AtomAction.ComposerAction action, @NotNull Parcelable scrollState) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.scrollStateStore.put(action, scrollState);
    }

    public final boolean validateTrackViewItem(@NotNull SkuThinScrollVO.ItemVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.trackedViewItems.contains(item)) {
            return false;
        }
        this.trackedViewItems.add(item);
        return true;
    }

    public final boolean validateTrackViewWidget(long widgetId) {
        boolean contains = this.viewWidgetIsTracked.contains(Long.valueOf(widgetId));
        this.viewWidgetIsTracked.add(Long.valueOf(widgetId));
        return !contains;
    }
}
