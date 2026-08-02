package ru.ozon.app.android.bank.navigation;

import GZ.j;
import H30.x;
import KZ.c;
import Lh.a;
import R80.g;
import R80.w;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.lifecycle.FintechActivityLifecycleCallback;
import ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivity;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u001b\u0010\u0014\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u001b\u0010\u0015\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00060\bj\u0002`\t2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u001f\u0010 \u001a\u00060\bj\u0002`\t2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b \u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/bank/navigation/BankGlobalDeeplinkInterceptor;", "LKZ/c;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/bank/lifecycle/FintechActivityLifecycleCallback;", "fintechActivityLifecycleCallback", "<init>", "(Landroid/app/Application;Lru/ozon/app/android/bank/lifecycle/FintechActivityLifecycleCallback;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "isOzonWebAuthWithBankRedirect", "(LGZ/j;)Z", "isOzonWebAuthWithRkoRedirect", "isOzonWebAuthWithCheckoutRedirect", "needCloseFinance", "isThankYouCloseFinanceActivity", "()Z", "isFinanceDeeplink", "isRkoDeeplink", "isCheckoutDeeplink", "", "bxHost", "deeplink", "isAuthRequired", "Landroid/net/Uri;", "buildFintechDeeplink", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/net/Uri;", "correctedOzonFintech", "(LGZ/j;)LGZ/j;", "canIntercept", "intercept", "Landroid/app/Application;", "Lru/ozon/app/android/bank/lifecycle/FintechActivityLifecycleCallback;", "LR80/g;", "fintechDeeplink$delegate", "LSc/j;", "getFintechDeeplink", "()LR80/g;", "fintechDeeplink", "Companion", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "settings", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankGlobalDeeplinkInterceptor implements c {

    @NotNull
    private final Application application;

    @NotNull
    private final FintechActivityLifecycleCallback fintechActivityLifecycleCallback;

    /* renamed from: fintechDeeplink$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fintechDeeplink;

    public BankGlobalDeeplinkInterceptor(@NotNull Application application, @NotNull FintechActivityLifecycleCallback fintechActivityLifecycleCallback) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechActivityLifecycleCallback, "fintechActivityLifecycleCallback");
        this.application = application;
        this.fintechActivityLifecycleCallback = fintechActivityLifecycleCallback;
        this.fintechDeeplink = k.a(n.PUBLICATION, new BankGlobalDeeplinkInterceptor$fintechDeeplink$2(this));
    }

    private final Uri buildFintechDeeplink(String bxHost, String deeplink, boolean isAuthRequired) {
        Uri parse = deeplink != null ? Uri.parse(deeplink) : null;
        if (Intrinsics.d(parse != null ? parse.getAuthority() : null, "web")) {
            Uri build = parse.buildUpon().authority(bxHost).build();
            Intrinsics.f(build);
            return build;
        }
        Uri.Builder authority = new Uri.Builder().scheme("ozon").authority(bxHost);
        if (deeplink != null) {
            authority.appendQueryParameter(ImagesContract.URL, deeplink);
        }
        if (isAuthRequired) {
            authority.appendPath("auth");
        }
        Uri build2 = authority.build();
        Intrinsics.f(build2);
        return build2;
    }

    static /* synthetic */ Uri buildFintechDeeplink$default(BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return bankGlobalDeeplinkInterceptor.buildFintechDeeplink(str, str2, z11);
    }

    private final j correctedOzonFintech(j route) {
        return (Intrinsics.d(x.d(route.b()), "ozon") && Intrinsics.d(x.a(route.b()), "fintech")) ? j.a(route, route.d()) : route;
    }

    private final g getFintechDeeplink() {
        return (g) this.fintechDeeplink.getValue();
    }

    private final boolean isCheckoutDeeplink(j route) {
        g fintechDeeplink = getFintechDeeplink();
        String uri = route.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return fintechDeeplink.O(uri).e();
    }

    private final boolean isFinanceDeeplink(j route) {
        g fintechDeeplink = getFintechDeeplink();
        String uri = route.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return fintechDeeplink.M0(uri).e();
    }

    private final boolean isOzonWebAuthWithBankRedirect(j route) {
        String c11 = x.c(route.b(), ImagesContract.URL);
        return Intrinsics.d(route.b().getScheme(), "ozon") && route.b().getPathSegments().contains("auth") && c11 != null && getFintechDeeplink().M0(c11).e();
    }

    private final boolean isOzonWebAuthWithCheckoutRedirect(j route) {
        String c11 = x.c(route.b(), ImagesContract.URL);
        return Intrinsics.d(route.b().getScheme(), "ozon") && route.b().getPathSegments().contains("auth") && c11 != null && getFintechDeeplink().O(c11).e();
    }

    private final boolean isOzonWebAuthWithRkoRedirect(j route) {
        String c11 = x.c(route.b(), ImagesContract.URL);
        return Intrinsics.d(route.b().getScheme(), "ozon") && route.b().getPathSegments().contains("auth") && c11 != null && getFintechDeeplink().a(c11).e();
    }

    private final boolean isRkoDeeplink(j route) {
        g fintechDeeplink = getFintechDeeplink();
        String uri = route.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return fintechDeeplink.a(uri).e();
    }

    private final boolean isThankYouCloseFinanceActivity() {
        WeakReference<Activity> financeActivity = this.fintechActivityLifecycleCallback.getFinanceActivity();
        return (financeActivity != null ? financeActivity.get() : null) instanceof FinanceActivity;
    }

    private final boolean needCloseFinance(j route) {
        return Intrinsics.d(route.b().getScheme(), "ozon") && a.f(route, "thank_you");
    }

    @Override // KZ.c
    public boolean canIntercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        j correctedOzonFintech = correctedOzonFintech(route);
        return (isThankYouCloseFinanceActivity() && needCloseFinance(correctedOzonFintech)) || isOzonWebAuthWithBankRedirect(correctedOzonFintech) || isOzonWebAuthWithRkoRedirect(correctedOzonFintech) || isOzonWebAuthWithCheckoutRedirect(correctedOzonFintech) || isCheckoutDeeplink(correctedOzonFintech) || isRkoDeeplink(correctedOzonFintech) || isFinanceDeeplink(correctedOzonFintech);
    }

    @Override // KZ.a
    @NotNull
    public j intercept(@NotNull j route) {
        Activity activity;
        Intrinsics.checkNotNullParameter(route, "route");
        j correctedOzonFintech = correctedOzonFintech(route);
        if (isThankYouCloseFinanceActivity() && needCloseFinance(correctedOzonFintech)) {
            WeakReference<Activity> financeActivity = this.fintechActivityLifecycleCallback.getFinanceActivity();
            if (financeActivity == null || (activity = financeActivity.get()) == null) {
                return correctedOzonFintech;
            }
            activity.finish();
            return correctedOzonFintech;
        }
        if (isOzonWebAuthWithBankRedirect(correctedOzonFintech)) {
            String c11 = x.c(correctedOzonFintech.b(), ImagesContract.URL);
            return c11 == null ? correctedOzonFintech : j.a(correctedOzonFintech, buildFintechDeeplink(w.BANK.a(), c11, true));
        }
        if (isOzonWebAuthWithRkoRedirect(correctedOzonFintech)) {
            String c12 = x.c(correctedOzonFintech.b(), ImagesContract.URL);
            return c12 == null ? correctedOzonFintech : j.a(correctedOzonFintech, buildFintechDeeplink(w.RKO.a(), c12, true));
        }
        if (isOzonWebAuthWithCheckoutRedirect(correctedOzonFintech)) {
            String c13 = x.c(correctedOzonFintech.b(), ImagesContract.URL);
            return c13 == null ? correctedOzonFintech : j.a(correctedOzonFintech, buildFintechDeeplink(w.CHECKOUT.a(), c13, true));
        }
        if (isFinanceDeeplink(correctedOzonFintech)) {
            return j.a(correctedOzonFintech, buildFintechDeeplink$default(this, w.BANK.a(), correctedOzonFintech.b().toString(), false, 4, null));
        }
        if (isCheckoutDeeplink(correctedOzonFintech)) {
            String queryParameter = correctedOzonFintech.b().getQueryParameter(ImagesContract.URL);
            if (queryParameter == null) {
                queryParameter = Kk.c.c(correctedOzonFintech, "toString(...)");
            }
            return j.a(correctedOzonFintech, buildFintechDeeplink$default(this, w.CHECKOUT.a(), queryParameter, false, 4, null));
        }
        if (!isRkoDeeplink(correctedOzonFintech)) {
            return correctedOzonFintech;
        }
        String queryParameter2 = correctedOzonFintech.b().getQueryParameter(ImagesContract.URL);
        if (queryParameter2 == null) {
            queryParameter2 = Kk.c.c(correctedOzonFintech, "toString(...)");
        }
        return j.a(correctedOzonFintech, buildFintechDeeplink$default(this, w.RKO.a(), queryParameter2, false, 4, null));
    }
}
