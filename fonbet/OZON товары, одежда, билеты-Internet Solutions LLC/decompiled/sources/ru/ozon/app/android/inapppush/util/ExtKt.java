package ru.ozon.app.android.inapppush.util;

import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.inapppush.InAppPushHost;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/m;", "Lru/ozon/app/android/inapppush/InAppPushHost;", "getInAppPushHost", "(Landroidx/fragment/app/m;)Lru/ozon/app/android/inapppush/InAppPushHost;", "inAppPushHost", "in-app-push_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtKt {
    public static final InAppPushHost getInAppPushHost(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        M activity = componentCallbacksC5392m.getActivity();
        InAppHostProvider inAppHostProvider = activity instanceof InAppHostProvider ? (InAppHostProvider) activity : null;
        if (inAppHostProvider != null) {
            return inAppHostProvider.getInAppHost();
        }
        return null;
    }
}
