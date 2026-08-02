package com.socure.docv.capturesdk.feature.preview.presentation.ui;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.messaging.Constants;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCaseKt;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.common.utils.HelpPreviewUtils;
import com.socure.docv.capturesdk.common.view.ActionCallback;
import com.socure.docv.capturesdk.common.view.model.BsCallbackType;
import com.socure.docv.capturesdk.common.view.model.Button;
import com.socure.docv.capturesdk.common.view.model.PreviewData;
import com.socure.docv.capturesdk.di.DependencyGraphExtKt;
import io.intercom.android.sdk.annotations.SeenState;
import io.sentry.Session;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreviewView.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010B\u001a\u00020AH\u0000¢\u0006\u0002\bCJ\r\u0010D\u001a\u00020EH\u0000¢\u0006\u0002\bFJ\b\u0010G\u001a\u00020EH\u0002J\u001e\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u0007J\u0016\u0010M\u001a\u00020E2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QJ \u0010R\u001a\u00020E2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020J2\b\u0010V\u001a\u0004\u0018\u00010JJ\r\u0010W\u001a\u00020EH\u0000¢\u0006\u0002\bXJ\u000e\u0010Y\u001a\u00020E2\u0006\u0010Z\u001a\u00020JJ\u000e\u0010[\u001a\u00020E2\u0006\u0010Z\u001a\u00020JJ\u000e\u0010\\\u001a\u00020E2\u0006\u0010Z\u001a\u00020JJ\u0014\u0010]\u001a\u00020E*\u00020;2\u0006\u0010^\u001a\u00020JH\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b'\u0010$R\u001b\u0010)\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b*\u0010$R\u001b\u0010,\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u000e\u001a\u0004\b-\u0010$R\u001b\u0010/\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u000e\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u000e\u001a\u0004\b5\u0010$R\u001b\u00107\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u000e\u001a\u0004\b8\u0010\u0012R#\u0010:\u001a\n <*\u0004\u0018\u00010;0;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u000e\u001a\u0004\b=\u0010>R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/socure/docv/capturesdk/feature/preview/presentation/ui/PreviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityUseCase", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "getAccessibilityUseCase", "()Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "accessibilityUseCase$delegate", "Lkotlin/Lazy;", "confirmationMsgTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "getConfirmationMsgTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "confirmationMsgTextView$delegate", "confirmationTitleTextView", "getConfirmationTitleTextView", "confirmationTitleTextView$delegate", "cvImageHolder", "Landroidx/cardview/widget/CardView;", "getCvImageHolder", "()Landroidx/cardview/widget/CardView;", "cvImageHolder$delegate", "flStatusView", "Landroid/widget/FrameLayout;", "getFlStatusView", "()Landroid/widget/FrameLayout;", "flStatusView$delegate", "icSaveImages", "Landroid/widget/ImageView;", "getIcSaveImages", "()Landroid/widget/ImageView;", "icSaveImages$delegate", "imgStatusBase", "getImgStatusBase", "imgStatusBase$delegate", "imgStatusStatus", "getImgStatusStatus", "imgStatusStatus$delegate", "ivDbgPreviewScan", "getIvDbgPreviewScan", "ivDbgPreviewScan$delegate", "previewBottomView", "Lcom/socure/docv/capturesdk/feature/preview/presentation/ui/PreviewBottomLayout;", "getPreviewBottomView", "()Lcom/socure/docv/capturesdk/feature/preview/presentation/ui/PreviewBottomLayout;", "previewBottomView$delegate", "previewImageView", "getPreviewImageView", "previewImageView$delegate", "previewTitleTextView", "getPreviewTitleTextView", "previewTitleTextView$delegate", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "kotlin.jvm.PlatformType", "getView", "()Landroid/view/View;", "view$delegate", "viewShownTime", "", "getVwShownTime", "getVwShownTime$capturesdk_productionRelease", SeenState.HIDE, "", "hide$capturesdk_productionRelease", "resetImagePreview", "setIvsStatusImage", "baseColor", "", "logoColor", "resId", "setPreviewData", "previewData", "Lcom/socure/docv/capturesdk/common/view/model/PreviewData;", "previewActionCallback", "Lcom/socure/docv/capturesdk/common/view/ActionCallback;", "setRetakeUI", "failureRetryButtonColor", "Lcom/socure/docv/capturesdk/common/view/model/Button;", "warningTitle", "warningMsg", "show", "show$capturesdk_productionRelease", "showCompletionTitle", Constants.ScionAnalytics.PARAM_LABEL, "showDelayProgressTitle", "showProgressTitle", "queueAnnouncement", "message", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PreviewView extends ConstraintLayout {

    /* renamed from: accessibilityUseCase$delegate, reason: from kotlin metadata */
    private final Lazy accessibilityUseCase;

    /* renamed from: confirmationMsgTextView$delegate, reason: from kotlin metadata */
    private final Lazy confirmationMsgTextView;

    /* renamed from: confirmationTitleTextView$delegate, reason: from kotlin metadata */
    private final Lazy confirmationTitleTextView;

    /* renamed from: cvImageHolder$delegate, reason: from kotlin metadata */
    private final Lazy cvImageHolder;

    /* renamed from: flStatusView$delegate, reason: from kotlin metadata */
    private final Lazy flStatusView;

    /* renamed from: icSaveImages$delegate, reason: from kotlin metadata */
    private final Lazy icSaveImages;

    /* renamed from: imgStatusBase$delegate, reason: from kotlin metadata */
    private final Lazy imgStatusBase;

    /* renamed from: imgStatusStatus$delegate, reason: from kotlin metadata */
    private final Lazy imgStatusStatus;

    /* renamed from: ivDbgPreviewScan$delegate, reason: from kotlin metadata */
    private final Lazy ivDbgPreviewScan;

    /* renamed from: previewBottomView$delegate, reason: from kotlin metadata */
    private final Lazy previewBottomView;

    /* renamed from: previewImageView$delegate, reason: from kotlin metadata */
    private final Lazy previewImageView;

    /* renamed from: previewTitleTextView$delegate, reason: from kotlin metadata */
    private final Lazy previewTitleTextView;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;
    private long viewShownTime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewShownTime = -1L;
        this.accessibilityUseCase = LazyKt.lazy(new Function0<AnnounceAccessibilityMessageUseCase>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$accessibilityUseCase$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AnnounceAccessibilityMessageUseCase invoke() {
                Context applicationContext = context.getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    return DependencyGraphExtKt.obtainApplicationComponent(application).getAccessibilityAnnouncer();
                }
                return null;
            }
        });
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$view$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return LayoutInflater.from(context).inflate(R.layout.socure_preview_view, (ViewGroup) this, false);
            }
        });
        this.previewTitleTextView = LazyKt.lazy(new Function0<AppCompatTextView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$previewTitleTextView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatTextView invoke() {
                View view;
                view = PreviewView.this.getView();
                return (AppCompatTextView) view.findViewById(R.id.tv_preview_title);
            }
        });
        this.confirmationTitleTextView = LazyKt.lazy(new Function0<AppCompatTextView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$confirmationTitleTextView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatTextView invoke() {
                View view;
                view = PreviewView.this.getView();
                return (AppCompatTextView) view.findViewById(R.id.tv_confirmation_title);
            }
        });
        this.confirmationMsgTextView = LazyKt.lazy(new Function0<AppCompatTextView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$confirmationMsgTextView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AppCompatTextView invoke() {
                View view;
                view = PreviewView.this.getView();
                return (AppCompatTextView) view.findViewById(R.id.tv_confirmation_msg);
            }
        });
        this.previewBottomView = LazyKt.lazy(new Function0<PreviewBottomLayout>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$previewBottomView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PreviewBottomLayout invoke() {
                View view;
                view = PreviewView.this.getView();
                return (PreviewBottomLayout) view.findViewById(R.id.cl_preview_bottom);
            }
        });
        this.previewImageView = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$previewImageView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                View view;
                view = PreviewView.this.getView();
                return (ImageView) view.findViewById(R.id.img_preview);
            }
        });
        this.cvImageHolder = LazyKt.lazy(new Function0<CardView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$cvImageHolder$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CardView invoke() {
                View view;
                view = PreviewView.this.getView();
                return (CardView) view.findViewById(R.id.cv_image_holder);
            }
        });
        this.ivDbgPreviewScan = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$ivDbgPreviewScan$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                View view;
                view = PreviewView.this.getView();
                return (ImageView) view.findViewById(R.id.iv_dbg_preview_scan);
            }
        });
        this.icSaveImages = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$icSaveImages$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                View view;
                view = PreviewView.this.getView();
                return (ImageView) view.findViewById(R.id.ic_save_images);
            }
        });
        this.flStatusView = LazyKt.lazy(new Function0<FrameLayout>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$flStatusView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final FrameLayout invoke() {
                View view;
                view = PreviewView.this.getView();
                return (FrameLayout) view.findViewById(R.id.fl_status);
            }
        });
        this.imgStatusBase = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$imgStatusBase$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                FrameLayout flStatusView;
                flStatusView = PreviewView.this.getFlStatusView();
                return (ImageView) flStatusView.findViewById(R.id.img_status_base);
            }
        });
        this.imgStatusStatus = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$imgStatusStatus$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                FrameLayout flStatusView;
                flStatusView = PreviewView.this.getFlStatusView();
                return (ImageView) flStatusView.findViewById(R.id.img_status_status);
            }
        });
        addView(getView());
    }

    private final AnnounceAccessibilityMessageUseCase getAccessibilityUseCase() {
        return (AnnounceAccessibilityMessageUseCase) this.accessibilityUseCase.getValue();
    }

    /* renamed from: getVwShownTime$capturesdk_productionRelease, reason: from getter */
    public final long getViewShownTime() {
        return this.viewShownTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        return (View) this.view.getValue();
    }

    private final AppCompatTextView getPreviewTitleTextView() {
        Object value = this.previewTitleTextView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-previewTitleTextView>(...)");
        return (AppCompatTextView) value;
    }

    private final AppCompatTextView getConfirmationTitleTextView() {
        Object value = this.confirmationTitleTextView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-confirmationTitleTextView>(...)");
        return (AppCompatTextView) value;
    }

    private final AppCompatTextView getConfirmationMsgTextView() {
        Object value = this.confirmationMsgTextView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-confirmationMsgTextView>(...)");
        return (AppCompatTextView) value;
    }

    public final PreviewBottomLayout getPreviewBottomView() {
        Object value = this.previewBottomView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-previewBottomView>(...)");
        return (PreviewBottomLayout) value;
    }

    private final ImageView getPreviewImageView() {
        Object value = this.previewImageView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-previewImageView>(...)");
        return (ImageView) value;
    }

    private final CardView getCvImageHolder() {
        Object value = this.cvImageHolder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cvImageHolder>(...)");
        return (CardView) value;
    }

    private final ImageView getIvDbgPreviewScan() {
        Object value = this.ivDbgPreviewScan.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-ivDbgPreviewScan>(...)");
        return (ImageView) value;
    }

    private final ImageView getIcSaveImages() {
        Object value = this.icSaveImages.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-icSaveImages>(...)");
        return (ImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getFlStatusView() {
        Object value = this.flStatusView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-flStatusView>(...)");
        return (FrameLayout) value;
    }

    private final ImageView getImgStatusBase() {
        Object value = this.imgStatusBase.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imgStatusBase>(...)");
        return (ImageView) value;
    }

    private final ImageView getImgStatusStatus() {
        Object value = this.imgStatusStatus.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-imgStatusStatus>(...)");
        return (ImageView) value;
    }

    public final void hide$capturesdk_productionRelease() {
        this.viewShownTime = -1L;
        setVisibility(8);
    }

    public final void show$capturesdk_productionRelease() {
        this.viewShownTime = System.currentTimeMillis();
        setVisibility(0);
    }

    public final void setPreviewData(PreviewData previewData, final ActionCallback previewActionCallback) {
        Intrinsics.checkNotNullParameter(previewData, "previewData");
        Intrinsics.checkNotNullParameter(previewActionCallback, "previewActionCallback");
        LoggerKt.logDetailed("SDLT_PV", "called setPreviewData");
        CardView cvImageHolder = getCvImageHolder();
        ViewGroup.LayoutParams layoutParams = cvImageHolder.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.dimensionRatio = previewData.getImageDimenRatio();
            cvImageHolder.setLayoutParams(layoutParams2);
            getPreviewTitleTextView().setText(previewData.getTitle().getLabel());
            getPreviewTitleTextView().setTextColor(Color.parseColor(previewData.getTitle().getLabelColor()));
            getConfirmationTitleTextView().setTextColor(Color.parseColor(previewData.getConfirmationTitle().getLabelColor()));
            getConfirmationTitleTextView().setText(previewData.getConfirmationTitle().getLabel());
            getConfirmationMsgTextView().setVisibility(0);
            getConfirmationMsgTextView().setTextColor(Color.parseColor(previewData.getConfirmationText().getLabelColor()));
            getConfirmationMsgTextView().setText(previewData.getConfirmationText().getLabel());
            queueAnnouncement(getConfirmationTitleTextView(), previewData.getConfirmationText().getLabel());
            getFlStatusView().setVisibility(8);
            PreviewBottomLayout previewBottomView = getPreviewBottomView();
            previewBottomView.setUpContinueButton(previewData.getAgreeButton().getLabel(), previewData.getAgreeButton().getLabelColor(), previewData.getAgreeButton().getBgColor());
            previewBottomView.setUpRetakeButton(previewData.getRetake().getLabel(), previewData.getRetake().getLabelColor(), previewData.getRetake().getBorderColor());
            previewBottomView.setContinueListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PreviewView.setPreviewData$lambda$5$lambda$4$lambda$2(ActionCallback.this, view);
                }
            });
            previewBottomView.setRetakeListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PreviewView.setPreviewData$lambda$5$lambda$4$lambda$3(PreviewView.this, previewActionCallback, view);
                }
            });
            HelpPreviewUtils.INSTANCE.showPreviewDbgImg$capturesdk_productionRelease(getIvDbgPreviewScan(), getIcSaveImages(), previewData.getDebugImage(), new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView$setPreviewData$1$3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ActionCallback.DefaultImpls.onClick$default(ActionCallback.this, BsCallbackType.DEBUG_IMAGE_SAVE, null, 2, null);
                }
            });
            getPreviewImageView().setImageBitmap(previewData.getPreviewBitmap());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPreviewData$lambda$5$lambda$4$lambda$2(ActionCallback previewActionCallback, View view) {
        Intrinsics.checkNotNullParameter(previewActionCallback, "$previewActionCallback");
        view.setEnabled(false);
        ActionCallback.DefaultImpls.onClick$default(previewActionCallback, BsCallbackType.CONTINUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPreviewData$lambda$5$lambda$4$lambda$3(PreviewView this$0, ActionCallback previewActionCallback, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(previewActionCallback, "$previewActionCallback");
        this$0.resetImagePreview();
        previewActionCallback.onClick(BsCallbackType.RETAKE, (String) view.getTag());
    }

    private final void resetImagePreview() {
        getPreviewImageView().setImageBitmap(null);
        invalidate();
    }

    public final void showProgressTitle(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        getConfirmationTitleTextView().setText(label);
        getConfirmationMsgTextView().setVisibility(4);
    }

    public final void showCompletionTitle(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        getConfirmationTitleTextView().setText(label);
        getConfirmationMsgTextView().setVisibility(4);
        queueAnnouncement(getConfirmationTitleTextView(), label);
    }

    public final void setRetakeUI(Button failureRetryButtonColor, String warningTitle, String warningMsg) {
        Unit unit;
        Intrinsics.checkNotNullParameter(failureRetryButtonColor, "failureRetryButtonColor");
        Intrinsics.checkNotNullParameter(warningTitle, "warningTitle");
        getConfirmationTitleTextView().setText(warningTitle);
        if (warningMsg != null) {
            getConfirmationMsgTextView().setVisibility(0);
            getConfirmationMsgTextView().setText(warningMsg);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            getConfirmationMsgTextView().setVisibility(4);
        }
        getPreviewBottomView().showRetake(failureRetryButtonColor);
        queueAnnouncement(getConfirmationTitleTextView(), warningTitle);
    }

    public final void setIvsStatusImage(String baseColor, String logoColor, int resId) {
        Intrinsics.checkNotNullParameter(baseColor, "baseColor");
        Intrinsics.checkNotNullParameter(logoColor, "logoColor");
        getFlStatusView().setVisibility(0);
        getImgStatusStatus().setImageResource(resId);
        ExtensionsKt.setTint(getImgStatusBase(), Color.parseColor(baseColor));
        ExtensionsKt.setTint(getImgStatusStatus(), Color.parseColor(logoColor));
        queueAnnouncement(getConfirmationTitleTextView(), getConfirmationTitleTextView().getText().toString());
    }

    public final void showDelayProgressTitle(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        getConfirmationTitleTextView().setText(label);
        getConfirmationMsgTextView().setVisibility(4);
        queueAnnouncement(getConfirmationTitleTextView(), label);
    }

    private final void queueAnnouncement(View view, String str) {
        AnnounceAccessibilityMessageUseCase accessibilityUseCase = getAccessibilityUseCase();
        if (accessibilityUseCase != null) {
            AnnounceAccessibilityMessageUseCaseKt.queue$default(accessibilityUseCase, view, str, false, 4, null);
        }
    }
}
