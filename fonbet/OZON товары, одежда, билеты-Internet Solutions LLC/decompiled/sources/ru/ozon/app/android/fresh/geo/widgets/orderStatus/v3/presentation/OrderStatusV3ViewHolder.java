package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.geo.databinding.WidgetOrderStatusV3Binding;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b.\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3ViewModel;", "viewModel", "Lru/ozon/app/android/fresh/geo/databinding/WidgetOrderStatusV3Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3ViewModel;Lru/ozon/app/android/fresh/geo/databinding/WidgetOrderStatusV3Binding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "", "bindData", "(Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO;)V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "bindProgressIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "bindProgressText", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "color", "setRingProgressColor", "(Ljava/lang/String;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetachViewModel", "Lru/ozon/app/android/fresh/geo/widgets/orderStatus/v3/presentation/OrderStatusV3ViewModel;", "Lru/ozon/app/android/fresh/geo/databinding/WidgetOrderStatusV3Binding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderStatusV3ViewHolder extends k<OrderStatusV3VO> {

    @NotNull
    private final WidgetOrderStatusV3Binding binding;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final OrderStatusV3ViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderStatusV3ViewHolder(@NotNull OrderStatusV3ViewModel viewModel, @NotNull WidgetOrderStatusV3Binding binding, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.viewModel = viewModel;
        this.binding = binding;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindData(OrderStatusV3VO item) {
        setRingProgressColor(item.getRingProgressColor());
        WidgetOrderStatusV3Binding widgetOrderStatusV3Binding = this.binding;
        widgetOrderStatusV3Binding.circleProgressIndicator.setProgress(item.getProgress());
        TextAtomV2View titleTextTv = widgetOrderStatusV3Binding.titleTextTv;
        Intrinsics.checkNotNullExpressionValue(titleTextTv, "titleTextTv");
        TextHolderKt.bindOrGone$default(titleTextTv, item.getTitle(), null, 2, null);
        widgetOrderStatusV3Binding.titleTextTv.setTextIsSelectable(false);
        TextAtomV2View subtitleTextTvTv = widgetOrderStatusV3Binding.subtitleTextTvTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTextTvTv, "subtitleTextTvTv");
        TextHolderKt.bindOrGone$default(subtitleTextTvTv, item.getSubtitle(), null, 2, null);
        widgetOrderStatusV3Binding.subtitleTextTvTv.setTextIsSelectable(false);
        OrderStatusV3VO.ProgressType progressType = item.getProgressType();
        if (progressType instanceof OrderStatusV3VO.ProgressType.ProgressIcon) {
            bindProgressIcon(((OrderStatusV3VO.ProgressType.ProgressIcon) item.getProgressType()).getIcon());
        } else {
            if (!(progressType instanceof OrderStatusV3VO.ProgressType.ProgressText)) {
                throw new o();
            }
            bindProgressText(((OrderStatusV3VO.ProgressType.ProgressText) item.getProgressType()).getTitle(), ((OrderStatusV3VO.ProgressType.ProgressText) item.getProgressType()).getSubtitle());
        }
    }

    private final void bindProgressIcon(IconDTO icon) {
        WidgetOrderStatusV3Binding widgetOrderStatusV3Binding = this.binding;
        TextAtomV2View minTitle = widgetOrderStatusV3Binding.minTitle;
        Intrinsics.checkNotNullExpressionValue(minTitle, "minTitle");
        ViewExtKt.gone(minTitle);
        TextAtomV2View minSubtitle = widgetOrderStatusV3Binding.minSubtitle;
        Intrinsics.checkNotNullExpressionValue(minSubtitle, "minSubtitle");
        ViewExtKt.gone(minSubtitle);
        IconView progressIcon = widgetOrderStatusV3Binding.progressIcon;
        Intrinsics.checkNotNullExpressionValue(progressIcon, "progressIcon");
        IconHolderKt.bindOrGone$default(progressIcon, icon, null, 2, null);
    }

    private final void bindProgressText(TextDTO title, TextDTO subtitle) {
        WidgetOrderStatusV3Binding widgetOrderStatusV3Binding = this.binding;
        IconView progressIcon = widgetOrderStatusV3Binding.progressIcon;
        Intrinsics.checkNotNullExpressionValue(progressIcon, "progressIcon");
        ViewExtKt.gone(progressIcon);
        TextAtomV2View minTitle = widgetOrderStatusV3Binding.minTitle;
        Intrinsics.checkNotNullExpressionValue(minTitle, "minTitle");
        TextHolderKt.bindOrGone$default(minTitle, title, null, 2, null);
        widgetOrderStatusV3Binding.minTitle.setTextIsSelectable(false);
        TextAtomV2View minSubtitle = widgetOrderStatusV3Binding.minSubtitle;
        Intrinsics.checkNotNullExpressionValue(minSubtitle, "minSubtitle");
        TextHolderKt.bindOrGone$default(minSubtitle, subtitle, null, 2, null);
        widgetOrderStatusV3Binding.minSubtitle.setTextIsSelectable(false);
    }

    private final void setRingProgressColor(String color) {
        this.binding.circleProgressIndicator.setRingProgressColor(StyleParser.INSTANCE.parseColor(getContext(), color, UniColors.GRAPHIC_FRESH.getResId()));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.viewModel.timerStart();
        this.viewModel.getWidgetState().observe(this.references.getContainer().f(), new OrderStatusV3ViewHolder$sam$androidx_lifecycle_Observer$0(new OrderStatusV3ViewHolder$onAttachViewModel$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onDetachViewModel(lifecycle);
        this.viewModel.timerStop();
        this.viewModel.getWidgetState().removeObservers(this.references.getContainer().f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderStatusV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.setAsyncDataCache(info);
        bindData(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderStatusV3VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((OrderStatusV3ViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
