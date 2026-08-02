package ru.ozon.app.android.inapppush;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import i10.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/inapppush/InAppPushHost;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/inapppush/InAppPushConfig;", "inAppPushConfig", "", "initInAppPushSdk", "(Landroid/content/Context;Lru/ozon/app/android/inapppush/InAppPushConfig;)V", "Li10/h$c;", "pageRef", "Landroidx/fragment/app/m;", "fragment", "Landroid/widget/FrameLayout;", "container", "", "delayMs", "receiveInAppPush", "(Li10/h$c;Landroidx/fragment/app/m;Landroid/widget/FrameLayout;Ljava/lang/Long;)V", "", "pageUrl", "(Ljava/lang/String;Landroidx/fragment/app/m;Landroid/widget/FrameLayout;Ljava/lang/Long;)V", "onPageViewDestroyed", "(Li10/h$c;)V", "(Ljava/lang/String;)V", "in-app-push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InAppPushHost {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void initInAppPushSdk$default(InAppPushHost inAppPushHost, Context context, InAppPushConfig inAppPushConfig, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initInAppPushSdk");
            }
            if ((i11 & 2) != 0) {
                inAppPushConfig = new InAppPushConfig(null, null, null, 7, null);
            }
            inAppPushHost.initInAppPushSdk(context, inAppPushConfig);
        }

        public static /* synthetic */ void receiveInAppPush$default(InAppPushHost inAppPushHost, h.c cVar, ComponentCallbacksC5392m componentCallbacksC5392m, FrameLayout frameLayout, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveInAppPush");
            }
            if ((i11 & 8) != 0) {
                l11 = null;
            }
            inAppPushHost.receiveInAppPush(cVar, componentCallbacksC5392m, frameLayout, l11);
        }

        public static /* synthetic */ void receiveInAppPush$default(InAppPushHost inAppPushHost, String str, ComponentCallbacksC5392m componentCallbacksC5392m, FrameLayout frameLayout, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveInAppPush");
            }
            if ((i11 & 8) != 0) {
                l11 = null;
            }
            inAppPushHost.receiveInAppPush(str, componentCallbacksC5392m, frameLayout, l11);
        }
    }

    void initInAppPushSdk(@NotNull Context context, @NotNull InAppPushConfig inAppPushConfig);

    void onPageViewDestroyed(@NotNull h.c pageRef);

    void onPageViewDestroyed(@NotNull String pageUrl);

    void receiveInAppPush(@NotNull h.c pageRef, @NotNull ComponentCallbacksC5392m fragment, @NotNull FrameLayout container, Long delayMs);

    void receiveInAppPush(@NotNull String pageUrl, @NotNull ComponentCallbacksC5392m fragment, @NotNull FrameLayout container, Long delayMs);
}
