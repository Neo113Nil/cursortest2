package ru.ozon.app.android.cart.domain.async;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import K00.i;
import com.google.android.gms.common.internal.ImagesContract;
import h3.C6788a;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.composer.ui.widget.l;
import xe.C10720e0;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0014\u0010,\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/cart/domain/async/AsyncCartViewModelImpl;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "LK00/i;", "Lru/ozon/composer/ui/widget/l;", "repository", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "<init>", "(Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;Lru/ozon/app/android/network/di/NetworkComponentApi;LK00/i;Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;)V", "", ImagesContract.URL, "", "", "params", "", "post", "(Ljava/lang/String;Ljava/util/Map;)V", "Lkotlin/time/b;", "uiDelayTime", "showProcessing-LRDsOJo", "(J)V", "showProcessing", "executePendingRequestsImmediately", "()V", "", "enabled", "operationsDebounceDelay", "setAsyncParams-6Au4x4Y", "(ZLkotlin/time/b;)V", "setAsyncParams", "Lru/ozon/app/android/cart/domain/async/AsyncCartService;", "asyncCartService", "Lru/ozon/app/android/cart/domain/async/AsyncCartService;", "LAe/x0;", "asyncModeIsEnabled", "LAe/x0;", "LAe/M0;", "isProcessing", "LAe/M0;", "()LAe/M0;", "isEnabled", "()Z", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AsyncCartViewModelImpl extends AsyncCartViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AsyncCartService asyncCartService;

    @NotNull
    private final x0<Boolean> asyncModeIsEnabled;

    @NotNull
    private final M0<Boolean> isProcessing;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/domain/async/AsyncCartViewModelImpl$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/cart/domain/async/AsyncCartViewModelImpl;", "create", "(Lk20/g;)Lru/ozon/app/android/cart/domain/async/AsyncCartViewModelImpl;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AsyncCartViewModelImpl create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new AsyncCartViewModelImpl((RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class), (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class), ((RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class)).getComposerRepository(), (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AsyncCartViewModelImpl(RetainComposerComponentApi retainComposerComponentApi, NetworkComponentApi networkComponentApi, i iVar, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, DefaultConstructorMarker defaultConstructorMarker) {
        this(retainComposerComponentApi, networkComponentApi, iVar, coroutineDispatchersComponentApi);
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel
    public void executePendingRequestsImmediately() {
        if (isEnabled()) {
            this.asyncCartService.executePendingRequestsImmediately();
        }
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel
    public boolean isEnabled() {
        return this.asyncModeIsEnabled.getValue().booleanValue();
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel
    @NotNull
    public M0<Boolean> isProcessing() {
        return this.isProcessing;
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel
    public void post(@NotNull String url, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(params, "params");
        this.asyncCartService.post(url, params);
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel
    /* renamed from: setAsyncParams-6Au4x4Y */
    public void mo507setAsyncParams6Au4x4Y(boolean enabled, b operationsDebounceDelay) {
        this.asyncModeIsEnabled.setValue(Boolean.valueOf(enabled));
        if (operationsDebounceDelay != null) {
            this.asyncCartService.m518setDebounceTimeLRDsOJo(operationsDebounceDelay.getF71985a());
        }
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel
    /* renamed from: showProcessing-LRDsOJo */
    public void mo508showProcessingLRDsOJo(long uiDelayTime) {
        if (isEnabled()) {
            this.asyncCartService.m519showProcessingLRDsOJo(uiDelayTime);
        }
    }

    private AsyncCartViewModelImpl(RetainComposerComponentApi retainComposerComponentApi, NetworkComponentApi networkComponentApi, i<l> iVar, CoroutineDispatchersComponentApi coroutineDispatchersComponentApi) {
        AsyncCartService create = AsyncCartService.INSTANCE.create(retainComposerComponentApi, networkComponentApi, iVar, coroutineDispatchersComponentApi, androidx.lifecycle.x0.a(this));
        this.asyncCartService = create;
        Boolean bool = Boolean.FALSE;
        x0<Boolean> a11 = O0.a(bool);
        this.asyncModeIsEnabled = a11;
        InterfaceC2395h B11 = C2399j.B(new C2417s0(create.isProcessing(), a11, new AsyncCartViewModelImpl$isProcessing$1(null)), C10720e0.a());
        C6788a a12 = androidx.lifecycle.x0.a(this);
        int i11 = I0.f818a;
        this.isProcessing = C2399j.M(B11, a12, I0.a.c(), bool);
    }
}
