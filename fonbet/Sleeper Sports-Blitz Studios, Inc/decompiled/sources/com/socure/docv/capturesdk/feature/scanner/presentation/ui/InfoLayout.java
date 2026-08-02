package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCaseKt;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
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

/* compiled from: InfoLayout.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010'\u001a\u00020(J(\u0010)\u001a\u00020(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010-\u001a\u00020.J\u0014\u0010/\u001a\u00020(*\u00020#2\u0006\u00100\u001a\u00020+H\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\n \u0011*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u001f\u001a\n \u0011*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b \u0010\u001dR#\u0010\"\u001a\n \u0011*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b$\u0010%¨\u00061"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/InfoLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityUseCase", "Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "getAccessibilityUseCase", "()Lcom/socure/docv/capturesdk/common/utils/AnnounceAccessibilityMessageUseCase;", "accessibilityUseCase$delegate", "Lkotlin/Lazy;", "containerView", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "getContainerView", "()Landroid/view/ViewGroup;", "containerView$delegate", "imgInfo", "Landroid/widget/ImageView;", "getImgInfo", "()Landroid/widget/ImageView;", "imgInfo$delegate", "tvPrimaryInfo", "Landroid/widget/TextView;", "getTvPrimaryInfo", "()Landroid/widget/TextView;", "tvPrimaryInfo$delegate", "tvSecondaryInfo", "getTvSecondaryInfo", "tvSecondaryInfo$delegate", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "view$delegate", SeenState.HIDE, "", "showWarningMessage", "primaryText", "", "secondaryText", "isCaptureSuccess", "", "queueAnnouncement", "message", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InfoLayout extends ConstraintLayout {

    /* renamed from: accessibilityUseCase$delegate, reason: from kotlin metadata */
    private final Lazy accessibilityUseCase;

    /* renamed from: containerView$delegate, reason: from kotlin metadata */
    private final Lazy containerView;

    /* renamed from: imgInfo$delegate, reason: from kotlin metadata */
    private final Lazy imgInfo;

    /* renamed from: tvPrimaryInfo$delegate, reason: from kotlin metadata */
    private final Lazy tvPrimaryInfo;

    /* renamed from: tvSecondaryInfo$delegate, reason: from kotlin metadata */
    private final Lazy tvSecondaryInfo;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InfoLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoLayout(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.accessibilityUseCase = LazyKt.lazy(new Function0<AnnounceAccessibilityMessageUseCase>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.InfoLayout$accessibilityUseCase$2
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
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.InfoLayout$view$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return LayoutInflater.from(context).inflate(R.layout.socure_info_layout, (ViewGroup) this, false);
            }
        });
        this.containerView = LazyKt.lazy(new Function0<ViewGroup>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.InfoLayout$containerView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewGroup invoke() {
                View view;
                view = InfoLayout.this.getView();
                return (ViewGroup) view.findViewById(R.id.cl_camera_info_container);
            }
        });
        this.tvPrimaryInfo = LazyKt.lazy(new Function0<TextView>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.InfoLayout$tvPrimaryInfo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextView invoke() {
                View view;
                view = InfoLayout.this.getView();
                return (TextView) view.findViewById(R.id.tvPrimaryInfo);
            }
        });
        this.tvSecondaryInfo = LazyKt.lazy(new Function0<TextView>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.InfoLayout$tvSecondaryInfo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextView invoke() {
                View view;
                view = InfoLayout.this.getView();
                return (TextView) view.findViewById(R.id.tvSecondaryInfo);
            }
        });
        this.imgInfo = LazyKt.lazy(new Function0<ImageView>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.InfoLayout$imgInfo$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ImageView invoke() {
                View view;
                view = InfoLayout.this.getView();
                return (ImageView) view.findViewById(R.id.imgInfo);
            }
        });
        addView(getView());
    }

    private final AnnounceAccessibilityMessageUseCase getAccessibilityUseCase() {
        return (AnnounceAccessibilityMessageUseCase) this.accessibilityUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        return (View) this.view.getValue();
    }

    private final ViewGroup getContainerView() {
        return (ViewGroup) this.containerView.getValue();
    }

    private final TextView getTvPrimaryInfo() {
        return (TextView) this.tvPrimaryInfo.getValue();
    }

    private final TextView getTvSecondaryInfo() {
        return (TextView) this.tvSecondaryInfo.getValue();
    }

    private final ImageView getImgInfo() {
        return (ImageView) this.imgInfo.getValue();
    }

    public static /* synthetic */ void showWarningMessage$default(InfoLayout infoLayout, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        infoLayout.showWarningMessage(str, str2, z);
    }

    public final void showWarningMessage(String primaryText, String secondaryText, boolean isCaptureSuccess) {
        Unit unit;
        LoggerKt.logDetailed("SDLT_SIL", "primaryText: " + primaryText + " || secondaryText: " + secondaryText + " || isCaptureSuccess: " + isCaptureSuccess);
        Unit unit2 = null;
        if (isCaptureSuccess) {
            getContainerView().setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.socure_info_success_green_bg, null));
            getTvPrimaryInfo().setTextColor(ResourcesCompat.getColor(getResources(), R.color.socure_dark_green, null));
            getImgInfo().setVisibility(0);
            getImgInfo().setImageResource(R.drawable.ic_socure_success_alert);
        } else {
            getImgInfo().setVisibility(8);
            getContainerView().setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.socure_info_msg_bg, null));
            getTvPrimaryInfo().setTextColor(ResourcesCompat.getColor(getResources(), R.color.socure_white, null));
        }
        if (primaryText != null) {
            getTvPrimaryInfo().setVisibility(0);
            getTvPrimaryInfo().setText(primaryText);
            getTvPrimaryInfo().setImportantForAccessibility(1);
            TextView tvPrimaryInfo = getTvPrimaryInfo();
            Intrinsics.checkNotNullExpressionValue(tvPrimaryInfo, "tvPrimaryInfo");
            queueAnnouncement(tvPrimaryInfo, primaryText);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            getTvPrimaryInfo().setVisibility(8);
        }
        if (secondaryText != null) {
            getTvSecondaryInfo().setVisibility(0);
            getTvSecondaryInfo().setText(secondaryText);
            getTvSecondaryInfo().setImportantForAccessibility(1);
            TextView tvSecondaryInfo = getTvSecondaryInfo();
            Intrinsics.checkNotNullExpressionValue(tvSecondaryInfo, "tvSecondaryInfo");
            queueAnnouncement(tvSecondaryInfo, secondaryText);
            unit2 = Unit.INSTANCE;
        }
        if (unit2 == null) {
            getTvSecondaryInfo().setVisibility(8);
        }
        ViewGroup containerView = getContainerView();
        Intrinsics.checkNotNullExpressionValue(containerView, "containerView");
        if (containerView.getVisibility() == 0) {
            return;
        }
        ViewGroup containerView2 = getContainerView();
        Intrinsics.checkNotNullExpressionValue(containerView2, "containerView");
        ExtensionsKt.showWithFadeInAnimation(containerView2);
    }

    public final void hide() {
        getContainerView().setVisibility(8);
        getTvPrimaryInfo().setVisibility(8);
        getImgInfo().setVisibility(8);
        getTvSecondaryInfo().setVisibility(8);
    }

    private final void queueAnnouncement(View view, String str) {
        AnnounceAccessibilityMessageUseCase accessibilityUseCase = getAccessibilityUseCase();
        if (accessibilityUseCase != null) {
            View view2 = getView();
            Intrinsics.checkNotNullExpressionValue(view2, "view");
            AnnounceAccessibilityMessageUseCaseKt.queue$default(accessibilityUseCase, view2, str, false, 4, null);
        }
    }
}
