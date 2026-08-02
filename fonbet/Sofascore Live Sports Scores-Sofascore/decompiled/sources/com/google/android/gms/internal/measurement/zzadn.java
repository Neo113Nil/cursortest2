package com.google.android.gms.internal.measurement;

import defpackage.yhk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzadn {
    public static zzadf b() {
        ClassLoader classLoader = zzadn.class.getClassLoader();
        if (zzadf.class.equals(zzadf.class)) {
            try {
                try {
                    return (zzadf) zzadf.class.cast(((zzadn) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).a());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzadn.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzadf) zzadf.class.cast(((zzadn) it.next()).a()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(zzada.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzadf"), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (zzadf) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzadf) zzadf.class.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            yhk.q(e3);
            return null;
        }
    }

    public abstract zzadf a();
}
