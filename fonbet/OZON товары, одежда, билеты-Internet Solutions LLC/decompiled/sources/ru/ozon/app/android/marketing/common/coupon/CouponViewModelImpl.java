package ru.ozon.app.android.marketing.common.coupon;

import B0.A0;
import B90.C2612n;
import BY.g;
import BY.i;
import L9.b;
import L9.c;
import Mc.a;
import androidx.lifecycle.w0;
import io.reactivex.p;
import io.reactivex.u;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.common.coupon.CouponResult;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00180\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010%\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u000e0\u000e0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModel;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "couponActivationRepository", "Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "couponStorage", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;Lru/ozon/app/android/marketing/coupon/data/CouponStorage;)V", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation$Common;", "activation", "Lio/reactivex/p;", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "activate", "(Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation$Common;)Lio/reactivex/p;", "", "couponCode", "", "activateCode", "(Ljava/lang/String;)V", "observeActivateResult", "()Lio/reactivex/p;", "", "observeActivatedCoupons", "onCleared", "()V", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "LL9/b;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;", "kotlin.jvm.PlatformType", "activateCouponListener", "LL9/b;", "LL9/c;", "activationResultListener", "LL9/c;", "CouponActivation", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CouponViewModelImpl extends w0 implements CouponViewModel {

    @NotNull
    private final b<CouponActivation> activateCouponListener;

    @NotNull
    private final c<CouponResult> activationResultListener;

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final CouponActivationRepository couponActivationRepository;

    @NotNull
    private final CouponStorage couponStorage;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0001¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<CouponActivation, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(CouponActivation it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!(it instanceof CouponActivation.Empty));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;", "Lkotlin/jvm/internal/EnhancedNullability;", "<unused var>", "", "coupon", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function2<Boolean, CouponActivation, CouponActivation> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(2);
        }

        public final CouponActivation invoke(boolean z11, CouponActivation coupon) {
            Intrinsics.checkNotNullParameter(coupon, "coupon");
            return coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ CouponActivation invoke(Boolean bool, CouponActivation couponActivation) {
            return invoke(bool.booleanValue(), couponActivation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/u;", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;)Lio/reactivex/u;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<CouponActivation, u<? extends CouponResult>> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends CouponResult> invoke(CouponActivation it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it instanceof CouponActivation.Common ? CouponViewModelImpl.this.activate((CouponActivation.Common) it) : p.empty();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/marketing/common/coupon/CouponResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/common/coupon/CouponResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<CouponResult, Unit> {
        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CouponResult couponResult) {
            invoke2(couponResult);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CouponResult couponResult) {
            CouponViewModelImpl.this.activationResultListener.accept(couponResult);
            CouponViewModelImpl.this.activateCouponListener.accept(CouponActivation.Empty.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;", "", "<init>", "()V", "Empty", "Common", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation$Common;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation$Empty;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CouponActivation {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation$Common;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;", "", "couponCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCouponCode", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Common extends CouponActivation {

            @NotNull
            private final String couponCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Common(@NotNull String couponCode) {
                super(null);
                Intrinsics.checkNotNullParameter(couponCode, "couponCode");
                this.couponCode = couponCode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Common) && Intrinsics.d(this.couponCode, ((Common) other).couponCode);
            }

            @NotNull
            public final String getCouponCode() {
                return this.couponCode;
            }

            public int hashCode() {
                return this.couponCode.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Common(couponCode=", this.couponCode, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation$Empty;", "Lru/ozon/app/android/marketing/common/coupon/CouponViewModelImpl$CouponActivation;", "<init>", "()V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Empty extends CouponActivation {

            @NotNull
            public static final Empty INSTANCE = new Empty();

            private Empty() {
                super(null);
            }
        }

        public /* synthetic */ CouponActivation(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CouponActivation() {
        }
    }

    public CouponViewModelImpl(@NotNull AuthStateStorage authManager, @NotNull CouponActivationRepository couponActivationRepository, @NotNull CouponStorage couponStorage) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(couponActivationRepository, "couponActivationRepository");
        Intrinsics.checkNotNullParameter(couponStorage, "couponStorage");
        this.authManager = authManager;
        this.couponActivationRepository = couponActivationRepository;
        this.couponStorage = couponStorage;
        C8486a c8486a = new C8486a();
        this.compositeDisposable = c8486a;
        b<CouponActivation> c11 = b.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.activateCouponListener = c11;
        c<CouponResult> c12 = c.c();
        Intrinsics.checkNotNullExpressionValue(c12, "create(...)");
        this.activationResultListener = c12;
        InterfaceC8487b subscribe = authManager.getAuthState().subscribeOn(a.a()).filter(new DF.a(AnonymousClass1.INSTANCE, 4)).withLatestFrom(c11.filter(new g(AnonymousClass2.INSTANCE, 3)), new C2612n(AnonymousClass3.INSTANCE)).distinctUntilChanged().switchMap(new i(new AnonymousClass4(), 4)).subscribe(new H2.c(new AnonymousClass5(), 5));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CouponActivation _init_$lambda$2(Function2 function2, Object p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (CouponActivation) function2.invoke(p02, p12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u _init_$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (u) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p<CouponResult> activate(CouponActivation.Common activation) {
        p<CouponResult> onErrorReturn = this.couponActivationRepository.activateCode(activation.getCouponCode()).k().subscribeOn(a.b()).observeOn(a.a()).map(new DJ.c(new CouponViewModelImpl$activate$1(activation, this), 6)).onErrorReturn(new AJ.c(new CouponViewModelImpl$activate$2(activation), 6));
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "onErrorReturn(...)");
        return onErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CouponResult activate$lambda$6(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CouponResult) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CouponResult activate$lambda$7(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CouponResult) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.marketing.common.coupon.CouponViewModel
    public void activateCode(@NotNull String couponCode) {
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        CouponActivation.Common common = new CouponActivation.Common(couponCode);
        if (!this.authManager.isAuthenticated()) {
            this.activateCouponListener.accept(common);
            this.activationResultListener.accept(new CouponResult.Auth(couponCode));
        } else {
            C8486a c8486a = this.compositeDisposable;
            InterfaceC8487b subscribe = activate(common).subscribe(new AJ.a(new CouponViewModelImpl$activateCode$1(this), 3));
            Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
            RxExtKt.plusAssign(c8486a, subscribe);
        }
    }

    @Override // ru.ozon.app.android.marketing.common.coupon.CouponViewModel
    @NotNull
    public p<CouponResult> observeActivateResult() {
        return this.activationResultListener;
    }

    @Override // ru.ozon.app.android.marketing.common.coupon.CouponViewModel
    @NotNull
    public p<Set<String>> observeActivatedCoupons() {
        return this.couponStorage.observeActivatedCoupons();
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
        this.activateCouponListener.accept(CouponActivation.Empty.INSTANCE);
    }
}
