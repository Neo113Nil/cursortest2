package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.footer;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountViewKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/footer/DeliveryV6FooterViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Footer;", "view", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "handlersInhibitor", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "bind", "item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6FooterViewHolder extends TabEmbeddedWidgetViewHolder<DeliveryV6VO.Footer> {
    public static final int $stable = SmallBorderlessButtonView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final SmallBorderlessButtonView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6FooterViewHolder(@NotNull SmallBorderlessButtonView view, @NotNull ComposerReferences composerReferences, @NotNull HandlersInhibitor handlersInhibitor) {
        super(view, composerReferences, null, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.view = view;
        this.onAction = new ActionHandler.Builder(composerReferences, this).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
    
        if (r8 != (r5 != null ? r5.bottomMargin : 0)) goto L53;
     */
    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull DeliveryV6VO.Footer item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SmallBorderlessButtonView smallBorderlessButtonView = this.view;
        boolean z11 = item.getViewDTO() != null;
        ViewGroup.LayoutParams layoutParams = smallBorderlessButtonView.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = layoutParams.width;
        int dp20 = z11 ? SellerV4DisclosureViewFactory.INSTANCE.getDp20() : 0;
        layoutParams.height = dp20;
        if (i11 != dp20 || i12 != layoutParams.width) {
            smallBorderlessButtonView.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = smallBorderlessButtonView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            int i13 = marginLayoutParams.leftMargin;
            int i14 = marginLayoutParams.topMargin;
            int i15 = marginLayoutParams.rightMargin;
            int i16 = marginLayoutParams.bottomMargin;
            marginLayoutParams.topMargin = z11 ? SellerV4DisclosureViewFactory.INSTANCE.getDp16() : 0;
            marginLayoutParams.bottomMargin = z11 ? ProgressiveDiscountViewKt.getDp8() : 0;
            if (i13 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams3 = smallBorderlessButtonView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i14 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = smallBorderlessButtonView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i15 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams5 = smallBorderlessButtonView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    }
                }
            }
            smallBorderlessButtonView.setLayoutParams(marginLayoutParams);
        }
        WrappedBorderlessButtonHolderKt.bindOrGone(smallBorderlessButtonView, item.getViewDTO(), this.onAction);
    }
}
