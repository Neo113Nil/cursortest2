package ru.ozon.app.android.checkoutorderdone.orderdone.configurators.deliveryc2c;

import BZ.e;
import GZ.g;
import HY.c;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.L;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.deliveryc2c.utils.C2CLinkGenerator;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/configurators/deliveryc2c/DeliveryOrderDoneConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LGZ/g;", "ozonRouter", "LBZ/e;", "miniAppConfigHolder", "<init>", "(LGZ/g;LBZ/e;)V", "", "openHome", "()V", "onComposerInitialized", "LGZ/g;", "LBZ/e;", "", "getHomeDeeplink", "()Ljava/lang/String;", "homeDeeplink", "getDeliveryLink", "deliveryLink", "getExpressLink", "expressLink", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryOrderDoneConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final e miniAppConfigHolder;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/configurators/deliveryc2c/DeliveryOrderDoneConfigurator$Companion;", "", "<init>", "()V", "QUERY_PARAM_ANCHOR", "", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeliveryOrderDoneConfigurator(@NotNull g ozonRouter, @NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.ozonRouter = ozonRouter;
        this.miniAppConfigHolder = miniAppConfigHolder;
    }

    private final String getDeliveryLink() {
        String builder = C2CLinkGenerator.INSTANCE.delivery().buildUpon().appendQueryParameter("anchor", "true").toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }

    private final String getExpressLink() {
        String builder = LinkGenerator.INSTANCE.express().buildUpon().appendQueryParameter("anchor", "true").toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }

    private final String getHomeDeeplink() {
        String uri = LinkGenerator.INSTANCE.home().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openHome() {
        String b11 = this.miniAppConfigHolder.g().b();
        String deliveryLink = Intrinsics.d(b11, "cml") ? getDeliveryLink() : Intrinsics.d(b11, "supermarket") ? getExpressLink() : getHomeDeeplink();
        ComposerExtKt.closeFlow(getContainer());
        g.a.a(this.ozonRouter, deliveryLink, null, null, 6);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        View findViewById;
        r i11 = getContainer().i();
        ViewGroup rootView = ContextExtKt.getRootView(i11);
        if (rootView != null && (findViewById = rootView.findViewById(R.id.navigationBtn)) != null) {
            findViewById.setOnClickListener(new c(this, 7));
        }
        L.a(i11.getOnBackPressedDispatcher(), getOwner(), new DeliveryOrderDoneConfigurator$onComposerInitialized$2(this), 2);
    }
}
