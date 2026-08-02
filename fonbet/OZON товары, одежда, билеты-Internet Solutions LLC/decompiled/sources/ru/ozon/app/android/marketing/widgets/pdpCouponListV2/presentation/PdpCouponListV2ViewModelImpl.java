package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.router.PdpCouponListV2Router;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import xe.C10727i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpCouponListV2ViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/PdpCouponListV2ViewModel;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "couponStorage", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "repository", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/router/PdpCouponListV2Router;", "router", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/marketing/coupon/data/CouponStorage;Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/router/PdpCouponListV2Router;)V", "LSc/r;", "Lru/ozon/app/android/marketing/coupon/data/ApplyCouponResponse;", "activationResult", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;", "coupon", "", "processActivationResult", "(Ljava/lang/Object;Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;)V", "", "checkAuth", "()Z", "onCouponApplyClicked", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;)V", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/router/PdpCouponListV2Router;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "refreshTrigger", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "getRefreshTrigger", "()Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "", "tooltip", "getTooltip", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpCouponListV2ViewModelImpl extends w0 implements PdpCouponListV2ViewModel {

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final CouponStorage couponStorage;

    @NotNull
    private final BroadcastSingleLiveEvent<Unit> refreshTrigger;

    @NotNull
    private final CouponActivationRepository repository;

    @NotNull
    private final PdpCouponListV2Router router;

    @NotNull
    private final BroadcastSingleLiveEvent<String> tooltip;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModelImpl$1", f = "PdpCouponListV2ViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModelImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Set<? extends String>, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PdpCouponListV2ViewModelImpl.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, d<? super Unit> dVar) {
            return invoke2((Set<String>) set, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            PdpCouponListV2ViewModelImpl.this.getRefreshTrigger().call();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Set<String> set, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(set, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public PdpCouponListV2ViewModelImpl(@NotNull AuthStateStorage authManager, @NotNull CouponStorage couponStorage, @NotNull CouponActivationRepository repository, @NotNull PdpCouponListV2Router router) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(couponStorage, "couponStorage");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(router, "router");
        this.authManager = authManager;
        this.couponStorage = couponStorage;
        this.repository = repository;
        this.router = router;
        this.refreshTrigger = new BroadcastSingleLiveEvent<>();
        this.tooltip = new BroadcastSingleLiveEvent<>();
        C2399j.C(new C2408n0(n.a(couponStorage.observeActivatedCoupons()), new AnonymousClass1(null)), x0.a(this));
    }

    private final boolean checkAuth() {
        if (this.authManager.isAuthenticated()) {
            return true;
        }
        this.router.showAuthScreen();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processActivationResult(Object activationResult, PdpCouponItemListV2VO coupon) {
        r.Companion companion = r.INSTANCE;
        if (!(activationResult instanceof r.b)) {
            this.couponStorage.couponApplied(coupon.getPromocode().getPromocode());
        }
        Throwable b11 = r.b(activationResult);
        if (b11 != null) {
            getTooltip().setValue(b11.getMessage());
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModel
    public void onCouponApplyClicked(@NotNull PdpCouponItemListV2VO coupon) {
        Intrinsics.checkNotNullParameter(coupon, "coupon");
        if (checkAuth()) {
            C10727i.c(x0.a(this), null, null, new PdpCouponListV2ViewModelImpl$onCouponApplyClicked$1(this, coupon, null), 3);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModel
    @NotNull
    public BroadcastSingleLiveEvent<Unit> getRefreshTrigger() {
        return this.refreshTrigger;
    }

    @Override // ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpCouponListV2ViewModel
    @NotNull
    public BroadcastSingleLiveEvent<String> getTooltip() {
        return this.tooltip;
    }
}
