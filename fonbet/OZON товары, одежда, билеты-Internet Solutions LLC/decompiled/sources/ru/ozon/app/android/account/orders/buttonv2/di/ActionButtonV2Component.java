package ru.ozon.app.android.account.orders.buttonv2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.buttonv2.ActionButtonV2Mapper;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.cscore.buttonv2.viewmodel.ActionButtonViewModel;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/di/ActionButtonV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/account/orders/buttonv2/ActionButtonV2Mapper;", "getMapper", "()Lru/ozon/app/android/account/orders/buttonv2/ActionButtonV2Mapper;", "mapper", "Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "getViewModel", "()Lru/ozon/app/android/cscore/buttonv2/viewmodel/ActionButtonViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ActionButtonV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/di/ActionButtonV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/account/orders/buttonv2/di/ActionButtonV2Component;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/buttonv2/di/ActionButtonV2Component;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ActionButtonV2Component create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new ActionButtonV2Component(storage) { // from class: ru.ozon.app.android.account.orders.buttonv2.di.ActionButtonV2Component$Companion$create$1
                private final ComposerComponentApi composerComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ActionButtonV2Component$Companion$create$1$mapper$2.INSTANCE);
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComposerComponentApi;

                {
                    this.networkComponentApi = (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class);
                    this.composerComponentApi = (ComposerComponentApi) storage.getComponent(ComposerComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.account.orders.buttonv2.di.ActionButtonV2Component
                public ActionButtonV2Mapper getMapper() {
                    return (ActionButtonV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.account.orders.buttonv2.di.ActionButtonV2Component
                public ComposerNavigator getNavigator() {
                    return this.composerComponentApi.getComposerNavigator();
                }

                @Override // ru.ozon.app.android.account.orders.buttonv2.di.ActionButtonV2Component
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.account.orders.buttonv2.di.ActionButtonV2Component
                public ActionButtonViewModel getViewModel() {
                    Object create = this.networkComponentApi.getRetrofit().create(ComposerActionApi.class);
                    Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                    return new ActionButtonViewModel((ComposerActionApi) create, this.networkComponentApi.getJsonDeserializer());
                }
            };
        }
    }

    @NotNull
    ActionButtonV2Mapper getMapper();

    @NotNull
    ComposerNavigator getNavigator();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    ActionButtonViewModel getViewModel();
}
