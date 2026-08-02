package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation;

import Ck.a;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import aY.C4982b;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.H;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegateKt;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileMoleculeDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileFavoriteButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.Source;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileAdultImageView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileMoleculeView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileAdultImageModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileButtonModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileItem;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileMoleculeVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.mapper.TilesOpenPdpOfflineProductMapper;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.E0;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001e¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u001e¢\u0006\u0004\b.\u0010)J\u0015\u00101\u001a\u00020\u001e2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u001e¢\u0006\u0004\b3\u0010)J\r\u00104\u001a\u00020\u001e¢\u0006\u0004\b4\u0010)J\u001d\u00108\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u0002052\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u001e2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001eH\u0002¢\u0006\u0004\b>\u0010)J\u000f\u0010?\u001a\u00020\u001eH\u0002¢\u0006\u0004\b?\u0010)J\u000f\u0010@\u001a\u00020\u001eH\u0002¢\u0006\u0004\b@\u0010)J\u000f\u0010A\u001a\u00020\u001eH\u0002¢\u0006\u0004\bA\u0010)J\u000f\u0010B\u001a\u00020\u001eH\u0002¢\u0006\u0004\bB\u0010)J\u000f\u0010C\u001a\u00020\u001eH\u0002¢\u0006\u0004\bC\u0010)J\u000f\u0010D\u001a\u00020\u001eH\u0002¢\u0006\u0004\bD\u0010)J\u000f\u0010E\u001a\u00020\u001eH\u0002¢\u0006\u0004\bE\u0010)J\u0019\u0010F\u001a\u00020\u001e2\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bF\u0010=J\u0019\u0010G\u001a\u00020\u001e2\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bG\u0010=J\u0017\u0010J\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u001eH\u0002¢\u0006\u0004\bL\u0010)J\u000f\u0010M\u001a\u00020\u001eH\u0002¢\u0006\u0004\bM\u0010)J\u000f\u0010N\u001a\u00020\u001eH\u0002¢\u0006\u0004\bN\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010OR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010PR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010RR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010SR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010TR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010UR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010VR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010XR*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010cR\u0016\u0010d\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020g0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/SmallTileMoleculeDelegate;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "view", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineWidgetsHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "tilesOpenPdpOfflineProductMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "addToCartButtonBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileFavoriteButtonBinder;", "favoriteButtonBinder", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LSc/j;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "widgetAnalytic", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Landroidx/recyclerview/widget/RecyclerView;LWZ/l;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileFavoriteButtonBinder;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;Lru/ozon/app/android/account/adult/presenter/AdultHandler;LSc/j;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileItem;", "item", "", "useFrameBinder", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileItem;Z)V", "onAttach", "()V", "Landroidx/lifecycle/v;", "lifecycle", "onDetach", "(Landroidx/lifecycle/v;)V", "onRecycle", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onViewInOverlapBounds", "onViewOutOfOverlapBounds", "Landroid/view/View;", "", "width", "updateFixedWidth", "(Landroid/view/View;I)V", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/composer/ui/widget/f;)V", "bindFirst", "bindSecond", "bindThird", "bindImage", "bindFavorites", "bindBadge", "bindStateInfo", "bindButton", "sendWidgetAnalytics", "sendItemAnalytics", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "model", "processClick", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;)V", "processAdultConfirmed", "bindBlurMolecule", "bindThemeSettings", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "LWZ/l;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/mapper/TilesOpenPdpOfflineProductMapper;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileFavoriteButtonBinder;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "LSc/j;", "getWidgetAnalytic", "()LSc/j;", "setWidgetAnalytic", "(LSc/j;)V", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileItem;", "lastWidth", "I", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallTileMoleculeDelegate {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final SmallTileAddToCartButtonBinder addToCartButtonBinder;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final BlurMoleculeDelegate blurMoleculeDelegate;

    @NotNull
    private final SmallTileFavoriteButtonBinder favoriteButtonBinder;

    @NotNull
    private final FrameBinder frameBinder;
    private SmallTileItem item;
    private int lastWidth;
    private final PdpOfflineScreenWidgetsData pdpOfflineWidgetsHandler;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final TilesOpenPdpOfflineProductMapper tilesOpenPdpOfflineProductMapper;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final SmallTileMoleculeView view;
    private InterfaceC4008j<AnalyticData> widgetAnalytic;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileMoleculeDelegate$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SmallTileMoleculeDelegate.this.processAdultConfirmed();
        }
    }

    public SmallTileMoleculeDelegate(@NotNull SmallTileMoleculeView view, @NotNull FrameBinder frameBinder, RecyclerView recyclerView, @NotNull l tokenizedAnalytics, @NotNull PlayerPreloader playerPreloader, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull TilesOpenPdpOfflineProductMapper tilesOpenPdpOfflineProductMapper, @NotNull SmallTileAddToCartButtonBinder addToCartButtonBinder, @NotNull SmallTileFavoriteButtonBinder favoriteButtonBinder, @NotNull BlurMoleculeDelegate blurMoleculeDelegate, @NotNull AdultHandler adultHandler, InterfaceC4008j<AnalyticData> interfaceC4008j, Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(tilesOpenPdpOfflineProductMapper, "tilesOpenPdpOfflineProductMapper");
        Intrinsics.checkNotNullParameter(addToCartButtonBinder, "addToCartButtonBinder");
        Intrinsics.checkNotNullParameter(favoriteButtonBinder, "favoriteButtonBinder");
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.view = view;
        this.frameBinder = frameBinder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.playerPreloader = playerPreloader;
        this.pdpOfflineWidgetsHandler = pdpOfflineScreenWidgetsData;
        this.tilesOpenPdpOfflineProductMapper = tilesOpenPdpOfflineProductMapper;
        this.addToCartButtonBinder = addToCartButtonBinder;
        this.favoriteButtonBinder = favoriteButtonBinder;
        this.blurMoleculeDelegate = blurMoleculeDelegate;
        this.adultHandler = adultHandler;
        this.widgetAnalytic = interfaceC4008j;
        this.actionHandler = function1;
        this.lastWidth = -2;
        this.steps = C7714v.b0(new BindStep() { // from class: aY.a
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$0;
                steps$lambda$0 = SmallTileMoleculeDelegate.steps$lambda$0(SmallTileMoleculeDelegate.this);
                return steps$lambda$0;
            }
        }, new C4982b(this, 0), new BindStep() { // from class: aY.c
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$2;
                steps$lambda$2 = SmallTileMoleculeDelegate.steps$lambda$2(SmallTileMoleculeDelegate.this);
                return steps$lambda$2;
            }
        });
        frameBinder.init(view);
        frameBinder.applyRecycler(recyclerView);
        view.setOnClickListener(new a(this, 7));
        blurMoleculeDelegate.setOnAdultConfirmed(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(SmallTileMoleculeDelegate smallTileMoleculeDelegate, View view) {
        SmallTileMoleculeVO model;
        SmallTileMoleculeView unused = smallTileMoleculeDelegate.view;
        SmallTileItem smallTileItem = smallTileMoleculeDelegate.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null) {
            return;
        }
        smallTileMoleculeDelegate.processClick(model);
    }

    private final void bindBadge() {
        SmallTileMoleculeVO model;
        SmallTileMoleculeView smallTileMoleculeView = this.view;
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null) {
            return;
        }
        smallTileMoleculeView.bindBadge(model.getImageComponent().getBadge());
    }

    private final void bindBlurMolecule() {
        SmallTileMoleculeVO model;
        SmallTileMoleculeVO.ImageComponent imageComponent;
        SmallTileAdultImageModel imageModel;
        SmallTileItem smallTileItem = this.item;
        this.blurMoleculeDelegate.bind(this.view.getBlurMoleculeView().getValue(), (smallTileItem == null || (model = smallTileItem.getModel()) == null || (imageComponent = model.getImageComponent()) == null || (imageModel = imageComponent.getImageModel()) == null) ? null : imageModel.getBlurMolecule(), new SmallTileMoleculeDelegate$bindBlurMolecule$1(this));
    }

    private final void bindButton() {
        SmallTileMoleculeVO model;
        SmallTileMoleculeView smallTileMoleculeView = this.view;
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null) {
            return;
        }
        SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder = this.addToCartButtonBinder;
        AddToCartButtonView button = smallTileMoleculeView.getButton();
        SmallTileButtonModel button2 = model.getButton();
        AddToCartButtonDTO button3 = button2 != null ? button2.getButton() : null;
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        TileThemeConfigVO.AddToCartButtonConfigVO addToCartButtonConfig = model.getTheme().getAddToCartButtonConfig();
        SmallTileButtonModel button4 = model.getButton();
        smallTileAddToCartButtonBinder.bindButton(button, button3, function1, new Source.ComposerWidget(button4 != null ? Long.valueOf(button4.getId()) : null), addToCartButtonConfig);
    }

    private final void bindFavorites() {
        SmallTileMoleculeVO model;
        InterfaceC4008j<AnalyticData> interfaceC4008j;
        SmallTileMoleculeView unused = this.view;
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null || (interfaceC4008j = this.widgetAnalytic) == null) {
            return;
        }
        this.favoriteButtonBinder.bind(model.getImageComponent().getFavoriteProductMolecule(), interfaceC4008j.getValue(), model.isAdult());
    }

    private final void bindFirst() {
        bindBadge();
        bindFavorites();
    }

    private final void bindImage() {
        SmallTileMoleculeVO model;
        BlurMoleculeVO blurMolecule;
        SmallTileMoleculeView smallTileMoleculeView = this.view;
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null) {
            return;
        }
        SmallTileAdultImageModel imageModel = model.getImageComponent().getImageModel();
        boolean isUserAnAdult = this.adultHandler.isUserAnAdult();
        if (!smallTileMoleculeView.getBlurMoleculeView().isInitialized() && (blurMolecule = imageModel.getBlurMolecule()) != null && BlurMoleculeDelegateKt.needShowBlur(blurMolecule, isUserAnAdult)) {
            bindBlurMolecule();
        } else if (smallTileMoleculeView.getBlurMoleculeView().isInitialized()) {
            bindBlurMolecule();
            smallTileMoleculeView.bindImage(imageModel, model.getTheme());
        } else {
            smallTileMoleculeView.bindImage(imageModel, model.getTheme());
        }
        SmallTileAdultImageView adultIv = smallTileMoleculeView.getAdultIv();
        ViewGroup.LayoutParams layoutParams = adultIv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41600G = imageModel.getImage().getRatio().getRatio();
        adultIv.setLayoutParams(bVar);
    }

    private final void bindSecond() {
        bindStateInfo();
    }

    private final void bindStateInfo() {
        SmallTileMoleculeVO model;
        SmallTileMoleculeView smallTileMoleculeView = this.view;
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null) {
            return;
        }
        smallTileMoleculeView.bindStateInfo(model.getStateInfo(), model.getStateHeight());
    }

    private final void bindThemeSettings() {
        SmallTileMoleculeVO model;
        SmallTileMoleculeView unused = this.view;
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null) {
            return;
        }
        this.view.setCornerRadius(model.getTheme().getContainerCornerRadius());
        this.view.bindBackgroundColor(model.getIslandBackgroundColor());
    }

    private final void bindThird() {
        bindButton();
        bindThemeSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processAdultConfirmed() {
        SmallTileMoleculeVO model;
        SmallTileMoleculeVO.ImageComponent imageComponent;
        SmallTileAdultImageModel imageModel;
        SmallTileMoleculeVO model2;
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null || (imageComponent = model.getImageComponent()) == null || (imageModel = imageComponent.getImageModel()) == null || imageModel.getBlurMolecule() == null) {
            return;
        }
        boolean needShowBlur = BlurMoleculeDelegateKt.needShowBlur(imageModel.getBlurMolecule(), this.adultHandler.isUserAnAdult());
        SmallTileMoleculeView smallTileMoleculeView = this.view;
        SmallTileItem smallTileItem2 = this.item;
        smallTileMoleculeView.bindImage(imageModel, (smallTileItem2 == null || (model2 = smallTileItem2.getModel()) == null) ? null : model2.getTheme());
        bindBlurMolecule();
        this.favoriteButtonBinder.updateVisibility(!needShowBlur);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processClick(SmallTileMoleculeVO model) {
        PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;
        AtomAction action = model.getAction();
        if (action == null) {
            return;
        }
        if (model.getImageComponent().getImageModel().getBlurMolecule() == null && (pdpOfflineScreenWidgetsData = this.pdpOfflineWidgetsHandler) != null) {
            pdpOfflineScreenWidgetsData.save(this.tilesOpenPdpOfflineProductMapper.mapToPdp(model));
        }
        this.playerPreloader.tryToPreloadPdpVideo(action);
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    private final void sendItemAnalytics(f viewedPond) {
        SmallTileMoleculeVO model;
        SmallTileMoleculeView unused = this.view;
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null) {
            return;
        }
        if (viewedPond != null) {
            if (viewedPond.b(model.getId(), model.getStateId())) {
                return;
            }
        }
        l lVar = this.tokenizedAnalytics;
        t tokenizedEvent = model.getTokenizedEvent();
        if (tokenizedEvent == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
        if (viewedPond != null) {
            viewedPond.d(Long.valueOf(model.getId()), model.getStateId());
        }
    }

    private final void sendWidgetAnalytics(f viewedPond) {
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null) {
            return;
        }
        if (viewedPond == null || !viewedPond.c(smallTileItem.getModel().getStateId())) {
            l lVar = this.tokenizedAnalytics;
            t tokenizedEvent = smallTileItem.getTokenizedEvent();
            if (tokenizedEvent == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
            if (viewedPond != null) {
                viewedPond.e(smallTileItem.getModel().getStateId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(SmallTileMoleculeDelegate smallTileMoleculeDelegate) {
        smallTileMoleculeDelegate.bindFirst();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(SmallTileMoleculeDelegate smallTileMoleculeDelegate) {
        smallTileMoleculeDelegate.bindSecond();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$2(SmallTileMoleculeDelegate smallTileMoleculeDelegate) {
        smallTileMoleculeDelegate.bindThird();
        return Unit.f71690a;
    }

    public final void bind(@NotNull SmallTileItem item, boolean useFrameBinder) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        if (useFrameBinder) {
            bindImage();
            this.frameBinder.bind(this.steps, item.getModel().getViewItemKey());
        } else {
            bindImage();
            bindFavorites();
            bindBadge();
            bindStateInfo();
            bindButton();
            bindThemeSettings();
        }
        this.addToCartButtonBinder.init(this.tokenizedAnalytics);
    }

    public final void onAttach() {
        FrameBinder.DefaultImpls.onAttach$default(this.frameBinder, null, 1, null);
        this.favoriteButtonBinder.onAttach();
    }

    public final void onDetach(@NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        E0.d(H.a(lifecycle).getCoroutineContext());
        this.addToCartButtonBinder.unsubscribe();
        this.frameBinder.onDetach();
        this.favoriteButtonBinder.onDetach();
    }

    public final void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    public final void onRecycle() {
        this.favoriteButtonBinder.onDetach();
        this.frameBinder.onRecycle();
    }

    public final void onViewInOverlapBounds() {
        SmallTileMoleculeVO model;
        SmallTileMoleculeVO.ImageComponent imageComponent;
        SmallTileAdultImageModel imageModel;
        BlurMoleculeVO blurMolecule;
        this.addToCartButtonBinder.subscribe();
        SmallTileItem smallTileItem = this.item;
        if (smallTileItem == null || (model = smallTileItem.getModel()) == null || (imageComponent = model.getImageComponent()) == null || (imageModel = imageComponent.getImageModel()) == null || (blurMolecule = imageModel.getBlurMolecule()) == null) {
            return;
        }
        this.blurMoleculeDelegate.subscribe(blurMolecule);
    }

    public final void onViewOutOfOverlapBounds() {
        this.addToCartButtonBinder.unsubscribe();
        this.blurMoleculeDelegate.unsubscribe();
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    public final void setWidgetAnalytic(InterfaceC4008j<AnalyticData> interfaceC4008j) {
        this.widgetAnalytic = interfaceC4008j;
    }

    public final void trackView(f viewedPond) {
        sendWidgetAnalytics(viewedPond);
        sendItemAnalytics(viewedPond);
    }

    public final void updateFixedWidth(@NotNull View view, int width) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.lastWidth == width) {
            return;
        }
        this.lastWidth = width;
        view.setLayoutParams(new RecyclerView.p(width, -2));
    }

    public /* synthetic */ SmallTileMoleculeDelegate(SmallTileMoleculeView smallTileMoleculeView, FrameBinder frameBinder, RecyclerView recyclerView, l lVar, PlayerPreloader playerPreloader, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, TilesOpenPdpOfflineProductMapper tilesOpenPdpOfflineProductMapper, SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder, SmallTileFavoriteButtonBinder smallTileFavoriteButtonBinder, BlurMoleculeDelegate blurMoleculeDelegate, AdultHandler adultHandler, InterfaceC4008j interfaceC4008j, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(smallTileMoleculeView, frameBinder, recyclerView, lVar, playerPreloader, pdpOfflineScreenWidgetsData, tilesOpenPdpOfflineProductMapper, smallTileAddToCartButtonBinder, smallTileFavoriteButtonBinder, blurMoleculeDelegate, adultHandler, (i11 & 2048) != 0 ? null : interfaceC4008j, (i11 & 4096) != 0 ? null : function1);
    }
}
