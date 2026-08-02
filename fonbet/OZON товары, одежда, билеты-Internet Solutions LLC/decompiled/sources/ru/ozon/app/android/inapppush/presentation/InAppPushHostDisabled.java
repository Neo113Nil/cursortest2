package ru.ozon.app.android.inapppush.presentation;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.inapppush.InAppPushConfig;
import ru.ozon.app.android.inapppush.InAppPushHost;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/inapppush/presentation/InAppPushHostDisabled;", "Lru/ozon/app/android/inapppush/InAppPushHost;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/inapppush/InAppPushConfig;", "inAppPushConfig", "", "initInAppPushSdk", "(Landroid/content/Context;Lru/ozon/app/android/inapppush/InAppPushConfig;)V", "Li10/h$c;", "pageRef", "Landroidx/fragment/app/m;", "fragment", "Landroid/widget/FrameLayout;", "container", "", "delayMs", "receiveInAppPush", "(Li10/h$c;Landroidx/fragment/app/m;Landroid/widget/FrameLayout;Ljava/lang/Long;)V", "", "pageUrl", "(Ljava/lang/String;Landroidx/fragment/app/m;Landroid/widget/FrameLayout;Ljava/lang/Long;)V", "onPageViewDestroyed", "(Li10/h$c;)V", "(Ljava/lang/String;)V", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InAppPushHostDisabled implements InAppPushHost {
    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void initInAppPushSdk(@NotNull Context context, @NotNull InAppPushConfig inAppPushConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppPushConfig, "inAppPushConfig");
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void onPageViewDestroyed(@NotNull h.c pageRef) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void receiveInAppPush(@NotNull h.c pageRef, @NotNull ComponentCallbacksC5392m fragment, @NotNull FrameLayout container, Long delayMs) {
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void onPageViewDestroyed(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
    }

    @Override // ru.ozon.app.android.inapppush.InAppPushHost
    public void receiveInAppPush(@NotNull String pageUrl, @NotNull ComponentCallbacksC5392m fragment, @NotNull FrameLayout container, Long delayMs) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
    }
}
