package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile;

import CX.a;
import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegate;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeDelegateKt;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.TileScrollMappingCompatKt;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockViewModel;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.messenger.util.DataBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileFavoriteButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.Source;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileAdultImageView;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\u001e\u0010\u001d\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b%\u0010!J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010!J\u000f\u0010+\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010!J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010(J\r\u0010.\u001a\u00020\u0018¢\u0006\u0004\b.\u0010!J\u001d\u00102\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020/2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0018¢\u0006\u0004\b4\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010<R\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010=R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010>R,\u0010\u001d\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>R\u0016\u0010?\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileDataBinder;", "Lru/ozon/app/android/universalwidgets/messenger/util/DataBinder;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileView;", "view", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;", "viewModel", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "blurMoleculeDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "addToCartButtonBinder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileFavoriteButtonBinder;", "favoriteButtonBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "processViewEvents", "<init>", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileView;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileFavoriteButtonBinder;LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bindButton", "()V", "bindFavorites", "bindStateInfo", "bindBadge", "bindImage", "model", "processClick", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;)V", "processAdultConfirmed", "bindBlurMolecule", "bindThemeSettings", "data", "bind", "onRecycle", "Landroid/view/View;", "", "width", "updateFixedWidth", "(Landroid/view/View;I)V", "onViewInVisibleBounds", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileView;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeDelegate;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileFavoriteButtonBinder;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "lastWidth", "I", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessengerTileDataBinder extends DataBinder<TileScrollBlockVO.TileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SmallTileAddToCartButtonBinder addToCartButtonBinder;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final BlurMoleculeDelegate blurMoleculeDelegate;

    @NotNull
    private final SmallTileFavoriteButtonBinder favoriteButtonBinder;
    private int lastWidth;
    private final PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final Function1<Map<String, TokenizedTrackingInfo>, Unit> processViewEvents;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final MessengerTileView view;

    @NotNull
    private final TileScrollBlockViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile.MessengerTileDataBinder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function0<Unit> {
        AnonymousClass2(Object obj) {
            super(0, obj, MessengerTileDataBinder.class, "processAdultConfirmed", "processAdultConfirmed()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((MessengerTileDataBinder) this.receiver).processAdultConfirmed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessengerTileDataBinder(@NotNull MessengerTileView view, @NotNull TileScrollBlockViewModel viewModel, @NotNull PlayerPreloader playerPreloader, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull BlurMoleculeDelegate blurMoleculeDelegate, @NotNull AdultHandler adultHandler, @NotNull SmallTileAddToCartButtonBinder addToCartButtonBinder, @NotNull SmallTileFavoriteButtonBinder favoriteButtonBinder, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super Map<String, TokenizedTrackingInfo>, Unit> processViewEvents) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(blurMoleculeDelegate, "blurMoleculeDelegate");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(addToCartButtonBinder, "addToCartButtonBinder");
        Intrinsics.checkNotNullParameter(favoriteButtonBinder, "favoriteButtonBinder");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(processViewEvents, "processViewEvents");
        this.view = view;
        this.viewModel = viewModel;
        this.playerPreloader = playerPreloader;
        this.pdpOfflineScreenWidgetsData = pdpOfflineScreenWidgetsData;
        this.blurMoleculeDelegate = blurMoleculeDelegate;
        this.adultHandler = adultHandler;
        this.addToCartButtonBinder = addToCartButtonBinder;
        this.favoriteButtonBinder = favoriteButtonBinder;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        this.processViewEvents = processViewEvents;
        this.lastWidth = -2;
        view.setOnClickListener(new a(this, 0));
        blurMoleculeDelegate.setOnAdultConfirmed(new AnonymousClass2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(MessengerTileDataBinder messengerTileDataBinder, View view) {
        MessengerTileView unused = messengerTileDataBinder.view;
        TileScrollBlockVO.TileVO access$getData = access$getData(messengerTileDataBinder);
        if (access$getData == null) {
            return;
        }
        messengerTileDataBinder.processClick(access$getData);
    }

    public static final /* synthetic */ TileScrollBlockVO.TileVO access$getData(MessengerTileDataBinder messengerTileDataBinder) {
        return messengerTileDataBinder.getData();
    }

    private final void bindBadge() {
        MessengerTileView messengerTileView = this.view;
        TileScrollBlockVO.TileVO access$getData = access$getData(this);
        if (access$getData == null) {
            return;
        }
        messengerTileView.bindBadge(access$getData.getImageComponent().getBadge());
    }

    private final void bindBlurMolecule() {
        TileScrollBlockVO.TileVO.ImageComponent imageComponent;
        TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel imageModel;
        TileScrollBlockVO.TileVO data = getData();
        this.blurMoleculeDelegate.bind(this.view.getBlurMoleculeView().getValue(), (data == null || (imageComponent = data.getImageComponent()) == null || (imageModel = imageComponent.getImageModel()) == null) ? null : imageModel.getBlurMolecule(), new MessengerTileDataBinder$bindBlurMolecule$1(this));
    }

    private final void bindButton() {
        MessengerTileView messengerTileView = this.view;
        TileScrollBlockVO.TileVO access$getData = access$getData(this);
        if (access$getData == null) {
            return;
        }
        this.addToCartButtonBinder.bindButton(messengerTileView.getButton(), access$getData.getAddToCartButton(), this.actionHandler, Source.MessengerBlock.INSTANCE, access$getData.getTheme().getAddToCartButtonConfig());
    }

    private final void bindFavorites() {
        MessengerTileView unused = this.view;
        TileScrollBlockVO.TileVO access$getData = access$getData(this);
        if (access$getData == null) {
            return;
        }
        this.favoriteButtonBinder.bind(access$getData.getImageComponent().getFavoriteProductMolecule(), new AnalyticData(null, null), access$getData.isAdult());
    }

    private final void bindImage() {
        BlurMoleculeVO blurMolecule;
        MessengerTileView messengerTileView = this.view;
        TileScrollBlockVO.TileVO access$getData = access$getData(this);
        if (access$getData == null) {
            return;
        }
        TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel imageModel = access$getData.getImageComponent().getImageModel();
        boolean isUserAnAdult = this.adultHandler.isUserAnAdult();
        if (!messengerTileView.getBlurMoleculeView().isInitialized() && (blurMolecule = imageModel.getBlurMolecule()) != null && BlurMoleculeDelegateKt.needShowBlur(blurMolecule, isUserAnAdult)) {
            bindBlurMolecule();
        } else if (messengerTileView.getBlurMoleculeView().isInitialized()) {
            bindBlurMolecule();
            messengerTileView.bindImage(imageModel, access$getData.getTheme());
        } else {
            messengerTileView.bindImage(imageModel, access$getData.getTheme());
        }
        SmallTileAdultImageView adultIv = messengerTileView.getAdultIv();
        ViewGroup.LayoutParams layoutParams = adultIv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41600G = imageModel.getImage().getRatio().getRatio();
        adultIv.setLayoutParams(bVar);
    }

    private final void bindStateInfo() {
        MessengerTileView messengerTileView = this.view;
        TileScrollBlockVO.TileVO access$getData = access$getData(this);
        if (access$getData == null) {
            return;
        }
        messengerTileView.bindStateInfo(access$getData.getStateInfo(), access$getData.getStateHeight());
    }

    private final void bindThemeSettings() {
        MessengerTileView unused = this.view;
        TileScrollBlockVO.TileVO access$getData = access$getData(this);
        if (access$getData == null) {
            return;
        }
        this.view.setCornerRadius(access$getData.getTheme().getContainerCornerRadius());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processAdultConfirmed() {
        TileScrollBlockVO.TileVO.ImageComponent imageComponent;
        TileScrollBlockVO.TileVO.ImageComponent.SmallTileAdultImageModel imageModel;
        TileScrollBlockVO.TileVO data = getData();
        if (data == null || (imageComponent = data.getImageComponent()) == null || (imageModel = imageComponent.getImageModel()) == null || imageModel.getBlurMolecule() == null) {
            return;
        }
        boolean needShowBlur = BlurMoleculeDelegateKt.needShowBlur(imageModel.getBlurMolecule(), this.adultHandler.isUserAnAdult());
        MessengerTileView messengerTileView = this.view;
        TileScrollBlockVO.TileVO data2 = getData();
        messengerTileView.bindImage(imageModel, data2 != null ? data2.getTheme() : null);
        bindBlurMolecule();
        this.favoriteButtonBinder.updateVisibility(!needShowBlur);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processClick(TileScrollBlockVO.TileVO model) {
        PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData;
        AtomAction action = model.getAction();
        if (action == null) {
            return;
        }
        if (model.getImageComponent().getImageModel().getBlurMolecule() == null && (pdpOfflineScreenWidgetsData = this.pdpOfflineScreenWidgetsData) != null) {
            pdpOfflineScreenWidgetsData.save(TileScrollMappingCompatKt.mapToPdpOffline(model));
        }
        this.playerPreloader.tryToPreloadPdpVideo(action);
        this.actionHandler.invoke(action);
    }

    public void bind(@NotNull TileScrollBlockVO.TileVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.bind((MessengerTileDataBinder) data);
        bindImage();
        bindFavorites();
        bindBadge();
        bindStateInfo();
        bindButton();
        bindThemeSettings();
        this.addToCartButtonBinder.init(this.tokenizedAnalytics);
        this.addToCartButtonBinder.subscribe();
        this.favoriteButtonBinder.onAttach();
    }

    public final void onRecycle() {
        this.favoriteButtonBinder.onDetach();
        this.addToCartButtonBinder.unsubscribe();
    }

    public final void onViewInVisibleBounds() {
        TileScrollBlockVO.TileVO data = getData();
        if (data == null || this.viewModel.itemWasViewed(data)) {
            return;
        }
        Function1<Map<String, TokenizedTrackingInfo>, Unit> function1 = this.processViewEvents;
        Map<String, TokenizedTrackingInfo> trackingInfo = data.getTrackingInfo();
        if (trackingInfo == null) {
            return;
        }
        function1.invoke(trackingInfo);
        this.viewModel.itemViewed(data);
    }

    public final void updateFixedWidth(@NotNull View view, int width) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.lastWidth == width) {
            return;
        }
        this.lastWidth = width;
        view.setLayoutParams(new RecyclerView.p(width, -2));
    }
}
