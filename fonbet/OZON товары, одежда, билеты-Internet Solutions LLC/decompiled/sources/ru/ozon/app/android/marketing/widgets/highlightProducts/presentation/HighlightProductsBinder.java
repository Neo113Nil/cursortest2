package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.marketing.R$dimen;
import ru.ozon.app.android.marketing.databinding.WidgetHighlightProductsBinding;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.HighlightProductsVO;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter.HighlightProductsAdapter;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter.ItemDecorator;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperProgressText;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u0012J\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsBinder;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/marketing/databinding/WidgetHighlightProductsBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroid/view/View;Lru/ozon/app/android/marketing/databinding/WidgetHighlightProductsBinding;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;", "item", "addProductsToList", "(Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;)V", "bindMiniWidget", "setupCardContainer", "()V", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText$HighlightIcon;", "icon", "Landroid/widget/ImageView;", "bindMiniIcon", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText$HighlightIcon;)Landroid/widget/ImageView;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "progressText", "setMiniWidgetConstraints", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;)V", "setIsMiniWidget", "bind", "Landroid/view/View;", "Lru/ozon/app/android/marketing/databinding/WidgetHighlightProductsBinding;", "Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "", "defaultIconTintColor", "I", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/ItemDecorator;", "decorator$delegate", "LSc/j;", "getDecorator", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/ItemDecorator;", "decorator", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isMiniWidget", "Z", "setMiniWidget", "(Z)V", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter;", "productsAdapter$delegate", "getProductsAdapter", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter;", "productsAdapter", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightProductsBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetHighlightProductsBinding binding;

    @NotNull
    private final View containerView;
    private final Context context;

    /* renamed from: decorator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j decorator;
    private final int defaultIconTintColor;
    private boolean isMiniWidget;

    /* renamed from: productsAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j productsAdapter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float MINI_CARD_ELEVATION = ResourceExtKt.toPx(10);
    private static final float MINI_CARD_CORNER_RADIUS = ResourceExtKt.toPx(12);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsBinder$Companion;", "", "<init>", "()V", "MINI_CARD_ELEVATION", "", "MINI_CARD_CORNER_RADIUS", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HighlightProductsBinder(@NotNull View containerView, @NotNull WidgetHighlightProductsBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.containerView = containerView;
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.context = containerView.getContext();
        this.defaultIconTintColor = UniColors.BG_ACTION_SECONDARY.getResId();
        this.decorator = LazyUtilsKt.unsafeLazy(new HighlightProductsBinder$decorator$2(this));
        this.productsAdapter = k.a(n.NONE, new HighlightProductsBinder$productsAdapter$2(this));
        binding.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
    }

    private final void addProductsToList(HighlightProductsVO item) {
        ArrayList W02 = C7714v.W0(item.getMainProducts());
        getDecorator().setDividerPosition(item.getSubProducts() == null ? -1 : item.getMainProducts().size());
        List<HighlightProductsVO.HighlightProduct> subProducts = item.getSubProducts();
        if (subProducts != null) {
            W02.addAll(subProducts);
        }
        getProductsAdapter().setData(C7714v.U0(W02));
    }

    private final ImageView bindMiniIcon(HighlightsWrapperProgressText.HighlightIcon icon) {
        WidgetHighlightProductsBinding widgetHighlightProductsBinding = this.binding;
        ImageView progressImage = widgetHighlightProductsBinding.progressImage;
        Intrinsics.checkNotNullExpressionValue(progressImage, "progressImage");
        ViewExtKt.showOrGoneByPresence(progressImage, icon);
        if (icon == null) {
            return null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, icon.getTintColor(), this.defaultIconTintColor);
        ImageView imageView = widgetHighlightProductsBinding.progressImage;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, icon.getName(), null, null, null, null, false, null, 126, null);
        ThemeExtKt.tint(imageView, Integer.valueOf(parseColor));
        return imageView;
    }

    private final void bindMiniWidget(HighlightProductsVO item) {
        int color;
        if (this.isMiniWidget) {
            AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            if (appTypeResolver.isSelect(context)) {
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                color = ThemeExtKt.themeColor(context2, R$attr.bgDarkKey);
            } else {
                Context context3 = this.context;
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                color = ResourceExtKt.color(context3, R$color.layer_floor_2);
            }
            WidgetHighlightProductsBinding widgetHighlightProductsBinding = this.binding;
            TextAtomView highlightProductsTitle = widgetHighlightProductsBinding.highlightProductsTitle;
            Intrinsics.checkNotNullExpressionValue(highlightProductsTitle, "highlightProductsTitle");
            highlightProductsTitle.setVisibility(8);
            TextAtomView highlightProductsSubtitle = widgetHighlightProductsBinding.highlightProductsSubtitle;
            Intrinsics.checkNotNullExpressionValue(highlightProductsSubtitle, "highlightProductsSubtitle");
            highlightProductsSubtitle.setVisibility(8);
            widgetHighlightProductsBinding.cardContainer.setCardBackgroundColor(color);
            setMiniWidgetConstraints(item.getMiniProgressText());
            TextAtomView progressTitle = widgetHighlightProductsBinding.progressTitle;
            Intrinsics.checkNotNullExpressionValue(progressTitle, "progressTitle");
            HighlightsWrapperProgressText miniProgressText = item.getMiniProgressText();
            TextAtomHolderKt.bindOrGone$default(progressTitle, miniProgressText != null ? miniProgressText.getText() : null, null, 2, null);
            HighlightsWrapperProgressText miniProgressText2 = item.getMiniProgressText();
            bindMiniIcon(miniProgressText2 != null ? miniProgressText2.getIcon() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ItemDecorator getDecorator() {
        return (ItemDecorator) this.decorator.getValue();
    }

    private final HighlightProductsAdapter getProductsAdapter() {
        return (HighlightProductsAdapter) this.productsAdapter.getValue();
    }

    private final void setMiniWidget(boolean z11) {
        if (this.isMiniWidget != z11) {
            this.isMiniWidget = z11;
            getDecorator().setDividerHeight(z11);
        }
    }

    private final void setMiniWidgetConstraints(HighlightsWrapperProgressText progressText) {
        if (progressText == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.binding.miniWidgetContainer;
        d d11 = Tl.a.d(constraintLayout, "miniWidgetContainer", constraintLayout);
        d11.t(ru.ozon.app.android.marketing.R$id.highlightProductsList, 1, ru.ozon.app.android.marketing.R$id.guideline, 2, 0);
        d11.f(constraintLayout);
    }

    private final void setupCardContainer() {
        CardView cardView = this.binding.cardContainer;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        Context context = cardView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams2.leftMargin = ResourceExtKt.dim(context, R$dimen.mini_widget_horizontal_margin);
        Context context2 = cardView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams2.rightMargin = ResourceExtKt.dim(context2, R$dimen.mini_widget_horizontal_margin);
        Context context3 = cardView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams2.topMargin = ResourceExtKt.dim(context3, R$dimen.mini_widget_margin);
        Context context4 = cardView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        layoutParams2.bottomMargin = ResourceExtKt.dim(context4, R$dimen.mini_widget_margin);
        cardView.setLayoutParams(layoutParams2);
        cardView.setElevation(MINI_CARD_ELEVATION);
        cardView.setRadius(MINI_CARD_CORNER_RADIUS);
    }

    public final void bind(@NotNull HighlightProductsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetHighlightProductsBinding widgetHighlightProductsBinding = this.binding;
        TextAtomView highlightProductsTitle = widgetHighlightProductsBinding.highlightProductsTitle;
        Intrinsics.checkNotNullExpressionValue(highlightProductsTitle, "highlightProductsTitle");
        highlightProductsTitle.setVisibility(item.getTitle() != null ? 0 : 8);
        TextAtomView highlightProductsSubtitle = widgetHighlightProductsBinding.highlightProductsSubtitle;
        Intrinsics.checkNotNullExpressionValue(highlightProductsSubtitle, "highlightProductsSubtitle");
        highlightProductsSubtitle.setVisibility(item.getSubtitle() != null ? 0 : 8);
        TextAtom title = item.getTitle();
        if (title != null) {
            TextAtomHolderKt.bind$default(widgetHighlightProductsBinding.highlightProductsTitle, title, null, 2, null);
        }
        TextAtom subtitle = item.getSubtitle();
        if (subtitle != null) {
            TextAtomHolderKt.bind$default(widgetHighlightProductsBinding.highlightProductsSubtitle, subtitle, null, 2, null);
        }
        addProductsToList(item);
        bindMiniWidget(item);
    }

    public final void setIsMiniWidget() {
        setMiniWidget(true);
        setupCardContainer();
    }
}
