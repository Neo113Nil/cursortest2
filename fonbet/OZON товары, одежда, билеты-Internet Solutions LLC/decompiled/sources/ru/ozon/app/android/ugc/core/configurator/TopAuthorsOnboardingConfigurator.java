package ru.ozon.app.android.ugc.core.configurator;

import android.graphics.Color;
import androidx.activity.C;
import androidx.core.os.d;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\n\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/configurator/TopAuthorsOnboardingConfigurator;", "Lru/ozon/app/android/ugc/core/configurator/TopAuthorsLandingConfigurator;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "ru/ozon/app/android/ugc/core/configurator/TopAuthorsOnboardingConfigurator$backPressedCallback$1", "backPressedCallback", "Lru/ozon/app/android/ugc/core/configurator/TopAuthorsOnboardingConfigurator$backPressedCallback$1;", "", "getStatusBarColor", "()I", "statusBarColor", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopAuthorsOnboardingConfigurator extends TopAuthorsLandingConfigurator {

    @NotNull
    private final TopAuthorsOnboardingConfigurator$backPressedCallback$1 backPressedCallback = new C() { // from class: ru.ozon.app.android.ugc.core.configurator.TopAuthorsOnboardingConfigurator$backPressedCallback$1
        {
            super(true);
        }

        @Override // androidx.activity.C
        public void handleOnBackPressed() {
            ComposerNavigator navigator;
            G supportFragmentManager;
            r a11 = TopAuthorsOnboardingConfigurator.this.getContainer().a();
            if (a11 != null && (supportFragmentManager = a11.getSupportFragmentManager()) != null) {
                supportFragmentManager.m1(d.a(), "open_gallery_key");
            }
            ConfiguratorReferences references = TopAuthorsOnboardingConfigurator.this.getReferences();
            if (references == null || (navigator = references.getNavigator()) == null) {
                return;
            }
            navigator.popBackStack();
        }
    };

    @Override // ru.ozon.app.android.ugc.core.configurator.TopAuthorsLandingConfigurator
    public int getStatusBarColor() {
        return Color.parseColor("#4B2CC3");
    }

    @Override // ru.ozon.app.android.ugc.core.configurator.TopAuthorsLandingConfigurator, androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        r a11 = getContainer().a();
        if (a11 != null) {
            a11.getOnBackPressedDispatcher().h(owner, this.backPressedCallback);
        }
    }

    @Override // ru.ozon.app.android.ugc.core.configurator.TopAuthorsLandingConfigurator, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        remove();
    }
}
