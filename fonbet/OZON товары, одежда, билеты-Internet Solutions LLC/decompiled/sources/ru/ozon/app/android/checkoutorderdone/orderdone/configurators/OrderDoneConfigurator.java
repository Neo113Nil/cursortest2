package ru.ozon.app.android.checkoutorderdone.orderdone.configurators;

import FK.a;
import GZ.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.L;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/configurators/OrderDoneConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "", "openHome", "()V", "onComposerInitialized", "LGZ/g;", "", "homeDeeplink", "Ljava/lang/String;", "expressDeeplink", "Companion", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDoneConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final String expressDeeplink;

    @NotNull
    private final String homeDeeplink;

    @NotNull
    private final g ozonRouter;
    public static final int $stable = 8;

    public OrderDoneConfigurator(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String uri = linkGenerator.home().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.homeDeeplink = uri;
        String builder = MiniAppExtKt.appendExpress(linkGenerator.express()).appendQueryParameter("anchor", "true").toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        this.expressDeeplink = builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openHome() {
        String str = MiniAppExtKt.isExpress(getContainer().i()) ? this.expressDeeplink : this.homeDeeplink;
        ComposerExtKt.closeFlow(getContainer());
        g.a.a(this.ozonRouter, str, null, null, 6);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        View findViewById;
        r i11 = getContainer().i();
        ViewGroup rootView = ContextExtKt.getRootView(i11);
        if (rootView != null && (findViewById = rootView.findViewById(R.id.navigationBtn)) != null) {
            findViewById.setOnClickListener(new a(this, 15));
        }
        L.a(i11.getOnBackPressedDispatcher(), getOwner(), new OrderDoneConfigurator$onComposerInitialized$2(this), 2);
    }
}
