package ru.ozon.app.android.search.widgets.expandableCells.di;

import JS.a;
import hi.InterfaceC6958a;
import j10.InterfaceC7238a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.product.tiles.tilegrid2.data.mapper.TileGrid2Mapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellsMapper;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.GetWarlockSectionViewModel;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "getComposerStore", "()Lj10/a;", "composerStore", "LI00/a;", "getComposerUpdateMapper", "()LI00/a;", "composerUpdateMapper", "Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "getTileGridmapper", "()Lru/ozon/app/android/product/tiles/tilegrid2/data/mapper/TileGrid2Mapper;", "tileGridmapper", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;", "getViewModel", "()Lru/ozon/app/android/search/widgets/expandableCells/presentation/GetWarlockSectionViewModel;", "viewModel", "Lru/ozon/app/android/search/widgets/expandableCells/core/ExpandableCellsMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/expandableCells/core/ExpandableCellsMapper;", "mapper", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExpandableCellsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsComponent;", "create", "(Lk20/g;)Lk20/e;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExpandableCellsComponent create$lambda$0(C7475g c7475g) {
            return new ExpandableCellsComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<ExpandableCellsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ExpandableCellsComponent.class), new a(storage, 14));
        }
    }

    @NotNull
    ActionV2Repository getActionV2Repository();

    @NotNull
    InterfaceC7238a<l> getComposerStore();

    @NotNull
    I00.a<l> getComposerUpdateMapper();

    @NotNull
    ExpandableCellsMapper getMapper();

    @NotNull
    TileGrid2Mapper getTileGridmapper();

    @NotNull
    GetWarlockSectionViewModel getViewModel();
}
