package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import WZ.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.c;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.offline.PdpOfflineScreenWidgetsData;
import ru.ozon.app.android.product.molecules.blur.BlurDelegateProvider;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.data.TileScrollBlockDTO;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockViewModel;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B_\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R>\u0010)\u001a&\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040$j\b\u0012\u0004\u0012\u00020\u0004`(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,RH\u00101\u001a0\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040/0-j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`08\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R&\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:RB\u0010>\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030<0-j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104¨\u0006@"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewMapper;", "Lru/ozon/android/messenger/framework/core/viewmapper/a;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockMapper;", "tileScrollBlockMapper", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;", "blurDelegateProvider", "Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;", "pdpOfflineScreenWidgetsData", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LPc/a;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "smallTileAddToCartButtonBinderProvier", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockMapper;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/product/molecules/blur/BlurDelegateProvider;Lru/ozon/app/android/offline/PdpOfflineScreenWidgetsData;Lru/ozon/app/android/account/adult/presenter/AdultHandler;LWZ/l;LPc/a;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;)V", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel$MyViewModelFactory;", "viewModelFactory", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewModel$MyViewModelFactory;", "Lru/ozon/android/messenger/framework/core/viewmapper/a$a$a;", "blockContainerSettings", "Lru/ozon/android/messenger/framework/core/viewmapper/a$a$a;", "getBlockContainerSettings", "()Lru/ozon/android/messenger/framework/core/viewmapper/a$a$a;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lru/ozon/android/messenger/framework/core/viewmapper/Inflate;", "inflate", "Lfd/n;", "getInflate", "()Lfd/n;", "Lkotlin/Function2;", "Lru/ozon/android/messenger/framework/core/d;", "Lru/ozon/android/messenger/framework/presentation/common/view/recycler/q;", "Lru/ozon/android/messenger/framework/core/viewmapper/ViewProducer;", "viewProducer", "Lkotlin/jvm/functions/Function2;", "getViewProducer", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "", "parser", "Lkotlin/jvm/functions/Function1;", "getParser", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/android/messenger/framework/presentation/models/c;", "", "Lru/ozon/android/messenger/framework/core/viewmapper/BlockMapper;", "mapper", "getMapper", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileScrollBlockViewMapper extends a<TileScrollBlockDTO, TileScrollBlockVO, TileScrollBlockViewBinding> {

    @NotNull
    private final a.AbstractC1563a.C1564a blockContainerSettings;

    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, TileScrollBlockViewBinding> inflate;

    @NotNull
    private final Function2<TileScrollBlockDTO, c, List<TileScrollBlockVO>> mapper;

    @NotNull
    private final Function1<String, TileScrollBlockDTO> parser;

    @NotNull
    private final TileScrollBlockViewModel.MyViewModelFactory viewModelFactory;

    @NotNull
    private final Function2<TileScrollBlockViewBinding, d, q<TileScrollBlockVO, TileScrollBlockViewBinding>> viewProducer;

    public TileScrollBlockViewMapper(@NotNull JsonParser deserializer, @NotNull TileScrollBlockMapper tileScrollBlockMapper, @NotNull PlayerPreloader playerPreloader, @NotNull BlurDelegateProvider blurDelegateProvider, PdpOfflineScreenWidgetsData pdpOfflineScreenWidgetsData, @NotNull AdultHandler adultHandler, @NotNull l tokenizedAnalytics, @NotNull Pc.a<SmallTileAddToCartButtonBinder> smallTileAddToCartButtonBinderProvier, @NotNull ProductFavoriteDelegateProvider productFavoriteDelegateProvider) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(tileScrollBlockMapper, "tileScrollBlockMapper");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(blurDelegateProvider, "blurDelegateProvider");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(smallTileAddToCartButtonBinderProvier, "smallTileAddToCartButtonBinderProvier");
        Intrinsics.checkNotNullParameter(productFavoriteDelegateProvider, "productFavoriteDelegateProvider");
        this.viewModelFactory = new TileScrollBlockViewModel.MyViewModelFactory();
        this.blockContainerSettings = a.AbstractC1563a.C1564a.f87356a;
        this.inflate = new TileScrollBlockViewMapper$inflate$1(TileScrollBlockViewBinding.INSTANCE);
        this.viewProducer = new TileScrollBlockViewMapper$viewProducer$1(this, playerPreloader, blurDelegateProvider, pdpOfflineScreenWidgetsData, adultHandler, productFavoriteDelegateProvider, smallTileAddToCartButtonBinderProvier, tokenizedAnalytics);
        this.parser = new TileScrollBlockViewMapper$parser$1(deserializer);
        this.mapper = tileScrollBlockMapper;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, TileScrollBlockViewBinding> getInflate() {
        return this.inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public Function2<TileScrollBlockDTO, c, List<TileScrollBlockVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public Function1<String, TileScrollBlockDTO> getParser() {
        return this.parser;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public Function2<TileScrollBlockViewBinding, d, q<TileScrollBlockVO, TileScrollBlockViewBinding>> getViewProducer() {
        return this.viewProducer;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public a.AbstractC1563a.C1564a getBlockContainerSettings() {
        return this.blockContainerSettings;
    }
}
