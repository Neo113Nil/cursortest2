package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di;

import AN.a;
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
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollViewModel;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0015R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\f\u001a\u00060\bj\u0002`\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/di/SelectionItemDescriptionComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "getSubscribeAuthorsIdStorage", "()Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "getScrollViewModel", "()Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "scrollViewModel", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SelectionItemDescriptionComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/di/SelectionItemDescriptionComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/di/SelectionItemDescriptionComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SelectionItemDescriptionComponent create$lambda$0(final C7475g c7475g) {
            return new SelectionItemDescriptionComponent(c7475g) { // from class: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di.SelectionItemDescriptionComponent$Companion$create$1$1
                private final CustomActionHandlersComponentApi actionHandlersApi;
                private final RetainComposerComponentApi retainComposerApi;

                /* renamed from: scrollViewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j scrollViewModel = k.b(SelectionItemDescriptionComponent$Companion$create$1$1$scrollViewModel$2.INSTANCE);
                private final StorageComponentApi storageComponentApi;

                {
                    this.actionHandlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.retainComposerApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di.SelectionItemDescriptionComponent
                public d getActionHandlersStoreFactory() {
                    return this.actionHandlersApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di.SelectionItemDescriptionComponent
                public SelectionItemDescriptionScrollViewModel getScrollViewModel() {
                    return (SelectionItemDescriptionScrollViewModel) this.scrollViewModel.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di.SelectionItemDescriptionComponent
                public SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage() {
                    return this.storageComponentApi.getSubscribeAuthorsIdStorage();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di.SelectionItemDescriptionComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<SelectionItemDescriptionComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SelectionItemDescriptionComponent.class), new a(storage, 10));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    SelectionItemDescriptionScrollViewModel getScrollViewModel();

    @NotNull
    SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage();

    @NotNull
    l getTokenizedAnalytics();
}
