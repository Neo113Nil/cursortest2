package ru.ozon.app.android.geo.map.presentation.utils;

import BZ.e;
import Ey.ViewOnClickListenerC2975b;
import Tl.a;
import WZ.l;
import WZ.m;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.common.decorator.BadgesHorizontalOffsetDecorator;
import ru.ozon.app.android.geo.databinding.MapDetailsBottomSheetBinding;
import ru.ozon.app.android.geo.flags.SearchAddressModalOnMapInit;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.utils.SheetPageHelper;
import ru.ozon.app.android.geo.map.utils.BottomSheetActionParams;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetResultConfigurator;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\\\u0018\u0000 d2\u00020\u0001:\u0001dB\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020)H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00103\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104JS\u0010A\u001a\u00020\b2\u0006\u00106\u001a\u0002052\u0006\u0010%\u001a\u00020$2\u0006\u00108\u001a\u0002072\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001092\u0006\u0010<\u001a\u00020\u00042\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\b¢\u0006\u0004\bC\u0010\"J\r\u0010D\u001a\u00020\b¢\u0006\u0004\bD\u0010\"J\r\u0010E\u001a\u00020\b¢\u0006\u0004\bE\u0010\"J\r\u0010F\u001a\u00020\b¢\u0006\u0004\bF\u0010\"J\r\u0010G\u001a\u00020\b¢\u0006\u0004\bG\u0010\"J\u0015\u0010H\u001a\u00020\b2\u0006\u00106\u001a\u000205¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010LR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010PR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010RR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010SR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010MR\u0016\u0010T\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010KR\u0016\u0010U\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010VR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010VR\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010c¨\u0006e"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/utils/SheetPageHelper;", "", "Lru/ozon/app/android/geo/databinding/MapDetailsBottomSheetBinding;", "binding", "", "minTopToAllowAttachAnchors", "Lkotlin/Function0;", "maxTopToAllowAttachAnchors", "", "attachAnchorsHandler", "detachAnchorsHandler", "Lkotlin/Function1;", "", "onAnchorsOffsetChanged", "Landroid/view/ViewGroup;", "sheetCoordinatorContainer", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroid/widget/LinearLayout;", "filtersContainer", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LBZ/e;", "miniAppConfigHolder", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lru/ozon/app/android/geo/databinding/MapDetailsBottomSheetBinding;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroid/view/ViewGroup;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Lru/ozon/app/android/network/abtool/FeatureChecker;LBZ/e;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "newState", "processStateChanged", "(I)V", "triggerDetachAnchorsCallback", "()V", "triggerAttachAnchorsCallback", "Li10/h$c;", "pageRef", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getDetailsBottomSheetConfig", "(Li10/h$c;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "", "shouldShow", "stickyContainerVisibilityChangeHandler", "(Z)V", "getTopOffset", "()I", "isSearchAddressModalOnMapInit", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "number", "setConstraints", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Landroidx/fragment/app/G;", "fragmentManager", "Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;", "params", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "bottomSheetState", "LWZ/t;", "bottomSheetTokenizedEvent", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "numberPVZ", "load", "(Landroidx/fragment/app/G;Li10/h$c;Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;Ljava/util/List;ILWZ/t;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;)V", "show", "hide", "showOuterLoader", "hideOuterLoader", "attachToPage", "detachFromPage", "(Landroidx/fragment/app/G;)V", "Lru/ozon/app/android/geo/databinding/MapDetailsBottomSheetBinding;", "I", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewGroup;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LBZ/e;", "LWZ/l;", "startBottomSheetState", "isAnchorsAttached", "Z", "Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "Landroid/widget/FrameLayout;", "behavior", "Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "allowAttachAnchors", "ru/ozon/app/android/geo/map/presentation/utils/SheetPageHelper$bottomSheetCallback$1", "bottomSheetCallback", "Lru/ozon/app/android/geo/map/presentation/utils/SheetPageHelper$bottomSheetCallback$1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "badgesAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "isFragmentCreated", "LWZ/t;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SheetPageHelper {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean allowAttachAnchors;

    @NotNull
    private final Function0<Unit> attachAnchorsHandler;

    @NotNull
    private final AtomsAdapter badgesAdapter;
    private OzonBottomSheetBehavior<FrameLayout> behavior;

    @NotNull
    private final MapDetailsBottomSheetBinding binding;

    @NotNull
    private final SheetPageHelper$bottomSheetCallback$1 bottomSheetCallback;
    private t bottomSheetTokenizedEvent;
    private final RecyclerView composerRecyclerView;

    @NotNull
    private final Function0<Unit> detachAnchorsHandler;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final LinearLayout filtersContainer;
    private boolean isAnchorsAttached;
    private boolean isFragmentCreated;

    @NotNull
    private final Function0<Integer> maxTopToAllowAttachAnchors;
    private final int minTopToAllowAttachAnchors;

    @NotNull
    private final e miniAppConfigHolder;

    @NotNull
    private final Function1<Float, Unit> onAnchorsOffsetChanged;

    @NotNull
    private final ViewGroup sheetCoordinatorContainer;
    private int startBottomSheetState;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int SEARCH_ADDRESS_MODAL_TOP_OFFSET = ResourceExtKt.toPx(12);
    private static final int CONTAINER_ID = R$id.detailsFragmentContainer;

    @NotNull
    private static final IconButtonV3DTO CLOSE_BUTTON = new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, "graphicSecondary", "bgOverlap", null, null, null, null, null, null, null, 16272, null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/utils/SheetPageHelper$Companion;", "", "<init>", "()V", "", "FRAGMENT_TAG_DETAILS", "Ljava/lang/String;", "", "PEEK_HEIGHT_RATE", "F", "STATE_EXPANDED", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [ru.ozon.app.android.geo.map.presentation.utils.SheetPageHelper$bottomSheetCallback$1] */
    public SheetPageHelper(@NotNull MapDetailsBottomSheetBinding binding, int i11, @NotNull Function0<Integer> maxTopToAllowAttachAnchors, @NotNull Function0<Unit> attachAnchorsHandler, @NotNull Function0<Unit> detachAnchorsHandler, @NotNull Function1<? super Float, Unit> onAnchorsOffsetChanged, @NotNull ViewGroup sheetCoordinatorContainer, RecyclerView recyclerView, @NotNull LinearLayout filtersContainer, @NotNull FeatureChecker featureChecker, @NotNull e miniAppConfigHolder, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(maxTopToAllowAttachAnchors, "maxTopToAllowAttachAnchors");
        Intrinsics.checkNotNullParameter(attachAnchorsHandler, "attachAnchorsHandler");
        Intrinsics.checkNotNullParameter(detachAnchorsHandler, "detachAnchorsHandler");
        Intrinsics.checkNotNullParameter(onAnchorsOffsetChanged, "onAnchorsOffsetChanged");
        Intrinsics.checkNotNullParameter(sheetCoordinatorContainer, "sheetCoordinatorContainer");
        Intrinsics.checkNotNullParameter(filtersContainer, "filtersContainer");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.binding = binding;
        this.minTopToAllowAttachAnchors = i11;
        this.maxTopToAllowAttachAnchors = maxTopToAllowAttachAnchors;
        this.attachAnchorsHandler = attachAnchorsHandler;
        this.detachAnchorsHandler = detachAnchorsHandler;
        this.onAnchorsOffsetChanged = onAnchorsOffsetChanged;
        this.sheetCoordinatorContainer = sheetCoordinatorContainer;
        this.composerRecyclerView = recyclerView;
        this.filtersContainer = filtersContainer;
        this.featureChecker = featureChecker;
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        this.startBottomSheetState = 4;
        this.bottomSheetCallback = new BottomSheetBehavior.f() { // from class: ru.ozon.app.android.geo.map.presentation.utils.SheetPageHelper$bottomSheetCallback$1
            /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onSlide(View bottomSheet, float slideOffset) {
                boolean z11;
                Function0 function0;
                boolean z12;
                boolean z13;
                boolean z14;
                OzonBottomSheetBehavior ozonBottomSheetBehavior;
                Function1 function1;
                int i12;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                z11 = SheetPageHelper.this.allowAttachAnchors;
                SheetPageHelper sheetPageHelper = SheetPageHelper.this;
                int top = bottomSheet.getTop();
                function0 = SheetPageHelper.this.maxTopToAllowAttachAnchors;
                if (top < ((Number) function0.invoke()).intValue()) {
                    int top2 = bottomSheet.getTop();
                    i12 = SheetPageHelper.this.minTopToAllowAttachAnchors;
                    if (top2 > i12) {
                        z12 = true;
                        sheetPageHelper.allowAttachAnchors = z12;
                        z13 = SheetPageHelper.this.allowAttachAnchors;
                        if (z13) {
                            function1 = SheetPageHelper.this.onAnchorsOffsetChanged;
                            function1.invoke(Float.valueOf(slideOffset));
                        }
                        z14 = SheetPageHelper.this.allowAttachAnchors;
                        if (z14 != z11 || ozonBottomSheetBehavior == null) {
                        }
                        SheetPageHelper.this.processStateChanged(ozonBottomSheetBehavior.getState());
                        return;
                    }
                }
                z12 = false;
                sheetPageHelper.allowAttachAnchors = z12;
                z13 = SheetPageHelper.this.allowAttachAnchors;
                if (z13) {
                }
                z14 = SheetPageHelper.this.allowAttachAnchors;
                if (z14 != z11) {
                    ozonBottomSheetBehavior = SheetPageHelper.this.behavior;
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                bottomSheet.requestLayout();
                SheetPageHelper.this.processStateChanged(newState);
            }
        };
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.badgesAdapter = atomsAdapter;
        HorizontalAtomsLayout horizontalAtomsLayout = binding.badgesHAL;
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new BadgesHorizontalOffsetDecorator(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachToPage$lambda$11$lambda$10(SheetPageHelper sheetPageHelper, View view) {
        sheetPageHelper.hide();
        t tVar = sheetPageHelper.bottomSheetTokenizedEvent;
        if (tVar != null) {
            m.a(sheetPageHelper.tokenizedAnalytics, tVar, null);
        }
    }

    private final ComposerScreenConfig getDetailsBottomSheetConfig(h.c pageRef) {
        return new ComposerScreenConfig(pageRef, null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, false, false, null, 0, false, false, false, false, false, false, 2046, null), false, false, false, false, null, false, false, false, e0.h(YandexSearchSheetResultConfigurator.class), null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16740342, null);
    }

    private final int getTopOffset() {
        return this.filtersContainer.getHeight() + SEARCH_ADDRESS_MODAL_TOP_OFFSET;
    }

    private final boolean isSearchAddressModalOnMapInit() {
        return this.featureChecker.isEnabled(SearchAddressModalOnMapInit.INSTANCE) && MiniAppExtKt.isMain(this.miniAppConfigHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean load$lambda$3(AddressEditMapVO.NumberPVZ numberPVZ, SheetPageHelper sheetPageHelper, View view, MotionEvent motionEvent) {
        AtomAction action;
        if (motionEvent.getAction() != 1 || numberPVZ == null || (action = numberPVZ.getAction()) == null) {
            return false;
        }
        sheetPageHelper.actionHandler.invoke(action);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processStateChanged(int newState) {
        RecyclerView recyclerView = this.composerRecyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(newState == 5 ? 0 : 8);
        }
        if (!this.allowAttachAnchors) {
            triggerDetachAnchorsCallback();
        } else if (newState != 5) {
            triggerAttachAnchorsCallback();
        } else {
            triggerDetachAnchorsCallback();
        }
        if (newState == 1 || newState == 5) {
            LinearLayout constraintLayout = this.binding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            KeyboardUtilsKt.hideKeyboard(constraintLayout);
        }
        stickyContainerVisibilityChangeHandler(newState != 5);
    }

    private final void setConstraints(TextDTO number) {
        if (number == null) {
            ConstraintLayout constraintLayout = this.binding.titleContainer;
            d d11 = a.d(constraintLayout, "titleContainer", constraintLayout);
            ConstraintSetExtKt.topToTop$default(d11, this.binding.detailsSheetTitleTv.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(d11, this.binding.detailsSheetTitleTv.getId(), 0, 0, 4, null);
            d11.f(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = this.binding.titleContainer;
        d d12 = a.d(constraintLayout2, "titleContainer", constraintLayout2);
        ConstraintSetExtKt.topToBottom$default(d12, this.binding.detailsSheetTitleTv.getId(), this.binding.numberPVZ.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(d12, this.binding.detailsSheetTitleTv.getId(), 0, 0, 4, null);
        d12.f(constraintLayout2);
    }

    private final void stickyContainerVisibilityChangeHandler(boolean shouldShow) {
        FrameLayout addressEditMapDetailsBottomSheetStickyContainer = this.binding.addressEditMapDetailsBottomSheetStickyContainer;
        Intrinsics.checkNotNullExpressionValue(addressEditMapDetailsBottomSheetStickyContainer, "addressEditMapDetailsBottomSheetStickyContainer");
        ViewExtKt.showOrGone(addressEditMapDetailsBottomSheetStickyContainer, Boolean.valueOf(shouldShow));
    }

    private final void triggerAttachAnchorsCallback() {
        if (this.isAnchorsAttached) {
            return;
        }
        this.isAnchorsAttached = true;
        this.attachAnchorsHandler.invoke();
    }

    private final void triggerDetachAnchorsCallback() {
        if (this.isAnchorsAttached) {
            this.isAnchorsAttached = false;
            this.detachAnchorsHandler.invoke();
        }
    }

    public final void attachToPage() {
        MapDetailsBottomSheetBinding mapDetailsBottomSheetBinding = this.binding;
        this.sheetCoordinatorContainer.addView(mapDetailsBottomSheetBinding.getConstraintLayout());
        float f7 = r1.getResources().getDisplayMetrics().heightPixels * 0.33333334f;
        LoaderView loaderView = mapDetailsBottomSheetBinding.progressSpinnerMpb;
        ViewGroup.LayoutParams layoutParams = loaderView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (int) (f7 / 2);
        loaderView.setLayoutParams(marginLayoutParams);
        OzonBottomSheetBehavior.Companion companion = OzonBottomSheetBehavior.INSTANCE;
        FrameLayout addressEditMapDetailsBottomSheetContainerContent = mapDetailsBottomSheetBinding.addressEditMapDetailsBottomSheetContainerContent;
        Intrinsics.checkNotNullExpressionValue(addressEditMapDetailsBottomSheetContainerContent, "addressEditMapDetailsBottomSheetContainerContent");
        OzonBottomSheetBehavior<FrameLayout> from = companion.from(addressEditMapDetailsBottomSheetContainerContent);
        from.setBottomSheetCallback(this.bottomSheetCallback);
        from.setHideable(true);
        from.setPeekHeight((int) f7);
        from.setState(5);
        this.behavior = from;
        IconButtonV3View actionDrawableIv = mapDetailsBottomSheetBinding.actionDrawableIv;
        Intrinsics.checkNotNullExpressionValue(actionDrawableIv, "actionDrawableIv");
        IconButtonV3HolderKt.bindOrGone$default(actionDrawableIv, CLOSE_BUTTON, null, 2, null);
        mapDetailsBottomSheetBinding.actionDrawableIv.setOnClickListener(new ViewOnClickListenerC2975b(this, 0));
    }

    public final void detachFromPage(@NotNull G fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.isFragmentCreated = false;
        Q p11 = fragmentManager.p();
        ComposerFragment composerFragment = (ComposerFragment) fragmentManager.g0("ru.ozon.app.android.checkoutcomposer.map.presentation.FRAGMENT_TAG_DETAILS");
        if (composerFragment != null) {
            p11.q(composerFragment);
        }
        p11.j();
        ViewGroup viewGroup = this.sheetCoordinatorContainer;
        View findViewById = viewGroup.findViewById(ru.ozon.app.android.composer.R$id.addressEditMapDetailsBottomSheetContainer);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        OzonBottomSheetBehavior<FrameLayout> ozonBottomSheetBehavior = this.behavior;
        if (ozonBottomSheetBehavior != null) {
            ozonBottomSheetBehavior.setBottomSheetCallback(null);
        }
        this.behavior = null;
        this.binding.actionDrawableIv.setOnClickListener(null);
    }

    public final void hide() {
        OzonBottomSheetBehavior<FrameLayout> ozonBottomSheetBehavior = this.behavior;
        if (ozonBottomSheetBehavior != null) {
            ozonBottomSheetBehavior.setState(5);
        }
    }

    public final void hideOuterLoader() {
        FrameLayout detailsSheetLoadingFl = this.binding.detailsSheetLoadingFl;
        Intrinsics.checkNotNullExpressionValue(detailsSheetLoadingFl, "detailsSheetLoadingFl");
        ViewExtKt.gone(detailsSheetLoadingFl);
        FrameLayout addressEditMapDetailsBottomSheetStickyLoadingFl = this.binding.addressEditMapDetailsBottomSheetStickyLoadingFl;
        Intrinsics.checkNotNullExpressionValue(addressEditMapDetailsBottomSheetStickyLoadingFl, "addressEditMapDetailsBottomSheetStickyLoadingFl");
        ViewExtKt.gone(addressEditMapDetailsBottomSheetStickyLoadingFl);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void load(@NotNull G fragmentManager, @NotNull h.c pageRef, @NotNull BottomSheetActionParams params, List<BadgeDTO> badges, int bottomSheetState, t bottomSheetTokenizedEvent, final AddressEditMapVO.NumberPVZ numberPVZ) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(pageRef, "pageRef");
        Intrinsics.checkNotNullParameter(params, "params");
        ComposerFragment composerFragment = (pageRef instanceof h.c.b ? this : null) != null ? (ComposerFragment) fragmentManager.g0("ru.ozon.app.android.checkoutcomposer.map.presentation.FRAGMENT_TAG_DETAILS") : null;
        TextView textView = this.binding.detailsSheetTitleTv;
        String title = params.getTitle();
        if (title == null) {
            title = "";
        }
        textView.setText(title);
        TextAtomV2View numberPVZ2 = this.binding.numberPVZ;
        Intrinsics.checkNotNullExpressionValue(numberPVZ2, "numberPVZ");
        TextHolderKt.bindOrGone$default(numberPVZ2, numberPVZ != null ? numberPVZ.getNumber() : null, null, 2, null);
        this.binding.numberPVZ.setOnTouchListener(new View.OnTouchListener() { // from class: Ey.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean load$lambda$3;
                load$lambda$3 = SheetPageHelper.load$lambda$3(AddressEditMapVO.NumberPVZ.this, this, view, motionEvent);
                return load$lambda$3;
            }
        });
        setConstraints(numberPVZ != null ? numberPVZ.getNumber() : null);
        AtomsAdapter atomsAdapter = this.badgesAdapter;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, badges == null ? K.f71697a : badges);
        ComposerScreenConfig detailsBottomSheetConfig = getDetailsBottomSheetConfig(pageRef);
        if (composerFragment == null || !this.isFragmentCreated) {
            ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, detailsBottomSheetConfig, null, null, 6, null);
            Q p11 = fragmentManager.p();
            p11.r(CONTAINER_ID, newInstance$default, "ru.ozon.app.android.checkoutcomposer.map.presentation.FRAGMENT_TAG_DETAILS");
            p11.j();
            this.isFragmentCreated = true;
        } else {
            composerFragment.setConfig(detailsBottomSheetConfig);
            composerFragment.startLoading(pageRef);
            stickyContainerVisibilityChangeHandler(bottomSheetState != 5);
        }
        OzonBottomSheetBehavior<FrameLayout> ozonBottomSheetBehavior = this.behavior;
        if (ozonBottomSheetBehavior != null) {
            Boolean skipCollapsed = params.getSkipCollapsed();
            ozonBottomSheetBehavior.setSkipCollapsed(skipCollapsed != null ? skipCollapsed.booleanValue() : false);
        }
        this.startBottomSheetState = Intrinsics.d(params.getState(), "STATE_EXPANDED") ? 3 : 4;
        hideOuterLoader();
        this.bottomSheetTokenizedEvent = bottomSheetTokenizedEvent;
    }

    public final void show() {
        OzonBottomSheetBehavior<FrameLayout> ozonBottomSheetBehavior = this.behavior;
        if (ozonBottomSheetBehavior != null) {
            ozonBottomSheetBehavior.setState(this.startBottomSheetState);
        }
        if (isSearchAddressModalOnMapInit()) {
            ViewGroup viewGroup = this.sheetCoordinatorContainer;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), getTopOffset(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        }
    }

    public final void showOuterLoader() {
        FrameLayout detailsSheetLoadingFl = this.binding.detailsSheetLoadingFl;
        Intrinsics.checkNotNullExpressionValue(detailsSheetLoadingFl, "detailsSheetLoadingFl");
        ViewExtKt.show(detailsSheetLoadingFl);
        FrameLayout addressEditMapDetailsBottomSheetStickyLoadingFl = this.binding.addressEditMapDetailsBottomSheetStickyLoadingFl;
        Intrinsics.checkNotNullExpressionValue(addressEditMapDetailsBottomSheetStickyLoadingFl, "addressEditMapDetailsBottomSheetStickyLoadingFl");
        ViewExtKt.show(addressEditMapDetailsBottomSheetStickyLoadingFl);
    }
}
