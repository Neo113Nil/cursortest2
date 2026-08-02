package ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter;

import W10.c;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.filterWidgets.filters.common.Utils;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.ColorsFilterAdapterDelegate;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.ColorDecoration;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersColorFilterBinding;
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

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 5*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005:\u00015B5\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00042\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0014¢\u0006\u0004\b!\u0010\"J3\u0010)\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00042\n\u0010%\u001a\u00060#j\u0002`$2\u000e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00140/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterViewHolder;", "Landroidx/recyclerview/widget/t;", "T", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersColorFilterBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "customRefreshHandler", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorsFilterAdapterDelegate;", "adapterDelegate", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersColorFilterBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorsFilterAdapterDelegate;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "bindTitle", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "bindIcon", "(Lru/ozon/uni/atoms/data/button/Icon;)V", "onTitleClick", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/filterWidgets/databinding/WidgetFiltersColorFilterBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorsFilterAdapterDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "colorsAdapter", "Landroidx/recyclerview/widget/t;", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ColorFilterViewHolder<T extends t<?, ?>> extends k<ColorFilterVO> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float marginHorizontal = ResourceExtKt.toPxF(16);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ColorsFilterAdapterDelegate<T> adapterDelegate;

    @NotNull
    private final WidgetFiltersColorFilterBinding binding;

    @NotNull
    private final T colorsAdapter;

    @NotNull
    private final CustomRefreshHandler customRefreshHandler;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/colorfilter/ColorFilterViewHolder$Companion;", "", "<init>", "()V", "marginHorizontal", "", "getMarginHorizontal", "()F", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getMarginHorizontal() {
            return ColorFilterViewHolder.marginHorizontal;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ColorFilterViewHolder(@NotNull WidgetFiltersColorFilterBinding binding, @NotNull ComposerReferences refs, @NotNull CustomRefreshHandler customRefreshHandler, @NotNull ColorsFilterAdapterDelegate<T> adapterDelegate, @NotNull HandlersInhibitor inhibitor) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customRefreshHandler, "customRefreshHandler");
        Intrinsics.checkNotNullParameter(adapterDelegate, "adapterDelegate");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.customRefreshHandler = customRefreshHandler;
        this.adapterDelegate = adapterDelegate;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).buildHandler();
        T provideAdapter = adapterDelegate.provideAdapter();
        this.colorsAdapter = provideAdapter;
        RecyclerView recyclerView = binding.colorsRv;
        recyclerView.setAdapter(provideAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(ColorsFilterAdapterDelegate.DefaultImpls.provideLayoutManager$default(adapterDelegate, false, 1, null));
        recyclerView.addItemDecoration(new ColorDecoration());
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

    private final void bindTitle(String title) {
        WidgetFiltersColorFilterBinding widgetFiltersColorFilterBinding = this.binding;
        AppCompatTextView titleTv = widgetFiltersColorFilterBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, title);
        View titleAnchor = widgetFiltersColorFilterBinding.titleAnchor;
        Intrinsics.checkNotNullExpressionValue(titleAnchor, "titleAnchor");
        ViewExtKt.showOrGoneByPresence(titleAnchor, title);
        View clickableArea = widgetFiltersColorFilterBinding.clickableArea;
        Intrinsics.checkNotNullExpressionValue(clickableArea, "clickableArea");
        ViewExtKt.showOrGoneByPresence(clickableArea, title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTitleClick() {
        AtomAction atomAction;
        ColorFilterVO boundData = getBoundData();
        if (boundData != null) {
            AtomActionDTO action = boundData.getAction();
            if (action != null && (atomAction = AtomActionMapperKt.toAtomAction(action, boundData.getTrackingInfo())) != null) {
                this.actionHandler.invoke(atomAction);
            }
            WZ.t tokenizedEvent = boundData.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ColorFilterVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetFiltersColorFilterBinding widgetFiltersColorFilterBinding = this.binding;
        CustomRefreshHandler.bind$default(this.customRefreshHandler, item.getOriginalUrl(), Long.valueOf(item.getId()), this.actionHandler, null, null, 24, null);
        bindTitle(item.getTitle());
        bindIcon(item.getIcon());
        SingleAtom rightButton = widgetFiltersColorFilterBinding.rightButton;
        Intrinsics.checkNotNullExpressionValue(rightButton, "rightButton");
        AtomDTO rightIcon = item.getRightIcon();
        if (rightIcon == null) {
            rightIcon = item.getRightButton();
        }
        ContainerExtKt.bindOrGone$default(rightButton, rightIcon, false, 2, null);
        Unit unit = Unit.f71690a;
        Utils utils = Utils.INSTANCE;
        View clickableArea = this.binding.clickableArea;
        Intrinsics.checkNotNullExpressionValue(clickableArea, "clickableArea");
        SingleAtom rightButton2 = this.binding.rightButton;
        Intrinsics.checkNotNullExpressionValue(rightButton2, "rightButton");
        utils.setClickableZones(clickableArea, rightButton2, item.getRightIcon(), this.actionHandler, new ColorFilterViewHolder$bind$1$1$1(this));
        RecyclerView.o layoutManager = widgetFiltersColorFilterBinding.colorsRv.getLayoutManager();
        if (layoutManager == null || layoutManager.canScrollHorizontally() != item.getScrollEnabled()) {
            widgetFiltersColorFilterBinding.colorsRv.setLayoutManager(this.adapterDelegate.provideLayoutManager(item.getScrollEnabled()));
        }
        this.adapterDelegate.bindAdapter(this.colorsAdapter, item);
        View separator = widgetFiltersColorFilterBinding.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        ViewExtKt.showOrGone(separator, Boolean.valueOf(item.getShowSeparator()));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ColorFilterVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ColorFilterViewHolder<T>) item, trackingData, viewedPond);
        WZ.t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
