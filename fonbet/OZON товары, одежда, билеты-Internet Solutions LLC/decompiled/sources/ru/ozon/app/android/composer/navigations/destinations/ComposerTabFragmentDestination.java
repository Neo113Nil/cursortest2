package ru.ozon.app.android.composer.navigations.destinations;

import OZ.e;
import OZ.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/navigations/destinations/ComposerTabFragmentDestination;", "LOZ/h;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerScreenContainer;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "", "deeplink", "", "bottomMenuId", "requestCode", "", "addInBackStack", "isRootScreen", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "displayMode", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Ljava/lang/String;ILjava/lang/Integer;ZZLru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerTabFragmentDestination extends h implements ComposerScreenContainer {

    @NotNull
    private final ComposerScreenConfig screenConfig;

    public /* synthetic */ ComposerTabFragmentDestination(ComposerScreenConfig composerScreenConfig, String str, int i11, Integer num, boolean z11, boolean z12, ComposerFragment.DisplayMode displayMode, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerScreenConfig, str, i11, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? true : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? null : displayMode);
    }

    @Override // ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer
    @NotNull
    public ComposerScreenConfig getScreenConfig() {
        return this.screenConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerTabFragmentDestination(@NotNull ComposerScreenConfig screenConfig, @NotNull String deeplink, int i11, Integer num, boolean z11, boolean z12, ComposerFragment.DisplayMode displayMode) {
        super(new e(i11, new ComposerFragmentDestination(screenConfig, deeplink, num, z11, false, displayMode, z12, !z12, null, 272, null)));
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.screenConfig = screenConfig;
    }
}
