package ru.ozon.app.android.returns.details.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.details.presentation.viewModel.ReturnDetailsViewModel;
import ru.ozon.app.android.returns.details.viewMapper.ReturnDetailsMapper;
import ru.ozon.app.android.returns.ui.di.RmsComponentApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u000e\u001a\u00060\nj\u0002`\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/returns/details/di/ReturnDetailsComponent;", "Lhi/a;", "Lru/ozon/app/android/returns/details/viewMapper/ReturnDetailsMapper;", "getMapper", "()Lru/ozon/app/android/returns/details/viewMapper/ReturnDetailsMapper;", "mapper", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;", "getViewModel", "()Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReturnDetailsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/returns/details/di/ReturnDetailsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/returns/details/di/ReturnDetailsComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/returns/details/di/ReturnDetailsComponent;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ReturnDetailsComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new ReturnDetailsComponent(storage) { // from class: ru.ozon.app.android.returns.details.di.ReturnDetailsComponent$Companion$create$1
                private final ActionComponentApi actionComponentApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ReturnDetailsComponent$Companion$create$1$mapper$2.INSTANCE);
                private final NetworkComponentApi networkComponentApi;
                private final RmsComponentApi rmsComponentApi;

                {
                    this.actionComponentApi = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class);
                    this.rmsComponentApi = (RmsComponentApi) storage.getComponent(RmsComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.returns.details.di.ReturnDetailsComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.returns.details.di.ReturnDetailsComponent
                public ReturnDetailsMapper getMapper() {
                    return (ReturnDetailsMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.returns.details.di.ReturnDetailsComponent
                public ReturnDetailsViewModel getViewModel() {
                    return new ReturnDetailsViewModel(this.actionComponentApi.getActionRepository(), this.networkComponentApi.getJsonDeserializer(), this.rmsComponentApi.getReturnChangeInteractor());
                }
            };
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ReturnDetailsMapper getMapper();

    @NotNull
    ReturnDetailsViewModel getViewModel();
}
