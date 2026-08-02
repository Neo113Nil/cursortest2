package ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.referralMilesBanner.presentation.ReferralMilesBannerVO;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.app.android.travel.molecules.view.progressView.TravelHorizontalProgressView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020B0Fj\u0002`HJ\b\u0010I\u001a\u00020BH\u0002J\b\u0010J\u001a\u00020BH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b!\u0010\u0016R\u001b\u0010#\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b$\u0010\u0016R\u001b\u0010&\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b'\u0010\u0016R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b,\u0010\u0016R\u001b\u0010.\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b/\u0010\u0016R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00104\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0018\u001a\u0004\b5\u0010\u0016R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0018\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0018\u001a\u0004\b>\u0010?¨\u0006K"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/presentation/view/ReferralMilesBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp8", "dp12", "dp16", "dpF16", "", "dp18", "dp20", "dp32", "progressRadius", "backgroundDrawable", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "backgroundV", "Landroid/view/View;", "imageV", "Lru/ozon/uni/android/atom/image/Image;", "getImageV", "()Lru/ozon/uni/android/atom/image/Image;", "imageV$delegate", "bannerTitleTAV", "getBannerTitleTAV", "bannerTitleTAV$delegate", "userTitleTAV", "getUserTitleTAV", "userTitleTAV$delegate", "userSubtitleTAV", "getUserSubtitleTAV", "userSubtitleTAV$delegate", "userBarrier", "Landroidx/constraintlayout/widget/Barrier;", "referralTitleTAV", "getReferralTitleTAV", "referralTitleTAV$delegate", "referralSubtitleTAV", "getReferralSubtitleTAV", "referralSubtitleTAV$delegate", "progressBarV", "Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView;", "subtitleBarrier", "expectedMilesTitleTAV", "getExpectedMilesTitleTAV", "expectedMilesTitleTAV$delegate", "expectedMilesIconV", "Lru/ozon/uni/android/atom/icon/IconView;", "getExpectedMilesIconV", "()Lru/ozon/uni/android/atom/icon/IconView;", "expectedMilesIconV$delegate", "shareButtonV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getShareButtonV", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "shareButtonV$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/referralMilesBanner/presentation/ReferralMilesBannerVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "addViews", "setupConstraints", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferralMilesBannerView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(ReferralMilesBannerView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(ReferralMilesBannerView.class, "imageV", "getImageV()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(ReferralMilesBannerView.class, "bannerTitleTAV", "getBannerTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(ReferralMilesBannerView.class, "userTitleTAV", "getUserTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(ReferralMilesBannerView.class, "userSubtitleTAV", "getUserSubtitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(ReferralMilesBannerView.class, "referralTitleTAV", "getReferralTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(ReferralMilesBannerView.class, "referralSubtitleTAV", "getReferralSubtitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(ReferralMilesBannerView.class, "expectedMilesTitleTAV", "getExpectedMilesTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(ReferralMilesBannerView.class, "expectedMilesIconV", "getExpectedMilesIconV()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(ReferralMilesBannerView.class, "shareButtonV", "getShareButtonV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final ShapeDrawableWithBorder backgroundDrawable;

    @NotNull
    private final View backgroundV;

    /* renamed from: bannerTitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate bannerTitleTAV;
    private final int dp12;
    private final int dp16;
    private final int dp18;
    private final int dp2;
    private final int dp20;
    private final int dp32;
    private final int dp8;
    private final float dpF16;

    /* renamed from: expectedMilesIconV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate expectedMilesIconV;

    /* renamed from: expectedMilesTitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate expectedMilesTitleTAV;

    /* renamed from: imageV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate imageV;

    @NotNull
    private final TravelHorizontalProgressView progressBarV;
    private final float progressRadius;

    /* renamed from: referralSubtitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate referralSubtitleTAV;

    /* renamed from: referralTitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate referralTitleTAV;

    /* renamed from: shareButtonV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate shareButtonV;

    @NotNull
    private final Barrier subtitleBarrier;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    @NotNull
    private final Barrier userBarrier;

    /* renamed from: userSubtitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate userSubtitleTAV;

    /* renamed from: userTitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate userTitleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralMilesBannerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dpF16 = ResourceExtKt.toPxF(16, context);
        int px = ResourceExtKt.toPx(18, context);
        this.dp18 = px;
        this.dp20 = ResourceExtKt.toPx(20, context);
        this.dp32 = ResourceExtKt.toPx(32, context);
        this.progressRadius = px / 2.0f;
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = this.dpF16;
        }
        ShapeDrawableWithBorder shapeDrawableWithBorder = new ShapeDrawableWithBorder(context, null, fArr, null, 10, null);
        this.backgroundDrawable = shapeDrawableWithBorder;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$1(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$2());
        View view = new View(context);
        view.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41660x = 0;
        view.setLayoutParams(bVar);
        this.backgroundV = view;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.imageV = new PreCreationViewPoolDelegate(context3, N.b(Image.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$3(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.bannerTitleTAV = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$5(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$6(this));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.userTitleTAV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$7(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.userSubtitleTAV = new PreCreationViewPoolDelegate(context6, N.b(TextAtomV2View.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$9(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$10());
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.setReferencedIds(new int[]{getUserTitleTAV().getId(), getUserSubtitleTAV().getId()});
        barrier.f(6);
        this.userBarrier = barrier;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        this.referralTitleTAV = new PreCreationViewPoolDelegate(context7, N.b(TextAtomV2View.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$11(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$12());
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        this.referralSubtitleTAV = new PreCreationViewPoolDelegate(context8, N.b(TextAtomV2View.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$13(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$14());
        TravelHorizontalProgressView travelHorizontalProgressView = new TravelHorizontalProgressView(context);
        travelHorizontalProgressView.setId(View.generateViewId());
        travelHorizontalProgressView.setLayoutParams(new ConstraintLayout.b(0, this.dp18));
        this.progressBarV = travelHorizontalProgressView;
        Barrier barrier2 = new Barrier(context);
        barrier2.setId(View.generateViewId());
        barrier2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier2.setReferencedIds(new int[]{getUserSubtitleTAV().getId(), getReferralSubtitleTAV().getId()});
        barrier2.f(3);
        this.subtitleBarrier = barrier2;
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
        this.expectedMilesTitleTAV = new PreCreationViewPoolDelegate(context9, N.b(TextAtomV2View.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$15(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$16());
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
        this.expectedMilesIconV = new PreCreationViewPoolDelegate(context10, N.b(IconView.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$17(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$18());
        Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
        this.shareButtonV = new PreCreationViewPoolDelegate(context11, N.b(ButtonV3View.class), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$19(this), new ReferralMilesBannerView$special$$inlined$preCreationViewPool$default$20());
        int i12 = this.dp8;
        setPadding(i12, i12, i12, i12);
        addViews();
        setupConstraints();
        view.setBackground(shapeDrawableWithBorder);
    }

    private final void addViews() {
        addView(getTitleTav());
        addView(this.backgroundV);
        addView(getImageV());
        addView(getBannerTitleTAV());
        addView(getUserTitleTAV());
        addView(getUserSubtitleTAV());
        addView(this.userBarrier);
        addView(getReferralTitleTAV());
        addView(getReferralSubtitleTAV());
        addView(this.subtitleBarrier);
        addView(this.progressBarV);
        addView(getExpectedMilesTitleTAV());
        addView(getExpectedMilesIconV());
        addView(getShareButtonV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getBannerTitleTAV() {
        return (TextAtomV2View) this.bannerTitleTAV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView getExpectedMilesIconV() {
        return (IconView) this.expectedMilesIconV.getValue(this, $$delegatedProperties[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getExpectedMilesTitleTAV() {
        return (TextAtomV2View) this.expectedMilesTitleTAV.getValue(this, $$delegatedProperties[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Image getImageV() {
        return (Image) this.imageV.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getReferralSubtitleTAV() {
        return (TextAtomV2View) this.referralSubtitleTAV.getValue(this, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getReferralTitleTAV() {
        return (TextAtomV2View) this.referralTitleTAV.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getShareButtonV() {
        return (ButtonV3View) this.shareButtonV.getValue(this, $$delegatedProperties[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleTav() {
        return (TextAtomV2View) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getUserSubtitleTAV() {
        return (TextAtomV2View) this.userSubtitleTAV.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getUserTitleTAV() {
        return (TextAtomV2View) this.userTitleTAV.getValue(this, $$delegatedProperties[3]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new ReferralMilesBannerView$setupConstraints$1(this));
    }

    public final void bind(@NotNull ReferralMilesBannerVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bindOrGone$default(getTitleTav(), item.getTitle(), null, 2, null);
        ShapeDrawableWithBorder.setFillColor$default(this.backgroundDrawable, item.getBackgroundToken(), 0, 2, null);
        ImageHolderKt.bind$default(getImageV(), item.getImage(), null, 2, null);
        TextHolderKt.bind$default(getBannerTitleTAV(), item.getBannerTitle(), null, 2, null);
        TextHolderKt.bind$default(getUserTitleTAV(), item.getUserTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getUserSubtitleTAV(), item.getUserSubtitle(), null, 2, null);
        TextHolderKt.bind$default(getReferralTitleTAV(), item.getReferralTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getReferralSubtitleTAV(), item.getReferralSubtitle(), null, 2, null);
        if (item.getProgressBar() != null) {
            TravelHorizontalProgressView travelHorizontalProgressView = this.progressBarV;
            ViewExtKt.show(travelHorizontalProgressView);
            travelHorizontalProgressView.setFillRadius(this.progressRadius);
            travelHorizontalProgressView.setText(item.getProgressBar().getText());
            travelHorizontalProgressView.setProgress(item.getProgressBar().getPercent());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = travelHorizontalProgressView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            travelHorizontalProgressView.setFillColor(styleParser.parseColor(context, item.getProgressBar().getProgressBarColor()));
            Context context2 = travelHorizontalProgressView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            travelHorizontalProgressView.setBarColor(styleParser.parseColor(context2, item.getProgressBackgroundColor()));
        } else {
            ViewExtKt.gone(this.progressBarV);
        }
        TextHolderKt.bindOrGone$default(getExpectedMilesTitleTAV(), item.getExpectedMilesTitle(), null, 2, null);
        IconHolderKt.bindOrGone$default(getExpectedMilesIconV(), item.getExpectedMilesIcon(), null, 2, null);
        ButtonV3HolderKt.bind(getShareButtonV(), item.getShareButton(), actionHandler);
    }
}
