package ru.ozon.app.android.storefront.widgets.cms.webview.widget;

import android.content.Context;
import android.view.View;
import androidx.activity.C;
import androidx.appcompat.app.g;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.databinding.WebViewWidgetBinding;
import ru.ozon.app.android.storefront.widgets.cms.webview.WebViewWidgetVO;
import ru.ozon.app.android.storefront.widgets.cms.webview.view.AspectRatioWebView;
import ru.ozon.app.android.web.webview.WebViewRouter;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001a2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001\u001aB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/webview/widget/WebViewWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/web/webview/WebViewRouter;", "router", "Landroidx/lifecycle/J;", "owner", "<init>", "(Landroid/view/View;Lru/ozon/app/android/web/webview/WebViewRouter;Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/cms/webview/WebViewWidgetVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/web/webview/WebViewRouter;", "Lru/ozon/app/android/storefront/widgets/cms/databinding/WebViewWidgetBinding;", "binding", "Lru/ozon/app/android/storefront/widgets/cms/databinding/WebViewWidgetBinding;", "Companion", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewWidgetViewHolder extends k<WebViewWidgetVO> {

    @NotNull
    private final WebViewWidgetBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final WebViewRouter router;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.cms.webview.widget.WebViewWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Boolean> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(WebViewRouter.DefaultImpls.openDeeplink$default(WebViewWidgetViewHolder.this.router, it, null, 2, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/webview/widget/WebViewWidgetViewHolder$Companion;", "", "<init>", "()V", "WEB_VIEW_MIME_TYPE", "", "WEB_VIEW_ENCODING", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewWidgetViewHolder(@NotNull View containerView, @NotNull WebViewRouter router, @NotNull J owner) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.containerView = containerView;
        this.router = router;
        WebViewWidgetBinding bind = WebViewWidgetBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        bind.webViewWidget.init(owner);
        bind.webViewWidget.setOnRedirectListener(new AnonymousClass1());
        Context context = getContext();
        final g gVar = context instanceof g ? (g) context : null;
        if (gVar != null) {
            gVar.getOnBackPressedDispatcher().h(owner, new C() { // from class: ru.ozon.app.android.storefront.widgets.cms.webview.widget.WebViewWidgetViewHolder$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(true);
                }

                @Override // androidx.activity.C
                public void handleOnBackPressed() {
                    WebViewWidgetBinding webViewWidgetBinding;
                    WebViewWidgetBinding webViewWidgetBinding2;
                    webViewWidgetBinding = WebViewWidgetViewHolder.this.binding;
                    AspectRatioWebView aspectRatioWebView = webViewWidgetBinding.webViewWidget;
                    if (aspectRatioWebView == null || !aspectRatioWebView.canGoBack()) {
                        setEnabled(false);
                        gVar.onBackPressed();
                        return;
                    }
                    webViewWidgetBinding2 = WebViewWidgetViewHolder.this.binding;
                    AspectRatioWebView aspectRatioWebView2 = webViewWidgetBinding2.webViewWidget;
                    if (aspectRatioWebView2 != null) {
                        aspectRatioWebView2.goBack();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull WebViewWidgetVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Float ratio = item.getRatio();
        if (ratio != null) {
            this.binding.webViewWidget.setRatio(ratio.floatValue());
        }
        this.binding.webViewWidget.loadData(item.getCode(), "text/html; charset=utf-8", "utf-8");
    }
}
