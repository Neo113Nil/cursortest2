package ru.ozon.app.android.cart.domain.async;

import A00.a;
import A00.d;
import Ae.C0;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import K00.i;
import P00.k;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i10.k;
import j10.InterfaceC7238a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncUpdateTag;
import ru.ozon.app.android.cart.domain.async.ModifyItemsRequest;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.composer.ui.widget.l;
import ve.EnumC10311b;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;
import z00.f;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 O2\u00020\u0001:\u0002OPBI\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u001a\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u0013H\u0082@¢\u0006\u0004\b!\u0010\"J1\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00120#H\u0002¢\u0006\u0004\b$\u0010%J,\u0010'\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00132\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.J)\u0010/\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b/\u00100J\u0015\u00104\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0015¢\u0006\u0004\b2\u00103J\r\u00105\u001a\u00020\u0017¢\u0006\u0004\b5\u00106R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00107R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u00103R\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020,0J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bK\u0010MR\u0014\u0010N\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010<¨\u0006Q"}, d2 = {"Lru/ozon/app/android/cart/domain/async/AsyncCartService;", "", "LK00/i;", "Lru/ozon/composer/ui/widget/l;", "repository", "Lj10/a;", "composerStore", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lxe/M;", "viewModelCoroutineScope", "<init>", "(LK00/i;Lj10/a;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lxe/M;)V", "", "", "params", "Lkotlin/time/b;", "debounce", "", "internalPost-HG0u8IE", "(Ljava/util/Map;J)V", "internalPost", "Lru/ozon/app/android/cart/domain/async/UiAction;", "uiAction", "Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;", "waitNewInputsAndFetchBatch", "(Lru/ozon/app/android/cart/domain/async/UiAction;Lkotlin/coroutines/d;)Ljava/lang/Object;", ImagesContract.URL, "fetch", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "toRequestBody", "(Ljava/util/List;)Ljava/util/Map;", "requestBody", "doRequest", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "fetchData", "updateWidgets", "(Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "sendToScreen", "(Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;)Z", "post", "(Ljava/lang/String;Ljava/util/Map;)V", "uiDelayTime", "showProcessing-LRDsOJo", "(J)V", "showProcessing", "executePendingRequestsImmediately", "()V", "LK00/i;", "Lj10/a;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lxe/M;", "Lru/ozon/app/android/cart/domain/async/PendingRequests;", "pendingRequests", "Lru/ozon/app/android/cart/domain/async/PendingRequests;", "LAe/w0;", "paramsToModify", "LAe/w0;", "currentUrl", "Ljava/lang/String;", "debounceTime", "J", "getDebounceTime-UwyO8pc", "()J", "setDebounceTime-LRDsOJo", "LAe/h;", "isProcessing", "LAe/h;", "()LAe/h;", "internalCoroutineScope", "Companion", "FetchData", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AsyncCartService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long DEFAULT_DEBOUNCE_TIME;

    @NotNull
    private final InterfaceC7238a<l> composerStore;
    private String currentUrl;
    private long debounceTime;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final M internalCoroutineScope;

    @NotNull
    private final InterfaceC2395h<Boolean> isProcessing;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private final w0<UiAction> paramsToModify;

    @NotNull
    private final PendingRequests pendingRequests;

    @NotNull
    private final i<l> repository;

    @NotNull
    private final M viewModelCoroutineScope;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.domain.async.AsyncCartService$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<UiAction, d<? super FetchData>, Object> {
        AnonymousClass2(Object obj) {
            super(2, obj, AsyncCartService.class, "waitNewInputsAndFetchBatch", "waitNewInputsAndFetchBatch(Lru/ozon/app/android/cart/domain/async/UiAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiAction uiAction, d<? super FetchData> dVar) {
            return ((AsyncCartService) this.receiver).waitNewInputsAndFetchBatch(uiAction, dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.domain.async.AsyncCartService$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function2<FetchData, d<? super Unit>, Object> {
        AnonymousClass3(Object obj) {
            super(2, obj, AsyncCartService.class, "updateWidgets", "updateWidgets(Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FetchData fetchData, d<? super Unit> dVar) {
            return ((AsyncCartService) this.receiver).updateWidgets(fetchData, dVar);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/domain/async/AsyncCartService$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "LK00/i;", "Lru/ozon/composer/ui/widget/l;", "repository", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lxe/M;", "viewModelCoroutineScope", "Lru/ozon/app/android/cart/domain/async/AsyncCartService;", "create", "(Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;Lru/ozon/app/android/network/di/NetworkComponentApi;LK00/i;Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;Lxe/M;)Lru/ozon/app/android/cart/domain/async/AsyncCartService;", "", "CUTOFF", "Ljava/lang/String;", "HIGHER_PRIORITY_CUTOFF", "PARAMS_KEY", "Lkotlin/time/b;", "DEFAULT_DEBOUNCE_TIME", "J", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AsyncCartService create(@NotNull RetainComposerComponentApi retainComposerComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull i<l> repository, @NotNull CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, @NotNull M viewModelCoroutineScope) {
            Intrinsics.checkNotNullParameter(retainComposerComponentApi, "retainComposerComponentApi");
            Intrinsics.checkNotNullParameter(networkComponentApi, "networkComponentApi");
            Intrinsics.checkNotNullParameter(repository, "repository");
            Intrinsics.checkNotNullParameter(coroutineDispatchersComponentApi, "coroutineDispatchersComponentApi");
            Intrinsics.checkNotNullParameter(viewModelCoroutineScope, "viewModelCoroutineScope");
            return new AsyncCartService(repository, retainComposerComponentApi.getComposerStore(), networkComponentApi.getJsonSerializer(), networkComponentApi.getJsonDeserializer(), coroutineDispatchersComponentApi.getDispatcherProvider(), viewModelCoroutineScope, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/domain/async/AsyncCartService$FetchData;", "", "LP00/k;", "Lru/ozon/composer/ui/widget/l;", "response", "<init>", "(LP00/k;)V", "LP00/k;", "getResponse", "()LP00/k;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FetchData {

        @NotNull
        private final k<l> response;

        public FetchData(@NotNull k<l> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
        }

        @NotNull
        public final k<l> getResponse() {
            return this.response;
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        DEFAULT_DEBOUNCE_TIME = c.g(700, EnumC10311b.MILLISECONDS);
    }

    public /* synthetic */ AsyncCartService(i iVar, InterfaceC7238a interfaceC7238a, JsonSerializer jsonSerializer, JsonParser jsonParser, CoroutineDispatcherProvider coroutineDispatcherProvider, M m11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, interfaceC7238a, jsonSerializer, jsonParser, coroutineDispatcherProvider, m11);
    }

    private final Object doRequest(String str, Map<String, String> map, d<? super FetchData> dVar) {
        return C10727i.f(this.dispatcherProvider.getIO(), new AsyncCartService$doRequest$2(str, map, this, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(3:13|14|(2:16|17)(1:19))(2:20|21))(4:22|23|24|25))(3:26|27|28))(3:29|30|31))(5:49|50|51|(1:53)|40)|32|(1:34)(1:44)|35|(3:37|(1:39)|17)(2:41|(3:43|24|25))|40))|59|6|7|(0)(0)|32|(0)(0)|35|(0)(0)|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004c, code lost:
    
        r6 = r10;
        r10 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:31:0x0064, B:32:0x007e, B:35:0x0089, B:37:0x008d, B:41:0x009e), top: B:30:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:31:0x0064, B:32:0x007e, B:35:0x0089, B:37:0x008d, B:41:0x009e), top: B:30:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(String str, d<? super FetchData> dVar) {
        AsyncCartService$fetch$1 asyncCartService$fetch$1;
        Object obj;
        int i11;
        AsyncCartService asyncCartService;
        Throwable th2;
        PendingRequests pendingRequests;
        AsyncCartService asyncCartService2;
        String str2;
        AsyncCartService asyncCartService3;
        Map<String, String> map;
        if (dVar instanceof AsyncCartService$fetch$1) {
            asyncCartService$fetch$1 = (AsyncCartService$fetch$1) dVar;
            int i12 = asyncCartService$fetch$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                asyncCartService$fetch$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = asyncCartService$fetch$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = asyncCartService$fetch$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        asyncCartService$fetch$1.L$0 = this;
                        asyncCartService$fetch$1.L$1 = this;
                        asyncCartService$fetch$1.L$2 = str;
                        asyncCartService$fetch$1.label = 1;
                        obj = fetch$getPendingRequests(this, asyncCartService$fetch$1);
                        if (obj != aVar) {
                            AsyncCartService asyncCartService4 = this;
                            asyncCartService = asyncCartService4;
                            asyncCartService3 = asyncCartService4;
                            str2 = str;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        asyncCartService = this;
                        pendingRequests = asyncCartService.pendingRequests;
                        asyncCartService$fetch$1.L$0 = asyncCartService;
                        asyncCartService$fetch$1.L$1 = th2;
                        asyncCartService$fetch$1.L$2 = null;
                        asyncCartService$fetch$1.label = 4;
                        if (pendingRequests.resetInProgress(asyncCartService$fetch$1) != aVar) {
                            asyncCartService2 = asyncCartService;
                            if (!(th2 instanceof CancellationException)) {
                            }
                        }
                        return aVar;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        return null;
                    }
                    if (i11 == 3) {
                        s.b(obj);
                        return (FetchData) obj;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) asyncCartService$fetch$1.L$1;
                    asyncCartService2 = (AsyncCartService) asyncCartService$fetch$1.L$0;
                    s.b(obj);
                    if (!(th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    Lm0.a.f17149a.e(th2);
                    asyncCartService2.composerStore.c(a.u.c.f253a);
                    return null;
                }
                String str3 = (String) asyncCartService$fetch$1.L$2;
                AsyncCartService asyncCartService5 = (AsyncCartService) asyncCartService$fetch$1.L$1;
                asyncCartService = (AsyncCartService) asyncCartService$fetch$1.L$0;
                try {
                    s.b(obj);
                    asyncCartService3 = asyncCartService5;
                    str2 = str3;
                } catch (Throwable th4) {
                    th2 = th4;
                    pendingRequests = asyncCartService.pendingRequests;
                    asyncCartService$fetch$1.L$0 = asyncCartService;
                    asyncCartService$fetch$1.L$1 = th2;
                    asyncCartService$fetch$1.L$2 = null;
                    asyncCartService$fetch$1.label = 4;
                    if (pendingRequests.resetInProgress(asyncCartService$fetch$1) != aVar) {
                    }
                    return aVar;
                }
                if (!((Map) obj).isEmpty()) {
                    obj = null;
                }
                map = (Map) obj;
                if (map != null) {
                    PendingRequests pendingRequests2 = asyncCartService.pendingRequests;
                    asyncCartService$fetch$1.L$0 = asyncCartService;
                    asyncCartService$fetch$1.L$1 = null;
                    asyncCartService$fetch$1.L$2 = null;
                    asyncCartService$fetch$1.label = 2;
                    if (pendingRequests2.resetInProgress(asyncCartService$fetch$1) == aVar) {
                    }
                    return null;
                }
                asyncCartService$fetch$1.L$0 = asyncCartService;
                asyncCartService$fetch$1.L$1 = null;
                asyncCartService$fetch$1.L$2 = null;
                asyncCartService$fetch$1.label = 3;
                obj = asyncCartService3.doRequest(str2, map, asyncCartService$fetch$1);
                if (obj != aVar) {
                    return (FetchData) obj;
                }
                return aVar;
            }
        }
        asyncCartService$fetch$1 = new AsyncCartService$fetch$1(this, dVar);
        obj = asyncCartService$fetch$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = asyncCartService$fetch$1.label;
        if (i11 != 0) {
        }
        if (!((Map) obj).isEmpty()) {
        }
        map = (Map) obj;
        if (map != null) {
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fetch$getPendingRequests(AsyncCartService asyncCartService, d<? super Map<String, String>> dVar) {
        AsyncCartService$fetch$getPendingRequests$1 asyncCartService$fetch$getPendingRequests$1;
        int i11;
        if (dVar instanceof AsyncCartService$fetch$getPendingRequests$1) {
            asyncCartService$fetch$getPendingRequests$1 = (AsyncCartService$fetch$getPendingRequests$1) dVar;
            int i12 = asyncCartService$fetch$getPendingRequests$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                asyncCartService$fetch$getPendingRequests$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = asyncCartService$fetch$getPendingRequests$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = asyncCartService$fetch$getPendingRequests$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    PendingRequests pendingRequests = asyncCartService.pendingRequests;
                    asyncCartService$fetch$getPendingRequests$1.L$0 = asyncCartService;
                    asyncCartService$fetch$getPendingRequests$1.label = 1;
                    obj = pendingRequests.getRequest(asyncCartService$fetch$getPendingRequests$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    asyncCartService = (AsyncCartService) asyncCartService$fetch$getPendingRequests$1.L$0;
                    s.b(obj);
                }
                return asyncCartService.toRequestBody((List) obj);
            }
        }
        asyncCartService$fetch$getPendingRequests$1 = new AsyncCartService$fetch$getPendingRequests$1(dVar);
        Object obj2 = asyncCartService$fetch$getPendingRequests$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = asyncCartService$fetch$getPendingRequests$1.label;
        if (i11 != 0) {
        }
        return asyncCartService.toRequestBody((List) obj2);
    }

    /* renamed from: internalPost-HG0u8IE, reason: not valid java name */
    private final void m517internalPostHG0u8IE(Map<String, ? extends Object> params, long debounce) {
        String str = this.currentUrl;
        if (str == null) {
            return;
        }
        C10727i.c(this.viewModelCoroutineScope, null, null, new AsyncCartService$internalPost$1(this, new UiAction(str, params, debounce, null), null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    private final boolean sendToScreen(FetchData fetchData) {
        A00.a g10;
        Object obj;
        Pair pair;
        Pair pair2;
        Integer i11;
        List<l> sendToScreen$getComposerItems = sendToScreen$getComposerItems(this);
        Integer num = null;
        if (sendToScreen$getComposerItems != null) {
            ArrayList arrayList = new ArrayList();
            for (l lVar : sendToScreen$getComposerItems) {
                l20.c d11 = lVar.d();
                AsyncUpdateTag asyncUpdateTag = d11 instanceof AsyncUpdateTag ? (AsyncUpdateTag) d11 : null;
                if (asyncUpdateTag != null) {
                    String anchor = asyncUpdateTag.getAnchor();
                    T00.a b11 = lVar.i().b().b();
                    pair2 = new Pair(anchor, Integer.valueOf((b11 == null || (i11 = b11.i()) == null) ? Integer.MAX_VALUE : i11.intValue()));
                } else {
                    pair2 = null;
                }
                if (pair2 != null) {
                    arrayList.add(pair2);
                }
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (h.t((CharSequence) ((Pair) obj).e(), "second-page", false)) {
                    break;
                }
            }
            Pair pair3 = (Pair) obj;
            if (pair3 == null) {
                ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        pair = 0;
                        break;
                    }
                    pair = listIterator2.previous();
                    if (h.t((CharSequence) ((Pair) pair).e(), "first-page", false)) {
                        break;
                    }
                }
                pair3 = pair;
            }
            if (pair3 != null) {
                num = (Integer) pair3.f();
            }
        }
        if (num != null) {
            int intValue = num.intValue();
            d.a aVar = new d.a();
            aVar.c(C7714v.a0(fetchData.getResponse()));
            aVar.a(intValue);
            g10 = aVar.b();
        } else {
            g10 = new a.G(new f.c(null, null, null, null, null, 127));
        }
        if (this.pendingRequests.getHasPending()) {
            return true;
        }
        this.composerStore.c(g10);
        return false;
    }

    private static final List<l> sendToScreen$getComposerItems(AsyncCartService asyncCartService) {
        k.a<l> e11 = asyncCartService.composerStore.b().e();
        if (e11 != null) {
            return e11.a();
        }
        return null;
    }

    private final Map<String, String> toRequestBody(List<? extends Map<String, ? extends Object>> list) {
        List<ModifyItemsRequest.Operation> requestBody$toOperations = toRequestBody$toOperations(list, this);
        if (requestBody$toOperations.isEmpty()) {
            requestBody$toOperations = null;
        }
        if (requestBody$toOperations == null) {
            return U.c();
        }
        return U.j(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, "modifyItems"), new Pair("params", this.jsonSerializer.toJson((JsonSerializer) new ModifyItemsRequest(requestBody$toOperations), (Class<JsonSerializer>) ModifyItemsRequest.class)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [Sc.r$b] */
    private static final List<ModifyItemsRequest.Operation> toRequestBody$toOperations(List<? extends Map<String, ? extends Object>> list, AsyncCartService asyncCartService) {
        ModifyItemsRequest.Operation operation;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((Map) it.next()).get("params");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                try {
                    r.Companion companion = r.INSTANCE;
                    operation = (ModifyItemsRequest.Operation) asyncCartService.jsonDeserializer.fromJson(str, ModifyItemsRequest.Operation.class);
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    operation = s.a(th2);
                }
                r3 = operation instanceof r.b ? null : operation;
            }
            if (r3 != null) {
                arrayList.add(r3);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateWidgets(FetchData fetchData, kotlin.coroutines.d<? super Unit> dVar) {
        Object resetInProgress;
        return (this.pendingRequests.getHasPending() || sendToScreen(fetchData) || (resetInProgress = this.pendingRequests.resetInProgress(dVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : resetInProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (xe.Y.c(r5, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitNewInputsAndFetchBatch(UiAction uiAction, kotlin.coroutines.d<? super FetchData> dVar) {
        AsyncCartService$waitNewInputsAndFetchBatch$1 asyncCartService$waitNewInputsAndFetchBatch$1;
        int i11;
        AsyncCartService asyncCartService;
        if (dVar instanceof AsyncCartService$waitNewInputsAndFetchBatch$1) {
            asyncCartService$waitNewInputsAndFetchBatch$1 = (AsyncCartService$waitNewInputsAndFetchBatch$1) dVar;
            int i12 = asyncCartService$waitNewInputsAndFetchBatch$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                asyncCartService$waitNewInputsAndFetchBatch$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = asyncCartService$waitNewInputsAndFetchBatch$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = asyncCartService$waitNewInputsAndFetchBatch$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    long debounce = uiAction.getDebounce();
                    b.INSTANCE.getClass();
                    if (!b.g(debounce, 0L)) {
                        long debounce2 = uiAction.getDebounce();
                        asyncCartService$waitNewInputsAndFetchBatch$1.L$0 = this;
                        asyncCartService$waitNewInputsAndFetchBatch$1.L$1 = uiAction;
                        asyncCartService$waitNewInputsAndFetchBatch$1.label = 1;
                    }
                    asyncCartService = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return obj;
                    }
                    uiAction = (UiAction) asyncCartService$waitNewInputsAndFetchBatch$1.L$1;
                    asyncCartService = (AsyncCartService) asyncCartService$waitNewInputsAndFetchBatch$1.L$0;
                    s.b(obj);
                }
                xe.U a11 = C10727i.a(asyncCartService.internalCoroutineScope, asyncCartService.dispatcherProvider.getDefault(), null, new AsyncCartService$waitNewInputsAndFetchBatch$2(asyncCartService, uiAction, null), 2);
                asyncCartService$waitNewInputsAndFetchBatch$1.L$0 = null;
                asyncCartService$waitNewInputsAndFetchBatch$1.L$1 = null;
                asyncCartService$waitNewInputsAndFetchBatch$1.label = 2;
                Object s11 = a11.s(asyncCartService$waitNewInputsAndFetchBatch$1);
                return s11 != aVar ? aVar : s11;
            }
        }
        asyncCartService$waitNewInputsAndFetchBatch$1 = new AsyncCartService$waitNewInputsAndFetchBatch$1(this, dVar);
        Object obj2 = asyncCartService$waitNewInputsAndFetchBatch$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = asyncCartService$waitNewInputsAndFetchBatch$1.label;
        if (i11 != 0) {
        }
        xe.U a112 = C10727i.a(asyncCartService.internalCoroutineScope, asyncCartService.dispatcherProvider.getDefault(), null, new AsyncCartService$waitNewInputsAndFetchBatch$2(asyncCartService, uiAction, null), 2);
        asyncCartService$waitNewInputsAndFetchBatch$1.L$0 = null;
        asyncCartService$waitNewInputsAndFetchBatch$1.L$1 = null;
        asyncCartService$waitNewInputsAndFetchBatch$1.label = 2;
        Object s112 = a112.s(asyncCartService$waitNewInputsAndFetchBatch$1);
        if (s112 != aVar2) {
        }
    }

    public final void executePendingRequestsImmediately() {
        Map<String, ? extends Object> c11 = U.c();
        b.INSTANCE.getClass();
        m517internalPostHG0u8IE(c11, 0L);
    }

    @NotNull
    public final InterfaceC2395h<Boolean> isProcessing() {
        return this.isProcessing;
    }

    public final void post(@NotNull String url, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        this.currentUrl = url;
        m517internalPostHG0u8IE(params, this.debounceTime);
    }

    /* renamed from: setDebounceTime-LRDsOJo, reason: not valid java name */
    public final void m518setDebounceTimeLRDsOJo(long j11) {
        this.debounceTime = j11;
    }

    /* renamed from: showProcessing-LRDsOJo, reason: not valid java name */
    public final void m519showProcessingLRDsOJo(long uiDelayTime) {
        m517internalPostHG0u8IE(U.c(), b.l(uiDelayTime, this.debounceTime));
    }

    private AsyncCartService(i<l> iVar, InterfaceC7238a<l> interfaceC7238a, JsonSerializer jsonSerializer, JsonParser jsonParser, CoroutineDispatcherProvider coroutineDispatcherProvider, M m11) {
        this.repository = iVar;
        this.composerStore = interfaceC7238a;
        this.jsonSerializer = jsonSerializer;
        this.jsonDeserializer = jsonParser;
        this.dispatcherProvider = coroutineDispatcherProvider;
        this.viewModelCoroutineScope = m11;
        final PendingRequests pendingRequests = new PendingRequests();
        this.pendingRequests = pendingRequests;
        final C0 b11 = E0.b(0, 0, null, 7);
        this.paramsToModify = b11;
        this.currentUrl = interfaceC7238a.b().l().j();
        this.debounceTime = DEFAULT_DEBOUNCE_TIME;
        this.isProcessing = new C2417s0(pendingRequests.getRequests(), pendingRequests.getInProcess(), new AsyncCartService$isProcessing$1(this, null));
        this.internalCoroutineScope = N.a(CoroutineContext.Element.a.d(coroutineDispatcherProvider.getDefault(), (H0) X0.b()));
        C2399j.C(C2399j.B(new C2408n0(new C2406m0(C2399j.D(new InterfaceC2395h<UiAction>() { // from class: ru.ozon.app.android.cart.domain.async.AsyncCartService$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cart.domain.async.AsyncCartService$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ PendingRequests $receiver$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartService$special$$inlined$map$1$2", f = "AsyncCartService.kt", l = {51, 50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cart.domain.async.AsyncCartService$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, PendingRequests pendingRequests) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$receiver$inlined = pendingRequests;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
                
                    if (r7.emit(r8, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    InterfaceC2397i interfaceC2397i;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i2 = this.$this_unsafeFlow;
                                PendingRequests pendingRequests = this.$receiver$inlined;
                                anonymousClass1.L$0 = interfaceC2397i2;
                                anonymousClass1.label = 1;
                                Object putRequest = pendingRequests.putRequest((UiAction) obj, anonymousClass1);
                                if (putRequest != obj3) {
                                    obj2 = putRequest;
                                    interfaceC2397i = interfaceC2397i2;
                                }
                                return obj3;
                            }
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                                return Unit.f71690a;
                            }
                            InterfaceC2397i interfaceC2397i3 = (InterfaceC2397i) anonymousClass1.L$0;
                            s.b(obj2);
                            interfaceC2397i = interfaceC2397i3;
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Object obj32 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super UiAction> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, pendingRequests), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass2(this))), new AnonymousClass3(this)), coroutineDispatcherProvider.getDefault()), m11);
    }
}
