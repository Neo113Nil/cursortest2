package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.presentation;

import Sc.InterfaceC4008j;
import Sc.n;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.tours.databinding.WidgetTourFlightDetailsBinding;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.presentation.ToursFlightDetailsVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00109¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;LWZ/l;)V", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "", "bindOrGoneDisclaimer", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "createDisclaimerContainerView", "()Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetTourFlightDetailsBinding;", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetTourFlightDetailsBinding;", "disclaimerContainerView", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "", "dp10", "I", "dp16", "dp24", "", "radius", "F", "backgroundColor", "Landroid/graphics/drawable/ColorDrawable;", "defaultBackground$delegate", "LSc/j;", "getDefaultBackground", "()Landroid/graphics/drawable/ColorDrawable;", "defaultBackground", "Landroid/graphics/drawable/ShapeDrawable;", "topCornersBackground$delegate", "getTopCornersBackground", "()Landroid/graphics/drawable/ShapeDrawable;", "topCornersBackground", "bottomCornersBackground$delegate", "getBottomCornersBackground", "bottomCornersBackground", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightDetailsWidgetViewHolder extends k<ToursFlightDetailsVO> {
    private final int backgroundColor;

    @NotNull
    private final WidgetTourFlightDetailsBinding binding;

    /* renamed from: bottomCornersBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomCornersBackground;

    /* renamed from: defaultBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultBackground;
    private DisclaimerContainer disclaimerContainerView;
    private final int dp10;
    private final int dp16;
    private final int dp24;
    private float radius;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: topCornersBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topCornersBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursFlightDetailsWidgetViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetTourFlightDetailsBinding bind = WidgetTourFlightDetailsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.dp10 = ResourceExtKt.toPx(10, getContext());
        this.dp16 = ResourceExtKt.toPx(16, getContext());
        this.dp24 = ResourceExtKt.toPx(24, getContext());
        this.radius = ResourceExtKt.toPxF(24, getContext());
        this.backgroundColor = ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1);
        n nVar = n.NONE;
        this.defaultBackground = Sc.k.a(nVar, new ToursFlightDetailsWidgetViewHolder$defaultBackground$2(this));
        this.topCornersBackground = Sc.k.a(nVar, new ToursFlightDetailsWidgetViewHolder$topCornersBackground$2(this));
        this.bottomCornersBackground = Sc.k.a(nVar, new ToursFlightDetailsWidgetViewHolder$bottomCornersBackground$2(this));
    }

    private final void bindOrGoneDisclaimer(DisclaimerAtom disclaimer) {
        if (disclaimer == null) {
            DisclaimerContainer disclaimerContainer = this.disclaimerContainerView;
            if (disclaimerContainer != null) {
                ViewExtKt.gone(disclaimerContainer);
                return;
            }
            return;
        }
        DisclaimerContainer disclaimerContainer2 = this.disclaimerContainerView;
        if (disclaimerContainer2 == null) {
            DisclaimerContainer createDisclaimerContainerView = createDisclaimerContainerView();
            this.disclaimerContainerView = createDisclaimerContainerView;
            this.binding.toursFlightDetailsRootCL.addView(createDisclaimerContainerView);
            ConstraintLayout toursFlightDetailsRootCL = this.binding.toursFlightDetailsRootCL;
            Intrinsics.checkNotNullExpressionValue(toursFlightDetailsRootCL, "toursFlightDetailsRootCL");
            ConstraintLayoutExtensionsKt.applyConstraint(toursFlightDetailsRootCL, new ToursFlightDetailsWidgetViewHolder$bindOrGoneDisclaimer$1(this));
        } else if (disclaimerContainer2 != null) {
            ViewExtKt.show(disclaimerContainer2);
        }
        DisclaimerContainer disclaimerContainer3 = this.disclaimerContainerView;
        if (disclaimerContainer3 != null) {
            DisclaimerHolderKt.bind$default(disclaimerContainer3, disclaimer, null, 2, null);
        }
    }

    private final DisclaimerContainer createDisclaimerContainerView() {
        DisclaimerContainer disclaimerContainer = new DisclaimerContainer(getContext(), null, 0, 6, null);
        disclaimerContainer.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        int i11 = this.dp16;
        bVar.setMargins(i11, ((ViewGroup.MarginLayoutParams) bVar).topMargin, i11, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
        disclaimerContainer.setLayoutParams(bVar);
        return disclaimerContainer;
    }

    private final ShapeDrawable getBottomCornersBackground() {
        return (ShapeDrawable) this.bottomCornersBackground.getValue();
    }

    private final ColorDrawable getDefaultBackground() {
        return (ColorDrawable) this.defaultBackground.getValue();
    }

    private final ShapeDrawable getTopCornersBackground() {
        return (ShapeDrawable) this.topCornersBackground.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursFlightDetailsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.toursFlightDetailsRootCL.setBackground(item.getIsFirstFlight() ? getTopCornersBackground() : item.getIsLastFlight() ? getBottomCornersBackground() : getDefaultBackground());
        ConstraintLayout toursFlightDetailsRootCL = this.binding.toursFlightDetailsRootCL;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsRootCL, "toursFlightDetailsRootCL");
        ViewExtKt.updatePadding$default(toursFlightDetailsRootCL, 0, item.getIsFirstForwardFlight() ? this.dp24 : this.dp16, 0, item.getIsLastFlight() ? this.dp16 : 0, 5, null);
        TextAtomView toursFlightDetailsHeaderTitleTAV = this.binding.toursFlightDetailsHeaderTitleTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsHeaderTitleTAV, "toursFlightDetailsHeaderTitleTAV");
        ToursFlightDetailsVO.Header header = item.getHeader();
        TextAtomHolderKt.bindOrGone$default(toursFlightDetailsHeaderTitleTAV, header != null ? header.getTitle() : null, null, 2, null);
        TextAtomView toursFlightDetailsHeaderTimeTAV = this.binding.toursFlightDetailsHeaderTimeTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsHeaderTimeTAV, "toursFlightDetailsHeaderTimeTAV");
        ToursFlightDetailsVO.Header header2 = item.getHeader();
        TextAtomHolderKt.bindOrGone$default(toursFlightDetailsHeaderTimeTAV, header2 != null ? header2.getTime() : null, null, 2, null);
        this.binding.toursFlightDetailsStageTFDSV.bind(item.getFlight());
        this.binding.toursFlightDetailsTransferTFDSV.bindOrGone(item.getTransfer());
        TextAtomView toursFlightDetailsCaptionTAV = this.binding.toursFlightDetailsCaptionTAV;
        Intrinsics.checkNotNullExpressionValue(toursFlightDetailsCaptionTAV, "toursFlightDetailsCaptionTAV");
        TextAtomHolderKt.bindOrGone$default(toursFlightDetailsCaptionTAV, item.getCaption(), null, 2, null);
        bindOrGoneDisclaimer(item.getDisclaimer());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ToursFlightDetailsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ToursFlightDetailsWidgetViewHolder) item, trackingData, viewedPond);
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}
