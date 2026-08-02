package ru.ozon.app.android.checkoutui.configurators;

import B90.J;
import QZ.a;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import i10.C6997c;
import i10.h;
import j10.InterfaceC7238a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutui/configurators/CheckoutRefreshConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "setRefreshResultListener", "", "rootUrl", "Landroid/os/Bundle;", "data", "buildUrl", "(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutRefreshConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final String buildUrl(String rootUrl, Bundle data) {
        String string = data.getString("wh");
        if (string == null) {
            return rootUrl;
        }
        Uri.Builder buildUpon = Uri.parse(rootUrl).buildUpon();
        buildUpon.appendQueryParameter("wh", string);
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final void setRefreshResultListener() {
        G supportFragmentManager;
        r a11 = getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.n1("checkout_refresh", getContainer().f(), new J(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRefreshResultListener$lambda$1(CheckoutRefreshConfigurator checkoutRefreshConfigurator, String str, Bundle data) {
        InterfaceC7851b controller;
        C7475g composerWidgetComponentStorage;
        a<? extends C7854a> composer;
        InterfaceC7238a<? extends C7854a> r11;
        C6997c<? extends C7854a> b11;
        h l11;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(data, "data");
        ConfiguratorReferences references = checkoutRefreshConfigurator.getReferences();
        String j11 = (references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null || (composer = ((RetainComposerComponentApi) composerWidgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposer()) == null || (r11 = composer.r()) == null || (b11 = r11.b()) == null || (l11 = b11.l()) == null) ? null : l11.j();
        if (j11 != null) {
            String buildUrl = checkoutRefreshConfigurator.buildUrl(j11, data);
            ConfiguratorReferences references2 = checkoutRefreshConfigurator.getReferences();
            if (references2 == null || (controller = references2.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller, buildUrl, null, null, null, 14);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        setRefreshResultListener();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull androidx.lifecycle.J owner) {
        G supportFragmentManager;
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.s("checkout_refresh");
    }
}
