package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Vg.d;
import WZ.l;
import Wc.a;
import android.graphics.Paint;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import jk0.o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3ViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 Q2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001QB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J+\u0010-\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J#\u0010-\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)H\u0014¢\u0006\u0004\b-\u0010/J\u000f\u00100\u001a\u00020\u001aH\u0016¢\u0006\u0004\b0\u0010!J\u000f\u00101\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u0010!J\u0017\u00103\u001a\u00020\u001a2\u0006\u0010*\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108R\u0016\u0010:\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u001a0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onboardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3ViewModel;", "travelCellListV3ViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LWZ/l;Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3ViewModel;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "vo", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;", "layoutModel", "", "bindOnBoarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;)V", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "subscribeToOnboarding", "()V", "applyLayoutModel", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO$LayoutModel;)V", "", "isScreenVisible", "()Z", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3VO;Ll20/d;)V", "onAttach", "onDetach", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3ViewModel;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "atomViewContainer", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Landroid/graphics/drawable/ShapeDrawable;", "islandDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/LayerDrawable;", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "", "onboardingCornerRadius", "F", "", "onboardingTopOffset", "I", "onboardingBottomOffset", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCellListV3WidgetViewHolder extends k<TravelCellListV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final SingleAtom atomViewContainer;

    @NotNull
    private final ShapeDrawable backgroundDrawable;

    @NotNull
    private final ShapeDrawable islandDrawable;

    @NotNull
    private final LayerDrawable layerDrawable;
    private OnBoardingDelegate onBoardingDelegate;
    private final int onboardingBottomOffset;
    private final float onboardingCornerRadius;
    private final int onboardingTopOffset;

    @NotNull
    private final BaseOnBoardingViewModel onboardingViewModel;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TravelCellListV3ViewModel travelCellListV3ViewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3WidgetViewHolder$Companion;", "", "<init>", "()V", "FULL_VISIBLE_VIEW_PERCENT", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCellListV3WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull BaseOnBoardingViewModel onboardingViewModel, @NotNull l tokenizedAnalytics, @NotNull TravelCellListV3ViewModel travelCellListV3ViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(travelCellListV3ViewModel, "travelCellListV3ViewModel");
        this.references = references;
        this.onboardingViewModel = onboardingViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.travelCellListV3ViewModel = travelCellListV3ViewModel;
        SingleAtom singleAtom = containerView instanceof SingleAtom ? (SingleAtom) containerView : null;
        this.atomViewContainer = singleAtom;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.islandDrawable = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        this.backgroundDrawable = shapeDrawable2;
        this.layerDrawable = new LayerDrawable(new ShapeDrawable[]{shapeDrawable2, shapeDrawable});
        this.onboardingCornerRadius = ResourceExtKt.toPxF(16, getContext());
        this.onboardingTopOffset = ResourceExtKt.toPx(12, getContext());
        this.onboardingBottomOffset = ResourceExtKt.toPx(10, getContext());
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelCellListV3WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        if (singleAtom != null) {
            singleAtom.setOnAction(buildHandler);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyLayoutModel(TravelCellListV3VO.LayoutModel layoutModel) {
        ShapeDrawable shapeDrawable;
        SingleAtom singleAtom = this.atomViewContainer;
        if (singleAtom != null) {
            singleAtom.setPadding(layoutModel.getLeftMargin(), layoutModel.getTopMargin(), layoutModel.getRightMargin(), layoutModel.getBottomMargin());
        }
        Paint paint = this.backgroundDrawable.getPaint();
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), layoutModel.getBackgroundColor());
        paint.setColor(parseColor != null ? parseColor.intValue() : 0);
        TravelCellListV3VO.LayoutModel.Background blockBackground = layoutModel.getBlockBackground();
        if (blockBackground != null) {
            ShapeDrawable shapeDrawable2 = this.islandDrawable;
            Paint paint2 = shapeDrawable2.getPaint();
            Integer parseColor2 = styleParser.parseColor(getContext(), blockBackground.getBackgroundColor());
            paint2.setColor(parseColor2 != null ? parseColor2.intValue() : 0);
            shapeDrawable2.setShape(new RoundRectShape(new float[]{blockBackground.getTopCornersRadius(), blockBackground.getTopCornersRadius(), blockBackground.getTopCornersRadius(), blockBackground.getTopCornersRadius(), blockBackground.getBottomCornersRadius(), blockBackground.getBottomCornersRadius(), blockBackground.getBottomCornersRadius(), blockBackground.getBottomCornersRadius()}, null, null));
            LayerDrawable layerDrawable = this.layerDrawable;
            layerDrawable.setLayerInset(1, layoutModel.getLeftMargin(), layoutModel.getTopMargin(), layoutModel.getRightMargin(), layoutModel.getBottomMargin());
            shapeDrawable = layerDrawable;
        } else {
            shapeDrawable = this.backgroundDrawable;
        }
        SingleAtom singleAtom2 = this.atomViewContainer;
        if (singleAtom2 != null) {
            singleAtom2.setBackground(shapeDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(final OnBoardingDTO vo, AtomDTO atom, final TravelCellListV3VO.LayoutModel layoutModel) {
        SingleAtom singleAtom;
        View childAt;
        if (!isScreenVisible()) {
            this.travelCellListV3ViewModel.setIsModalShown();
            return;
        }
        final CellDTO cellDTO = atom instanceof CellDTO ? (CellDTO) atom : null;
        if (cellDTO == null || (singleAtom = this.atomViewContainer) == null || (childAt = singleAtom.getChildAt(0)) == null) {
            return;
        }
        if (!childAt.isLaidOut() || childAt.isLayoutRequested()) {
            childAt.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$bindOnBoarding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ComposerExtKt.withPageTag(TravelCellListV3WidgetViewHolder.this.references.getContainer(), new TravelCellListV3WidgetViewHolder$bindOnBoarding$1$1(TravelCellListV3WidgetViewHolder.this, vo, cellDTO, layoutModel));
                }
            });
        } else {
            ComposerExtKt.withPageTag(this.references.getContainer(), new TravelCellListV3WidgetViewHolder$bindOnBoarding$1$1(this, vo, cellDTO, layoutModel));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        String onboardingKey = onBoarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "travel_cell_wlist_v3_onboarding_key";
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.references, this.itemView, onBoarding, this, this.onboardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new TravelCellListV3WidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    private final boolean isScreenVisible() {
        List<ComponentCallbacksC5392m> r02;
        G d11 = this.references.getContainer().d();
        ComponentCallbacksC5392m componentCallbacksC5392m = (d11 == null || (r02 = d11.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02);
        return (componentCallbacksC5392m instanceof ComposerFragment) && ((ComposerFragment) componentCallbacksC5392m).getConfig().getBottomSheetConfig() == null;
    }

    private final void subscribeToOnboarding() {
        final InterfaceC2395h a11 = C5427n.a(this.travelCellListV3ViewModel.getOnboardingSharedFlow(), getLifecycle(), AbstractC5434v.b.STARTED);
        C2399j.C(new C2408n0(new InterfaceC2395h<TravelCellListV3ViewModel.OnboardingEvent>() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$subscribeToOnboarding$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$subscribeToOnboarding$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ TravelCellListV3WidgetViewHolder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$subscribeToOnboarding$$inlined$filter$1$2", f = "TravelCellListV3WidgetViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$subscribeToOnboarding$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = travelCellListV3WidgetViewHolder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                TravelCellListV3ViewModel.OnboardingEvent onboardingEvent = (TravelCellListV3ViewModel.OnboardingEvent) obj;
                                TravelCellListV3VO boundData = this.this$0.getBoundData();
                                if (boundData != null && onboardingEvent.getRecipientId() == boundData.getId()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super TravelCellListV3ViewModel.OnboardingEvent> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2(this, null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        TravelCellListV3VO boundData = getBoundData();
        if ((boundData != null ? boundData.getOnboardingApp() : null) != null) {
            subscribeToOnboarding();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        ComposerExtKt.withPageTag(this.references.getContainer(), new TravelCellListV3WidgetViewHolder$onDetach$1(this));
        this.onBoardingDelegate = null;
        super.onDetach();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        TravelCellListV3VO boundData;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        TravelCellListV3VO boundData2 = getBoundData();
        if ((boundData2 != null ? boundData2.getOnboardingApp() : null) != null) {
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            if (o.a(itemView, info, false) < 1.0f || (boundData = getBoundData()) == null) {
                return;
            }
            this.travelCellListV3ViewModel.onCellIsOnTheScreen(boundData);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelCellListV3VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        List list = payload instanceof List ? (List) payload : null;
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj == TravelCellListV3Payload.DATA) {
                SingleAtom singleAtom = this.atomViewContainer;
                if (singleAtom != null) {
                    SingleAtom.bind$default(singleAtom, item.getAtom(), false, 2, null);
                }
            } else if (obj == TravelCellListV3Payload.LAYOUT) {
                applyLayoutModel(item.getLayoutModel());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelCellListV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SingleAtom singleAtom = this.atomViewContainer;
        if (singleAtom != null) {
            SingleAtom.bind$default(singleAtom, item.getAtom(), false, 2, null);
        }
        applyLayoutModel(item.getLayoutModel());
    }
}
