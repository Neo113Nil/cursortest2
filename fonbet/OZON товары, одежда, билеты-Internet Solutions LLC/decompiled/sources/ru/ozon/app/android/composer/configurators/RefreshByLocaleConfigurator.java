package ru.ozon.app.android.composer.configurators;

import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.data.AppLocaleChangedEventBus;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/composer/configurators/RefreshByLocaleConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "appLocaleChangedEventBus", "Lru/ozon/app/android/account/locale/app/data/AppLocaleChangedEventBus;", "<init>", "(Lru/ozon/app/android/account/locale/app/data/AppLocaleChangedEventBus;)V", "onComposerInitialized", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByLocaleConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AppLocaleChangedEventBus appLocaleChangedEventBus;

    public RefreshByLocaleConfigurator(@NotNull AppLocaleChangedEventBus appLocaleChangedEventBus) {
        Intrinsics.checkNotNullParameter(appLocaleChangedEventBus, "appLocaleChangedEventBus");
        this.appLocaleChangedEventBus = appLocaleChangedEventBus;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C10727i.c(K.a(getOwner()), C10720e0.a(), null, new RefreshByLocaleConfigurator$onComposerInitialized$1(this, null), 2);
    }
}
