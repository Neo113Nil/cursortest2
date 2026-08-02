package ru.ozon.app.android.marketing.coupon;

import Ae.InterfaceC2395h;
import Ge.n;
import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.coupon.domain.ActivateCouponResult;
import ru.ozon.app.android.marketing.coupon.domain.CouponInteractor;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;
import xe.B0;
import xe.C10727i;
import xe.d1;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010#\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020!*\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b(\u0010\u0010J'\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020! +*\n\u0012\u0004\u0012\u00020!\u0018\u00010*0*0)¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;", "interactor", "Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "couponStorage", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;Lru/ozon/app/android/marketing/coupon/data/CouponStorage;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Landroidx/lifecycle/B;", "scope", "", "applyCoupon", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Landroidx/lifecycle/B;)V", "Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult;", "result", "processResult", "(Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult;)V", "onAuthRequired", "()V", "Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult$Success;", "onProcessSuccess", "(Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult$Success;)V", "Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult$Fail;", "onProcessFail", "(Lru/ozon/app/android/marketing/coupon/domain/ActivateCouponResult$Fail;)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "message", "", "icon", "", "tintColor", "showFlashbar", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;ILjava/lang/String;)Lkotlin/Unit;", "", "toMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "handle", "LAe/h;", "", "kotlin.jvm.PlatformType", "observeCouponStorage", "()LAe/h;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;", "Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "Lxe/B0;", "applyCouponJob", "Lxe/B0;", "couponCode", "Ljava/lang/String;", "Companion", "coupon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActivateCouponActionHandler {
    private B0 applyCouponJob;
    private String couponCode;

    @NotNull
    private final CouponStorage couponStorage;

    @NotNull
    private final CouponInteractor interactor;

    @NotNull
    private final ComposerReferences refs;

    public ActivateCouponActionHandler(@NotNull ComposerReferences refs, @NotNull CouponInteractor interactor, @NotNull CouponStorage couponStorage) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(couponStorage, "couponStorage");
        this.refs = refs;
        this.interactor = interactor;
        this.couponStorage = couponStorage;
    }

    private final void applyCoupon(AtomAction.ComposerAction action, B scope) {
        B0 b02 = this.applyCouponJob;
        if (b02 == null || !b02.isActive()) {
            this.applyCouponJob = C10727i.c(scope, null, null, new ActivateCouponActionHandler$applyCoupon$1(this, action, null), 3);
        }
    }

    private final void onAuthRequired() {
        ComposerNavigator navigator = this.refs.getNavigator();
        String uri = LinkGenerator.INSTANCE.login().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
    }

    private final void onProcessFail(ActivateCouponResult.Fail result) {
        String message = result.getMessage();
        if (message == null) {
            Throwable throwable = result.getThrowable();
            message = throwable != null ? toMessage(throwable) : null;
            if (message == null) {
                message = StringProvider.getString(R$string.error_marketing_promo_code_error_android);
            }
        }
        showFlashbar(OzonSpannableStringKt.toOzonSpannableString(message), R$drawable.ic_m_danger, StyleParser.OzColor.OZ_COLOR_ORANGE.getValue());
    }

    private final void onProcessSuccess(ActivateCouponResult.Success result) {
        String message = result.getMessage();
        if (message == null) {
            message = StringProvider.getString(R$string.marketing_promo_code_success_android);
        }
        showFlashbar(OzonSpannableStringKt.toOzonSpannableString(message), ru.ozon.app.android.composer.R$drawable.ic_check_mark_green, StyleParser.OzColor.OZ_SEMANTIC_TEXT_POSITIVE.getValue());
        String couponCode = result.getCouponCode();
        if (couponCode != null) {
            this.couponStorage.couponApplied(couponCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processResult(ActivateCouponResult result) {
        if (result instanceof ActivateCouponResult.Auth) {
            onAuthRequired();
        } else if (result instanceof ActivateCouponResult.Success) {
            onProcessSuccess((ActivateCouponResult.Success) result);
        } else {
            if (!(result instanceof ActivateCouponResult.Fail)) {
                throw new o();
            }
            onProcessFail((ActivateCouponResult.Fail) result);
        }
    }

    private final Unit showFlashbar(OzonSpannableString message, int icon, String tintColor) {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return null;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, message, null, null, Integer.valueOf(icon), null, tintColor, null, null, null, null, null, 3000L, null, null, this.refs.getContainer().g(), 57178, null).show();
        return Unit.f71690a;
    }

    private final String toMessage(Throwable th2) {
        return ((th2 instanceof UnknownHostException) || (th2 instanceof ConnectException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof d1)) ? StringProvider.getString(ru.ozon.app.android.platform.R$string.error_activatecode_message_not_internet) : StringProvider.getString(R$string.error_marketing_promo_code_error_android);
    }

    public final void handle(@NotNull AtomAction.ComposerAction action, @NotNull B scope) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (Intrinsics.d(action.getId(), "applyPromocode")) {
            applyCoupon(action, scope);
        }
    }

    @NotNull
    public final InterfaceC2395h<Set<String>> observeCouponStorage() {
        return n.a(this.couponStorage.observeActivatedCoupons());
    }
}
