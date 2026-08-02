package ru.ozon.app.android.bank.navigation;

import GZ.j;
import H30.x;
import IZ.c;
import R80.w;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import U7.d;
import W80.a;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivity;
import ru.ozon.fintech.features.tabber.presentation.pay.PayActivity;
import ru.ozon.fintech.features.tabber.presentation.rko.RkoActivity;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b!\u0010\u0010J\u0017\u0010\"\u001a\u00020\u000e*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010#\u001a\u00020\u000e*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b#\u0010\u0010J\u0017\u0010$\u001a\u00020\u000e*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010%\u001a\u00020\u000e*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b%\u0010\u0010J\u0017\u0010&\u001a\u00020\u000e*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010'\u001a\u00020\u000e*\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010(\u001a\u00020\u000e2\n\u0010\u0011\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b(\u0010\u0010J#\u0010)\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b)\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u001b\u00100\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u001b\u00106\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/¨\u00068"}, d2 = {"Lru/ozon/app/android/bank/navigation/BankDeeplinkHandler;", "LIZ/c;", "Landroid/content/Context;", "context", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "settingsRko", "settingsBank", "settingsPay", "Lru/ozon/app/android/bank/navigation/BankAuthDestinationInterceptor;", "bankAuthDestinationInterceptor", "<init>", "(Landroid/content/Context;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;Lru/ozon/app/android/bank/navigation/BankAuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "", "isMyRoute", "(LGZ/j;)Z", "route", "LpZ/f;", "getFinanceLanding", "(LGZ/j;)LpZ/f;", "getBankNavDestination", "getRkoNavDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "getCheckoutNavDestination", "", "getCorrectedUrlForBankRoute", "(LGZ/j;)Ljava/lang/String;", "Landroid/net/Uri;", "uri", "getCorrectedUrlForRkoRoute", "(Landroid/net/Uri;)Ljava/lang/String;", "getCorrectedUrlForCheckoutRoute", "isOzonScheme", "isBankHost", "isCheckoutHost", "isRkoHost", "isBankTabHost", "isRkoTabHost", "isFinanceLanding", "canHandle", "getDestination", "Landroid/content/Context;", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "bankDefaultUrl$delegate", "LSc/j;", "getBankDefaultUrl", "()Ljava/lang/String;", "bankDefaultUrl", "bankDefaultPayUrl$delegate", "getBankDefaultPayUrl", "bankDefaultPayUrl", "bankDefaultRkoUrl$delegate", "getBankDefaultRkoUrl", "bankDefaultRkoUrl", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankDeeplinkHandler extends c {

    /* renamed from: bankDefaultPayUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bankDefaultPayUrl;

    /* renamed from: bankDefaultRkoUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bankDefaultRkoUrl;

    /* renamed from: bankDefaultUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bankDefaultUrl;

    @NotNull
    private final Context context;

    @NotNull
    private final ExternalFintechSettings settingsBank;

    @NotNull
    private final ExternalFintechSettings settingsPay;

    @NotNull
    private final ExternalFintechSettings settingsRko;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankDeeplinkHandler(@NotNull Context context, @NotNull ExternalFintechSettings settingsRko, @NotNull ExternalFintechSettings settingsBank, @NotNull ExternalFintechSettings settingsPay, @NotNull BankAuthDestinationInterceptor bankAuthDestinationInterceptor) {
        super(bankAuthDestinationInterceptor, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settingsRko, "settingsRko");
        Intrinsics.checkNotNullParameter(settingsBank, "settingsBank");
        Intrinsics.checkNotNullParameter(settingsPay, "settingsPay");
        Intrinsics.checkNotNullParameter(bankAuthDestinationInterceptor, "bankAuthDestinationInterceptor");
        this.context = context;
        this.settingsRko = settingsRko;
        this.settingsBank = settingsBank;
        this.settingsPay = settingsPay;
        n nVar = n.PUBLICATION;
        this.bankDefaultUrl = k.a(nVar, new BankDeeplinkHandler$bankDefaultUrl$2(this));
        this.bankDefaultPayUrl = k.a(nVar, new BankDeeplinkHandler$bankDefaultPayUrl$2(this));
        this.bankDefaultRkoUrl = k.a(nVar, new BankDeeplinkHandler$bankDefaultRkoUrl$2(this));
    }

    private final String getBankDefaultPayUrl() {
        return (String) this.bankDefaultPayUrl.getValue();
    }

    private final String getBankDefaultRkoUrl() {
        return (String) this.bankDefaultRkoUrl.getValue();
    }

    private final String getBankDefaultUrl() {
        return (String) this.bankDefaultUrl.getValue();
    }

    private final f getBankNavDestination(j route) {
        String correctedUrlForBankRoute = getCorrectedUrlForBankRoute(route);
        int i11 = FinanceActivity.f96328u0;
        return new C8880a(new a.C0590a(FinanceActivity.a.a(this.context, correctedUrlForBankRoute)).a());
    }

    private final f getCheckoutNavDestination(Context context, j route) {
        String correctedUrlForCheckoutRoute = getCorrectedUrlForCheckoutRoute(route.b());
        int i11 = PayActivity.f96334t0;
        return new C8880a(PayActivity.a.a(context, correctedUrlForCheckoutRoute));
    }

    private final String getCorrectedUrlForBankRoute(j route) {
        if (!isOzonScheme(route) || !isBankHost(route)) {
            return isBankTabHost(route) ? d.e(getBankDefaultUrl(), "/promo/bank-tab") : Kk.c.c(route, "toString(...)");
        }
        String c11 = x.c(route.b(), ImagesContract.URL);
        if (c11 != null) {
            if (c11.length() <= 0) {
                c11 = null;
            }
            if (c11 != null) {
                return c11;
            }
        }
        return d.e(getBankDefaultUrl(), "/wv");
    }

    private final String getCorrectedUrlForCheckoutRoute(Uri uri) {
        String c11 = x.c(uri, ImagesContract.URL);
        if (c11 != null) {
            if (c11.length() <= 0) {
                c11 = null;
            }
            if (c11 != null) {
                return c11;
            }
        }
        return getBankDefaultPayUrl();
    }

    private final String getCorrectedUrlForRkoRoute(Uri uri) {
        String c11 = x.c(uri, ImagesContract.URL);
        if (c11 != null) {
            if (c11.length() <= 0) {
                c11 = null;
            }
            if (c11 != null) {
                return c11;
            }
        }
        return d.e(getBankDefaultRkoUrl(), "/business/bx/app/tab");
    }

    private final f getFinanceLanding(j route) {
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(new h.c.a(Kk.c.c(route, "toString(...)"), (String) null, (String) null, 14), null, false, null, true, false, false, false, null, false, false, false, null, null, Integer.valueOf(R$color.oz_semantic_bg_primary), null, false, null, null, null, false, false, null, null, 16760814, null), Kk.c.c(route, "toString(...)"), R$id.menu_bank, null, false, false, null, 120, null);
    }

    private final f getRkoNavDestination(Context context, j route) {
        String correctedUrlForRkoRoute = getCorrectedUrlForRkoRoute(route.b());
        int i11 = RkoActivity.f96340t0;
        return new C8880a(new a.C0590a(RkoActivity.a.a(context, correctedUrlForRkoRoute)).a());
    }

    private final boolean isBankHost(j jVar) {
        return Intrinsics.d(jVar.b().getAuthority(), w.BANK.a());
    }

    private final boolean isBankTabHost(j jVar) {
        return Lh.a.f(jVar, "banktab");
    }

    private final boolean isCheckoutHost(j jVar) {
        return Intrinsics.d(jVar.b().getAuthority(), w.CHECKOUT.a());
    }

    private final boolean isFinanceLanding(j jVar) {
        String str;
        if (!Lh.a.f(jVar, "finance")) {
            return false;
        }
        Uri b11 = jVar.b();
        Intrinsics.checkNotNullParameter(b11, "<this>");
        Intrinsics.checkNotNullParameter(b11, "<this>");
        String str2 = null;
        List<String> pathSegments = b11.isHierarchical() ? b11.getPathSegments() : null;
        if (pathSegments != null && (str = (String) C7714v.M(pathSegments)) != null) {
            str2 = str.toString();
        }
        return Intrinsics.d(str2, "banklanding");
    }

    private final boolean isMyRoute(j jVar) {
        if (isOzonScheme(jVar)) {
            return isBankTabHost(jVar) || isRkoTabHost(jVar) || isFinanceLanding(jVar) || isBankHost(jVar) || isCheckoutHost(jVar) || isRkoHost(jVar);
        }
        return false;
    }

    private final boolean isOzonScheme(j jVar) {
        return Intrinsics.d(jVar.b().getScheme(), "ozon");
    }

    private final boolean isRkoHost(j jVar) {
        return Intrinsics.d(jVar.b().getAuthority(), w.RKO.a());
    }

    private final boolean isRkoTabHost(j jVar) {
        return Lh.a.f(jVar, "rkotab");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return isMyRoute(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        if (isFinanceLanding(route)) {
            return getFinanceLanding(route);
        }
        if (isBankHost(route) || isBankTabHost(route)) {
            return getBankNavDestination(route);
        }
        if (isRkoHost(route) || isRkoTabHost(route)) {
            return getRkoNavDestination(context, route);
        }
        if (isCheckoutHost(route)) {
            return getCheckoutNavDestination(context, route);
        }
        L80.a.a("BankDeeplinkHandler", "Unknown destination for deeplink = " + route.b());
        return getBankNavDestination(route);
    }
}
