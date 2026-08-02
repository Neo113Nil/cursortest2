package ru.ozon.app.android.composer.navigations.destinations;

import OZ.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/navigations/destinations/ComposerTabRequiredFragmentDestination;", "LOZ/h;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerScreenContainer;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "", "deeplink", "", "requestCode", "", "addInBackStack", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "displayMode", "isRootScreen", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/lang/String;Ljava/lang/Integer;ZLru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;Z)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerTabRequiredFragmentDestination extends h implements ComposerScreenContainer {

    @NotNull
    private final ComposerScreenConfig screenConfig;

    public /* synthetic */ ComposerTabRequiredFragmentDestination(ComposerScreenConfig composerScreenConfig, String str, Integer num, boolean z11, ComposerFragment.DisplayMode displayMode, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerScreenConfig, str, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : displayMode, (i11 & 32) != 0 ? false : z12);
    }

    @Override // ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer
    @NotNull
    public ComposerScreenConfig getScreenConfig() {
        return this.screenConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerTabRequiredFragmentDestination(@NotNull ComposerScreenConfig screenConfig, @NotNull String deeplink, Integer num, boolean z11, ComposerFragment.DisplayMode displayMode, boolean z12) {
        super(new ComposerFragmentDestination(screenConfig, deeplink, num, z11, false, displayMode, z12, !z12, null, 272, null));
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.screenConfig = screenConfig;
    }
}
