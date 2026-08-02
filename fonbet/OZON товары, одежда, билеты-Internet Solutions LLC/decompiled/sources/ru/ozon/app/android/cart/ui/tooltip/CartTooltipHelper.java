package ru.ozon.app.android.cart.ui.tooltip;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.tooltip.internal.CartTooltipPopup;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.AtomFeatures;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u00020\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R*\u0010\u001c\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u001a\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "", "Landroidx/fragment/app/m;", "fragment", "<init>", "(Landroidx/fragment/app/m;)V", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltipVO", "", "centerAboutAnchor", "", "dismissTimeout", "", "onShowTooltipInternal", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;ZLjava/lang/Long;)V", "trackViewAnalytics", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipPopup;", "buildTooltip", "(Landroid/content/Context;Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;)Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipPopup;", "Landroid/view/View;", "anchor", "", "marginFromAnchor", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "onShowTooltip", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;Landroid/view/View;IZLjava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "onDismissTooltip", "()V", "tooltip", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipPopup;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "fragmentRef", "Ljava/lang/ref/WeakReference;", "anchorRef", "isShowing", "()Z", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartTooltipHelper {
    private WeakReference<Function1<AtomAction, Unit>> actionHandler;

    @NotNull
    private WeakReference<View> anchorRef;

    @NotNull
    private final WeakReference<ComponentCallbacksC5392m> fragmentRef;
    private CartTooltipPopup tooltip;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float radius = UiExtKt.toPxF(16);
    private static int defaultBeakMargin = UiExtKt.toPx(5);
    private static int beakMargin = UiExtKt.toPx(5);
    private static final int padding = UiExtKt.toPx(12);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartTooltipHelper(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragmentRef = new WeakReference<>(fragment);
        this.anchorRef = new WeakReference<>(null);
    }

    private final CartTooltipPopup buildTooltip(Context context, CartTooltipVO tooltipVO) {
        return new CartTooltipPopup(context, tooltipVO, beakMargin, padding, radius);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onShowTooltip$default(CartTooltipHelper cartTooltipHelper, CartTooltipVO cartTooltipVO, View view, int i11, boolean z11, Long l11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        if ((i12 & 16) != 0) {
            l11 = null;
        }
        if ((i12 & 32) != 0) {
            function1 = null;
        }
        cartTooltipHelper.onShowTooltip(cartTooltipVO, view, i11, z11, l11, function1);
    }

    private final void onShowTooltipInternal(CartTooltipVO tooltipVO, boolean centerAboutAnchor, Long dismissTimeout) {
        J viewLifecycleOwner;
        AbstractC5434v lifecycle;
        View view = this.anchorRef.get();
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CartTooltipPopup buildTooltip = buildTooltip(context, tooltipVO);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.fragmentRef.get();
        if (componentCallbacksC5392m != null && (viewLifecycleOwner = componentCallbacksC5392m.getViewLifecycleOwner()) != null && (lifecycle = viewLifecycleOwner.getLifecycle()) != null) {
            lifecycle.a(buildTooltip);
        }
        this.tooltip = buildTooltip;
        if (buildTooltip != null) {
            buildTooltip.show(view, centerAboutAnchor, dismissTimeout);
        }
        trackViewAnalytics(tooltipVO);
    }

    private final void trackViewAnalytics(CartTooltipVO tooltipVO) {
        WeakReference<Function1<AtomAction, Unit>> weakReference;
        Function1<AtomAction, Unit> function1;
        CartTooltipPopup cartTooltipPopup = this.tooltip;
        if (cartTooltipPopup == null || !cartTooltipPopup.isShowing() || (weakReference = this.actionHandler) == null || (function1 = weakReference.get()) == null) {
            return;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = tooltipVO.getTrackingInfo();
        if (AtomFeatures.INSTANCE.getSendViewActionIfNotNull()) {
            if ((trackingInfo != null ? trackingInfo.get("view") : null) == null) {
                return;
            }
        }
        function1.invoke(new AtomAction.ViewAction(trackingInfo, null, 2, null));
    }

    public final boolean isShowing() {
        CartTooltipPopup cartTooltipPopup = this.tooltip;
        if (cartTooltipPopup != null) {
            return cartTooltipPopup.isShowing();
        }
        return false;
    }

    public final void onDismissTooltip() {
        CartTooltipPopup cartTooltipPopup = this.tooltip;
        if (cartTooltipPopup != null) {
            cartTooltipPopup.dismiss();
        }
    }

    public final void onShowTooltip(@NotNull CartTooltipVO tooltipVO, @NotNull View anchor, int marginFromAnchor, boolean centerAboutAnchor, Long dismissTimeout, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(tooltipVO, "tooltipVO");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        beakMargin = marginFromAnchor + defaultBeakMargin;
        this.anchorRef = new WeakReference<>(anchor);
        this.actionHandler = new WeakReference<>(actionHandler);
        onShowTooltipInternal(tooltipVO, centerAboutAnchor, dismissTimeout);
    }
}
