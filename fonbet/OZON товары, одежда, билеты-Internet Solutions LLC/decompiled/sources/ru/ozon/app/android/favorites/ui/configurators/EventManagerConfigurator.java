package ru.ozon.app.android.favorites.ui.configurators;

import GJ.a;
import GJ.b;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import sc.C9653a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0018j\b\u0012\u0004\u0012\u00020\u0006`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/EventManagerConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "<init>", "(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;)V", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;", "result", "", "onEventsReceived", "(Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEvent;)V", "", "events", "handleEvents", "(Ljava/util/List;)V", "onComposerInitialized", "()V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onResume", "onDestroy", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "Lnc/b;", "disposable", "Lnc/b;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EventManagerConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final ArrayList<FavoriteEvent> events;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    public EventManagerConfigurator(@NotNull FavoriteEventManager favoriteEventManager) {
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        this.favoriteEventManager = favoriteEventManager;
        this.events = new ArrayList<>();
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEventsReceived(FavoriteEvent result) {
        if (getOwner().getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            handleEvents(C7714v.a0(result));
        } else {
            this.events.add(result);
        }
    }

    public abstract void handleEvents(@NotNull List<? extends FavoriteEvent> events);

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        getContainer().j().getLifecycle().a(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.disposable = this.favoriteEventManager.events().observeOn(C8125a.a()).subscribe(new a(new EventManagerConfigurator$onCreate$1(this), 8), new b(EventManagerConfigurator$onCreate$2.INSTANCE, 5));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.disposable.dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        handleEvents(this.events);
        this.events.clear();
    }
}
