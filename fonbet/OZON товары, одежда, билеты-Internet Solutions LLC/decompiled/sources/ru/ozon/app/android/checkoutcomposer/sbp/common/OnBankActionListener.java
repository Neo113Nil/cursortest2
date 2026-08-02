package ru.ozon.app.android.checkoutcomposer.sbp.common;

import WZ.l;
import WZ.t;
import WZ.x;
import a00.C4911f;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.fragment.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u0000 )2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001)BY\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005\u0012\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\r0\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u001a2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010\u001fJ\u0018\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b%\u0010!R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R*\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\r0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/common/OnBankActionListener;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/uni/atoms/v3/containers/OnActionListener;", "Lkotlin/Function0;", "", "widgetId", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getRestriction", "Lru/ozon/app/android/action/BuildedActionHandler;", "getActionHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lkotlin/jvm/functions/Function0;La00/f;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LWZ/l;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "onClickAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "", "", "params", "", "isHttpsWebClientUrl", "(Ljava/util/Map;)Z", "canHandleBankIdDeepLink", "showRestriction", "()V", "createOrder", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "trackClick", "trackRestrictionView", "data", "invoke", "Lkotlin/jvm/functions/Function0;", "La00/f;", "LWZ/l;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnBankActionListener implements Function1<AtomAction, Unit> {

    @NotNull
    private final C4911f container;

    @NotNull
    private final Function0<Function1<AtomAction, Unit>> getActionHandler;

    @NotNull
    private final Function0<Restriction> getRestriction;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Function0<Long> widgetId;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/common/OnBankActionListener$Companion;", "", "<init>", "()V", "BANK_ID_ACTION_PARAMS_KEY", "", "WEB_CLIENT_URL_PARAMS_KEY", "SBP_BANK_AUTHORITY", "HTTPS_SCHEME", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBankActionListener(@NotNull Function0<Long> widgetId, @NotNull C4911f container, @NotNull Function0<Restriction> getRestriction, @NotNull Function0<? extends Function1<? super AtomAction, Unit>> getActionHandler, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(getRestriction, "getRestriction");
        Intrinsics.checkNotNullParameter(getActionHandler, "getActionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.widgetId = widgetId;
        this.container = container;
        this.getRestriction = getRestriction;
        this.getActionHandler = getActionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    private final boolean canHandleBankIdDeepLink(Map<String, String> params) {
        String str;
        PackageManager packageManager;
        if (params != null && (str = params.get("bankId")) != null) {
            Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme(str).authority("qr.nspk.ru").appendPath("").build());
            r a11 = this.container.a();
            if (((a11 == null || (packageManager = a11.getPackageManager()) == null) ? null : packageManager.resolveActivity(intent, 0)) != null) {
                return true;
            }
        }
        return false;
    }

    private final void createOrder(AtomAction action) {
        this.getActionHandler.invoke().invoke(action);
    }

    private final boolean isHttpsWebClientUrl(Map<String, String> params) {
        String str;
        if (params == null || (str = params.get("webClientUrl")) == null) {
            return false;
        }
        return h.D(Uri.parse(str).getScheme(), "https", false);
    }

    private final void onClickAction(AtomAction.Click action) {
        trackClick(action);
        if (isHttpsWebClientUrl(action.getParams())) {
            createOrder(action);
        } else if (canHandleBankIdDeepLink(action.getParams())) {
            createOrder(action);
        } else {
            showRestriction();
        }
    }

    private final void showRestriction() {
        Restriction invoke = this.getRestriction.invoke();
        if (invoke != null) {
            RestrictionsKt.show(invoke, this.container, new OnBankActionListener$showRestriction$1(this));
        }
    }

    private final void trackClick(AtomAction.Click action) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Long invoke = this.widgetId.invoke();
        if (invoke == null || (trackingInfo = action.getTrackingInfo()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
        t b11 = x.b(trackingInfo, invoke, null);
        if (b11 != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackRestrictionView() {
        Restriction invoke;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Long invoke2 = this.widgetId.invoke();
        if (invoke2 == null || (invoke = this.getRestriction.invoke()) == null || (trackingInfo = invoke.getTrackingInfo()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
        t b11 = x.b(trackingInfo, invoke2, null);
        if (b11 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull AtomAction data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof AtomAction.Click) {
            onClickAction((AtomAction.Click) data);
        }
    }
}
