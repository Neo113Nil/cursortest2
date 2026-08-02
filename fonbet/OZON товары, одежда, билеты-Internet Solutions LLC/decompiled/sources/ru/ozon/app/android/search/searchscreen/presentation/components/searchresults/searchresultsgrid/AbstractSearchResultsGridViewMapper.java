package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import A00.a;
import Vg.f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.delivery.customActionsHandlers.gocheckout.GoCheckoutActionHandler;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.common.SelectedStateChangedEvent;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteCustomComposerActionHandlerUtils;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult.OpenDeeplinkForRefreshResultActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeleteListingModal.ClassifiedOpenDeleteListingModalActionHandler;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.di.SearchComponentApi;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.SearchResultsPayload;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.SearchResultsCommonItemDecoration;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.DaggerSearchResultsGridWidgetV2Component;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.app.android.videocover.di.VideoCoverComponentApi;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 I2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0017j\b\u0012\u0004\u0012\u00020\u0002`\u00182\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J=\u00103\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\n\u0010-\u001a\u00060+j\u0002`,2\u0006\u0010/\u001a\u00020.2\u0010\u00102\u001a\f\u0012\u0004\u0012\u00020+00j\u0002`1H\u0016¢\u0006\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R,\u0010=\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020<0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R(\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020B0A0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR0\u0010G\u001a\u0018\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bH\u0010@¨\u0006J"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AbstractSearchResultsGridViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/widgetv2/SearchResultsGridWidgetV2Component;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "<init>", "()V", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "oldButtonState", "newButtonState", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/SearchResultsPayload;", "payloads", "", "compareButtonsStates", "(Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;Ljava/util/List;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;)Lru/ozon/composer/ui/widget/h;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "oldItem", "newItem", "getPayload", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbstractSearchResultsGridViewMapper extends WidgetViewMapper2<SearchResultsGridWidgetV2Component, SearchResultsGridVO, SearchResultsGridVO> {

    @NotNull
    private static final Set<Class<? extends f>> customActionHandlers;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final int layout = R$layout.widget_search_results_grid;

    @NotNull
    private final Function2<View, ComposerReferences, SearchResultsGridViewHolder> holderProducer = new AbstractSearchResultsGridViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(SelectedStateChangedEvent.class);
    private final Function2<a.J.InterfaceC0007a, SearchResultsGridVO, SearchResultsGridVO> updateConsumer = AbstractSearchResultsGridViewMapper$updateConsumer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/AbstractSearchResultsGridViewMapper$Companion;", "", "<init>", "()V", "", "Ljava/lang/Class;", "LVg/f;", "customActionHandlers", "Ljava/util/Set;", "getCustomActionHandlers", "()Ljava/util/Set;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<? extends f>> getCustomActionHandlers() {
            return AbstractSearchResultsGridViewMapper.customActionHandlers;
        }

        private Companion() {
        }
    }

    static {
        LinkedHashSet X02 = C7714v.X0(FavoriteCustomComposerActionHandlerUtils.INSTANCE.getFAVORITE_SWITCHING_BUTTON_CUSTOM_ACTION_HANDLER_CLASSES());
        X02.add(GoCheckoutActionHandler.class);
        X02.add(ShareLinkActionHandler.class);
        X02.add(ClassifiedOpenDeleteListingModalActionHandler.class);
        X02.add(OpenDeeplinkForRefreshResultActionHandler.class);
        X02.add(ComposerActionAndRedirectActionHandler.class);
        customActionHandlers = X02;
    }

    private final void compareButtonsStates(MultiButtonVO oldButtonState, MultiButtonVO newButtonState, List<SearchResultsPayload> payloads) {
        if (oldButtonState.getClass() != newButtonState.getClass()) {
            payloads.add(SearchResultsPayload.BUTTON_TYPE_CHANGED);
        } else {
            if (oldButtonState.equals(newButtonState)) {
                return;
            }
            payloads.add(SearchResultsPayload.BUTTON_STATE_CHANGED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchResultsGridWidgetV2Component widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerSearchResultsGridWidgetV2Component.factory().create((RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class), (CartServiceApi) c7475g.getComponent(CartServiceApi.class), (CartAtomBinderComponentApi) c7475g.getComponent(CartAtomBinderComponentApi.class), (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class), (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class), (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (SwitchingButtonComponentApi) c7475g.getComponent(SwitchingButtonComponentApi.class), (VideoCoverComponentApi) c7475g.getComponent(VideoCoverComponentApi.class), (SearchComponentApi) c7475g.getComponent(SearchComponentApi.class), (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class), (RetainImagePrefetchComponentApi) c7475g.getComponent(RetainImagePrefetchComponentApi.class), (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class), (OnboardingComponentApi) c7475g.getComponent(OnboardingComponentApi.class), (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SearchResultsGridVO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        super.constructLayout(composerRootView, viewObject, references, voHelper);
        component().getImagePrefetchInfoProviderStorage().addProvider(N.b(SearchResultsGridVO.class), component().getPrefetchInfoProvider());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new SearchResultsCommonItemDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SearchResultsGridViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public Function2<a.J.InterfaceC0007a, SearchResultsGridVO, SearchResultsGridVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SearchResultsGridWidgetV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SearchResultsGridWidgetV2Component.class), new JS.a(storage, 11));
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull SearchResultsGridVO oldItem, @NotNull SearchResultsGridVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getTopRightButtons(), newItem.getTopRightButtons())) {
            arrayList.add(SearchResultsPayload.TOP_RIGHT_BUTTONS_CHANGED);
        }
        if (oldItem.getButtonState() != null && newItem.getButtonState() != null) {
            compareButtonsStates(oldItem.getButtonState(), newItem.getButtonState(), arrayList);
            return arrayList;
        }
        if (oldItem.getButtonState() == null && newItem.getButtonState() != null) {
            arrayList.add(SearchResultsPayload.BUTTON_ADDED);
            return arrayList;
        }
        if (oldItem.getButtonState() != null && newItem.getButtonState() == null) {
            arrayList.add(SearchResultsPayload.BUTTON_REMOVED);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public ru.ozon.composer.ui.widget.h getWidgetSpan(@NotNull SearchResultsGridVO state, @NotNull SearchResultsGridVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }
}
