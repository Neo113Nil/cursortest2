package ru.ozon.app.android.cml.feature.tabs.navigation;

import T7.C4029k;
import android.net.Uri;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/navigation/CmlNavigation;", "", "<init>", "()V", "Landroid/net/Uri;", "cmlMainTab", "()Landroid/net/Uri;", "cmlDeliveryListTab", "cmlMapTab", "cmlSupportTab", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlNavigation {

    @NotNull
    public static final CmlNavigation INSTANCE = new CmlNavigation();

    private CmlNavigation() {
    }

    @NotNull
    public final Uri cmlDeliveryListTab() {
        return C4029k.a("ozon", "my", "c2c-deliverylist", "build(...)");
    }

    @NotNull
    public final Uri cmlMainTab() {
        Uri build = new Uri.Builder().scheme("ozon").authority("delivery").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri cmlMapTab() {
        Uri build = new Uri.Builder().scheme("ozon").authority("address_map").appendPath("map").appendPath("c2c").appendPath("common").appendQueryParameter("isTabBarVisible", "true").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri cmlSupportTab() {
        Uri build = new Uri.Builder().scheme("ozon").authority("communications").appendPath("chats").appendPath("chat").appendQueryParameter(AppsFlyerProperties.CHANNEL, "c2c_support").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
