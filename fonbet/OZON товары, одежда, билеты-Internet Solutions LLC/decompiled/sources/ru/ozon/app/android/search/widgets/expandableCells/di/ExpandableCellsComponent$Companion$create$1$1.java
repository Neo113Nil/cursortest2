package ru.ozon.app.android.search.widgets.expandableCells.di;

import I00.a;
import Sc.InterfaceC4008j;
import Sc.k;
import j10.InterfaceC7238a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2Mapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellsMapper;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.GetWarlockSectionViewModel;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.GetWarlockSectionViewModelImpl;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000]\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"ru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsComponent$Companion$create$1$1", "Lru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "getActionComponentApi", "()Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "storefrontCommonComponentApi", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "tileGridmapper$delegate", "LSc/j;", "getTileGridmapper", "()Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "tileGridmapper", "Lru/ozon/app/android/search/widgets/expandableCells/core/ExpandableCellsMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/search/widgets/expandableCells/core/ExpandableCellsMapper;", "mapper", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "getComposerStore", "()Lj10/a;", "composerStore", "LI00/a;", "getComposerUpdateMapper", "()LI00/a;", "composerUpdateMapper", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;", "getViewModel", "()Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;", "viewModel", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExpandableCellsComponent$Companion$create$1$1 implements ExpandableCellsComponent {
    private final ActionComponentApi actionComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ExpandableCellsComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final StorefrontCommonComponentApi storefrontCommonComponentApi;

    /* renamed from: tileGridmapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tileGridmapper;

    ExpandableCellsComponent$Companion$create$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.storefrontCommonComponentApi = (StorefrontCommonComponentApi) c7475g.getComponent(StorefrontCommonComponentApi.class);
        this.tileGridmapper = k.b(new ExpandableCellsComponent$Companion$create$1$1$tileGridmapper$2(c7475g, this));
    }

    @Override // ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent
    public ActionV2Repository getActionV2Repository() {
        return this.actionComponentApi.getActionRepository();
    }

    @Override // ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent
    public InterfaceC7238a<l> getComposerStore() {
        return this.retainComposerComponentApi.getComposerStore();
    }

    @Override // ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent
    public a<l> getComposerUpdateMapper() {
        return this.retainComposerComponentApi.getComposerUpdateMapper();
    }

    @Override // ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent
    public ExpandableCellsMapper getMapper() {
        return (ExpandableCellsMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent
    public TileGrid2Mapper getTileGridmapper() {
        return (TileGrid2Mapper) this.tileGridmapper.getValue();
    }

    @Override // ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent
    public GetWarlockSectionViewModel getViewModel() {
        return new GetWarlockSectionViewModelImpl(getActionV2Repository());
    }
}
