package ru.ozon.app.android.initializers.inappupdate;

import Ld0.c;
import ei0.InterfaceC6369b;
import ej.InterfaceC6372a;
import ej.InterfaceC6376e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/inappupdate/OzonInAppUpdateInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "LLd0/c;", "diStore", "Lei0/b;", "ozonTracker", "<init>", "(LLd0/c;Lei0/b;)V", "", "init", "()V", "LLd0/c;", "Lei0/b;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonInAppUpdateInitializer implements ActionInitializer {

    @NotNull
    private final c diStore;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    public OzonInAppUpdateInitializer(@NotNull c diStore, @NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.diStore = diStore;
        this.ozonTracker = ozonTracker;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        ((InterfaceC6372a) this.diStore.e(InterfaceC6376e.class)).e(new OzonInAppUpdateInitializer$init$1$1(this));
    }
}
