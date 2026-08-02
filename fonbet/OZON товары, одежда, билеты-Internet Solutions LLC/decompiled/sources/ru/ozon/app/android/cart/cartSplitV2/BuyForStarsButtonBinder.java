package ru.ozon.app.android.cart.cartSplitV2;

import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonDTO;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonView;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/BuyForStarsButtonBinder;", "", "Landroid/view/ViewGroup;", "container", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;LWZ/l;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonView;", "getOrCreateButton", "()Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonView;", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "buyForStarsBtn", "bind", "(Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;)V", "", "widgetId", "trackViewIfNeed", "(J)V", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/utils/AppType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "buyForStarsButtonView", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonView;", "getBuyForStarsButtonView", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BuyForStarsButtonBinder {

    @NotNull
    private final AppType appType;
    private RightIconButtonView buyForStarsButtonView;

    @NotNull
    private final ViewGroup container;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final l tokenizedAnalytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_12 = ResourceExtKt.toPx(12);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_16 = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/BuyForStarsButtonBinder$Companion;", "", "<init>", "()V", "DP_12", "", "DP_8", "getDP_8", "()I", "DP_16", "getDP_16", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_16() {
            return BuyForStarsButtonBinder.DP_16;
        }

        public final int getDP_8() {
            return BuyForStarsButtonBinder.DP_8;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuyForStarsButtonBinder(@NotNull ViewGroup container, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull l tokenizedAnalytics, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.container = container;
        this.onAction = onAction;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.appType = appType;
    }

    private final RightIconButtonView getOrCreateButton() {
        RightIconButtonView rightIconButtonView = this.buyForStarsButtonView;
        if (rightIconButtonView != null) {
            return rightIconButtonView;
        }
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41655s = R$id.removeButton;
        bVar.f41636i = 0;
        int i11 = DP_8;
        bVar.setMarginStart(i11);
        bVar.setMarginEnd(i11);
        int i12 = DP_12;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i12;
        bVar.f41657u = R$id.countPickerV;
        bVar.f41598E = 0.0f;
        bVar.f41616W = true;
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RightIconButtonView rightIconButtonView2 = new RightIconButtonView(context, null, 0, 6, null);
        rightIconButtonView2.setLayoutParams(bVar);
        rightIconButtonView2.setId(View.generateViewId());
        rightIconButtonView2.setSelectApp(this.appType == AppType.SELECT);
        this.container.addView(rightIconButtonView2);
        this.buyForStarsButtonView = rightIconButtonView2;
        return rightIconButtonView2;
    }

    public final void bind(RightIconButtonDTO buyForStarsBtn) {
        if (buyForStarsBtn == null && this.buyForStarsButtonView == null) {
            return;
        }
        getOrCreateButton().bindOrGone(buyForStarsBtn, this.onAction);
    }

    public final RightIconButtonView getBuyForStarsButtonView() {
        return this.buyForStarsButtonView;
    }

    public final void trackViewIfNeed(long widgetId) {
        RightIconButtonDTO boundedData;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        RightIconButtonView rightIconButtonView = this.buyForStarsButtonView;
        if (rightIconButtonView != null) {
            if (rightIconButtonView.getVisibility() != 0) {
                rightIconButtonView = null;
            }
            if (rightIconButtonView == null || (boundedData = rightIconButtonView.getBoundedData()) == null || (common = boundedData.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null)) == null) {
                return;
            }
            m.c(this.tokenizedAnalytics, mapToTokenizedEvent$default, null);
        }
    }
}
