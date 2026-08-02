package com.socure.docv.capturesdk.feature.consent.ui;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgsLazy;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.view.CustomToolbar;
import com.socure.docv.capturesdk.databinding.DialogConsentSocureBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ConsentDialog.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", StepData.ARGS, "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentDialogArgs;", "getArgs", "()Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentDialogArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConsentDialog extends DialogFragment {
    public static final int $stable = 8;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final NavArgsLazy args;

    public ConsentDialog() {
        final ConsentDialog consentDialog = this;
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(ConsentDialogArgs.class), new Function0<Bundle>() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentDialog$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bundle invoke() {
                Bundle arguments = Fragment.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ConsentDialogArgs getArgs() {
        return (ConsentDialogArgs) this.args.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoggerKt.logD("SDLT_CDF", "onCreate");
        setStyle(1, R.style.Theme.WithActionBar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final DialogConsentSocureBinding inflate = DialogConsentSocureBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        inflate.clConsentToolbar.hideBack();
        inflate.clConsentToolbar.setCloseListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentDialog.onCreateView$lambda$0(ConsentDialog.this, view);
            }
        });
        Context context = getContext();
        if (context != null) {
            inflate.clConsentToolbar.setToolbarBg(ContextCompat.getColor(context, com.socure.docv.capturesdk.R.color.socure_white));
        }
        CustomToolbar customToolbar = inflate.clConsentToolbar;
        String closeContentDescription = getArgs().getCloseContentDescription();
        Intrinsics.checkNotNullExpressionValue(closeContentDescription, "args.closeContentDescription");
        customToolbar.setCloseContentDescription(closeContentDescription);
        inflate.wvConsentPrivacy.setWebViewClient(new WebViewClient() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentDialog$onCreateView$3
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                DialogConsentSocureBinding.this.pbWebLoading.setVisibility(8);
            }
        });
        inflate.wvConsentPrivacy.loadUrl(getArgs().getPrivacyPolicyLink());
        inflate.wvConsentPrivacy.setOnKeyListener(new View.OnKeyListener() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                boolean onCreateView$lambda$2;
                onCreateView$lambda$2 = ConsentDialog.onCreateView$lambda$2(DialogConsentSocureBinding.this, view, i, keyEvent);
                return onCreateView$lambda$2;
            }
        });
        return inflate.getRoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(ConsentDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreateView$lambda$2(DialogConsentSocureBinding binding, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        if (i != 4 || keyEvent.getAction() != 1 || !binding.wvConsentPrivacy.canGoBack()) {
            return false;
        }
        binding.wvConsentPrivacy.goBack();
        return true;
    }
}
