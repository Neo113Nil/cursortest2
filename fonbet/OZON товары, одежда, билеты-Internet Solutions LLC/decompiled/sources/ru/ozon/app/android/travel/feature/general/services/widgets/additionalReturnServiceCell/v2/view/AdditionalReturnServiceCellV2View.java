package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.view;

import Am.C2438a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.presentation.AdditionalReturnServiceCellV2VI;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v2.view.AdditionalReturnServiceCellV2View$viewOutlineProvider$2;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0001;\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J)\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001d\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u0011R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\"R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010J\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010K\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010HR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020F0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/view/AdditionalReturnServiceCellV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isVisible", "", "setSkeletonsVisible", "(Z)V", "", "backgroundColor", "borderColor", "bindBackground", "(Ljava/lang/String;Ljava/lang/String;)V", "addViews", "()V", "setupConstraints", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$Content;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/presentation/AdditionalReturnServiceCellV2VI$State$Content;Lkotlin/jvm/functions/Function1;)V", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "showBookingSkeletons", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "showShimmer", "", "dp2", "I", "dp8", "dp16", "dp20", "dp90", "dp180", "", "dpf2", "F", "dpf24", "shimmerRadius", "outerRadius", "innerRadius", "defaultTokenColor", "Ljava/lang/String;", "defaultColor", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellListAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "viewBackground$delegate", "LSc/j;", "getViewBackground", "()Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "viewBackground", "ru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/view/AdditionalReturnServiceCellV2View$viewOutlineProvider$2$1", "viewOutlineProvider$delegate", "getViewOutlineProvider", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/view/AdditionalReturnServiceCellV2View$viewOutlineProvider$2$1;", "viewOutlineProvider", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/view/AdditionalReturnServiceCellV2ShimmerView;", "shimmerView", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v2/view/AdditionalReturnServiceCellV2ShimmerView;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "cellListVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "leftTop", "Lru/ozon/app/android/travel/molecules/view/shimmer/RoundedShimmerView;", "leftBottom", "rightTop", "rightBottom", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "skeletonViews", "Ljava/util/List;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalReturnServiceCellV2View extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AdditionalReturnServiceCellV2View.class, "badgeView", "getBadgeView()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;

    /* renamed from: badgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badgeView;

    @NotNull
    private final AtomsAdapter cellListAdapter;

    @NotNull
    private final VerticalAtomsLayout cellListVAL;
    private final int defaultColor;

    @NotNull
    private final String defaultTokenColor;
    private final int dp16;
    private final int dp180;
    private final int dp2;
    private final int dp20;
    private final int dp8;
    private final int dp90;
    private final float dpf2;
    private final float dpf24;
    private final float innerRadius;

    @NotNull
    private final RoundedShimmerView leftBottom;

    @NotNull
    private final RoundedShimmerView leftTop;
    private final float outerRadius;

    @NotNull
    private final RoundedShimmerView rightBottom;

    @NotNull
    private final RoundedShimmerView rightTop;
    private final float shimmerRadius;

    @NotNull
    private final AdditionalReturnServiceCellV2ShimmerView shimmerView;

    @NotNull
    private final List<RoundedShimmerView> skeletonViews;

    /* renamed from: viewBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewBackground;

    /* renamed from: viewOutlineProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewOutlineProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalReturnServiceCellV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(20, context);
        this.dp20 = px2;
        int px3 = ResourceExtKt.toPx(90, context);
        this.dp90 = px3;
        int px4 = ResourceExtKt.toPx(180, context);
        this.dp180 = px4;
        float pxF = ResourceExtKt.toPxF(2, context);
        this.dpf2 = pxF;
        float pxF2 = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF2;
        float pxF3 = ResourceExtKt.toPxF(6, context);
        this.shimmerRadius = pxF3;
        this.outerRadius = pxF2;
        this.innerRadius = pxF2 - pxF;
        this.defaultTokenColor = UniColors.LAYER_FLOOR_1.getToken();
        this.defaultColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.cellListAdapter = atomsAdapter;
        this.viewBackground = LazyUtilsKt.unsafeLazy(new AdditionalReturnServiceCellV2View$viewBackground$2(context, this));
        this.viewOutlineProvider = LazyUtilsKt.unsafeLazy(new AdditionalReturnServiceCellV2View$viewOutlineProvider$2(this));
        AdditionalReturnServiceCellV2ShimmerView additionalReturnServiceCellV2ShimmerView = new AdditionalReturnServiceCellV2ShimmerView(context);
        additionalReturnServiceCellV2ShimmerView.setId(View.generateViewId());
        additionalReturnServiceCellV2ShimmerView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        ViewExtKt.gone(additionalReturnServiceCellV2ShimmerView);
        this.shimmerView = additionalReturnServiceCellV2ShimmerView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        verticalAtomsLayout.setLayoutParams(new ConstraintLayout.b(-1, -2));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        this.cellListVAL = verticalAtomsLayout;
        RoundedShimmerView roundedShimmerView = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView.setId(View.generateViewId());
        roundedShimmerView.setCornerRadius(pxF3);
        roundedShimmerView.setLayoutParams(new ConstraintLayout.b(px4, px2));
        roundedShimmerView.setVisibility(8);
        this.leftTop = roundedShimmerView;
        RoundedShimmerView roundedShimmerView2 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView2.setId(View.generateViewId());
        roundedShimmerView2.setCornerRadius(pxF3);
        roundedShimmerView2.setLayoutParams(new ConstraintLayout.b(px4, px2));
        roundedShimmerView2.setVisibility(8);
        this.leftBottom = roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView3.setId(View.generateViewId());
        roundedShimmerView3.setCornerRadius(pxF3);
        roundedShimmerView3.setLayoutParams(new ConstraintLayout.b(px3, px2));
        roundedShimmerView3.setVisibility(8);
        this.rightTop = roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4 = new RoundedShimmerView(context, null, 0, 0, 14, null);
        roundedShimmerView4.setId(View.generateViewId());
        roundedShimmerView4.setCornerRadius(pxF3);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px3, px2);
        bVar.f41662z = px;
        roundedShimmerView4.setLayoutParams(bVar);
        roundedShimmerView4.setVisibility(8);
        this.rightBottom = roundedShimmerView4;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.badgeView = new PreCreationViewPoolDelegate(context2, N.b(BadgeView.class), new AdditionalReturnServiceCellV2View$special$$inlined$preCreationViewPool$default$1(this), new AdditionalReturnServiceCellV2View$special$$inlined$preCreationViewPool$default$2());
        this.skeletonViews = C7714v.b0(roundedShimmerView, roundedShimmerView2, roundedShimmerView3, roundedShimmerView4);
        setClipToOutline(true);
        setOutlineProvider(getViewOutlineProvider());
        setBackground(getViewBackground());
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(this.shimmerView);
        addView(this.cellListVAL);
        addView(getBadgeView());
        addView(this.leftTop);
        addView(this.leftBottom);
        addView(this.rightTop);
        addView(this.rightBottom);
    }

    private final void bindBackground(String backgroundColor, String borderColor) {
        ShapeDrawableWithBorder viewBackground = getViewBackground();
        viewBackground.setFillColor(backgroundColor, this.defaultColor);
        viewBackground.setBorderColor(borderColor, this.defaultColor);
    }

    static /* synthetic */ void bindBackground$default(AdditionalReturnServiceCellV2View additionalReturnServiceCellV2View, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        additionalReturnServiceCellV2View.bindBackground(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getBadgeView() {
        return (BadgeView) this.badgeView.getValue(this, $$delegatedProperties[0]);
    }

    private final ShapeDrawableWithBorder getViewBackground() {
        return (ShapeDrawableWithBorder) this.viewBackground.getValue();
    }

    private final AdditionalReturnServiceCellV2View$viewOutlineProvider$2.AnonymousClass1 getViewOutlineProvider() {
        return (AdditionalReturnServiceCellV2View$viewOutlineProvider$2.AnonymousClass1) this.viewOutlineProvider.getValue();
    }

    private final void setSkeletonsVisible(boolean isVisible) {
        Iterator<T> it = this.skeletonViews.iterator();
        while (it.hasNext()) {
            ((RoundedShimmerView) it.next()).setVisibility(isVisible ? 0 : 8);
        }
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AdditionalReturnServiceCellV2View$setupConstraints$1(this));
    }

    public final void bind(@NotNull AdditionalReturnServiceCellV2VI.State.Content item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setPadding(0, 0, 0, this.dp16);
        this.cellListAdapter.setOnAction(actionHandler);
        AtomsAdapter atomsAdapter = this.cellListAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getCells());
        BadgeHolderKt.bindOrGone(getBadgeView(), item.getBadge(), actionHandler);
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(this.cellListVAL);
        ViewExtKt.gone(this.shimmerView);
        setSkeletonsVisible(false);
        String borderColor = item.getBorderColor();
        if (borderColor == null && (borderColor = item.getBackgroundColor()) == null) {
            borderColor = this.defaultTokenColor;
        }
        bindBackground(item.getBackgroundColor(), borderColor);
    }

    public final void showBookingSkeletons(@NotNull List<CellDTO> cells, String backgroundColor, String borderColor, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setPadding(0, 0, 0, this.dp16);
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(this.cellListVAL);
        this.cellListAdapter.setOnAction(actionHandler);
        AtomsAdapter atomsAdapter = this.cellListAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, cells);
        setSkeletonsVisible(true);
        ViewExtKt.gone(this.shimmerView);
        ViewExtKt.gone(getBadgeView());
        if (borderColor == null) {
            borderColor = backgroundColor == null ? this.defaultTokenColor : backgroundColor;
        }
        bindBackground(backgroundColor, borderColor);
    }

    public final void showShimmer() {
        setPadding(0, 0, 0, 0);
        ViewExtKt.gone(this.cellListVAL);
        ViewExtKt.gone(getBadgeView());
        setSkeletonsVisible(false);
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(this.shimmerView);
        bindBackground$default(this, null, null, 3, null);
    }
}
