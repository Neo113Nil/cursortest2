package ru.ozon.app.android.returns.creation.pageconfigurators;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEvent;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u001cj\b\u0012\u0004\u0012\u00020\u0001`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/creation/pageconfigurators/BaseReturnCreationEventsManagerConfigurator;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent;", "T", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "returnCreationEventManager", "Lkotlin/reflect/d;", "type", "<init>", "(Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;Lkotlin/reflect/d;)V", "result", "", "onEventsReceived", "(Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent;)V", "", "events", "handleEvents", "(Ljava/util/List;)V", "handleEvent", "()V", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onResume", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "Lkotlin/reflect/d;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseReturnCreationEventsManagerConfigurator<T extends ReturnCreationEvent> extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final ArrayList<ReturnCreationEvent> events;

    @NotNull
    private final ReturnCreationEventManager returnCreationEventManager;

    @NotNull
    private final d<T> type;

    public BaseReturnCreationEventsManagerConfigurator(@NotNull ReturnCreationEventManager returnCreationEventManager, @NotNull d<T> type) {
        Intrinsics.checkNotNullParameter(returnCreationEventManager, "returnCreationEventManager");
        Intrinsics.checkNotNullParameter(type, "type");
        this.returnCreationEventManager = returnCreationEventManager;
        this.type = type;
        this.events = new ArrayList<>();
    }

    private final void handleEvents(List<? extends ReturnCreationEvent> events) {
        List<? extends ReturnCreationEvent> list = events;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (N.b(((ReturnCreationEvent) it.next()).getClass()).equals(this.type)) {
                handleEvent();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEventsReceived(ReturnCreationEvent result) {
        if (getOwner().getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            handleEvents(C7714v.a0(result));
        } else {
            this.events.add(result);
        }
    }

    public abstract void handleEvent();

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        getContainer().j().getLifecycle().a(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C10727i.c(K.a(owner), null, null, new BaseReturnCreationEventsManagerConfigurator$onCreate$1(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        handleEvents(this.events);
        this.events.clear();
    }
}
