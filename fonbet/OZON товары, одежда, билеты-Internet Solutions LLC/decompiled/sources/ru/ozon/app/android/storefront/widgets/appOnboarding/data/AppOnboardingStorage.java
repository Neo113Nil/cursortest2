package ru.ozon.app.android.storefront.widgets.appOnboarding.data;

import C.C2702w;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u0012\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingStorage;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isShown", "()Z", "", "markAsShown", "()V", "openedAsWizard", "markAsWizard", "markAsNotWizard", "Landroid/net/Uri;", "deeplink", "referrer", "setRedirectData", "(Landroid/net/Uri;Landroid/net/Uri;)V", "Lkotlin/Pair;", "redirectData", "()Lkotlin/Pair;", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "LSc/j;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Z", "redirectDeeplink", "Landroid/net/Uri;", "redirectReferrer", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppOnboardingStorage {

    @NotNull
    private final Context context;
    private boolean openedAsWizard;
    private Uri redirectDeeplink;
    private Uri redirectReferrer;

    /* renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sharedPreferences;
    public static final int $stable = 8;

    public AppOnboardingStorage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.sharedPreferences = k.b(new AppOnboardingStorage$sharedPreferences$2(this));
    }

    private final SharedPreferences getSharedPreferences() {
        Object value = this.sharedPreferences.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final boolean isShown() {
        return getSharedPreferences().getBoolean("ru.ozon.app.android.storefront.widgets.appOnboarding.APP_ONBOARDING_PREF_KEY", false);
    }

    public final void markAsNotWizard() {
        this.openedAsWizard = false;
    }

    public final void markAsShown() {
        C2702w.e(getSharedPreferences(), "ru.ozon.app.android.storefront.widgets.appOnboarding.APP_ONBOARDING_PREF_KEY", true);
    }

    public final void markAsWizard() {
        this.openedAsWizard = true;
    }

    /* renamed from: openedAsWizard, reason: from getter */
    public final boolean getOpenedAsWizard() {
        return this.openedAsWizard;
    }

    @NotNull
    public final Pair<Uri, Uri> redirectData() {
        Pair<Uri, Uri> pair = new Pair<>(this.redirectDeeplink, this.redirectReferrer);
        this.redirectDeeplink = null;
        this.redirectReferrer = null;
        return pair;
    }

    public final void setRedirectData(Uri deeplink, Uri referrer) {
        this.redirectDeeplink = deeplink;
        this.redirectReferrer = referrer;
    }
}
