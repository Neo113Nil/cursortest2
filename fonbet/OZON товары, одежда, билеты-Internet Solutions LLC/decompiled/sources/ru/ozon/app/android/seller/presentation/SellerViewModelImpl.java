package ru.ozon.app.android.seller.presentation;

import Bc.i;
import Bc.r;
import H2.c;
import M4.c;
import Mc.a;
import android.os.Bundle;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.presentation.SellerViewModelImpl;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;
import ru.ozon.app.android.tabbar.miniapp.seller.SellerTabConfigMapper;
import sc.C9653a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/seller/presentation/SellerViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/seller/presentation/SellerViewModel;", "Lru/ozon/app/android/tabbar/miniapp/seller/SellerTabConfigMapper;", "mapper", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "repository", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/seller/SellerTabConfigMapper;Lru/ozon/app/android/tabbar/data/TabConfigRepository;)V", "LM4/c;", "savedStateRegistry", "", "init", "(LM4/c;)V", "", "miniAppName", "referrerMiniAppName", "getTabConfig", "(Ljava/lang/String;Ljava/lang/String;)V", "onCleared", "()V", "Lru/ozon/app/android/tabbar/miniapp/seller/SellerTabConfigMapper;", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/seller/presentation/SellerState;", "state", "Landroidx/lifecycle/V;", "getState", "()Landroidx/lifecycle/V;", "Lnc/b;", "disposable", "Lnc/b;", "Companion", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SellerViewModelImpl extends w0 implements SellerViewModel {

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final SellerTabConfigMapper mapper;

    @NotNull
    private final TabConfigRepository repository;

    @NotNull
    private final V<SellerState> state;

    public SellerViewModelImpl(@NotNull SellerTabConfigMapper mapper, @NotNull TabConfigRepository repository) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.mapper = mapper;
        this.repository = repository;
        this.state = new V<>();
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoteTabConfig getTabConfig$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (RemoteTabConfig) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle init$lambda$1(SellerViewModelImpl sellerViewModelImpl) {
        Bundle bundle = new Bundle(1);
        SellerState value = sellerViewModelImpl.getState().getValue();
        if (value != null) {
            bundle.putParcelable("ru.ozon.app.android.seller.presentation.SellerViewModel.EXTRA_SELLER_STATE", value);
        }
        return bundle;
    }

    @Override // ru.ozon.app.android.seller.presentation.SellerViewModel
    public void getTabConfig(@NotNull String miniAppName, String referrerMiniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        this.disposable.dispose();
        this.disposable = new i(new r(this.repository.loadTabConfig(miniAppName, referrerMiniAppName).j(a.b()).g(a.a()), new BY.i(new SellerViewModelImpl$getTabConfig$1(this), 5)).g(C8125a.a()), new c(new SellerViewModelImpl$getTabConfig$2(this), 6)).h(new AJ.a(new SellerViewModelImpl$getTabConfig$3(this), 4), new DJ.c(new SellerViewModelImpl$getTabConfig$4(this), 7));
    }

    @Override // ru.ozon.app.android.seller.presentation.SellerViewModel
    public void init(@NotNull M4.c savedStateRegistry) {
        SellerState sellerState;
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Bundle b11 = savedStateRegistry.b("ru.ozon.app.android.seller.presentation.SellerViewModel.EXTRA_BUNDLE");
        if (b11 != null && (sellerState = (SellerState) b11.getParcelable("ru.ozon.app.android.seller.presentation.SellerViewModel.EXTRA_SELLER_STATE")) != null) {
            getState().setValue(sellerState);
        }
        savedStateRegistry.i("ru.ozon.app.android.seller.presentation.SellerViewModel.EXTRA_BUNDLE");
        savedStateRegistry.g("ru.ozon.app.android.seller.presentation.SellerViewModel.EXTRA_BUNDLE", new c.b() { // from class: gJ.b
            @Override // M4.c.b
            public final Bundle saveState() {
                Bundle init$lambda$1;
                init$lambda$1 = SellerViewModelImpl.init$lambda$1(SellerViewModelImpl.this);
                return init$lambda$1;
            }
        });
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposable.dispose();
    }

    @Override // ru.ozon.app.android.seller.presentation.SellerViewModel
    @NotNull
    public V<SellerState> getState() {
        return this.state;
    }
}
