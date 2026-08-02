package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetPromoOfferBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 92\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00019B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u001b\u0010*\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R'\u00100\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00110+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel;", "errorNotificationDTO$delegate", "LSc/j;", "getErrorNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorNotificationDTO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetPromoOfferBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetPromoOfferBinding;", "Landroid/graphics/drawable/GradientDrawable;", "shape$delegate", "getShape", "()Landroid/graphics/drawable/GradientDrawable;", "shape", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoOfferViewHolder extends k<PromoOfferVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final WidgetPromoOfferBinding binding;

    /* renamed from: errorNotificationDTO$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j errorNotificationDTO;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: shape$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j shape;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PromoOfferViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewHolder$Companion;", "", "<init>", "()V", "PARAMS_ID", "", "PARAMS_QUANTITY", "PARAMS_DELIVERY_SCHEMA", "ACTION_ID", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoOfferViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull PromoOfferViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.errorNotificationDTO = Sc.k.b(PromoOfferViewHolder$errorNotificationDTO$2.INSTANCE);
        this.actionHandler = Sc.k.b(new PromoOfferViewHolder$actionHandler$2(this));
        WidgetPromoOfferBinding bind = WidgetPromoOfferBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.shape = Sc.k.b(PromoOfferViewHolder$shape$2.INSTANCE);
        bind.promoOfferContainer.setClipToOutline(true);
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getErrorNotificationDTO() {
        return (NotificationDTO) this.errorNotificationDTO.getValue();
    }

    private final GradientDrawable getShape() {
        return (GradientDrawable) this.shape.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notification) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.refs.getContainer().g(), getActionHandler()).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getActions(), lifecycle.getLifecycle(), AbstractC5434v.b.STARTED), new PromoOfferViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PromoOfferVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        GradientDrawable shape = getShape();
        shape.setCornerRadius(item.getRadius());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.promoOfferContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        shape.setColor(styleParser.parseColor(context, item.getBackgroundColor(), UniColors.BG_SECONDARY.getResId()));
        WidgetPromoOfferBinding widgetPromoOfferBinding = this.binding;
        TextAtomV2View textAtomV2View = widgetPromoOfferBinding.title;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bind$default(textAtomV2View, item.getTitle(), null, 2, null);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        TextAtomV2View textAtomV2View2 = widgetPromoOfferBinding.subtitle;
        Intrinsics.f(textAtomV2View2);
        TextHolderKt.bindOrGone$default(textAtomV2View2, item.getSubtitle(), null, 2, null);
        TextViewExtKt.setTextCopyable(textAtomV2View2, false);
        ButtonV3View button = widgetPromoOfferBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonV3HolderKt.bindOrGone(button, item.getButton(), getActionHandler());
        Image image = widgetPromoOfferBinding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        ImageHolderKt.bind$default(image, item.getImage(), null, 2, null);
        widgetPromoOfferBinding.promoOfferContainer.setBackground(getShape());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PromoOfferVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
