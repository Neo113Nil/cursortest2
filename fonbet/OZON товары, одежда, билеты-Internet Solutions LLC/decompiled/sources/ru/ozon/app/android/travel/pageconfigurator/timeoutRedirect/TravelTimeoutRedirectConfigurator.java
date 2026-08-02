package ru.ozon.app.android.travel.pageconfigurator.timeoutRedirect;

import GZ.g;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/timeoutRedirect/TravelTimeoutRedirectConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "(IILandroid/content/Intent;)V", "LGZ/g;", "Companion", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelTimeoutRedirectConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final g ozonRouter;

    public TravelTimeoutRedirectConfigurator(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1 && requestCode == 8941) {
            g gVar = this.ozonRouter;
            String uri = LinkGenerator.INSTANCE.clearToRootTab(data != null ? data.getStringExtra("ru.ozon.app.android.travel.common.configurators.TravelTimeoutRedirectConfigurator.EXTRA_DEEPLINK") : null).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            g.a.a(gVar, uri, null, null, 6);
        }
    }
}
