package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation.AdditionalReturnServiceCellVO;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.view.AdditionalReturnServiceView$viewOutlineProvider$2;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001#\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;", "item", "", "showShimmer", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;ZLkotlin/jvm/functions/Function1;)V", "", "dpf2", "F", "dpf12", "dpf24", "outerRadius", "innerRadius", "", "defaultBorderColor", "Ljava/lang/String;", "", "defaultBgColor", "I", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "viewBackground$delegate", "LSc/j;", "getViewBackground", "()Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "viewBackground", "ru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceView$viewOutlineProvider$2$1", "viewOutlineProvider$delegate", "getViewOutlineProvider", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceView$viewOutlineProvider$2$1;", "viewOutlineProvider", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceShimmerView;", "shimmerView", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceShimmerView;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceCellView;", "contentView", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/view/AdditionalReturnServiceCellView;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceView extends FrameLayout {

    @NotNull
    private final AdditionalReturnServiceCellView contentView;
    private final int defaultBgColor;

    @NotNull
    private final String defaultBorderColor;
    private final float dpf12;
    private final float dpf2;
    private final float dpf24;
    private final float innerRadius;
    private final float outerRadius;

    @NotNull
    private final AdditionalReturnServiceShimmerView shimmerView;

    /* renamed from: viewBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewBackground;

    /* renamed from: viewOutlineProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewOutlineProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalReturnServiceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(2, context);
        this.dpf2 = pxF;
        this.dpf12 = ResourceExtKt.toPxF(12, context);
        float pxF2 = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF2;
        this.outerRadius = pxF2;
        this.innerRadius = pxF2 - pxF;
        this.defaultBorderColor = UniColors.GRAPHIC_NEUTRAL.getToken();
        this.defaultBgColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.viewBackground = LazyUtilsKt.unsafeLazy(new AdditionalReturnServiceView$viewBackground$2(context, this));
        this.viewOutlineProvider = LazyUtilsKt.unsafeLazy(new AdditionalReturnServiceView$viewOutlineProvider$2(this));
        AdditionalReturnServiceShimmerView additionalReturnServiceShimmerView = new AdditionalReturnServiceShimmerView(context);
        additionalReturnServiceShimmerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(additionalReturnServiceShimmerView);
        this.shimmerView = additionalReturnServiceShimmerView;
        AdditionalReturnServiceCellView additionalReturnServiceCellView = new AdditionalReturnServiceCellView(context);
        additionalReturnServiceCellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(additionalReturnServiceCellView);
        this.contentView = additionalReturnServiceCellView;
        setClipToOutline(true);
        setOutlineProvider(getViewOutlineProvider());
        setBackground(getViewBackground());
    }

    private final ShapeDrawableWithBorder getViewBackground() {
        return (ShapeDrawableWithBorder) this.viewBackground.getValue();
    }

    private final AdditionalReturnServiceView$viewOutlineProvider$2.AnonymousClass1 getViewOutlineProvider() {
        return (AdditionalReturnServiceView$viewOutlineProvider$2.AnonymousClass1) this.viewOutlineProvider.getValue();
    }

    public final void bind(@NotNull AdditionalReturnServiceCellVO.Content item, boolean showShimmer, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setElevation(item.getIsNotShaded() ? 0.0f : this.dpf12);
        String str = this.defaultBorderColor;
        if (showShimmer) {
            ViewExtKt.gone(this.contentView);
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(this.shimmerView);
        } else {
            this.contentView.bind(item, actionHandler);
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(this.contentView);
            ViewExtKt.gone(this.shimmerView);
            String borderColor = item.getBorderColor();
            if (borderColor == null) {
                borderColor = item.getBackgroundColor();
            }
            str = borderColor;
        }
        ShapeDrawableWithBorder viewBackground = getViewBackground();
        viewBackground.setFillColor(item.getBackgroundColor(), this.defaultBgColor);
        viewBackground.setBorderColor(str, this.defaultBgColor);
    }
}
