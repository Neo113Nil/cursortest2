package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.LegendV2VI;
import ru.ozon.app.android.travel.molecules.extensions.ThemeImageExtKt;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-2\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00140/j\u0002`1J\b\u00102\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b&\u0010\u001cR\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b)\u0010#¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeLegendViewV2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp1", "", "dp2", "dp4", "dp6", "dp8", "dp12", "dp16", "dp28", "dpF8", "", "dpF20", "onLegendClick", "Lkotlin/Function0;", "", "backgroundDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "separatorV", "Landroid/view/View;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "legendBackgroundV", "legendImageIV", "Landroidx/appcompat/widget/AppCompatImageView;", "getLegendImageIV", "()Landroidx/appcompat/widget/AppCompatImageView;", "legendImageIV$delegate", "priceTAV", "getPriceTAV", "priceTAV$delegate", "iconIV", "getIconIV", "iconIV$delegate", "bind", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/LegendV2VI;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "placeViews", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeLegendViewV2 extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightSchemeLegendViewV2.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightSchemeLegendViewV2.class, "legendImageIV", "getLegendImageIV()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(FlightSchemeLegendViewV2.class, "priceTAV", "getPriceTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightSchemeLegendViewV2.class, "iconIV", "getIconIV()Landroidx/appcompat/widget/AppCompatImageView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final ShapeDrawable backgroundDrawable;
    private final int dp1;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp28;
    private final int dp4;
    private final int dp6;
    private final int dp8;
    private final float dpF20;
    private final float dpF8;

    /* renamed from: iconIV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconIV;

    @NotNull
    private final View legendBackgroundV;

    /* renamed from: legendImageIV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate legendImageIV;
    private Function0<Unit> onLegendClick;

    /* renamed from: priceTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceTAV;

    @NotNull
    private final View separatorV;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeLegendViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp6 = ResourceExtKt.toPx(6, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        int px4 = ResourceExtKt.toPx(28, context);
        this.dp28 = px4;
        float pxF = ResourceExtKt.toPxF(8, context);
        this.dpF8 = pxF;
        float pxF2 = ResourceExtKt.toPxF(20, context);
        this.dpF20 = pxF2;
        ShapeDrawable produce$default = RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f, 0.0f, pxF2, pxF2, 6, null);
        this.backgroundDrawable = produce$default;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.separatorV = view;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$1(this), new FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$2());
        View view2 = new View(context);
        view2.setId(View.generateViewId());
        view2.setLayoutParams(new ConstraintLayout.b(0, px4));
        view2.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.bgPrimary), pxF));
        this.legendBackgroundV = view2;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.legendImageIV = new PreCreationViewPoolDelegate(context3, N.b(AppCompatImageView.class), new FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$3(this), new FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.priceTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$5(this), new FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.iconIV = new PreCreationViewPoolDelegate(context5, N.b(AppCompatImageView.class), new FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$7(this), new FlightSchemeLegendViewV2$special$$inlined$preCreationViewPool$default$8(this));
        setBackground(produce$default);
        placeViews();
        view2.setOnClickListener(new Dc0.m(this, 7));
        setPadding(px3, 0, px3, px2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(FlightSchemeLegendViewV2 flightSchemeLegendViewV2, View view) {
        Function0<Unit> function0 = flightSchemeLegendViewV2.onLegendClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final AppCompatImageView getIconIV() {
        return (AppCompatImageView) this.iconIV.getValue(this, $$delegatedProperties[3]);
    }

    private final AppCompatImageView getLegendImageIV() {
        return (AppCompatImageView) this.legendImageIV.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getPriceTAV() {
        return (TextAtomV2View) this.priceTAV.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void placeViews() {
        addView(this.separatorV);
        addView(getTitleTAV());
        addView(this.legendBackgroundV);
        addView(getLegendImageIV());
        addView(getPriceTAV());
        addView(getIconIV());
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.separatorV);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.separatorV);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.separatorV);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getTitleTAV(), this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getTitleTAV(), this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTitleTAV());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getTitleTAV(), this.legendBackgroundV, this.dp8);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.legendBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.startToStart(dVar, this.legendBackgroundV, getLegendImageIV(), -this.dp6);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getLegendImageIV(), this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getLegendImageIV(), this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getLegendImageIV(), getPriceTAV(), this.dp4);
        ConstraintLayoutExtensionsKt.topToTop(dVar, getPriceTAV(), this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getPriceTAV(), this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.endToStart(dVar, getPriceTAV(), getIconIV());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getIconIV(), this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getIconIV(), this.legendBackgroundV);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getIconIV(), this.dp2);
        dVar.f(this);
    }

    public final void bind(@NotNull LegendV2VI item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onLegendClick = new FlightSchemeLegendViewV2$bind$1(item, actionHandler);
        TextHolderKt.bind$default(getTitleTAV(), item.getTitle(), null, 2, null);
        AppCompatImageView legendImageIV = getLegendImageIV();
        ThemeImageV1VO image = item.getImage();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ImageViewExtKt.load$default(legendImageIV, ThemeImageExtKt.getUrlForTheme(image, context), null, null, null, null, false, null, 126, null);
        TextHolderKt.bind$default(getPriceTAV(), item.getPrice(), null, 2, null);
        ImageViewExtKt.load$default(getIconIV(), item.getSelectionIcon().getImage(), null, null, null, null, false, null, 126, null);
        AppCompatImageView iconIV = getIconIV();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ThemeExtKt.tint(iconIV, styleParser.parseColor(context2, item.getSelectionIcon().getTintColor()));
    }
}
