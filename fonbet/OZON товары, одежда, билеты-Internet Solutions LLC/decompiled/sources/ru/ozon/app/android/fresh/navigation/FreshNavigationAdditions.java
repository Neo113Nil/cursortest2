package ru.ozon.app.android.fresh.navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshNavigationAdditions;", "", "<init>", "()V", "Landroid/net/Uri;", "", "isFreshPdpSource", "(Landroid/net/Uri;)Z", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshNavigationAdditions {

    @NotNull
    public static final FreshNavigationAdditions INSTANCE = new FreshNavigationAdditions();

    private FreshNavigationAdditions() {
    }

    public final boolean isFreshPdpSource(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return MiniAppExtKt.isExpress(uri) && Intrinsics.d(uri.getQueryParameter("fresh_source_page"), "pdp_labels_nav_entity");
    }
}
