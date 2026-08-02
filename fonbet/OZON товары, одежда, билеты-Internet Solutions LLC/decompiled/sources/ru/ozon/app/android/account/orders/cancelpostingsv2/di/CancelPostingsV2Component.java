package ru.ozon.app.android.account.orders.cancelpostingsv2.di;

import BZ.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancelpostingsv2.core.mappers.CancelPostingsV2ButtonMapper;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/di/CancelPostingsV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/core/mappers/CancelPostingsV2ButtonMapper;", "getButtonMapper", "()Lru/ozon/app/android/account/orders/cancelpostingsv2/core/mappers/CancelPostingsV2ButtonMapper;", "buttonMapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "getTeensModeStorage", "()Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "miniAppConfigHolder", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CancelPostingsV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/di/CancelPostingsV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/account/orders/cancelpostingsv2/di/CancelPostingsV2Component;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/cancelpostingsv2/di/CancelPostingsV2Component;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final CancelPostingsV2Component create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new CancelPostingsV2Component() { // from class: ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component$Companion$create$1

                /* renamed from: buttonMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j buttonMapper = k.b(CancelPostingsV2Component$Companion$create$1$buttonMapper$2.INSTANCE);
                private final ComposerComponentApi composerComponentApi;
                private final l tokenizedAnalytics;

                {
                    this.composerComponentApi = (ComposerComponentApi) C7475g.this.getComponent(ComposerComponentApi.class);
                    this.tokenizedAnalytics = ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component
                public CancelPostingsV2ButtonMapper getButtonMapper() {
                    return (CancelPostingsV2ButtonMapper) this.buttonMapper.getValue();
                }

                @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component
                public d getCustomActionHandlersStoreFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component
                public e getMiniAppConfigHolder() {
                    return ((NavigationComponentApi) C7475g.this.getComponent(NavigationComponentApi.class)).getMiniAppConfigHolder();
                }

                @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component
                public TeensModeStorage getTeensModeStorage() {
                    return ((StorageComponentApi) C7475g.this.getComponent(StorageComponentApi.class)).getTeensModeStorage();
                }

                @Override // ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component
                public l getTokenizedAnalytics() {
                    return this.tokenizedAnalytics;
                }
            };
        }
    }

    @NotNull
    CancelPostingsV2ButtonMapper getButtonMapper();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    e getMiniAppConfigHolder();

    @NotNull
    TeensModeStorage getTeensModeStorage();

    @NotNull
    l getTokenizedAnalytics();
}
