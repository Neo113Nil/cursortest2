package ru.ozon.app.android.navigation.miniapp;

import BZ.e;
import BZ.f;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0007¢\u0006\u0004\b\u0005\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0004*\u00020\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\n*\u00020\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\n*\u00020\u0007¢\u0006\u0004\b\u000e\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\n*\u00020\u0007¢\u0006\u0004\b\u000f\u0010\f\"\u0015\u0010\u0011\u001a\u00020\u0004*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/content/Context;", "", "getMiniAppName", "(Landroid/content/Context;)Ljava/lang/String;", "", "isExpress", "(Landroid/content/Context;)Z", "Landroid/net/Uri;", "(Landroid/net/Uri;)Z", "isMiniApp", "Landroid/net/Uri$Builder;", "appendExpress", "(Landroid/net/Uri;)Landroid/net/Uri$Builder;", "appendExpressMinimarket", "appendTravel", "appendTravelAndTcrm", "LBZ/e;", "isMain", "(LBZ/e;)Z", "navigation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MiniAppExtKt {
    @NotNull
    public static final Uri.Builder appendExpress(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("miniapp", "supermarket");
        Intrinsics.checkNotNullExpressionValue(appendQueryParameter, "appendQueryParameter(...)");
        return appendQueryParameter;
    }

    @NotNull
    public static final Uri.Builder appendExpressMinimarket(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("miniapp", "supermarket").appendQueryParameter("selectedExpressCategory", "minimarket");
        Intrinsics.checkNotNullExpressionValue(appendQueryParameter, "appendQueryParameter(...)");
        return appendQueryParameter;
    }

    @NotNull
    public static final Uri.Builder appendTravel(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("miniapp", "travel");
        Intrinsics.checkNotNullExpressionValue(appendQueryParameter, "appendQueryParameter(...)");
        return appendQueryParameter;
    }

    @NotNull
    public static final Uri.Builder appendTravelAndTcrm(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("miniapp", "travel").appendQueryParameter(AppsFlyerProperties.CHANNEL, "TCRM");
        Intrinsics.checkNotNullExpressionValue(appendQueryParameter, "appendQueryParameter(...)");
        return appendQueryParameter;
    }

    @InterfaceC3999a
    public static final String getMiniAppName(Context context) {
        if (context == null) {
            return null;
        }
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        return f.a(((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).getMiniAppConfigHolder());
    }

    public static final boolean isExpress(Context context) {
        return Intrinsics.d(getMiniAppName(context), "supermarket");
    }

    public static final boolean isMain(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return Intrinsics.d(eVar.g().b(), "main");
    }

    public static final boolean isMiniApp(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String queryParameter = uri.getQueryParameter("miniapp");
        return queryParameter != null && queryParameter.length() > 0;
    }

    public static final boolean isExpress(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.d(uri.getQueryParameter("miniapp"), "supermarket");
    }
}
