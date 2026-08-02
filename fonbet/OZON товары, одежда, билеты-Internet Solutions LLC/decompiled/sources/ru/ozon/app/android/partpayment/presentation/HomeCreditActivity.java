package ru.ozon.app.android.partpayment.presentation;

import EZ.h;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import qZ.InterfaceC9013e;
import qZ.InterfaceC9014f;
import ru.ozon.app.android.composer.universalscreen.view.ThemeResIdProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.partpayment.R$layout;
import ru.ozon.app.android.partpayment.di.DaggerHomeCreditComponent;
import ru.ozon.app.android.partpayment.di.HomeCreditComponent;
import ru.ozon.app.android.partpayment.routing.CompoundDestinationFactory;
import ru.ozon.app.android.uikit.R$style;
import yZ.f;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u00017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\nJ)\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00106\u001a\u0002018@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/partpayment/presentation/HomeCreditActivity;", "Landroidx/appcompat/app/g;", "LyZ/f;", "LqZ/e;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "handleRedirect", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "onSupportNavigateUp", "()Z", "onNewIntent", "", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LqZ/f;", "getScreenFlowTag", "()LqZ/f;", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "setNavigatorHolder", "(LEZ/h;)V", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactory;", "compoundDestinationFactory", "Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactory;", "getCompoundDestinationFactory$homecredit_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactory;", "setCompoundDestinationFactory$homecredit_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactory;)V", "Lru/ozon/app/android/partpayment/presentation/HomeCreditNavigator;", "navigator$delegate", "LSc/j;", "getNavigator$homecredit_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/partpayment/presentation/HomeCreditNavigator;", "navigator", "Companion", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HomeCreditActivity extends g implements f, InterfaceC9013e {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public CompoundDestinationFactory compoundDestinationFactory;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navigator = k.b(new HomeCreditActivity$navigator$2(this));
    public h navigatorHolder;
    public GZ.g router;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/partpayment/presentation/HomeCreditActivity$Companion;", "", "<init>", "()V", "EXTRA_DEEPLINK", "", "EXTRA_THEME_ID", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "deeplink", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Intent createIntent(@NotNull Context context, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intent intent = new Intent(context, (Class<?>) HomeCreditActivity.class);
            intent.putExtra("ru.ozon.app.android.partpayment.presentation.PartPaymentActivity.EXTRA_DEEPLINK", deeplink);
            if (context instanceof ThemeResIdProvider) {
                intent.putExtra("ru.ozon.app.android.partpayment.presentation.PartPaymentActivity.EXTRA_THEME_ID", ((ThemeResIdProvider) context).getThemeId());
            }
            return intent;
        }

        private Companion() {
        }
    }

    private final void handleRedirect(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("ru.ozon.app.android.partpayment.presentation.PartPaymentActivity.EXTRA_DEEPLINK") : null;
        if (stringExtra != null) {
            g.a.a(getRouter(), stringExtra, null, null, 6);
        }
        if (intent != null) {
            intent.removeExtra("ru.ozon.app.android.partpayment.presentation.PartPaymentActivity.EXTRA_DEEPLINK");
        }
    }

    @NotNull
    public final CompoundDestinationFactory getCompoundDestinationFactory$homecredit_prodGoogleAllVendorsRelease() {
        CompoundDestinationFactory compoundDestinationFactory = this.compoundDestinationFactory;
        if (compoundDestinationFactory != null) {
            return compoundDestinationFactory;
        }
        Intrinsics.n("compoundDestinationFactory");
        throw null;
    }

    @NotNull
    public final HomeCreditNavigator getNavigator$homecredit_prodGoogleAllVendorsRelease() {
        return (HomeCreditNavigator) this.navigator.getValue();
    }

    @NotNull
    public final h getNavigatorHolder() {
        h hVar = this.navigatorHolder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("navigatorHolder");
        throw null;
    }

    @NotNull
    public final GZ.g getRouter() {
        GZ.g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @Override // qZ.InterfaceC9013e
    @NotNull
    public InterfaceC9014f getScreenFlowTag() {
        InterfaceC9014f screenFlowTag;
        ComponentCallbacksC5392m w02 = getSupportFragmentManager().w0();
        C9011c c9011c = w02 instanceof C9011c ? (C9011c) w02 : null;
        if (c9011c != null && (screenFlowTag = c9011c.getScreenFlowTag()) != null) {
            return screenFlowTag;
        }
        InterfaceC9014f.f81797k0.getClass();
        return InterfaceC9014f.a.a();
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((requestCode >> 16) != 0) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        ComponentCallbacksC5392m w02 = getSupportFragmentManager().w0();
        if (w02 != null) {
            w02.onActivityResult(requestCode, resultCode, data);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        HomeCreditComponent.Factory factory = DaggerHomeCreditComponent.factory();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        factory.create((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).inject(this);
        super.onCreate(savedInstanceState);
        setTheme(getIntent().getIntExtra("ru.ozon.app.android.partpayment.presentation.PartPaymentActivity.EXTRA_THEME_ID", R$style.OzonTheme));
        setContentView(R$layout.activity_home_credit);
        yZ.h.a(getNavigator$homecredit_prodGoogleAllVendorsRelease(), getNavigatorHolder(), this);
        handleRedirect(getIntent());
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleRedirect(intent);
    }

    @Override // androidx.appcompat.app.g
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
