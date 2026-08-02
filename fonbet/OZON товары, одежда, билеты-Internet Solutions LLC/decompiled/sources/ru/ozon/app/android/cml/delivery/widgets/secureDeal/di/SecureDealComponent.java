package ru.ozon.app.android.cml.delivery.widgets.secureDeal.di;

import AG.b;
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
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDeal/di/SecureDealComponent;", "Lhi/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SecureDealComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDeal/di/SecureDealComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cml/delivery/widgets/secureDeal/di/SecureDealComponent;", "create", "(Lk20/g;)Lk20/e;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SecureDealComponent create$lambda$0(C7475g c7475g) {
            final CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
            final RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
            return new SecureDealComponent() { // from class: ru.ozon.app.android.cml.delivery.widgets.secureDeal.di.SecureDealComponent$Companion$create$1$1

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(SecureDealComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                @Override // ru.ozon.app.android.cml.delivery.widgets.secureDeal.di.SecureDealComponent
                public d getActionHandlersStoreFactory() {
                    return CustomActionHandlersComponentApi.this.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.secureDeal.di.SecureDealComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.cml.delivery.widgets.secureDeal.di.SecureDealComponent
                public l getTokenizedAnalytics() {
                    return retainComposerComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<SecureDealComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SecureDealComponent.class), new b(storage, 8));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    l getTokenizedAnalytics();
}
