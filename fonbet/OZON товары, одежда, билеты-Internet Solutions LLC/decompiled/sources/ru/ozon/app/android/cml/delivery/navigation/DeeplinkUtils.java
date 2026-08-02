package ru.ozon.app.android.cml.delivery.navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/navigation/DeeplinkUtils;", "", "<init>", "()V", "Landroid/net/Uri;", "", "isCmlMiniApp", "(Landroid/net/Uri;)Z", "deeplink", "isEditMode", "needRefresh", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeeplinkUtils {

    @NotNull
    public static final DeeplinkUtils INSTANCE = new DeeplinkUtils();

    private DeeplinkUtils() {
    }

    public final boolean isCmlMiniApp(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.d(uri.getQueryParameter("miniapp"), "cml");
    }

    public final boolean isEditMode(@NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.d(deeplink.getQueryParameter("mode"), "edit_order");
    }

    public final boolean needRefresh(@NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.d(deeplink.getQueryParameter("refresh"), "true");
    }
}
