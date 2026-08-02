package ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter;

import FK.a;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.filters.common.ExtKt;
import ru.ozon.app.android.common.filterWidgets.filters.common.Utils;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.TagVerticalDecoration;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.tags.TagsAdapter;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.domain.flags.HorizontalScrollFilterValueEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersTagFilterBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
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

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 =2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001=B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ#\u0010#\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!H\u0014¢\u0006\u0004\b#\u0010$J3\u0010+\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&2\u000e\u0010*\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0012018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010;\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTagFilterBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "customRefreshHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTagFilterBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "bindTitle", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "bindIcon", "(Lru/ozon/uni/atoms/data/button/Icon;)V", "item", "bindRightBtn", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;)V", "bindRecyclerView", "showRightButton", "()V", "titleClick", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersTagFilterBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/TagsAdapter;", "tagsAdapter", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/tags/TagsAdapter;", "", "isMultiLineList$delegate", "LSc/j;", "isMultiLineList", "()Z", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagFilterViewHolder extends k<TagFilterVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int tagsWithoutTitleTopMargin = ResourceExtKt.toPx(8);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetFiltersTagFilterBinding binding;

    @NotNull
    private final CustomRefreshHandler customRefreshHandler;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: isMultiLineList$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isMultiLineList;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TagsAdapter tagsAdapter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/tagfilter/TagFilterViewHolder$Companion;", "", "<init>", "()V", "", "DEFAULT_TAGS_COUNT", "I", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public TagFilterViewHolder(@NotNull WidgetFiltersTagFilterBinding binding, @NotNull ComposerReferences refs, @NotNull CustomRefreshHandler customRefreshHandler, @NotNull FeatureChecker featureChecker, @NotNull HandlersInhibitor inhibitor) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.customRefreshHandler = customRefreshHandler;
        this.featureChecker = featureChecker;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).buildHandler();
        TagsAdapter tagsAdapter = new TagsAdapter(customRefreshHandler);
        this.tagsAdapter = tagsAdapter;
        this.isMultiLineList = Sc.k.b(new TagFilterViewHolder$isMultiLineList$2(this));
        binding.titleTv.setOnClickListener(new a(this, 5));
        binding.iconIv.setOnClickListener(new AS.a(this, 6));
        RecyclerView recyclerView = binding.tagsRv;
        recyclerView.setAdapter(tagsAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new TagVerticalDecoration());
    }

    private final void bindIcon(Icon icon) {
        ImageView imageView = this.binding.iconIv;
        Intrinsics.f(imageView);
        ImageViewExtKt.loadImageOrGone(imageView, icon != null ? icon.getImage() : null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, icon != null ? icon.getTintColor() : null));
    }

    private final void bindRecyclerView(TagFilterVO item) {
        boolean z11 = this.featureChecker.isEnabled(HorizontalScrollFilterValueEnabledFlag.INSTANCE) || item.getScrollEnabled();
        RecyclerView recyclerView = this.binding.tagsRv;
        recyclerView.setClipToPadding(!z11);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RecyclerView.o updateLayoutManagerIfNecessary = ExtKt.updateLayoutManagerIfNecessary(layoutManager, z11, item.getMaxRowsCount(), context, new TagFilterViewHolder$bindRecyclerView$1$1(this));
        if (updateLayoutManagerIfNecessary != null) {
            recyclerView.setLayoutManager(updateLayoutManagerIfNecessary);
        }
        if (isMultiLineList()) {
            Integer totalValuesCount = item.getTotalValuesCount();
            int intValue = totalValuesCount != null ? totalValuesCount.intValue() : 0;
            SingleAtom rightBtn = this.binding.rightBtn;
            Intrinsics.checkNotNullExpressionValue(rightBtn, "rightBtn");
            rightBtn.setVisibility(item.getTags().size() >= intValue ? 4 : 0);
        }
    }

    private final void bindRightBtn(TagFilterVO item) {
        WidgetFiltersTagFilterBinding widgetFiltersTagFilterBinding = this.binding;
        SingleAtom rightBtn = widgetFiltersTagFilterBinding.rightBtn;
        Intrinsics.checkNotNullExpressionValue(rightBtn, "rightBtn");
        AtomDTO rightIcon = item.getRightIcon();
        if (rightIcon == null) {
            rightIcon = item.getRightButton();
        }
        ContainerExtKt.bindOrGone$default(rightBtn, rightIcon, false, 2, null);
        Unit unit = Unit.f71690a;
        Utils utils = Utils.INSTANCE;
        View clickableArea = widgetFiltersTagFilterBinding.clickableArea;
        Intrinsics.checkNotNullExpressionValue(clickableArea, "clickableArea");
        SingleAtom rightBtn2 = widgetFiltersTagFilterBinding.rightBtn;
        Intrinsics.checkNotNullExpressionValue(rightBtn2, "rightBtn");
        utils.setClickableZones(clickableArea, rightBtn2, item.getRightIcon(), this.actionHandler, new TagFilterViewHolder$bindRightBtn$1$1$1(this));
    }

    private final void bindTitle(String title) {
        WidgetFiltersTagFilterBinding widgetFiltersTagFilterBinding = this.binding;
        AppCompatTextView titleTv = widgetFiltersTagFilterBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, title);
        View clickableArea = widgetFiltersTagFilterBinding.clickableArea;
        Intrinsics.checkNotNullExpressionValue(clickableArea, "clickableArea");
        ViewExtKt.showOrGoneByPresence(clickableArea, title);
        View clickableArea2 = widgetFiltersTagFilterBinding.clickableArea;
        Intrinsics.checkNotNullExpressionValue(clickableArea2, "clickableArea");
        int i11 = clickableArea2.getVisibility() == 0 ? 0 : tagsWithoutTitleTopMargin;
        RecyclerView tagsRv = widgetFiltersTagFilterBinding.tagsRv;
        Intrinsics.checkNotNullExpressionValue(tagsRv, "tagsRv");
        ViewGroup.LayoutParams layoutParams = tagsRv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i11;
        tagsRv.setLayoutParams(marginLayoutParams);
    }

    private final boolean isMultiLineList() {
        return ((Boolean) this.isMultiLineList.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRightButton() {
        if (isMultiLineList()) {
            SingleAtom rightBtn = this.binding.rightBtn;
            Intrinsics.checkNotNullExpressionValue(rightBtn, "rightBtn");
            rightBtn.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void titleClick() {
        AtomAction atomAction;
        TagFilterVO boundData = getBoundData();
        if (boundData != null) {
            AtomActionDTO action = boundData.getAction();
            if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, boundData.getTrackingInfo())) != null) {
                this.actionHandler.invoke(atomAction);
            }
            t tokenizedEvent = boundData.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0061, code lost:
    
        if ((r7.getTitle() != null) != false) goto L11;
     */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull TagFilterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetFiltersTagFilterBinding widgetFiltersTagFilterBinding = this.binding;
        bindRightBtn(item);
        bindRecyclerView(item);
        this.customRefreshHandler.bind(item.getOriginalUrl(), Long.valueOf(item.getId()), this.actionHandler, item.getScrollWidgetKey(), new TagFilterViewHolder$bind$1$1(widgetFiltersTagFilterBinding));
        View separator = widgetFiltersTagFilterBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(!item.getHideSeparator()));
        this.tagsAdapter.submitList(item.getTags());
        bindTitle(item.getTitle());
        Icon icon = item.getIcon();
        if (icon != null) {
        }
        icon = null;
        bindIcon(icon);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TagFilterVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TagFilterViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
