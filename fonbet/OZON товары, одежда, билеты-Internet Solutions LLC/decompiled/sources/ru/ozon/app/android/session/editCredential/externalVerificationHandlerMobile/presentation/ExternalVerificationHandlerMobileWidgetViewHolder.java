package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import GZ.g;
import Ib0.c;
import LZ.b;
import Ob0.a;
import Pb0.e;
import Sc.o;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.lifecycle.C0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.ExternalVerificationJavascriptObject;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.OtpResponseModel;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.web.webview.OzonWebView;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b \u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010\u0017J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010,R\u001a\u0010-\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationHandlerMobileWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;", "Lru/ozon/app/android/web/webview/OzonWebView;", "view", "Landroid/view/ViewGroup;", "container", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel;", "viewModel", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "LOb0/a;", "ozonIdAppApi", "LGZ/g;", "ozonRouter", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "<init>", "(Lru/ozon/app/android/web/webview/OzonWebView;Landroid/view/ViewGroup;Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel;La00/f;LOb0/a;LGZ/g;Ll10/b;)V", "", "setupWebView", "()V", "", "message", "handlePostMessage", "(Ljava/lang/String;)V", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/OtpResponseModel;", "state", "renderState", "(Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/OtpResponseModel;)V", "showError", "item", "bind", "(Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;)V", "onWidgetCreated", "onWidgetDestroyed", "Lru/ozon/app/android/web/webview/OzonWebView;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel;", "La00/f;", "LOb0/a;", "LGZ/g;", "Ll10/b;", "metricView", "getMetricView", "()Lru/ozon/app/android/web/webview/OzonWebView;", "", "isJavascriptInjectionAllowed", "Z", "Lxe/B0;", "collectEventJob", "Lxe/B0;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalVerificationHandlerMobileWidgetViewHolder extends AbstractC6065b<ExternalVerificationVO> {
    private B0 collectEventJob;

    @NotNull
    private final ViewGroup container;

    @NotNull
    private final InterfaceC7851b controller;
    private boolean isJavascriptInjectionAllowed;

    @NotNull
    private final OzonWebView metricView;

    @NotNull
    private final C4911f ownerContainer;

    @NotNull
    private final a ozonIdAppApi;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final OzonWebView view;

    @NotNull
    private final ExternalVerificationViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationHandlerMobileWidgetViewHolder$Companion;", "", "<init>", "()V", "JS_INTERFACE_NAME", "", "POST_MESSAGE_LISTENER_SCRIPT", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ExternalVerificationHandlerMobileWidgetViewHolder(@NotNull OzonWebView view, @NotNull ViewGroup container, @NotNull ExternalVerificationViewModel viewModel, @NotNull C4911f ownerContainer, @NotNull a ozonIdAppApi, @NotNull g ozonRouter, @NotNull InterfaceC7851b controller) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.view = view;
        this.container = container;
        this.viewModel = viewModel;
        this.ownerContainer = ownerContainer;
        this.ozonIdAppApi = ozonIdAppApi;
        this.ozonRouter = ozonRouter;
        this.controller = controller;
        this.metricView = view;
        setupWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePostMessage(String message) {
        ExternalVerificationVO boundData = getBoundData();
        if (boundData != null) {
            this.viewModel.handleMessage(message, boundData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderState(final OtpResponseModel state) {
        if (state instanceof OtpResponseModel.Init) {
            return;
        }
        if (state instanceof OtpResponseModel.StartOtp) {
            this.ozonRouter.c(new b(new C8880a(this.ozonIdAppApi.g(new e(this, state) { // from class: ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationHandlerMobileWidgetViewHolder$renderState$otpFlowConfig$1
                private final r activity;
                private final c onOtpFlowResult;
                private final String otpToken;

                {
                    C4911f c4911f;
                    c4911f = this.ownerContainer;
                    this.activity = c4911f.i();
                    this.otpToken = ((OtpResponseModel.StartOtp) state).getOtpToken();
                    this.onOtpFlowResult = new c() { // from class: ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationHandlerMobileWidgetViewHolder$renderState$otpFlowConfig$1$onOtpFlowResult$1
                        @Override // Ib0.c
                        public void onOtpFlowResult(c.a otpFlowResult) {
                            ExternalVerificationViewModel externalVerificationViewModel;
                            Intrinsics.checkNotNullParameter(otpFlowResult, "otpFlowResult");
                            externalVerificationViewModel = ExternalVerificationHandlerMobileWidgetViewHolder.this.viewModel;
                            externalVerificationViewModel.onOtpFlowResult(ExternalVerificationHandlerMobileWidgetViewHolder.this.getBoundData(), otpFlowResult);
                        }
                    };
                }

                @Override // Pb0.e
                public c getOnOtpFlowResult() {
                    return this.onOtpFlowResult;
                }

                @Override // Pb0.e
                public String getOtpToken() {
                    return this.otpToken;
                }

                @Override // Pb0.e
                public r getActivity() {
                    return this.activity;
                }
            }), null, null)), null);
            return;
        }
        if (state instanceof OtpResponseModel.Completed) {
            ComposerExtKt.setResult$default(this.ownerContainer, null, 0, new ExternalVerificationHandlerMobileWidgetViewHolder$renderState$1(state), 3, null);
            ComposerExtKt.closeFlow(this.ownerContainer);
            return;
        }
        if (state instanceof OtpResponseModel.Error) {
            showError(((OtpResponseModel.Error) state).getMessage());
            ComposerExtKt.closeFlow(this.ownerContainer);
        } else if (state instanceof OtpResponseModel.Reload) {
            InterfaceC7851b.a.a(this.controller, ((OtpResponseModel.Reload) state).getDeeplink(), null, null, null, 14);
        } else if (state instanceof OtpResponseModel.CancelOtpFlow) {
            ComposerExtKt.closeFlow(this.ownerContainer);
        } else {
            if (!(state instanceof OtpResponseModel.Deeplink)) {
                throw new o();
            }
            g.a.a(this.ozonRouter, ((OtpResponseModel.Deeplink) state).getDeeplink(), null, null, 6);
        }
    }

    private final void setupWebView() {
        this.view.init(this.ownerContainer.f());
        ExternalVerificationJavascriptObject externalVerificationJavascriptObject = new ExternalVerificationJavascriptObject(new ExternalVerificationHandlerMobileWidgetViewHolder$setupWebView$jsObject$1(this));
        OzonWebView ozonWebView = this.view;
        ozonWebView.setFullscreen(true);
        ozonWebView.addJavascriptInterface(externalVerificationJavascriptObject, "ExternalVerificationInterface");
        ozonWebView.setOnPageStartListener(new ExternalVerificationHandlerMobileWidgetViewHolder$setupWebView$1$1(this));
        ozonWebView.setOnPageFinishedListener(new ExternalVerificationHandlerMobileWidgetViewHolder$setupWebView$1$2(this, ozonWebView));
    }

    private final void showError(String message) {
        OzonSpannableString ozonSpannableString;
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        ViewGroup rootView = ContextExtKt.getRootView(this.ownerContainer.a());
        if (rootView == null) {
            return;
        }
        if (message == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message)) == null) {
            ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString("");
        }
        FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, null, null, null, null, null, null, null, null, null, null, null, this.ownerContainer.g(), 65530, null).show();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.container.addView(this.view);
        View rootView = this.view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        J a11 = C0.a(rootView);
        if (a11 == null) {
            renderState(new OtpResponseModel.Error(StringProvider.getString(R$string.error_common_message_service_error)));
        } else {
            this.collectEventJob = C10727i.c(K.a(a11), null, null, new ExternalVerificationHandlerMobileWidgetViewHolder$onWidgetCreated$1(this, null), 3);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        B0 b02 = this.collectEventJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.collectEventJob = null;
        this.container.removeView(this.view);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ExternalVerificationVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.loadUrl(item.getUrl());
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public OzonWebView getMetricView() {
        return this.metricView;
    }
}
