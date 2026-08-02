package ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.view;

import Am.C2438a;
import CC.a;
import Dc0.j;
import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.SupportBenefitsBannerVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010D\u001a\u00020\u00112\u0006\u0010E\u001a\u00020F2\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00110Hj\u0002`JJ\b\u0010K\u001a\u00020\u0011H\u0002J\u0018\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b*\u0010'R\u001b\u0010,\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b-\u0010\u001cR\u001b\u0010/\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b0\u0010\u001cR\u001b\u00102\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001e\u001a\u0004\b3\u0010\u001cR\u001b\u00105\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001e\u001a\u0004\b6\u0010\u001cR\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u001e\u001a\u0004\b:\u0010;R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001e\u001a\u0004\b>\u0010;R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/view/SupportBenefitsBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp8", "dp12", "dp16", "dp24", "dpF16", "", "dp96", "onLeftClick", "Lkotlin/Function0;", "", "onRightClick", "backgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "defaultBgColor", "leftCardBackground", "Landroid/graphics/drawable/ShapeDrawable;", "rightCardBackground", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "leftBackgroundV", "Landroid/view/View;", "rightBackgroundV", "leftImageIv", "Lru/ozon/uni/android/atom/image/Image;", "getLeftImageIv", "()Lru/ozon/uni/android/atom/image/Image;", "leftImageIv$delegate", "rightImageIv", "getRightImageIv", "rightImageIv$delegate", "leftTitleTav", "getLeftTitleTav", "leftTitleTav$delegate", "rightTitleTav", "getRightTitleTav", "rightTitleTav$delegate", "leftSubtitleTav", "getLeftSubtitleTav", "leftSubtitleTav$delegate", "rightSubtitleTav", "getRightSubtitleTav", "rightSubtitleTav$delegate", "leftBadgeBv", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getLeftBadgeBv", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "leftBadgeBv$delegate", "rightBadgeBv", "getRightBadgeBv", "rightBadgeBv$delegate", "space", "Landroid/widget/Space;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "bind", "item", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "placeViews", "setBottomRightRoundedCorner", "view", "radius", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportBenefitsBannerView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(SupportBenefitsBannerView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(SupportBenefitsBannerView.class, "leftImageIv", "getLeftImageIv()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(SupportBenefitsBannerView.class, "rightImageIv", "getRightImageIv()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(SupportBenefitsBannerView.class, "leftTitleTav", "getLeftTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(SupportBenefitsBannerView.class, "rightTitleTav", "getRightTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(SupportBenefitsBannerView.class, "leftSubtitleTav", "getLeftSubtitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(SupportBenefitsBannerView.class, "rightSubtitleTav", "getRightSubtitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(SupportBenefitsBannerView.class, "leftBadgeBv", "getLeftBadgeBv()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(SupportBenefitsBannerView.class, "rightBadgeBv", "getRightBadgeBv()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final RoundedBackgroundProducer backgroundProducer;

    @NotNull
    private final Barrier barrier;
    private final int defaultBgColor;
    private final int dp12;
    private final int dp16;
    private final int dp24;
    private final int dp4;
    private final int dp8;
    private final int dp96;
    private final float dpF16;

    @NotNull
    private final Guideline guideline;

    @NotNull
    private final View leftBackgroundV;

    /* renamed from: leftBadgeBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate leftBadgeBv;

    @NotNull
    private final ShapeDrawable leftCardBackground;

    /* renamed from: leftImageIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate leftImageIv;

    /* renamed from: leftSubtitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate leftSubtitleTav;

    /* renamed from: leftTitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate leftTitleTav;
    private Function0<Unit> onLeftClick;
    private Function0<Unit> onRightClick;

    @NotNull
    private final View rightBackgroundV;

    /* renamed from: rightBadgeBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate rightBadgeBv;

    @NotNull
    private final ShapeDrawable rightCardBackground;

    /* renamed from: rightImageIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate rightImageIv;

    /* renamed from: rightSubtitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate rightSubtitleTav;

    /* renamed from: rightTitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate rightTitleTav;

    @NotNull
    private final Space space;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportBenefitsBannerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp24 = ResourceExtKt.toPx(24, context);
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpF16 = pxF;
        int px3 = ResourceExtKt.toPx(96, context);
        this.dp96 = px3;
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        this.backgroundProducer = roundedBackgroundProducer;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgPrimary);
        this.defaultBgColor = themeColor;
        ShapeDrawable produce = roundedBackgroundProducer.produce(themeColor, pxF);
        this.leftCardBackground = produce;
        ShapeDrawable produce2 = roundedBackgroundProducer.produce(themeColor, pxF);
        this.rightCardBackground = produce2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$1(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$2());
        Guideline guideline = new Guideline(context);
        guideline.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41615V = 1;
        bVar.f41624c = 0.5f;
        guideline.setLayoutParams(bVar);
        this.guideline = guideline;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        view.setBackground(produce);
        view.setClipToOutline(true);
        this.leftBackgroundV = view;
        View view2 = new View(context);
        view2.setId(View.generateViewId());
        view2.setLayoutParams(new ConstraintLayout.b(0, 0));
        view2.setBackground(produce2);
        view2.setClipToOutline(true);
        this.rightBackgroundV = view2;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.leftImageIv = new PreCreationViewPoolDelegate(context3, N.b(Image.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$3(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.rightImageIv = new PreCreationViewPoolDelegate(context4, N.b(Image.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$5(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.leftTitleTav = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$7(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.rightTitleTav = new PreCreationViewPoolDelegate(context6, N.b(TextAtomV2View.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$9(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$10());
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.leftSubtitleTav = new PreCreationViewPoolDelegate(context7, N.b(TextAtomV2View.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$11(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$12());
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        this.rightSubtitleTav = new PreCreationViewPoolDelegate(context8, N.b(TextAtomV2View.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$13(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$14());
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        this.leftBadgeBv = new PreCreationViewPoolDelegate(context9, N.b(BadgeView.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$15(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$16());
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        this.rightBadgeBv = new PreCreationViewPoolDelegate(context10, N.b(BadgeView.class), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$17(this), new SupportBenefitsBannerView$special$$inlined$preCreationViewPool$default$18());
        Space space = new Space(context);
        space.setId(View.generateViewId());
        space.setLayoutParams(new ConstraintLayout.b(-2, px3));
        this.space = space;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.f(3);
        barrier.e(px2);
        barrier.setReferencedIds(new int[]{getLeftBadgeBv().getId(), getRightBadgeBv().getId(), space.getId()});
        this.barrier = barrier;
        setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, ThemeExtKt.themeColor(context, R$attr.layerFloor1), 0.0f, 0.0f, 0.0f, 0.0f, 30, null));
        placeViews();
        view.setOnClickListener(new j(this, 15));
        view2.setOnClickListener(new a(this, 19));
        setBottomRightRoundedCorner(getLeftImageIv(), pxF);
        setBottomRightRoundedCorner(getRightImageIv(), pxF);
        setPadding(0, 0, 0, px);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$19(SupportBenefitsBannerView supportBenefitsBannerView, View view) {
        Function0<Unit> function0 = supportBenefitsBannerView.onLeftClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$20(SupportBenefitsBannerView supportBenefitsBannerView, View view) {
        Function0<Unit> function0 = supportBenefitsBannerView.onRightClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final BadgeView getLeftBadgeBv() {
        return (BadgeView) this.leftBadgeBv.getValue(this, $$delegatedProperties[7]);
    }

    private final Image getLeftImageIv() {
        return (Image) this.leftImageIv.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getLeftSubtitleTav() {
        return (TextAtomV2View) this.leftSubtitleTav.getValue(this, $$delegatedProperties[5]);
    }

    private final TextAtomV2View getLeftTitleTav() {
        return (TextAtomV2View) this.leftTitleTav.getValue(this, $$delegatedProperties[3]);
    }

    private final BadgeView getRightBadgeBv() {
        return (BadgeView) this.rightBadgeBv.getValue(this, $$delegatedProperties[8]);
    }

    private final Image getRightImageIv() {
        return (Image) this.rightImageIv.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getRightSubtitleTav() {
        return (TextAtomV2View) this.rightSubtitleTav.getValue(this, $$delegatedProperties[6]);
    }

    private final TextAtomV2View getRightTitleTav() {
        return (TextAtomV2View) this.rightTitleTav.getValue(this, $$delegatedProperties[4]);
    }

    private final TextAtomV2View getTitleTav() {
        return (TextAtomV2View) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void placeViews() {
        addView(this.space);
        addView(this.guideline);
        addView(this.leftBackgroundV);
        addView(this.rightBackgroundV);
        addView(getTitleTav());
        addView(getLeftImageIv());
        addView(getRightImageIv());
        addView(getLeftTitleTav());
        addView(getRightTitleTav());
        addView(getLeftSubtitleTav());
        addView(getRightSubtitleTav());
        addView(getLeftBadgeBv());
        addView(getRightBadgeBv());
        addView(this.barrier);
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, getTitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.endToParent(dVar, getTitleTav(), this.dp16);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.space, getTitleTav(), this.dp12);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.space);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.space);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.leftBackgroundV, getTitleTav(), this.dp12);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.leftBackgroundV, this.dp8);
        ConstraintLayoutExtensionsKt.endToStart(dVar, this.leftBackgroundV, this.guideline, this.dp4);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.leftBackgroundV, this.barrier);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.rightBackgroundV, getTitleTav(), this.dp12);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.rightBackgroundV, this.guideline, this.dp4);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.rightBackgroundV, this.dp8);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.rightBackgroundV, this.barrier);
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getLeftImageIv(), this.leftBackgroundV);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getLeftImageIv(), this.leftBackgroundV);
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getRightImageIv(), this.rightBackgroundV);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getRightImageIv(), this.rightBackgroundV);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getLeftTitleTav(), getTitleTav(), this.dp24);
        ConstraintLayoutExtensionsKt.startToStart(dVar, getLeftTitleTav(), this.leftBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getLeftTitleTav(), this.leftBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getLeftTitleTav(), getLeftSubtitleTav());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getRightTitleTav(), getTitleTav(), this.dp24);
        ConstraintLayoutExtensionsKt.startToStart(dVar, getRightTitleTav(), this.rightBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getRightTitleTav(), this.rightBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getRightTitleTav(), getRightSubtitleTav());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getLeftSubtitleTav(), getLeftTitleTav());
        ConstraintLayoutExtensionsKt.startToStart(dVar, getLeftSubtitleTav(), this.leftBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getLeftSubtitleTav(), this.leftBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getLeftSubtitleTav(), getLeftBadgeBv());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getRightSubtitleTav(), getRightTitleTav());
        ConstraintLayoutExtensionsKt.startToStart(dVar, getRightSubtitleTav(), this.rightBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getRightSubtitleTav(), this.rightBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.bottomToTop(dVar, getRightSubtitleTav(), getRightBadgeBv());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getLeftBadgeBv(), getLeftSubtitleTav(), this.dp8);
        ConstraintLayoutExtensionsKt.startToStart(dVar, getLeftBadgeBv(), this.leftBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getLeftBadgeBv());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getRightBadgeBv(), getRightSubtitleTav(), this.dp8);
        ConstraintLayoutExtensionsKt.startToStart(dVar, getRightBadgeBv(), this.rightBackgroundV, this.dp12);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getRightBadgeBv());
        dVar.f(this);
    }

    private final void setBottomRightRoundedCorner(View view, final float radius) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.view.SupportBenefitsBannerView$setBottomRightRoundedCorner$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View currentView, Outline outline) {
                if (C3143a.f(currentView, "currentView", outline, "outline") == 0 || currentView.getHeight() == 0) {
                    return;
                }
                Path path = new Path();
                float f7 = radius;
                path.addRoundRect(new RectF(0.0f, 0.0f, currentView.getWidth(), currentView.getHeight()), new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, 0.0f, 0.0f}, Path.Direction.CW);
                if (Build.VERSION.SDK_INT >= 30) {
                    outline.setPath(path);
                } else if (path.isConvex()) {
                    outline.setConvexPath(path);
                }
            }
        });
    }

    public final void bind(@NotNull SupportBenefitsBannerVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onLeftClick = new SupportBenefitsBannerView$bind$1(item, actionHandler);
        this.onRightClick = new SupportBenefitsBannerView$bind$2(item, actionHandler);
        TextHolderKt.bind$default(getTitleTav(), item.getTitle(), null, 2, null);
        Paint paint = this.leftCardBackground.getPaint();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getLeftCard().getBackgroundColor());
        paint.setColor(parseColor != null ? parseColor.intValue() : this.defaultBgColor);
        Paint paint2 = this.rightCardBackground.getPaint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context2, item.getRightCard().getBackgroundColor());
        paint2.setColor(parseColor2 != null ? parseColor2.intValue() : this.defaultBgColor);
        ImageHolderKt.bindOrGone$default(getLeftImageIv(), item.getLeftCard().getImage(), null, 2, null);
        ImageHolderKt.bindOrGone$default(getRightImageIv(), item.getRightCard().getImage(), null, 2, null);
        TextHolderKt.bind$default(getLeftTitleTav(), item.getLeftCard().getTitle(), null, 2, null);
        TextHolderKt.bind$default(getRightTitleTav(), item.getRightCard().getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getLeftSubtitleTav(), item.getLeftCard().getSubtitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getRightSubtitleTav(), item.getRightCard().getSubtitle(), null, 2, null);
        BadgeHolderKt.bindOrGone(getLeftBadgeBv(), item.getLeftCard().getBadge(), actionHandler);
        BadgeHolderKt.bindOrGone(getRightBadgeBv(), item.getRightCard().getBadge(), actionHandler);
    }
}
