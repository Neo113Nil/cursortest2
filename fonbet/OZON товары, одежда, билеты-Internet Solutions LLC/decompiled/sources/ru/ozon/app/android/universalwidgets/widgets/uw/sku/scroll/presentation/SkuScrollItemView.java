package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;
import ru.ozon.app.android.universalwidgets.R$drawable;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer.HorizontalBadgesContainerView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.SkuImageWrapper;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\fR\u0017\u0010+\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u000fR\u0017\u0010.\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0012R\u0017\u00101\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0015R\u0017\u00104\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0018R\u0017\u00107\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001bR\u0017\u0010:\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001eR\u0017\u0010=\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010$R\u0017\u0010@\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010'R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010C\u001a\u0004\bD\u0010!¨\u0006E"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "buildAdultImageView", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "Landroidx/appcompat/widget/AppCompatImageView;", "buildOverlayImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "buildOverlayTitle", "()Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "Lru/ozon/app/android/product/common/wave/WaveView;", "buildWaveView", "()Lru/ozon/app/android/product/common/wave/WaveView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "buildBadgesContainerView", "()Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "Landroidx/recyclerview/widget/RecyclerView;", "buildTopRightButtonsRV", "()Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "buildState", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Landroid/widget/LinearLayout;", "buttonContainer", "()Landroid/widget/LinearLayout;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "buildButton", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "buildSubtitle", "()Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "imageContainer", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/SkuImageWrapper;", "getImageContainer", "overlayImage", "Landroidx/appcompat/widget/AppCompatImageView;", "getOverlayImage", "overlayTitle", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView;", "getOverlayTitle", "waveView", "Lru/ozon/app/android/product/common/wave/WaveView;", "getWaveView", "badgesContainer", "Lru/ozon/app/android/universalwidgets/widgets/uw/badgescontainer/HorizontalBadgesContainerView;", "getBadgesContainer", "topRightButtonsRV", "Landroidx/recyclerview/widget/RecyclerView;", "getTopRightButtonsRV", "stateVrc", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getStateVrc", "productSa", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getProductSa", "buttonSubtitle", "Lru/ozon/app/android/uikit/view/atoms/texts/TextAtomWithIconView;", "getButtonSubtitle", "Landroid/widget/LinearLayout;", "getButtonContainer", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkuScrollItemView extends ConstraintLayout {

    @NotNull
    private final HorizontalBadgesContainerView badgesContainer;

    @NotNull
    private final LinearLayout buttonContainer;

    @NotNull
    private final TextAtomWithIconView buttonSubtitle;

    @NotNull
    private final SkuImageWrapper imageContainer;

    @NotNull
    private final AppCompatImageView overlayImage;

    @NotNull
    private final OverlayTitleView overlayTitle;

    @NotNull
    private final SingleAtom productSa;

    @NotNull
    private final VerticalAtomsLayout stateVrc;

    @NotNull
    private final RecyclerView topRightButtonsRV;

    @NotNull
    private final WaveView waveView;

    public /* synthetic */ SkuScrollItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final SkuImageWrapper buildAdultImageView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SkuImageWrapper skuImageWrapper = new SkuImageWrapper(context, null, 0, 6, null);
        skuImageWrapper.setId(R$id.imagesSwipeView);
        Context context2 = skuImageWrapper.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, ResourceExtKt.toPx(127, context2));
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        Unit unit = Unit.f71690a;
        addView(skuImageWrapper, bVar);
        return skuImageWrapper;
    }

    private final HorizontalBadgesContainerView buildBadgesContainerView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HorizontalBadgesContainerView horizontalBadgesContainerView = new HorizontalBadgesContainerView(context, null, 0, 6, null);
        horizontalBadgesContainerView.setId(R$id.badgesContainer);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        int i11 = R$id.imagesSwipeView;
        bVar.f41642l = i11;
        bVar.f41628e = i11;
        bVar.f41634h = i11;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = ResourceExtKt.toPx(4);
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = ResourceExtKt.toPx(4);
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ResourceExtKt.toPx(4);
        Unit unit = Unit.f71690a;
        addView(horizontalBadgesContainerView, bVar);
        return horizontalBadgesContainerView;
    }

    private final SingleAtom buildButton() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setId(R$id.productSa);
        this.buttonContainer.addView(singleAtom, new ConstraintLayout.b(-1, -2));
        return singleAtom;
    }

    private final AppCompatImageView buildOverlayImage() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(R$id.overlayImage);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(116, context);
        Context context2 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ConstraintLayout.b bVar = new ConstraintLayout.b(px, ResourceExtKt.toPx(127, context2));
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        Unit unit = Unit.f71690a;
        addView(appCompatImageView, bVar);
        return appCompatImageView;
    }

    private final OverlayTitleView buildOverlayTitle() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OverlayTitleView overlayTitleView = new OverlayTitleView(context, null, 0, 6, null);
        overlayTitleView.setId(R$id.overlayTitle);
        overlayTitleView.setVisibility(8);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        int i11 = R$id.imagesSwipeView;
        bVar.f41656t = i11;
        bVar.f41658v = i11;
        bVar.f41642l = i11;
        Unit unit = Unit.f71690a;
        addView(overlayTitleView, bVar);
        return overlayTitleView;
    }

    private final VerticalAtomsLayout buildState() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.stateVrc);
        verticalAtomsLayout.setClickable(true);
        verticalAtomsLayout.setFocusable(true);
        verticalAtomsLayout.setOrientation(1);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        Context context2 = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(4, context2);
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = px;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = px;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = px;
        bVar.f41640k = R$id.buttonContainer;
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        bVar.f41638j = R$id.imagesSwipeView;
        bVar.f41599F = 0.0f;
        bVar.f41598E = 0.0f;
        bVar.f41662z = ResourceExtKt.toPx(8);
        Unit unit = Unit.f71690a;
        addView(verticalAtomsLayout, bVar);
        return verticalAtomsLayout;
    }

    private final TextAtomWithIconView buildSubtitle() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomWithIconView textAtomWithIconView = new TextAtomWithIconView(context, null, 0, 6, null);
        textAtomWithIconView.setId(R$id.buttonSubtitle);
        LinearLayout linearLayout = this.buttonContainer;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(4);
        Unit unit = Unit.f71690a;
        linearLayout.addView(textAtomWithIconView, bVar);
        return textAtomWithIconView;
    }

    private final RecyclerView buildTopRightButtonsRV() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        recyclerView.setId(R$id.topRightButtonsRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        Unit unit = Unit.f71690a;
        addView(recyclerView, bVar);
        return recyclerView;
    }

    private final WaveView buildWaveView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WaveView waveView = new WaveView(context, null, 0, 6, null);
        waveView.setId(R$id.waveView);
        waveView.setVisibility(8);
        Context context2 = waveView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, ResourceExtKt.toPx(10, context2));
        int i11 = R$id.imagesSwipeView;
        bVar.f41656t = i11;
        bVar.f41658v = i11;
        bVar.f41642l = i11;
        Unit unit = Unit.f71690a;
        addView(waveView, bVar);
        return waveView;
    }

    private final LinearLayout buttonContainer() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R$id.buttonContainer);
        linearLayout.setOrientation(1);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        bVar.f41638j = R$id.stateVrc;
        bVar.f41599F = 1.0f;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = ResourceExtKt.toPx(12);
        Unit unit = Unit.f71690a;
        addView(linearLayout, bVar);
        return linearLayout;
    }

    @NotNull
    public final TextAtomWithIconView getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    @NotNull
    public final SkuImageWrapper getImageContainer() {
        return this.imageContainer;
    }

    @NotNull
    public final OverlayTitleView getOverlayTitle() {
        return this.overlayTitle;
    }

    @NotNull
    public final SingleAtom getProductSa() {
        return this.productSa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkuScrollItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(R$id.rootLl);
        setClickable(true);
        setFocusable(true);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setForeground(C7232a.a(context, R$drawable.fg_sku_ripple_rounded));
        this.imageContainer = buildAdultImageView();
        this.overlayImage = buildOverlayImage();
        this.overlayTitle = buildOverlayTitle();
        this.waveView = buildWaveView();
        this.badgesContainer = buildBadgesContainerView();
        this.topRightButtonsRV = buildTopRightButtonsRV();
        this.stateVrc = buildState();
        this.buttonContainer = buttonContainer();
        this.productSa = buildButton();
        this.buttonSubtitle = buildSubtitle();
    }
}
