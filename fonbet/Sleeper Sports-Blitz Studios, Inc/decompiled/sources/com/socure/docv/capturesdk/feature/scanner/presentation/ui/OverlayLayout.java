package com.socure.docv.capturesdk.feature.scanner.presentation.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBoxConstraintData;
import io.sentry.Session;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OverlayLayout.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020\nJ\b\u0010\u0017\u001a\u00020\nH\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\r\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0007J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\"\u001a\u00020\u0014R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r¨\u0006#"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/OverlayLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "guideBoxView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getGuideBoxView", "()Landroid/view/View;", "guideBoxView$delegate", "Lkotlin/Lazy;", ViewHierarchyConstants.VIEW_KEY, "getView", "view$delegate", "flipGb", "", "flipGb$capturesdk_productionRelease", "getGuideView", "getScannerView", "hideGuidingBox", "isBoxVertical", "", "isBoxVertical$capturesdk_productionRelease", "setGuidingBoxData", "guidingBoxConstraintData", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBoxConstraintData;", "setGuidingBoxTintColor", "tintColor", "setUpGuidingBoxView", "showGuidingBox", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OverlayLayout extends ConstraintLayout {
    public static final int $stable = 8;

    /* renamed from: guideBoxView$delegate, reason: from kotlin metadata */
    private final Lazy guideBoxView;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Lazy view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OverlayLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.view = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.OverlayLayout$view$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                View scannerView;
                scannerView = OverlayLayout.this.getScannerView();
                return scannerView;
            }
        });
        this.guideBoxView = LazyKt.lazy(new Function0<View>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.ui.OverlayLayout$guideBoxView$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                View view;
                view = OverlayLayout.this.getView();
                return view.findViewById(R.id.vwGuideBox);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getScannerView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.socure_doc_overlay_view, (ViewGroup) this, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(R.…verlay_view, this, false)");
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getView() {
        return (View) this.view.getValue();
    }

    private final View getGuideBoxView() {
        return (View) this.guideBoxView.getValue();
    }

    public final void flipGb$capturesdk_productionRelease() {
        ViewGroup.LayoutParams layoutParams = getGuideBoxView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        String str = layoutParams2.dimensionRatio;
        Intrinsics.checkNotNullExpressionValue(str, "lp.dimensionRatio");
        if (Double.parseDouble(str) < 1.0d) {
            layoutParams2.dimensionRatio = ConstantsKt.LICENSE_GUIDING_BOX_RATIO;
            layoutParams2.width = -1;
            layoutParams2.height = 0;
        } else {
            layoutParams2.dimensionRatio = ConstantsKt.VERTICAL_LICENSE_GUIDING_BOX_RATIO;
            layoutParams2.width = 0;
            layoutParams2.height = 0;
        }
        getGuideBoxView().setLayoutParams(layoutParams2);
    }

    public final boolean isBoxVertical$capturesdk_productionRelease() {
        ViewGroup.LayoutParams layoutParams = getGuideBoxView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        String str = ((ConstraintLayout.LayoutParams) layoutParams).dimensionRatio;
        Intrinsics.checkNotNullExpressionValue(str, "guideBoxView.layoutParam…outParams).dimensionRatio");
        return Double.parseDouble(str) < 1.0d;
    }

    public final View getGuideView() {
        View guideBoxView = getGuideBoxView();
        Intrinsics.checkNotNullExpressionValue(guideBoxView, "guideBoxView");
        return guideBoxView;
    }

    public final void setGuidingBoxTintColor(int tintColor) {
        getGuideBoxView().setBackgroundTintList(ContextCompat.getColorStateList(getContext(), tintColor));
    }

    public final void setGuidingBoxData(GuidingBoxConstraintData guidingBoxConstraintData) {
        Intrinsics.checkNotNullParameter(guidingBoxConstraintData, "guidingBoxConstraintData");
        setUpGuidingBoxView(guidingBoxConstraintData);
        addView(getView());
    }

    public final void showGuidingBox() {
        if (getGuideBoxView().getVisibility() != 0) {
            View guideBoxView = getGuideBoxView();
            Intrinsics.checkNotNullExpressionValue(guideBoxView, "guideBoxView");
            ExtensionsKt.showWithFadeInAnimation(guideBoxView);
        }
    }

    public final void hideGuidingBox() {
        if (getGuideBoxView().getVisibility() == 0) {
            getGuideBoxView().setVisibility(8);
        }
    }

    private final void setUpGuidingBoxView(GuidingBoxConstraintData guidingBoxConstraintData) {
        LoggerKt.logD("SDLT_OL", "setUpGuidingBoxView called");
        ViewGroup.LayoutParams layoutParams = getGuideBoxView().getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = guidingBoxConstraintData.getWidth();
            layoutParams2.dimensionRatio = guidingBoxConstraintData.getDimensionRatio();
            Float matchConstraintPercentWidth = guidingBoxConstraintData.getMatchConstraintPercentWidth();
            if (matchConstraintPercentWidth != null) {
                layoutParams2.matchConstraintPercentWidth = matchConstraintPercentWidth.floatValue();
            }
        } else {
            LoggerKt.logD("SDLT_OL", "guideBoxView.layoutParams is null");
        }
        getGuideBoxView().setBackground(ResourcesCompat.getDrawable(getResources(), guidingBoxConstraintData.getGuidingBoxBgId(), null));
    }
}
