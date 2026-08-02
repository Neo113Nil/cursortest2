package ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.di;

import Bw.C2676a;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.data.DocsTableV2DocumentMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.data.DocsTableV2TitleMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/di/DocsTableV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlerStoreFactory", "()LVg/d;", "customActionHandlerStoreFactory", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2TitleMapper;", "getDocsTableV2TitleMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2TitleMapper;", "docsTableV2TitleMapper", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DocumentMapper;", "getDocsTableV2DocumentMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/data/DocsTableV2DocumentMapper;", "docsTableV2DocumentMapper", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DocsTableV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/di/DocsTableV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsTableV2/di/DocsTableV2Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DocsTableV2Component create$lambda$0(final C7475g c7475g) {
            return new DocsTableV2Component() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.di.DocsTableV2Component$Companion$create$1$1
                private final d customActionHandlerStoreFactory = getCustomActionHandlersComponentApi().getCustomActionHandlersStoreFactory();
                private final DocsTableV2TitleMapper docsTableV2TitleMapper = new DocsTableV2TitleMapper();
                private final DocsTableV2DocumentMapper docsTableV2DocumentMapper = new DocsTableV2DocumentMapper();

                private final CustomActionHandlersComponentApi getCustomActionHandlersComponentApi() {
                    return (CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.di.DocsTableV2Component
                public d getCustomActionHandlerStoreFactory() {
                    return this.customActionHandlerStoreFactory;
                }

                @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.di.DocsTableV2Component
                public DocsTableV2DocumentMapper getDocsTableV2DocumentMapper() {
                    return this.docsTableV2DocumentMapper;
                }

                @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.di.DocsTableV2Component
                public DocsTableV2TitleMapper getDocsTableV2TitleMapper() {
                    return this.docsTableV2TitleMapper;
                }
            };
        }

        @NotNull
        public final C7473e<DocsTableV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(DocsTableV2Component.class), new C2676a(storage, 5));
        }
    }

    @NotNull
    d getCustomActionHandlerStoreFactory();

    @NotNull
    DocsTableV2DocumentMapper getDocsTableV2DocumentMapper();

    @NotNull
    DocsTableV2TitleMapper getDocsTableV2TitleMapper();
}
