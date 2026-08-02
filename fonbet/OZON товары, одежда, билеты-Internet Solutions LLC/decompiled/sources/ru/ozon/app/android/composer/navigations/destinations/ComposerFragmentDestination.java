package ru.ozon.app.android.composer.navigations.destinations;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import sZ.c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Ba\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/composer/navigations/destinations/ComposerFragmentDestination;", "LsZ/c;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerScreenContainer;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "", "deeplink", "", "requestCode", "", "addInBackStack", "addFragmentToBackStack", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "displayMode", "isAnchor", "isAnchorRefreshRequired", "LsZ/c$b;", "transitionAnimations", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/lang/String;Ljava/lang/Integer;ZZLru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;ZZLsZ/c$b;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerFragmentDestination extends c<ComposerFragment> implements ComposerScreenContainer {

    @NotNull
    private final ComposerScreenConfig screenConfig;

    public /* synthetic */ ComposerFragmentDestination(ComposerScreenConfig composerScreenConfig, String str, Integer num, boolean z11, boolean z12, ComposerFragment.DisplayMode displayMode, boolean z13, boolean z14, c.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerScreenConfig, str, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? true : z12, (i11 & 32) != 0 ? null : displayMode, (i11 & 64) != 0 ? false : z13, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z14, (i11 & 256) != 0 ? new c.b(0, 0, 0, 15, 0) : bVar);
    }

    @Override // ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer
    @NotNull
    public ComposerScreenConfig getScreenConfig() {
        return this.screenConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerFragmentDestination(@NotNull ComposerScreenConfig screenConfig, @NotNull String deeplink, Integer num, boolean z11, boolean z12, ComposerFragment.DisplayMode displayMode, boolean z13, boolean z14, @NotNull c.b transitionAnimations) {
        super(deeplink, ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, screenConfig, displayMode, null, 4, null), num, z11, z12, transitionAnimations, false, z13, z14, 64, null);
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(transitionAnimations, "transitionAnimations");
        this.screenConfig = screenConfig;
    }
}
