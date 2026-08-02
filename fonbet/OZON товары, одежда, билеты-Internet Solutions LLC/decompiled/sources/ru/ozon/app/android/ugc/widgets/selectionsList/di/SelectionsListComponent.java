package ru.ozon.app.android.ugc.widgets.selectionsList.di;

import DR.a;
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
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.ugc.widgets.selectionsList.core.SelectionsListGridEmptyMapper;
import ru.ozon.app.android.ugc.widgets.selectionsList.core.SelectionsListGridMapper;
import ru.ozon.app.android.ugc.widgets.selectionsList.core.SelectionsListMapper;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/di/SelectionsListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favMoleculeDelegateProvider", "Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListMapper;", "getSelectionsListMapper", "()Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListMapper;", "selectionsListMapper", "Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridMapper;", "getSelectionsListGridMapper", "()Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridMapper;", "selectionsListGridMapper", "Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridEmptyMapper;", "getSelectionsListGridEmptyMapper", "()Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridEmptyMapper;", "selectionsListGridEmptyMapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SelectionsListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/di/SelectionsListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/selectionsList/di/SelectionsListComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SelectionsListComponent getInstance$lambda$0(final C7475g c7475g) {
            return new SelectionsListComponent() { // from class: ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent$Companion$getInstance$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final d customActionHandlersStoreFactory;
                private final RetainComposerComponentApi retainComposerComponentApi;

                /* renamed from: selectionsListGridEmptyMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j selectionsListGridEmptyMapper;

                /* renamed from: selectionsListGridMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j selectionsListGridMapper;

                /* renamed from: selectionsListMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j selectionsListMapper;
                private final l tokenizedAnalytics;

                {
                    RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                    this.retainComposerComponentApi = retainComposerComponentApi;
                    CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class);
                    this.customActionHandlersComponentApi = customActionHandlersComponentApi;
                    this.selectionsListMapper = k.b(SelectionsListComponent$Companion$getInstance$1$1$selectionsListMapper$2.INSTANCE);
                    this.selectionsListGridEmptyMapper = k.b(SelectionsListComponent$Companion$getInstance$1$1$selectionsListGridEmptyMapper$2.INSTANCE);
                    this.selectionsListGridMapper = k.b(SelectionsListComponent$Companion$getInstance$1$1$selectionsListGridMapper$2.INSTANCE);
                    this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
                    this.customActionHandlersStoreFactory = customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersStoreFactory;
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent
                public ProductFavoriteDelegateProvider getFavMoleculeDelegateProvider() {
                    return ((FavoriteComponentApi) C7475g.this.getComponent(FavoriteComponentApi.class)).getFavoriteProductDelegate();
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent
                public SelectionsListGridEmptyMapper getSelectionsListGridEmptyMapper() {
                    return (SelectionsListGridEmptyMapper) this.selectionsListGridEmptyMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent
                public SelectionsListGridMapper getSelectionsListGridMapper() {
                    return (SelectionsListGridMapper) this.selectionsListGridMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent
                public SelectionsListMapper getSelectionsListMapper() {
                    return (SelectionsListMapper) this.selectionsListMapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent
                public l getTokenizedAnalytics() {
                    return this.tokenizedAnalytics;
                }
            };
        }

        @NotNull
        public final C7473e<SelectionsListComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SelectionsListComponent.class), new a(storage, 6));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ProductFavoriteDelegateProvider getFavMoleculeDelegateProvider();

    @NotNull
    SelectionsListGridEmptyMapper getSelectionsListGridEmptyMapper();

    @NotNull
    SelectionsListGridMapper getSelectionsListGridMapper();

    @NotNull
    SelectionsListMapper getSelectionsListMapper();

    @NotNull
    l getTokenizedAnalytics();
}
