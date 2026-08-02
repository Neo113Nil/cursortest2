package ru.ozon.app.android.returns.returnableItemsList.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper.PaginationMobileMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewMapper.ReturnableItemsListMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewMapper.ReturnableItemsTitleMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewMapper.TotalMobileMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/di/ReturnableItemsListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewMapper/ReturnableItemsListMapper;", "getReturnableItemsMapper", "()Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewMapper/ReturnableItemsListMapper;", "returnableItemsMapper", "Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileMapper;", "getPaginationMobileMapper", "()Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileMapper;", "paginationMobileMapper", "Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewMapper/TotalMobileMapper;", "getTotalMobileMapper", "()Lru/ozon/app/android/returns/returnableItemsList/presentation/totalMobile/viewMapper/TotalMobileMapper;", "totalMobileMapper", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewMapper/ReturnableItemsTitleMapper;", "getReturnableItemsTitleMapper", "()Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewMapper/ReturnableItemsTitleMapper;", "returnableItemsTitleMapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "Companion", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReturnableItemsListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/di/ReturnableItemsListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/returns/returnableItemsList/di/ReturnableItemsListComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/returns/returnableItemsList/di/ReturnableItemsListComponent;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ReturnableItemsListComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new ReturnableItemsListComponent(storage) { // from class: ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent$Companion$create$1
                private final ActionV2Repository actionV2Repository;

                /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j postRefreshHandlerFactory;

                /* renamed from: returnableItemsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j returnableItemsMapper = k.b(ReturnableItemsListComponent$Companion$create$1$returnableItemsMapper$2.INSTANCE);

                /* renamed from: paginationMobileMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j paginationMobileMapper = k.b(ReturnableItemsListComponent$Companion$create$1$paginationMobileMapper$2.INSTANCE);

                /* renamed from: totalMobileMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j totalMobileMapper = k.b(ReturnableItemsListComponent$Companion$create$1$totalMobileMapper$2.INSTANCE);

                /* renamed from: returnableItemsTitleMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j returnableItemsTitleMapper = k.b(ReturnableItemsListComponent$Companion$create$1$returnableItemsTitleMapper$2.INSTANCE);

                {
                    this.postRefreshHandlerFactory = k.b(new ReturnableItemsListComponent$Companion$create$1$postRefreshHandlerFactory$2(storage));
                    this.actionV2Repository = ((ActionComponentApi) storage.getComponent(ActionComponentApi.class)).getActionRepository();
                }

                @Override // ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent
                public PaginationMobileMapper getPaginationMobileMapper() {
                    return (PaginationMobileMapper) this.paginationMobileMapper.getValue();
                }

                @Override // ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent
                public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
                    return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
                }

                @Override // ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent
                public ReturnableItemsListMapper getReturnableItemsMapper() {
                    return (ReturnableItemsListMapper) this.returnableItemsMapper.getValue();
                }

                @Override // ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent
                public ReturnableItemsTitleMapper getReturnableItemsTitleMapper() {
                    return (ReturnableItemsTitleMapper) this.returnableItemsTitleMapper.getValue();
                }

                @Override // ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent
                public TotalMobileMapper getTotalMobileMapper() {
                    return (TotalMobileMapper) this.totalMobileMapper.getValue();
                }
            };
        }
    }

    @NotNull
    PaginationMobileMapper getPaginationMobileMapper();

    @NotNull
    PostRefreshHandlerFactory getPostRefreshHandlerFactory();

    @NotNull
    ReturnableItemsListMapper getReturnableItemsMapper();

    @NotNull
    ReturnableItemsTitleMapper getReturnableItemsTitleMapper();

    @NotNull
    TotalMobileMapper getTotalMobileMapper();
}
