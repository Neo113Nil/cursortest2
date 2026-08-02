package ru.ozon.app.android.cml.delivery.widgets.cellList.di;

import EN.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMoleculeMapper;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.buttons.ButtonsMapper;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.cellList.CellListMapper;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.header.HeaderMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0016\u001a\u00060\u0012j\u0002`\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/di/CmlCellListComponent;", "Lhi/a;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/data/cellList/CellListMapper;", "getCellListMapper", "()Lru/ozon/app/android/cml/delivery/widgets/cellList/data/cellList/CellListMapper;", "cellListMapper", "Lru/ozon/app/android/cml/delivery/widgets/cellList/data/header/HeaderMapper;", "getHeaderMapper", "()Lru/ozon/app/android/cml/delivery/widgets/cellList/data/header/HeaderMapper;", "headerMapper", "Lru/ozon/app/android/cml/delivery/widgets/cellList/data/buttons/ButtonsMapper;", "getButtonsMapper", "()Lru/ozon/app/android/cml/delivery/widgets/cellList/data/buttons/ButtonsMapper;", "buttonsMapper", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeMapper;", "getCellListMoleculeMapper", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMoleculeMapper;", "cellListMoleculeMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CmlCellListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/di/CmlCellListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/di/CmlCellListComponent;", "create", "(Lk20/g;)Lk20/e;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CmlCellListComponent create$lambda$0(C7475g c7475g) {
            final CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            return new CmlCellListComponent(retainComposerComponentApi) { // from class: ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent$Companion$create$1$1
                final /* synthetic */ RetainComposerComponentApi $retainComposerApi;

                /* renamed from: composerController$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j composerController;

                /* renamed from: cellListMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j cellListMapper = k.b(CmlCellListComponent$Companion$create$1$1$cellListMapper$2.INSTANCE);

                /* renamed from: headerMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j headerMapper = k.b(CmlCellListComponent$Companion$create$1$1$headerMapper$2.INSTANCE);

                /* renamed from: buttonsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j buttonsMapper = k.b(CmlCellListComponent$Companion$create$1$1$buttonsMapper$2.INSTANCE);

                /* renamed from: cellListMoleculeMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j cellListMoleculeMapper = k.b(CmlCellListComponent$Companion$create$1$1$cellListMoleculeMapper$2.INSTANCE);

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(CmlCellListComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                {
                    this.$retainComposerApi = retainComposerComponentApi;
                    this.composerController = k.b(new CmlCellListComponent$Companion$create$1$1$composerController$2(retainComposerComponentApi));
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent
                public d getActionHandlersStoreFactory() {
                    return CustomActionHandlersComponentApi.this.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent
                public ButtonsMapper getButtonsMapper() {
                    return (ButtonsMapper) this.buttonsMapper.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent
                public CellListMapper getCellListMapper() {
                    return (CellListMapper) this.cellListMapper.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent
                public CmlCellListMoleculeMapper getCellListMoleculeMapper() {
                    return (CmlCellListMoleculeMapper) this.cellListMoleculeMapper.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent
                public HeaderMapper getHeaderMapper() {
                    return (HeaderMapper) this.headerMapper.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent
                public l getTokenizedAnalytics() {
                    return this.$retainComposerApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<CmlCellListComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CmlCellListComponent.class), new a(storage, 5));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    ButtonsMapper getButtonsMapper();

    @NotNull
    CellListMapper getCellListMapper();

    @NotNull
    CmlCellListMoleculeMapper getCellListMoleculeMapper();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    HeaderMapper getHeaderMapper();

    @NotNull
    l getTokenizedAnalytics();
}
