package ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
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
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.BrandAspectsVO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.rv.BrandAspectAdapter;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.rv.BrandAspectDecorator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterBrandAspectsBinding;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterHeaderUniversalRightBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 :2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001:B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0014J)\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00108\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "customRefreshHandler", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterBrandAspectsBinding;", "contentBinding", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterHeaderUniversalRightBinding;", "headerBinging", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterBrandAspectsBinding;Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterHeaderUniversalRightBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindHeader", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO;)V", "bindContent", "showRightButton", "()V", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO$AspectBrand;", "aspect", "trackAspectClick", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO$AspectBrand;)V", "onTitleClick", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO;Ll20/d;)V", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterBrandAspectsBinding;", "getContentBinding", "()Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterBrandAspectsBinding;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterHeaderUniversalRightBinding;", "getHeaderBinging", "()Lru/ozon/app/android/storefront/filterWidgets/databinding/FilterHeaderUniversalRightBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "getReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/rv/BrandAspectAdapter;", "brandAspectAdapter", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/rv/BrandAspectAdapter;", "", "isMultiLineList$delegate", "LSc/j;", "isMultiLineList", "()Z", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandAspectsViewHolder extends k<BrandAspectsVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BrandAspectAdapter brandAspectAdapter;

    @NotNull
    private final FilterBrandAspectsBinding contentBinding;

    @NotNull
    private final CustomRefreshHandler customRefreshHandler;

    @NotNull
    private final FilterHeaderUniversalRightBinding headerBinging;

    /* renamed from: isMultiLineList$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isMultiLineList;

    @NotNull
    private final ComposerReferences references;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsViewHolder$Companion;", "", "<init>", "()V", "DEFAULT_ASPECTS_COUNT", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public BrandAspectsViewHolder(@NotNull CustomRefreshHandler customRefreshHandler, @NotNull FilterBrandAspectsBinding contentBinding, @NotNull FilterHeaderUniversalRightBinding headerBinging, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(contentBinding, "contentBinding");
        Intrinsics.checkNotNullParameter(headerBinging, "headerBinging");
        Intrinsics.checkNotNullParameter(references, "references");
        LinearLayout constraintLayout = contentBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.customRefreshHandler = customRefreshHandler;
        this.contentBinding = contentBinding;
        this.headerBinging = headerBinging;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        BrandAspectAdapter brandAspectAdapter = new BrandAspectAdapter(customRefreshHandler, new BrandAspectsViewHolder$brandAspectAdapter$1(this), this);
        this.brandAspectAdapter = brandAspectAdapter;
        this.isMultiLineList = Sc.k.b(new BrandAspectsViewHolder$isMultiLineList$2(this));
        RecyclerView recyclerView = contentBinding.aspectsRv;
        recyclerView.setAdapter(brandAspectAdapter);
        recyclerView.addItemDecoration(new BrandAspectDecorator());
    }

    private final void bindContent(BrandAspectsVO item) {
        FilterBrandAspectsBinding filterBrandAspectsBinding = this.contentBinding;
        View separator = filterBrandAspectsBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(item.getShowSeparator()));
        RecyclerView.o updateLayoutManagerIfNecessary = ExtKt.updateLayoutManagerIfNecessary(filterBrandAspectsBinding.aspectsRv.getLayoutManager(), item.getScrollEnabled(), item.getMaxRowsCount(), getContext(), new BrandAspectsViewHolder$bindContent$1$1(this));
        if (updateLayoutManagerIfNecessary != null) {
            filterBrandAspectsBinding.aspectsRv.setLayoutManager(updateLayoutManagerIfNecessary);
        }
        if (isMultiLineList()) {
            Integer totalValuesCount = item.getTotalValuesCount();
            int intValue = totalValuesCount != null ? totalValuesCount.intValue() : 0;
            SingleAtom rightAtomContainer = this.headerBinging.rightAtomContainer;
            Intrinsics.checkNotNullExpressionValue(rightAtomContainer, "rightAtomContainer");
            rightAtomContainer.setVisibility(item.getAspects().size() >= intValue ? 4 : 0);
        }
        this.brandAspectAdapter.submitList(item.getAspects());
    }

    private final void bindHeader(BrandAspectsVO item) {
        FilterHeaderUniversalRightBinding filterHeaderUniversalRightBinding = this.headerBinging;
        String title = item.getTitle();
        if (title != null) {
            filterHeaderUniversalRightBinding.headerTv.setText(title);
        }
        SingleAtom rightAtomContainer = filterHeaderUniversalRightBinding.rightAtomContainer;
        Intrinsics.checkNotNullExpressionValue(rightAtomContainer, "rightAtomContainer");
        AtomDTO rightIcon = item.getRightIcon();
        if (rightIcon == null) {
            rightIcon = item.getRightButton();
        }
        ContainerExtKt.bindOrGone$default(rightAtomContainer, rightIcon, false, 2, null);
        Unit unit = Unit.f71690a;
        Utils utils = Utils.INSTANCE;
        LinearLayout constraintLayout = filterHeaderUniversalRightBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        SingleAtom rightAtomContainer2 = filterHeaderUniversalRightBinding.rightAtomContainer;
        Intrinsics.checkNotNullExpressionValue(rightAtomContainer2, "rightAtomContainer");
        utils.setClickableZones(constraintLayout, rightAtomContainer2, item.getRightIcon(), this.actionHandler, new BrandAspectsViewHolder$bindHeader$1$2$1(this));
    }

    private final boolean isMultiLineList() {
        return ((Boolean) this.isMultiLineList.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTitleClick() {
        BrandAspectsVO boundData = getBoundData();
        if (boundData != null) {
            AtomAction action = boundData.getAction();
            if (action != null) {
                this.actionHandler.invoke(action);
            }
            t tokenizedEvent = boundData.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRightButton() {
        if (isMultiLineList()) {
            SingleAtom rightAtomContainer = this.headerBinging.rightAtomContainer;
            Intrinsics.checkNotNullExpressionValue(rightAtomContainer, "rightAtomContainer");
            rightAtomContainer.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAspectClick(BrandAspectsVO.AspectBrand aspect) {
        t tokenizedEvent = aspect.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    @NotNull
    public final FilterBrandAspectsBinding getContentBinding() {
        return this.contentBinding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BrandAspectsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.customRefreshHandler.bind(item.getOriginalUrl(), Long.valueOf(item.getId()), this.actionHandler, item.getScrollWidgetKey(), new BrandAspectsViewHolder$bind$1(this));
        bindHeader(item);
        bindContent(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BrandAspectsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((BrandAspectsViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
