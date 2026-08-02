package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class zp3 {
    public static final aq3 a;

    static {
        aq3 agjVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            agjVar = (aq3) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(aq3.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            agjVar = new agj();
        } catch (Exception e2) {
            vp2.e("Storage override failed to initialize", e2);
            return;
        }
        a = agjVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            bq3.a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
