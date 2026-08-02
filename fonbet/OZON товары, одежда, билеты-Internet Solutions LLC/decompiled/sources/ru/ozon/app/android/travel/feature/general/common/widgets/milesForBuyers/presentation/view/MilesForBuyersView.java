package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.view;

import Bl.b;
import Lc.a;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.BaseMilesForBuyersViewBinder;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.binder.MilesForBuyersViewBinderFactory;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.app.android.travel.molecules.view.progressView.TravelHorizontalProgressView;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0001QB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010=\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00100R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010H\u001a\u00020D8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u001c\u001a\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "onDetachedFromWindow", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO;Lkotlin/jvm/functions/Function1;)V", "showLoader", "hideLoader", "onViewCompletelyVisible", "", "cornerRadii", "F", "Lkotlin/reflect/d;", "currentStateType", "Lkotlin/reflect/d;", "fontScale$delegate", "LSc/j;", "getFontScale", "()F", "fontScale", "Lru/ozon/uni/android/atom/image/Image;", "backgroundImageIv", "Lru/ozon/uni/android/atom/image/Image;", "getBackgroundImageIv", "()Lru/ozon/uni/android/atom/image/Image;", "Landroid/view/View;", "backgroundView", "Landroid/view/View;", "getBackgroundView", "()Landroid/view/View;", "imageIv", "getImageIv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "getSubtitleTav", "Lru/ozon/uni/android/atom/badge/BadgeView;", "subtitleBadgeBv", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getSubtitleBadgeBv", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView;", "progressView", "Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView;", "getProgressView", "()Lru/ozon/app/android/travel/molecules/view/progressView/TravelHorizontalProgressView;", "descriptionTav", "getDescriptionTav", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonBv", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonBv", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "foregroundDrawable$delegate", "getForegroundDrawable", "()Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "foregroundDrawable", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/MilesForBuyersViewBinderFactory;", "viewBinderFactory$delegate", "getViewBinderFactory", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/MilesForBuyersViewBinderFactory;", "viewBinderFactory", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "binder", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/binder/BaseMilesForBuyersViewBinder;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersView extends ConstraintLayout {

    @NotNull
    private final Image backgroundImageIv;

    @NotNull
    private final View backgroundView;
    private BaseMilesForBuyersViewBinder binder;

    @NotNull
    private final ButtonV3View buttonBv;
    private final float cornerRadii;

    @NotNull
    private d<?> currentStateType;

    @NotNull
    private final TextAtomV2View descriptionTav;

    /* renamed from: fontScale$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fontScale;

    /* renamed from: foregroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j foregroundDrawable;

    @NotNull
    private final Image imageIv;

    @NotNull
    private final TravelHorizontalProgressView progressView;

    @NotNull
    private final BadgeView subtitleBadgeBv;

    @NotNull
    private final TextAtomV2View subtitleTav;

    @NotNull
    private final TextAtomV2View titleTav;

    /* renamed from: viewBinderFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewBinderFactory;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/view/MilesForBuyersView$Companion;", "", "<init>", "()V", "CORNER_RADIUS", "", "DEFAULT_FONT_SCALE", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilesForBuyersView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(16, context);
        this.cornerRadii = pxF;
        this.currentStateType = N.b(Void.class);
        this.fontScale = LazyUtilsKt.unsafeLazy(new MilesForBuyersView$fontScale$2(context));
        q qVar = q.f64554a;
        Image image = (Image) b.a(Image.class, "type", qVar, null);
        if (image == null) {
            context2 = context;
            image = new Image(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        image.setId(R$id.milesForBuyersBackgroundImage);
        image.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.backgroundImageIv = image;
        View view = new View(context2);
        view.setId(R$id.milesForBuyersCardBackground);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.backgroundView = view;
        Image image2 = (Image) b.a(Image.class, "type", qVar, null);
        image2 = image2 == null ? new Image(context2, null, 0, 6, null) : image2;
        image2.setId(R$id.milesForBuyersImage);
        image2.setLayoutParams(new ConstraintLayout.b(-2, 0));
        this.imageIv = image2;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        a.d(textAtomV2View, R$id.milesForBuyersTitle, 0, -2, false);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        a.d(textAtomV2View2, R$id.milesForBuyersSubtitle, -2, -2, false);
        this.subtitleTav = textAtomV2View2;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context2);
        Im.a.c(badgeView, R$id.milesForBuyersSubtitleBadge, -2, -2);
        this.subtitleBadgeBv = badgeView;
        TravelHorizontalProgressView travelHorizontalProgressView = new TravelHorizontalProgressView(context2);
        travelHorizontalProgressView.setId(R$id.milesForBuyersProgress);
        travelHorizontalProgressView.setLayoutParams(new ConstraintLayout.b(0, ResourceExtKt.toPx(18, context2)));
        this.progressView = travelHorizontalProgressView;
        TextAtomV2View textAtomV2View3 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        a.d(textAtomV2View3, R$id.milesForBuyersDescription, 0, -2, false);
        this.descriptionTav = textAtomV2View3;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context2);
        buttonV3View = buttonV3View == null ? new ButtonV3View(context2, null, 0, 0, 14, null) : buttonV3View;
        buttonV3View.setId(R$id.milesForBuyersButton);
        buttonV3View.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.buttonBv = buttonV3View;
        this.foregroundDrawable = LazyUtilsKt.unsafeLazy(new MilesForBuyersView$foregroundDrawable$2(context2, this));
        this.viewBinderFactory = LazyUtilsKt.unsafeLazy(MilesForBuyersView$viewBinderFactory$2.INSTANCE);
        addViews();
        ViewExtensionsKt.applyRoundedOutline(this, pxF);
    }

    private final void addViews() {
        addView(this.backgroundImageIv);
        addView(this.backgroundView);
        addView(this.imageIv);
        addView(this.titleTav);
        addView(this.subtitleTav);
        addView(this.subtitleBadgeBv);
        addView(this.progressView);
        addView(this.descriptionTav);
        addView(this.buttonBv);
    }

    private final MilesForBuyersViewBinderFactory getViewBinderFactory() {
        return (MilesForBuyersViewBinderFactory) this.viewBinderFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoader$lambda$10(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoader$lambda$11(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void bind(@NotNull MilesForBuyersVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        MilesForBuyersVO.State state = item.getState();
        if (!N.b(state.getClass()).equals(this.currentStateType)) {
            this.currentStateType = N.b(state.getClass());
            BaseMilesForBuyersViewBinder baseMilesForBuyersViewBinder = this.binder;
            if (baseMilesForBuyersViewBinder != null) {
                baseMilesForBuyersViewBinder.onViewDetached();
            }
            BaseMilesForBuyersViewBinder viewBinder = getViewBinderFactory().getViewBinder(N.b(item.getState().getClass()), this);
            this.binder = viewBinder;
            if (viewBinder != null) {
                viewBinder.prepareViewLayout();
            }
        }
        BaseMilesForBuyersViewBinder baseMilesForBuyersViewBinder2 = this.binder;
        if (baseMilesForBuyersViewBinder2 != null) {
            baseMilesForBuyersViewBinder2.bind(item.getState(), onAction);
        }
    }

    @NotNull
    public final Image getBackgroundImageIv() {
        return this.backgroundImageIv;
    }

    @NotNull
    public final View getBackgroundView() {
        return this.backgroundView;
    }

    @NotNull
    public final ButtonV3View getButtonBv() {
        return this.buttonBv;
    }

    @NotNull
    public final TextAtomV2View getDescriptionTav() {
        return this.descriptionTav;
    }

    public final float getFontScale() {
        return ((Number) this.fontScale.getValue()).floatValue();
    }

    @NotNull
    public final ShapeDrawableWithBorder getForegroundDrawable() {
        return (ShapeDrawableWithBorder) this.foregroundDrawable.getValue();
    }

    @NotNull
    public final Image getImageIv() {
        return this.imageIv;
    }

    @NotNull
    public final TravelHorizontalProgressView getProgressView() {
        return this.progressView;
    }

    @NotNull
    public final BadgeView getSubtitleBadgeBv() {
        return this.subtitleBadgeBv;
    }

    @NotNull
    public final TextAtomV2View getSubtitleTav() {
        return this.subtitleTav;
    }

    @NotNull
    public final TextAtomV2View getTitleTav() {
        return this.titleTav;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void hideLoader() {
        this.buttonBv.hideLoader();
        this.buttonBv.setOnTouchListener(null);
        setOnTouchListener(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BaseMilesForBuyersViewBinder baseMilesForBuyersViewBinder = this.binder;
        if (baseMilesForBuyersViewBinder != null) {
            baseMilesForBuyersViewBinder.onViewDetached();
        }
    }

    public final void onViewCompletelyVisible() {
        BaseMilesForBuyersViewBinder baseMilesForBuyersViewBinder = this.binder;
        if (baseMilesForBuyersViewBinder != null) {
            baseMilesForBuyersViewBinder.onViewCompletelyVisible();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void showLoader() {
        setOnTouchListener(new RO.a());
        this.buttonBv.setOnTouchListener(new RO.b());
        this.buttonBv.showLoader();
    }
}
