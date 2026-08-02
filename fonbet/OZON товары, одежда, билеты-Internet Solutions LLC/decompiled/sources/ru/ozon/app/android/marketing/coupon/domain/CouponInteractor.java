package ru.ozon.app.android.marketing.coupon.domain;

import Sc.o;
import Sc.r;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.coupon.data.CouponActivationRepository;
import ru.ozon.app.android.marketing.coupon.domain.ActivateCouponResult;
import ru.ozon.app.android.marketing.coupon.domain.CouponResponse;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.f1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;", "", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "repository", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;)V", "Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;", "", "couponCode", "Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult;", "toResult", "(Lru/ozon/app/android/marketing/coupon/domain/CouponResponse;Ljava/lang/String;)Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "applyCoupon", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/marketing/coupon/data/CouponActivationRepository;", "Companion", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponInteractor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final CouponActivationRepository repository;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor$Companion;", "", "<init>", "()V", "TIMEOUT", "", "CODE_QUERY_NAME", "", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CouponInteractor(@NotNull AuthStateStorage authManager, @NotNull CouponActivationRepository repository) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.authManager = authManager;
        this.repository = repository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivateCouponResult toResult(CouponResponse couponResponse, String str) {
        if (couponResponse instanceof CouponResponse.Success) {
            return new ActivateCouponResult.Success(((CouponResponse.Success) couponResponse).getMessageForUser(), str);
        }
        if (couponResponse instanceof CouponResponse.Fail) {
            return new ActivateCouponResult.Fail(((CouponResponse.Fail) couponResponse).getErrorForUser(), null, 2, null);
        }
        throw new o();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(2:21|(2:23|24)(3:25|26|(1:28)))|11|12|(1:17)(2:14|15)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r7 = Sc.r.INSTANCE;
        r7 = Sc.s.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object applyCoupon(@NotNull AtomAction.ComposerAction composerAction, @NotNull d<? super ActivateCouponResult> dVar) {
        CouponInteractor$applyCoupon$1 couponInteractor$applyCoupon$1;
        int i11;
        if (dVar instanceof CouponInteractor$applyCoupon$1) {
            couponInteractor$applyCoupon$1 = (CouponInteractor$applyCoupon$1) dVar;
            int i12 = couponInteractor$applyCoupon$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                couponInteractor$applyCoupon$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = couponInteractor$applyCoupon$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = couponInteractor$applyCoupon$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (!this.authManager.isAuthenticated()) {
                        return ActivateCouponResult.Auth.INSTANCE;
                    }
                    String queryParameter = Uri.parse(composerAction.getActionName()).getQueryParameter("code");
                    r.Companion companion = r.INSTANCE;
                    CouponInteractor$applyCoupon$2$1 couponInteractor$applyCoupon$2$1 = new CouponInteractor$applyCoupon$2$1(this, composerAction, queryParameter, null);
                    couponInteractor$applyCoupon$1.label = 1;
                    obj = f1.b(5000L, couponInteractor$applyCoupon$2$1, couponInteractor$applyCoupon$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Object a11 = (ActivateCouponResult) obj;
                r.Companion companion2 = r.INSTANCE;
                Throwable b11 = r.b(a11);
                return b11 != null ? a11 : new ActivateCouponResult.Fail(null, b11, 1, null);
            }
        }
        couponInteractor$applyCoupon$1 = new CouponInteractor$applyCoupon$1(this, dVar);
        Object obj2 = couponInteractor$applyCoupon$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = couponInteractor$applyCoupon$1.label;
        if (i11 != 0) {
        }
        Object a112 = (ActivateCouponResult) obj2;
        r.Companion companion22 = r.INSTANCE;
        Throwable b112 = r.b(a112);
        if (b112 != null) {
        }
    }
}
