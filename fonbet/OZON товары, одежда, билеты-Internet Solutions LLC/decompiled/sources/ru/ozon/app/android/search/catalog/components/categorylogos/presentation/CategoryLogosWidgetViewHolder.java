package ru.ozon.app.android.search.catalog.components.categorylogos.presentation;

import Nh.a;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoVO;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetCategoryLogosBinding;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001/\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J#\u0010!\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00130+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosVO;", "Lru/ozon/app/android/search/databinding/WidgetCategoryLogosBinding;", "Landroid/view/View;", "view", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetViewModel;", "viewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Landroid/view/View;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetViewModel;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "setupRecyclerView", "()V", "saveRvScrollPosition", "restoreRvScrollPosition", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;", "item", "categoryClick", "(Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO$Logo;)V", "onAttach", "onDetach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosVO;Ll20/d;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetViewModel;", "", "dp16", "I", "dp8", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetViewHolder$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetViewHolder$lifecycleObserver$1;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetAdapter;", "categoryAdapter", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogosWidgetAdapter;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryLogosWidgetViewHolder extends BindingViewHolder<CategoryLogosVO, WidgetCategoryLogosBinding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final CategoryLogosWidgetAdapter categoryAdapter;

    @NotNull
    private final ComposerReferences composerReferences;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final CategoryLogosWidgetViewHolder$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CategoryLogosWidgetViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogosWidgetViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetCategoryLogosBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetCategoryLogosBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetCategoryLogosBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetCategoryLogosBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetCategoryLogosBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v11, types: [ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogosWidgetViewHolder$lifecycleObserver$1] */
    public CategoryLogosWidgetViewHolder(@NotNull View view, @NotNull AdultHandler adultHandler, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull CategoryLogosWidgetViewModel viewModel, @NotNull FeatureChecker featureChecker) {
        super(view, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.adultHandler = adultHandler;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.dp16 = this.itemView.getResources().getDimensionPixelSize(R$dimen.default_margin);
        this.dp8 = this.itemView.getResources().getDimensionPixelSize(R$dimen.margin);
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onPreProcess(new CategoryLogosWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogosWidgetViewHolder$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                CategoryLogosWidgetViewHolder.this.restoreRvScrollPosition();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                CategoryLogosWidgetViewHolder.this.saveRvScrollPosition();
            }
        };
        this.categoryAdapter = new CategoryLogosWidgetAdapter(adultHandler, this, composerReferences, tokenizedAnalytics, featureChecker, this, new CategoryLogosWidgetViewHolder$categoryAdapter$1(this));
        setupRecyclerView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void categoryClick(final CategoryLogoVO.Logo item) {
        if (item == null) {
            return;
        }
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        AdultHandler adultHandler = this.adultHandler;
        boolean shouldBlur = item.getShouldBlur();
        Context context = getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G supportFragmentManager = ((r) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler, shouldBlur, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogosWidgetViewHolder$categoryClick$2
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                ComposerReferences composerReferences;
                Function1 function1;
                if (CategoryLogoVO.Logo.this.getAction() != null) {
                    function1 = this.actionHandler;
                    function1.invoke(CategoryLogoVO.Logo.this.getAction());
                } else if (CategoryLogoVO.Logo.this.getDeeplink() != null) {
                    composerReferences = this.composerReferences;
                    ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences.getNavigator(), CategoryLogoVO.Logo.this.getDeeplink(), null, 2, null);
                }
            }

            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultReject() {
                AdultListener.DefaultImpls.onAdultReject(this);
            }
        }, null, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreRvScrollPosition() {
        RecyclerView.o layoutManager = getBinding().rV.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(this.viewModel.getScrollState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveRvScrollPosition() {
        CategoryLogosWidgetViewModel categoryLogosWidgetViewModel = this.viewModel;
        RecyclerView.o layoutManager = getBinding().rV.getLayoutManager();
        categoryLogosWidgetViewModel.setScrollState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
    }

    private final void setupRecyclerView() {
        RecyclerView recyclerView = getBinding().rV;
        recyclerView.addItemDecoration(new RecyclerView.n() { // from class: ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogosWidgetViewHolder$setupRecyclerView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.A state) {
                int i11;
                int i12;
                int i13;
                int i14;
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                int a11 = a.a(parent, "parent", state, "state", view);
                if (a11 == 0) {
                    i14 = CategoryLogosWidgetViewHolder.this.dp16;
                    outRect.left = i14;
                } else if (a11 != state.b() - 1) {
                    i11 = CategoryLogosWidgetViewHolder.this.dp8;
                    outRect.left = i11;
                } else {
                    i12 = CategoryLogosWidgetViewHolder.this.dp8;
                    outRect.left = i12;
                    i13 = CategoryLogosWidgetViewHolder.this.dp16;
                    outRect.right = i13;
                }
            }
        });
        recyclerView.setAdapter(this.categoryAdapter);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(this.lifecycleObserver);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        getLifecycle().e(this.lifecycleObserver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CategoryLogosVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.categoryAdapter.updateItems(item.getItems(), item.getHideImage());
    }
}
