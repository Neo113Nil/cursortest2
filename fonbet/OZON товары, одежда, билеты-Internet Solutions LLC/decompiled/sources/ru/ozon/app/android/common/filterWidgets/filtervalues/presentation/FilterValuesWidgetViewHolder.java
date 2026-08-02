package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Vq.f;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6065b;
import i10.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator.FiltersIslandSeparatorView;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.button.FilterButtonHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.FilterValuesDTO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesWidgetViewHolder;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.HeaderCell;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.FilterValuesAdapter;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.FilterValuesStickyHeaderItemDecorator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001eBM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u0017*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u0017*\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010\u001bJ\u000f\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0017H\u0002¢\u0006\u0004\b1\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u0004\u0018\u00010E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00170H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010[R\u001b\u0010`\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010?\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010[R\u0014\u0010c\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010AR\u0014\u0010d\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010A¨\u0006f"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;", "Ll10/i;", "container", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroid/view/ViewGroup;", "containerView", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel;", "viewModel", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "filterSharedViewModel", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/ApplyFiltersAnalyticDelegate;", "applyFiltersAnalyticDelegate", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Ll10/i;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/ViewGroup;Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel;Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/ApplyFiltersAnalyticDelegate;LWZ/l;Lru/ozon/app/android/utils/AppType;)V", "item", "", "bind", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;)V", "createView", "()V", "", "bottomPadding", "getBottomInset", "(I)I", "Landroidx/appcompat/widget/SearchView;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;", "searchBar", "bindSearchBar", "(Landroidx/appcompat/widget/SearchView;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;)V", "appendSearchView", "(Landroid/view/ViewGroup;)V", "showError", "showErrorAndClose", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$TrackComposerAction;", "trackAction", "trackApplyFilters", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action$TrackComposerAction;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "click", "checkNeedToHideKeyboard", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "addIslandSeparator", "Ll10/i;", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/ApplyFiltersAnalyticDelegate;", "LWZ/l;", "currentModel", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;", "", "hasSubmittedList", "Z", "isSelect$delegate", "LSc/j;", "isSelect", "()Z", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/FilterButtonHolder;", "buttonHolder", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/button/FilterButtonHolder;", "", "deeplink", "Ljava/lang/String;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/FilterValuesAdapter;", "mAdapter", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/rv/FilterValuesAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/graphics/drawable/Drawable;", "topContainerBgDrawable", "Landroid/graphics/drawable/Drawable;", "dp32", "I", "dp8", "Landroid/view/View;", "view$delegate", "getView", "()Landroid/view/View;", "view", "searchBarView$delegate", "getSearchBarView", "()I", "searchBarView", "getMetricView", "metricView", "isSelectFilterValues", "isLanguageSelector", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesWidgetViewHolder extends AbstractC6065b<FilterValuesVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ApplyFiltersAnalyticDelegate applyFiltersAnalyticDelegate;

    @NotNull
    private final FilterButtonHolder buttonHolder;

    @NotNull
    private final i container;

    @NotNull
    private final ViewGroup containerView;
    private FilterValuesVO currentModel;
    private final String deeplink;
    private final int dp32;
    private final int dp8;

    @NotNull
    private final FilterSharedViewModel filterSharedViewModel;
    private boolean hasSubmittedList;

    /* renamed from: isSelect$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isSelect;

    @NotNull
    private final FilterValuesAdapter mAdapter;

    @NotNull
    private final LinearLayoutManager mLayoutManager;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: searchBarView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j searchBarView;

    @NotNull
    private final l tokenizedAnalytics;
    private Drawable topContainerBgDrawable;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    @NotNull
    private final FilterValuesViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "cells", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends FilterValuesCell>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5(FilterValuesWidgetViewHolder filterValuesWidgetViewHolder, List list) {
            int i11;
            boolean z11;
            if (filterValuesWidgetViewHolder.isSelectFilterValues()) {
                Intrinsics.f(list);
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((FilterValuesCell) it.next()).getViewType() == HeaderCell.INSTANCE.getViewType()) {
                            break;
                        }
                    }
                }
                filterValuesWidgetViewHolder.addIslandSeparator();
            }
            RecyclerView composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(filterValuesWidgetViewHolder.containerView);
            if (composerRecyclerViewOrNull != null) {
                if (filterValuesWidgetViewHolder.isSelectFilterValues()) {
                    Intrinsics.f(list);
                    List list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (((FilterValuesCell) it2.next()).getViewType() == HeaderCell.INSTANCE.getViewType()) {
                                Context context = composerRecyclerViewOrNull.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                composerRecyclerViewOrNull.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
                                break;
                            }
                        }
                    }
                }
                Context context2 = composerRecyclerViewOrNull.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                composerRecyclerViewOrNull.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
                if (filterValuesWidgetViewHolder.isSelectFilterValues()) {
                    Integer valueOf = Integer.valueOf(filterValuesWidgetViewHolder.dp8);
                    Intrinsics.f(list);
                    List list4 = list;
                    i11 = 0;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            if (((FilterValuesCell) it3.next()).getViewType() == HeaderCell.INSTANCE.getViewType()) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i11 = valueOf.intValue();
                    }
                } else {
                    i11 = filterValuesWidgetViewHolder.dp32;
                }
                composerRecyclerViewOrNull.setPadding(composerRecyclerViewOrNull.getPaddingLeft(), composerRecyclerViewOrNull.getPaddingTop(), composerRecyclerViewOrNull.getPaddingRight(), filterValuesWidgetViewHolder.getBottomInset(i11));
                composerRecyclerViewOrNull.invalidateItemDecorations();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends FilterValuesCell> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final List<? extends FilterValuesCell> list) {
            if (FilterValuesWidgetViewHolder.this.isLanguageSelector() && FilterValuesWidgetViewHolder.this.currentModel == null) {
                return;
            }
            FilterValuesWidgetViewHolder.this.hasSubmittedList = true;
            FilterValuesAdapter filterValuesAdapter = FilterValuesWidgetViewHolder.this.mAdapter;
            final FilterValuesWidgetViewHolder filterValuesWidgetViewHolder = FilterValuesWidgetViewHolder.this;
            filterValuesAdapter.submitList(list, new Runnable() { // from class: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.a
                @Override // java.lang.Runnable
                public final void run() {
                    FilterValuesWidgetViewHolder.AnonymousClass1.invoke$lambda$5(FilterValuesWidgetViewHolder.this, list);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesWidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<FilterValuesViewModel.Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FilterValuesViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FilterValuesViewModel.Action action) {
            ButtonV3Atom.LargeButton applyButton;
            if (action instanceof FilterValuesViewModel.Action.Success) {
                String refreshUrl = ((FilterValuesViewModel.Action.Success) action).getRefreshUrl();
                if (refreshUrl != null) {
                    FilterValuesWidgetViewHolder.this.filterSharedViewModel.sendRefresh(refreshUrl);
                }
                FilterValuesWidgetViewHolder.this.refs.getNavigator().popBackStack();
                return;
            }
            if (action instanceof FilterValuesViewModel.Action.TrackComposerAction) {
                FilterValuesWidgetViewHolder.this.trackApplyFilters((FilterValuesViewModel.Action.TrackComposerAction) action);
                return;
            }
            if (action instanceof FilterValuesViewModel.Action.Error) {
                FilterValuesWidgetViewHolder.this.showError();
                return;
            }
            if (action instanceof FilterValuesViewModel.Action.ErrorAndClose) {
                FilterValuesWidgetViewHolder.this.showErrorAndClose();
                return;
            }
            if (action instanceof FilterValuesViewModel.Action.ShowLoader) {
                FilterValuesWidgetViewHolder.this.refs.getController().e(new l.a.C1079a(0L, null, 3));
                return;
            }
            if (action instanceof FilterValuesViewModel.Action.HideLoader) {
                FilterValuesWidgetViewHolder.this.refs.getController().hideLoader();
                return;
            }
            if (action instanceof FilterValuesViewModel.Action.SwitchButtonState) {
                FilterValuesVO filterValuesVO = FilterValuesWidgetViewHolder.this.currentModel;
                if (filterValuesVO == null || (applyButton = filterValuesVO.getApplyButton()) == null) {
                    return;
                }
                FilterValuesWidgetViewHolder filterValuesWidgetViewHolder = FilterValuesWidgetViewHolder.this;
                FilterValuesViewModel.Action.SwitchButtonState switchButtonState = (FilterValuesViewModel.Action.SwitchButtonState) action;
                filterValuesWidgetViewHolder.buttonHolder.bindOrGone(filterValuesWidgetViewHolder.actionHandler, ButtonV3Atom.LargeButton.copy$default(applyButton, null, null, null, null, null, switchButtonState.getIsEnabled() ? applyButton.getAction() : null, null, null, null, 479, null), switchButtonState.getIsEnabled(), filterValuesWidgetViewHolder.isSelect());
                return;
            }
            if (action instanceof FilterValuesViewModel.Action.TrackCurrencyAction) {
                Map<String, TokenizedTrackingInfo> trackingInfo = ((FilterValuesViewModel.Action.TrackCurrencyAction) action).getAction().getTrackingInfo();
                if (trackingInfo != null) {
                    FilterValuesVO filterValuesVO2 = FilterValuesWidgetViewHolder.this.currentModel;
                    t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, filterValuesVO2 != null ? Long.valueOf(filterValuesVO2.getId()) : null, null, 2, null);
                    if (mapToTokenizedEvent$default != null) {
                        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(FilterValuesWidgetViewHolder.this.refs.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(action instanceof FilterValuesViewModel.Action.TrackChangeLocaleAction)) {
                throw new o();
            }
            Map<String, TokenizedTrackingInfo> trackingInfo2 = ((FilterValuesViewModel.Action.TrackChangeLocaleAction) action).getAction().getTrackingInfo();
            if (trackingInfo2 != null) {
                FilterValuesVO filterValuesVO3 = FilterValuesWidgetViewHolder.this.currentModel;
                t mapToTokenizedEvent$default2 = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, filterValuesVO3 != null ? Long.valueOf(filterValuesVO3.getId()) : null, null, 2, null);
                if (mapToTokenizedEvent$default2 != null) {
                    TokenizedAnalyticsExtensionsKt.processClickEvents$default(FilterValuesWidgetViewHolder.this.tokenizedAnalytics, mapToTokenizedEvent$default2, null, 2, null);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesWidgetViewHolder$Companion;", "", "<init>", "()V", "LANGUAGE_SELECTOR", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ FilterValuesWidgetViewHolder(i iVar, ComposerReferences composerReferences, ViewGroup viewGroup, FilterValuesViewModel filterValuesViewModel, FilterSharedViewModel filterSharedViewModel, ApplyFiltersAnalyticDelegate applyFiltersAnalyticDelegate, WZ.l lVar, AppType appType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, composerReferences, viewGroup, filterValuesViewModel, filterSharedViewModel, (i11 & 32) != 0 ? new ApplyFiltersAnalyticDelegate() : applyFiltersAnalyticDelegate, lVar, appType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIslandSeparator() {
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(this.containerView);
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.post(new f(0, composerCoordinatorLayout, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addIslandSeparator$lambda$7$lambda$6(CoordinatorLayout coordinatorLayout, FilterValuesWidgetViewHolder filterValuesWidgetViewHolder) {
        if (coordinatorLayout.findViewWithTag("filters_island_separator") != null) {
            return;
        }
        int dp = ResourceExtKt.toDp(filterValuesWidgetViewHolder.dp8) + 40;
        Context context = coordinatorLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FiltersIslandSeparatorView filtersIslandSeparatorView = new FiltersIslandSeparatorView(context, null, 0, 6, null);
        filtersIslandSeparatorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        filtersIslandSeparatorView.setElevation(1.0f);
        filtersIslandSeparatorView.setOutlineProvider(null);
        int dp2 = (ResourceExtKt.toDp(filterValuesWidgetViewHolder.getView().getHeight()) + dp) - 1;
        int i11 = dp2 < dp ? dp : dp2;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = filtersIslandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        UniColors uniColors = UniColors.LAYER_FLOOR_0;
        filtersIslandSeparatorView.setViewState(new FiltersIslandSeparatorView.ViewState(false, true, i11, styleParser.parseColor(context2, uniColors.getToken(), uniColors.getResId()), 0));
        coordinatorLayout.addView(filtersIslandSeparatorView);
    }

    private final void appendSearchView(ViewGroup viewGroup) {
        LinearLayout composerTopContainer = ComposerViewExtensionKt.composerTopContainer(viewGroup);
        ViewExtKt.show(composerTopContainer);
        this.topContainerBgDrawable = composerTopContainer.getBackground();
        composerTopContainer.setClickable(true);
        Context context = composerTopContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        composerTopContainer.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        composerTopContainer.addView(getView());
        SearchView searchView = (SearchView) getView().findViewById(getSearchBarView());
        if (searchView != null) {
            searchView.o(new TextQueryListener() { // from class: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesWidgetViewHolder$appendSearchView$1$1
                @Override // ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.TextQueryListener, androidx.appcompat.widget.SearchView.l
                public boolean onQueryTextChange(String newText) {
                    FilterValuesViewModel filterValuesViewModel;
                    if (newText != null) {
                        filterValuesViewModel = FilterValuesWidgetViewHolder.this.viewModel;
                        filterValuesViewModel.onTextChanged(newText);
                    }
                    return super.onQueryTextChange(newText);
                }
            });
        }
    }

    private final void bindSearchBar(SearchView searchView, FilterValuesDTO.SearchBar searchBar) {
        if (searchBar == null) {
            ViewExtKt.gone(searchView);
        } else {
            searchView.q(searchBar.getHint());
            ViewExtKt.show(searchView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkNeedToHideKeyboard(AtomAction.Click click) {
        if (Intrinsics.d(click.getId(), "toggleActiveValue") || Intrinsics.d(click.getId(), "headerExpand")) {
            KeyboardUtilsKt.hideKeyboard(this.containerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBottomInset(int bottomPadding) {
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            return bottomPadding;
        }
        int px = bottomPadding - ResourceExtKt.toPx(12);
        if (px < 0) {
            return 0;
        }
        return px;
    }

    private final int getSearchBarView() {
        return ((Number) this.searchBarView.getValue()).intValue();
    }

    private final View getView() {
        return (View) this.view.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLanguageSelector() {
        String str = this.deeplink;
        return str != null && h.t(str, "languageSelector", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSelect() {
        return ((Boolean) this.isSelect.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSelectFilterValues() {
        String str;
        return isSelect() && (str = this.deeplink) != null && h.t(str, "/modal/filterValues", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.refs.getContainer().g(), 62, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorAndClose() {
        r a11 = this.refs.getContainer().a();
        if (a11 != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            ViewGroup rootView = ContextExtKt.getRootView(a11);
            if (rootView == null) {
                return;
            } else {
                FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, a11, 62, null).show();
            }
        }
        this.refs.getNavigator().popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackApplyFilters(FilterValuesViewModel.Action.TrackComposerAction trackAction) {
        ApplyFiltersAnalyticDelegate applyFiltersAnalyticDelegate = this.applyFiltersAnalyticDelegate;
        ComposerReferences composerReferences = this.refs;
        AtomAction.ComposerAction action = trackAction.getAction();
        List<String> selectedIds = trackAction.getSelectedIds();
        FilterValuesVO filterValuesVO = this.currentModel;
        if (filterValuesVO != null) {
            applyFiltersAnalyticDelegate.send(composerReferences, action, selectedIds, filterValuesVO.getId());
        }
    }

    public final void createView() {
        ViewExtKt.show(ComposerViewExtensionKt.composerBottomContainer(this.containerView));
        this.buttonHolder.appendButton(ComposerViewExtensionKt.composerBottomContainer(this.containerView));
        appendSearchView(this.containerView);
        RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(this.containerView);
        composerRecyclerView.setAdapter(this.mAdapter);
        composerRecyclerView.setLayoutManager(this.mLayoutManager);
        composerRecyclerView.setOverScrollMode(2);
        composerRecyclerView.setMotionEventSplittingEnabled(false);
        RecyclerView.l itemAnimator = composerRecyclerView.getItemAnimator();
        C c11 = itemAnimator instanceof C ? (C) itemAnimator : null;
        if (c11 != null) {
            c11.setSupportsChangeAnimations(false);
        }
        composerRecyclerView.addItemDecoration(new FilterValuesStickyHeaderItemDecorator(composerRecyclerView, false, new FilterValuesWidgetViewHolder$createView$1$1(composerRecyclerView, this), new FilterValuesWidgetViewHolder$createView$1$2(composerRecyclerView), ComposerViewExtensionKt.composerTopContainer(this.containerView), isSelectFilterValues(), 2, null));
        composerRecyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesWidgetViewHolder$createView$1$3
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 1) {
                    KeyboardUtilsKt.hideKeyboard(FilterValuesWidgetViewHolder.this.containerView);
                }
            }
        });
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return getView();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FilterValuesVO item) {
        FilterValuesVO model;
        Intrinsics.checkNotNullParameter(item, "item");
        if (!isLanguageSelector() && (model = this.viewModel.getModel()) != null) {
            item = model;
        }
        this.currentModel = item;
        if (!isLanguageSelector() ? this.viewModel.getModel() == null : !(Intrinsics.d(this.viewModel.getModel(), item) && this.hasSubmittedList)) {
            this.viewModel.getViewModelAction().setValue(new FilterValuesViewModel.Action.SwitchButtonState(this.viewModel.getLastButtonEnableState$filter_widgets_prodGoogleAllVendorsRelease()));
        } else {
            this.viewModel.setModel$filter_widgets_prodGoogleAllVendorsRelease(item, this.container.J().r().b().m().c());
        }
        SearchView searchView = (SearchView) ComposerViewExtensionKt.composerTopContainer(this.containerView).findViewById(getSearchBarView());
        if (searchView != null) {
            bindSearchBar(searchView, item.getSearchBar());
            searchView.p(this.viewModel.getSearchTextSubject$filter_widgets_prodGoogleAllVendorsRelease().f(), false);
        }
    }

    public FilterValuesWidgetViewHolder(@NotNull i container, @NotNull ComposerReferences refs, @NotNull ViewGroup containerView, @NotNull FilterValuesViewModel viewModel, @NotNull FilterSharedViewModel filterSharedViewModel, @NotNull ApplyFiltersAnalyticDelegate applyFiltersAnalyticDelegate, @NotNull WZ.l tokenizedAnalytics, @NotNull AppType appType) {
        String tag;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(filterSharedViewModel, "filterSharedViewModel");
        Intrinsics.checkNotNullParameter(applyFiltersAnalyticDelegate, "applyFiltersAnalyticDelegate");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.container = container;
        this.refs = refs;
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.filterSharedViewModel = filterSharedViewModel;
        this.applyFiltersAnalyticDelegate = applyFiltersAnalyticDelegate;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isSelect = k.b(new FilterValuesWidgetViewHolder$isSelect$2(appType));
        this.buttonHolder = new FilterButtonHolder();
        ComponentCallbacksC5392m c11 = container.Q().c();
        this.deeplink = (c11 == null || (tag = c11.getTag()) == null) ? null : PZ.a.b(tag, false);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).onClick(new FilterValuesWidgetViewHolder$actionHandler$1(this)).customAnalyticHandler(FilterValuesWidgetViewHolder$actionHandler$2.INSTANCE).onComposerAction(new FilterValuesWidgetViewHolder$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.mAdapter = new FilterValuesAdapter(buildHandler, isSelectFilterValues());
        this.mLayoutManager = new LinearLayoutManager(containerView.getContext());
        this.dp32 = ResourceExtKt.toPx(32);
        this.dp8 = ResourceExtKt.toPx(8);
        this.view = k.b(new FilterValuesWidgetViewHolder$view$2(this));
        this.searchBarView = k.b(new FilterValuesWidgetViewHolder$searchBarView$2(this));
        viewModel.getList().observe(refs.getContainer().g(), new FilterValuesWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        viewModel.getViewModelAction().observe(refs.getContainer().g(), new FilterValuesWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }
}
