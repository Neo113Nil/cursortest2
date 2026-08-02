package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.router;

import GZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/router/PdpCouponListV2RouterImpl;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/router/PdpCouponListV2Router;", "LGZ/g;", "screenRouter", "<init>", "(LGZ/g;)V", "", "showAuthScreen", "()V", "LGZ/g;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpCouponListV2RouterImpl implements PdpCouponListV2Router {

    @NotNull
    private final g screenRouter;

    public PdpCouponListV2RouterImpl(@NotNull g screenRouter) {
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.screenRouter = screenRouter;
    }

    @Override // ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.router.PdpCouponListV2Router
    public void showAuthScreen() {
        String uri = LinkGenerator.INSTANCE.login().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        g.a.a(this.screenRouter, uri, null, null, 6);
    }
}
