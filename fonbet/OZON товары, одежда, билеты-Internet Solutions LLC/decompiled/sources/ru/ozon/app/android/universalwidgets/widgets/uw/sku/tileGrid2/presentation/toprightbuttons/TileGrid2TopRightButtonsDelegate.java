package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import Xc.a;
import Xc.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteDelegateProvider;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.TopRightButtonAdapter;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.animator.TopRightButtonsAnimator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.adapter.decoration.OffsetsItemDecoration;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import xe.B0;
import xe.C10720e0;
import xe.E0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001[B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020 2\u0012\u0010\u001f\u001a\u000e\u0012\u0002\b\u00030\u001dj\u0006\u0012\u0002\b\u0003`\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010)J\u0015\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0012¢\u0006\u0004\b1\u00102JI\u00104\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0002\b\u00030\u001dj\u0006\u0012\u0002\b\u0003`\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0003¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0012¢\u0006\u0004\b6\u00102J\u0017\u00109\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R(\u0010?\u001a\u0004\u0018\u00010\n2\b\u0010>\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010XR\u0016\u00103\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010;R\u0016\u0010Y\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/SelectionProductsOverlayVisibilityAware;", "", "isSingleTopRightButton", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;", "productFavDelegateProvider", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lkotlin/Function0;", "Landroidx/recyclerview/widget/RecyclerView;", "createTopRightButtonsRv", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "createTopRightButtonView", "<init>", "(ZLru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "adapter", "", "attachTopRightButtons", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;)V", "prepareUi", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "topRightButtons", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate$State;", "state", "submitTopRightButtons", "(Ljava/util/List;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate$State;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "buildAnalyticData", "(Lru/ozon/composer/ui/widget/k;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "", "sku", "subscribeFavoriteChanged", "(J)V", "isOverlayVisible", "onWishlistOverlayVisibilityChanged", "(Z)V", "onSelectionProductsOverlayVisibilityChanged", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "init", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "onAttach", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;J)V", "onDetach", "()V", "animationEnabled", "bind", "(Ljava/util/List;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate$State;Z)V", "gone", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Z", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteDelegateProvider;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "topRightButtonsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getTopRightButtonsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "topRightButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/animator/TopRightButtonsAnimator;", "itemAnimator$delegate", "LSc/j;", "getItemAnimator", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/animator/TopRightButtonsAnimator;", "itemAnimator", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/decoration/OffsetsItemDecoration;", "topRightsOffsetsItemDecoration$delegate", "getTopRightsOffsetsItemDecoration", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/decoration/OffsetsItemDecoration;", "topRightsOffsetsItemDecoration", "Lxe/M;", "favoriteChangeScope", "Lxe/M;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "productFavDelegate", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "topRightButtonsAdapter", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/adapter/TopRightButtonAdapter;", "Ljava/util/List;", "currentState", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate$State;", "State", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2TopRightButtonsDelegate implements SelectionProductsOverlayVisibilityAware {
    private boolean animationEnabled;

    @NotNull
    private State currentState;

    @NotNull
    private final M favoriteChangeScope;

    @NotNull
    private final FavoriteManager favoriteManager;
    private final boolean isSingleTopRightButton;

    /* renamed from: itemAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j itemAnimator;
    private FavoriteProductDelegate productFavDelegate;

    @NotNull
    private final FavoriteDelegateProvider productFavDelegateProvider;
    private ProductFavoriteMoleculeButtonView topRightButtonView;
    private List<? extends Object> topRightButtons;
    private TopRightButtonAdapter topRightButtonsAdapter;
    private RecyclerView topRightButtonsRv;

    /* renamed from: topRightsOffsetsItemDecoration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topRightsOffsetsItemDecoration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/TileGrid2TopRightButtonsDelegate$State;", "", "<init>", "(Ljava/lang/String;I)V", "REMOVED_FROM_WISHLIST", "REMOVED_FROM_SELECTION", "COLLAPSED", "EXPANDED", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State REMOVED_FROM_WISHLIST = new State("REMOVED_FROM_WISHLIST", 0);
        public static final State REMOVED_FROM_SELECTION = new State("REMOVED_FROM_SELECTION", 1);
        public static final State COLLAPSED = new State("COLLAPSED", 2);
        public static final State EXPANDED = new State("EXPANDED", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{REMOVED_FROM_WISHLIST, REMOVED_FROM_SELECTION, COLLAPSED, EXPANDED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.REMOVED_FROM_WISHLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.REMOVED_FROM_SELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.COLLAPSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.EXPANDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TileGrid2TopRightButtonsDelegate(boolean z11, @NotNull FavoriteDelegateProvider productFavDelegateProvider, @NotNull FavoriteManager favoriteManager, @NotNull Function0<? extends RecyclerView> createTopRightButtonsRv, @NotNull Function0<ProductFavoriteMoleculeButtonView> createTopRightButtonView) {
        Intrinsics.checkNotNullParameter(productFavDelegateProvider, "productFavDelegateProvider");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(createTopRightButtonsRv, "createTopRightButtonsRv");
        Intrinsics.checkNotNullParameter(createTopRightButtonView, "createTopRightButtonView");
        this.isSingleTopRightButton = z11;
        this.productFavDelegateProvider = productFavDelegateProvider;
        this.favoriteManager = favoriteManager;
        this.itemAnimator = LazyUtilsKt.unsafeLazy(TileGrid2TopRightButtonsDelegate$itemAnimator$2.INSTANCE);
        this.topRightsOffsetsItemDecoration = LazyUtilsKt.unsafeLazy(TileGrid2TopRightButtonsDelegate$topRightsOffsetsItemDecoration$2.INSTANCE);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.favoriteChangeScope = N.a(CoroutineContext.Element.a.d(He.b.f10879b, (H0) b11).plus(new TileGrid2TopRightButtonsDelegate$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        this.currentState = State.EXPANDED;
        prepareUi(createTopRightButtonsRv, createTopRightButtonView);
    }

    private final void attachTopRightButtons(TopRightButtonAdapter adapter) {
        Unit unit;
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = this.topRightButtonView;
        if (productFavoriteMoleculeButtonView != null) {
            FavoriteProductDelegate favoriteProductDelegate = this.productFavDelegate;
            if (favoriteProductDelegate != null) {
                favoriteProductDelegate.attachFavButtonView(productFavoriteMoleculeButtonView);
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        this.topRightButtonsAdapter = adapter;
        if (adapter != null) {
            adapter.setOnFavoriteClick(new TileGrid2TopRightButtonsDelegate$attachTopRightButtons$2$1(this));
        }
        RecyclerView recyclerView = this.topRightButtonsRv;
        if (recyclerView != null) {
            TopRightButtonAdapter topRightButtonAdapter = this.topRightButtonsAdapter;
            recyclerView.setAdapter(topRightButtonAdapter != null ? topRightButtonAdapter.getAdapter() : null);
        }
    }

    private final AnalyticData buildAnalyticData(k<?> widgetViewHolder) {
        return new AnalyticData(widgetViewHolder.getTrackingData(), widgetViewHolder.getViewItem());
    }

    private final TopRightButtonsAnimator getItemAnimator() {
        return (TopRightButtonsAnimator) this.itemAnimator.getValue();
    }

    private final OffsetsItemDecoration getTopRightsOffsetsItemDecoration() {
        return (OffsetsItemDecoration) this.topRightsOffsetsItemDecoration.getValue();
    }

    private final void prepareUi(Function0<? extends RecyclerView> createTopRightButtonsRv, Function0<ProductFavoriteMoleculeButtonView> createTopRightButtonView) {
        if (this.isSingleTopRightButton) {
            this.topRightButtonView = createTopRightButtonView.invoke();
            return;
        }
        RecyclerView invoke = createTopRightButtonsRv.invoke();
        invoke.addItemDecoration(getTopRightsOffsetsItemDecoration());
        this.topRightButtonsRv = invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void submitTopRightButtons(List<? extends Object> topRightButtons, State state) {
        ArrayList arrayList;
        RecyclerView recyclerView;
        TopRightButtonAdapter topRightButtonAdapter;
        RecyclerView recyclerView2;
        this.topRightButtons = topRightButtons;
        this.currentState = state;
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            arrayList = new ArrayList();
            for (Object obj : topRightButtons) {
                if (!(obj instanceof FavoriteToggleProductButtonMolecule)) {
                    arrayList.add(obj);
                }
            }
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    topRightButtons = C7714v.E(topRightButtons);
                } else if (i11 != 4) {
                    throw new o();
                }
                recyclerView = this.topRightButtonsRv;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator((this.animationEnabled && (state == State.COLLAPSED || state == State.EXPANDED)) ? getItemAnimator() : null);
                }
                topRightButtonAdapter = this.topRightButtonsAdapter;
                if (topRightButtonAdapter != null) {
                    topRightButtonAdapter.submitList(topRightButtons);
                }
                recyclerView2 = this.topRightButtonsRv;
                if (recyclerView2 == null) {
                    ViewExtKt.show(recyclerView2);
                    return;
                }
                return;
            }
            arrayList = new ArrayList();
            for (Object obj2 : topRightButtons) {
                if (!(obj2 instanceof IconButtonV3DTO)) {
                    arrayList.add(obj2);
                }
            }
        }
        topRightButtons = arrayList;
        recyclerView = this.topRightButtonsRv;
        if (recyclerView != null) {
        }
        topRightButtonAdapter = this.topRightButtonsAdapter;
        if (topRightButtonAdapter != null) {
        }
        recyclerView2 = this.topRightButtonsRv;
        if (recyclerView2 == null) {
        }
    }

    private final void subscribeFavoriteChanged(final long sku) {
        final InterfaceC2395h<FavoriteEvent> onFavoriteChangeFlow = this.favoriteManager.onFavoriteChangeFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<FavoriteEvent>() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ long $sku$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ TileGrid2TopRightButtonsDelegate this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$$inlined$filter$1$2", f = "TileGrid2TopRightButtonsDelegate.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, TileGrid2TopRightButtonsDelegate tileGrid2TopRightButtonsDelegate, long j11) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = tileGrid2TopRightButtonsDelegate;
                    this.$sku$inlined = j11;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    boolean z11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                FavoriteEvent favoriteEvent = (FavoriteEvent) obj;
                                z11 = this.this$0.animationEnabled;
                                if (z11 && favoriteEvent.getSku() == this.$sku$inlined) {
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super FavoriteEvent> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this, sku), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2(this, null)), this.favoriteChangeScope);
    }

    public final void bind(@NotNull List<? extends Object> topRightButtons, TopRightButtonAdapter adapter, @NotNull k<?> widgetViewHolder, @NotNull State state, boolean animationEnabled) {
        Intrinsics.checkNotNullParameter(topRightButtons, "topRightButtons");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(state, "state");
        this.animationEnabled = animationEnabled;
        this.topRightButtonsAdapter = adapter;
        if (!this.isSingleTopRightButton) {
            submitTopRightButtons(topRightButtons, state);
            return;
        }
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = this.topRightButtonView;
        if (productFavoriteMoleculeButtonView != null) {
            Object M11 = C7714v.M(topRightButtons);
            FavoriteProductMolecule favoriteProductMolecule = M11 instanceof FavoriteProductMolecule ? (FavoriteProductMolecule) M11 : null;
            if (favoriteProductMolecule != null) {
                FavoriteProductDelegate favoriteProductDelegate = this.productFavDelegate;
                if (favoriteProductDelegate != null) {
                    favoriteProductDelegate.bindFavoriteProductButton(productFavoriteMoleculeButtonView, favoriteProductMolecule, buildAnalyticData(widgetViewHolder));
                }
                SmallIconButtonView favIcon = productFavoriteMoleculeButtonView.getFavIcon();
                TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
                favIcon.setPadding(tileGrid2Constants.getTopRightBtnsFavoriteHorizontalPadding(), tileGrid2Constants.getTopRightBtnsFavoriteVerticalPadding(), tileGrid2Constants.getTopRightBtnsFavoriteHorizontalPadding(), tileGrid2Constants.getTopRightBtnsFavoriteVerticalPadding());
                ViewExtKt.show(productFavoriteMoleculeButtonView);
            }
        }
    }

    public final RecyclerView getTopRightButtonsRv() {
        return this.topRightButtonsRv;
    }

    public final void gone() {
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = this.topRightButtonView;
        if (productFavoriteMoleculeButtonView != null) {
            ViewExtKt.gone(productFavoriteMoleculeButtonView);
            return;
        }
        RecyclerView recyclerView = this.topRightButtonsRv;
        if (recyclerView != null) {
            ViewExtKt.gone(recyclerView);
        }
    }

    public final void init(@NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(references, "references");
        if (this.isSingleTopRightButton) {
            this.productFavDelegate = this.productFavDelegateProvider.get(references);
        }
    }

    public final void onAttach(TopRightButtonAdapter adapter, long sku) {
        attachTopRightButtons(adapter);
        subscribeFavoriteChanged(sku);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetach() {
        Unit unit;
        if (this.topRightButtonView != null) {
            FavoriteProductDelegate favoriteProductDelegate = this.productFavDelegate;
            if (favoriteProductDelegate != null) {
                favoriteProductDelegate.detachFavButtonView();
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
        }
        RecyclerView recyclerView = this.topRightButtonsRv;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        E0.d(this.favoriteChangeScope.getCoroutineContext());
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.SelectionProductsOverlayVisibilityAware
    public void onSelectionProductsOverlayVisibilityChanged(boolean isOverlayVisible) {
        List<? extends Object> list = this.topRightButtons;
        if (list == null) {
            return;
        }
        submitTopRightButtons(list, isOverlayVisible ? State.REMOVED_FROM_SELECTION : State.EXPANDED);
        if (isOverlayVisible) {
            RecyclerView recyclerView = this.topRightButtonsRv;
            if (recyclerView != null) {
                ViewExtKt.gone(recyclerView);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.topRightButtonsRv;
        if (recyclerView2 != null) {
            ViewExtKt.show(recyclerView2);
        }
    }

    public void onWishlistOverlayVisibilityChanged(boolean isOverlayVisible) {
        List<? extends Object> list = this.topRightButtons;
        if (list == null) {
            return;
        }
        submitTopRightButtons(list, isOverlayVisible ? State.REMOVED_FROM_WISHLIST : State.EXPANDED);
        if (isOverlayVisible) {
            ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView = this.topRightButtonView;
            if (productFavoriteMoleculeButtonView != null) {
                ViewExtKt.gone(productFavoriteMoleculeButtonView);
                return;
            }
            return;
        }
        ProductFavoriteMoleculeButtonView productFavoriteMoleculeButtonView2 = this.topRightButtonView;
        if (productFavoriteMoleculeButtonView2 != null) {
            ViewExtKt.show(productFavoriteMoleculeButtonView2);
        }
    }

    public final void setRecycledViewPool(RecyclerView.u recycledViewPool) {
        RecyclerView recyclerView = this.topRightButtonsRv;
        if (recyclerView != null) {
            recyclerView.setRecycledViewPool(recycledViewPool);
        }
    }
}
