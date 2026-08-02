package ru.ozon.app.android.common.productselectormobile.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.productselectormobile.PickerRefreshLinkStore;
import ru.ozon.app.android.common.productselectormobile.data.ProductSelectorMobileVO;
import ru.ozon.app.android.common.productselectormobile.util.AutopickerBottomSheetConfigurator;
import ru.ozon.app.android.common.ui.productselectormobile.databinding.WidgetProductSelectorMobileBinding;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.core.atoms.factories.AtomsWithFiltersFactory;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001,\u0018\u0000 /2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001/B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/presentation/ProductSelectorMobileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;", "refreshLinkStore", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/common/productselectormobile/PickerRefreshLinkStore;)V", "", "stretch", "", "updateActionButtonWidth", "(Z)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "openBottomSheet", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/atoms/af/AtomAction;)Z", "Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;", "showConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "mapBottomSheetDisplayMode", "(Lru/ozon/uni/atoms/af/AtomAction$CurtainShowConfig;)Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileVO;Ll20/d;)V", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "onBottomSheetAction", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "tagsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/common/ui/productselectormobile/databinding/WidgetProductSelectorMobileBinding;", "binding", "Lru/ozon/app/android/common/ui/productselectormobile/databinding/WidgetProductSelectorMobileBinding;", "ru/ozon/app/android/common/productselectormobile/presentation/ProductSelectorMobileViewHolder$observer$1", "observer", "Lru/ozon/app/android/common/productselectormobile/presentation/ProductSelectorMobileViewHolder$observer$1;", "Companion", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductSelectorMobileViewHolder extends k<ProductSelectorMobileVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetProductSelectorMobileBinding binding;

    @NotNull
    private final ProductSelectorMobileViewHolder$observer$1 observer;

    @NotNull
    private final Function1<AtomAction, Unit> onBottomSheetAction;

    @NotNull
    private final AtomsAdapter tagsAdapter;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.common.productselectormobile.presentation.ProductSelectorMobileViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
        final /* synthetic */ ComposerReferences $ref;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposerReferences composerReferences) {
            super(1);
            this.$ref = composerReferences;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
            invoke2(click);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.Click it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC7851b.a.a(this.$ref.getController(), it.getLink(), null, null, null, 14);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/presentation/ProductSelectorMobileViewHolder$Companion;", "", "<init>", "()V", "TAG", "", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.lifecycle.I, ru.ozon.app.android.common.productselectormobile.presentation.ProductSelectorMobileViewHolder$observer$1] */
    public ProductSelectorMobileViewHolder(@NotNull View containerView, @NotNull final ComposerReferences ref, @NotNull HandlersInhibitor handlersInhibitor, @NotNull final PickerRefreshLinkStore refreshLinkStore) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refreshLinkStore, "refreshLinkStore");
        this.actionHandler = new ActionHandler.Builder(ref, this).onClick(new ProductSelectorMobileViewHolder$actionHandler$1(ref)).buildHandler();
        this.onBottomSheetAction = new ActionHandler.Builder(ref, this).enableClickThrottling(handlersInhibitor).onPreProcess(new ProductSelectorMobileViewHolder$onBottomSheetAction$1(this, ref)).buildHandler();
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, new AtomsWithFiltersFactory(), 7, null);
        this.tagsAdapter = atomsAdapter;
        WidgetProductSelectorMobileBinding bind = WidgetProductSelectorMobileBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ?? r02 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.common.productselectormobile.presentation.ProductSelectorMobileViewHolder$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                String refreshLink = PickerRefreshLinkStore.this.getRefreshLink();
                if (refreshLink != null) {
                    if (h.K(refreshLink)) {
                        refreshLink = null;
                    }
                    String str = refreshLink;
                    if (str != null) {
                        InterfaceC7851b.a.a(ref.getController(), str, null, null, null, 14);
                    }
                }
            }
        };
        this.observer = r02;
        ref.getContainer().f().getLifecycle().a(r02);
        atomsAdapter.setOnAction(new ActionHandler.Builder(ref, this).enableClickThrottling(handlersInhibitor).onClick(new AnonymousClass1(ref)).buildHandler());
        bind.tagsFal.setAdapter(atomsAdapter);
    }

    private final ComposerFragment.DisplayMode mapBottomSheetDisplayMode(AtomAction.CurtainShowConfig showConfig) {
        return Intrinsics.d(showConfig, AtomAction.CurtainShowConfig.Full.INSTANCE) ? ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL : ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean openBottomSheet(ComposerReferences ref, AtomAction action) {
        if (!(action instanceof AtomAction.OpenComposerNestedPage)) {
            return false;
        }
        AtomAction.OpenComposerNestedPage openComposerNestedPage = (AtomAction.OpenComposerNestedPage) action;
        ComposerNavigator.DefaultImpls.openBottomSheet$default(ref.getNavigator(), "ProductPickerBottomSheet", new ComposerScreenConfig(new h.c.a(openComposerNestedPage.getLink(), (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, null, null, 61, null), 0, 2, null), false, new ComposerScreenConfig.BottomSheetConfig(mapBottomSheetDisplayMode(openComposerNestedPage.getShowConfig()), false, false, null, 0, false, false, false, false, false, false, 2046, null), false, false, false, false, null, false, false, false, e0.h(AutopickerBottomSheetConfigurator.class), null, null, null, false, null, null, null, false, false, null, null, 16773044, null), null, null, null, 28, null);
        return true;
    }

    private final void updateActionButtonWidth(boolean stretch) {
        int i11 = stretch ? 0 : -2;
        float f7 = stretch ? 1.0f : 0.0f;
        SmallButtonView actionButtonView = this.binding.actionButtonView;
        Intrinsics.checkNotNullExpressionValue(actionButtonView, "actionButtonView");
        ViewGroup.LayoutParams layoutParams = actionButtonView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = i11;
        layoutParams2.weight = f7;
        actionButtonView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductSelectorMobileVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetProductSelectorMobileBinding widgetProductSelectorMobileBinding = this.binding;
        widgetProductSelectorMobileBinding.titleTv.setText(item.getTitle());
        TextView subtitleTv = widgetProductSelectorMobileBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, item.getSubtitle());
        updateActionButtonWidth(item.getResetButton() != null);
        SmallButtonView actionButtonView = widgetProductSelectorMobileBinding.actionButtonView;
        Intrinsics.checkNotNullExpressionValue(actionButtonView, "actionButtonView");
        WrappedButtonHolderKt.bind(actionButtonView, item.getActionButton(), this.onBottomSheetAction);
        SmallButtonView resetButtonView = widgetProductSelectorMobileBinding.resetButtonView;
        Intrinsics.checkNotNullExpressionValue(resetButtonView, "resetButtonView");
        WrappedButtonHolderKt.bindOrGone(resetButtonView, item.getResetButton(), this.actionHandler);
        TextView tagsTitleTv = widgetProductSelectorMobileBinding.tagsTitleTv;
        Intrinsics.checkNotNullExpressionValue(tagsTitleTv, "tagsTitleTv");
        TextViewExtKt.setTextOrGone(tagsTitleTv, item.getTagsTitle());
        if (item.getTags() != null) {
            HorizontalFlexAtomsLayout tagsFal = widgetProductSelectorMobileBinding.tagsFal;
            Intrinsics.checkNotNullExpressionValue(tagsFal, "tagsFal");
            ViewExtKt.show(tagsFal);
            this.tagsAdapter.bind(getContext(), item.getTags());
        } else {
            HorizontalFlexAtomsLayout tagsFal2 = widgetProductSelectorMobileBinding.tagsFal;
            Intrinsics.checkNotNullExpressionValue(tagsFal2, "tagsFal");
            ViewExtKt.gone(tagsFal2);
        }
        ImageView selectorImageIv = widgetProductSelectorMobileBinding.selectorImageIv;
        Intrinsics.checkNotNullExpressionValue(selectorImageIv, "selectorImageIv");
        ImageViewExtKt.loadImageOrGone(selectorImageIv, item.getImage());
    }
}
