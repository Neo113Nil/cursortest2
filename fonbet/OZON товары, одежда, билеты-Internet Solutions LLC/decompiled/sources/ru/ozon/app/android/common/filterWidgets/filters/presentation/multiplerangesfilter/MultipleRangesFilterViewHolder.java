package ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter;

import Ez.ViewOnClickListenerC2978b;
import Ez.ViewOnClickListenerC2979c;
import FM.a;
import Sc.InterfaceC4008j;
import U7.d;
import W10.c;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityActionHolder;
import ru.ozon.app.android.common.filterWidgets.filters.common.ExtKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.RangeFilterComposerActionHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter.RangeFilterVO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.TagFilterVO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.TagVerticalDecoration;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.TagsAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.flags.HorizontalScrollFilterValueEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.core.atoms.data.RangeFilter;
import ru.ozon.app.android.storefront.core.atoms.holders.rangefilter.RangeFilterHolderKt;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersRangeFilterBinding;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTagFilterBinding;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetMultipleRangesFilterBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 N2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001NBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010 J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0018H\u0002¢\u0006\u0004\b-\u0010 J#\u00102\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00022\n\u00101\u001a\u00060/j\u0002`0H\u0014¢\u0006\u0004\b2\u00103J3\u0010:\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00022\n\u00106\u001a\u000604j\u0002`52\u000e\u00109\u001a\n\u0018\u000107j\u0004\u0018\u0001`8H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00180D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010M\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010,¨\u0006O"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesFilterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetMultipleRangesFilterBinding;", "widgetBinding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTagFilterBinding;", "tagsBinding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersRangeFilterBinding;", "rangeBinding", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "customRefreshHandler", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/RangeFilterComposerActionHandler;", "composerActionHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;", "delayedActionHolder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetMultipleRangesFilterBinding;Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTagFilterBinding;Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersRangeFilterBinding;Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;Lru/ozon/app/android/common/filterWidgets/filters/presentation/RangeFilterComposerActionHandler;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;", "rangeItem", "", "bindRangeFilter", "(Lru/ozon/app/android/storefront/core/atoms/data/RangeFilter;)V", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;", "tagItem", "bindTagFilter", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;)V", "showRightButton", "()V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "bindIcon", "(Lru/ozon/uni/atoms/data/button/Icon;)V", "titleClick", "", "isNeedToDelayAction", "()Z", "observerKeyboard", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesFilterVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesFilterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetMultipleRangesFilterBinding;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTagFilterBinding;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersRangeFilterBinding;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/RangeFilterComposerActionHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/filterWidgets/common/KeyboardVisibilityActionHolder;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/TagsAdapter;", "tagsAdapter", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/TagsAdapter;", "isMultiLineList$delegate", "LSc/j;", "isMultiLineList", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MultipleRangesFilterViewHolder extends k<MultipleRangesFilterVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RangeFilterComposerActionHandler composerActionHandler;

    @NotNull
    private final CustomRefreshHandler customRefreshHandler;

    @NotNull
    private final KeyboardVisibilityActionHolder delayedActionHolder;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: isMultiLineList$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isMultiLineList;

    @NotNull
    private final WidgetFiltersRangeFilterBinding rangeBinding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TagsAdapter tagsAdapter;

    @NotNull
    private final WidgetFiltersTagFilterBinding tagsBinding;

    @NotNull
    private final WidgetMultipleRangesFilterBinding widgetBinding;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/multiplerangesfilter/MultipleRangesFilterViewHolder$Companion;", "", "<init>", "()V", "DEFAULT_TAGS_COUNT", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultipleRangesFilterViewHolder(@NotNull WidgetMultipleRangesFilterBinding widgetBinding, @NotNull WidgetFiltersTagFilterBinding tagsBinding, @NotNull WidgetFiltersRangeFilterBinding rangeBinding, @NotNull CustomRefreshHandler customRefreshHandler, @NotNull RangeFilterComposerActionHandler composerActionHandler, @NotNull ComposerReferences refs, @NotNull KeyboardVisibilityActionHolder delayedActionHolder, @NotNull FeatureChecker featureChecker) {
        super(r0);
        Intrinsics.checkNotNullParameter(widgetBinding, "widgetBinding");
        Intrinsics.checkNotNullParameter(tagsBinding, "tagsBinding");
        Intrinsics.checkNotNullParameter(rangeBinding, "rangeBinding");
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(composerActionHandler, "composerActionHandler");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(delayedActionHolder, "delayedActionHolder");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        ConstraintLayout constraintLayout = widgetBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.widgetBinding = widgetBinding;
        this.tagsBinding = tagsBinding;
        this.rangeBinding = rangeBinding;
        this.customRefreshHandler = customRefreshHandler;
        this.composerActionHandler = composerActionHandler;
        this.refs = refs;
        this.delayedActionHolder = delayedActionHolder;
        this.featureChecker = featureChecker;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new MultipleRangesFilterViewHolder$actionHandler$1(this)).customAnalyticHandler(new MultipleRangesFilterViewHolder$actionHandler$2(this)).buildHandler();
        TagsAdapter tagsAdapter = new TagsAdapter(customRefreshHandler);
        this.tagsAdapter = tagsAdapter;
        this.isMultiLineList = Sc.k.b(new MultipleRangesFilterViewHolder$isMultiLineList$2(this));
        observerKeyboard();
        AppCompatTextView appCompatTextView = tagsBinding.titleTv;
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), 0);
        appCompatTextView.setOnClickListener(new ViewOnClickListenerC2979c(this, 2));
        tagsBinding.iconIv.setOnClickListener(new a(this, 1));
        RecyclerView recyclerView = tagsBinding.tagsRv;
        boolean isEnabled = featureChecker.isEnabled(HorizontalScrollFilterValueEnabledFlag.INSTANCE);
        recyclerView.setAdapter(tagsAdapter);
        recyclerView.setLayoutManager(isEnabled ? new LinearLayoutManager(recyclerView.getContext(), 0, false) : new FlexboxLayoutManager(recyclerView.getContext()));
        recyclerView.setClipToPadding(!isEnabled);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new TagVerticalDecoration());
    }

    private final void bindIcon(Icon icon) {
        ImageView imageView = this.tagsBinding.iconIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.loadImageOrGone(imageView, icon != null ? icon.getImage() : null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, icon != null ? icon.getTintColor() : null));
    }

    private final void bindRangeFilter(RangeFilter rangeItem) {
        WidgetFiltersRangeFilterBinding widgetFiltersRangeFilterBinding = this.rangeBinding;
        RangeFilterView rangeFilter = widgetFiltersRangeFilterBinding.rangeFilter;
        Intrinsics.checkNotNullExpressionValue(rangeFilter, "rangeFilter");
        RangeFilterHolderKt.bind(rangeFilter, rangeItem, this.actionHandler);
        View separator = widgetFiltersRangeFilterBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        MultipleRangesFilterVO boundedData = getBoundedData();
        ViewExtKt.showOrGone(separator, Boolean.valueOf((boundedData != null ? boundedData.getTagFilterVO() : null) == null));
    }

    private final void bindTagFilter(TagFilterVO tagItem) {
        WidgetFiltersTagFilterBinding widgetFiltersTagFilterBinding = this.tagsBinding;
        SingleAtom rightBtn = widgetFiltersTagFilterBinding.rightBtn;
        Intrinsics.checkNotNullExpressionValue(rightBtn, "rightBtn");
        AtomDTO rightIcon = tagItem.getRightIcon();
        if (rightIcon == null) {
            rightIcon = tagItem.getRightButton();
        }
        Icon icon = null;
        ContainerExtKt.bindOrGone$default(rightBtn, rightIcon, false, 2, null);
        widgetFiltersTagFilterBinding.rightBtn.setOnAction(this.actionHandler);
        if (tagItem.getRightIcon() != null) {
            widgetFiltersTagFilterBinding.clickableArea.setOnClickListener(null);
            widgetFiltersTagFilterBinding.rightBtn.setOnClickListener(new Nt.a(this, 1));
        } else {
            widgetFiltersTagFilterBinding.clickableArea.setOnClickListener(new ViewOnClickListenerC2978b(this, 3));
            widgetFiltersTagFilterBinding.rightBtn.setOnClickListener(null);
        }
        View separator = widgetFiltersTagFilterBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        boolean z11 = true;
        ViewExtKt.showOrGone(separator, Boolean.valueOf(!tagItem.getHideSeparator()));
        RecyclerView recyclerView = widgetFiltersTagFilterBinding.tagsRv;
        if (!this.featureChecker.isEnabled(HorizontalScrollFilterValueEnabledFlag.INSTANCE) && !tagItem.getScrollEnabled()) {
            z11 = false;
        }
        recyclerView.setClipToPadding(!z11);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RecyclerView.o updateLayoutManagerIfNecessary = ExtKt.updateLayoutManagerIfNecessary(layoutManager, z11, tagItem.getMaxRowsCount(), context, new MultipleRangesFilterViewHolder$bindTagFilter$1$3$1(this));
        if (updateLayoutManagerIfNecessary != null) {
            recyclerView.setLayoutManager(updateLayoutManagerIfNecessary);
        }
        this.tagsAdapter.submitList(tagItem.getTags());
        if (isMultiLineList()) {
            Integer totalValuesCount = tagItem.getTotalValuesCount();
            int intValue = totalValuesCount != null ? totalValuesCount.intValue() : 0;
            SingleAtom rightBtn2 = this.tagsBinding.rightBtn;
            Intrinsics.checkNotNullExpressionValue(rightBtn2, "rightBtn");
            rightBtn2.setVisibility(tagItem.getTags().size() >= intValue ? 4 : 0);
        }
        bindTitle(tagItem.getTitle());
        Icon icon2 = tagItem.getIcon();
        if (icon2 != null && tagItem.getTitle() != null) {
            icon = icon2;
        }
        bindIcon(icon);
    }

    private final void bindTitle(String title) {
        WidgetFiltersTagFilterBinding widgetFiltersTagFilterBinding = this.tagsBinding;
        AppCompatTextView titleTv = widgetFiltersTagFilterBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, title);
        View clickableArea = widgetFiltersTagFilterBinding.clickableArea;
        Intrinsics.checkNotNullExpressionValue(clickableArea, "clickableArea");
        ViewExtKt.showOrGoneByPresence(clickableArea, title);
    }

    private final boolean isMultiLineList() {
        return ((Boolean) this.isMultiLineList.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNeedToDelayAction() {
        return this.delayedActionHolder.isListenerRegistered() && this.delayedActionHolder.isKeyboardVisible(this.refs.getContainer().a());
    }

    private final void observerKeyboard() {
        d.c(this.refs).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter.MultipleRangesFilterViewHolder$observerKeyboard$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                KeyboardVisibilityActionHolder keyboardVisibilityActionHolder;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                keyboardVisibilityActionHolder = MultipleRangesFilterViewHolder.this.delayedActionHolder;
                composerReferences = MultipleRangesFilterViewHolder.this.refs;
                keyboardVisibilityActionHolder.unregister(composerReferences.getContainer().a());
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                KeyboardVisibilityActionHolder keyboardVisibilityActionHolder;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                keyboardVisibilityActionHolder = MultipleRangesFilterViewHolder.this.delayedActionHolder;
                composerReferences = MultipleRangesFilterViewHolder.this.refs;
                keyboardVisibilityActionHolder.register(composerReferences.getContainer().a(), new MultipleRangesFilterViewHolder$observerKeyboard$1$onResume$1(MultipleRangesFilterViewHolder.this));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRightButton() {
        if (isMultiLineList()) {
            SingleAtom rightBtn = this.tagsBinding.rightBtn;
            Intrinsics.checkNotNullExpressionValue(rightBtn, "rightBtn");
            rightBtn.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void titleClick() {
        TagFilterVO tagFilterVO;
        AtomAction atomAction;
        MultipleRangesFilterVO boundedData = getBoundedData();
        if (boundedData == null || (tagFilterVO = boundedData.getTagFilterVO()) == null) {
            return;
        }
        AtomActionDTO action = tagFilterVO.getAction();
        if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, tagFilterVO.getTrackingInfo())) != null) {
            this.actionHandler.invoke(atomAction);
        }
        t tokenizedEvent = tagFilterVO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MultipleRangesFilterVO item, @NotNull l20.d info) {
        RangeFilter rangeFilter;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CustomRefreshHandler customRefreshHandler = this.customRefreshHandler;
        TagFilterVO tagFilterVO = item.getTagFilterVO();
        customRefreshHandler.bind(tagFilterVO != null ? tagFilterVO.getOriginalUrl() : null, Long.valueOf(item.getId()), this.actionHandler, item.getScrollWidgetKey(), new MultipleRangesFilterViewHolder$bind$1(this));
        TagFilterVO tagFilterVO2 = item.getTagFilterVO();
        if (tagFilterVO2 != null) {
            bindTagFilter(tagFilterVO2);
        } else {
            ConstraintLayout constraintLayout = this.tagsBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(constraintLayout);
        }
        RangeFilterVO rangeFilterVO = item.getRangeFilterVO();
        if (rangeFilterVO == null || (rangeFilter = rangeFilterVO.getRangeFilter()) == null) {
            return;
        }
        bindRangeFilter(rangeFilter);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull MultipleRangesFilterVO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((MultipleRangesFilterViewHolder) item, trackingData, viewedPond);
        TagFilterVO tagFilterVO = item.getTagFilterVO();
        if (tagFilterVO == null || (tokenizedEvent = tagFilterVO.getTokenizedEvent()) == null) {
            return;
        }
        m.c(this.refs.getTokenizedAnalytics(), tokenizedEvent, null);
    }
}
