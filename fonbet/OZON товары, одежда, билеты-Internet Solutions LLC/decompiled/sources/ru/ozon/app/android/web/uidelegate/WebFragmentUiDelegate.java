package ru.ozon.app.android.web.uidelegate;

import Ql.c;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.core.graphics.d;
import androidx.core.view.C5334o0;
import androidx.core.view.C5353y0;
import androidx.core.view.Q0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.feature.common.web.databinding.FragmentWebStandardBinding;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate;
import ru.ozon.app.android.web.webview.OzonWebView;
import ru.ozon.app.android.web.webview.WebViewRouter;
import ru.ozon.app.android.web.webview.jsInterface.OzonAppJsInterface;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/web/uidelegate/WebFragmentUiDelegate;", "", "applyUi", "", "fragment", "Lru/ozon/app/android/web/WebFragment;", "binding", "Lru/ozon/app/android/feature/common/web/databinding/FragmentWebStandardBinding;", "condition", "", "restoreUi", "Ai", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WebFragmentUiDelegate {

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001-B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0019\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/web/uidelegate/WebFragmentUiDelegate$Ai;", "Lru/ozon/app/android/web/uidelegate/WebFragmentUiDelegate;", "Lru/ozon/app/android/web/webview/WebViewRouter;", "webViewRouter", "Lcom/squareup/moshi/Moshi;", "moshi", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/web/webview/WebViewRouter;Lcom/squareup/moshi/Moshi;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/web/webview/OzonWebView;", "", "actionDTOJson", "", "onNotificationClickJs", "(Lru/ozon/app/android/web/webview/OzonWebView;Ljava/lang/String;)V", "Landroidx/fragment/app/m;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "layoutManager", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "onNotificationClick", "showNotification", "(Landroidx/fragment/app/m;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/web/WebFragment;", "fragment", "Lru/ozon/app/android/feature/common/web/databinding/FragmentWebStandardBinding;", "binding", "", "condition", "applyUi", "(Lru/ozon/app/android/web/WebFragment;Lru/ozon/app/android/feature/common/web/databinding/FragmentWebStandardBinding;Z)V", "restoreUi", "(Lru/ozon/app/android/web/WebFragment;Z)V", "Lru/ozon/app/android/web/webview/WebViewRouter;", "Lcom/squareup/moshi/Moshi;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "originalNavigationBarColor", "I", "originalIsAppearanceLightNavigationBars", "Z", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ai implements WebFragmentUiDelegate {

        @NotNull
        private final JsonParser jsonDeserializer;

        @NotNull
        private final Moshi moshi;
        private boolean originalIsAppearanceLightNavigationBars;
        private int originalNavigationBarColor;

        @NotNull
        private final WebViewRouter webViewRouter;

        public Ai(@NotNull WebViewRouter webViewRouter, @NotNull Moshi moshi, @NotNull JsonParser jsonDeserializer) {
            Intrinsics.checkNotNullParameter(webViewRouter, "webViewRouter");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
            this.webViewRouter = webViewRouter;
            this.moshi = moshi;
            this.jsonDeserializer = jsonDeserializer;
            this.originalIsAppearanceLightNavigationBars = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5353y0 applyUi$lambda$0(View view, C5353y0 c5353y0) {
            d a11 = c.a(view, "view", c5353y0, "insets", 8);
            Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
            d f7 = c5353y0.f(2);
            Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
            view.setPadding(0, 0, 0, a11.f42129d - f7.f42129d);
            return c5353y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onNotificationClickJs(OzonWebView ozonWebView, String str) {
            ozonWebView.evaluateJavascript(h.E0("\n                            if (typeof window.onClickNotification === 'function') {\n                                window.onClickNotification(" + str + ");\n                            } else {\n                                console.error('window.onClickNotification is not available');\n                            }\n                        "), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showNotification(final ComponentCallbacksC5392m componentCallbacksC5392m, final NotificationDTO notificationDTO, final NotificationLayoutManager notificationLayoutManager, final Function1<? super AtomActionDTO, Unit> function1) {
            r requireActivity = componentCallbacksC5392m.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            requireActivity.runOnUiThread(new Runnable() { // from class: IY.a
                @Override // java.lang.Runnable
                public final void run() {
                    WebFragmentUiDelegate.Ai.showNotification$lambda$1(NotificationLayoutManager.this, notificationDTO, componentCallbacksC5392m, function1);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showNotification$lambda$1(NotificationLayoutManager notificationLayoutManager, NotificationDTO notificationDTO, ComponentCallbacksC5392m componentCallbacksC5392m, Function1 function1) {
            NotificationBar.Companion companion = NotificationBar.INSTANCE;
            J viewLifecycleOwner = componentCallbacksC5392m.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            companion.make(notificationLayoutManager, notificationDTO, viewLifecycleOwner, new WebFragmentUiDelegate$Ai$showNotification$1$1(notificationDTO, function1)).show();
        }

        @Override // ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate
        public void applyUi(@NotNull WebFragment fragment, @NotNull FragmentWebStandardBinding binding, boolean condition) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(binding, "binding");
            if (condition) {
                Window window = fragment.requireActivity().getWindow();
                Q0 q02 = new Q0(window.getDecorView(), window);
                Intrinsics.checkNotNullExpressionValue(q02, "getInsetsController(...)");
                this.originalNavigationBarColor = window.getNavigationBarColor();
                this.originalIsAppearanceLightNavigationBars = q02.b();
                WebView webView = binding.webView.getWebView();
                if (webView != null) {
                    webView.setOverScrollMode(2);
                }
                binding.getConstraintLayout().setFitsSystemWindows(false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                C5334o0.a(window, false);
                StatusBarController.INSTANCE.setStatusBarContentColor(fragment, StatusBarController.UpdateReason.NewState.INSTANCE, false, true);
                q02.d(true);
                Y.J(binding.getConstraintLayout(), new H3.c());
                binding.webView.addJavascriptInterface(new OzonAppJsInterface(this.webViewRouter, this.jsonDeserializer, new WebFragmentUiDelegate$Ai$applyUi$2(this, fragment, binding)), "ozonApp");
            }
        }

        @Override // ru.ozon.app.android.web.uidelegate.WebFragmentUiDelegate
        public void restoreUi(@NotNull WebFragment fragment, boolean condition) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            if (condition) {
                Window window = fragment.requireActivity().getWindow();
                Q0 q02 = new Q0(window.getDecorView(), window);
                Intrinsics.checkNotNullExpressionValue(q02, "getInsetsController(...)");
                StatusBarController.setStatusBarColorByTheme$default(StatusBarController.INSTANCE, fragment, StatusBarController.UpdateReason.Recovery.INSTANCE, 0, 4, null);
                window.setNavigationBarColor(this.originalNavigationBarColor);
                q02.d(this.originalIsAppearanceLightNavigationBars);
                C5334o0.a(window, true);
            }
        }
    }

    void applyUi(@NotNull WebFragment fragment, @NotNull FragmentWebStandardBinding binding, boolean condition);

    void restoreUi(@NotNull WebFragment fragment, boolean condition);
}
