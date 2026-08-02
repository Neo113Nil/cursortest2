package ru.ozon.app.android.orderdetails.cancelReasons.di;

import BZ.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.common.SelectCancelReasonCommentProvider;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons.SelectCancelReasonsMapper;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.sticky.SelectCancelReasonStickyMapper;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0001 R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelReasons/di/SelectCancelReasonComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/orderdetails/cancelReasons/presentation/reasons/SelectCancelReasonsMapper;", "getMapper", "()Lru/ozon/app/android/orderdetails/cancelReasons/presentation/reasons/SelectCancelReasonsMapper;", "mapper", "Lru/ozon/app/android/orderdetails/cancelReasons/presentation/sticky/SelectCancelReasonStickyMapper;", "getStickyMapper", "()Lru/ozon/app/android/orderdetails/cancelReasons/presentation/sticky/SelectCancelReasonStickyMapper;", "stickyMapper", "Lru/ozon/app/android/orderdetails/cancelReasons/presentation/common/SelectCancelReasonCommentProvider;", "getCommentProvider", "()Lru/ozon/app/android/orderdetails/cancelReasons/presentation/common/SelectCancelReasonCommentProvider;", "commentProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "getTeensModeStorage", "()Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "miniAppConfigHolder", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SelectCancelReasonComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelReasons/di/SelectCancelReasonComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/orderdetails/cancelReasons/di/SelectCancelReasonComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/orderdetails/cancelReasons/di/SelectCancelReasonComponent;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SelectCancelReasonComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new SelectCancelReasonComponent() { // from class: ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent$Companion$create$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(SelectCancelReasonComponent$Companion$create$1$mapper$2.INSTANCE);

                /* renamed from: stickyMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j stickyMapper = k.b(SelectCancelReasonComponent$Companion$create$1$stickyMapper$2.INSTANCE);

                /* renamed from: commentProvider$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j commentProvider = k.b(SelectCancelReasonComponent$Companion$create$1$commentProvider$2.INSTANCE);

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(SelectCancelReasonComponent$Companion$create$1$handlersInhibitor$2.INSTANCE);

                @Override // ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent
                public SelectCancelReasonCommentProvider getCommentProvider() {
                    return (SelectCancelReasonCommentProvider) this.commentProvider.getValue();
                }

                @Override // ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent
                public d getCustomActionHandlersStoreFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent
                public SelectCancelReasonsMapper getMapper() {
                    return (SelectCancelReasonsMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent
                public e getMiniAppConfigHolder() {
                    return ((NavigationComponentApi) C7475g.this.getComponent(NavigationComponentApi.class)).getMiniAppConfigHolder();
                }

                @Override // ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent
                public SelectCancelReasonStickyMapper getStickyMapper() {
                    return (SelectCancelReasonStickyMapper) this.stickyMapper.getValue();
                }

                @Override // ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent
                public TeensModeStorage getTeensModeStorage() {
                    return ((StorageComponentApi) C7475g.this.getComponent(StorageComponentApi.class)).getTeensModeStorage();
                }
            };
        }
    }

    @NotNull
    SelectCancelReasonCommentProvider getCommentProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    SelectCancelReasonsMapper getMapper();

    @NotNull
    e getMiniAppConfigHolder();

    @NotNull
    SelectCancelReasonStickyMapper getStickyMapper();

    @NotNull
    TeensModeStorage getTeensModeStorage();
}
