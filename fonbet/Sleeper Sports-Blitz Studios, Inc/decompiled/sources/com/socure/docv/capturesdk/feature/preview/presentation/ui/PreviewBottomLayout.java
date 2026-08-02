package com.socure.docv.capturesdk.feature.preview.presentation.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.henninghall.date_picker.props.TextColorProp;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.common.view.model.Button;
import io.sentry.Session;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreviewBottomLayout.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010*\u001a\u00020+H\u0002J\u000e\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101J\u0010\u00102\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101J \u00103\u001a\u00020+2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u00010.J \u00107\u001a\u00020+2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u00010.J \u00109\u001a\u00020+2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020.H\u0002J\u000e\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020<J.\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007J\b\u0010C\u001a\u00020+H\u0002R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR#\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0018\u001a\n \u000b*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\n \u000b*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001e\u0010\u0016R#\u0010 \u001a\n \u000b*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b\"\u0010#R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010'\u001a\n \u000b*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b(\u0010\u0016¨\u0006D"}, d2 = {"Lcom/socure/docv/capturesdk/feature/preview/presentation/ui/PreviewBottomLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "btnContinue", "Landroidx/appcompat/widget/AppCompatButton;", "kotlin.jvm.PlatformType", "getBtnContinue", "()Landroidx/appcompat/widget/AppCompatButton;", "btnContinue$delegate", "Lkotlin/Lazy;", "btnRetake", "getBtnRetake", "btnRetake$delegate", "confirmationView", "Landroid/view/View;", "getConfirmationView", "()Landroid/view/View;", "confirmationView$delegate", "pbVerification", "Landroid/widget/ProgressBar;", "getPbVerification", "()Landroid/widget/ProgressBar;", "pbVerification$delegate", "progressView", "getProgressView", "progressView$delegate", "tvProgress", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvProgress", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvProgress$delegate", "valueAnimator", "Landroid/animation/ValueAnimator;", ViewHierarchyConstants.VIEW_KEY, "getView", "view$delegate", "createAndStartAnim", "", "progressComplete", "successLabel", "", "setContinueListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "setRetakeListener", "setUpContinueButton", "contBtnText", "color", "bgColor", "setUpRetakeButton", ViewProps.BORDER_COLOR, "setUpRetakeIVSButton", "showRetake", "button", "Lcom/socure/docv/capturesdk/common/view/model/Button;", "startProgressAnimation", Constants.ScionAnalytics.PARAM_LABEL, "buttonColor", TextColorProp.name, "progressColor", "progressBgColor", "stopProgressIncrement", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PreviewBottomLayout extends ConstraintLayout {

    /* renamed from: btnContinue$delegate, reason: from kotlin metadata */
    private final Lazy btnContinue;

    /* renamed from: btnRetake$delegate, reason: from kotlin metadata */
    private final Lazy btnRetake;

    /* renamed from: confirmationView$delegate, reason: from kotlin metadata */
    private final Lazy confirmationView;

    /* renamed from: pbVerification$delegate, reason: from kotlin metadata */
    private final Lazy pbVerification;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final Lazy progressView;

    /* renamed from: tvProgress$delegate, reason: from kotlin metadata */
    private final Lazy tvProgress;
    private ValueAnimator valueAnimator;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewBottomLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewBottomLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PreviewBottomLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewBottomLayout(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout$view$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return LayoutInflater.from(context).inflate(R.layout.socure_preview_bottom_layout, (ViewGroup) this, false);
            }
        });
        this.confirmationView = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout$confirmationView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                View view;
                view = PreviewBottomLayout.this.getView();
                return view.findViewById(R.id.cl_confirmation);
            }
        });
        this.btnContinue = LazyKt.lazy(new Function0<AppCompatButton>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout$btnContinue$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatButton invoke() {
                View view;
                view = PreviewBottomLayout.this.getView();
                return (AppCompatButton) view.findViewById(R.id.btn_continue);
            }
        });
        this.btnRetake = LazyKt.lazy(new Function0<AppCompatButton>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout$btnRetake$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatButton invoke() {
                View view;
                view = PreviewBottomLayout.this.getView();
                return (AppCompatButton) view.findViewById(R.id.btn_retake);
            }
        });
        this.progressView = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout$progressView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                View view;
                view = PreviewBottomLayout.this.getView();
                return view.findViewById(R.id.cl_progress_view);
            }
        });
        this.tvProgress = LazyKt.lazy(new Function0<AppCompatTextView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout$tvProgress$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatTextView invoke() {
                View view;
                view = PreviewBottomLayout.this.getView();
                return (AppCompatTextView) view.findViewById(R.id.tv_progress);
            }
        });
        this.pbVerification = LazyKt.lazy(new Function0<ProgressBar>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout$pbVerification$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ProgressBar invoke() {
                View view;
                view = PreviewBottomLayout.this.getView();
                return (ProgressBar) view.findViewById(R.id.pg_verifying);
            }
        });
        addView(getView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        return (View) this.view.getValue();
    }

    private final View getConfirmationView() {
        return (View) this.confirmationView.getValue();
    }

    private final AppCompatButton getBtnContinue() {
        return (AppCompatButton) this.btnContinue.getValue();
    }

    private final AppCompatButton getBtnRetake() {
        return (AppCompatButton) this.btnRetake.getValue();
    }

    private final View getProgressView() {
        return (View) this.progressView.getValue();
    }

    private final AppCompatTextView getTvProgress() {
        return (AppCompatTextView) this.tvProgress.getValue();
    }

    private final ProgressBar getPbVerification() {
        return (ProgressBar) this.pbVerification.getValue();
    }

    public final void setRetakeListener(View.OnClickListener listener) {
        getBtnRetake().setOnClickListener(listener);
    }

    public final void setContinueListener(View.OnClickListener listener) {
        getBtnContinue().setEnabled(true);
        getBtnContinue().setOnClickListener(listener);
    }

    public final void setUpContinueButton(String contBtnText, String color, String bgColor) {
        Intrinsics.checkNotNullParameter(contBtnText, "contBtnText");
        Intrinsics.checkNotNullParameter(color, "color");
        AppCompatButton btnContinue = getBtnContinue();
        Intrinsics.checkNotNullExpressionValue(btnContinue, "btnContinue");
        ExtensionsKt.setupText(btnContinue, contBtnText, color, 0);
        if (bgColor != null) {
            AppCompatButton btnContinue2 = getBtnContinue();
            Intrinsics.checkNotNullExpressionValue(btnContinue2, "btnContinue");
            ExtensionsKt.setCorner(btnContinue2, bgColor, bgColor);
        }
    }

    public final void setUpRetakeButton(String contBtnText, String color, String borderColor) {
        Intrinsics.checkNotNullParameter(contBtnText, "contBtnText");
        Intrinsics.checkNotNullParameter(color, "color");
        getBtnRetake().setTag(AnalyticsConstantsKt.RETAKE_BUTTON);
        AppCompatButton btnRetake = getBtnRetake();
        Intrinsics.checkNotNullExpressionValue(btnRetake, "btnRetake");
        ExtensionsKt.setupText$default(btnRetake, contBtnText, color, null, 4, null);
    }

    private final void setUpRetakeIVSButton(String contBtnText, String color, String bgColor) {
        getBtnRetake().setTag(AnalyticsConstantsKt.IVS_RETAKE_BUTTON);
        AppCompatButton btnRetake = getBtnRetake();
        Intrinsics.checkNotNullExpressionValue(btnRetake, "btnRetake");
        ExtensionsKt.setupText$default(btnRetake, contBtnText, color, null, 4, null);
        AppCompatButton btnRetake2 = getBtnRetake();
        Intrinsics.checkNotNullExpressionValue(btnRetake2, "btnRetake");
        ExtensionsKt.setCorner(btnRetake2, bgColor, bgColor);
    }

    public final void startProgressAnimation(String label, int buttonColor, int textColor, int progressColor, int progressBgColor) {
        Intrinsics.checkNotNullParameter(label, "label");
        getConfirmationView().setVisibility(8);
        getProgressView().setVisibility(0);
        getTvProgress().getBackground().setTint(buttonColor);
        getTvProgress().setTextColor(textColor);
        getTvProgress().setText(label);
        getPbVerification().setProgress(0);
        Drawable progressDrawable = getPbVerification().getProgressDrawable();
        Intrinsics.checkNotNull(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        layerDrawable.getDrawable(0).setTint(progressBgColor);
        layerDrawable.getDrawable(1).setTint(progressColor);
        createAndStartAnim();
    }

    private final void createAndStartAnim() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 80);
        this.valueAnimator = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(1500L);
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.setStartDelay(300L);
        }
        ValueAnimator valueAnimator2 = this.valueAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewBottomLayout$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    PreviewBottomLayout.createAndStartAnim$lambda$1(PreviewBottomLayout.this, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.valueAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAndStartAnim$lambda$1(PreviewBottomLayout this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ProgressBar pbVerification = this$0.getPbVerification();
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        pbVerification.setProgress(((Integer) animatedValue).intValue(), true);
    }

    private final void stopProgressIncrement() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.valueAnimator = null;
    }

    public final void progressComplete(String successLabel) {
        Intrinsics.checkNotNullParameter(successLabel, "successLabel");
        getTvProgress().setText(successLabel);
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            stopProgressIncrement();
        }
        getPbVerification().setProgress(100, true);
    }

    public final void showRetake(Button button) {
        Intrinsics.checkNotNullParameter(button, "button");
        getConfirmationView().setVisibility(0);
        getBtnContinue().setVisibility(8);
        getProgressView().setVisibility(4);
        String bgColor = button.getBgColor();
        if (bgColor != null) {
            setUpRetakeIVSButton(button.getLabel(), button.getLabelColor(), bgColor);
        }
    }
}
