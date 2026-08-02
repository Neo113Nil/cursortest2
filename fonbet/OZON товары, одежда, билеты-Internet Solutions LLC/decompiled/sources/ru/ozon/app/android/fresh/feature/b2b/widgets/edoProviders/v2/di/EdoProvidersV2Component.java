package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.di;

import Bm.C2665a;
import Vg.c;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/di/EdoProvidersV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/c;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EdoProvidersV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/di/EdoProvidersV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/di/EdoProvidersV2Component;", "create", "(Lk20/g;)Lk20/e;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EdoProvidersV2Component create$lambda$0(final C7475g c7475g) {
            return new EdoProvidersV2Component() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.di.EdoProvidersV2Component$Companion$create$1$1
                @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.di.EdoProvidersV2Component
                public c getCustomActionHandlersStore() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory().create(CopyTextActionHandler.class);
                }
            };
        }

        @NotNull
        public final C7473e<EdoProvidersV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(EdoProvidersV2Component.class), new C2665a(storage, 4));
        }
    }

    @NotNull
    c getCustomActionHandlersStore();
}
