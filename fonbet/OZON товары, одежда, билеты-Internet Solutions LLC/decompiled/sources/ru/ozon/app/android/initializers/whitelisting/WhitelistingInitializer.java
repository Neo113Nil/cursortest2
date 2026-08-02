package ru.ozon.app.android.initializers.whitelisting;

import Ld0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8924g;
import pf0.h;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import wf0.b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/initializers/whitelisting/WhitelistingInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "LLd0/c;", "limbDiStore", "<init>", "(LLd0/c;)V", "", "init", "()V", "LLd0/c;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WhitelistingInitializer implements ActionInitializer {

    @NotNull
    private final c limbDiStore;

    public WhitelistingInitializer(@NotNull c limbDiStore) {
        Intrinsics.checkNotNullParameter(limbDiStore, "limbDiStore");
        this.limbDiStore = limbDiStore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [ru.ozon.app.android.initializers.whitelisting.WhitelistingInitializer$init$1] */
    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        InterfaceC8924g interfaceC8924g = (InterfaceC8924g) this.limbDiStore.e(h.class);
        interfaceC8924g.o(new b(this) { // from class: ru.ozon.app.android.initializers.whitelisting.WhitelistingInitializer$init$1
            private final c limbDiStore;

            {
                c cVar;
                cVar = this.limbDiStore;
                this.limbDiStore = cVar;
            }

            @Override // wf0.b
            public c getLimbDiStore() {
                return this.limbDiStore;
            }
        });
        interfaceC8924g.d();
    }
}
