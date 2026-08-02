package ru.ozon.app.android.checkoutcomposer.sbp.search.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.s;
import W10.c;
import WZ.t;
import Wc.a;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.checkout.databinding.WidgetSearchBankListBinding;
import ru.ozon.app.android.checkoutcomposer.sbp.common.OnBankActionListener;
import ru.ozon.app.android.checkoutcomposer.sbp.search.data.SearchBankListDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.M;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000e*\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u000e*\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u0019\u001a\u00020\u000e*\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\u0019\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010\u0010J\u000f\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b-\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u001a\u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListViewHolder;", "Ld20/b;", "Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListVO;", "Lru/ozon/app/android/checkout/databinding/WidgetSearchBankListBinding;", "binding", "Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListViewModel;", "viewModel", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetSearchBankListBinding;Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListViewModel;Ll10/i;LVg/d;)V", "", "initSearchView", "()V", "initBanksContainer", "", "banks", "onBanksChanged", "(Ljava/util/List;)V", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SectionHeader;", "sectionHeader", "bindOrGone", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SectionHeader;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "atom", "internalBindOrGone", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "Landroidx/appcompat/widget/SearchView;", "Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SearchBar;", "searchBar", "(Landroidx/appcompat/widget/SearchView;Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO$SearchBar;)V", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "addView", "removeView", "Lru/ozon/app/android/checkout/databinding/WidgetSearchBankListBinding;", "Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListViewModel;", "Ll10/i;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "metricView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMetricView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchBankListViewHolder extends AbstractC6065b<SearchBankListVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetSearchBankListBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final ConstraintLayout metricView;

    @NotNull
    private final SearchBankListViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$1", f = "SearchBankListViewHolder.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ VerticalRecyclerContainer $rc;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalRecyclerContainer verticalRecyclerContainer, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$rc = verticalRecyclerContainer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SearchBankListViewHolder.this.new AnonymousClass1(this.$rc, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h<List<CellAtom.CellAtomWithSubtitle>> filteredBankCellsFlow = SearchBankListViewHolder.this.viewModel.getFilteredBankCellsFlow();
                final VerticalRecyclerContainer verticalRecyclerContainer = this.$rc;
                final SearchBankListViewHolder searchBankListViewHolder = SearchBankListViewHolder.this;
                InterfaceC2397i<? super List<CellAtom.CellAtomWithSubtitle>> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((List<? extends CellAtom.CellAtomWithSubtitle>) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(List<? extends CellAtom.CellAtomWithSubtitle> list, d<? super Unit> dVar) {
                        VerticalRecyclerContainer.this.bind(list);
                        searchBankListViewHolder.onBanksChanged(list);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (filteredBankCellsFlow.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$2", f = "SearchBankListViewHolder.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ VerticalRecyclerContainer $rc;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(VerticalRecyclerContainer verticalRecyclerContainer, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$rc = verticalRecyclerContainer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return SearchBankListViewHolder.this.new AnonymousClass2(this.$rc, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M0<String> queryFlow = SearchBankListViewHolder.this.viewModel.getQueryFlow();
                final VerticalRecyclerContainer verticalRecyclerContainer = this.$rc;
                InterfaceC2397i<? super String> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder.2.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((String) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(String str, d<? super Unit> dVar) {
                        final VerticalRecyclerContainer verticalRecyclerContainer2 = VerticalRecyclerContainer.this;
                        verticalRecyclerContainer2.postDelayed(new Runnable() { // from class: ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$2$1$emit$$inlined$postDelayed$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                VerticalRecyclerContainer.this.smoothScrollToPosition(0);
                            }
                        }, 300L);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (queryFlow.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$3", f = "SearchBankListViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<A00.a, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = SearchBankListViewHolder.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(A00.a aVar, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            A00.a aVar2 = (A00.a) this.L$0;
            if (aVar2 instanceof a.I) {
                FrameLayout layoutBackgroundProgressBar = SearchBankListViewHolder.this.binding.layoutBackgroundProgressBar;
                Intrinsics.checkNotNullExpressionValue(layoutBackgroundProgressBar, "layoutBackgroundProgressBar");
                layoutBackgroundProgressBar.setVisibility(((a.I) aVar2).e() ? 0 : 8);
            }
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListViewHolder$Companion;", "", "<init>", "()V", "SCROLL_TO_START_DELAY_MILLIS", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SearchBankListViewHolder(@NotNull WidgetSearchBankListBinding binding, @NotNull SearchBankListViewModel viewModel, @NotNull i container, @NotNull Vg.d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.binding = binding;
        this.viewModel = viewModel;
        this.container = container;
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.metricView = constraintLayout;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new SearchBankListViewHolder$actionHandler$1(customActionHandlersStoreFactory)).customAnalyticHandler(SearchBankListViewHolder$actionHandler$2.INSTANCE).buildHandler();
        initSearchView();
        initBanksContainer();
        VerticalRecyclerContainer banksVerticalRecyclerContainer = binding.banksVerticalRecyclerContainer;
        Intrinsics.checkNotNullExpressionValue(banksVerticalRecyclerContainer, "banksVerticalRecyclerContainer");
        K.a(this).c(new AnonymousClass1(banksVerticalRecyclerContainer, null));
        K.a(this).c(new AnonymousClass2(banksVerticalRecyclerContainer, null));
        C2399j.C(new C2408n0(container.M().getEventsFlow(), new AnonymousClass3(null)), K.a(container.Q().g()));
    }

    private final void bindOrGone(TextAtomView textAtomView, SearchBankListDTO.SectionHeader sectionHeader) {
        if (sectionHeader == null) {
            ViewExtKt.gone(textAtomView);
            return;
        }
        TextAtomHolderKt.bind(textAtomView, sectionHeader.getText(), this.actionHandler);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String backgroundColor = sectionHeader.getBackgroundColor();
        Context context2 = textAtomView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.binding.sectionHeaderTextAtomView.setBackgroundColor(styleParser.parseColor(context, backgroundColor, ThemeExtKt.themeColorRes(context2, R$attr.layerFloor0)));
    }

    private final void initBanksContainer() {
        VerticalRecyclerContainer verticalRecyclerContainer = this.binding.banksVerticalRecyclerContainer;
        verticalRecyclerContainer.setOnAction(new OnBankActionListener(new SearchBankListViewHolder$initBanksContainer$1$1(this), this.container.Q(), new SearchBankListViewHolder$initBanksContainer$1$2(this), new SearchBankListViewHolder$initBanksContainer$1$3(this), this.container.X()));
        verticalRecyclerContainer.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$initBanksContainer$1$4
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 1) {
                    ConstraintLayout constraintLayout = SearchBankListViewHolder.this.binding.getConstraintLayout();
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hideKeyboard(constraintLayout);
                }
            }
        });
    }

    private final void initSearchView() {
        SearchView searchView = this.binding.searchView;
        searchView.p(this.viewModel.getQueryFlow().getValue(), true);
        searchView.o(new SearchView.l() { // from class: ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder$initSearchView$1$1
            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextChange(String newText) {
                if (newText == null) {
                    return false;
                }
                SearchBankListViewHolder.this.viewModel.onSearchQueryChanged(newText);
                return false;
            }

            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
        });
    }

    private final void internalBindOrGone(TextAtomView textAtomView, TextAtom textAtom) {
        if (textAtom == null) {
            ViewExtKt.gone(textAtomView);
        } else {
            TextAtomHolderKt.bind(textAtomView, textAtom, this.actionHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBanksChanged(List<?> banks) {
        WidgetSearchBankListBinding widgetSearchBankListBinding = this.binding;
        SearchBankListVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        if (banks.isEmpty()) {
            TextAtomView sectionHeaderTextAtomView = widgetSearchBankListBinding.sectionHeaderTextAtomView;
            Intrinsics.checkNotNullExpressionValue(sectionHeaderTextAtomView, "sectionHeaderTextAtomView");
            ViewExtKt.gone(sectionHeaderTextAtomView);
            TextAtomView emptyListPlaceholderTextAtomView = widgetSearchBankListBinding.emptyListPlaceholderTextAtomView;
            Intrinsics.checkNotNullExpressionValue(emptyListPlaceholderTextAtomView, "emptyListPlaceholderTextAtomView");
            ViewExtKt.showOrGoneByPresence(emptyListPlaceholderTextAtomView, boundData.getEmptyListPlaceholder());
            return;
        }
        TextAtomView emptyListPlaceholderTextAtomView2 = widgetSearchBankListBinding.emptyListPlaceholderTextAtomView;
        Intrinsics.checkNotNullExpressionValue(emptyListPlaceholderTextAtomView2, "emptyListPlaceholderTextAtomView");
        ViewExtKt.gone(emptyListPlaceholderTextAtomView2);
        TextAtomView sectionHeaderTextAtomView2 = widgetSearchBankListBinding.sectionHeaderTextAtomView;
        Intrinsics.checkNotNullExpressionValue(sectionHeaderTextAtomView2, "sectionHeaderTextAtomView");
        ViewExtKt.showOrGoneByPresence(sectionHeaderTextAtomView2, boundData.getSectionHeader());
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        this.container.Z().addView(this.binding.getConstraintLayout());
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        this.container.Z().removeView(this.binding.getConstraintLayout());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SearchBankListVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.onBanksChanged(item.getBanks());
        WidgetSearchBankListBinding widgetSearchBankListBinding = this.binding;
        TextAtomView emptyListPlaceholderTextAtomView = widgetSearchBankListBinding.emptyListPlaceholderTextAtomView;
        Intrinsics.checkNotNullExpressionValue(emptyListPlaceholderTextAtomView, "emptyListPlaceholderTextAtomView");
        internalBindOrGone(emptyListPlaceholderTextAtomView, item.getEmptyListPlaceholder());
        TextAtomView sectionHeaderTextAtomView = widgetSearchBankListBinding.sectionHeaderTextAtomView;
        Intrinsics.checkNotNullExpressionValue(sectionHeaderTextAtomView, "sectionHeaderTextAtomView");
        bindOrGone(sectionHeaderTextAtomView, item.getSectionHeader());
        SmallIconButtonView closeButton = widgetSearchBankListBinding.closeButton;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        WrappedIconButtonHolderKt.bindOrGone(closeButton, item.getCloseButton(), this.actionHandler);
        SearchView searchView = widgetSearchBankListBinding.searchView;
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        bindOrGone(searchView, item.getSearchBar());
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public ConstraintLayout getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull SearchBankListVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((SearchBankListViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }

    private final void bindOrGone(SearchView searchView, SearchBankListDTO.SearchBar searchBar) {
        if (searchBar == null) {
            ViewExtKt.gone(searchView);
        } else {
            searchView.q(searchBar.getPlaceholder());
            ViewExtKt.show(searchView);
        }
    }
}
