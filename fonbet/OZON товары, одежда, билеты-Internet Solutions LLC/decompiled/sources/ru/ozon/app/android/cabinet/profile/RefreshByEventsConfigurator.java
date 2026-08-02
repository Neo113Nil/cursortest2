package ru.ozon.app.android.cabinet.profile;

import Ae.C2399j;
import Ae.C2408n0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.eventBus.EventBus;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cabinet/profile/RefreshByEventsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "eventBus", "Lru/ozon/app/android/account/eventBus/EventBus;", "<init>", "(Lru/ozon/app/android/account/eventBus/EventBus;)V", "onComposerInitialized", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RefreshByEventsConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final EventBus eventBus;

    public RefreshByEventsConfigurator(@NotNull EventBus eventBus) {
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        this.eventBus = eventBus;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C2399j.C(new C2408n0(C5427n.a(this.eventBus.getFlow(), getOwner().getLifecycle(), AbstractC5434v.b.CREATED), new RefreshByEventsConfigurator$onComposerInitialized$1(this, null)), K.a(getOwner()));
    }
}
