package ru.ozon.app.android.initializers.limb;

import Ci0.g;
import Kd0.e;
import YY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelper;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/limb/LimbActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "LYY/a;", "cdnChooserSdk", "Lru/ozon/app/android/debugmenu/ozondebugmenu/OzonDebugMenuHelper;", "ozonDebugMenuHelper", "<init>", "(LYY/a;Lru/ozon/app/android/debugmenu/ozondebugmenu/OzonDebugMenuHelper;)V", "", "init", "()V", "LYY/a;", "Lru/ozon/app/android/debugmenu/ozondebugmenu/OzonDebugMenuHelper;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LimbActionInitializer implements ActionInitializer {

    @NotNull
    private final a cdnChooserSdk;

    @NotNull
    private final OzonDebugMenuHelper ozonDebugMenuHelper;

    public LimbActionInitializer(@NotNull a cdnChooserSdk, @NotNull OzonDebugMenuHelper ozonDebugMenuHelper) {
        Intrinsics.checkNotNullParameter(cdnChooserSdk, "cdnChooserSdk");
        Intrinsics.checkNotNullParameter(ozonDebugMenuHelper, "ozonDebugMenuHelper");
        this.cdnChooserSdk = cdnChooserSdk;
        this.ozonDebugMenuHelper = ozonDebugMenuHelper;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$2] */
    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        int i11 = Kd0.a.f15938b;
        Kd0.a.a(new LimbActionInitializer$init$1(), new e() { // from class: ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$2
            private final Object ozonDebugMenu;
            private final Object ozonTrackerDebugMenu;

            {
                OzonDebugMenuHelper ozonDebugMenuHelper;
                ozonDebugMenuHelper = LimbActionInitializer.this.ozonDebugMenuHelper;
                this.ozonDebugMenu = ozonDebugMenuHelper.getOPLibraryApi();
                g.f5125a.getClass();
                this.ozonTrackerDebugMenu = g.c();
            }

            @Override // Kd0.e
            public Object getOzonDebugMenu() {
                return this.ozonDebugMenu;
            }

            @Override // Kd0.e
            public Object getOzonTrackerDebugMenu() {
                return this.ozonTrackerDebugMenu;
            }

            @Override // Kd0.e
            public Object getPikazon() {
                return Pikazon.INSTANCE.getInstance().getPikazonLimbLibrary();
            }

            @Override // Kd0.e
            public a getCdnChooser() {
                a aVar;
                aVar = LimbActionInitializer.this.cdnChooserSdk;
                return aVar;
            }
        });
    }
}
