package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import BS.a;
import Cw.ViewOnClickListenerC2787a;
import Cw.b;
import Sc.InterfaceC4008j;
import Sc.k;
import a00.C4911f;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jm.RunnableC7436a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.autopicker.databinding.FragmentProductPickerSearchBinding;
import ru.ozon.app.android.autopicker.di.AutoPickerComponent;
import ru.ozon.app.android.autopicker.di.DaggerAutoPickerComponent;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.ProductPickerDividerDecoration;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.ProductPickerSearchAdapter;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.utils.lifecycle.fragment.FragmentExtKt;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.R$font;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.LargeButtonAppearance;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000µ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b*\u0001o\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001uB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b)\u0010\u001bJ\u0017\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010\u001fJ\u0017\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010\u001fJ\u0017\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J#\u0010:\u001a\u00020\u00072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020807H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010=\u001a\u00020\u0007H\u0016¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0007H\u0002¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010?\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010\u0004J\u000f\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\b@\u0010\u0004R0\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR0\u0010H\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0007\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR6\u0010L\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0007\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR0\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0007\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010C\u001a\u0004\bS\u0010E\"\u0004\bT\u0010GR&\u0010\u0011\u001a\u00060Uj\u0002`V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006v"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchView;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "onNewTitleData", "(Ljava/lang/String;)V", "", "isTree", "onNewScreenStructureData", "(Z)V", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "items", "onNewItems", "(Ljava/util/List;)V", "subtitle", "onNewButtonData", "(Ljava/lang/String;Ljava/lang/String;)V", "hint", "onNewSearchData", "enable", "onEnableButton", "", "position", "onScroll", "(I)V", "onSmoothScroll", "show", "onProgress", "", "error", "onError", "(Ljava/lang/Throwable;)V", "", "", "params", "onNewParams", "(Ljava/util/Map;)V", "onFinish", "onDestroyView", "prepareScreenStateView", "prepareToolbar", "prepareRecyclerView", "Lkotlin/Function1;", "onMainButtonClicked", "Lkotlin/jvm/functions/Function1;", "getOnMainButtonClicked", "()Lkotlin/jvm/functions/Function1;", "setOnMainButtonClicked", "(Lkotlin/jvm/functions/Function1;)V", "onLeafClicked", "getOnLeafClicked", "setOnLeafClicked", "Lkotlin/Function2;", "onNodeClicked", "Lkotlin/jvm/functions/Function2;", "getOnNodeClicked", "()Lkotlin/jvm/functions/Function2;", "setOnNodeClicked", "(Lkotlin/jvm/functions/Function2;)V", "onSearch", "getOnSearch", "setOnSearch", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "La00/f;", "getContainer", "()La00/f;", "setContainer", "(La00/f;)V", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchBinder;", "binder", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchBinder;", "getBinder", "()Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchBinder;", "setBinder", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchBinder;)V", "Lru/ozon/app/android/autopicker/databinding/FragmentProductPickerSearchBinding;", "mBinding", "Lru/ozon/app/android/autopicker/databinding/FragmentProductPickerSearchBinding;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/ProductPickerSearchAdapter;", "adapter", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/ProductPickerSearchAdapter;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/ProductPickerDividerDecoration;", "dividerDecoration$delegate", "LSc/j;", "getDividerDecoration", "()Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/ProductPickerDividerDecoration;", "dividerDecoration", "ru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchFragment$onQueryTextListener$1", "onQueryTextListener", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchFragment$onQueryTextListener$1;", "getBinding", "()Lru/ozon/app/android/autopicker/databinding/FragmentProductPickerSearchBinding;", "binding", "Companion", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchFragment extends ComponentCallbacksC5392m implements ProductPickerSearchView {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public ProductPickerSearchBinder binder;
    public C4911f container;
    private FragmentProductPickerSearchBinding mBinding;
    private Function1<? super ProductPickerSearchVO.ProductPickerSearchItem, Unit> onLeafClicked;
    private Function1<? super Boolean, Unit> onMainButtonClicked;
    private Function2<? super ProductPickerSearchVO.ProductPickerSearchItem, ? super Integer, Unit> onNodeClicked;
    private Function1<? super String, Unit> onSearch;

    @NotNull
    private final ProductPickerSearchAdapter adapter = new ProductPickerSearchAdapter();

    /* renamed from: dividerDecoration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dividerDecoration = k.b(new ProductPickerSearchFragment$dividerDecoration$2(this));

    @NotNull
    private final ProductPickerSearchFragment$onQueryTextListener$1 onQueryTextListener = new SearchView.l() { // from class: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment$onQueryTextListener$1
        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String newText) {
            Intrinsics.checkNotNullParameter(newText, "newText");
            Function1<String, Unit> onSearch = ProductPickerSearchFragment.this.getOnSearch();
            if (onSearch == null) {
                return true;
            }
            onSearch.invoke(newText);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String query) {
            FragmentProductPickerSearchBinding binding;
            Intrinsics.checkNotNullParameter(query, "query");
            Function1<String, Unit> onSearch = ProductPickerSearchFragment.this.getOnSearch();
            if (onSearch != null) {
                onSearch.invoke(query);
            }
            binding = ProductPickerSearchFragment.this.getBinding();
            binding.searchV.clearFocus();
            return true;
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchFragment$Companion;", "", "<init>", "()V", "ACTION_TYPE_EXTRA", "", "CURRENT_STEP_EXTRA", "PARAMS_EXTRA", "MS_PER_INCH", "", "newInstance", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchFragment;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "currentStep", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProductPickerSearchFragment newInstance(@NotNull String actionType, @NotNull String currentStep, @NotNull HashMap<String, String> params) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(currentStep, "currentStep");
            Intrinsics.checkNotNullParameter(params, "params");
            ProductPickerSearchFragment productPickerSearchFragment = new ProductPickerSearchFragment();
            Bundle bundle = new Bundle();
            bundle.putString("action_type_extra", actionType);
            bundle.putString("current_step_extra", currentStep);
            bundle.putSerializable("params_extra", params);
            productPickerSearchFragment.setArguments(bundle);
            return productPickerSearchFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentProductPickerSearchBinding getBinding() {
        FragmentProductPickerSearchBinding fragmentProductPickerSearchBinding = this.mBinding;
        Intrinsics.f(fragmentProductPickerSearchBinding);
        return fragmentProductPickerSearchBinding;
    }

    private final ProductPickerDividerDecoration getDividerDecoration() {
        return (ProductPickerDividerDecoration) this.dividerDecoration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onEnableButton$lambda$8$lambda$7(ProductPickerSearchFragment productPickerSearchFragment, View view) {
        Function1<Boolean, Unit> onMainButtonClicked = productPickerSearchFragment.getOnMainButtonClicked();
        if (onMainButtonClicked != null) {
            onMainButtonClicked.invoke(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScroll$lambda$11$lambda$10$lambda$9(RecyclerView recyclerView, int i11) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSmoothScroll$lambda$15$lambda$14$lambda$13(RecyclerView recyclerView, int i11) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            final Context context = recyclerView.getContext();
            r rVar = new r(context) { // from class: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment$onSmoothScroll$1$1$1$1
                @Override // androidx.recyclerview.widget.r
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                    return 50.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.r
                protected int getVerticalSnapPreference() {
                    return -1;
                }
            };
            rVar.setTargetPosition(i11);
            linearLayoutManager.startSmoothScroll(rVar);
        }
    }

    private final void prepareRecyclerView() {
        FragmentProductPickerSearchBinding binding = getBinding();
        binding.valuesRv.setAdapter(this.adapter);
        binding.valuesRv.addItemDecoration(getDividerDecoration());
        this.adapter.setOnLeafClicked(new ProductPickerSearchFragment$prepareRecyclerView$1$1(binding, this));
        this.adapter.setOnNodeClicked(new ProductPickerSearchFragment$prepareRecyclerView$2(this));
    }

    private final void prepareScreenStateView() {
        getBinding().screenStateView.setListener(new ProductPickerSearchFragment$prepareScreenStateView$1(this));
    }

    private final void prepareToolbar() {
        FragmentProductPickerSearchBinding binding = getBinding();
        binding.productPickerBackIv.setOnClickListener(new ViewOnClickListenerC2787a(this, 12));
        binding.productPickerCloseIv.setOnClickListener(new b(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareToolbar$lambda$18$lambda$17(ProductPickerSearchFragment productPickerSearchFragment, View view) {
        ComposerExtKt.closeFlow(productPickerSearchFragment.getContainer());
    }

    @NotNull
    public final ProductPickerSearchBinder getBinder() {
        ProductPickerSearchBinder productPickerSearchBinder = this.binder;
        if (productPickerSearchBinder != null) {
            return productPickerSearchBinder;
        }
        Intrinsics.n("binder");
        throw null;
    }

    @NotNull
    public final C4911f getContainer() {
        C4911f c4911f = this.container;
        if (c4911f != null) {
            return c4911f;
        }
        Intrinsics.n("container");
        throw null;
    }

    public Function1<ProductPickerSearchVO.ProductPickerSearchItem, Unit> getOnLeafClicked() {
        return this.onLeafClicked;
    }

    public Function1<Boolean, Unit> getOnMainButtonClicked() {
        return this.onMainButtonClicked;
    }

    public Function2<ProductPickerSearchVO.ProductPickerSearchItem, Integer, Unit> getOnNodeClicked() {
        return this.onNodeClicked;
    }

    public Function1<String, Unit> getOnSearch() {
        return this.onSearch;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AutoPickerComponent.Factory factory = DaggerAutoPickerComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, ComposerFragmentComponentDependencies.class).getDependencyStorage();
        if (ComposerFragmentComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerFragmentComponentDependencies is not DiComponent");
        }
        ComposerFragmentComponentDependencies composerFragmentComponentDependencies = (ComposerFragmentComponentDependencies) dependencyStorage2.b(ComposerFragmentComponentDependencies.class);
        C6740b dependencyStorage3 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage3.b(ContextComponentDependencies.class);
        C6740b dependencyStorage4 = C6739a.b(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage4.b(AnalyticsComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage5.b(NetworkComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, composerFragmentComponentDependencies, contextComponentDependencies, analyticsComponentApi, networkComponentApi, (AnalyticsScreenStorageComponentApi) dependencyStorage6.b(AnalyticsScreenStorageComponentApi.class)).inject(this);
        ProductPickerSearchBinder binder = getBinder();
        String string = requireArguments().getString("action_type_extra");
        Intrinsics.f(string);
        String string2 = requireArguments().getString("current_step_extra");
        Intrinsics.f(string2);
        Serializable serializable = requireArguments().getSerializable("params_extra");
        Intrinsics.g(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        binder.setInitialNetworkData(string, string2, (HashMap) serializable);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        setContainer(new C4911f(this));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mBinding = FragmentProductPickerSearchBinding.inflate(inflater, container, false);
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.mBinding = null;
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onEnableButton(boolean enable) {
        LargeButtonView largeButtonView = getBinding().actionButton;
        largeButtonView.setEnabled(enable);
        largeButtonView.setOnClickListener(enable ? new a(this, 11) : null);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        getBinding().screenStateView.showState(ScreenStateExtKt.toScreenState$default(error, null, false, 3, null));
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onFinish() {
        requireActivity().onBackPressed();
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onNewButtonData(@NotNull String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        LargeButtonView largeButtonView = getBinding().actionButton;
        largeButtonView.setText(title);
        largeButtonView.setSubText(subtitle);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onNewItems(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.adapter.submitList(items);
        FragmentProductPickerSearchBinding binding = getBinding();
        RecyclerView.l itemAnimator = binding.valuesRv.getItemAnimator();
        if (itemAnimator != null) {
            binding.screenStateView.postDelayed(new RunnableC7436a(this, 0), itemAnimator.getChangeDuration());
        }
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onNewParams(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        FragmentExtKt.sendResultWithArgs(this, new ProductPickerSearchFragment$onNewParams$1(params));
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onNewScreenStructureData(boolean isTree) {
        getDividerDecoration().setTree(isTree);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onNewSearchData(String hint) {
        SearchView searchView = getBinding().searchV;
        if (hint == null) {
            Intrinsics.f(searchView);
            ViewExtKt.gone(searchView);
            return;
        }
        Intrinsics.f(searchView);
        ViewExtKt.show(searchView);
        searchView.q(hint);
        searchView.p(null, false);
        searchView.o(this.onQueryTextListener);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onNewTitleData(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView textView = getBinding().titleTv;
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(title);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        textView.setText(OzonSpannableStringExtKt.applyFontFix(ozonSpannableString, requireContext, R$font.onest_semibold));
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onProgress(boolean show) {
        getBinding().screenStateView.showState(show ? new ScreenState.Loading() : new ScreenState.NoScreen());
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onScroll(final int position) {
        final RecyclerView recyclerView = getBinding().valuesRv;
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            recyclerView.postDelayed(new Runnable() { // from class: jm.c
                @Override // java.lang.Runnable
                public final void run() {
                    ProductPickerSearchFragment.onScroll$lambda$11$lambda$10$lambda$9(recyclerView, position);
                }
            }, itemAnimator.getChangeDuration());
        }
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void onSmoothScroll(final int position) {
        final RecyclerView recyclerView = getBinding().valuesRv;
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            recyclerView.postDelayed(new Runnable() { // from class: jm.b
                @Override // java.lang.Runnable
                public final void run() {
                    ProductPickerSearchFragment.onSmoothScroll$lambda$15$lambda$14$lambda$13(recyclerView, position);
                }
            }, itemAnimator.getChangeDuration());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ProductPickerSearchBinder binder = getBinder();
        if (binder != null) {
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            binder.bind(this, viewLifecycleOwner);
        }
        prepareToolbar();
        prepareRecyclerView();
        prepareScreenStateView();
        StyleAppearance of2 = StyleAppearance.INSTANCE.of(new LargeButtonAppearance());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        of2.read(context, R$style.LargeButton_Primary);
        LargeButtonView actionButton = getBinding().actionButton;
        Intrinsics.checkNotNullExpressionValue(actionButton, "actionButton");
        of2.apply(actionButton);
    }

    public final void setContainer(@NotNull C4911f c4911f) {
        Intrinsics.checkNotNullParameter(c4911f, "<set-?>");
        this.container = c4911f;
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void setOnLeafClicked(Function1<? super ProductPickerSearchVO.ProductPickerSearchItem, Unit> function1) {
        this.onLeafClicked = function1;
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void setOnMainButtonClicked(Function1<? super Boolean, Unit> function1) {
        this.onMainButtonClicked = function1;
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void setOnNodeClicked(Function2<? super ProductPickerSearchVO.ProductPickerSearchItem, ? super Integer, Unit> function2) {
        this.onNodeClicked = function2;
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchView
    public void setOnSearch(Function1<? super String, Unit> function1) {
        this.onSearch = function1;
    }
}
