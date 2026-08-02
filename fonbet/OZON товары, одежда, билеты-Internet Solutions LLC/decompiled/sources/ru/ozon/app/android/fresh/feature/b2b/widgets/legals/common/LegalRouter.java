package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "", "composerNavigator", "Lru/ozon/app/android/composer/ComposerNavigator;", "<init>", "(Lru/ozon/app/android/composer/ComposerNavigator;)V", "openHomeLink", "", "openFlowDeeplink", "", "deeplink", "completeFlow", "openHome", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalRouter {

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final String openHomeLink;

    public LegalRouter(@NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.composerNavigator = composerNavigator;
        String uri = LinkGenerator.INSTANCE.clearBackStack().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.openHomeLink = uri;
    }

    public final void completeFlow() {
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.composerNavigator, this.openHomeLink, null, 2, null);
    }

    public final void openFlowDeeplink(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.composerNavigator, deeplink, null, 2, null);
    }

    public final void openHome() {
        ComposerNavigator composerNavigator = this.composerNavigator;
        String uri = LinkGenerator.INSTANCE.home().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, uri, null, 2, null);
    }
}
