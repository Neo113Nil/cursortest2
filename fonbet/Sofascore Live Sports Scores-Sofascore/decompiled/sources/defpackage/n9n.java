package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class n9n {
    public static z8n b() {
        ClassLoader classLoader = n9n.class.getClassLoader();
        if (z8n.class.equals(z8n.class)) {
            try {
                try {
                    return (z8n) z8n.class.cast(((n9n) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(n9n.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((z8n) z8n.class.cast(((n9n) it.next()).a()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(r8n.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(z8n.class.getSimpleName()), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (z8n) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (z8n) z8n.class.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            yhk.q(e3);
            return null;
        }
    }

    public abstract z8n a();
}
