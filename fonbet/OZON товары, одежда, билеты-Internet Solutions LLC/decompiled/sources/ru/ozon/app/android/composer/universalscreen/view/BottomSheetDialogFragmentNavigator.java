package ru.ozon.app.android.composer.universalscreen.view;

import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import com.google.android.material.bottomsheet.b;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import sZ.c;
import uZ.C9992d;
import uZ.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/BottomSheetDialogFragmentNavigator;", "LuZ/e;", "Lcom/google/android/material/bottomsheet/b;", "fragment", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "LuZ/d$b;", "navigationMode", "Landroid/os/Bundle;", "additionalArgs", "<init>", "(Lcom/google/android/material/bottomsheet/b;Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;LuZ/d$b;Landroid/os/Bundle;)V", "addBottomSheetConfigIfAbsent", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LuZ/d;", "destination", "LsZ/c;", "Landroidx/fragment/app/m;", "getDestinationOnSameNestedContext", "(LuZ/d;)LsZ/c;", "Lcom/google/android/material/bottomsheet/b;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LuZ/d$b;", "Landroid/os/Bundle;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BottomSheetDialogFragmentNavigator extends e {
    private final Bundle additionalArgs;

    @NotNull
    private final b fragment;

    @NotNull
    private final C9992d.b navigationMode;

    @NotNull
    private final ComposerScreenConfig screenConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomSheetDialogFragmentNavigator(@NotNull b fragment, @NotNull ComposerScreenConfig screenConfig, @NotNull C9992d.b navigationMode, Bundle bundle) {
        super(R.id.fragmentContainer, fragment, navigationMode, new c(r7, r5.newInstance(screenConfig, (r8 == null || (r8 = r8.getDisplayMode()) == null) ? ComposerFragment.DisplayMode.REGULAR : r8, bundle), null, false, false, null, false, false, false, 508, null));
        ComposerFragment.DisplayMode displayMode;
        String f7;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
        h.c pageRef = screenConfig.getPageRef();
        h.c.a aVar = pageRef instanceof h.c.a ? (h.c.a) pageRef : null;
        String str = (aVar == null || (f7 = aVar.f()) == null) ? "ComposerFragment" : f7;
        ComposerFragment.Companion companion = ComposerFragment.INSTANCE;
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = screenConfig.getBottomSheetConfig();
        this.fragment = fragment;
        this.screenConfig = screenConfig;
        this.navigationMode = navigationMode;
        this.additionalArgs = bundle;
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig2 = screenConfig.getBottomSheetConfig();
        setKeepInBackStackOnTabNavigation(bottomSheetConfig2 != null ? bottomSheetConfig2.getKeepInBackStackOnNavigation() : false);
    }

    private final ComposerScreenConfig addBottomSheetConfigIfAbsent(ComposerScreenConfig composerScreenConfig) {
        return composerScreenConfig.getBottomSheetConfig() != null ? composerScreenConfig : ComposerScreenConfig.copy$default(composerScreenConfig, null, null, false, new ComposerScreenConfig.BottomSheetConfig(null, false, false, null, 0, false, false, false, false, false, false, 2047, null), false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777207, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uZ.e
    @NotNull
    protected c<? extends ComponentCallbacksC5392m> getDestinationOnSameNestedContext(@NotNull C9992d destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        c<DialogInterfaceOnCancelListenerC5390k> fragmentDestination = destination.getFragmentDestination();
        if (!(destination instanceof ComposerScreenContainer)) {
            return super.getDestinationOnSameNestedContext(destination);
        }
        return new ComposerFragmentDestination(addBottomSheetConfigIfAbsent(((ComposerScreenContainer) destination).getScreenConfig()), fragmentDestination.getTag(), fragmentDestination.getRequestCode(), false, false, null, false, false, null, 504, null);
    }
}
