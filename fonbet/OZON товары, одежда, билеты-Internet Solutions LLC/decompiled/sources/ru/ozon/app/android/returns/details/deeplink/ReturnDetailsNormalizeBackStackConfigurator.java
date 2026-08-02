package ru.ozon.app.android.returns.details.deeplink;

import Dc0.n;
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
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/details/deeplink/ReturnDetailsNormalizeBackStackConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "", "openReturns", "()V", "onComposerInitialized", "LGZ/g;", "", "returnsDeeplink", "Ljava/lang/String;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnDetailsNormalizeBackStackConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final String returnsDeeplink;

    public ReturnDetailsNormalizeBackStackConfigurator(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
        String uri = LinkGenerator.INSTANCE.clearToRootTab("ozon://my/returns").toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.returnsDeeplink = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openReturns() {
        ComposerExtKt.closeFlow(getContainer());
        g.a.a(this.ozonRouter, this.returnsDeeplink, null, null, 6);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        View findViewById;
        r i11 = getContainer().i();
        ViewGroup rootView = ContextExtKt.getRootView(i11);
        if (rootView != null && (findViewById = rootView.findViewById(R.id.navigationBtn)) != null) {
            findViewById.setOnClickListener(new n(this, 14));
        }
        L.a(i11.getOnBackPressedDispatcher(), getOwner(), new ReturnDetailsNormalizeBackStackConfigurator$onComposerInitialized$2(this), 2);
    }
}
