package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.R$string;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.ProductsInBotV2ButtonCounterUpdate;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 52\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00015B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J)\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RD\u0010*\u001a2\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000e0#\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0#0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel;)V", "", "showErrorNotification", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;Ll20/d;)V", "onAttach", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function3;", "", "", "quantityActionHandler", "Lfd/n;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Landroid/widget/LinearLayout;", "getComposerBottomContainer", "()Landroid/widget/LinearLayout;", "composerBottomContainer", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2ViewHolder extends k<ProductsInBotV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final InterfaceC6511n<Long, Integer, Function1<? super Integer, Unit>, Function1<AtomAction, Unit>> quantityActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ProductsInBotV2View view;

    @NotNull
    private final ProductsInBotV2ViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int buttonMargin = UiExtKt.toPx(16);

    @NotNull
    private static final String notificationTitle = StringProvider.getString(R$string.common_message_request_problem);

    @NotNull
    private static final String notificationSubtitle = StringProvider.getString(R$string.common_try_again);

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "productsCount", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Pair<? extends Integer, ? extends Long>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Long> pair) {
            invoke2((Pair<Integer, Long>) pair);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, Long> pair) {
            ProductsInBotV2ViewHolder.this.composerReferences.getController().update(new ProductsInBotV2ButtonCounterUpdate(pair.e().intValue(), pair.f().longValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<ProductsInBotV2ViewModel.Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProductsInBotV2ViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProductsInBotV2ViewModel.Action action) {
            if (action instanceof ProductsInBotV2ViewModel.Action.Success) {
                ProductsInBotV2ViewHolder.this.actionHandler.invoke(((ProductsInBotV2ViewModel.Action.Success) action).getAction());
            } else {
                if (!(action instanceof ProductsInBotV2ViewModel.Action.Error)) {
                    throw new o();
                }
                ProductsInBotV2ViewHolder.this.showErrorNotification();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewHolder$Companion;", "", "<init>", "()V", "", "INCREASE_ACTION", "Ljava/lang/String;", "DECREASE_ACTION", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsInBotV2ViewHolder(@NotNull ProductsInBotV2View view, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull ProductsInBotV2ViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onComposerAction(new ProductsInBotV2ViewHolder$actionHandler$1(this)).buildHandler();
        this.quantityActionHandler = new ProductsInBotV2ViewHolder$quantityActionHandler$1(this);
        ButtonV3View buttonV3View = new ButtonV3View(getContext(), null, 0, 0, 14, null);
        buttonV3View.setId(R$id.button);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = buttonMargin;
        layoutParams.setMargins(i11, i11, i11, 0);
        buttonV3View.setLayoutParams(layoutParams);
        this.buttonView = buttonV3View;
        LinearLayout composerBottomContainer = getComposerBottomContainer();
        if (composerBottomContainer != null) {
            composerBottomContainer.setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
        }
        viewModel.getCountOfProducts().observe(this, new ProductsInBotV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        viewModel.getRequestState().observe(this, new ProductsInBotV2ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    private final LinearLayout getComposerBottomContainer() {
        View view;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerBottomContainer(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification() {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(notificationTitle, notificationSubtitle, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 508, null), this.composerReferences.getContainer().g(), null, 8, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        LinearLayout composerBottomContainer = getComposerBottomContainer();
        if (composerBottomContainer != null) {
            composerBottomContainer.addView(this.buttonView);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        LinearLayout composerBottomContainer = getComposerBottomContainer();
        if (composerBottomContainer != null) {
            composerBottomContainer.removeView(this.buttonView);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductsInBotV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler, this.quantityActionHandler, this.tokenizedAnalytics, new ProductsInBotV2ViewHolder$bind$1(this.viewModel), new ProductsInBotV2ViewHolder$bind$2(this.viewModel));
        ButtonV3HolderKt.bind(this.buttonView, item.getButton(), this.actionHandler);
        this.viewModel.updateProductList(item.getItems());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProductsInBotV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ProductsInBotV2ViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
