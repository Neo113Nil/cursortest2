package ru.ozon.app.android.web;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.web.webview.WebViewRouter;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/appcompat/widget/AppCompatTextView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebFragment$titleTextView$2 extends AbstractC7737t implements Function0<AppCompatTextView> {
    final /* synthetic */ WebFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebFragment$titleTextView$2(WebFragment webFragment) {
        super(0);
        this.this$0 = webFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(WebFragment webFragment, View view) {
        String regularDrawDeeplink;
        WebViewRouter webViewRouter = webFragment.getWebViewRouter();
        regularDrawDeeplink = WebFragment.INSTANCE.getRegularDrawDeeplink();
        webViewRouter.dismissAndRedirect(regularDrawDeeplink);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppCompatTextView invoke() {
        int i11;
        boolean isRegularDrawWebView;
        boolean isRegularDrawWebView2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.this$0.requireContext());
        final WebFragment webFragment = this.this$0;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        appCompatTextView.setGravity(17);
        i11 = WebFragment.dp16;
        marginLayoutParams.setMarginEnd(i11);
        appCompatTextView.setLayoutParams(marginLayoutParams);
        Context requireContext = webFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, requireContext, R$style.TextStyle_Body_L_Bold);
        isRegularDrawWebView = webFragment.isRegularDrawWebView();
        appCompatTextView.setTextColor(isRegularDrawWebView ? webFragment.getContentColor() : webFragment.getTitleColor());
        isRegularDrawWebView2 = webFragment.isRegularDrawWebView();
        if (isRegularDrawWebView2) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.web.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WebFragment$titleTextView$2.invoke$lambda$2$lambda$1(WebFragment.this, view);
                }
            });
        }
        return appCompatTextView;
    }
}
